// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aj;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

// Referenced classes of package com.google.android.m4b.maps.aj:
//            f, d

public final class g extends FutureTask
    implements f
{

    private final d a;

    private g(Runnable runnable, Object obj)
    {
        super(runnable, obj);
        a = new d();
    }

    private g(Callable callable)
    {
        super(callable);
        a = new d();
    }

    public static g a(Runnable runnable, Object obj)
    {
        return new g(runnable, obj);
    }

    public static g a(Callable callable)
    {
        return new g(callable);
    }

    public final void a(Runnable runnable, Executor executor)
    {
        a.a(runnable, executor);
    }

    protected final void done()
    {
        a.a();
    }
}
