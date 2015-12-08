// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction.restrictions;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.support.v4.content.LocalBroadcastManager;
import com.fitbit.ApplicationForegroundController;
import com.fitbit.FitBitApplication;
import com.fitbit.e.a;
import com.fitbit.serverinteraction.ServerGateway;

// Referenced classes of package com.fitbit.serverinteraction.restrictions:
//            RestrictionsController

public class b
{

    private static final String a = "RestrictionsUpdater";
    private static final long b = 0x1d4c0L;
    private static b c = null;
    private final ApplicationForegroundController d = ApplicationForegroundController.a();
    private final HandlerThread e = new HandlerThread("com.fitbit.RestrictionsUpdater");
    private final Handler f;
    private final Runnable g = new Runnable() {

        final b a;

        public void run()
        {
            if (com.fitbit.serverinteraction.restrictions.b.a(a).b())
            {
                ServerGateway.a().b().b();
            }
            if (com.fitbit.serverinteraction.restrictions.b.a(a).b())
            {
                a.a(true);
            }
_L2:
            return;
            Object obj;
            obj;
            com.fitbit.e.a.a("RestrictionsUpdater", ((Exception) (obj)).toString(), new Object[0]);
            if (!com.fitbit.serverinteraction.restrictions.b.a(a).b()) goto _L2; else goto _L1
_L1:
            a.a(true);
            return;
            obj;
            if (com.fitbit.serverinteraction.restrictions.b.a(a).b())
            {
                a.a(true);
            }
            throw obj;
        }

            
            {
                a = b.this;
                super();
            }
    };
    private BroadcastReceiver h;

    private b()
    {
        h = new BroadcastReceiver() {

            final b a;

            public void onReceive(Context context, Intent intent)
            {
                context = intent.getAction();
                if ("com.fitbit.ApplicationForegroundController.APP_PROBABLY_SWITCHED_TO_FOREGROUND".equals(context))
                {
                    a.a(false);
                } else
                if ("com.fitbit.ApplicationForegroundController.APP_PROBABLY_SWITCHED_TO_BACKGROUND".equals(context))
                {
                    b.b(a);
                    return;
                }
            }

            
            {
                a = b.this;
                super();
            }
        };
        e.start();
        f = new Handler(e.getLooper());
        LocalBroadcastManager localbroadcastmanager = LocalBroadcastManager.getInstance(FitBitApplication.a());
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.fitbit.ApplicationForegroundController.APP_PROBABLY_SWITCHED_TO_FOREGROUND");
        localbroadcastmanager.registerReceiver(h, intentfilter);
    }

    static ApplicationForegroundController a(b b1)
    {
        return b1.d;
    }

    public static b a()
    {
        com/fitbit/serverinteraction/restrictions/b;
        JVM INSTR monitorenter ;
        b b1;
        if (c == null)
        {
            c = new b();
        }
        b1 = c;
        com/fitbit/serverinteraction/restrictions/b;
        JVM INSTR monitorexit ;
        return b1;
        Exception exception;
        exception;
        throw exception;
    }

    private void b()
    {
        this;
        JVM INSTR monitorenter ;
        f.removeCallbacks(g);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    static void b(b b1)
    {
        b1.b();
    }

    public void a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        f.removeCallbacks(g);
        if (!flag) goto _L2; else goto _L1
_L1:
        f.postDelayed(g, 0x1d4c0L);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        f.post(g);
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

}
