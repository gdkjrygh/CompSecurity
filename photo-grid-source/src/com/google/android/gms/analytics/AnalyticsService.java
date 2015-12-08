// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.analytics.internal.aa;
import com.google.android.gms.analytics.internal.j;
import com.google.android.gms.analytics.internal.q;
import com.google.android.gms.analytics.internal.s;
import com.google.android.gms.common.internal.bl;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.internal.xl;

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

    public static boolean a(Context context)
    {
        bl.a(context);
        if (b != null)
        {
            return b.booleanValue();
        } else
        {
            boolean flag = q.a(context, com/google/android/gms/analytics/AnalyticsService);
            b = Boolean.valueOf(flag);
            return flag;
        }
    }

    public final IBinder onBind(Intent intent)
    {
        return null;
    }

    public final void onCreate()
    {
        super.onCreate();
        j j1 = aa.a(this).e();
        if (i.a)
        {
            j1.b("Device AnalyticsService is starting up");
            return;
        } else
        {
            j1.b("Local AnalyticsService is starting up");
            return;
        }
    }

    public final void onDestroy()
    {
        j j1 = aa.a(this).e();
        if (i.a)
        {
            j1.b("Device AnalyticsService is shutting down");
        } else
        {
            j1.b("Local AnalyticsService is shutting down");
        }
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int k, int l)
    {
        Object obj = AnalyticsReceiver.a;
        obj;
        JVM INSTR monitorenter ;
        xl xl1 = AnalyticsReceiver.b;
        if (xl1 == null)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        if (xl1.d())
        {
            xl1.b();
        }
        obj;
        JVM INSTR monitorexit ;
_L1:
        obj = aa.a(this);
        Object obj1 = ((aa) (obj)).e();
        intent = intent.getAction();
        SecurityException securityexception;
        if (i.a)
        {
            ((j) (obj1)).a("Device AnalyticsService called. startId, action", Integer.valueOf(l), intent);
        } else
        {
            ((j) (obj1)).a("Local AnalyticsService called. startId, action", Integer.valueOf(l), intent);
        }
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(intent))
        {
            ((aa) (obj)).h().a(new a(this, l, ((aa) (obj)), ((j) (obj1))));
        }
        return 2;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw obj1;
        }
        // Misplaced declaration of an exception variable
        catch (SecurityException securityexception) { }
          goto _L1
    }
}
