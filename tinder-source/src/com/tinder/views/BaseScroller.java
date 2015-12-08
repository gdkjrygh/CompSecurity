// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;

public class BaseScroller extends Scroller
{

    private int mDuration;

    public BaseScroller(Context context)
    {
        super(context);
        mDuration = 250;
    }

    public BaseScroller(Context context, Interpolator interpolator)
    {
        super(context, interpolator);
        mDuration = 250;
    }

    public BaseScroller(Context context, Interpolator interpolator, boolean flag)
    {
        super(context, interpolator, flag);
        mDuration = 250;
    }

    public void setDuration(int i)
    {
        mDuration = i;
    }

    public void startScroll(int i, int j, int k, int l)
    {
        super.startScroll(i, j, k, l, mDuration);
    }

    public void startScroll(int i, int j, int k, int l, int i1)
    {
        super.startScroll(i, j, k, l, mDuration);
    }
}
