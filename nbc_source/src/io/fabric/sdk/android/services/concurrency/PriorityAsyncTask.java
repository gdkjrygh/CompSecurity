// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.concurrency;

import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

// Referenced classes of package io.fabric.sdk.android.services.concurrency:
//            AsyncTask, Dependency, PriorityProvider, Task, 
//            PriorityTask, Priority, PriorityFutureTask

public abstract class PriorityAsyncTask extends AsyncTask
    implements Dependency, PriorityProvider, Task, Comparable
{
    private static class ProxyExecutor
        implements Executor
    {

        private final Executor executor;
        private final PriorityAsyncTask task;

        public void execute(Runnable runnable)
        {
            executor.execute(new PriorityFutureTask(runnable, null, task));
        }

        public ProxyExecutor(Executor executor1, PriorityAsyncTask priorityasynctask)
        {
            executor = executor1;
            task = priorityasynctask;
        }
    }


    private final Dependency dep;
    private final PriorityProvider priority;
    private final Task task;

    public PriorityAsyncTask()
    {
        PriorityTask prioritytask = new PriorityTask();
        task = prioritytask;
        dep = prioritytask;
        priority = prioritytask;
    }

    public void addCompletionListener(Task.OnCompletionListener oncompletionlistener)
    {
        task.addCompletionListener(oncompletionlistener);
    }

    public void addDependency(Dependency dependency)
    {
        if (getStatus() != AsyncTask.Status.PENDING)
        {
            throw new IllegalStateException("Must not add Dependendency after task is running");
        } else
        {
            dep.addDependency(dependency);
            return;
        }
    }

    public boolean canProcess()
    {
        return task.canProcess();
    }

    public int compareTo(Object obj)
    {
        return Priority.compareTo(this, obj);
    }

    public final transient void executeOnExecutor(ExecutorService executorservice, Object aobj[])
    {
        super.executeOnExecutor(new ProxyExecutor(executorservice, this), aobj);
    }

    public Collection getDependencies()
    {
        return Collections.unmodifiableCollection(dep.getDependencies());
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
