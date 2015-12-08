// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class blo extends BroadcastReceiver
{

    static Object a = new Object();
    static con b;
    private static Boolean c;

    public blo()
    {
    }

    public static boolean a(Context context)
    {
        btl.a(context);
        if (c != null)
        {
            return c.booleanValue();
        } else
        {
            boolean flag = bmz.a(context, blo, false);
            c = Boolean.valueOf(flag);
            return flag;
        }
    }

    public final void onReceive(Context context, Intent intent)
    {
        bmp bmp1;
        bmp1 = bnf.a(context).a();
        intent = intent.getAction();
        bmp1.a("Local AnalyticsReceiver got", intent);
        if (!"com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(intent)) goto _L2; else goto _L1
_L1:
        Intent intent1;
        boolean flag;
        flag = blp.a(context);
        intent1 = new Intent(context, blp);
        intent1.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
        intent = ((Intent) (a));
        intent;
        JVM INSTR monitorenter ;
        context.startService(intent1);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        intent;
        JVM INSTR monitorexit ;
_L2:
        return;
        if (b == null)
        {
            context = new con(context, "Analytics WakeLock", (byte)0);
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
        bmp1.e("Analytics service at risk of not starting. For more reliable analytics, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions.");
          goto _L3
    }

}
