// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.ResultReceiver;
import android.support.v4.content.LocalBroadcastManager;
import com.fitbit.FitBitApplication;
import com.fitbit.galileo.service.GalileoServicesStateListener;
import com.fitbit.mixpanel.f;
import com.fitbit.util.p;
import com.fitbit.util.service.b;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.fitbit.data.bl:
//            SyncService, LogoutTaskState, dg, an

public class ae extends b
{

    static final String a = "com.fitbit.data.bl.LogoutTask";
    private static final Object b = new Object();
    private GalileoServicesStateListener c;
    private AtomicBoolean d;
    private BroadcastReceiver e;

    public ae()
    {
        c = com.fitbit.galileo.service.b.b(FitBitApplication.a());
        d = new AtomicBoolean(false);
        e = new BroadcastReceiver() {

            final ae a;

            public void onReceive(Context context, Intent intent)
            {
                if ("com.fitbit.galileo.GALILEO_SYNC_SERVICE_STATE_CHANGED".equals(intent.getAction()) && ae.a(a).c() == com.fitbit.galileo.service.GalileoServicesStateListener.GalileoState.a)
                {
                    synchronized (ae.c())
                    {
                        com.fitbit.data.bl.ae.b(a);
                        ae.c().notifyAll();
                    }
                    return;
                } else
                {
                    return;
                }
                intent;
                context;
                JVM INSTR monitorexit ;
                throw intent;
            }

            
            {
                a = ae.this;
                super();
            }
        };
    }

    public static Intent a(Context context, boolean flag)
    {
        context = new Intent(context, com/fitbit/data/bl/SyncService);
        context.setAction("com.fitbit.data.bl.LogoutTask");
        context.putExtra("force", flag);
        return context;
    }

    static GalileoServicesStateListener a(ae ae1)
    {
        return ae1.c;
    }

    static void b(ae ae1)
    {
        ae1.f();
    }

    static Object c()
    {
        return b;
    }

    private void d()
    {
        if (p.l())
        {
            (new com.fitbit.pedometer.service.a.a()).a(true);
        }
    }

    private void e()
    {
        if (d.compareAndSet(false, true))
        {
            LocalBroadcastManager.getInstance(FitBitApplication.a()).registerReceiver(e, new IntentFilter("com.fitbit.galileo.GALILEO_SYNC_SERVICE_STATE_CHANGED"));
        }
    }

    private void f()
    {
        if (d.compareAndSet(true, false))
        {
            LocalBroadcastManager.getInstance(FitBitApplication.a()).unregisterReceiver(e);
        }
    }

    protected void a(SyncService syncservice, Intent intent, ResultReceiver resultreceiver)
        throws Exception
    {
        if (LogoutTaskState.a() == com.fitbit.data.bl.LogoutTaskState.State.b || LogoutTaskState.a() == LogoutTaskState.State.d)
        {
            return;
        }
        LogoutTaskState.a(com.fitbit.data.bl.LogoutTaskState.State.b);
        if (c.c() == com.fitbit.galileo.service.GalileoServicesStateListener.GalileoState.a) goto _L2; else goto _L1
_L1:
        syncservice = ((SyncService) (b));
        syncservice;
        JVM INSTR monitorenter ;
        e();
        if (c.c() != com.fitbit.galileo.service.GalileoServicesStateListener.GalileoState.a) goto _L4; else goto _L3
_L3:
        f();
_L2:
        boolean flag1;
        boolean flag = intent.getBooleanExtra("force", false);
        syncservice = dg.d();
        flag1 = syncservice.f();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        syncservice.c(true);
        d();
        syncservice.a(this, false);
        syncservice.a(true, true, this);
        syncservice.c(flag1);
        com.fitbit.mixpanel.f.c("Auth: Logout");
        an.a().d();
        LogoutTaskState.a(LogoutTaskState.State.d);
        return;
_L4:
        b.wait();
          goto _L2
        resultreceiver;
        resultreceiver.printStackTrace();
          goto _L2
        intent;
        syncservice;
        JVM INSTR monitorexit ;
        try
        {
            throw intent;
        }
        // Misplaced declaration of an exception variable
        catch (SyncService syncservice)
        {
            LogoutTaskState.a(LogoutTaskState.State.c);
        }
        LogoutTaskState.a(syncservice);
        throw syncservice;
        intent;
        syncservice.c(flag1);
        throw intent;
    }

    public boolean b()
    {
        return an.a().j();
    }

}
