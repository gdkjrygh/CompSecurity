// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Text4View extends RelativeLayout
{

    private final TextView a;
    private final TextView b;
    private final TextView c;
    private final TextView d;

    public Text4View(Context context, AttributeSet attributeset)
    {
        View view;
        int i;
        int k;
        super(context, attributeset);
        inflate(context, 0x7f0401e2, this);
        a = (TextView)findViewById(0x7f1104c3);
        b = (TextView)findViewById(0x7f1104c4);
        c = (TextView)findViewById(0x7f1104c5);
        d = (TextView)findViewById(0x7f1104c6);
        view = findViewById(0x7f1100c4);
        context = context.obtainStyledAttributes(attributeset, com.fitbit.FitbitMobile.R.styleable.Text4View);
        k = context.getIndexCount();
        i = 0;
_L8:
        int j;
        if (i >= k)
        {
            break MISSING_BLOCK_LABEL_251;
        }
        j = context.getIndex(i);
        j;
        JVM INSTR tableswitch 0 4: default 144
    //                   0 152
    //                   1 174
    //                   2 190
    //                   3 206
    //                   4 222;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L6:
        break MISSING_BLOCK_LABEL_222;
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        throw new IllegalArgumentException();
_L2:
        a.setText(context.getText(j));
_L9:
        i++;
        if (true) goto _L8; else goto _L7
_L7:
        b.setText(context.getText(j));
          goto _L9
_L4:
        c.setText(context.getText(j));
          goto _L9
_L5:
        d.setText(context.getText(j));
          goto _L9
        if (context.getBoolean(j, false))
        {
            j = 0;
        } else
        {
            j = 8;
        }
        view.setVisibility(j);
          goto _L9
    }

    private transient void a(TextView textview, int i, Object aobj[])
    {
        textview.setText(getResources().getString(i, aobj));
    }

    public void a(int i)
    {
        a.setTextColor(i);
    }

    public transient void a(int i, Object aobj[])
    {
        a(a, i, aobj);
    }

    public void a(CharSequence charsequence)
    {
        a.setText(charsequence);
    }

    public void b(int i)
    {
        b.setTextColor(i);
    }

    public transient void b(int i, Object aobj[])
    {
        a(b, i, aobj);
    }

    public void b(CharSequence charsequence)
    {
        b.setText(charsequence);
    }

    public void c(int i)
    {
        c.setTextColor(i);
    }

    public transient void c(int i, Object aobj[])
    {
        a(c, i, aobj);
    }

    public void c(CharSequence charsequence)
    {
        c.setText(charsequence);
    }

    public void d(int i)
    {
        d.setTextColor(i);
    }

    public transient void d(int i, Object aobj[])
    {
        a(d, i, aobj);
    }

    public void d(CharSequence charsequence)
    {
        d.setText(charsequence);
    }
}
