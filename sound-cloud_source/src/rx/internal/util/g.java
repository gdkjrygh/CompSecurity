// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util;

import java.io.PrintStream;
import java.util.Queue;
import rx.P;
import rx.Y;
import rx.exceptions.MissingBackpressureException;
import rx.internal.util.unsafe.UnsafeAccess;

// Referenced classes of package rx.internal.util:
//            e, h, i, p, 
//            c

public final class g
    implements Y
{

    static int b;
    public static final int c;
    private static final rx.internal.a.g d = rx.internal.a.g.a();
    private static c h = new h();
    private static c i = new i();
    public volatile Object a;
    private Queue e;
    private final int f;
    private final c g;

    g()
    {
        this(((Queue) (new p(c))), c);
    }

    private g(Queue queue, int j)
    {
        e = queue;
        g = null;
        f = j;
    }

    private g(c c1, int j)
    {
        g = c1;
        e = (Queue)c1.a();
        f = j;
    }

    public static g a()
    {
        if (UnsafeAccess.isUnsafeAvailable())
        {
            return new g(h, c);
        } else
        {
            return new g();
        }
    }

    public static boolean a(Object obj, P p1)
    {
        return rx.internal.a.g.a(p1, obj);
    }

    public static g b()
    {
        if (UnsafeAccess.isUnsafeAvailable())
        {
            return new g(i, c);
        } else
        {
            return new g();
        }
    }

    public static boolean b(Object obj)
    {
        return rx.internal.a.g.b(obj);
    }

    public static Object c(Object obj)
    {
        return rx.internal.a.g.e(obj);
    }

    public final void a(Object obj)
        throws MissingBackpressureException
    {
        boolean flag = true;
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        Queue queue = e;
        if (queue == null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        if (queue.offer(rx.internal.a.g.a(obj)))
        {
            flag = false;
        }
_L1:
        this;
        JVM INSTR monitorexit ;
        if (flag1)
        {
            throw new IllegalStateException("This instance has been unsubscribed and the queue is no longer usable.");
        }
        break MISSING_BLOCK_LABEL_64;
        flag1 = true;
        flag = false;
          goto _L1
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        if (flag)
        {
            throw new MissingBackpressureException();
        } else
        {
            return;
        }
    }

    public final void c()
    {
        this;
        JVM INSTR monitorenter ;
        Queue queue;
        c c1;
        queue = e;
        c1 = g;
        if (c1 == null || queue == null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        queue.clear();
        e = null;
        if (queue == null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        c1.a.offer(queue);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void d()
    {
        if (a == null)
        {
            a = rx.internal.a.g.b();
        }
    }

    public final boolean e()
    {
        Queue queue = e;
        if (queue == null)
        {
            return true;
        } else
        {
            return queue.isEmpty();
        }
    }

    public final Object f()
    {
        this;
        JVM INSTR monitorenter ;
        Queue queue = e;
        if (queue != null)
        {
            break MISSING_BLOCK_LABEL_15;
        }
        this;
        JVM INSTR monitorexit ;
        return null;
        Object obj;
        Object obj1;
        obj = queue.poll();
        obj1 = a;
        if (obj != null || obj1 == null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        if (queue.peek() != null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        a = null;
        obj = obj1;
        this;
        JVM INSTR monitorexit ;
        return obj;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final Object g()
    {
        this;
        JVM INSTR monitorenter ;
        Queue queue = e;
        if (queue != null)
        {
            break MISSING_BLOCK_LABEL_15;
        }
        this;
        JVM INSTR monitorexit ;
        return null;
        Object obj;
        Object obj1;
        obj = queue.peek();
        obj1 = a;
        if (obj != null || obj1 == null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        if (queue.peek() == null)
        {
            obj = obj1;
        }
        this;
        JVM INSTR monitorexit ;
        return obj;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean isUnsubscribed()
    {
        return e == null;
    }

    public final void unsubscribe()
    {
        c();
    }

    static 
    {
        b = 128;
        if (rx.internal.util.e.a())
        {
            b = 16;
        }
        String s = System.getProperty("rx.ring-buffer.size");
        if (s != null)
        {
            try
            {
                b = Integer.parseInt(s);
            }
            catch (Exception exception)
            {
                System.err.println((new StringBuilder("Failed to set 'rx.buffer.size' with value ")).append(s).append(" => ").append(exception.getMessage()).toString());
            }
        }
        c = b;
    }
}
