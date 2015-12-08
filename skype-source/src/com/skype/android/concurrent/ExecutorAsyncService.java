// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.skype.android.concurrent:
//            AsyncService, a, AsyncCallback

public class ExecutorAsyncService
    implements AsyncService
{

    private ExecutorService a;

    public ExecutorAsyncService(ExecutorService executorservice)
    {
        if (executorservice == null)
        {
            throw new IllegalArgumentException("service cannot be null");
        } else
        {
            a = executorservice;
            return;
        }
    }

    private FutureTask b(Callable callable, Object obj, AsyncCallback asynccallback)
    {
        a a1 = new a();
        a1.a(obj);
        return new FutureTask(callable, a1, asynccallback) {

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

            
            {
                c = ExecutorAsyncService.this;
                a = a1;
                b = asynccallback;
                super(callable);
                d = new AtomicBoolean(false);
            }
        };
    }

    protected AsyncCallback a(AsyncCallback asynccallback)
    {
        return asynccallback;
    }

    public final Future a(Runnable runnable)
    {
        return a.submit(runnable);
    }

    public Future a(Callable callable, AsyncCallback asynccallback)
    {
        callable = b(callable, null, a(asynccallback));
        a.submit(callable);
        return callable;
    }

    public Future a(Callable callable, Object obj, AsyncCallback asynccallback)
    {
        callable = b(callable, obj, a(asynccallback));
        a.submit(callable);
        return callable;
    }
}
