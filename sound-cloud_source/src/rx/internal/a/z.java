// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.concurrent.atomic.AtomicLong;
import rx.X;
import rx.b;
import rx.b.a;
import rx.h.e;

// Referenced classes of package rx.internal.a:
//            A, w

final class z
    implements a
{

    final X a;
    final rx.g.a b;
    final rx.internal.b.a c;
    final AtomicLong d;
    final e e;
    final w f;

    z(w w1, X x, rx.g.a a1, rx.internal.b.a a2, AtomicLong atomiclong, e e1)
    {
        f = w1;
        a = x;
        b = a1;
        c = a2;
        d = atomiclong;
        e = e1;
        super();
    }

    public final void call()
    {
        if (a.isUnsubscribed())
        {
            return;
        } else
        {
            A a1 = new A(this);
            e.a(a1);
            rx.internal.a.w.a(f).unsafeSubscribe(a1);
            return;
        }
    }
}
