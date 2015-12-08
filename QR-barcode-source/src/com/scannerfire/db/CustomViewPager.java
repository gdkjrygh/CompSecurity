// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.scannerfire.db;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class CustomViewPager extends ViewPager
{

    private boolean enabled;

    public CustomViewPager(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        enabled = true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        if (enabled)
        {
            return super.onInterceptTouchEvent(motionevent);
        } else
        {
            return false;
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (enabled)
        {
            return super.onTouchEvent(motionevent);
        } else
        {
            return false;
        }
    }

    public void setPagingEnabled(boolean flag)
    {
        enabled = flag;
    }
}
