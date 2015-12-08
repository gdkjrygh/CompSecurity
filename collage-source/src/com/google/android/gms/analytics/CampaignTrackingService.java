// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.af;
import com.google.android.gms.analytics.internal.g;
import com.google.android.gms.analytics.internal.n;
import com.google.android.gms.analytics.internal.p;
import com.google.android.gms.analytics.internal.t;
import com.google.android.gms.common.internal.z;
import com.google.android.gms.internal.ke;
import com.google.android.gms.internal.zzof;

// Referenced classes of package com.google.android.gms.analytics:
//            CampaignTrackingReceiver

public class CampaignTrackingService extends Service
{

    private static Boolean b;
    private Handler a;

    public CampaignTrackingService()
    {
    }

    private void a()
    {
        Object obj = CampaignTrackingReceiver.a;
        obj;
        JVM INSTR monitorenter ;
        ke ke1 = CampaignTrackingReceiver.b;
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
            boolean flag = n.a(context, com/google/android/gms/analytics/CampaignTrackingService);
            b = Boolean.valueOf(flag);
            return flag;
        }
    }

    private Handler b()
    {
        Handler handler1 = a;
        Handler handler = handler1;
        if (handler1 == null)
        {
            handler = new Handler(getMainLooper());
            a = handler;
        }
        return handler;
    }

    protected void a(g g1, Handler handler, int i)
    {
        handler.post(new Runnable(i, g1) {

            final int a;
            final g b;
            final CampaignTrackingService c;

            public void run()
            {
                boolean flag = c.stopSelfResult(a);
                if (flag)
                {
                    b.a("Install campaign broadcast processed", Boolean.valueOf(flag));
                }
            }

            
            {
                c = CampaignTrackingService.this;
                a = i;
                b = g1;
                super();
            }
        });
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        super.onCreate();
        t.a(this).f().b("CampaignTrackingService is starting up");
    }

    public void onDestroy()
    {
        t.a(this).f().b("CampaignTrackingService is shutting down");
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        a();
        t t1 = t.a(this);
        g g1 = t1.f();
        Handler handler = null;
        if (t1.e().a())
        {
            g1.f("Unexpected installation campaign (package side)");
            intent = handler;
        } else
        {
            intent = intent.getStringExtra("referrer");
        }
        handler = b();
        if (TextUtils.isEmpty(intent))
        {
            if (!t1.e().a())
            {
                g1.e("No campaign found on com.android.vending.INSTALL_REFERRER \"referrer\" extra");
            }
            t1.h().a(new Runnable(g1, handler, j) {

                final g a;
                final Handler b;
                final int c;
                final CampaignTrackingService d;

                public void run()
                {
                    d.a(a, b, c);
                }

            
            {
                d = CampaignTrackingService.this;
                a = g1;
                b = handler;
                c = i;
                super();
            }
            });
            return 2;
        }
        i = t1.e().e();
        if (intent.length() > i)
        {
            g1.c("Campaign data exceed the maximum supported size and will be clipped. size, limit", Integer.valueOf(intent.length()), Integer.valueOf(i));
            intent = intent.substring(0, i);
        }
        g1.a("CampaignTrackingService called. startId, campaign", Integer.valueOf(j), intent);
        t1.i().a(intent, new Runnable(g1, handler, j) {

            final g a;
            final Handler b;
            final int c;
            final CampaignTrackingService d;

            public void run()
            {
                d.a(a, b, c);
            }

            
            {
                d = CampaignTrackingService.this;
                a = g1;
                b = handler;
                c = i;
                super();
            }
        });
        return 2;
    }
}
