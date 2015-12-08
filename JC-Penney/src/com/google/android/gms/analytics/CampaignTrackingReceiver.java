// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.ab;
import com.google.android.gms.analytics.internal.bb;
import com.google.android.gms.analytics.internal.j;
import com.google.android.gms.analytics.internal.r;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.d.au;

// Referenced classes of package com.google.android.gms.analytics:
//            CampaignTrackingService

public class CampaignTrackingReceiver extends BroadcastReceiver
{

    static Object a = new Object();
    static au b;
    static Boolean c;

    public CampaignTrackingReceiver()
    {
    }

    public static boolean a(Context context)
    {
        u.a(context);
        if (c != null)
        {
            return c.booleanValue();
        } else
        {
            boolean flag = r.a(context, com/google/android/gms/analytics/CampaignTrackingReceiver, true);
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
        j j1;
        Object obj;
        boolean flag;
        obj = ab.a(context);
        j1 = ((ab) (obj)).f();
        String s = intent.getStringExtra("referrer");
        intent = intent.getAction();
        j1.a("CampaignTrackingReceiver received", intent);
        if (!"com.android.vending.INSTALL_REFERRER".equals(intent) || TextUtils.isEmpty(s))
        {
            j1.e("CampaignTrackingReceiver received unexpected intent without referrer extra");
            return;
        }
        flag = CampaignTrackingService.a(context);
        if (!flag)
        {
            j1.e("CampaignTrackingService not registered or disabled. Installation tracking not possible. See http://goo.gl/8Rd3yj for instructions.");
        }
        a(s);
        if (((ab) (obj)).e().a())
        {
            j1.f("Received unexpected installation campaign on package side");
            return;
        }
        intent = a();
        u.a(intent);
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
        if (b == null)
        {
            b = new au(context, 1, "Analytics campaign WakeLock");
            b.a(false);
        }
        b.a(1000L);
_L1:
        intent;
        JVM INSTR monitorexit ;
        return;
        context;
        j1.e("CampaignTrackingService service at risk of not starting. For more reliable installation campaign reports, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions.");
          goto _L1
    }

}
