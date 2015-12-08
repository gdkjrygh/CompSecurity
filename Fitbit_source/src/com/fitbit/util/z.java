// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.content.LocalBroadcastManager;
import com.fitbit.FitBitApplication;

public class z
{

    private static final long a = 2000L;

    public z()
    {
    }

    public static void a(BroadcastReceiver broadcastreceiver)
    {
        LocalBroadcastManager.getInstance(FitBitApplication.a()).unregisterReceiver(broadcastreceiver);
    }

    public static void a(BroadcastReceiver broadcastreceiver, IntentFilter intentfilter)
    {
        LocalBroadcastManager.getInstance(FitBitApplication.a()).registerReceiver(broadcastreceiver, intentfilter);
    }

    public static void a(Intent intent)
    {
        LocalBroadcastManager.getInstance(FitBitApplication.a()).sendBroadcast(intent);
    }

    public static void b(BroadcastReceiver broadcastreceiver)
    {
        FitBitApplication.a().unregisterReceiver(broadcastreceiver);
    }

    public static void b(BroadcastReceiver broadcastreceiver, IntentFilter intentfilter)
    {
        FitBitApplication.a().registerReceiver(broadcastreceiver, intentfilter);
    }

    public static void b(Intent intent)
    {
        d(intent);
    }

    public static void c(Intent intent)
    {
        FitBitApplication.a().sendBroadcast(intent);
    }

    private static void d(Intent intent)
    {
        Object obj;
        if (Looper.getMainLooper() == Looper.myLooper())
        {
            LocalBroadcastManager.getInstance(FitBitApplication.a()).sendBroadcastSync(intent);
            return;
        }
        obj = new Object();
        intent = new Runnable(intent, obj) {

            final Intent a;
            final Object b;

            public void run()
            {
                LocalBroadcastManager.getInstance(FitBitApplication.a()).sendBroadcastSync(a);
                synchronized (b)
                {
                    b.notifyAll();
                }
                return;
                exception;
                obj1;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                a = intent;
                b = obj;
                super();
            }
        };
        Handler handler = new Handler(Looper.getMainLooper());
        obj;
        JVM INSTR monitorenter ;
        handler.post(intent);
        obj.wait(2000L);
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        intent;
        obj;
        JVM INSTR monitorexit ;
        throw intent;
        intent;
        intent.printStackTrace();
          goto _L1
    }
}
