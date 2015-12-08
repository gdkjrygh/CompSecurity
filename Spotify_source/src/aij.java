// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.IntentFilter;
import com.comscore.analytics.ApplicationState;
import com.comscore.analytics.SessionState;
import com.comscore.applications.EventType;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

final class aij extends TimerTask
{

    private ApplicationState a;
    private ApplicationState b;
    private SessionState c;
    private SessionState d;
    private aif e;

    aij(aif aif1, ApplicationState applicationstate, ApplicationState applicationstate1, SessionState sessionstate, SessionState sessionstate1)
    {
        e = aif1;
        a = applicationstate;
        b = applicationstate1;
        c = sessionstate;
        d = sessionstate1;
        super();
    }

    public final void run()
    {
        boolean flag = false;
        aif aif1 = e;
        aif1;
        JVM INSTR monitorenter ;
        if (e.h != null)
        {
            e.h.cancel();
            e.i = null;
            e.h = null;
        }
        if (a == b) goto _L2; else goto _L1
_L1:
        Object obj;
        ApplicationState applicationstate;
        obj = e;
        applicationstate = e.s;
        ajn.a(obj, (new StringBuilder("Leaving application state: ")).append(applicationstate).toString());
        aiu.a[applicationstate.ordinal()];
        JVM INSTR tableswitch 1 3: default 467
    //                   1 332
    //                   2 385
    //                   3 392;
           goto _L3 _L4 _L5 _L6
_L3:
        obj = e;
        applicationstate = b;
        if (!((aif) (obj)).N) goto _L8; else goto _L7
_L7:
        ajn.a(obj, (new StringBuilder("Entering application state: ")).append(applicationstate).toString());
        aiu.a[applicationstate.ordinal()];
        JVM INSTR tableswitch 1 3: default 470
    //                   1 399
    //                   2 438
    //                   3 452;
           goto _L9 _L10 _L11 _L12
_L9:
        break; /* Loop/switch isn't completed */
_L12:
        break MISSING_BLOCK_LABEL_452;
_L8:
        e.f();
        e.s = b;
        flag = true;
_L2:
        if (c != d)
        {
            e.a(e.y);
            e.b(d);
            e.g();
            e.y = d;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_329;
        }
        obj = e;
        ApplicationState applicationstate1 = e.s;
        if (((aif) (obj)).N && applicationstate1 != ApplicationState.a && ((aif) (obj)).r && !((aif) (obj)).k)
        {
            ((aif) (obj)).a(EventType.a, ((aif) (obj)).E, false);
        }
        aif1;
        JVM INSTR monitorexit ;
        return;
_L4:
        ((aif) (obj)).g.a();
        ((aif) (obj)).c.a(3000);
        ((aif) (obj)).C.registerReceiver(((aif) (obj)).g, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        ((aif) (obj)).d.a();
          goto _L3
        obj;
        aif1;
        JVM INSTR monitorexit ;
        throw obj;
_L5:
        ((aif) (obj)).r();
          goto _L3
_L6:
        ((aif) (obj)).r();
          goto _L3
_L10:
        ((aif) (obj)).g.b();
        ((aif) (obj)).c.a();
        ((aif) (obj)).d.c();
        ((aif) (obj)).C.unregisterReceiver(((aif) (obj)).g);
        ((aif) (obj)).r();
          goto _L8
_L11:
        if (((aif) (obj)).j) goto _L8; else goto _L13
_L13:
        ((aif) (obj)).q();
          goto _L8
        ((aif) (obj)).q();
        ((aif) (obj)).v.getAndIncrement();
          goto _L8
    }
}
