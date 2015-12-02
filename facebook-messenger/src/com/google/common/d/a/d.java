// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.d.a;

import com.google.common.a.hq;
import com.google.common.base.Preconditions;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

// Referenced classes of package com.google.common.d.a:
//            e, f

public final class d
{

    private static final Logger a = Logger.getLogger(com/google/common/d/a/d.getName());
    private static f b;
    private final Queue c = hq.b();
    private boolean d;

    public d()
    {
        d = false;
    }

    public static void a(f f)
    {
        b = f;
    }

    static f b()
    {
        return b;
    }

    static Logger c()
    {
        return a;
    }

    public void a()
    {
label0:
        {
            synchronized (c)
            {
                if (!d)
                {
                    break label0;
                }
            }
            return;
        }
        d = true;
        queue;
        JVM INSTR monitorexit ;
        for (; !c.isEmpty(); ((e)c.poll()).a()) { }
        break MISSING_BLOCK_LABEL_59;
        exception;
        queue;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(Runnable runnable, Executor executor)
    {
        boolean flag;
        Preconditions.checkNotNull(runnable, "Runnable was null.");
        Preconditions.checkNotNull(executor, "Executor was null.");
        flag = false;
        Queue queue = c;
        queue;
        JVM INSTR monitorenter ;
        if (d)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        c.add(new e(runnable, executor));
_L2:
        if (flag)
        {
            (new e(runnable, executor)).a();
        }
        return;
        flag = true;
        if (true) goto _L2; else goto _L1
_L1:
        runnable;
        queue;
        JVM INSTR monitorexit ;
        throw runnable;
    }

}
