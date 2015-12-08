// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.X;
import rx.b.a;

// Referenced classes of package rx.internal.a:
//            P

final class Q
    implements a
{

    long a;
    final X b;
    final rx.R.a c;
    final P d;

    Q(P p, X x, rx.R.a a1)
    {
        d = p;
        b = x;
        c = a1;
        super();
    }

    public final void call()
    {
        X x = b;
        long l = a;
        a = 1L + l;
        x.onNext(Long.valueOf(l));
        return;
        Object obj;
        obj;
        b.onError(((Throwable) (obj)));
        c.unsubscribe();
        return;
        obj;
        c.unsubscribe();
        throw obj;
    }
}
