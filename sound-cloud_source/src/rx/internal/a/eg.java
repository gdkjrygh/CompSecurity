// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.concurrent.atomic.AtomicReference;
import rx.X;
import rx.b.g;
import rx.d.e;

// Referenced classes of package rx.internal.a:
//            ef

final class eg extends X
{

    final AtomicReference a;
    final e b;
    final ef c;

    eg(ef ef1, X x, AtomicReference atomicreference, e e1)
    {
        c = ef1;
        a = atomicreference;
        b = e1;
        super(x, true);
    }

    public final void onCompleted()
    {
        b.onCompleted();
        b.unsubscribe();
    }

    public final void onError(Throwable throwable)
    {
        b.onError(throwable);
        b.unsubscribe();
    }

    public final void onNext(Object obj)
    {
        Object obj1;
        obj1 = a.get();
        if (obj1 == ef.c)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        obj = c.a.call(obj, obj1);
        b.onNext(obj);
        return;
        obj;
        onError(((Throwable) (obj)));
        return;
    }
}
