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
    implements Dependency, PriorityProvider, Task, Comparable
{

    private Dependency dep;
    private PriorityProvider priority;
    private Task task;

    public PriorityFutureTask(Runnable runnable, Object obj)
    {
        super(runnable, obj);
        checkAndInit(runnable);
    }

    public PriorityFutureTask(Runnable runnable, Object obj, Dependency dependency)
    {
        super(runnable, obj);
        init(dependency);
    }

    public PriorityFutureTask(Callable callable)
    {
        super(callable);
        checkAndInit(callable);
    }

    public PriorityFutureTask(Callable callable, Dependency dependency)
    {
        super(callable);
        init(dependency);
    }

    private void checkAndInit(Object obj)
    {
        if ((obj instanceof Task) && (obj instanceof Dependency) && (obj instanceof PriorityProvider))
        {
            task = (Task)obj;
            dep = (Dependency)obj;
            priority = (PriorityProvider)obj;
            return;
        } else
        {
            init(new PriorityTask());
            return;
        }
    }

    private void init(Dependency dependency)
    {
        task = (Task)dependency;
        dep = dependency;
        priority = (PriorityProvider)dependency;
    }

    public void addCompletionListener(Task.OnCompletionListener oncompletionlistener)
    {
        task.addCompletionListener(oncompletionlistener);
    }

    public void addDependency(Dependency dependency)
    {
        dep.addDependency(dependency);
    }

    public boolean canProcess()
    {
        return task.canProcess();
    }

    public int compareTo(Object obj)
    {
        return Priority.compareTo(this, obj);
    }

    public Collection getDependencies()
    {
        return dep.getDependencies();
    }

    public Throwable getError()
    {
        return task.getError();
    }

    public Priority getPriority()
    {
        return priority.getPriority();
    }

    public boolean isFinished()
    {
        return task.isFinished();
    }

    public void notifyFinished()
    {
        task.notifyFinished();
    }

    public void setError(Throwable throwable)
    {
        task.setError(throwable);
    }
}
