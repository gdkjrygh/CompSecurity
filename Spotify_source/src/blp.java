// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;

public final class blp extends Service
{

    private static Boolean b;
    private final Handler a = new Handler();

    public blp()
    {
    }

    static Handler a(blp blp1)
    {
        return blp1.a;
    }

    public static boolean a(Context context)
    {
        btl.a(context);
        if (b != null)
        {
            return b.booleanValue();
        } else
        {
            boolean flag = bmz.a(context, blp);
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
        bnf.a(this).a().b("Local AnalyticsService is starting up");
    }

    public final void onDestroy()
    {
        bnf.a(this).a().b("Local AnalyticsService is shutting down");
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int j)
    {
        Object obj = blo.a;
        obj;
        JVM INSTR monitorenter ;
        con con1 = blo.b;
        if (con1 == null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        if (con1.a.isHeld())
        {
            con1.b();
        }
        obj;
        JVM INSTR monitorexit ;
_L2:
        obj = bnf.a(this);
        bmp bmp1 = ((bnf) (obj)).a();
        intent = intent.getAction();
        bmp1.a("Local AnalyticsService called. startId, action", Integer.valueOf(j), intent);
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(intent))
        {
            ((bnf) (obj)).c().a(new bnx(j, bmp1) {

                final int a;
                final bmp b;
                final blp c;

                public final void a()
                {
                    blp.a(c).post(new Runnable(this) {

                        private _cls1 a;

                        public final void run()
                        {
                            if (a.c.stopSelfResult(a.a))
                            {
                                a.b.b("Local AnalyticsService processed last dispatch request");
                            }
                        }

            
            {
                a = _pcls1;
                super();
            }
                    });
                }

            
            {
                c = blp.this;
                a = i;
                b = bmp1;
                super();
            }
            });
        }
        return 2;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        catch (SecurityException securityexception) { }
        if (true) goto _L2; else goto _L1
_L1:
    }
}
