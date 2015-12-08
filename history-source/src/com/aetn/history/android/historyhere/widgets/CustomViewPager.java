// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.widgets;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.aetn.history.android.historyhere.utils.Utils;

public class CustomViewPager extends ViewPager
{

    private final String TAG;
    private boolean allowSwiping;

    public CustomViewPager(Context context)
    {
        super(context);
        allowSwiping = true;
        TAG = "CustomViewPager";
    }

    public CustomViewPager(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        allowSwiping = true;
        TAG = "CustomViewPager";
    }

    public void allowSwiping(boolean flag)
    {
        allowSwiping = flag;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        Utils.logger("swiper", (new StringBuilder()).append("onInterceptTouchEvent:allowSwiping:").append(allowSwiping).toString());
        if (allowSwiping)
        {
            return super.onInterceptTouchEvent(motionevent);
        } else
        {
            return false;
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        Utils.logger("swiper", (new StringBuilder()).append("onTouchEvent:allowSwiping:").append(allowSwiping).toString());
        if (allowSwiping)
        {
            return super.onTouchEvent(motionevent);
        } else
        {
            return false;
        }
    }
}
