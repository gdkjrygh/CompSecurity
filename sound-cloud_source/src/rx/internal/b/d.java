// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.b;

import java.util.concurrent.atomic.AtomicBoolean;
import rx.Q;
import rx.X;
import rx.exceptions.Exceptions;
import rx.exceptions.OnErrorThrowable;

public final class d extends AtomicBoolean
    implements Q
{

    final X a;
    final Object b;

    public d(X x, Object obj)
    {
        a = x;
        b = obj;
    }

    public final void a(long l)
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException("n >= 0 required");
        }
        break MISSING_BLOCK_LABEL_16;
        if (l != 0L && compareAndSet(false, true))
        {
            X x = a;
            Object obj = b;
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
        return;
    }
}
