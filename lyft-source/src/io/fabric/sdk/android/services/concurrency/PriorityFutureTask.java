// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.concurrency;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

// Referenced classes of package io.fabric.sdk.android.services.concurrency:
//            Dependency, PriorityProvider, Task, PriorityTask, 
//            Priority

public class PriorityFutureTask extends FutureTask
    implements Dependency, PriorityProvider, Task
{

    final Object b;

    public PriorityFutureTask(Runnable runnable, Object obj)
    {
        super(runnable, obj);
        b = a(runnable);
    }

    public PriorityFutureTask(Callable callable)
    {
        super(callable);
        b = a(callable);
    }

    public Dependency a()
    {
        return (Dependency)b;
    }

    protected Dependency a(Object obj)
    {
        if (PriorityTask.a(obj))
        {
            return (Dependency)obj;
        } else
        {
            return new PriorityTask();
        }
    }

    public void a(Task task)
    {
        ((Dependency)(PriorityProvider)a()).c(task);
    }

    public void a(Throwable throwable)
    {
        ((Task)(PriorityProvider)a()).a(throwable);
    }

    public Priority b()
    {
        return ((PriorityProvider)a()).b();
    }

    public void b(boolean flag)
    {
        ((Task)(PriorityProvider)a()).b(flag);
    }

    public Collection c()
    {
        return ((Dependency)(PriorityProvider)a()).c();
    }

    public void c(Object obj)
    {
        a((Task)obj);
    }

    public int compareTo(Object obj)
    {
        return ((PriorityProvider)a()).compareTo(obj);
    }

    public boolean d()
    {
        return ((Dependency)(PriorityProvider)a()).d();
    }

    public boolean f()
    {
        return ((Task)(PriorityProvider)a()).f();
    }
}
