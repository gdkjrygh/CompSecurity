// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.analytics.internal.af;
import com.google.android.gms.analytics.internal.ak;
import com.google.android.gms.analytics.internal.g;
import com.google.android.gms.analytics.internal.n;
import com.google.android.gms.analytics.internal.p;
import com.google.android.gms.analytics.internal.t;
import com.google.android.gms.common.internal.z;
import com.google.android.gms.internal.ke;

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

    private void a()
    {
        Object obj = AnalyticsReceiver.a;
        obj;
        JVM INSTR monitorenter ;
        ke ke1 = AnalyticsReceiver.b;
        if (ke1 == null)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        if (ke1.b())
        {
            ke1.a();
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
        z.a(context);
        if (b != null)
        {
            return b.booleanValue();
        } else
        {
            boolean flag = n.a(context, com/google/android/gms/analytics/AnalyticsService);
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
        t t1 = t.a(this);
        g g1 = t1.f();
        if (t1.e().a())
        {
            g1.b("Device AnalyticsService is starting up");
            return;
        } else
        {
            g1.b("Local AnalyticsService is starting up");
            return;
        }
    }

    public void onDestroy()
    {
        t t1 = t.a(this);
        g g1 = t1.f();
        if (t1.e().a())
        {
            g1.b("Device AnalyticsService is shutting down");
        } else
        {
            g1.b("Local AnalyticsService is shutting down");
        }
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        a();
        t t1 = t.a(this);
        g g1 = t1.f();
        intent = intent.getAction();
        if (t1.e().a())
        {
            g1.a("Device AnalyticsService called. startId, action", Integer.valueOf(j), intent);
        } else
        {
            g1.a("Local AnalyticsService called. startId, action", Integer.valueOf(j), intent);
        }
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(intent))
        {
            t1.i().a(new ak(j, t1, g1) {

                final int a;
                final t b;
                final g c;
                final AnalyticsService d;

                public void a(Throwable throwable)
                {
                    AnalyticsService.a(d).post(new Runnable(this) {

                        final _cls1 a;

                        public void run()
                        {
label0:
                            {
                                if (a.d.stopSelfResult(a.a))
                                {
                                    if (!a.b.e().a())
                                    {
                                        break label0;
                                    }
                                    a.c.b("Device AnalyticsService processed last dispatch request");
                                }
                                return;
                            }
                            a.c.b("Local AnalyticsService processed last dispatch request");
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
                b = t1;
                c = g1;
                super();
            }
            });
        }
        return 2;
    }
}
