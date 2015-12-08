// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.u;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.measurement.internal:
//            ab, w, aa

private final class setName extends Thread
{

    final BlockingQueue a = new LinkedBlockingQueue();
    final ab b;

    final void a(InterruptedException interruptedexception)
    {
        b.l().b.((new StringBuilder()).append(getName()).append(" was interrupted").toString(), interruptedexception);
    }

    public final void run()
    {
        boolean flag = false;
_L3:
        if (b.c && flag)
        {
            break; /* Loop/switch isn't completed */
        }
_L1:
        FutureTask futuretask = (FutureTask)a.poll(0L, TimeUnit.MICROSECONDS);
        if (futuretask == null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        futuretask.run();
          goto _L1
        InterruptedException interruptedexception;
        interruptedexception;
        a(interruptedexception);
        boolean flag1 = b.b.a();
        flag = flag1;
        continue; /* Loop/switch isn't completed */
        interruptedexception;
        a(interruptedexception);
        if (true) goto _L3; else goto _L2
_L2:
        b.l().f.("Scheduler thread exiting");
        return;
    }

    public (ab ab1, String s)
    {
        b = ab1;
        super();
        u.a(s);
        setName(s);
    }
}
