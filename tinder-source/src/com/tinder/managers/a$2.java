// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import android.os.Process;
import com.tinder.b.a;
import com.tinder.model.SparksEvent;

// Referenced classes of package com.tinder.managers:
//            a

static final class b
    implements Runnable
{

    final SparksEvent a;
    final boolean b;

    public final void run()
    {
label0:
        {
            Process.setThreadPriority(10);
            com.tinder.managers.a.e();
            com.tinder.b.a.a(a);
            synchronized (com.tinder.managers.a.c())
            {
                if (!com.tinder.managers.a.c().booleanValue())
                {
                    break label0;
                }
            }
            return;
        }
        com.tinder.managers.a.a(Boolean.valueOf(true));
        boolean1;
        JVM INSTR monitorexit ;
        if (b || com.tinder.managers.a.f() >= 6 && com.tinder.managers.a.g())
        {
            com.tinder.managers.a.d();
            com.tinder.managers.a.h();
            return;
        }
        break MISSING_BLOCK_LABEL_78;
        exception;
        boolean1;
        JVM INSTR monitorexit ;
        throw exception;
        synchronized (com.tinder.managers.a.c())
        {
            com.tinder.managers.a.a(Boolean.valueOf(false));
        }
        (new StringBuilder("Event queue not full or not enough time passed. Event queue size=")).append(com.tinder.managers.a.i());
        return;
        exception1;
        boolean2;
        JVM INSTR monitorexit ;
        throw exception1;
    }

    vent(SparksEvent sparksevent, boolean flag)
    {
        a = sparksevent;
        b = flag;
        super();
    }
}
