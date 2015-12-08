// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.ui;

import android.content.Context;
import android.os.Handler;
import android.view.Choreographer;
import android.view.Display;
import android.view.WindowManager;
import org.chromium.base.TraceEvent;

public class VSyncMonitor
{
    public static interface Listener
    {

        public abstract void onVSync(VSyncMonitor vsyncmonitor, long l);
    }


    static final boolean $assertionsDisabled;
    private static final long NANOSECONDS_PER_MICROSECOND = 1000L;
    private static final long NANOSECONDS_PER_MILLISECOND = 0xf4240L;
    private static final long NANOSECONDS_PER_SECOND = 0x3b9aca00L;
    private final Choreographer mChoreographer;
    private long mGoodStartingPointNano;
    private final Handler mHandler;
    private boolean mHaveRequestInFlight;
    private boolean mInsideVSync;
    private long mLastPostedNano;
    private long mLastVSyncCpuTimeNano;
    private Listener mListener;
    private final long mRefreshPeriodNano;
    private final Runnable mSyntheticVSyncRunnable;
    private final android.view.Choreographer.FrameCallback mVSyncFrameCallback;
    private final Runnable mVSyncRunnableCallback;

    public VSyncMonitor(Context context, Listener listener)
    {
        this(context, listener, true);
    }

    public VSyncMonitor(Context context, Listener listener, boolean flag)
    {
        mInsideVSync = false;
        mHandler = new Handler();
        mListener = listener;
        float f1 = ((WindowManager)context.getSystemService("window")).getDefaultDisplay().getRefreshRate();
        float f = f1;
        if (f1 <= 0.0F)
        {
            f = 60F;
        }
        mRefreshPeriodNano = (long)(1E+09F / f);
        if (flag && android.os.Build.VERSION.SDK_INT >= 16)
        {
            mChoreographer = Choreographer.getInstance();
            mVSyncFrameCallback = new android.view.Choreographer.FrameCallback() {

                final VSyncMonitor this$0;

                public void doFrame(long l)
                {
                    TraceEvent.begin("VSync");
                    mGoodStartingPointNano = l;
                    onVSyncCallback(l, getCurrentNanoTime());
                    TraceEvent.end("VSync");
                }

            
            {
                this$0 = VSyncMonitor.this;
                super();
            }
            };
            mVSyncRunnableCallback = null;
        } else
        {
            mChoreographer = null;
            mVSyncFrameCallback = null;
            mVSyncRunnableCallback = new Runnable() {

                final VSyncMonitor this$0;

                public void run()
                {
                    TraceEvent.begin("VSyncTimer");
                    long l = getCurrentNanoTime();
                    onVSyncCallback(l, l);
                    TraceEvent.end("VSyncTimer");
                }

            
            {
                this$0 = VSyncMonitor.this;
                super();
            }
            };
            mLastPostedNano = 0L;
        }
        mSyntheticVSyncRunnable = new Runnable() {

            final VSyncMonitor this$0;

            public void run()
            {
                TraceEvent.begin("VSyncSynthetic");
                long l = getCurrentNanoTime();
                onVSyncCallback(estimateLastVSyncTime(l), l);
                TraceEvent.end("VSyncSynthetic");
            }

            
            {
                this$0 = VSyncMonitor.this;
                super();
            }
        };
        mGoodStartingPointNano = getCurrentNanoTime();
    }

    private long estimateLastVSyncTime(long l)
    {
        return mGoodStartingPointNano + ((l - mGoodStartingPointNano) / mRefreshPeriodNano) * mRefreshPeriodNano;
    }

    private long getCurrentNanoTime()
    {
        return System.nanoTime();
    }

    private boolean isVSyncSignalAvailable()
    {
        return mChoreographer != null;
    }

    private void onVSyncCallback(long l, long l1)
    {
        if (!$assertionsDisabled && !mHaveRequestInFlight)
        {
            throw new AssertionError();
        }
        mInsideVSync = true;
        mHaveRequestInFlight = false;
        mLastVSyncCpuTimeNano = l1;
        if (mListener != null)
        {
            mListener.onVSync(this, l / 1000L);
        }
        mInsideVSync = false;
        return;
        Exception exception;
        exception;
        mInsideVSync = false;
        throw exception;
    }

    private void postCallback()
    {
        if (!mHaveRequestInFlight)
        {
            mHaveRequestInFlight = true;
            if (!postSyntheticVSync())
            {
                if (isVSyncSignalAvailable())
                {
                    mChoreographer.postFrameCallback(mVSyncFrameCallback);
                    return;
                } else
                {
                    postRunnableCallback();
                    return;
                }
            }
        }
    }

    private void postRunnableCallback()
    {
        if (!$assertionsDisabled && isVSyncSignalAvailable())
        {
            throw new AssertionError();
        }
        long l2 = getCurrentNanoTime();
        long l = estimateLastVSyncTime(l2);
        long l1 = (mRefreshPeriodNano + l) - l2;
        if (!$assertionsDisabled && (l1 <= 0L || l1 > mRefreshPeriodNano))
        {
            throw new AssertionError();
        }
        l = l1;
        if (l2 + l1 <= mLastPostedNano + mRefreshPeriodNano / 2L)
        {
            l = l1 + mRefreshPeriodNano;
        }
        mLastPostedNano = l2 + l;
        if (l == 0L)
        {
            mHandler.post(mVSyncRunnableCallback);
            return;
        } else
        {
            mHandler.postDelayed(mVSyncRunnableCallback, l / 0xf4240L);
            return;
        }
    }

    private boolean postSyntheticVSync()
    {
        for (long l = getCurrentNanoTime(); l - mLastVSyncCpuTimeNano < mRefreshPeriodNano * 2L || l - estimateLastVSyncTime(l) > mRefreshPeriodNano / 2L;)
        {
            return false;
        }

        mHandler.post(mSyntheticVSyncRunnable);
        return true;
    }

    public long getVSyncPeriodInMicroseconds()
    {
        return mRefreshPeriodNano / 1000L;
    }

    public boolean isInsideVSync()
    {
        return mInsideVSync;
    }

    public void requestUpdate()
    {
        postCallback();
    }

    public void setVSyncPointForICS(long l)
    {
        mGoodStartingPointNano = l;
    }

    static 
    {
        boolean flag;
        if (!org/chromium/ui/VSyncMonitor.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }


/*
    static long access$002(VSyncMonitor vsyncmonitor, long l)
    {
        vsyncmonitor.mGoodStartingPointNano = l;
        return l;
    }

*/



}
