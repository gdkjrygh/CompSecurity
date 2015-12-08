// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import rx.P;
import rx.Q;
import rx.X;
import rx.b.g;
import rx.b.h;
import rx.b.i;
import rx.b.j;
import rx.b.k;
import rx.b.l;
import rx.b.m;
import rx.b.n;
import rx.b.o;
import rx.b.p;
import rx.exceptions.MissingBackpressureException;
import rx.exceptions.OnErrorThrowable;

// Referenced classes of package rx.internal.a:
//            a

public final class ei
    implements rx.b.g
{
    private static final class a
    {

        static final AtomicLongFieldUpdater c = AtomicLongFieldUpdater.newUpdater(rx/internal/a/ei$a, "b");
        static final int d;
        final rx.h.b a = new rx.h.b();
        volatile long b;
        int e;
        Object f[];
        AtomicLong g;
        private final P h;
        private final o i;

        static P a(a a1)
        {
            return a1.h;
        }

        final void a()
        {
            Object obj;
            for (obj = ((Object) (f)); obj == null || c.getAndIncrement(this) != 0L;)
            {
                return;
            }

            int j1 = obj.length;
            P p1 = h;
            AtomicLong atomiclong = g;
            do
            {
                do
                {
                    Object obj1 = ((Object) (new Object[j1]));
                    boolean flag = true;
                    int l = 0;
                    while (l < j1) 
                    {
                        Object obj2 = ((a)obj[l]).a.g();
                        if (obj2 == null)
                        {
                            flag = false;
                        } else
                        {
                            if (rx.internal.util.g.b(obj2))
                            {
                                p1.onCompleted();
                                a.unsubscribe();
                                return;
                            }
                            obj1[l] = rx.internal.util.g.c(obj2);
                        }
                        l++;
                    }
                    if (atomiclong.get() <= 0L || !flag)
                    {
                        break;
                    }
                    try
                    {
                        p1.onNext(i.a(((Object []) (obj1))));
                        atomiclong.decrementAndGet();
                        e = e + 1;
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        p1.onError(OnErrorThrowable.addValueAsLastCause(((Throwable) (obj)), obj1));
                        return;
                    }
                    l = obj.length;
                    for (int j = 0; j < l; j++)
                    {
                        obj1 = ((a)obj[j]).a;
                        ((rx.internal.util.g) (obj1)).f();
                        if (rx.internal.util.g.b(((rx.internal.util.g) (obj1)).g()))
                        {
                            p1.onCompleted();
                            a.unsubscribe();
                            return;
                        }
                    }

                    if (e > d)
                    {
                        int i1 = obj.length;
                        for (int k = 0; k < i1; k++)
                        {
                            ((a)obj[k]).request(e);
                        }

                        e = 0;
                    }
                } while (true);
            } while (c.decrementAndGet(this) > 0L);
        }

        static 
        {
            d = (int)((double)rx.internal.util.g.c * 0.69999999999999996D);
        }

        public a(X x, o o1)
        {
            e = 0;
            h = x;
            i = o1;
            x.add(a);
        }
    }

    final class a.a extends X
    {

        final rx.internal.util.g a = rx.internal.util.g.b();
        final a b;

        public final void onCompleted()
        {
            a.d();
            b.a();
        }

        public final void onError(Throwable throwable)
        {
            a.a(b).onError(throwable);
        }

        public final void onNext(Object obj)
        {
            try
            {
                a.a(obj);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                onError(((Throwable) (obj)));
            }
            b.a();
        }

        public final void onStart()
        {
            request(rx.internal.util.g.c);
        }

        a.a(a a1)
        {
            b = a1;
            super();
        }
    }

    private static final class b extends AtomicLong
        implements Q
    {

        private a a;

        public final void a(long l)
        {
            rx.internal.a.a.a(this, l);
            a.a();
        }

        public b(a a1)
        {
            a = a1;
        }
    }

    private final class c extends X
    {

        final X a;
        final a b;
        final b c;
        boolean d;
        final ei e;

        public final void onCompleted()
        {
            if (!d)
            {
                a.onCompleted();
            }
        }

        public final void onError(Throwable throwable)
        {
            a.onError(throwable);
        }

        public final void onNext(Object obj)
        {
            boolean flag = false;
            obj = (rx.b[])obj;
            if (obj == null || obj.length == 0)
            {
                a.onCompleted();
            } else
            {
                d = true;
                a a1 = b;
                b b1 = c;
                a1.f = new Object[obj.length];
                a1.g = b1;
                int i = 0;
                int j;
                do
                {
                    j = ((flag) ? 1 : 0);
                    if (i >= obj.length)
                    {
                        break;
                    }
                    a.a a2 = new a.a(a1);
                    a1.f[i] = a2;
                    a1.a.a(a2);
                    i++;
                } while (true);
                while (j < obj.length) 
                {
                    obj[j].unsafeSubscribe((a.a)a1.f[j]);
                    j++;
                }
            }
        }

        public c(X x, a a1, b b1)
        {
            e = ei.this;
            super(x);
            d = false;
            a = x;
            b = a1;
            c = b1;
        }
    }


    final o a;

    public ei(g g)
    {
        a = p.a(g);
    }

    public ei(h h)
    {
        a = p.a(h);
    }

    public ei(i i)
    {
        a = p.a(i);
    }

    public ei(j j)
    {
        a = p.a(j);
    }

    public ei(k k)
    {
        a = p.a(k);
    }

    public ei(l l)
    {
        a = p.a(l);
    }

    public ei(m m)
    {
        a = p.a(m);
    }

    public ei(n n)
    {
        a = p.a(n);
    }

    public ei(o o)
    {
        a = o;
    }

    public final Object call(Object obj)
    {
        obj = (X)obj;
        a a1 = new a(((X) (obj)), a);
        b b1 = new b(a1);
        ((X) (obj)).setProducer(b1);
        return new c(((X) (obj)), a1, b1);
    }
}
