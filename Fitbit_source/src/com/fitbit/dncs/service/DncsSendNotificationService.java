// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.dncs.service;

import android.content.Intent;
import android.os.IBinder;
import com.fitbit.FitBitApplication;
import com.fitbit.bluetooth.g;
import com.fitbit.dncs.NotificationManager;
import com.fitbit.e.a;
import com.fitbit.galileo.bluetooth.GalileoTaskExecutor;
import com.fitbit.galileo.bluetooth.f;
import com.fitbit.galileo.bluetooth.i;
import com.fitbit.util.service.WakefulService;

public class DncsSendNotificationService extends WakefulService
{

    private static final String a = "DncsSendNotificationService";
    private static final String b = (new StringBuilder()).append(com/fitbit/dncs/service/DncsSendNotificationService.getCanonicalName()).append(".ACTION_UPDATE").toString();
    private final NotificationManager c = NotificationManager.a();
    private GalileoTaskExecutor d;

    public DncsSendNotificationService()
    {
        d = null;
    }

    static GalileoTaskExecutor a(DncsSendNotificationService dncssendnotificationservice)
    {
        return dncssendnotificationservice.d;
    }

    static GalileoTaskExecutor a(DncsSendNotificationService dncssendnotificationservice, GalileoTaskExecutor galileotaskexecutor)
    {
        dncssendnotificationservice.d = galileotaskexecutor;
        return galileotaskexecutor;
    }

    public static void b()
    {
        Intent intent = new Intent(FitBitApplication.a(), com/fitbit/dncs/service/DncsSendNotificationService);
        intent.setAction(b);
        FitBitApplication.a().startService(intent);
    }

    static void b(DncsSendNotificationService dncssendnotificationservice)
    {
        dncssendnotificationservice.d();
    }

    private void c()
    {
        if (d == null)
        {
            d();
        }
    }

    private void d()
    {
        com.fitbit.e.a.a("DncsSendNotificationService", "Stopping", new Object[0]);
        d = null;
        stopSelf();
    }

    private boolean e()
    {
        if (!g.f())
        {
            com.fitbit.e.a.a("DncsSendNotificationService", "canStartGalileoTask() = false. Bluetooth LE is not supported.", new Object[0]);
            return false;
        }
        if (g.h())
        {
            com.fitbit.e.a.a("DncsSendNotificationService", "canStartGalileoTask() = false. Bluetooth operations is not allowed", new Object[0]);
            return false;
        }
        if (!g.g())
        {
            com.fitbit.e.a.a("DncsSendNotificationService", "canStartGalileoTask() = false. Bluetooth is disabled.", new Object[0]);
            return false;
        } else
        {
            com.fitbit.e.a.a("DncsSendNotificationService", "canStartGalileoTask() = true", new Object[0]);
            return true;
        }
    }

    protected String a()
    {
        return "DncsSendNotificationService";
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        super.onCreate();
    }

    public void onDestroy()
    {
        super.onDestroy();
        if (d != null)
        {
            GalileoTaskExecutor galileotaskexecutor = d;
            d = null;
            galileotaskexecutor.a(false);
        }
    }

    public int onStartCommand(Intent intent, int j, int k)
    {
        com.fitbit.e.a.a("DncsSendNotificationService", "Updating...", new Object[0]);
        if (intent == null)
        {
            com.fitbit.e.a.a("DncsSendNotificationService", "Empty intent", new Object[0]);
            c();
            return 3;
        }
        if (d != null)
        {
            com.fitbit.e.a.a("DncsSendNotificationService", "Previous operation is in progress", new Object[0]);
            return 3;
        }
        if (!e())
        {
            com.fitbit.e.a.a("DncsSendNotificationService", "Bluetooth operation is not permitted", new Object[0]);
            d();
            return 3;
        }
        intent = c.e();
        if (intent == null)
        {
            com.fitbit.e.a.a("DncsSendNotificationService", "There is no Dncs notifications", new Object[0]);
            d();
            return 3;
        }
        com.fitbit.e.a.a("DncsSendNotificationService", "Executing new Galileo task", new Object[0]);
        d = new GalileoTaskExecutor(intent, i.a(), null) {

            final DncsSendNotificationService a;

            protected void d()
            {
                if (this == com.fitbit.dncs.service.DncsSendNotificationService.a(a))
                {
                    com.fitbit.e.a.a("DncsSendNotificationService", "Galileo task is finished", new Object[0]);
                    com.fitbit.dncs.service.DncsSendNotificationService.a(a, null);
                    DncsSendNotificationService.b(a);
                }
            }

            
            {
                a = DncsSendNotificationService.this;
                super(f, a1, threadname);
            }
        };
        if (!d.g())
        {
            com.fitbit.e.a.a("DncsSendNotificationService", "Unable to execute Galileo task", new Object[0]);
            d = null;
        }
        c();
        return 3;
    }

}
