// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.analytics.internal.aa;
import com.google.android.gms.analytics.internal.j;
import com.google.android.gms.analytics.internal.q;
import com.google.android.gms.common.internal.bl;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.internal.xl;

// Referenced classes of package com.google.android.gms.analytics:
//            AnalyticsService

public final class AnalyticsReceiver extends BroadcastReceiver
{

    static Object a = new Object();
    static xl b;
    static Boolean c;

    public AnalyticsReceiver()
    {
    }

    public static boolean a(Context context)
    {
        bl.a(context);
        if (c != null)
        {
            return c.booleanValue();
        } else
        {
            boolean flag = q.a(context, com/google/android/gms/analytics/AnalyticsReceiver, false);
            c = Boolean.valueOf(flag);
            return flag;
        }
    }

    public final void onReceive(Context context, Intent intent)
    {
        j j1;
        j1 = aa.a(context).e();
        intent = intent.getAction();
        Intent intent1;
        boolean flag;
        if (i.a)
        {
            j1.a("Device AnalyticsReceiver got", intent);
        } else
        {
            j1.a("Local AnalyticsReceiver got", intent);
        }
        if (!"com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(intent)) goto _L2; else goto _L1
_L1:
        flag = AnalyticsService.a(context);
        intent1 = new Intent(context, com/google/android/gms/analytics/AnalyticsService);
        intent1.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
        intent = ((Intent) (a));
        intent;
        JVM INSTR monitorenter ;
        context.startService(intent1);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        intent;
        JVM INSTR monitorexit ;
_L2:
        return;
        if (b == null)
        {
            context = new xl(context, "Analytics WakeLock", (byte)0);
            b = context;
            context.c();
        }
        b.a();
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
