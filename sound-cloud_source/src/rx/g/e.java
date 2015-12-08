// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.g;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import rx.exceptions.Exceptions;
import rx.internal.a.g;
import rx.internal.util.q;

// Referenced classes of package rx.g:
//            m, n, f, g, 
//            h, i, j

public final class rx.g.e extends m
{
    static final class a
        implements e
    {

        final d a = new d();
        final c b;
        final rx.b.f c;
        final rx.b.f d;
        final rx.internal.a.g e = rx.internal.a.g.a();
        volatile boolean f;
        volatile d.a g;

        public final d.a a(d.a a1, n.b b1)
        {
            for (; a1 != g; a1 = a1.b)
            {
                d.a a2 = a1.b;
                rx.internal.a.g.a(b1, d.call(a2.a));
            }

            return a1;
        }

        public final void a()
        {
            if (!f)
            {
                f = true;
                a.a(c.call(rx.internal.a.g.b()));
                b.b(a);
                g = a.b;
            }
        }

        public final void a(Object obj)
        {
            if (!f)
            {
                a.a(c.call(rx.internal.a.g.a(obj)));
                b.a(a);
                g = a.b;
            }
        }

        public final void a(Throwable throwable)
        {
            if (!f)
            {
                f = true;
                a.a(c.call(rx.internal.a.g.a(throwable)));
                b.b(a);
                g = a.b;
            }
        }

        public final boolean a(n.b b1)
        {
            b1;
            JVM INSTR monitorenter ;
            b1.b = false;
            if (!b1.c)
            {
                break MISSING_BLOCK_LABEL_18;
            }
            b1;
            JVM INSTR monitorexit ;
            return false;
            b1;
            JVM INSTR monitorexit ;
            b1.g = a((d.a)b1.g, b1);
            return true;
            Exception exception;
            exception;
            b1;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public final Object[] a(Object aobj[])
        {
            ArrayList arraylist = new ArrayList();
            d.a a1 = a.a.b;
            do
            {
                if (a1 == null)
                {
                    break;
                }
                Object obj = d.call(a1.a);
                if (a1.b == null && (rx.internal.a.g.c(obj) || rx.internal.a.g.b(obj)))
                {
                    break;
                }
                arraylist.add(obj);
                a1 = a1.b;
            } while (true);
            return arraylist.toArray(aobj);
        }

        public final boolean b()
        {
            Object obj = a.a.b;
            if (obj != null)
            {
                if (!rx.internal.a.g.c(obj = d.call(((d.a) (obj)).a)) && !rx.internal.a.g.b(obj))
                {
                    return false;
                }
            }
            return true;
        }

        public final Object c()
        {
            Object obj = a.a.b;
            if (obj != null)
            {
                d.a a1 = null;
                d.a a2;
                for (; obj != g; obj = a2)
                {
                    a2 = ((d.a) (obj)).b;
                    a1 = ((d.a) (obj));
                }

                obj = d.call(((d.a) (obj)).a);
                if (rx.internal.a.g.c(obj) || rx.internal.a.g.b(obj))
                {
                    if (a1 != null)
                    {
                        return rx.internal.a.g.e(d.call(a1.a));
                    }
                } else
                {
                    return rx.internal.a.g.e(obj);
                }
            }
            return null;
        }

        public a(c c1, rx.b.f f1, rx.b.f f2)
        {
            g = a.b;
            b = c1;
            c = f1;
            d = f2;
        }
    }

    static final class b
        implements rx.b.b
    {

        final a a;

        public final void call(Object obj)
        {
            obj = (n.b)obj;
            obj.g = a.a(a.a.a, ((n.b) (obj)));
        }

        public b(a a1)
        {
            a = a1;
        }
    }

    static interface c
    {

        public abstract void a(d d1);

        public abstract void b(d d1);
    }

    static final class d
    {

        final a a = new a(null);
        a b;
        int c;

        public final Object a()
        {
            if (a.b == null)
            {
                throw new IllegalStateException("Empty!");
            }
            a a1 = a.b;
            a.b = a1.b;
            if (a.b == null)
            {
                b = a;
            }
            c = c - 1;
            return a1.a;
        }

        public final void a(Object obj)
        {
            a a1 = b;
            obj = new a(obj);
            a1.b = ((a) (obj));
            b = ((a) (obj));
            c = c + 1;
        }

        d()
        {
            b = a;
        }
    }

    static final class d.a
    {

        final Object a;
        volatile d.a b;

        d.a(Object obj)
        {
            a = obj;
        }
    }

    static interface e
    {

        public abstract void a();

        public abstract void a(Object obj);

        public abstract void a(Throwable throwable);

        public abstract boolean a(n.b b1);

        public abstract Object[] a(Object aobj[]);

        public abstract boolean b();

        public abstract Object c();
    }

    static final class f
        implements c
    {

        final int a = 1;

        public final void a(d d1)
        {
            while (d1.c > a) 
            {
                d1.a();
            }
        }

        public final void b(d d1)
        {
            while (d1.c > a + 1) 
            {
                d1.a();
            }
        }

        public f()
        {
        }
    }

    static final class g
        implements e
    {

        static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(rx/g/e$g, "a");
        volatile int a;
        private final rx.internal.a.g c = rx.internal.a.g.a();
        private final ArrayList d = new ArrayList(16);
        private volatile boolean e;

        private int d()
        {
            int k;
label0:
            {
                int l = a;
                k = l;
                if (l <= 0)
                {
                    break label0;
                }
                Object obj = d.get(l - 1);
                if (!rx.internal.a.g.b(obj))
                {
                    k = l;
                    if (!rx.internal.a.g.c(obj))
                    {
                        break label0;
                    }
                }
                k = l - 1;
            }
            return k;
        }

        public final Integer a(Integer integer, n.b b1)
        {
            int k;
            for (k = integer.intValue(); k < a; k++)
            {
                rx.internal.a.g.a(b1, d.get(k));
            }

            return Integer.valueOf(k);
        }

        public final void a()
        {
            if (!e)
            {
                e = true;
                d.add(rx.internal.a.g.b());
                b.getAndIncrement(this);
            }
        }

        public final void a(Object obj)
        {
            if (!e)
            {
                d.add(rx.internal.a.g.a(obj));
                b.getAndIncrement(this);
            }
        }

        public final void a(Throwable throwable)
        {
            if (!e)
            {
                e = true;
                d.add(rx.internal.a.g.a(throwable));
                b.getAndIncrement(this);
            }
        }

        public final boolean a(n.b b1)
        {
            b1;
            JVM INSTR monitorenter ;
            b1.b = false;
            if (!b1.c)
            {
                break MISSING_BLOCK_LABEL_18;
            }
            b1;
            JVM INSTR monitorexit ;
            return false;
            b1;
            JVM INSTR monitorexit ;
            Integer integer = (Integer)b1.g;
            Exception exception;
            if (integer != null)
            {
                b1.g = Integer.valueOf(a(integer, b1).intValue());
                return true;
            } else
            {
                throw new IllegalStateException((new StringBuilder("failed to find lastEmittedLink for: ")).append(b1).toString());
            }
            exception;
            b1;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public final Object[] a(Object aobj[])
        {
            int k = 0;
            int l = d();
            if (l > 0)
            {
                if (l > aobj.length)
                {
                    aobj = (Object[])(Object[])Array.newInstance(((Object) (aobj)).getClass().getComponentType(), l);
                }
                for (; k < l; k++)
                {
                    aobj[k] = d.get(k);
                }

                if (aobj.length > l)
                {
                    aobj[l] = null;
                }
                return aobj;
            }
            if (aobj.length > 0)
            {
                aobj[0] = null;
            }
            return aobj;
        }

        public final boolean b()
        {
            return d() == 0;
        }

        public final Object c()
        {
            Object obj;
label0:
            {
                Object obj1 = null;
                int k = a;
                obj = obj1;
                if (k > 0)
                {
                    obj = d.get(k - 1);
                    if (!rx.internal.a.g.b(obj) && !rx.internal.a.g.c(obj))
                    {
                        break label0;
                    }
                    obj = obj1;
                    if (k > 1)
                    {
                        obj = rx.internal.a.g.e(d.get(k - 2));
                    }
                }
                return obj;
            }
            return rx.internal.a.g.e(obj);
        }


        public g()
        {
        }
    }


    final e a;
    final n b;

    private rx.g.e(rx.b.f f1, n n1, e e1)
    {
        super(f1);
        b = n1;
        a = e1;
    }

    public static rx.g.e a()
    {
        g g1 = new g();
        n n1 = new n();
        n1.f = new rx.g.f(g1);
        n1.g = new rx.g.g(g1);
        n1.h = new h(g1);
        return new rx.g.e(n1, n1, g1);
    }

    private boolean a(n.b b1)
    {
        boolean flag = true;
        if (!b1.f)
        {
            if (a.a(b1))
            {
                b1.f = true;
                b1.g = null;
            }
            flag = false;
        }
        return flag;
    }

    public static rx.g.e b()
    {
        a a1 = new a(new f(), q.b(), q.b());
        b b1 = new b(a1);
        n n1 = new n();
        n1.f = b1;
        n1.g = new i(a1);
        n1.h = new j(a1);
        return new rx.g.e(n1, n1, a1);
    }

    public final Throwable getThrowable()
    {
        Object obj = b.i;
        obj = b.c;
        if (rx.internal.a.g.c(obj))
        {
            return rx.internal.a.g.f(obj);
        } else
        {
            return null;
        }
    }

    public final Object getValue()
    {
        return a.c();
    }

    public final Object[] getValues(Object aobj[])
    {
        return a.a(aobj);
    }

    public final boolean hasCompleted()
    {
        Object obj = b.i;
        obj = b.c;
        return obj != null && !rx.internal.a.g.c(obj);
    }

    public final boolean hasObservers()
    {
        return b.a.b.length > 0;
    }

    public final boolean hasThrowable()
    {
        rx.internal.a.g g1 = b.i;
        return rx.internal.a.g.c(b.c);
    }

    public final boolean hasValue()
    {
        return !a.b();
    }

    public final void onCompleted()
    {
        if (b.e)
        {
            a.a();
            n n1 = b;
            rx.internal.a.g.a();
            n.b ab[] = n1.a(rx.internal.a.g.b());
            int l = ab.length;
            for (int k = 0; k < l; k++)
            {
                n.b b1 = ab[k];
                if (a(b1))
                {
                    b1.onCompleted();
                }
            }

        }
    }

    public final void onError(Throwable throwable)
    {
        Object obj;
        n.b ab[];
        int k;
        int l;
        if (!b.e)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        a.a(throwable);
        obj = b;
        rx.internal.a.g.a();
        ab = ((n) (obj)).a(rx.internal.a.g.a(throwable));
        l = ab.length;
        k = 0;
        obj = null;
_L2:
        Object obj1;
        n.b b1;
        if (k >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        b1 = ab[k];
        obj1 = obj;
        if (!a(b1))
        {
            break MISSING_BLOCK_LABEL_82;
        }
        b1.onError(throwable);
        obj1 = obj;
_L3:
        k++;
        obj = obj1;
        if (true) goto _L2; else goto _L1
        Throwable throwable1;
        throwable1;
        obj1 = obj;
        if (obj == null)
        {
            obj1 = new ArrayList();
        }
        ((List) (obj1)).add(throwable1);
          goto _L3
_L1:
        Exceptions.throwIfAny(((List) (obj)));
    }

    public final void onNext(Object obj)
    {
        if (b.e)
        {
            a.a(obj);
            n.b ab[] = b.a.b;
            int l = ab.length;
            for (int k = 0; k < l; k++)
            {
                n.b b1 = ab[k];
                if (a(b1))
                {
                    b1.onNext(obj);
                }
            }

        }
    }
}
