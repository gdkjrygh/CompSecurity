// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.d.a;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

// Referenced classes of package com.google.common.d.a:
//            s, d

public final class t extends FutureTask
    implements s
{

    private final d a;

    public t(Runnable runnable, Object obj)
    {
        super(runnable, obj);
        a = new d();
    }

    public t(Callable callable)
    {
        super(callable);
        a = new d();
    }

    public static t a(Runnable runnable, Object obj)
    {
        return new t(runnable, obj);
    }

    public static t a(Callable callable)
    {
        return new t(callable);
    }

    public void a(Runnable runnable, Executor executor)
    {
        a.a(runnable, executor);
    }

    protected void done()
    {
        a.a();
    }
}
