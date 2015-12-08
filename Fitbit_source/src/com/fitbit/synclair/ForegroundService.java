// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.synclair;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import com.fitbit.e.a;
import com.fitbit.util.service.WakefulService;

public class ForegroundService extends WakefulService
{
    public class a extends Binder
    {

        final ForegroundService a;

        public ForegroundService a()
        {
            return a;
        }

        public a()
        {
            a = ForegroundService.this;
            super();
        }
    }


    public static final int a = 10001;
    private static final String c = "ForegoundService";
    private NotificationManager b;
    private boolean d;
    private final IBinder e = new a();
    private Notification f;
    private boolean g;

    public ForegroundService()
    {
        d = false;
    }

    protected String a()
    {
        return "ForegoundService";
    }

    public void a(Notification notification)
    {
        f = notification;
        if (!d)
        {
            d = true;
            startForeground(10001, notification);
            return;
        } else
        {
            b.notify(10001, notification);
            return;
        }
    }

    public void a(boolean flag)
    {
        g = flag;
    }

    public boolean b()
    {
        return g;
    }

    public IBinder onBind(Intent intent)
    {
        return e;
    }

    public void onCreate()
    {
        super.onCreate();
        b = (NotificationManager)getSystemService("notification");
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        com.fitbit.e.a.a("ForegoundService", "Started", new Object[0]);
        return 2;
    }

    public boolean onUnbind(Intent intent)
    {
label0:
        {
            boolean flag1 = true;
            com.fitbit.e.a.a("ForegoundService", "onUnbind hit", new Object[0]);
            d = false;
            boolean flag;
            if (!g)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            stopForeground(flag);
            if (f != null)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            com.fitbit.e.a.a("ForegoundService", "null != lastNotification == %s", new Object[] {
                Boolean.valueOf(flag)
            });
            if (f != null)
            {
                if (!g)
                {
                    break label0;
                }
                b.notify(10001, f);
            }
            return false;
        }
        com.fitbit.e.a.e("ForegoundService", "notification canceled", new Object[0]);
        b.cancel(10001);
        return false;
    }
}
