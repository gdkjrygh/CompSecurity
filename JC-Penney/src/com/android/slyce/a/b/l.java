// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.b;

import com.android.slyce.a.q;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

// Referenced classes of package com.android.slyce.a.b:
//            j, e, g, f, 
//            d, m, a

public class l extends j
    implements e
{

    q d;
    Exception i;
    Object j;
    boolean k;
    g l;

    public l()
    {
    }

    private boolean a(boolean flag)
    {
        if (!super.b())
        {
            return false;
        }
        this;
        JVM INSTR monitorenter ;
        g g1;
        i = new CancellationException();
        c();
        g1 = l();
        k = flag;
        this;
        JVM INSTR monitorexit ;
        c(g1);
        return true;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void c(g g1)
    {
        if (g1 != null && !k)
        {
            g1.a(i, j);
        }
    }

    private Object k()
    {
        if (i != null)
        {
            throw new ExecutionException(i);
        } else
        {
            return j;
        }
    }

    private g l()
    {
        g g1 = l;
        l = null;
        return g1;
    }

    public d a(a a1)
    {
        return c(a1);
    }

    public f a(g g1)
    {
        return d(g1);
    }

    public l a(f f1)
    {
        f1.a(h());
        c(f1);
        return this;
    }

    public boolean a(Exception exception)
    {
        return b(exception, null);
    }

    public final g b(g g1)
    {
        if (g1 instanceof d)
        {
            ((d)g1).a(this);
        }
        d(g1);
        return g1;
    }

    public j b(a a1)
    {
        return c(a1);
    }

    public boolean b()
    {
        return a(k);
    }

    public boolean b(Exception exception, Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        if (super.f())
        {
            break MISSING_BLOCK_LABEL_13;
        }
        this;
        JVM INSTR monitorexit ;
        return false;
        j = obj;
        i = exception;
        c();
        exception = l();
        this;
        JVM INSTR monitorexit ;
        c(exception);
        return true;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean b(Object obj)
    {
        return b(null, obj);
    }

    public l c(a a1)
    {
        super.b(a1);
        return this;
    }

    void c()
    {
        if (d != null)
        {
            d.b();
            d = null;
        }
    }

    public boolean cancel(boolean flag)
    {
        return b();
    }

    public l d(g g1)
    {
        this;
        JVM INSTR monitorenter ;
        l = g1;
        if (!isDone() && !isCancelled())
        {
            break MISSING_BLOCK_LABEL_35;
        }
        g1 = l();
_L1:
        this;
        JVM INSTR monitorexit ;
        c(g1);
        return this;
        g1 = null;
          goto _L1
        g1;
        this;
        JVM INSTR monitorexit ;
        throw g1;
    }

    public boolean f()
    {
        return b((Object)null);
    }

    q g()
    {
        if (d == null)
        {
            d = new q();
        }
        return d;
    }

    public Object get()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        if (!isCancelled() && !isDone())
        {
            break MISSING_BLOCK_LABEL_25;
        }
        obj = k();
        this;
        JVM INSTR monitorexit ;
        return obj;
        obj = g();
        this;
        JVM INSTR monitorexit ;
        ((q) (obj)).a();
        return k();
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Object get(long l1, TimeUnit timeunit)
    {
        this;
        JVM INSTR monitorenter ;
        if (!isCancelled() && !isDone())
        {
            break MISSING_BLOCK_LABEL_25;
        }
        timeunit = ((TimeUnit) (k()));
        this;
        JVM INSTR monitorexit ;
        return timeunit;
        q q1 = g();
        this;
        JVM INSTR monitorexit ;
        if (!q1.a(l1, timeunit))
        {
            throw new TimeoutException();
        } else
        {
            return k();
        }
        timeunit;
        this;
        JVM INSTR monitorexit ;
        throw timeunit;
    }

    public g h()
    {
        return new m(this);
    }

    public Exception i()
    {
        return i;
    }

    public Object j()
    {
        return j;
    }
}
