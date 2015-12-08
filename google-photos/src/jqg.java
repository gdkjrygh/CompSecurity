// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;

public final class jqg extends Service
{

    private static Boolean b;
    private final Handler a = new Handler();

    public jqg()
    {
    }

    static Handler a(jqg jqg1)
    {
        return jqg1.a;
    }

    public static boolean a(Context context)
    {
        b.d(context);
        if (b != null)
        {
            return b.booleanValue();
        } else
        {
            boolean flag = jtk.a(context, jqg);
            b = Boolean.valueOf(flag);
            return flag;
        }
    }

    public final IBinder onBind(Intent intent)
    {
        return null;
    }

    public final void onCreate()
    {
        super.onCreate();
        jso jso1 = jrk.a(this).a();
        if (kbe.a)
        {
            jso1.b("Device AnalyticsService is starting up");
            return;
        } else
        {
            jso1.b("Local AnalyticsService is starting up");
            return;
        }
    }

    public final void onDestroy()
    {
        jso jso1 = jrk.a(this).a();
        if (kbe.a)
        {
            jso1.b("Device AnalyticsService is shutting down");
        } else
        {
            jso1.b("Local AnalyticsService is shutting down");
        }
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int j)
    {
        Object obj = jqf.a;
        obj;
        JVM INSTR monitorenter ;
        lpf lpf1 = jqf.b;
        if (lpf1 == null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        if (lpf1.a.isHeld())
        {
            lpf1.a();
        }
        obj;
        JVM INSTR monitorexit ;
_L1:
        obj = jrk.a(this);
        Object obj1 = ((jrk) (obj)).a();
        intent = intent.getAction();
        SecurityException securityexception;
        if (kbe.a)
        {
            ((jso) (obj1)).a("Device AnalyticsService called. startId, action", Integer.valueOf(j), intent);
        } else
        {
            ((jso) (obj1)).a("Local AnalyticsService called. startId, action", Integer.valueOf(j), intent);
        }
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(intent))
        {
            ((jrk) (obj)).c().a(new jqh(this, j, ((jrk) (obj)), ((jso) (obj1))));
        }
        return 2;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw obj1;
        }
        // Misplaced declaration of an exception variable
        catch (SecurityException securityexception) { }
          goto _L1
    }
}
