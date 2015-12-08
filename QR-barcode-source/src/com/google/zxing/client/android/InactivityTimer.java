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
import com.google.zxing.client.android.common.executor.AsyncTaskExecInterface;
import com.google.zxing.client.android.common.executor.AsyncTaskExecManager;

public final class InactivityTimer
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

        InactivityAsyncTask(InactivityAsyncTask inactivityasynctask)
        {
            this();
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

        PowerStatusReceiver(PowerStatusReceiver powerstatusreceiver)
        {
            this();
        }
    }


    private static final long INACTIVITY_DELAY_MS = 0x493e0L;
    private static final String TAG = com/google/zxing/client/android/InactivityTimer.getSimpleName();
    private final Activity activity;
    private InactivityAsyncTask inactivityTask;
    private final BroadcastReceiver powerStatusReceiver = new PowerStatusReceiver(null);
    private final AsyncTaskExecInterface taskExec = (AsyncTaskExecInterface)(new AsyncTaskExecManager()).build();

    InactivityTimer(Activity activity1)
    {
        activity = activity1;
        onActivity();
    }

    private void cancel()
    {
        this;
        JVM INSTR monitorenter ;
        InactivityAsyncTask inactivityasynctask = inactivityTask;
        if (inactivityasynctask == null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        inactivityasynctask.cancel(true);
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
        inactivityTask = new InactivityAsyncTask(null);
        taskExec.execute(inactivityTask, new Object[0]);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void onPause()
    {
        cancel();
        activity.unregisterReceiver(powerStatusReceiver);
    }

    public void onResume()
    {
        activity.registerReceiver(powerStatusReceiver, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        onActivity();
    }

    void shutdown()
    {
        cancel();
    }




}
