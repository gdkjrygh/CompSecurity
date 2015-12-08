// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.google.analytics.tracking.android.GoogleAnalytics;
import com.google.analytics.tracking.android.Tracker;
import java.util.ArrayList;

// Referenced classes of package com.hmobile.biblekjv:
//            BaseActivity

public class PickColorActivity extends BaseActivity
    implements android.view.View.OnClickListener
{

    int colors[];
    int drawables[] = {
        0x7f02008d, 0x7f020091, 0x7f020090, 0x7f02008c, 0x7f02008b, 0x7f02008f, 0x7f02008e, 0x7f02008a
    };
    private GoogleAnalytics mGaInstance;
    private Tracker mGaTracker;
    TextView txt1;
    TextView txt2;
    TextView txt3;
    TextView txt4;
    TextView txt5;
    TextView txt6;
    TextView txt7;
    TextView txt8;
    private TextView txtNoBookmark;
    ArrayList views;

    public PickColorActivity()
    {
        int ai[] = new int[8];
        ai[1] = Color.parseColor("#F56545");
        ai[2] = Color.parseColor("#FFBB22");
        ai[3] = Color.parseColor("#EEEE22");
        ai[4] = Color.parseColor("#b5c5c5");
        ai[5] = Color.parseColor("#66CCDD");
        ai[6] = Color.parseColor("#77DDBB");
        ai[7] = Color.parseColor("#BBE535");
        colors = ai;
        views = new ArrayList();
    }

    public void onClick(View view)
    {
        int i = 0;
        do
        {
            if (i >= views.size())
            {
                return;
            }
            if (((TextView)views.get(i)).equals(view))
            {
                view = new Intent();
                view.putExtra("color", colors[i]);
                setResult(-1, view);
                finish();
                return;
            }
            i++;
        } while (true);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030027);
        getWindow().getAttributes().width = screenWidth;
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        mGaInstance = GoogleAnalytics.getInstance(this);
        txt1 = (TextView)findViewById(0x7f0e00b7);
        txt2 = (TextView)findViewById(0x7f0e00b8);
        txt3 = (TextView)findViewById(0x7f0e00b9);
        txt4 = (TextView)findViewById(0x7f0e00ba);
        txt5 = (TextView)findViewById(0x7f0e00bb);
        txt6 = (TextView)findViewById(0x7f0e00bc);
        txt7 = (TextView)findViewById(0x7f0e00bd);
        txt8 = (TextView)findViewById(0x7f0e00be);
        mGaTracker = mGaInstance.getTracker(getString(0x7f070092));
        mGaTracker.sendView("/PickColorActivity");
        txt1.setOnClickListener(this);
        txt2.setOnClickListener(this);
        txt3.setOnClickListener(this);
        txt4.setOnClickListener(this);
        txt5.setOnClickListener(this);
        txt6.setOnClickListener(this);
        txt7.setOnClickListener(this);
        txt8.setOnClickListener(this);
        views.add(txt1);
        views.add(txt2);
        views.add(txt3);
        views.add(txt4);
        views.add(txt5);
        views.add(txt6);
        views.add(txt7);
        views.add(txt8);
    }

    protected void onResume()
    {
        super.onResume();
    }
}
