// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import rx.Producer;

// Referenced classes of package rx.internal.operators:
//            BackpressureUtils

final class subscriber extends AtomicLong
    implements Producer
{

    private static final long serialVersionUID = 0xef25a88f94f52b91L;
    final r subscriber;

    public long produced(int i)
    {
        return addAndGet(-i);
    }

    public void request(long l)
    {
        if (l <= 0L) goto _L2; else goto _L1
_L1:
        if (get() != 0x7fffffffffffffffL) goto _L4; else goto _L3
_L3:
        return;
_L4:
        BackpressureUtils.getAndAddRequest(this, l);
        subscriber.emit();
        return;
_L2:
        if (l < 0L)
        {
            throw new IllegalArgumentException("n >= 0 required");
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public r(r r)
    {
        subscriber = r;
    }
}
