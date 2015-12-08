// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.media.JPlayer;


// Referenced classes of package com.netflix.mediaclient.media.JPlayer:
//            MediaDecoderBase

public class mRunning
{

    private static final long UPDATE_PAHSE1_INTERVAL_MS = 20L;
    private static final long UPDATE_PAHSE1_SAMPLE_COUNT = 48000L;
    private static final long UPDATE_PAHSE2_INTERVAL_MS = 200L;
    private static final long UPDATE_PAHSE2_SAMPLE_COUNT = 0x3a980L;
    private static final long UPDATE_PAHSE3_INTERVAL_MS = 2000L;
    private long mLastPts;
    private long mLastUpdateTime;
    private boolean mRunning;
    final MediaDecoderBase this$0;

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

    public boolean shouldUpdate(long l)
    {
        long l1 = System.currentTimeMillis() - mLastUpdateTime;
        if (l > 48000L) goto _L2; else goto _L1
_L1:
        if (l1 < 20L) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (l > 0x3a980L)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (l1 >= 200L) goto _L3; else goto _L5
_L5:
        return false;
        if (l1 >= 2000L) goto _L3; else goto _L6
_L6:
        return false;
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
        this$0 = MediaDecoderBase.this;
        super();
        mLastPts = -1L;
        mLastUpdateTime = -1L;
        mRunning = false;
    }

    mRunning(long l)
    {
        this$0 = MediaDecoderBase.this;
        super();
        mLastPts = l;
        mLastUpdateTime = -1L;
        mRunning = false;
    }
}
