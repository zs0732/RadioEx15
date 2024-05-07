package com.example.radioex15;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Switch;


public class MainActivity extends AppCompatActivity {
    Button btn;
    RadioButton RBred, RBgreen , RBgrey , RBblue;
    Switch st;
    ConstraintLayout cl;




    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        st = findViewById(R.id.st);
        btn = findViewById(R.id.btn);
        RBred = findViewById(R.id.RBred);
        RBgreen = findViewById(R.id.RBgreen);
        RBgrey = findViewById(R.id.RBgrey);
        RBblue = findViewById(R.id.RBblue);
        cl = findViewById(R.id.cl);

    }



    public void lolBtn(View view) {
        if(st.isChecked())
        {
            if(RBred.isChecked())
                cl.setBackgroundColor(Color.RED);
            else if (RBgreen.isChecked())
                cl.setBackgroundColor(Color.GREEN);
            else if (RBgrey.isChecked())
                cl.setBackgroundColor(Color.GRAY);
            else if (RBblue.isChecked())
                cl.setBackgroundColor(Color.BLUE);
        }
    }

    public void RbColor(View view) {
        if(!st.isChecked()){
            if(RBred.isChecked())
                cl.setBackgroundColor(Color.RED);
            else if (RBgreen.isChecked())
                cl.setBackgroundColor(Color.GREEN);
            else if (RBgrey.isChecked())
                cl.setBackgroundColor(Color.GRAY);
            else if (RBblue.isChecked())
                cl.setBackgroundColor(Color.BLUE);

        }
    }
}
