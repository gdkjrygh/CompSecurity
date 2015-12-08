// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import rx.b.a;
import rx.h.b;

// Referenced classes of package rx.internal.a:
//            H

final class K
    implements a
{

    final b a;
    final H b;

    K(H h, b b1)
    {
        b = h;
        a = b1;
        super();
    }

    public final void call()
    {
        b.c.lock();
        if (b.a == a && b.b.decrementAndGet() == 0)
        {
            b.a.unsubscribe();
            b.a = new b();
        }
        b.c.unlock();
        return;
        Exception exception;
        exception;
        b.c.unlock();
        throw exception;
    }
}
