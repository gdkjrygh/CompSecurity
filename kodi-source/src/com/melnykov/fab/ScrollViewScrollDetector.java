// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.melnykov.fab;

import android.widget.ScrollView;

abstract class ScrollViewScrollDetector
    implements ObservableScrollView.OnScrollChangedListener
{

    private int mLastScrollY;
    private int mScrollThreshold;

    ScrollViewScrollDetector()
    {
    }

    public void onScrollChanged(ScrollView scrollview, int i, int j, int k, int l)
    {
        if (Math.abs(j - mLastScrollY) > mScrollThreshold)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            if (j > mLastScrollY)
            {
                onScrollUp();
            } else
            {
                onScrollDown();
            }
        }
        mLastScrollY = j;
    }

    abstract void onScrollDown();

    abstract void onScrollUp();

    public void setScrollThreshold(int i)
    {
        mScrollThreshold = i;
    }
}
