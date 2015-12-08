// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.common;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;

public class BannerViewPager extends ViewPager
{

    private float a;
    private long b;
    private android.view.View.OnClickListener c;

    public BannerViewPager(Context context)
    {
        super(context);
    }

    public BannerViewPager(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        motionevent.getAction();
        JVM INSTR tableswitch 0 4: default 40
    //                   0 46
    //                   1 80
    //                   2 40
    //                   3 80
    //                   4 80;
           goto _L1 _L2 _L3 _L1 _L3 _L3
_L1:
        return super.onTouchEvent(motionevent);
_L2:
        a = motionevent.getX();
        b = System.currentTimeMillis();
        ViewParent viewparent = getParent();
        if (viewparent != null)
        {
            viewparent.requestDisallowInterceptTouchEvent(true);
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (System.currentTimeMillis() - b < 500L && Math.abs(a - motionevent.getX()) < 10F && c != null)
        {
            c.onClick(this);
        }
        if (true) goto _L1; else goto _L4
_L4:
    }
}
