// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.h;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import rx.Y;

public final class d
    implements Y
{
    private static final class a
        implements Y
    {

        static final AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(rx/h/d$a, "b");
        final d a;
        volatile int b;

        public final boolean isUnsubscribed()
        {
            return b != 0;
        }

        public final void unsubscribe()
        {
            if (c.compareAndSet(this, 0, 1))
            {
                d d1 = a;
                b b1;
                b b2;
                do
                {
                    b1 = d1.b;
                    b2 = new b(b1.a, b1.b - 1);
                } while (!d.c.compareAndSet(d1, b1, b2));
                d1.a(b2);
            }
        }


        public a(d d1)
        {
            a = d1;
        }
    }

    private static final class b
    {

        public final boolean a;
        public final int b;

        public b(boolean flag, int i)
        {
            a = flag;
            b = i;
        }
    }


    static final b a = new b(false, 0);
    public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(rx/h/d, rx/h/d$b, "b");
    public volatile b b;
    private final Y d;

    public d(Y y)
    {
        b = a;
        if (y == null)
        {
            throw new IllegalArgumentException("s");
        } else
        {
            d = y;
            return;
        }
    }

    final void a(b b1)
    {
        if (b1.a && b1.b == 0)
        {
            d.unsubscribe();
        }
    }

    public final boolean isUnsubscribed()
    {
        return b.a;
    }

    public final void unsubscribe()
    {
        b b1;
        b b2;
        do
        {
            b1 = b;
            if (b1.a)
            {
                return;
            }
            b2 = new b(true, b1.b);
        } while (!c.compareAndSet(this, b1, b2));
        a(b2);
    }

}
