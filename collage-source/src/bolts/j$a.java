// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;


// Referenced classes of package bolts:
//            j

public class <init>
{

    final j a;

    public j a()
    {
        return a;
    }

    public boolean a(Exception exception)
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
        j.a(a, true);
        j.a(a, exception);
        j.a(a).notifyAll();
        j.c(a);
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
            synchronized (j.a(a))
            {
                if (!j.b(a))
                {
                    break label0;
                }
            }
            return false;
        }
        j.a(a, true);
        j.a(a, obj);
        j.a(a).notifyAll();
        j.c(a);
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
            synchronized (j.a(a))
            {
                if (!j.b(a))
                {
                    break label0;
                }
            }
            return false;
        }
        j.a(a, true);
        j.b(a, true);
        j.a(a).notifyAll();
        j.c(a);
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

    private ._cls1(j j1)
    {
        a = j1;
        super();
    }

    ._cls1(j j1, ._cls1 _pcls1)
    {
        this(j1);
    }
}
