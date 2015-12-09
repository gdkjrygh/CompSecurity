// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.pedometer.service;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.os.Looper;
import android.support.v4.content.LocalBroadcastManager;
import com.fitbit.FitBitApplication;
import com.fitbit.pedometer.e;

// Referenced classes of package com.fitbit.pedometer.service:
//            PedometerService_

public class com.fitbit.pedometer.service.a
{
    public static final class a
    {

        private static final String a = "SynchronousFlush";
        private static final long b = 60000L;
        private boolean c;
        private final Object d = new Object();
        private final LocalBroadcastManager e = LocalBroadcastManager.getInstance(FitBitApplication.a());
        private final BroadcastReceiver f = new _cls1();

        static BroadcastReceiver a(a a1)
        {
            return a1.f;
        }

        static LocalBroadcastManager b(a a1)
        {
            return a1.e;
        }

        static Object c(a a1)
        {
            return a1.d;
        }

        public boolean a(boolean flag)
        {
            boolean flag1 = false;
            this;
            JVM INSTR monitorenter ;
            if (com.fitbit.pedometer.e.h()) goto _L2; else goto _L1
_L1:
            com.fitbit.e.a.e("SynchronousFlush", "Pedometer not supported. Flush is redundant", new Object[0]);
            flag = flag1;
_L4:
            this;
            JVM INSTR monitorexit ;
            return flag;
_L2:
            if (!c)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            com.fitbit.e.a.e("SynchronousFlush", "Flush already performed. This is one-off object => skip request", new Object[0]);
            flag = flag1;
            continue; /* Loop/switch isn't completed */
            Exception exception;
            exception;
            throw exception;
            if (Looper.getMainLooper() != Looper.myLooper())
            {
                break MISSING_BLOCK_LABEL_84;
            }
            com.fitbit.e.a.e("SynchronousFlush", "Synchronous flush performed from main thread. Wrong situation => skip request", new Object[0]);
            flag = flag1;
            continue; /* Loop/switch isn't completed */
            c = true;
            e.registerReceiver(f, new IntentFilter("com.fitbit.pedometer.service.PedometerService.ACTION_FLUSH_FINISHED"));
            com.fitbit.e.a.a("SynchronousFlush", "Monitor pre-lock", new Object[0]);
            Object obj = d;
            obj;
            JVM INSTR monitorenter ;
            com.fitbit.e.a.a("SynchronousFlush", "Monitor acquired", new Object[0]);
            com.fitbit.pedometer.service.a.a(flag);
            d.wait(60000L);
            com.fitbit.e.a.a("SynchronousFlush", "Monitor released", new Object[0]);
            flag = true;
            continue; /* Loop/switch isn't completed */
            Object obj1;
            obj1;
            com.fitbit.e.a.e("SynchronousFlush", "Unable to wait until flush complete.", ((Throwable) (obj1)), new Object[0]);
            obj;
            JVM INSTR monitorexit ;
            flag = flag1;
            if (true) goto _L4; else goto _L3
_L3:
            obj1;
            obj;
            JVM INSTR monitorexit ;
            throw obj1;
        }

        public a()
        {
            c = false;
        /* block-local class not found */
        class _cls1 {}

        }
    }


    public com.fitbit.pedometer.service.a()
    {
    }

    public static void a()
    {
        android.content.Intent intent = PedometerService_.a(FitBitApplication.a()).a();
        PedometerService.PedometerServiceCommand.b.a(intent);
        FitBitApplication.a().startService(intent);
    }

    public static void a(boolean flag)
    {
        android.content.Intent intent = PedometerService_.a(FitBitApplication.a()).a();
        if (flag)
        {
            PedometerService.PedometerServiceCommand.d.a(intent);
        } else
        {
            PedometerService.PedometerServiceCommand.c.a(intent);
        }
        FitBitApplication.a().startService(intent);
    }

    public static void b()
    {
        android.content.Intent intent = PedometerService_.a(FitBitApplication.a()).a();
        PedometerService.PedometerServiceCommand.a.a(intent);
        FitBitApplication.a().startService(intent);
    }

    public static void c()
    {
        android.content.Intent intent = PedometerService_.a(FitBitApplication.a()).a();
        PedometerService.PedometerServiceCommand.f.a(intent);
        FitBitApplication.a().startService(intent);
    }

    public static void d()
    {
        android.content.Intent intent = PedometerService_.a(FitBitApplication.a()).a();
        com.fitbit.pedometer.service.PedometerService.PedometerServiceCommand.e.a(intent);
        FitBitApplication.a().startService(intent);
    }
}
