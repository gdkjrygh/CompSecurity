// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.google.common.util.concurrent:
//            c

public final class b
{

    static final Logger a = Logger.getLogger(com/google/common/util/concurrent/b.getName());
    c b;
    boolean c;

    public b()
    {
    }

    static void a(Runnable runnable, Executor executor)
    {
        try
        {
            executor.execute(runnable);
            return;
        }
        catch (RuntimeException runtimeexception)
        {
            a.log(Level.SEVERE, (new StringBuilder("RuntimeException while executing runnable ")).append(runnable).append(" with executor ").append(executor).toString(), runtimeexception);
        }
    }

    public final void a()
    {
        c c1 = null;
        this;
        JVM INSTR monitorenter ;
        if (!c)
        {
            break MISSING_BLOCK_LABEL_14;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        c c2;
        c = true;
        c2 = b;
        b = null;
        this;
        JVM INSTR monitorexit ;
          goto _L1
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
_L1:
        Exception exception;
        c c3;
        do
        {
            c3 = c1;
            if (c2 == null)
            {
                break;
            }
            c3 = c2.c;
            c2.c = c1;
            c1 = c2;
            c2 = c3;
        } while (true);
        for (; c3 != null; c3 = c3.c)
        {
            a(c3.a, c3.b);
        }

        return;
    }

}
