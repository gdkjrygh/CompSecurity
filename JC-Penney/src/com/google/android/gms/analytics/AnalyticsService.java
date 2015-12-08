// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.analytics.internal.ab;
import com.google.android.gms.analytics.internal.bb;
import com.google.android.gms.analytics.internal.j;
import com.google.android.gms.analytics.internal.r;
import com.google.android.gms.analytics.internal.t;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.d.au;

// Referenced classes of package com.google.android.gms.analytics:
//            AnalyticsReceiver, a

public final class AnalyticsService extends Service
{

    private static Boolean b;
    private final Handler a = new Handler();

    public AnalyticsService()
    {
    }

    static Handler a(AnalyticsService analyticsservice)
    {
        return analyticsservice.a;
    }

    private void a()
    {
        Object obj = AnalyticsReceiver.a;
        obj;
        JVM INSTR monitorenter ;
        au au1 = AnalyticsReceiver.b;
        if (au1 == null)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        if (au1.b())
        {
            au1.a();
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        catch (SecurityException securityexception)
        {
            return;
        }
    }

    public static boolean a(Context context)
    {
        u.a(context);
        if (b != null)
        {
            return b.booleanValue();
        } else
        {
            boolean flag = r.a(context, com/google/android/gms/analytics/AnalyticsService);
            b = Boolean.valueOf(flag);
            return flag;
        }
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        super.onCreate();
        ab ab1 = ab.a(this);
        j j1 = ab1.f();
        if (ab1.e().a())
        {
            j1.b("Device AnalyticsService is starting up");
            return;
        } else
        {
            j1.b("Local AnalyticsService is starting up");
            return;
        }
    }

    public void onDestroy()
    {
        ab ab1 = ab.a(this);
        j j1 = ab1.f();
        if (ab1.e().a())
        {
            j1.b("Device AnalyticsService is shutting down");
        } else
        {
            j1.b("Local AnalyticsService is shutting down");
        }
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int k)
    {
        a();
        ab ab1 = ab.a(this);
        j j1 = ab1.f();
        intent = intent.getAction();
        if (ab1.e().a())
        {
            j1.a("Device AnalyticsService called. startId, action", Integer.valueOf(k), intent);
        } else
        {
            j1.a("Local AnalyticsService called. startId, action", Integer.valueOf(k), intent);
        }
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(intent))
        {
            ab1.i().a(new a(this, k, ab1, j1));
        }
        return 2;
    }
}
