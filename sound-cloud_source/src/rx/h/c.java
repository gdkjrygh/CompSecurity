// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.h;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import rx.Y;

// Referenced classes of package rx.h:
//            f

public final class c
    implements Y
{
    private static final class a
    {

        final boolean a;
        final Y b;

        a(boolean flag, Y y)
        {
            a = flag;
            b = y;
        }
    }


    static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(rx/h/c, rx/h/c$a, "a");
    volatile a a;

    public c()
    {
        a = new a(false, f.a());
    }

    public final void a(Y y)
    {
        if (y == null)
        {
            throw new IllegalArgumentException("Subscription can not be null");
        }
        a a1;
        a a2;
        do
        {
            a1 = a;
            if (a1.a)
            {
                y.unsubscribe();
                return;
            }
            a2 = new a(a1.a, y);
        } while (!b.compareAndSet(this, a1, a2));
    }

    public final boolean isUnsubscribed()
    {
        return a.a;
    }

    public final void unsubscribe()
    {
        a a1;
        a a2;
        do
        {
            a1 = a;
            if (a1.a)
            {
                return;
            }
            a2 = new a(true, a1.b);
        } while (!b.compareAndSet(this, a1, a2));
        a1.b.unsubscribe();
    }

}
