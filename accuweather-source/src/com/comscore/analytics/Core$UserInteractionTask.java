// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.analytics;

import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.comscore.analytics:
//            Core

public class a extends TimerTask
{

    final Core a;

    public void run()
    {
label0:
        {
            synchronized (a)
            {
                if (Core.a(a))
                {
                    break label0;
                }
            }
            return;
        }
        if (a.Z != null)
        {
            a.Z.cancel();
            a.Z = null;
            a.n();
        }
        core;
        JVM INSTR monitorexit ;
        return;
        exception;
        core;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public (Core core)
    {
        a = core;
        super();
    }
}
