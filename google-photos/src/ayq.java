// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.drawable.Drawable;
import android.os.Handler;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class ayq
    implements ayn, Runnable
{

    private static final ayr a = new ayr();
    private final Handler b;
    private final int c;
    private final int d;
    private final boolean e;
    private final ayr f;
    private Object g;
    private ayo h;
    private boolean i;
    private boolean j;
    private boolean k;

    public ayq(Handler handler, int l, int i1)
    {
        this(handler, l, i1, true, a);
    }

    private ayq(Handler handler, int l, int i1, boolean flag, ayr ayr1)
    {
        b = handler;
        c = l;
        d = i1;
        e = true;
        f = ayr1;
    }

    private Object a(Long long1)
    {
        this;
        JVM INSTR monitorenter ;
        if (e)
        {
            bag.b();
        }
        if (i)
        {
            throw new CancellationException();
        }
        break MISSING_BLOCK_LABEL_32;
        long1;
        this;
        JVM INSTR monitorexit ;
        throw long1;
        if (k)
        {
            throw new ExecutionException(new IllegalStateException("Load failed"));
        }
        if (!j) goto _L2; else goto _L1
_L1:
        long1 = ((Long) (g));
_L7:
        this;
        JVM INSTR monitorexit ;
        return long1;
_L2:
        if (long1 != null) goto _L4; else goto _L3
_L3:
        wait(0L);
_L6:
        if (Thread.interrupted())
        {
            throw new InterruptedException();
        }
        break; /* Loop/switch isn't completed */
_L4:
        if (long1.longValue() > 0L)
        {
            wait(long1.longValue());
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (k)
        {
            throw new ExecutionException(new IllegalStateException("Load failed"));
        }
        if (i)
        {
            throw new CancellationException();
        }
        if (!j)
        {
            throw new TimeoutException();
        }
        long1 = ((Long) (g));
          goto _L7
    }

    public final ayo a()
    {
        return h;
    }

    public final void a(Drawable drawable)
    {
    }

    public final void a(ayo ayo1)
    {
        h = ayo1;
    }

    public final void a(azg azg1)
    {
        azg1.a(c, d);
    }

    public final void a(Object obj, azp azp)
    {
        this;
        JVM INSTR monitorenter ;
        j = true;
        g = obj;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        throw obj;
    }

    public final void b(Drawable drawable)
    {
    }

    public final void c(Drawable drawable)
    {
        this;
        JVM INSTR monitorenter ;
        k = true;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        return;
        drawable;
        throw drawable;
    }

    public final void c_()
    {
    }

    public final boolean cancel(boolean flag)
    {
        boolean flag1 = true;
        flag = true;
        this;
        JVM INSTR monitorenter ;
        boolean flag2 = i;
        if (!flag2) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        Exception exception;
        if (!isDone())
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        i = true;
        notifyAll();
        b.post(this);
        if (true) goto _L1; else goto _L3
_L3:
        exception;
        throw exception;
    }

    public final void d_()
    {
    }

    public final Object get()
    {
        Object obj;
        try
        {
            obj = a(((Long) (null)));
        }
        catch (TimeoutException timeoutexception)
        {
            throw new AssertionError(timeoutexception);
        }
        return obj;
    }

    public final Object get(long l, TimeUnit timeunit)
    {
        return a(Long.valueOf(timeunit.toMillis(l)));
    }

    public final boolean isCancelled()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = i;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean isDone()
    {
        this;
        JVM INSTR monitorenter ;
        if (i) goto _L2; else goto _L1
_L1:
        boolean flag = j;
        if (!flag) goto _L3; else goto _L2
_L2:
        flag = true;
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L3:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    public final void j_()
    {
    }

    public final void run()
    {
        if (h != null)
        {
            h.d();
            h = null;
        }
    }

}
