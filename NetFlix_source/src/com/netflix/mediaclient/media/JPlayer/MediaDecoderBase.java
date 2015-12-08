// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.media.JPlayer;

import java.nio.ByteBuffer;

public abstract class MediaDecoderBase
{
    public class Clock
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

        Clock()
        {
            this$0 = MediaDecoderBase.this;
            super();
            mLastPts = -1L;
            mLastUpdateTime = -1L;
            mRunning = false;
        }

        Clock(long l)
        {
            this$0 = MediaDecoderBase.this;
            super();
            mLastPts = l;
            mLastUpdateTime = -1L;
            mRunning = false;
        }
    }

    public static interface EventListener
    {

        public abstract void onDecoderReady(boolean flag);

        public abstract void onDecoderStarted(boolean flag);

        public abstract void onEndOfStream(boolean flag);

        public abstract void onFlushed(boolean flag);

        public abstract void onPasued(boolean flag);

        public abstract void onSampleRendered(boolean flag, long l, long l1);
    }

    public static interface InputDataSource
    {

        public abstract BufferMeta onRequestData(ByteBuffer bytebuffer);
    }

    public static class InputDataSource.BufferMeta
    {

        long debug;
        int flags;
        byte iv[];
        byte key[];
        int nByteEncrypted[];
        int nByteInClear[];
        int nSubsample;
        int offset;
        int size;
        long timestamp;

        public InputDataSource.BufferMeta()
        {
        }
    }


    static final int BUFFER_FLAG_CSD = 2;
    static final int BUFFER_FLAG_EOS = 4;
    static final int BUFFER_FLAG_SYNC = 1;
    static final int STATE_INIT = -1;
    static final int STATE_PAUSED = 2;
    static final int STATE_PLAYING = 1;
    static final int STATE_STOPPED = 0;
    protected Clock mClock;
    protected EventListener mEventListener;
    protected Clock mRefClock;
    protected volatile int mState;

    public MediaDecoderBase()
    {
    }

    public abstract void flush();

    public Clock getClock()
    {
        if (mClock == null)
        {
            mClock = new Clock();
        }
        return mClock;
    }

    public boolean isDecoderCreated()
    {
        return mState == -1;
    }

    public boolean isPauseded()
    {
        return mState == 2;
    }

    public boolean isStopped()
    {
        return mState == 0;
    }

    public abstract void pause();

    public void removeEventListener()
    {
        mEventListener = null;
    }

    public abstract void restart();

    public void setEventListener(EventListener eventlistener)
    {
        mEventListener = eventlistener;
    }

    public void setReferenceClock(Clock clock)
    {
        mRefClock = clock;
    }

    public abstract void start();

    public abstract void stop();

    public abstract void unpause();
}
