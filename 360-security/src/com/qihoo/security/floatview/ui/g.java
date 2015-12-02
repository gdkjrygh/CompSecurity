// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.floatview.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class g extends LinearLayout
{

    View a;
    TextView b;

    public g(Context context)
    {
        super(context);
        a = null;
        LayoutInflater.from(context).inflate(0x7f030052, this);
        a = findViewById(0x7f0b0110);
        b = (TextView)findViewById(0x7f0b011e);
    }

    public View getBackView()
    {
        return a;
    }

    public void setTipText(String s)
    {
        if (b != null)
        {
            b.setText(s);
        }
    }
}
