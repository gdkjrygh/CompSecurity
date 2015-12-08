// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class ChartViewPager extends ViewPager
{

    private android.view.ViewTreeObserver.OnScrollChangedListener a;
    private boolean b;

    public ChartViewPager(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public void a(android.view.ViewTreeObserver.OnScrollChangedListener onscrollchangedlistener)
    {
        a = onscrollchangedlistener;
    }

    public void a(boolean flag)
    {
        b = flag;
    }

    public boolean a()
    {
        return b;
    }

    public android.view.ViewTreeObserver.OnScrollChangedListener b()
    {
        return a;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        if (a())
        {
            return super.onInterceptTouchEvent(motionevent);
        } else
        {
            return false;
        }
    }

    protected void onScrollChanged(int i, int j, int k, int l)
    {
        super.onScrollChanged(i, j, k, l);
        android.view.ViewTreeObserver.OnScrollChangedListener onscrollchangedlistener = b();
        if (onscrollchangedlistener != null)
        {
            onscrollchangedlistener.onScrollChanged();
        }
    }
}
