// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.media.JPlayer;


// Referenced classes of package com.netflix.mediaclient.media.JPlayer:
//            MediaDecoderPipe

public class mRunning
{

    private long mLastPts;
    private long mLastUpdateTime;
    private boolean mRunning;
    final MediaDecoderPipe this$0;

    public void flush()
    {
        mLastPts = -1L;
        mLastUpdateTime = -1L;
    }

    public long get()
    {
        if (mLastPts < 0L)
        {
            return -1L;
        }
        if (mRunning && mLastUpdateTime >= 0L)
        {
            long l = System.currentTimeMillis();
            long l1 = mLastUpdateTime;
            return mLastPts + (l - l1);
        } else
        {
            return mLastPts;
        }
    }

    public long pause()
    {
        long l = System.currentTimeMillis();
        long l1 = mLastUpdateTime;
        if (mLastPts >= 0L)
        {
            mLastPts = mLastPts + (l - l1);
        }
        mRunning = false;
        mLastUpdateTime = -1L;
        return mLastPts;
    }

    public long unpause()
    {
        mRunning = true;
        return mLastPts;
    }

    public void update(long l)
    {
        mLastPts = l;
        mLastUpdateTime = System.currentTimeMillis();
        unpause();
    }

    ()
    {
        this$0 = MediaDecoderPipe.this;
        super();
        mLastPts = -1L;
        mLastUpdateTime = -1L;
        mRunning = false;
    }

    mRunning(long l)
    {
        this$0 = MediaDecoderPipe.this;
        super();
        mLastPts = l;
        mLastUpdateTime = -1L;
        mRunning = false;
    }
}
