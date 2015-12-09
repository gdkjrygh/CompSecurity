// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.ex.photo.views;


// Referenced classes of package com.android.ex.photo.views:
//            PhotoView

static final class mHeader
    implements Runnable
{

    private final PhotoView mHeader;
    private boolean mRunning;
    private long mStartRunTime;
    private boolean mStop;
    private float mTranslateX;
    private float mTranslateY;

    public final void run()
    {
        if (!mStop) goto _L2; else goto _L1
_L1:
        return;
_L2:
        float f;
        float f1;
        float f2;
        long l = System.currentTimeMillis();
        if (mStartRunTime != -1L)
        {
            f = l - mStartRunTime;
        } else
        {
            f = 0.0F;
        }
        if (mStartRunTime == -1L)
        {
            mStartRunTime = l;
        }
        if (f < 100F)
        {
            break; /* Loop/switch isn't completed */
        }
        f2 = mTranslateX;
        f1 = mTranslateY;
_L6:
        PhotoView.access$300(mHeader, f2, f1);
        mTranslateX = mTranslateX - f2;
        mTranslateY = mTranslateY - f1;
        if (mTranslateX == 0.0F && mTranslateY == 0.0F)
        {
            stop();
        }
        if (!mStop)
        {
            mHeader.post(this);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        float f3;
label0:
        {
            f1 = (mTranslateX / (100F - f)) * 10F;
            f3 = (mTranslateY / (100F - f)) * 10F;
            if (Math.abs(f1) <= Math.abs(mTranslateX))
            {
                f = f1;
                if (!Float.isNaN(f1))
                {
                    break label0;
                }
            }
            f = mTranslateX;
        }
        if (Math.abs(f3) > Math.abs(mTranslateY)) goto _L5; else goto _L4
_L4:
        f2 = f;
        f1 = f3;
        if (!Float.isNaN(f3)) goto _L6; else goto _L5
_L5:
        f1 = mTranslateY;
        f2 = f;
          goto _L6
    }

    public final boolean start(float f, float f1)
    {
        if (mRunning)
        {
            return false;
        } else
        {
            mStartRunTime = -1L;
            mTranslateX = f;
            mTranslateY = f1;
            mStop = false;
            mRunning = true;
            mHeader.postDelayed(this, 250L);
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
        mStartRunTime = -1L;
        mHeader = photoview;
    }
}
