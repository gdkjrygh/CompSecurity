// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.analytics;

import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.comscore.analytics:
//            Core, ApplicationState, SessionState

class ac extends TimerTask
{

    final ApplicationState a;
    final ApplicationState b;
    final SessionState c;
    final SessionState d;
    final Core e;

    ac(Core core, ApplicationState applicationstate, ApplicationState applicationstate1, SessionState sessionstate, SessionState sessionstate1)
    {
        e = core;
        a = applicationstate;
        b = applicationstate1;
        c = sessionstate;
        d = sessionstate1;
        super();
    }

    public void run()
    {
        boolean flag1 = true;
        Core core = e;
        core;
        JVM INSTR monitorenter ;
        if (e.j != null)
        {
            e.j.cancel();
            e.k = null;
            e.j = null;
        }
        if (a == b) goto _L2; else goto _L1
_L1:
        e.a(e.z);
        e.b(b);
        e.s();
        e.z = b;
        boolean flag = true;
_L7:
        if (c == d) goto _L4; else goto _L3
_L3:
        e.a(e.M);
        e.b(d);
        e.t();
        e.M = d;
_L5:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_178;
        }
        e.a(a, e.z);
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_201;
        }
        e.a(c, e.M);
        core;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        core;
        JVM INSTR monitorexit ;
        throw exception;
_L4:
        flag1 = false;
        if (true) goto _L5; else goto _L2
_L2:
        flag = false;
        if (true) goto _L7; else goto _L6
_L6:
    }
}
