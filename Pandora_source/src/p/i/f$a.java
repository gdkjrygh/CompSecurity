// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.i;


// Referenced classes of package p.i:
//            f

public class <init>
{

    final f a;

    public f a()
    {
        return a;
    }

    public boolean a(Exception exception)
    {
label0:
        {
            synchronized (f.a(a))
            {
                if (!f.b(a))
                {
                    break label0;
                }
            }
            return false;
        }
        f.a(a, true);
        f.a(a, exception);
        f.a(a).notifyAll();
        f.c(a);
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
            synchronized (f.a(a))
            {
                if (!f.b(a))
                {
                    break label0;
                }
            }
            return false;
        }
        f.a(a, true);
        f.a(a, obj);
        f.a(a).notifyAll();
        f.c(a);
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
            synchronized (f.a(a))
            {
                if (!f.b(a))
                {
                    break label0;
                }
            }
            return false;
        }
        f.a(a, true);
        f.b(a, true);
        f.a(a).notifyAll();
        f.c(a);
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

    private (f f1)
    {
        a = f1;
        super();
    }

    (f f1,  )
    {
        this(f1);
    }
}
