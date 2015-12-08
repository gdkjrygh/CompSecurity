// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.f;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import rx.R;
import rx.Y;
import rx.h.b;
import rx.h.f;
import rx.internal.c.d;

// Referenced classes of package rx.f:
//            d, e, f

final class c extends R
{
    static final class a extends rx.R.a
        implements Runnable
    {

        final Executor a;
        final b b = new b();
        final ConcurrentLinkedQueue c = new ConcurrentLinkedQueue();
        final AtomicInteger d = new AtomicInteger();

        public final Y a(rx.b.a a1)
        {
            if (isUnsubscribed())
            {
                a1 = f.b();
            } else
            {
                d d1 = new d(a1, b);
                b.a(d1);
                c.offer(d1);
                a1 = d1;
                if (d.getAndIncrement() == 0)
                {
                    try
                    {
                        a.execute(this);
                    }
                    // Misplaced declaration of an exception variable
                    catch (rx.b.a a1)
                    {
                        b.b(d1);
                        d.decrementAndGet();
                        rx.e.d.a().b();
                        throw a1;
                    }
                    return d1;
                }
            }
            return a1;
        }

        public final Y a(rx.b.a a1, long l, TimeUnit timeunit)
        {
            if (l <= 0L)
            {
                return a(a1);
            }
            if (isUnsubscribed())
            {
                return f.b();
            }
            ScheduledExecutorService scheduledexecutorservice;
            rx.h.c c1;
            Y y;
            rx.h.c c2;
            if (a instanceof ScheduledExecutorService)
            {
                scheduledexecutorservice = (ScheduledExecutorService)a;
            } else
            {
                scheduledexecutorservice = f.a();
            }
            c1 = new rx.h.c();
            c2 = new rx.h.c();
            c2.a(c1);
            b.a(c2);
            y = f.a(new rx.f.d(this, c2));
            a1 = new d(new e(this, c2, a1, y));
            c1.a(a1);
            try
            {
                a1.a(scheduledexecutorservice.schedule(a1, l, timeunit));
            }
            // Misplaced declaration of an exception variable
            catch (rx.b.a a1)
            {
                rx.e.d.a().b();
                throw a1;
            }
            return y;
        }

        public final boolean isUnsubscribed()
        {
            return b.isUnsubscribed();
        }

        public final void run()
        {
            do
            {
                d d1 = (d)c.poll();
                if (!d1.isUnsubscribed())
                {
                    d1.run();
                }
            } while (d.decrementAndGet() > 0);
        }

        public final void unsubscribe()
        {
            b.unsubscribe();
        }

        public a(Executor executor)
        {
            a = executor;
        }
    }


    final Executor a;

    public c(Executor executor)
    {
        a = executor;
    }

    public final rx.R.a a()
    {
        return new a(a);
    }
}
