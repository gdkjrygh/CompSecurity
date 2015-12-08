// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;


// Referenced classes of package android.support.v4.widget:
//            AutoScrollHelper

private static final class mDeltaY
{

    long mDeltaTime;
    int mDeltaX;
    int mDeltaY;
    int mEffectiveRampDown;
    int mRampDownDuration;
    int mRampUpDuration;
    long mStartTime;
    long mStopTime;
    float mStopValue;
    float mTargetVelocityX;
    float mTargetVelocityY;

    final float getValueAt(long l)
    {
        if (l < mStartTime)
        {
            return 0.0F;
        }
        if (mStopTime < 0L || l < mStopTime)
        {
            return 0.5F * AutoScrollHelper.access$900$483d241b((float)(l - mStartTime) / (float)mRampUpDuration);
        } else
        {
            long l1 = mStopTime;
            return (1.0F - mStopValue) + mStopValue * AutoScrollHelper.access$900$483d241b((float)(l - l1) / (float)mEffectiveRampDown);
        }
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
