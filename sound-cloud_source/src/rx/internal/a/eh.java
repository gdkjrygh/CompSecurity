// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.concurrent.atomic.AtomicReference;
import rx.X;
import rx.d.e;

// Referenced classes of package rx.internal.a:
//            ef

final class eh extends X
{

    final AtomicReference a;
    final e b;
    final ef c;

    eh(ef ef1, AtomicReference atomicreference, e e1)
    {
        c = ef1;
        a = atomicreference;
        b = e1;
        super();
    }

    public final void onCompleted()
    {
        if (a.get() == ef.c)
        {
            b.onCompleted();
            b.unsubscribe();
        }
    }

    public final void onError(Throwable throwable)
    {
        b.onError(throwable);
        b.unsubscribe();
    }

    public final void onNext(Object obj)
    {
        a.set(obj);
    }
}
