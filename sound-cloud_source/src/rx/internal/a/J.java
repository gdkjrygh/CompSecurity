// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import rx.X;
import rx.h.b;

// Referenced classes of package rx.internal.a:
//            H

final class J extends X
{

    final X a;
    final b b;
    final H c;

    J(H h, X x, X x1, b b1)
    {
        c = h;
        a = x1;
        b = b1;
        super(x);
    }

    private void a()
    {
        c.c.lock();
        if (c.a == b)
        {
            c.a.unsubscribe();
            c.a = new b();
            c.b.set(0);
        }
        c.c.unlock();
        return;
        Exception exception;
        exception;
        c.c.unlock();
        throw exception;
    }

    public final void onCompleted()
    {
        a();
        a.onCompleted();
    }

    public final void onError(Throwable throwable)
    {
        a();
        a.onError(throwable);
    }

    public final void onNext(Object obj)
    {
        a.onNext(obj);
    }
}
