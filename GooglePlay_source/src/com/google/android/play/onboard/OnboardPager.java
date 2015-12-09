// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.onboard;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.google.android.play.widget.UserAwareViewPager;

public class OnboardPager extends UserAwareViewPager
{

    protected boolean mAllowSwipeToNext;
    protected boolean mAllowSwipeToPrevious;
    protected float mLastX;

    public OnboardPager(Context context)
    {
        super(context);
        mAllowSwipeToNext = true;
        mAllowSwipeToPrevious = true;
    }

    public OnboardPager(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mAllowSwipeToNext = true;
        mAllowSwipeToPrevious = true;
    }

    private boolean allowScrolling(int i)
    {
        int k = super.mCurItem;
        int j;
        if (super.mAdapter == null)
        {
            j = 0;
        } else
        {
            j = super.mAdapter.getCount();
        }
        if (i < 0 && k > 0)
        {
            if (isRtl())
            {
                return mAllowSwipeToNext;
            } else
            {
                return mAllowSwipeToPrevious;
            }
        }
        if (i > 0 && k < j - 1)
        {
            if (isRtl())
            {
                return mAllowSwipeToPrevious;
            } else
            {
                return mAllowSwipeToNext;
            }
        } else
        {
            return true;
        }
    }

    private boolean shouldAllowTouchEvent(MotionEvent motionevent)
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        flag2 = false;
        if (motionevent.getPointerCount() > 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = flag2;
        motionevent.getActionMasked();
        JVM INSTR tableswitch 0 6: default 64
    //                   0 76
    //                   1 64
    //                   2 88
    //                   3 64
    //                   4 64
    //                   5 67
    //                   6 67;
           goto _L1 _L2 _L1 _L3 _L1 _L1 _L4 _L4
_L1:
        flag1 = true;
_L4:
        return flag1;
_L2:
        mLastX = motionevent.getX(0);
        continue; /* Loop/switch isn't completed */
_L3:
        flag1 = flag2;
        if (flag) goto _L4; else goto _L5
_L5:
        float f = motionevent.getX(0);
        float f1 = mLastX;
        mLastX = f;
        if (!allowScrolling((int)Math.signum(-(f - f1))))
        {
            return false;
        }
        if (true) goto _L1; else goto _L6
_L6:
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        while (motionevent.getPointerCount() > 1 || !shouldAllowTouchEvent(motionevent)) 
        {
            return false;
        }
        boolean flag;
        try
        {
            flag = super.onInterceptTouchEvent(motionevent);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            motionevent.setAction(3);
            return super.onInterceptTouchEvent(motionevent);
        }
        return flag;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (shouldAllowTouchEvent(motionevent))
        {
            boolean flag;
            try
            {
                flag = super.onTouchEvent(motionevent);
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                motionevent.setAction(3);
                return super.onTouchEvent(motionevent);
            }
            return flag;
        } else
        {
            return true;
        }
    }

    protected final boolean pageLeft()
    {
        if (allowScrolling(-1))
        {
            return super.pageLeft();
        } else
        {
            return false;
        }
    }

    protected final boolean pageRight()
    {
        if (allowScrolling(1))
        {
            return super.pageRight();
        } else
        {
            return false;
        }
    }

    public final void setAllowSwipeToNext(boolean flag)
    {
        mAllowSwipeToNext = flag;
    }

    public final void setAllowSwipeToPrevious(boolean flag)
    {
        mAllowSwipeToPrevious = flag;
    }
}
