// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx;

import android.os.Handler;
import com.netflix.mediaclient.Log;

public class MdxSessionWatchDog
{
    public static interface SessionWatchDogInterface
    {

        public abstract long onGetTimeOfMostRecentIncomingMessage();

        public abstract void onSessionWatchDogExpired();
    }


    private static final long SESSION_EXPIRE_TIME_MS = 0x493e0L;
    private static final String TAG = "nf_mdxSessionWatchDog";
    private final SessionWatchDogInterface mCallback;
    private final Handler mHandler;
    private final Runnable mPeriodicRunnable = new Runnable() {

        final MdxSessionWatchDog this$0;

        public void run()
        {
            long l = mCallback.onGetTimeOfMostRecentIncomingMessage();
            if (System.currentTimeMillis() - Long.valueOf(l).longValue() > 0x493e0L)
            {
                Log.d("nf_mdxSessionWatchDog", "MdxSessionWatchDog:  expired");
                mCallback.onSessionWatchDogExpired();
                return;
            } else
            {
                Log.d("nf_mdxSessionWatchDog", "MdxSessionWatchDog: check if session still alive");
                mHandler.postDelayed(mPeriodicRunnable, 0x493e0L);
                return;
            }
        }

            
            {
                this$0 = MdxSessionWatchDog.this;
                super();
            }
    };

    MdxSessionWatchDog(SessionWatchDogInterface sessionwatchdoginterface, Handler handler)
    {
        mCallback = sessionwatchdoginterface;
        mHandler = handler;
    }

    void start()
    {
        Log.d("nf_mdxSessionWatchDog", "MdxSessionWatchDog: start");
        mHandler.removeCallbacks(mPeriodicRunnable);
        mHandler.postDelayed(mPeriodicRunnable, 0x493e0L);
    }

    void stop()
    {
        Log.d("nf_mdxSessionWatchDog", "MdxSessionWatchDog: stop");
        mHandler.removeCallbacks(mPeriodicRunnable);
    }



}
