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

    private static Boolean zzIe;
    private Handler mHandler;

    public CampaignTrackingService()
    {
    }

    private Handler getHandler()
    {
        Handler handler1 = mHandler;
        Handler handler = handler1;
        if (handler1 == null)
        {
            handler = new Handler(getMainLooper());
            mHandler = handler;
        }
        return handler;
    }

    public static boolean zzU(Context context)
    {
        zzu.zzu(context);
        if (zzIe != null)
        {
            return zzIe.booleanValue();
        } else
        {
            boolean flag = zzam.zza(context, com/google/android/gms/analytics/CampaignTrackingService);
            zzIe = Boolean.valueOf(flag);
            return flag;
        }
    }

    private void zzhd()
    {
        Object obj = CampaignTrackingReceiver.zzoW;
        obj;
        JVM INSTR monitorenter ;
        android.os.PowerManager.WakeLock wakelock = CampaignTrackingReceiver.zzIc;
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

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        super.onCreate();
        zzf.zzV(this).zzhQ().zzaT("CampaignTrackingService is starting up");
    }

    public void onDestroy()
    {
        zzf.zzV(this).zzhQ().zzaT("CampaignTrackingService is shutting down");
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        zzhd();
        zzf zzf1 = zzf.zzV(this);
        zzaf zzaf1 = zzf1.zzhQ();
        Handler handler = null;
        if (zzf1.zzhR().zziW())
        {
            zzaf1.zzaX("Unexpected installation campaign (package side)");
            intent = handler;
        } else
        {
            intent = intent.getStringExtra("referrer");
        }
        handler = getHandler();
        if (TextUtils.isEmpty(intent))
        {
            if (!zzf1.zzhR().zziW())
            {
                zzaf1.zzaW("No campaign found on com.android.vending.INSTALL_REFERRER \"referrer\" extra");
            }
            zzf1.zzhS().zze(new Runnable(zzaf1, handler, j) {

                final int zzIf;
                final zzaf zzIh;
                final CampaignTrackingService zzIo;
                final Handler zzt;

                public void run()
                {
                    zzIo.zza(zzIh, zzt, zzIf);
                }

            
            {
                zzIo = CampaignTrackingService.this;
                zzIh = zzaf1;
                zzt = handler;
                zzIf = i;
                super();
            }
            });
            return 2;
        }
        i = zzf1.zzhR().zzja();
        if (intent.length() > i)
        {
            zzaf1.zzc("Campaign data exceed the maximum supported size and will be clipped. size, limit", Integer.valueOf(intent.length()), Integer.valueOf(i));
            intent = intent.substring(0, i);
        }
        zzaf1.zza("CampaignTrackingService called. startId, campaign", Integer.valueOf(j), intent);
        zzf1.zzhl().zza(intent, new Runnable(zzaf1, handler, j) {

            final int zzIf;
            final zzaf zzIh;
            final CampaignTrackingService zzIo;
            final Handler zzt;

            public void run()
            {
                zzIo.zza(zzIh, zzt, zzIf);
            }

            
            {
                zzIo = CampaignTrackingService.this;
                zzIh = zzaf1;
                zzt = handler;
                zzIf = i;
                super();
            }
        });
        return 2;
    }

    protected void zza(zzaf zzaf1, Handler handler, int i)
    {
        handler.post(new Runnable(i, zzaf1) {

            final int zzIf;
            final zzaf zzIh;
            final CampaignTrackingService zzIo;

            public void run()
            {
                boolean flag = zzIo.stopSelfResult(zzIf);
                if (flag)
                {
                    zzIh.zza("Install campaign broadcast processed", Boolean.valueOf(flag));
                }
            }

            
            {
                zzIo = CampaignTrackingService.this;
                zzIf = i;
                zzIh = zzaf1;
                super();
            }
        });
    }
}
