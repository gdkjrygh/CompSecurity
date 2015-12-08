// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import rx.X;
import rx.b.a;
import rx.exceptions.MissingBackpressureException;

// Referenced classes of package rx.internal.a:
//            g

public final class bx
    implements rx.b.g
{
    private static final class a extends X
        implements rx.internal.util.a.a
    {

        final rx.internal.util.a a = new rx.internal.util.a(this);
        private final ConcurrentLinkedQueue b = new ConcurrentLinkedQueue();
        private final Long c;
        private final AtomicLong d;
        private final X e;
        private final AtomicBoolean f = new AtomicBoolean(false);
        private final g g = rx.internal.a.g.a();
        private final rx.b.a h;

        public final Object a()
        {
            return b.peek();
        }

        public final void a(Throwable throwable)
        {
            if (throwable != null)
            {
                e.onError(throwable);
                return;
            } else
            {
                e.onCompleted();
                return;
            }
        }

        public final boolean a(Object obj)
        {
            return rx.internal.a.g.a(e, obj);
        }

        public final Object b()
        {
            Object obj = b.poll();
            if (d != null && obj != null)
            {
                d.incrementAndGet();
            }
            return obj;
        }

        public final void onCompleted()
        {
            if (!f.get())
            {
                a.a();
            }
        }

        public final void onError(Throwable throwable)
        {
            if (!f.get())
            {
                a.a(throwable);
            }
        }

        public final void onNext(Object obj)
        {
            boolean flag = true;
            long l;
            if (d != null)
            {
                do
                {
                    l = d.get();
                    if (l > 0L)
                    {
                        continue;
                    }
                    if (f.compareAndSet(false, true))
                    {
                        unsubscribe();
                        e.onError(new MissingBackpressureException((new StringBuilder("Overflowed buffer of ")).append(c).toString()));
                        if (h != null)
                        {
                            h.call();
                        }
                    }
                    flag = false;
                    break;
                } while (!d.compareAndSet(l, l - 1L));
            }
            if (!flag)
            {
                return;
            } else
            {
                b.offer(rx.internal.a.g.a(obj));
                a.b();
                return;
            }
        }

        public final void onStart()
        {
            request(0x7fffffffffffffffL);
        }

        public a(X x, Long long1, rx.b.a a1)
        {
            e = x;
            c = long1;
            if (long1 != null)
            {
                x = new AtomicLong(long1.longValue());
            } else
            {
                x = null;
            }
            d = x;
            h = a1;
        }
    }

    private static final class b
    {

        public static final bx a = new bx((byte)0);

    }


    private final Long a;
    private final rx.b.a b;

    private bx()
    {
        a = null;
        b = null;
    }

    bx(byte byte0)
    {
        this();
    }

    public bx(long l)
    {
        this(l, null);
    }

    public bx(long l, rx.b.a a1)
    {
        if (l <= 0L)
        {
            throw new IllegalArgumentException("Buffer capacity must be > 0");
        } else
        {
            a = Long.valueOf(l);
            b = a1;
            return;
        }
    }

    public final Object call(Object obj)
    {
        obj = (X)obj;
        a a1 = new a(((X) (obj)), a, b);
        ((X) (obj)).add(a1);
        ((X) (obj)).setProducer(a1.a);
        return a1;
    }
}
