// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.android.paste.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;
import dfh;
import dgn;
import dgs;

public class SlidingTabLayout extends HorizontalScrollView
{

    private final dgs a;

    public SlidingTabLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x7f0101f1);
    }

    public SlidingTabLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        dgn.a(com/spotify/android/paste/widget/SlidingTabLayout, this);
        TypedArray typedarray = context.obtainStyledAttributes(attributeset, dfh.aD, i, 0);
        typedarray.getResourceId(dfh.aK, 0);
        typedarray.getDimensionPixelSize(dfh.aL, 24);
        typedarray.getDimensionPixelSize(dfh.aM, 16);
        typedarray.getDimensionPixelSize(dfh.aN, 24);
        typedarray.recycle();
        setHorizontalScrollBarEnabled(false);
        setFillViewport(true);
        a = new dgs(context, attributeset, i);
        addView(a, -1, -2);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
    }
}
