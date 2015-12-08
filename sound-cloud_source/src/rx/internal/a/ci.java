// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.concurrent.atomic.AtomicReference;
import rx.X;
import rx.d.e;

// Referenced classes of package rx.internal.a:
//            ch

final class ci extends X
{

    final AtomicReference a;
    final e b;
    final ch c;

    ci(ch ch1, X x, AtomicReference atomicreference, e e1)
    {
        c = ch1;
        a = atomicreference;
        b = e1;
        super(x);
    }

    public final void onCompleted()
    {
        b.onCompleted();
        unsubscribe();
    }

    public final void onError(Throwable throwable)
    {
        b.onError(throwable);
        unsubscribe();
    }

    public final void onNext(Object obj)
    {
        obj = a.getAndSet(ch.b);
        if (obj != ch.b)
        {
            b.onNext(obj);
        }
    }
}
