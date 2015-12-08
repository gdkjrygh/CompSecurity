// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.b;


// Referenced classes of package com.android.slyce.a.b:
//            d, k, a

public class j
    implements d
{

    public static final a g = new k();
    static final boolean h;
    private a a;
    boolean e;
    boolean f;

    public j()
    {
    }

    public d a(a a1)
    {
        return b(a1);
    }

    protected void a()
    {
    }

    public j b(a a1)
    {
        this;
        JVM INSTR monitorenter ;
        if (!isDone())
        {
            a = a1;
        }
        this;
        JVM INSTR monitorexit ;
        return this;
        a1;
        this;
        JVM INSTR monitorexit ;
        throw a1;
    }

    public boolean b()
    {
        this;
        JVM INSTR monitorenter ;
        if (!e)
        {
            break MISSING_BLOCK_LABEL_13;
        }
        this;
        JVM INSTR monitorexit ;
        return false;
        if (!f)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        this;
        JVM INSTR monitorexit ;
        return true;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        a a1;
        f = true;
        a1 = a;
        a = null;
        this;
        JVM INSTR monitorexit ;
        if (a1 != null)
        {
            a1.b();
        }
        a();
        d();
        return true;
    }

    protected void d()
    {
    }

    protected void e()
    {
    }

    public boolean f()
    {
        this;
        JVM INSTR monitorenter ;
        if (!f)
        {
            break MISSING_BLOCK_LABEL_13;
        }
        this;
        JVM INSTR monitorexit ;
        return false;
        if (!e)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        if (!h)
        {
            throw new AssertionError();
        }
        break MISSING_BLOCK_LABEL_39;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        this;
        JVM INSTR monitorexit ;
        return true;
        e = true;
        a = null;
        this;
        JVM INSTR monitorexit ;
        e();
        d();
        return true;
    }

    public boolean isCancelled()
    {
        this;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (f || a != null && a.isCancelled())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean isDone()
    {
        return e;
    }

    static 
    {
        boolean flag;
        if (!com/android/slyce/a/b/j.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h = flag;
    }
}
