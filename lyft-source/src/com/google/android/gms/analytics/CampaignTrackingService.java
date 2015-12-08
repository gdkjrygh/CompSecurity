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
import com.google.android.gms.analytics.internal.zzaf;
import com.google.android.gms.analytics.internal.zzam;
import com.google.android.gms.analytics.internal.zzb;
import com.google.android.gms.analytics.internal.zzf;
import com.google.android.gms.analytics.internal.zzr;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzns;

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
        android.os.PowerManager.WakeLock wakelock = CampaignTrackingReceiver.b;
        if (wakelock == null)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        if (wakelock.isHeld())
        {
            wakelock.release();
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
        zzu.a(context);
        if (b != null)
        {
            return b.booleanValue();
        } else
        {
            boolean flag = zzam.a(context, com/google/android/gms/analytics/CampaignTrackingService);
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

    protected void a(zzaf zzaf1, Handler handler, int i)
    {
        handler.post(new Runnable(i, zzaf1) {

            final int a;
            final zzaf b;
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
                b = zzaf1;
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
        zzf.a(this).f().b("CampaignTrackingService is starting up");
    }

    public void onDestroy()
    {
        zzf.a(this).f().b("CampaignTrackingService is shutting down");
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        a();
        zzf zzf1 = zzf.a(this);
        zzaf zzaf1 = zzf1.f();
        Handler handler = null;
        if (zzf1.e().a())
        {
            zzaf1.f("Unexpected installation campaign (package side)");
            intent = handler;
        } else
        {
            intent = intent.getStringExtra("referrer");
        }
        handler = b();
        if (TextUtils.isEmpty(intent))
        {
            if (!zzf1.e().a())
            {
                zzaf1.e("No campaign found on com.android.vending.INSTALL_REFERRER \"referrer\" extra");
            }
            zzf1.h().a(new Runnable(zzaf1, handler, j) {

                final zzaf a;
                final Handler b;
                final int c;
                final CampaignTrackingService d;

                public void run()
                {
                    d.a(a, b, c);
                }

            
            {
                d = CampaignTrackingService.this;
                a = zzaf1;
                b = handler;
                c = i;
                super();
            }
            });
            return 2;
        }
        i = zzf1.e().e();
        if (intent.length() > i)
        {
            zzaf1.c("Campaign data exceed the maximum supported size and will be clipped. size, limit", Integer.valueOf(intent.length()), Integer.valueOf(i));
            intent = intent.substring(0, i);
        }
        zzaf1.a("CampaignTrackingService called. startId, campaign", Integer.valueOf(j), intent);
        zzf1.i().a(intent, new Runnable(zzaf1, handler, j) {

            final zzaf a;
            final Handler b;
            final int c;
            final CampaignTrackingService d;

            public void run()
            {
                d.a(a, b, c);
            }

            
            {
                d = CampaignTrackingService.this;
                a = zzaf1;
                b = handler;
                c = i;
                super();
            }
        });
        return 2;
    }
}
