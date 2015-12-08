// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.views;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;

public class AccuViewPager extends ViewPager
{

    public AccuViewPager(Context context)
    {
        super(context);
    }

    public AccuViewPager(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    protected boolean canScroll(View view, boolean flag, int i, int j, int k)
    {
        if (view != this && (view instanceof ViewPager))
        {
            return true;
        } else
        {
            return super.canScroll(view, flag, i, j, k);
        }
    }
}
