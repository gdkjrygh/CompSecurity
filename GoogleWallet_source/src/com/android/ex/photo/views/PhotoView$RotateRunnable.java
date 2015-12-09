// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.ex.photo.views;


// Referenced classes of package com.android.ex.photo.views:
//            PhotoView

static final class mHeader
    implements Runnable
{

    private float mAppliedRotation;
    private final PhotoView mHeader;
    private long mLastRuntime;
    private boolean mRunning;
    private boolean mStop;
    private float mTargetRotation;
    private float mVelocity;

    public final void run()
    {
        if (!mStop) goto _L2; else goto _L1
_L1:
        return;
_L2:
label0:
        {
            if (mAppliedRotation == mTargetRotation)
            {
                continue; /* Loop/switch isn't completed */
            }
            long l1 = System.currentTimeMillis();
            float f;
            float f1;
            long l;
            if (mLastRuntime != -1L)
            {
                l = l1 - mLastRuntime;
            } else
            {
                l = 0L;
            }
            f1 = mVelocity * (float)l;
            if (mAppliedRotation >= mTargetRotation || mAppliedRotation + f1 <= mTargetRotation)
            {
                f = f1;
                if (mAppliedRotation <= mTargetRotation)
                {
                    break label0;
                }
                f = f1;
                if (mAppliedRotation + f1 >= mTargetRotation)
                {
                    break label0;
                }
            }
            f = mTargetRotation - mAppliedRotation;
        }
        PhotoView.access$500(mHeader, f, false);
        mAppliedRotation = mAppliedRotation + f;
        if (mAppliedRotation == mTargetRotation)
        {
            stop();
        }
        mLastRuntime = l1;
        if (mStop) goto _L1; else goto _L3
_L3:
        mHeader.post(this);
        return;
    }

    public final void start(float f)
    {
        if (mRunning)
        {
            return;
        } else
        {
            mTargetRotation = f;
            mVelocity = mTargetRotation / 500F;
            mAppliedRotation = 0.0F;
            mLastRuntime = -1L;
            mStop = false;
            mRunning = true;
            mHeader.post(this);
            return;
        }
    }

    public final void stop()
    {
        mRunning = false;
        mStop = true;
    }

    public _cls9(PhotoView photoview)
    {
        mHeader = photoview;
    }
}
