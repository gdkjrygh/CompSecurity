// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import rx.P;
import rx.X;
import rx.b.o;
import rx.exceptions.MissingBackpressureException;
import rx.exceptions.OnErrorThrowable;
import rx.h.b;
import rx.internal.util.g;

// Referenced classes of package rx.internal.a:
//            ei

private static final class a
{
    final class a extends X
    {

        final g a = rx.internal.util.g.b();
        final ei.a b;

        public final void onCompleted()
        {
            a.d();
            b.a();
        }

        public final void onError(Throwable throwable)
        {
            ei.a.a(b).onError(throwable);
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
            request(g.c);
        }

        a()
        {
            b = ei.a.this;
            super();
        }
    }


    static final AtomicLongFieldUpdater c = AtomicLongFieldUpdater.newUpdater(rx/internal/a/ei$a, "b");
    static final int d;
    final b a = new b();
    volatile long b;
    int e;
    Object f[];
    AtomicLong g;
    private final P h;
    private final o i;

    static P a(b b1)
    {
        return b1.h;
    }

    final void a()
    {
        Object obj;
        for (obj = ((Object) (f)); obj == null || c.getAndIncrement(this) != 0L;)
        {
            return;
        }

        int j1 = obj.length;
        P p = h;
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
                            p.onCompleted();
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
                    p.onNext(i.a(((Object []) (obj1))));
                    atomiclong.decrementAndGet();
                    e = e + 1;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    p.onError(OnErrorThrowable.addValueAsLastCause(((Throwable) (obj)), obj1));
                    return;
                }
                l = obj.length;
                for (int j = 0; j < l; j++)
                {
                    obj1 = ((a)obj[j]).a;
                    ((g) (obj1)).f();
                    if (rx.internal.util.g.b(((g) (obj1)).g()))
                    {
                        p.onCompleted();
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
        d = (int)((double)g.c * 0.69999999999999996D);
    }

    public a.b(X x, o o1)
    {
        e = 0;
        h = x;
        i = o1;
        x.add(a);
    }
}
