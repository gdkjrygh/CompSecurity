// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.appbox.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;

public class FooterLoadingView extends FrameLayout
{

    private View a;
    private View b;

    public FooterLoadingView(Context context)
    {
        this(context, null);
    }

    public FooterLoadingView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public FooterLoadingView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a(context);
    }

    private void a(Context context)
    {
        LayoutInflater.from(context).inflate(0x7f030053, this);
        a = findViewById(0x7f0b0120);
        b = findViewById(0x7f0b0121);
    }

    public void a()
    {
        a.setVisibility(8);
        b.setVisibility(8);
    }

    public void b()
    {
        a.setVisibility(0);
        b.setVisibility(8);
    }

    public void c()
    {
        a.setVisibility(8);
        b.setVisibility(0);
    }

    public void setFooterClickListener(android.view.View.OnClickListener onclicklistener)
    {
        b.setOnClickListener(onclicklistener);
    }
}
