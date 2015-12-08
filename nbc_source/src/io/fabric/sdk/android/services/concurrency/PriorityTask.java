// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.concurrency;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package io.fabric.sdk.android.services.concurrency:
//            Dependency, PriorityProvider, Task, Priority

public class PriorityTask
    implements Dependency, PriorityProvider, Task, Comparable
{

    private final List dependencies = new ArrayList();
    private final AtomicBoolean hasRun = new AtomicBoolean(false);
    private final List onCompletionListeners = new ArrayList();
    private final AtomicReference throwable = new AtomicReference(null);

    public PriorityTask()
    {
    }

    public void addCompletionListener(Task.OnCompletionListener oncompletionlistener)
    {
        this;
        JVM INSTR monitorenter ;
        onCompletionListeners.add(oncompletionlistener);
        this;
        JVM INSTR monitorexit ;
        return;
        oncompletionlistener;
        throw oncompletionlistener;
    }

    public void addDependency(Dependency dependency)
    {
        this;
        JVM INSTR monitorenter ;
        dependencies.add(dependency);
        this;
        JVM INSTR monitorexit ;
        return;
        dependency;
        throw dependency;
    }

    public boolean canProcess()
    {
        this;
        JVM INSTR monitorenter ;
        if (getDependencies() == null) goto _L2; else goto _L1
_L1:
        Iterator iterator = getDependencies().iterator();
_L5:
        if (!iterator.hasNext()) goto _L2; else goto _L3
_L3:
        Dependency dependency = (Dependency)iterator.next();
        if (!(dependency instanceof Task)) goto _L5; else goto _L4
_L4:
        boolean flag = ((Task)dependency).isFinished();
        if (flag) goto _L5; else goto _L6
_L6:
        flag = false;
_L8:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = true;
        if (true) goto _L8; else goto _L7
_L7:
        Exception exception;
        exception;
        throw exception;
    }

    public final int compareTo(Object obj)
    {
        return Priority.compareTo(this, obj);
    }

    public Collection getDependencies()
    {
        this;
        JVM INSTR monitorenter ;
        List list = dependencies;
        this;
        JVM INSTR monitorexit ;
        return list;
        Exception exception;
        exception;
        throw exception;
    }

    public Throwable getError()
    {
        return (Throwable)throwable.get();
    }

    public Priority getPriority()
    {
        return Priority.NORMAL;
    }

    public boolean isFinished()
    {
        return hasRun.get();
    }

    public void notifyFinished()
    {
        this;
        JVM INSTR monitorenter ;
        hasRun.set(true);
        for (Iterator iterator = onCompletionListeners.iterator(); iterator.hasNext(); ((Task.OnCompletionListener)iterator.next()).onComplete(this)) { }
        break MISSING_BLOCK_LABEL_52;
        Exception exception;
        exception;
        throw exception;
        this;
        JVM INSTR monitorexit ;
    }

    public void setError(Throwable throwable1)
    {
        throwable.set(throwable1);
    }
}
