// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import rx.b;
import rx.b.a;
import rx.h.e;

// Referenced classes of package rx.internal.a:
//            cg

final class cf
    implements a
{

    final b a;
    final ce.a b;

    cf(ce.a a1, b b1)
    {
        b = a1;
        a = b1;
        super();
    }

    public final void call()
    {
        ce.a.g.incrementAndGet(b);
        cg cg1 = new cg(this, this);
        b.d.a(cg1);
        a.unsafeSubscribe(cg1);
    }
}
