// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.shared.util.debug.b;

import com.google.common.util.concurrent.t;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.apps.gsa.shared.util.debug.b:
//            b

public final class a
    implements t
{

    private final t a;

    public static t a(t t1)
    {
        return t1;
    }

    public final void a(Runnable runnable, Executor executor)
    {
        a.a(runnable, executor);
    }

    public final boolean cancel(boolean flag)
    {
        return a.cancel(flag);
    }

    public final Object get()
    {
        if (!isDone())
        {
            b.a();
        }
        return a.get();
    }

    public final Object get(long l, TimeUnit timeunit)
    {
        b.a();
        return a.get(l, timeunit);
    }

    public final boolean isCancelled()
    {
        return a.isCancelled();
    }

    public final boolean isDone()
    {
        return a.isDone();
    }
}
