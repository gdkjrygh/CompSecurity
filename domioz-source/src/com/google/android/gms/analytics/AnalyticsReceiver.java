// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;

// Referenced classes of package com.google.android.gms.analytics:
//            AnalyticsService, h

public final class AnalyticsReceiver extends BroadcastReceiver
{

    static Object a = new Object();
    static android.os.PowerManager.WakeLock b;

    public AnalyticsReceiver()
    {
    }

    public final void onReceive(Context context, Intent intent)
    {
        Intent intent1 = new Intent(context, com/google/android/gms/analytics/AnalyticsService);
        intent = ((Intent) (a));
        intent;
        JVM INSTR monitorenter ;
        context.startService(intent1);
        context = ((PowerManager)context.getSystemService("power")).newWakeLock(1, "Analytics WakeLock");
        b = context;
        context.acquire(1000L);
_L1:
        return;
        context;
        h.d("Analytics service at risk of not starting. For more reliable analytics, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions.");
          goto _L1
        context;
        intent;
        JVM INSTR monitorexit ;
        throw context;
    }

}
