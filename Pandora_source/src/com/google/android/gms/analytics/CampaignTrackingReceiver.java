// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.zzae;
import com.google.android.gms.analytics.internal.zzal;
import com.google.android.gms.analytics.internal.zze;
import com.google.android.gms.analytics.internal.zzq;
import com.google.android.gms.common.internal.zzv;

// Referenced classes of package com.google.android.gms.analytics:
//            CampaignTrackingService

public class CampaignTrackingReceiver extends BroadcastReceiver
{

    static android.os.PowerManager.WakeLock zzEd;
    static Boolean zzEe;
    static Object zznu = new Object();

    public CampaignTrackingReceiver()
    {
    }

    public static boolean zzH(Context context)
    {
        zzv.zzr(context);
        if (zzEe != null)
        {
            return zzEe.booleanValue();
        } else
        {
            boolean flag = zzal.zza(context, com/google/android/gms/analytics/CampaignTrackingReceiver, true);
            zzEe = Boolean.valueOf(flag);
            return flag;
        }
    }

    public void onReceive(Context context, Intent intent)
    {
        zzae zzae1;
        Object obj;
        boolean flag;
        obj = zze.zzJ(context);
        zzae1 = ((zze) (obj)).zzgH();
        String s = intent.getStringExtra("referrer");
        intent = intent.getAction();
        zzae1.zza("CampaignTrackingReceiver received", intent);
        if (!"com.android.vending.INSTALL_REFERRER".equals(intent) || TextUtils.isEmpty(s))
        {
            zzae1.zzaI("CampaignTrackingReceiver received unexpected intent without referrer extra");
            return;
        }
        flag = CampaignTrackingService.zzI(context);
        if (!flag)
        {
            zzae1.zzaI("CampaignTrackingService not registered or disabled. Installation tracking not possible. See http://goo.gl/8Rd3yj for instructions.");
        }
        zzaw(s);
        if (((zze) (obj)).zzgI().zzhP())
        {
            zzae1.zzaJ("Received unexpected installation campaign on package side");
            return;
        }
        intent = zzfS();
        zzv.zzr(intent);
        obj = new Intent(context, intent);
        ((Intent) (obj)).putExtra("referrer", s);
        intent = ((Intent) (zznu));
        intent;
        JVM INSTR monitorenter ;
        context.startService(((Intent) (obj)));
        if (flag)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        intent;
        JVM INSTR monitorexit ;
        return;
        context;
        intent;
        JVM INSTR monitorexit ;
        throw context;
        context = (PowerManager)context.getSystemService("power");
        if (zzEd == null)
        {
            zzEd = context.newWakeLock(1, "Analytics campaign WakeLock");
            zzEd.setReferenceCounted(false);
        }
        zzEd.acquire(1000L);
_L1:
        intent;
        JVM INSTR monitorexit ;
        return;
        context;
        zzae1.zzaI("CampaignTrackingService service at risk of not starting. For more reliable installation campaign reports, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions.");
          goto _L1
    }

    protected void zzaw(String s)
    {
    }

    protected Class zzfS()
    {
        return com/google/android/gms/analytics/CampaignTrackingService;
    }

}
