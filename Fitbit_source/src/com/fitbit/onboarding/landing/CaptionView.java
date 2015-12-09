// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.onboarding.landing;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CaptionView extends LinearLayout
{

    private a.a a;
    private TextView b;
    private ImageView c;

    public CaptionView(Context context)
    {
        this(context, null);
    }

    public CaptionView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a();
    }

    public CaptionView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a();
    }

    private void a()
    {
        View.inflate(getContext(), 0x7f040127, this);
        b = (TextView)findViewById(0x7f1103ac);
        c = (ImageView)findViewById(0x7f1103ab);
    }

    public void a(a.a a1)
    {
        a = a1;
        b.setText(a.b);
        c.setImageResource(a.c);
    }
}
