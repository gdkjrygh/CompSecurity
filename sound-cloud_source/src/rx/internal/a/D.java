// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import rx.X;
import rx.b;
import rx.b.a;

// Referenced classes of package rx.internal.a:
//            E, w

final class D
    implements a
{

    final b a;
    final X b;
    final AtomicLong c;
    final rx.R.a d;
    final a e;
    final AtomicBoolean f;
    final w g;

    D(w w, b b1, X x, AtomicLong atomiclong, rx.R.a a1, a a2, AtomicBoolean atomicboolean)
    {
        g = w;
        a = b1;
        b = x;
        c = atomiclong;
        d = a1;
        e = a2;
        f = atomicboolean;
        super();
    }

    public final void call()
    {
        a.unsafeSubscribe(new E(this, b));
    }
}
