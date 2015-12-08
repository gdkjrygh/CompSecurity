// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import com.facebook.s;
import java.util.concurrent.Executor;

// Referenced classes of package com.facebook.internal:
//            af

public class ae
{
    public static interface a
    {

        public abstract boolean a();

        public abstract void b();
    }

    private final class b
        implements a
    {

        static final boolean c;
        final Runnable a;
        boolean b;
        final ae d;
        private b e;
        private b f;

        final b a(b b1)
        {
            if (!c && e == null)
            {
                throw new AssertionError();
            }
            if (!c && f == null)
            {
                throw new AssertionError();
            }
            b b2 = b1;
            if (b1 == this)
            {
                if (e == this)
                {
                    b2 = null;
                } else
                {
                    b2 = e;
                }
            }
            e.f = f;
            f.e = e;
            f = null;
            e = null;
            return b2;
        }

        final b a(b b1, boolean flag)
        {
            if (!c && e != null)
            {
                throw new AssertionError();
            }
            if (!c && f != null)
            {
                throw new AssertionError();
            }
            if (b1 == null)
            {
                f = this;
                e = this;
                b1 = this;
            } else
            {
                e = b1;
                f = b1.f;
                b b2 = e;
                f.e = this;
                b2.f = this;
            }
            if (flag)
            {
                return this;
            } else
            {
                return b1;
            }
        }

        public final boolean a()
        {
            Object obj = ae.a(d);
            obj;
            JVM INSTR monitorenter ;
            if (b)
            {
                break MISSING_BLOCK_LABEL_40;
            }
            ae.b(d, a(ae.b(d)));
            return true;
            obj;
            JVM INSTR monitorexit ;
            return false;
            Exception exception;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public final void b()
        {
            synchronized (ae.a(d))
            {
                if (!b)
                {
                    ae.b(d, a(ae.b(d)));
                    ae.b(d, a(ae.b(d), true));
                }
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        static 
        {
            boolean flag;
            if (!com/facebook/internal/ae.desiredAssertionStatus())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            c = flag;
        }

        b(Runnable runnable)
        {
            d = ae.this;
            super();
            a = runnable;
        }
    }


    static final boolean a;
    private final Object b;
    private b c;
    private final int d;
    private final Executor e;
    private b f;
    private int g;

    public ae()
    {
        this(8);
    }

    public ae(int i)
    {
        this(i, s.d());
    }

    private ae(int i, Executor executor)
    {
        b = new Object();
        f = null;
        g = 0;
        d = i;
        e = executor;
    }

    static Object a(ae ae1)
    {
        return ae1.b;
    }

    private void a(b b1)
    {
        b b2 = null;
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        if (b1 == null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        f = b1.a(f);
        g = g - 1;
        b1 = b2;
        if (g >= d)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        b2 = c;
        b1 = b2;
        if (b2 == null)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        c = b2.a(c);
        f = b2.a(f, false);
        g = g + 1;
        b2.b = true;
        b1 = b2;
        obj;
        JVM INSTR monitorexit ;
        if (b1 != null)
        {
            e.execute(new af(this, b1));
        }
        return;
        b1;
        obj;
        JVM INSTR monitorexit ;
        throw b1;
    }

    static void a(ae ae1, b b1)
    {
        ae1.a(b1);
    }

    static b b(ae ae1)
    {
        return ae1.c;
    }

    static b b(ae ae1, b b1)
    {
        ae1.c = b1;
        return b1;
    }

    public final a a(Runnable runnable)
    {
        b b1 = new b(runnable);
        synchronized (b)
        {
            c = b1.a(c, true);
        }
        a(((b) (null)));
        return b1;
        exception;
        runnable;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static 
    {
        boolean flag;
        if (!com/facebook/internal/ae.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
