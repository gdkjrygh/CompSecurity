// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import rx.X;
import rx.b.a;

// Referenced classes of package rx.internal.a:
//            ck

static final class c extends X
    implements a
{

    static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(rx/internal/a/ck$a, java/lang/Object, "a");
    private static final Object d = new Object();
    volatile Object a;
    private final X c;

    public final void call()
    {
        Object obj;
        obj = b.getAndSet(this, d);
        if (obj == d)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        c.onNext(obj);
        return;
        Throwable throwable;
        throwable;
        onError(throwable);
        return;
    }

    public final void onCompleted()
    {
        c.onCompleted();
        unsubscribe();
    }

    public final void onError(Throwable throwable)
    {
        c.onError(throwable);
        unsubscribe();
    }

    public final void onNext(Object obj)
    {
        a = obj;
    }

    public final void onStart()
    {
        request(0x7fffffffffffffffL);
    }


    public (X x)
    {
        a = d;
        c = x;
    }
}
