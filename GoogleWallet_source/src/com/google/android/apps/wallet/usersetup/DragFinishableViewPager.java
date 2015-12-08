// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.usersetup;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.VelocityTrackerCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewConfigurationCompat;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.google.api.client.util.Throwables;
import java.util.concurrent.Callable;

public class DragFinishableViewPager extends ViewPager
{

    private int activePointerId;
    private float deltaX;
    private float deltaY;
    private Callable finishListener;
    private int flingDistance;
    private int flingVelocity;
    private boolean isBeingDragged;
    private float lastMotionX;
    private float lastMotionY;
    private int maximumVelocity;
    private android.support.v4.view.ViewPager.OnPageChangeListener pageChangeListener;
    private float touchSlop;
    private VelocityTracker velocityTracker;

    public DragFinishableViewPager(Context context)
    {
        super(context);
        activePointerId = -1;
        initialize();
    }

    public DragFinishableViewPager(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        activePointerId = -1;
        initialize();
    }

    private float getClientWidth()
    {
        return (float)(getMeasuredWidth() - getPaddingLeft() - getPaddingRight());
    }

    private float getLastScrollX()
    {
        return getClientWidth() * (float)(getAdapter().getCount() - 1);
    }

    private void initialize()
    {
        Object obj = getContext();
        float f = ((Context) (obj)).getResources().getDisplayMetrics().density;
        flingDistance = (int)(25F * f);
        flingVelocity = (int)(400F * f);
        obj = ViewConfiguration.get(((Context) (obj)));
        touchSlop = ViewConfigurationCompat.getScaledPagingTouchSlop(((ViewConfiguration) (obj)));
        maximumVelocity = ((ViewConfiguration) (obj)).getScaledMaximumFlingVelocity();
    }

    private boolean isOnLastPage()
    {
        return getCurrentItem() == getAdapter().getCount() - 1;
    }

    private void performDrag()
    {
        float f = getClientWidth();
        if (pageChangeListener != null)
        {
            pageChangeListener.onPageScrolled(getCurrentItem(), -Math.min(deltaX, 0.0F) / f, -Math.min((int)deltaX, 0));
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        return isBeingDragged || super.onInterceptTouchEvent(motionevent);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (!isOnLastPage() && !isBeingDragged)
        {
            return super.onTouchEvent(motionevent);
        }
        motionevent.getAction() & 0xff;
        JVM INSTR tableswitch 0 6: default 72
    //                   0 78
    //                   1 140
    //                   2 327
    //                   3 509
    //                   4 72
    //                   5 563
    //                   6 602;
           goto _L1 _L2 _L3 _L4 _L5 _L1 _L6 _L7
_L1:
        return super.onTouchEvent(motionevent);
_L2:
        lastMotionX = motionevent.getX();
        lastMotionY = motionevent.getY();
        deltaX = 0.0F;
        deltaY = 0.0F;
        activePointerId = MotionEventCompat.getPointerId(motionevent, 0);
        if (velocityTracker == null)
        {
            velocityTracker = VelocityTracker.obtain();
        } else
        {
            velocityTracker.clear();
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (isBeingDragged)
        {
            velocityTracker.computeCurrentVelocity(1000, maximumVelocity);
            int i = (int)VelocityTrackerCompat.getXVelocity(velocityTracker, activePointerId);
            velocityTracker.recycle();
            velocityTracker = null;
            float f = MotionEventCompat.getX(motionevent, MotionEventCompat.findPointerIndex(motionevent, activePointerId));
            deltaX = deltaX + (f - lastMotionX);
            activePointerId = -1;
            isBeingDragged = false;
            if (deltaX < (float)(-flingDistance) && i < -flingVelocity)
            {
                if (pageChangeListener != null)
                {
                    pageChangeListener.onPageScrolled(getCurrentItem(), 1.0F, (int)getClientWidth());
                }
                if (finishListener != null)
                {
                    try
                    {
                        finishListener.call();
                    }
                    // Misplaced declaration of an exception variable
                    catch (MotionEvent motionevent)
                    {
                        throw Throwables.propagate(motionevent);
                    }
                }
            } else
            if (pageChangeListener != null)
            {
                pageChangeListener.onPageScrolled(getCurrentItem(), 0.0F, 0);
            }
        }
        continue; /* Loop/switch isn't completed */
_L4:
        int j = MotionEventCompat.findPointerIndex(motionevent, activePointerId);
        float f1 = MotionEventCompat.getX(motionevent, j);
        deltaX = deltaX + (f1 - lastMotionX);
        lastMotionX = f1;
        if (!isBeingDragged)
        {
            float f2 = MotionEventCompat.getY(motionevent, j);
            deltaY = deltaY + (f2 - lastMotionY);
            if (deltaX < -touchSlop && Math.abs(deltaX) > Math.abs(deltaY))
            {
                isBeingDragged = true;
                lastMotionX = f1;
                lastMotionY = f2;
            }
        }
        if (isBeingDragged)
        {
            velocityTracker.addMovement(motionevent);
            if (deltaX > 0.0F || (float)getScrollX() < getLastScrollX())
            {
                super.onTouchEvent(motionevent);
                deltaX = getLastScrollX() - (float)getScrollX();
            } else
            {
                performDrag();
                ViewCompat.postInvalidateOnAnimation(this);
            }
            return true;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (isBeingDragged)
        {
            velocityTracker.recycle();
            velocityTracker = null;
            activePointerId = -1;
            isBeingDragged = false;
            if (pageChangeListener != null)
            {
                pageChangeListener.onPageScrolled(getCurrentItem(), 0.0F, 0);
            }
        }
        continue; /* Loop/switch isn't completed */
_L6:
        int k = MotionEventCompat.getActionIndex(motionevent);
        lastMotionX = MotionEventCompat.getX(motionevent, k);
        lastMotionY = MotionEventCompat.getY(motionevent, k);
        activePointerId = MotionEventCompat.getPointerId(motionevent, k);
        continue; /* Loop/switch isn't completed */
_L7:
        int l = MotionEventCompat.getActionIndex(motionevent);
        if (MotionEventCompat.getPointerId(motionevent, l) == activePointerId)
        {
            if (l == 0)
            {
                l = 1;
            } else
            {
                l = 0;
            }
            activePointerId = MotionEventCompat.getPointerId(motionevent, l);
            if (velocityTracker != null)
            {
                velocityTracker.clear();
            }
        }
        l = MotionEventCompat.findPointerIndex(motionevent, activePointerId);
        lastMotionX = MotionEventCompat.getX(motionevent, l);
        lastMotionY = MotionEventCompat.getY(motionevent, l);
        if (true) goto _L1; else goto _L8
_L8:
    }

    public void setFinishListener(Callable callable)
    {
        finishListener = callable;
    }

    public void setOnPageChangeListener(android.support.v4.view.ViewPager.OnPageChangeListener onpagechangelistener)
    {
        super.setOnPageChangeListener(onpagechangelistener);
        pageChangeListener = onpagechangelistener;
    }
}
