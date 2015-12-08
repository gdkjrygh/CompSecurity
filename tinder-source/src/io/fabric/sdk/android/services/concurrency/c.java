// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.concurrency;

import java.util.Collection;
import java.util.concurrent.Executor;

// Referenced classes of package io.fabric.sdk.android.services.concurrency:
//            AsyncTask, a, f, i, 
//            g, Priority, e

public abstract class c extends AsyncTask
    implements io.fabric.sdk.android.services.concurrency.a, f, i
{
    private static final class a
        implements Executor
    {

        private final Executor a;
        private final c b;

        static c a(a a1)
        {
            return a1.b;
        }

        public final void execute(Runnable runnable)
        {
            a.execute(new e(this, runnable) {

                final a a;

                public final io.fabric.sdk.android.services.concurrency.a b()
                {
                    return a.a(a);
                }

            
            {
                a = a1;
                super(runnable, null);
            }
            });
        }

        public a(Executor executor, c c1)
        {
            a = executor;
            b = c1;
        }
    }


    private final g a = new g();

    public c()
    {
    }

    public Priority a()
    {
        return ((f)a).a();
    }

    public final void a(i j)
    {
        if (super.f != AsyncTask.Status.a)
        {
            throw new IllegalStateException("Must not add Dependency after task is running");
        } else
        {
            ((io.fabric.sdk.android.services.concurrency.a)(f)a).a(j);
            return;
        }
    }

    public final volatile void a(Object obj)
    {
        a((i)obj);
    }

    public final void a(Throwable throwable)
    {
        ((i)(f)a).a(throwable);
    }

    public final void a(boolean flag)
    {
        ((i)(f)a).a(flag);
    }

    public int compareTo(Object obj)
    {
        return Priority.a(this, obj);
    }

    public final Collection f()
    {
        return ((io.fabric.sdk.android.services.concurrency.a)(f)a).f();
    }

    public final boolean g()
    {
        return ((io.fabric.sdk.android.services.concurrency.a)(f)a).g();
    }

    public final boolean h()
    {
        return ((i)(f)a).h();
    }
}
