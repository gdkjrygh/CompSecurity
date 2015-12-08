// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;


// Referenced classes of package bolts:
//            Task

public class <init>
{

    final Task a;

    public Task a()
    {
        return a;
    }

    public boolean a(Exception exception)
    {
label0:
        {
            synchronized (Task.a(a))
            {
                if (!Task.b(a))
                {
                    break label0;
                }
            }
            return false;
        }
        Task.a(a, true);
        Task.a(a, exception);
        Task.a(a).notifyAll();
        Task.c(a);
        obj;
        JVM INSTR monitorexit ;
        return true;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean a(Object obj)
    {
label0:
        {
            synchronized (Task.a(a))
            {
                if (!Task.b(a))
                {
                    break label0;
                }
            }
            return false;
        }
        Task.a(a, true);
        Task.a(a, obj);
        Task.a(a).notifyAll();
        Task.c(a);
        obj1;
        JVM INSTR monitorexit ;
        return true;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public void b(Exception exception)
    {
        if (!a(exception))
        {
            throw new IllegalStateException("Cannot set the error on a completed task.");
        } else
        {
            return;
        }
    }

    public void b(Object obj)
    {
        if (!a(obj))
        {
            throw new IllegalStateException("Cannot set the result of a completed task.");
        } else
        {
            return;
        }
    }

    public boolean b()
    {
label0:
        {
            synchronized (Task.a(a))
            {
                if (!Task.b(a))
                {
                    break label0;
                }
            }
            return false;
        }
        Task.a(a, true);
        Task.b(a, true);
        Task.a(a).notifyAll();
        Task.c(a);
        obj;
        JVM INSTR monitorexit ;
        return true;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void c()
    {
        if (!b())
        {
            throw new IllegalStateException("Cannot cancel a completed task.");
        } else
        {
            return;
        }
    }

    private (Task task)
    {
        a = task;
        super();
    }

    a(Task task, a a1)
    {
        this(task);
    }
}
