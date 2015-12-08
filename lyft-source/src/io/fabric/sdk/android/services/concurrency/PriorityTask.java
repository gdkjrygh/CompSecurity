// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.concurrency;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package io.fabric.sdk.android.services.concurrency:
//            Dependency, PriorityProvider, Task, Priority

public class PriorityTask
    implements Dependency, PriorityProvider, Task
{

    private final List a = new ArrayList();
    private final AtomicBoolean b = new AtomicBoolean(false);
    private final AtomicReference c = new AtomicReference(null);

    public PriorityTask()
    {
    }

    public static boolean a(Object obj)
    {
        Dependency dependency;
        Task task;
        try
        {
            dependency = (Dependency)obj;
            task = (Task)obj;
            obj = (PriorityProvider)obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        return dependency != null && task != null && obj != null;
    }

    public void a(Task task)
    {
        this;
        JVM INSTR monitorenter ;
        a.add(task);
        this;
        JVM INSTR monitorexit ;
        return;
        task;
        throw task;
    }

    public void a(Throwable throwable)
    {
        c.set(throwable);
    }

    public Priority b()
    {
        return Priority.b;
    }

    public void b(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        b.set(flag);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public Collection c()
    {
        this;
        JVM INSTR monitorenter ;
        Collection collection = Collections.unmodifiableCollection(a);
        this;
        JVM INSTR monitorexit ;
        return collection;
        Exception exception;
        exception;
        throw exception;
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
        for (Iterator iterator = c().iterator(); iterator.hasNext();)
        {
            if (!((Task)iterator.next()).f())
            {
                return false;
            }
        }

        return true;
    }

    public boolean f()
    {
        return b.get();
    }
}
