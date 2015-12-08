// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.services;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.IBinder;
import android.support.v4.content.LocalBroadcastManager;
import com.phunware.nbc.sochi.system.NBCSystem;
import java.util.Calendar;
import java.util.Date;

public class TempPassService extends Service
{
    private class MyCounter extends CountDownTimer
    {

        final TempPassService this$0;

        public void onFinish()
        {
            NBCSystem.debugLog("TempPassService", "CountDownTimer onFinish(");
            secondsLeft = 0L;
            NBCSystem.debugLog("Timer", (new StringBuilder()).append("").append(secondsLeft).toString());
            handler.post(sendStopUpdatesToUI);
            stopSelf();
        }

        public void onTick(long l)
        {
            secondsLeft = l / 1000L;
            handler.removeCallbacks(sendClockUpdatesToUI);
            handler.post(sendClockUpdatesToUI);
        }

        public MyCounter(long l, long l1)
        {
            this$0 = TempPassService.this;
            super(l, l1);
        }
    }


    public static final String BROADCAST_ACTION = "com.phunware.nbc.sochi.services.TempPassAction";
    private static transient boolean IS_STOPPED = false;
    private static final String TAG = "TempPassService";
    private LocalBroadcastManager broadcaster;
    private final Handler handler = new Handler();
    private Intent intent;
    private long secondsLeft;
    private final Runnable sendClockUpdatesToUI = new Runnable() {

        final TempPassService this$0;

        public void run()
        {
            DisplayLoggingInfo();
        }

            
            {
                this$0 = TempPassService.this;
                super();
            }
    };
    private final Runnable sendStopUpdatesToUI = new Runnable() {

        final TempPassService this$0;

        public void run()
        {
            DisplayLoggingInfo();
            intent.putExtra("expired", true);
            broadcaster.sendBroadcast(intent);
        }

            
            {
                this$0 = TempPassService.this;
                super();
            }
    };
    private MyCounter timer;

    public TempPassService()
    {
    }

    private void DisplayLoggingInfo()
    {
        intent.putExtra("counter", secondsLeft);
        broadcaster.sendBroadcast(intent);
    }

    public static boolean isRunning()
    {
        return IS_STOPPED;
    }

    public IBinder onBind(Intent intent1)
    {
        return null;
    }

    public void onCreate()
    {
        super.onCreate();
        broadcaster = LocalBroadcastManager.getInstance(getApplicationContext());
        intent = new Intent("com.phunware.nbc.sochi.services.TempPassAction");
    }

    public void onDestroy()
    {
        super.onDestroy();
        if (timer != null)
        {
            timer.cancel();
        }
        stopSelf();
        IS_STOPPED = true;
        NBCSystem.debugLog("TempPassService", "onDestroy TempPassService is now STOPPED");
    }

    public int onStartCommand(Intent intent1, int i, int j)
    {
        if (IS_STOPPED)
        {
            stopSelf();
            return 0;
        }
        super.onStartCommand(intent1, i, j);
        if (intent1 != null && intent1.getExtras() != null)
        {
            intent1 = new Date(intent1.getExtras().getLong("endDate"));
            Date date = new Date(Calendar.getInstance().getTimeInMillis());
            if (date.after(intent1))
            {
                intent1.setTime(date.getTime() + 5000L);
            }
            NBCSystem.debugLog("TempPassService", (new StringBuilder()).append("now : ").append(date.toString()).append(" end : ").append(intent1.toString()).toString());
            timer = new MyCounter(intent1.getTime() - date.getTime(), 1000L);
            (new Runnable() {

                final TempPassService this$0;

                public void run()
                {
                    timer.start();
                }

            
            {
                this$0 = TempPassService.this;
                super();
            }
            }).run();
        }
        return 2;
    }

    static 
    {
        IS_STOPPED = false;
    }







/*
    static long access$402(TempPassService temppassservice, long l)
    {
        temppassservice.secondsLeft = l;
        return l;
    }

*/



}
