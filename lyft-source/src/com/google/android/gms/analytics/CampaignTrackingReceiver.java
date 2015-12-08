// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.zzaf;
import com.google.android.gms.analytics.internal.zzam;
import com.google.android.gms.analytics.internal.zzf;
import com.google.android.gms.analytics.internal.zzr;
import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.analytics:
//            CampaignTrackingService

public class CampaignTrackingReceiver extends BroadcastReceiver
{

    static Object a = new Object();
    static android.os.PowerManager.WakeLock b;
    static Boolean c;

    public CampaignTrackingReceiver()
    {
    }

    public static boolean a(Context context)
    {
        zzu.a(context);
        if (c != null)
        {
            return c.booleanValue();
        } else
        {
            boolean flag = zzam.a(context, com/google/android/gms/analytics/CampaignTrackingReceiver, true);
            c = Boolean.valueOf(flag);
            return flag;
        }
    }

    protected Class a()
    {
        return com/google/android/gms/analytics/CampaignTrackingService;
    }

    protected void a(String s)
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        zzaf zzaf1;
        Object obj;
        boolean flag;
        obj = zzf.a(context);
        zzaf1 = ((zzf) (obj)).f();
        String s = intent.getStringExtra("referrer");
        intent = intent.getAction();
        zzaf1.a("CampaignTrackingReceiver received", intent);
        if (!"com.android.vending.INSTALL_REFERRER".equals(intent) || TextUtils.isEmpty(s))
        {
            zzaf1.e("CampaignTrackingReceiver received unexpected intent without referrer extra");
            return;
        }
        flag = CampaignTrackingService.a(context);
        if (!flag)
        {
            zzaf1.e("CampaignTrackingService not registered or disabled. Installation tracking not possible. See http://goo.gl/8Rd3yj for instructions.");
        }
        a(s);
        if (((zzf) (obj)).e().a())
        {
            zzaf1.f("Received unexpected installation campaign on package side");
            return;
        }
        intent = a();
        zzu.a(intent);
        obj = new Intent(context, intent);
        ((Intent) (obj)).putExtra("referrer", s);
        intent = ((Intent) (a));
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
        if (b == null)
        {
            b = context.newWakeLock(1, "Analytics campaign WakeLock");
            b.setReferenceCounted(false);
        }
        b.acquire(1000L);
_L1:
        intent;
        JVM INSTR monitorexit ;
        return;
        context;
        zzaf1.e("CampaignTrackingService service at risk of not starting. For more reliable installation campaign reports, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions.");
          goto _L1
    }

}
