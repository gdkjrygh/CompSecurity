// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.util.Log;

final class InactivityTimer
{
    private final class InactivityAsyncTask extends AsyncTask
    {

        final InactivityTimer this$0;

        protected transient Object doInBackground(Object aobj[])
        {
            try
            {
                Thread.sleep(0x493e0L);
                Log.i(InactivityTimer.TAG, "Finishing activity due to inactivity");
                activity.finish();
            }
            // Misplaced declaration of an exception variable
            catch (Object aobj[]) { }
            return null;
        }

        private InactivityAsyncTask()
        {
            this$0 = InactivityTimer.this;
            super();
        }

    }

    private final class PowerStatusReceiver extends BroadcastReceiver
    {

        final InactivityTimer this$0;

        public void onReceive(Context context, Intent intent)
        {
label0:
            {
                if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction()))
                {
                    boolean flag;
                    if (intent.getIntExtra("plugged", -1) <= 0)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    if (!flag)
                    {
                        break label0;
                    }
                    onActivity();
                }
                return;
            }
            cancel();
        }

        private PowerStatusReceiver()
        {
            this$0 = InactivityTimer.this;
            super();
        }

    }


    private static final long INACTIVITY_DELAY_MS = 0x493e0L;
    private static final String TAG = com/google/zxing/client/android/InactivityTimer.getSimpleName();
    private final Activity activity;
    private AsyncTask inactivityTask;
    private final BroadcastReceiver powerStatusReceiver = new PowerStatusReceiver();
    private boolean registered;

    InactivityTimer(Activity activity1)
    {
        activity = activity1;
        registered = false;
        onActivity();
    }

    private void cancel()
    {
        this;
        JVM INSTR monitorenter ;
        AsyncTask asynctask = inactivityTask;
        if (asynctask == null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        asynctask.cancel(true);
        inactivityTask = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void onActivity()
    {
        this;
        JVM INSTR monitorenter ;
        cancel();
        inactivityTask = new InactivityAsyncTask();
        inactivityTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void onPause()
    {
        this;
        JVM INSTR monitorenter ;
        cancel();
        if (!registered) goto _L2; else goto _L1
_L1:
        activity.unregisterReceiver(powerStatusReceiver);
        registered = false;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Log.w(TAG, "PowerStatusReceiver was never registered?");
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void onResume()
    {
        this;
        JVM INSTR monitorenter ;
        if (!registered)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        Log.w(TAG, "PowerStatusReceiver was already registered?");
_L1:
        onActivity();
        this;
        JVM INSTR monitorexit ;
        return;
        activity.registerReceiver(powerStatusReceiver, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        registered = true;
          goto _L1
        Exception exception;
        exception;
        throw exception;
    }

    void shutdown()
    {
        cancel();
    }




}
