// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.concurrent.atomic.AtomicBoolean;
import rx.X;

// Referenced classes of package rx.internal.a:
//            cC

final class cE extends X
{

    final AtomicBoolean a;
    final X b;
    final cC c;

    cE(cC cc, X x, AtomicBoolean atomicboolean, X x1)
    {
        c = cc;
        a = atomicboolean;
        b = x1;
        super(x);
    }

    public final void onCompleted()
    {
        b.onCompleted();
        unsubscribe();
        return;
        Exception exception;
        exception;
        unsubscribe();
        throw exception;
    }

    public final void onError(Throwable throwable)
    {
        b.onError(throwable);
        unsubscribe();
        return;
        throwable;
        unsubscribe();
        throw throwable;
    }

    public final void onNext(Object obj)
    {
        if (a.get())
        {
            b.onNext(obj);
        }
    }
}
