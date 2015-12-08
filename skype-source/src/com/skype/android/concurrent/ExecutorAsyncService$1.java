// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.skype.android.concurrent:
//            ExecutorAsyncService, a, AsyncCallback

final class d extends FutureTask
{

    final a a;
    final AsyncCallback b;
    final ExecutorAsyncService c;
    private AtomicBoolean d;

    public final boolean cancel(boolean flag)
    {
        d.set(true);
        a.f();
        return super.cancel(flag);
    }

    protected final void done()
    {
        try
        {
            if (!isCancelled())
            {
                a.b(get());
                b.done(a);
            }
            return;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            a.a(exception);
            b.done(a);
            return;
        }
    }

    public final boolean isCancelled()
    {
        return d.get();
    }

    _cls9(ExecutorAsyncService executorasyncservice, Callable callable, a a1, AsyncCallback asynccallback)
    {
        c = executorasyncservice;
        a = a1;
        b = asynccallback;
        super(callable);
        d = new AtomicBoolean(false);
    }
}
