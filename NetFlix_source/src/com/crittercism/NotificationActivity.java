// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crittercism;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.crittercism.app.Crittercism;
import crittercism.android.l;

public class NotificationActivity extends Activity
    implements android.view.View.OnClickListener, android.view.View.OnTouchListener
{

    public NotificationActivity()
    {
    }

    public void onClick(View view)
    {
        finish();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getIntent().getExtras();
        if (bundle != null && bundle.containsKey("com.crittercism.notification"))
        {
            setTheme(0x103000b);
            requestWindowFeature(1);
            bundle = bundle.getString("com.crittercism.notification");
            l l1 = l.i();
            LinearLayout linearlayout = new LinearLayout(this);
            linearlayout.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1));
            linearlayout.setOrientation(0);
            int i = l1.n();
            linearlayout.setPadding(i, i, i, i);
            linearlayout.setId(13);
            linearlayout.setOnClickListener(this);
            linearlayout.setOnTouchListener(this);
            TextView textview = new TextView(this);
            android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -2);
            layoutparams.setMargins(0, 0, l1.n(), 0);
            textview.setLayoutParams(layoutparams);
            textview.setTextSize(16F);
            textview.setTextColor(-1);
            textview.setId(51);
            textview.setText((new StringBuilder()).append(Crittercism.getNotificationTitle()).append(": ").append(bundle).toString());
            linearlayout.addView(textview);
            setContentView(linearlayout);
        }
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        finish();
        return true;
    }
}
