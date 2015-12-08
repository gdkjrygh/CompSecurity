// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.analytics.internal.g;
import com.google.android.gms.analytics.internal.l;
import com.google.android.gms.analytics.internal.n;
import com.google.android.gms.analytics.internal.v;
import com.google.android.gms.b.ay;
import com.google.android.gms.common.internal.zzd;
import com.google.android.gms.common.internal.zzx;

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
        zzx.zzv(context);
        if (b != null)
        {
            return b.booleanValue();
        } else
        {
            boolean flag = l.a(context, com/google/android/gms/analytics/AnalyticsService);
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
        g g1 = v.a(this).a();
        if (zzd.zzacF)
        {
            g1.b("Device AnalyticsService is starting up");
            return;
        } else
        {
            g1.b("Local AnalyticsService is starting up");
            return;
        }
    }

    public final void onDestroy()
    {
        g g1 = v.a(this).a();
        if (zzd.zzacF)
        {
            g1.b("Device AnalyticsService is shutting down");
        } else
        {
            g1.b("Local AnalyticsService is shutting down");
        }
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int j)
    {
        Object obj = AnalyticsReceiver.a;
        obj;
        JVM INSTR monitorenter ;
        ay ay1 = AnalyticsReceiver.b;
        if (ay1 == null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        if (ay1.a.isHeld())
        {
            ay1.b();
        }
        obj;
        JVM INSTR monitorexit ;
_L1:
        obj = v.a(this);
        Object obj1 = ((v) (obj)).a();
        intent = intent.getAction();
        SecurityException securityexception;
        if (zzd.zzacF)
        {
            ((g) (obj1)).a("Device AnalyticsService called. startId, action", Integer.valueOf(j), intent);
        } else
        {
            ((g) (obj1)).a("Local AnalyticsService called. startId, action", Integer.valueOf(j), intent);
        }
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(intent))
        {
            ((v) (obj)).c().a(new a(this, j, ((v) (obj)), ((g) (obj1))));
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
