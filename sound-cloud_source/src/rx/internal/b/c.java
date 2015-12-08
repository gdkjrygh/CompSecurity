// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.b;

import java.util.concurrent.atomic.AtomicInteger;
import rx.Q;
import rx.X;
import rx.exceptions.Exceptions;
import rx.exceptions.OnErrorThrowable;

public final class c extends AtomicInteger
    implements Q
{

    final X a;
    Object b;

    public c(X x)
    {
        a = x;
    }

    private static void a(X x, Object obj)
    {
        if (!x.isUnsubscribed())
        {
            try
            {
                x.onNext(obj);
            }
            catch (Throwable throwable)
            {
                Exceptions.throwIfFatal(throwable);
                x.onError(OnErrorThrowable.addValueAsLastCause(throwable, obj));
                return;
            }
            if (!x.isUnsubscribed())
            {
                x.onCompleted();
                return;
            }
        }
    }

    public final void a(long l)
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException("n >= 0 required");
        }
        int i;
        if (l != 0L)
        {
            do
            {
                i = get();
                if (i != 0)
                {
                    continue;
                }
            } while (!compareAndSet(0, 2));
        }
        do
        {
            return;
        } while (i != 1 || !compareAndSet(1, 3));
        a(a, b);
    }

    public final void a(Object obj)
    {
_L4:
        int i = get();
        if (i != 0) goto _L2; else goto _L1
_L1:
        b = obj;
        if (!compareAndSet(0, 1)) goto _L4; else goto _L3
_L3:
        return;
_L2:
        if (i == 2 && compareAndSet(2, 3))
        {
            a(a, obj);
            return;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }
}
