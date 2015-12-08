// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.concurrency;

import java.util.Collection;
import java.util.concurrent.ExecutorService;

// Referenced classes of package io.fabric.sdk.android.services.concurrency:
//            AsyncTask, Dependency, PriorityProvider, Task, 
//            PriorityTask, Priority

public abstract class PriorityAsyncTask extends AsyncTask
    implements Dependency, PriorityProvider, Task
{

    private final PriorityTask a = new PriorityTask();

    public PriorityAsyncTask()
    {
    }

    public void a(Task task)
    {
        if (i_() != AsyncTask.Status.a)
        {
            throw new IllegalStateException("Must not add Dependency after task is running");
        } else
        {
            ((Dependency)(PriorityProvider)g()).c(task);
            return;
        }
    }

    public void a(Throwable throwable)
    {
        ((Task)(PriorityProvider)g()).a(throwable);
    }

    public final transient void a(ExecutorService executorservice, Object aobj[])
    {
        super.a(new ProxyExecutor(executorservice, this), aobj);
    }

    public Priority b()
    {
        return ((PriorityProvider)g()).b();
    }

    public void b(boolean flag)
    {
        ((Task)(PriorityProvider)g()).b(flag);
    }

    public Collection c()
    {
        return ((Dependency)(PriorityProvider)g()).c();
    }

    public void c(Object obj)
    {
        a((Task)obj);
    }

    public int compareTo(Object obj)
    {
        return Priority.a(this, obj);
    }

    public boolean d()
    {
        return ((Dependency)(PriorityProvider)g()).d();
    }

    public boolean f()
    {
        return ((Task)(PriorityProvider)g()).f();
    }

    public Dependency g()
    {
        return a;
    }

    private class ProxyExecutor
        implements Executor
    {

        private final Executor a;
        private final PriorityAsyncTask b;

        static PriorityAsyncTask a(ProxyExecutor proxyexecutor)
        {
            return proxyexecutor.b;
        }

        public void execute(Runnable runnable)
        {
            a.execute(new PriorityFutureTask(runnable, null) {

                final ProxyExecutor a;

                public Dependency a()
                {
                    return ProxyExecutor.a(a);
                }

                
                {
                    a = ProxyExecutor.this;
                    super(runnable, obj);
                }
            });
        }

        public ProxyExecutor(Executor executor, PriorityAsyncTask priorityasynctask)
        {
            a = executor;
            b = priorityasynctask;
        }
    }

}
