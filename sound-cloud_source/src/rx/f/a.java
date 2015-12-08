// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.f;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import rx.R;
import rx.Y;
import rx.h.f;
import rx.internal.c.d;
import rx.internal.util.j;

// Referenced classes of package rx.f:
//            b

final class rx.f.a extends R
{
    private static final class a
    {

        private static a d;
        final long a;
        final ConcurrentLinkedQueue b = new ConcurrentLinkedQueue();
        private final ScheduledExecutorService c = Executors.newScheduledThreadPool(1, rx.f.a.b());

        static long b()
        {
            return System.nanoTime();
        }

        static a c()
        {
            return d;
        }

        final c a()
        {
            while (!b.isEmpty()) 
            {
                c c1 = (c)b.poll();
                if (c1 != null)
                {
                    return c1;
                }
            }
            return new c(rx.f.a.c());
        }

        static 
        {
            d = new a(TimeUnit.SECONDS);
        }

        private a(TimeUnit timeunit)
        {
            a = timeunit.toNanos(60L);
            c.scheduleWithFixedDelay(new rx.f.b(this), a, a, TimeUnit.NANOSECONDS);
        }
    }

    private static final class b extends rx.R.a
    {

        static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(rx/f/a$b, "a");
        volatile int a;
        private final rx.h.b c = new rx.h.b();
        private final c d;

        public final Y a(rx.b.a a1)
        {
            return a(a1, 0L, null);
        }

        public final Y a(rx.b.a a1, long l, TimeUnit timeunit)
        {
            if (c.isUnsubscribed())
            {
                return f.b();
            } else
            {
                a1 = d.b(a1, l, timeunit);
                c.a(a1);
                a1.a(c);
                return a1;
            }
        }

        public final boolean isUnsubscribed()
        {
            return c.isUnsubscribed();
        }

        public final void unsubscribe()
        {
            if (b.compareAndSet(this, 0, 1))
            {
                a a1 = a.c();
                c c1 = d;
                c1.d = a.b() + a1.a;
                a1.b.offer(c1);
            }
            c.unsubscribe();
        }


        b(c c1)
        {
            d = c1;
        }
    }

    private static final class c extends rx.internal.c.b
    {

        long d;

        c(ThreadFactory threadfactory)
        {
            super(threadfactory);
            d = 0L;
        }
    }


    private static final j a = new j("RxCachedThreadScheduler-");
    private static final j b = new j("RxCachedWorkerPoolEvictor-");

    rx.f.a()
    {
    }

    static j b()
    {
        return b;
    }

    static j c()
    {
        return a;
    }

    public final rx.R.a a()
    {
        return new b(a.c().a());
    }

}
