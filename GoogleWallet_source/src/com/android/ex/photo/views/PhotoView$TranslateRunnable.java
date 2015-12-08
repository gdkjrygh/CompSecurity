// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.ex.photo.views;


// Referenced classes of package com.android.ex.photo.views:
//            PhotoView

static final class mHeader
    implements Runnable
{

    private float mDecelerationX;
    private float mDecelerationY;
    private final PhotoView mHeader;
    private long mLastRunTime;
    private boolean mRunning;
    private boolean mStop;
    private float mVelocityX;
    private float mVelocityY;

    public final void run()
    {
        float f = 1000F;
        if (!mStop) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i;
        long l = System.currentTimeMillis();
        float f1;
        float f2;
        if (mLastRunTime != -1L)
        {
            f1 = (float)(l - mLastRunTime) / 1000F;
        } else
        {
            f1 = 0.0F;
        }
        i = PhotoView.access$300(mHeader, mVelocityX * f1, mVelocityY * f1);
        mLastRunTime = l;
        f2 = mDecelerationX * f1;
        if (Math.abs(mVelocityX) > Math.abs(f2))
        {
            mVelocityX = mVelocityX - f2;
        } else
        {
            mVelocityX = 0.0F;
        }
        f1 = mDecelerationY * f1;
        if (Math.abs(mVelocityY) > Math.abs(f1))
        {
            mVelocityY = mVelocityY - f1;
        } else
        {
            mVelocityY = 0.0F;
        }
        if ((mVelocityX != 0.0F || mVelocityY != 0.0F) && i != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        stop();
        PhotoView.access$400(mHeader);
_L4:
        if (!mStop)
        {
            mHeader.post(this);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (i == 1)
        {
            if (mVelocityX <= 0.0F)
            {
                f = -1000F;
            }
            mDecelerationX = f;
            mDecelerationY = 0.0F;
            mVelocityY = 0.0F;
        } else
        if (i == 2)
        {
            mDecelerationX = 0.0F;
            if (mVelocityY <= 0.0F)
            {
                f = -1000F;
            }
            mDecelerationY = f;
            mVelocityX = 0.0F;
        }
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    public final boolean start(float f, float f1)
    {
        if (mRunning)
        {
            return false;
        } else
        {
            mLastRunTime = -1L;
            mVelocityX = f;
            mVelocityY = f1;
            f = (float)Math.atan2(mVelocityY, mVelocityX);
            mDecelerationX = (float)(Math.cos(f) * 1000D);
            mDecelerationY = (float)(Math.sin(f) * 1000D);
            mStop = false;
            mRunning = true;
            mHeader.post(this);
            return true;
        }
    }

    public final void stop()
    {
        mRunning = false;
        mStop = true;
    }


    public (PhotoView photoview)
    {
        mLastRunTime = -1L;
        mHeader = photoview;
    }
}
