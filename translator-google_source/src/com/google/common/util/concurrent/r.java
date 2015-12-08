// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.p;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.google.common.util.concurrent:
//            t

abstract class r
    implements t
{

    private static final Logger a = Logger.getLogger(com/google/common/util/concurrent/r.getName());

    r()
    {
    }

    public final void a(Runnable runnable, Executor executor)
    {
        p.a(runnable, "Runnable was null.");
        p.a(executor, "Executor was null.");
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

    public boolean cancel(boolean flag)
    {
        return false;
    }

    public abstract Object get();

    public Object get(long l, TimeUnit timeunit)
    {
        p.a(timeunit);
        return get();
    }

    public boolean isCancelled()
    {
        return false;
    }

    public boolean isDone()
    {
        return true;
    }

}
