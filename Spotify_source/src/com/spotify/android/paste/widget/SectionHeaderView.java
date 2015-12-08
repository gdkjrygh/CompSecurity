// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.android.paste.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import dfh;
import dgn;
import dhr;

public class SectionHeaderView extends LinearLayout
{

    private ViewGroup a;
    private TextView b;
    private dhr c;
    private View d;

    public SectionHeaderView(Context context)
    {
        this(context, null);
    }

    public SectionHeaderView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x7f0101ed);
    }

    public SectionHeaderView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset);
        dgn.a(com/spotify/android/paste/widget/SectionHeaderView, this);
        attributeset = context.obtainStyledAttributes(attributeset, dfh.aB, i, 0);
        i = attributeset.getDimensionPixelOffset(dfh.aC, 0);
        attributeset.recycle();
        setOrientation(1);
        inflate(context, 0x7f030107, this);
        a = (ViewGroup)findViewById(0x7f110477);
        a.getPaddingBottom();
        b = (TextView)findViewById(0x7f11026e);
        b.setPadding(0, i, 0, 0);
        d = findViewById(0x7f11046f);
        c = new dhr((ViewGroup)findViewById(0x7f1102f5));
    }

    public final void a()
    {
        a(false);
    }

    public final void a(View view)
    {
        c.a(view);
    }

    public final void a(String s)
    {
        b.setText(s);
        b.setContentDescription(s);
    }

    public final void a(String s, String s1)
    {
        b.setText(s);
        b.setContentDescription(s1);
    }

    public final void a(boolean flag)
    {
        if (!flag)
        {
            b(true);
            c.a(null);
        }
        a("");
    }

    public final void b()
    {
        a.setPadding(a.getPaddingLeft(), a.getPaddingTop(), a.getPaddingRight(), 0);
    }

    public final void b(boolean flag)
    {
        View view = d;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 4;
        }
        view.setVisibility(i);
    }

    public final TextView c()
    {
        return b;
    }
}
