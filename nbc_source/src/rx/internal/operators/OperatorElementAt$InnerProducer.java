// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import rx.Producer;

// Referenced classes of package rx.internal.operators:
//            OperatorElementAt

static class actual extends AtomicBoolean
    implements Producer
{

    private static final long serialVersionUID = 1L;
    final Producer actual;

    public void request(long l)
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException("n >= 0 required");
        }
        if (l > 0L && compareAndSet(false, true))
        {
            actual.request(0x7fffffffffffffffL);
        }
    }

    public (Producer producer)
    {
        actual = producer;
    }
}
