// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;


// Referenced classes of package bolts:
//            j

public final class q
{

    final j a;

    private q(j j1)
    {
        a = j1;
        super();
    }

    q(j j1, byte byte0)
    {
        this(j1);
    }

    private boolean b(Exception exception)
    {
label0:
        {
            synchronized (j.a(a))
            {
                if (!j.b(a))
                {
                    break label0;
                }
            }
            return false;
        }
        j.c(a);
        j.a(a, exception);
        j.a(a).notifyAll();
        j.e(a);
        obj;
        JVM INSTR monitorexit ;
        return true;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private boolean b(Object obj)
    {
label0:
        {
            synchronized (j.a(a))
            {
                if (!j.b(a))
                {
                    break label0;
                }
            }
            return false;
        }
        j.c(a);
        j.a(a, obj);
        j.a(a).notifyAll();
        j.e(a);
        obj1;
        JVM INSTR monitorexit ;
        return true;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    private boolean c()
    {
label0:
        {
            synchronized (j.a(a))
            {
                if (!j.b(a))
                {
                    break label0;
                }
            }
            return false;
        }
        j.c(a);
        j.d(a);
        j.a(a).notifyAll();
        j.e(a);
        obj;
        JVM INSTR monitorexit ;
        return true;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final j a()
    {
        return a;
    }

    public final void a(Exception exception)
    {
        if (!b(exception))
        {
            throw new IllegalStateException("Cannot set the error on a completed task.");
        } else
        {
            return;
        }
    }

    public final void a(Object obj)
    {
        if (!b(obj))
        {
            throw new IllegalStateException("Cannot set the result of a completed task.");
        } else
        {
            return;
        }
    }

    public final void b()
    {
        if (!c())
        {
            throw new IllegalStateException("Cannot cancel a completed task.");
        } else
        {
            return;
        }
    }
}
