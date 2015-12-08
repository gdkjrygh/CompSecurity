// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.analytics.internal.aj;
import com.google.android.gms.analytics.internal.m;
import com.google.android.gms.analytics.internal.o;
import com.google.android.gms.analytics.internal.s;
import com.google.android.gms.common.internal.g;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.internal.jt;

// Referenced classes of package com.google.android.gms.analytics:
//            AnalyticsReceiver

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
        y.a(context);
        if (b != null)
        {
            return b.booleanValue();
        } else
        {
            boolean flag = m.a(context, com/google/android/gms/analytics/AnalyticsService);
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
        com.google.android.gms.analytics.internal.g g1 = s.a(this).e();
        if (g.a)
        {
            g1.c("Device AnalyticsService is starting up");
            return;
        } else
        {
            g1.c("Local AnalyticsService is starting up");
            return;
        }
    }

    public final void onDestroy()
    {
        com.google.android.gms.analytics.internal.g g1 = s.a(this).e();
        if (g.a)
        {
            g1.c("Device AnalyticsService is shutting down");
        } else
        {
            g1.c("Local AnalyticsService is shutting down");
        }
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int j)
    {
        Object obj = AnalyticsReceiver.a;
        obj;
        JVM INSTR monitorenter ;
        jt jt1 = AnalyticsReceiver.b;
        if (jt1 == null)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        if (jt1.d())
        {
            jt1.b();
        }
        obj;
        JVM INSTR monitorexit ;
_L1:
        obj = s.a(this);
        Object obj1 = ((s) (obj)).e();
        intent = intent.getAction();
        SecurityException securityexception;
        if (g.a)
        {
            ((com.google.android.gms.analytics.internal.g) (obj1)).a("Device AnalyticsService called. startId, action", Integer.valueOf(j), intent);
        } else
        {
            ((com.google.android.gms.analytics.internal.g) (obj1)).a("Local AnalyticsService called. startId, action", Integer.valueOf(j), intent);
        }
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(intent))
        {
            ((s) (obj)).h().a(new aj(j, ((s) (obj)), ((com.google.android.gms.analytics.internal.g) (obj1))) {

                final int a;
                final s b;
                final com.google.android.gms.analytics.internal.g c;
                final AnalyticsService d;

                public final void a()
                {
                    AnalyticsService.a(d).post(new Runnable(this) {

                        final _cls1 a;

                        public final void run()
                        {
label0:
                            {
                                if (a.d.stopSelfResult(a.a))
                                {
                                    if (!g.a)
                                    {
                                        break label0;
                                    }
                                    a.c.c("Device AnalyticsService processed last dispatch request");
                                }
                                return;
                            }
                            a.c.c("Local AnalyticsService processed last dispatch request");
                        }

            
            {
                a = _pcls1;
                super();
            }
                    });
                }

            
            {
                d = AnalyticsService.this;
                a = i;
                b = s1;
                c = g1;
                super();
            }
            });
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
