// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.animation.AnimationUtils;

// Referenced classes of package android.support.v4.widget:
//            AutoScrollHelper

class mDeltaY
{

    private long mDeltaTime;
    private int mDeltaX;
    private int mDeltaY;
    private int mEffectiveRampDown;
    private int mRampDownDuration;
    private int mRampUpDuration;
    private long mStartTime;
    private long mStopTime;
    private float mStopValue;
    private float mTargetVelocityX;
    private float mTargetVelocityY;

    private float getValueAt(long l)
    {
        if (l < mStartTime)
        {
            return 0.0F;
        }
        if (mStopTime < 0L || l < mStopTime)
        {
            return AutoScrollHelper.access$900((float)(l - mStartTime) / (float)mRampUpDuration, 0.0F, 1.0F) * 0.5F;
        } else
        {
            long l1 = mStopTime;
            float f = mStopValue;
            float f1 = mStopValue;
            return AutoScrollHelper.access$900((float)(l - l1) / (float)mEffectiveRampDown, 0.0F, 1.0F) * f1 + (1.0F - f);
        }
    }

    private float interpolateValue(float f)
    {
        return -4F * f * f + 4F * f;
    }

    public void computeScrollDelta()
    {
        if (mDeltaTime == 0L)
        {
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        } else
        {
            long l = AnimationUtils.currentAnimationTimeMillis();
            float f = interpolateValue(getValueAt(l));
            long l1 = l - mDeltaTime;
            mDeltaTime = l;
            mDeltaX = (int)((float)l1 * f * mTargetVelocityX);
            mDeltaY = (int)((float)l1 * f * mTargetVelocityY);
            return;
        }
    }

    public int getDeltaX()
    {
        return mDeltaX;
    }

    public int getDeltaY()
    {
        return mDeltaY;
    }

    public int getHorizontalDirection()
    {
        return (int)(mTargetVelocityX / Math.abs(mTargetVelocityX));
    }

    public int getVerticalDirection()
    {
        return (int)(mTargetVelocityY / Math.abs(mTargetVelocityY));
    }

    public boolean isFinished()
    {
        return mStopTime > 0L && AnimationUtils.currentAnimationTimeMillis() > mStopTime + (long)mEffectiveRampDown;
    }

    public void requestStop()
    {
        long l = AnimationUtils.currentAnimationTimeMillis();
        mEffectiveRampDown = AutoScrollHelper.access$800((int)(l - mStartTime), 0, mRampDownDuration);
        mStopValue = getValueAt(l);
        mStopTime = l;
    }

    public void setRampDownDuration(int i)
    {
        mRampDownDuration = i;
    }

    public void setRampUpDuration(int i)
    {
        mRampUpDuration = i;
    }

    public void setTargetVelocity(float f, float f1)
    {
        mTargetVelocityX = f;
        mTargetVelocityY = f1;
    }

    public void start()
    {
        mStartTime = AnimationUtils.currentAnimationTimeMillis();
        mStopTime = -1L;
        mDeltaTime = mStartTime;
        mStopValue = 0.5F;
        mDeltaX = 0;
        mDeltaY = 0;
    }

    public ()
    {
        mStartTime = 0x8000000000000000L;
        mStopTime = -1L;
        mDeltaTime = 0L;
        mDeltaX = 0;
        mDeltaY = 0;
    }
}
