// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class jqf extends BroadcastReceiver
{

    static Object a = new Object();
    static lpf b;
    private static Boolean c;

    public jqf()
    {
    }

    public static boolean a(Context context)
    {
        b.d(context);
        if (c != null)
        {
            return c.booleanValue();
        } else
        {
            boolean flag = jtk.a(context, jqf, false);
            c = Boolean.valueOf(flag);
            return flag;
        }
    }

    public final void onReceive(Context context, Intent intent)
    {
        jso jso1;
        jso1 = jrk.a(context).a();
        intent = intent.getAction();
        Intent intent1;
        boolean flag;
        if (kbe.a)
        {
            jso1.a("Device AnalyticsReceiver got", intent);
        } else
        {
            jso1.a("Local AnalyticsReceiver got", intent);
        }
        if (!"com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(intent)) goto _L2; else goto _L1
_L1:
        flag = jqg.a(context);
        intent1 = new Intent(context, jqg);
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
            context = new lpf(context, 1, "Analytics WakeLock");
            b = context;
            context.a(false);
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
        jso1.e("Analytics service at risk of not starting. For more reliable analytics, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions.");
          goto _L3
    }

}
