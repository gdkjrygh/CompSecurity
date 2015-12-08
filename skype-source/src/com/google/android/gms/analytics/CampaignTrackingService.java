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
import com.google.android.gms.analytics.internal.ae;
import com.google.android.gms.analytics.internal.g;
import com.google.android.gms.analytics.internal.m;
import com.google.android.gms.analytics.internal.o;
import com.google.android.gms.analytics.internal.s;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.internal.je;
import com.google.android.gms.internal.jt;

// Referenced classes of package com.google.android.gms.analytics:
//            CampaignTrackingReceiver

public class CampaignTrackingService extends Service
{

    private static Boolean b;
    private Handler a;

    public CampaignTrackingService()
    {
    }

    public static boolean a(Context context)
    {
        y.a(context);
        if (b != null)
        {
            return b.booleanValue();
        } else
        {
            boolean flag = m.a(context, com/google/android/gms/analytics/CampaignTrackingService);
            b = Boolean.valueOf(flag);
            return flag;
        }
    }

    protected final void a(g g1, Handler handler, int i)
    {
        handler.post(new Runnable(i, g1) {

            final int a;
            final g b;
            final CampaignTrackingService c;

            public final void run()
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
        s.a(this).e().c("CampaignTrackingService is starting up");
    }

    public void onDestroy()
    {
        s.a(this).e().c("CampaignTrackingService is shutting down");
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        Object obj = CampaignTrackingReceiver.a;
        obj;
        JVM INSTR monitorenter ;
        jt jt1 = CampaignTrackingReceiver.b;
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
        s s1;
        g g1;
        s1 = s.a(this);
        g1 = s1.e();
        obj = null;
        Handler handler;
        Exception exception;
        if (com.google.android.gms.common.internal.g.a)
        {
            g1.g("Unexpected installation campaign (package side)");
            intent = ((Intent) (obj));
        } else
        {
            intent = intent.getStringExtra("referrer");
        }
        handler = a;
        obj = handler;
        if (handler == null)
        {
            obj = new Handler(getMainLooper());
            a = ((Handler) (obj));
        }
        if (TextUtils.isEmpty(intent))
        {
            if (!com.google.android.gms.common.internal.g.a)
            {
                g1.f("No campaign found on com.android.vending.INSTALL_REFERRER \"referrer\" extra");
            }
            s1.g().a(new Runnable(g1, ((Handler) (obj)), j) {

                final g a;
                final Handler b;
                final int c;
                final CampaignTrackingService d;

                public final void run()
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
        break MISSING_BLOCK_LABEL_166;
        exception;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
          goto _L1
        i = ae.c();
        if (intent.length() > i)
        {
            g1.c("Campaign data exceed the maximum supported size and will be clipped. size, limit", Integer.valueOf(intent.length()), Integer.valueOf(i));
            intent = intent.substring(0, i);
        }
        g1.a("CampaignTrackingService called. startId, campaign", Integer.valueOf(j), intent);
        s1.h().a(intent, new Runnable(g1, ((Handler) (obj)), j) {

            final g a;
            final Handler b;
            final int c;
            final CampaignTrackingService d;

            public final void run()
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
