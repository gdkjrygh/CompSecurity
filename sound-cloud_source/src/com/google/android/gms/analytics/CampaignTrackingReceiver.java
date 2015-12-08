// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.g;
import com.google.android.gms.analytics.internal.l;
import com.google.android.gms.analytics.internal.v;
import com.google.android.gms.b.ay;
import com.google.android.gms.common.internal.zzd;
import com.google.android.gms.common.internal.zzx;

// Referenced classes of package com.google.android.gms.analytics:
//            CampaignTrackingService

public class CampaignTrackingReceiver extends BroadcastReceiver
{

    static Object a = new Object();
    static ay b;
    static Boolean c;

    public CampaignTrackingReceiver()
    {
    }

    public static boolean a(Context context)
    {
        zzx.zzv(context);
        if (c != null)
        {
            return c.booleanValue();
        } else
        {
            boolean flag = l.a(context, com/google/android/gms/analytics/CampaignTrackingReceiver, true);
            c = Boolean.valueOf(flag);
            return flag;
        }
    }

    public Class a()
    {
        return com/google/android/gms/analytics/CampaignTrackingService;
    }

    public void a(String s)
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        g g1;
        Intent intent1;
        boolean flag;
        g1 = v.a(context).a();
        String s = intent.getStringExtra("referrer");
        intent = intent.getAction();
        g1.a("CampaignTrackingReceiver received", intent);
        if (!"com.android.vending.INSTALL_REFERRER".equals(intent) || TextUtils.isEmpty(s))
        {
            g1.e("CampaignTrackingReceiver received unexpected intent without referrer extra");
            return;
        }
        flag = CampaignTrackingService.a(context);
        if (!flag)
        {
            g1.e("CampaignTrackingService not registered or disabled. Installation tracking not possible. See http://goo.gl/8Rd3yj for instructions.");
        }
        a(s);
        if (zzd.zzacF)
        {
            g1.f("Received unexpected installation campaign on package side");
            return;
        }
        intent = a();
        zzx.zzv(intent);
        intent1 = new Intent(context, intent);
        intent1.putExtra("referrer", s);
        intent = ((Intent) (a));
        intent;
        JVM INSTR monitorenter ;
        context.startService(intent1);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_145;
        }
        intent;
        JVM INSTR monitorexit ;
        return;
        context;
        intent;
        JVM INSTR monitorexit ;
        throw context;
        if (b == null)
        {
            context = new ay(context, "Analytics campaign WakeLock", (byte)0);
            b = context;
            context.c();
        }
        b.a();
_L1:
        intent;
        JVM INSTR monitorexit ;
        return;
        context;
        g1.e("CampaignTrackingService service at risk of not starting. For more reliable installation campaign reports, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions.");
          goto _L1
    }

}
