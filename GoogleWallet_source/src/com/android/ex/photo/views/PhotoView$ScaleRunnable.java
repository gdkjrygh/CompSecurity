// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.ex.photo.views;


// Referenced classes of package com.android.ex.photo.views:
//            PhotoView

static final class mHeader
    implements Runnable
{

    private float mCenterX;
    private float mCenterY;
    private final PhotoView mHeader;
    private boolean mRunning;
    private float mStartScale;
    private long mStartTime;
    private boolean mStop;
    private float mTargetScale;
    private float mVelocity;
    private boolean mZoomingIn;

    public final void run()
    {
        if (!mStop) goto _L2; else goto _L1
_L1:
        return;
_L2:
        long l = System.currentTimeMillis();
        long l1 = mStartTime;
        float f = mStartScale + mVelocity * (float)(l - l1);
        PhotoView.access$200(mHeader, f, mCenterX, mCenterY);
        if (f != mTargetScale)
        {
            boolean flag1 = mZoomingIn;
            boolean flag;
            if (f > mTargetScale)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag1 != flag)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        PhotoView.access$200(mHeader, mTargetScale, mCenterX, mCenterY);
        stop();
        if (mStop) goto _L1; else goto _L3
_L3:
        mHeader.post(this);
        return;
    }

    public final boolean start(float f, float f1, float f2, float f3)
    {
        if (mRunning)
        {
            return false;
        }
        mCenterX = f2;
        mCenterY = f3;
        mTargetScale = f1;
        mStartTime = System.currentTimeMillis();
        mStartScale = f;
        boolean flag;
        if (mTargetScale > mStartScale)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mZoomingIn = flag;
        mVelocity = (mTargetScale - mStartScale) / 200F;
        mRunning = true;
        mStop = false;
        mHeader.post(this);
        return true;
    }

    public final void stop()
    {
        mRunning = false;
        mStop = true;
    }


    public (PhotoView photoview)
    {
        mHeader = photoview;
    }
}
