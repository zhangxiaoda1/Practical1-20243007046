package com.example.responsivelayout1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button changeBtn = findViewById(R.id.btn_change);
        Button cancelBtn = findViewById(R.id.btn_cancel);
        final TextView title = findViewById(R.id.tv_title);

        changeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (title.getText().toString().equals("Responsive Layout 1")) {
                    title.setText("Layout Swapped");
                } else {
                    title.setText("Responsive Layout 1");
                }
            }
        });

        cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
