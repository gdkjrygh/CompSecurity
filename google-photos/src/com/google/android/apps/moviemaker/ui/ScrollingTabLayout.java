// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.moviemaker.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import bhx;
import dai;
import daj;
import dak;
import md;
import np;

public class ScrollingTabLayout extends HorizontalScrollView
{

    public np a;
    public int b;
    public int c;
    private dai d;
    private ViewPager e;

    public ScrollingTabLayout(Context context)
    {
        this(context, null);
    }

    public ScrollingTabLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ScrollingTabLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        setHorizontalScrollBarEnabled(false);
        setFillViewport(true);
        attributeset = context.getTheme().obtainStyledAttributes(attributeset, bhx.a, 0, 0);
        float f;
        float f1;
        int j;
        i = attributeset.getColor(bhx.d, 0);
        f = attributeset.getDimension(bhx.e, 0.0F);
        j = attributeset.getColor(bhx.b, 0);
        f1 = attributeset.getDimension(bhx.c, 0.0F);
        attributeset.recycle();
        d = new dai(context);
        d.a = i;
        d.b = f;
        d.c = j;
        d.d = f1;
        addView(d, -1, -2);
        return;
        context;
        attributeset.recycle();
        throw context;
    }

    public static dai a(ScrollingTabLayout scrollingtablayout)
    {
        return scrollingtablayout.d;
    }

    public static void a(ScrollingTabLayout scrollingtablayout, int i, int j)
    {
        scrollingtablayout.scrollTo(scrollingtablayout.d.getChildAt(i).getLeft() + j, 0);
    }

    public static ViewPager b(ScrollingTabLayout scrollingtablayout)
    {
        return scrollingtablayout.e;
    }

    public static np c(ScrollingTabLayout scrollingtablayout)
    {
        return scrollingtablayout.a;
    }

    public final void a(ViewPager viewpager)
    {
        d.removeAllViews();
        e = viewpager;
        if (e != null)
        {
            e.q = new dak(this);
            viewpager = e.b;
            daj daj1 = new daj(this);
            for (int i = 0; i < viewpager.b(); i++)
            {
                View view = LayoutInflater.from(getContext()).inflate(b, d, false);
                ((TextView)view.findViewById(c)).setText(viewpager.b(i));
                view.setOnClickListener(daj1);
                d.addView(view);
            }

        }
    }
}
