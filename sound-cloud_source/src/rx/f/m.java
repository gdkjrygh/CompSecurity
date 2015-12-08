// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.f;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import rx.R;
import rx.Y;
import rx.h.f;

// Referenced classes of package rx.f:
//            n, j

public final class m extends R
{
    private static class a extends rx.R.a
        implements Y
    {

        private static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(rx/f/m$a, "a");
        volatile int a;
        private final PriorityBlockingQueue c;
        private final rx.h.a d;
        private final AtomicInteger e;

        static PriorityBlockingQueue a(a a1)
        {
            return a1.c;
        }

        private Y a(rx.b.a a1, long l)
        {
            if (d.isUnsubscribed())
            {
                return f.b();
            }
            a1 = new b(a1, Long.valueOf(l), b.incrementAndGet(this), (byte)0);
            c.add(a1);
            if (e.getAndIncrement() == 0)
            {
                do
                {
                    a1 = (b)c.poll();
                    if (a1 != null)
                    {
                        ((b) (a1)).a.call();
                    }
                } while (e.decrementAndGet() > 0);
                return f.b();
            } else
            {
                return f.a(new n(this, a1));
            }
        }

        public final Y a(rx.b.a a1)
        {
            return a(a1, System.currentTimeMillis());
        }

        public final Y a(rx.b.a a1, long l, TimeUnit timeunit)
        {
            l = System.currentTimeMillis() + timeunit.toMillis(l);
            return a(((rx.b.a) (new j(a1, this, l))), l);
        }

        public boolean isUnsubscribed()
        {
            return d.isUnsubscribed();
        }

        public void unsubscribe()
        {
            d.unsubscribe();
        }


        private a()
        {
            c = new PriorityBlockingQueue();
            d = new rx.h.a();
            e = new AtomicInteger();
        }

        a(byte byte0)
        {
            this();
        }
    }

    private static final class b
        implements Comparable
    {

        final rx.b.a a;
        final Long b;
        final int c;

        public final int compareTo(Object obj)
        {
            obj = (b)obj;
            int j = b.compareTo(((b) (obj)).b);
            int i = j;
            if (j == 0)
            {
                i = m.a(c, ((b) (obj)).c);
            }
            return i;
        }

        private b(rx.b.a a1, Long long1, int i)
        {
            a = a1;
            b = long1;
            c = i;
        }

        b(rx.b.a a1, Long long1, int i, byte byte0)
        {
            this(a1, long1, i);
        }
    }


    private static final m a = new m();

    m()
    {
    }

    static int a(int i, int j)
    {
        if (i < j)
        {
            return -1;
        }
        return i != j ? 1 : 0;
    }

    static m b()
    {
        return a;
    }

    public final rx.R.a a()
    {
        return new a((byte)0);
    }

}
