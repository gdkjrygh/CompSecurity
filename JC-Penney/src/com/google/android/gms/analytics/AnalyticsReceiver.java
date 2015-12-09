// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.analytics.internal.ab;
import com.google.android.gms.analytics.internal.bb;
import com.google.android.gms.analytics.internal.j;
import com.google.android.gms.analytics.internal.r;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.d.au;

// Referenced classes of package com.google.android.gms.analytics:
//            AnalyticsService

public final class AnalyticsReceiver extends BroadcastReceiver
{

    static Object a = new Object();
    static au b;
    static Boolean c;

    public AnalyticsReceiver()
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
            boolean flag = r.a(context, com/google/android/gms/analytics/AnalyticsReceiver, false);
            c = Boolean.valueOf(flag);
            return flag;
        }
    }

    public void onReceive(Context context, Intent intent)
    {
        j j1;
        Object obj = ab.a(context);
        j1 = ((ab) (obj)).f();
        intent = intent.getAction();
        boolean flag;
        if (((ab) (obj)).e().a())
        {
            j1.a("Device AnalyticsReceiver got", intent);
        } else
        {
            j1.a("Local AnalyticsReceiver got", intent);
        }
        if (!"com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(intent)) goto _L2; else goto _L1
_L1:
        flag = AnalyticsService.a(context);
        obj = new Intent(context, com/google/android/gms/analytics/AnalyticsService);
        ((Intent) (obj)).setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
        intent = ((Intent) (a));
        intent;
        JVM INSTR monitorenter ;
        context.startService(((Intent) (obj)));
        if (flag)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        intent;
        JVM INSTR monitorexit ;
_L2:
        return;
        if (b == null)
        {
            b = new au(context, 1, "Analytics WakeLock");
            b.a(false);
        }
        b.a(1000L);
_L3:
        intent;
        JVM INSTR monitorexit ;
        return;
        context;
        intent;
        JVM INSTR monitorexit ;
        throw context;
        context;
        j1.e("Analytics service at risk of not starting. For more reliable analytics, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions.");
          goto _L3
    }

}
