// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.util;

import android.os.Handler;

public class TimeoutUtil
    implements Runnable
{
    public static interface TimeoutCompleteListener
    {

        public abstract void onTimeoutComplete(TimeoutUtil timeoututil);
    }


    private Object data;
    private boolean inProgress;
    private boolean isCanceled;
    private TimeoutCompleteListener listener;
    private Handler mHandler;

    public TimeoutUtil(Object obj)
    {
        inProgress = false;
        isCanceled = false;
        data = obj;
    }

    private void CleanupTimer()
    {
        if (mHandler != null)
        {
            mHandler.removeCallbacks(this);
            mHandler = null;
        }
    }

    public final void Begin(long l)
    {
        isCanceled = false;
        if (l > 0L)
        {
            mHandler = new Handler();
            mHandler.removeCallbacks(this);
            mHandler.postDelayed(this, l);
        }
        inProgress = true;
    }

    public void Complete()
    {
        if (inProgress)
        {
            CleanupTimer();
            inProgress = false;
            isCanceled = true;
            if (listener != null)
            {
                listener.onTimeoutComplete(this);
            }
        }
    }

    public void addTimeoutCompleteListener(TimeoutCompleteListener timeoutcompletelistener)
    {
        listener = timeoutcompletelistener;
    }

    public void dispose()
    {
        CleanupTimer();
        listener = null;
    }

    public final Object getData()
    {
        return data;
    }

    public final boolean getIsCanceled()
    {
        return isCanceled;
    }

    public void run()
    {
        if (inProgress)
        {
            CleanupTimer();
            inProgress = false;
            if (listener != null)
            {
                listener.onTimeoutComplete(this);
            }
        }
    }
}
