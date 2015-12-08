// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.c;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import rx.R;
import rx.Y;
import rx.h.f;
import rx.internal.util.j;
import rx.internal.util.o;

// Referenced classes of package rx.internal.c:
//            d, b

public final class rx.internal.c.a extends R
{
    private static final class a extends rx.R.a
    {

        private final o a = new o();
        private final rx.h.b b = new rx.h.b();
        private final o c;
        private final c d;

        public final Y a(rx.b.a a1)
        {
            if (isUnsubscribed())
            {
                return f.b();
            }
            c c1 = d;
            o o1 = a;
            d d1 = new d(rx.e.f.a(a1), o1);
            o1.a(d1);
            if (0L <= 0L)
            {
                a1 = ((rx.internal.c.b) (c1)).a.submit(d1);
            } else
            {
                a1 = ((rx.internal.c.b) (c1)).a.schedule(d1, 0L, null);
            }
            d1.a(a1);
            return d1;
        }

        public final Y a(rx.b.a a1, long l, TimeUnit timeunit)
        {
            if (isUnsubscribed())
            {
                return f.b();
            }
            c c1 = d;
            rx.h.b b1 = b;
            d d1 = new d(rx.e.f.a(a1), b1);
            b1.a(d1);
            if (l <= 0L)
            {
                a1 = ((rx.internal.c.b) (c1)).a.submit(d1);
            } else
            {
                a1 = ((rx.internal.c.b) (c1)).a.schedule(d1, l, timeunit);
            }
            d1.a(a1);
            return d1;
        }

        public final boolean isUnsubscribed()
        {
            return c.isUnsubscribed();
        }

        public final void unsubscribe()
        {
            c.unsubscribe();
        }

        a(c c1)
        {
            c = new o(new Y[] {
                a, b
            });
            d = c1;
        }
    }

    public static final class b
    {

        final int a;
        final c b[];
        long c;

        public final c a()
        {
            c ac[] = b;
            long l = c;
            c = 1L + l;
            return ac[(int)(l % (long)a)];
        }

        b()
        {
            a = rx.internal.c.a.a;
            b = new c[a];
            for (int i = 0; i < a; i++)
            {
                b[i] = new c(rx.internal.c.a.b());
            }

        }
    }

    private static final class c extends rx.internal.c.b
    {

        c(ThreadFactory threadfactory)
        {
            super(threadfactory);
        }
    }


    static final int a;
    private static final j c;
    public final b b = new b();

    public rx.internal.c.a()
    {
    }

    static j b()
    {
        return c;
    }

    public final rx.R.a a()
    {
        return new a(b.a());
    }

    static 
    {
        int i;
label0:
        {
            c = new j("RxComputationThreadPool-");
            int k = Integer.getInteger("rx.scheduler.max-computation-threads", 0).intValue();
            int l = Runtime.getRuntime().availableProcessors();
            if (k > 0)
            {
                i = k;
                if (k <= l)
                {
                    break label0;
                }
            }
            i = l;
        }
        a = i;
    }
}
