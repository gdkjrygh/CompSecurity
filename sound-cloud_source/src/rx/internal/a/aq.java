// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import rx.Q;
import rx.X;
import rx.d.e;
import rx.h.f;

// Referenced classes of package rx.internal.a:
//            g, ar, a

public final class aq
    implements rx.b.g
{
    static class a extends X
    {

        private static final AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(rx/internal/a/aq$a, "c");
        private final X a;
        private final c b;
        private volatile int c;
        private final rx.internal.b.a e;

        public void onCompleted()
        {
            if (d.compareAndSet(this, 0, 1))
            {
                c c1 = b;
                c1.c = null;
                if (rx.internal.a.c.e.decrementAndGet(c1) > 0)
                {
                    c1.a();
                }
                c1.request(1L);
            }
        }

        public void onError(Throwable throwable)
        {
            if (d.compareAndSet(this, 0, 1))
            {
                b.onError(throwable);
            }
        }

        public void onNext(Object obj)
        {
            a.onNext(obj);
            c.a(b);
            e.a();
        }

        public void setProducer(Q q)
        {
            e.a(q);
        }


        public a(c c1, X x, rx.internal.b.a a1)
        {
            c = 0;
            b = c1;
            a = x;
            e = a1;
        }
    }

    static final class b
        implements Q
    {

        final c a;

        public final void a(long l)
        {
            c.a(a, l);
        }

        b(c c1)
        {
            a = c1;
        }
    }

    static final class c extends X
    {

        static final AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(rx/internal/a/aq$c, "d");
        private static final AtomicLongFieldUpdater i = AtomicLongFieldUpdater.newUpdater(rx/internal/a/aq$c, "h");
        final g a = rx.internal.a.g.a();
        final ConcurrentLinkedQueue b = new ConcurrentLinkedQueue();
        volatile a c;
        volatile int d;
        private final X f;
        private final rx.h.e g;
        private volatile long h;
        private final rx.internal.b.a j = new rx.internal.b.a();

        static void a(c c1)
        {
            i.decrementAndGet(c1);
        }

        static void a(c c1, long l)
        {
            if (l > 0L)
            {
                long l1 = rx.internal.a.a.a(i, c1, l);
                c1.j.a(l);
                if (l1 == 0L && c1.c == null && c1.d > 0)
                {
                    c1.a();
                }
            }
        }

        final void a()
        {
            if (h <= 0L) goto _L2; else goto _L1
_L1:
            Object obj = b.poll();
            if (!rx.internal.a.g.b(obj)) goto _L4; else goto _L3
_L3:
            f.onCompleted();
_L6:
            return;
_L4:
            if (obj != null)
            {
                obj = (rx.b)rx.internal.a.g.e(obj);
                c = new a(this, f, j);
                g.a(c);
                ((rx.b) (obj)).unsafeSubscribe(c);
                return;
            }
            continue; /* Loop/switch isn't completed */
_L2:
            if (rx.internal.a.g.b(b.peek()))
            {
                f.onCompleted();
                return;
            }
            if (true) goto _L6; else goto _L5
_L5:
        }

        public final void onCompleted()
        {
            b.add(rx.internal.a.g.b());
            if (e.getAndIncrement(this) == 0)
            {
                a();
            }
        }

        public final void onError(Throwable throwable)
        {
            f.onError(throwable);
            unsubscribe();
        }

        public final void onNext(Object obj)
        {
            obj = (rx.b)obj;
            b.add(rx.internal.a.g.a(obj));
            if (e.getAndIncrement(this) == 0)
            {
                a();
            }
        }

        public final void onStart()
        {
            request(2L);
        }


        public c(X x, rx.h.e e1)
        {
            super(x);
            f = x;
            g = e1;
            add(rx.h.f.a(new ar(this)));
        }
    }

    private static final class d
    {

        public static final aq a = new aq((byte)0);

    }


    private aq()
    {
    }

    aq(byte byte0)
    {
        this();
    }

    public final Object call(Object obj)
    {
        obj = (X)obj;
        Object obj1 = new e(((X) (obj)));
        rx.h.e e1 = new rx.h.e();
        ((X) (obj)).add(e1);
        obj1 = new c(((X) (obj1)), e1);
        ((X) (obj)).setProducer(new b(((c) (obj1))));
        return obj1;
    }
}
