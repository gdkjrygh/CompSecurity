// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nineoldandroids.animation;


// Referenced classes of package com.nineoldandroids.animation:
//            ValueAnimator

public class TimeAnimator extends ValueAnimator
{
    public static interface TimeListener
    {

        public abstract void onTimeUpdate(TimeAnimator timeanimator, long l, long l1);
    }


    private TimeListener mListener;
    private long mPreviousTime;

    public TimeAnimator()
    {
        mPreviousTime = -1L;
    }

    void animateValue(float f)
    {
    }

    boolean animationFrame(long l)
    {
        long l1 = 0L;
        if (mPlayingState == 0)
        {
            mPlayingState = 1;
            long l2;
            if (mSeekTime < 0L)
            {
                mStartTime = l;
            } else
            {
                mStartTime = l - mSeekTime;
                mSeekTime = -1L;
            }
        }
        if (mListener != null)
        {
            l2 = mStartTime;
            if (mPreviousTime >= 0L)
            {
                l1 = l - mPreviousTime;
            }
            mPreviousTime = l;
            mListener.onTimeUpdate(this, l - l2, l1);
        }
        return false;
    }

    void initAnimation()
    {
    }

    public void setTimeListener(TimeListener timelistener)
    {
        mListener = timelistener;
    }
}
