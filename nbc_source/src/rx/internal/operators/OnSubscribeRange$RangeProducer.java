// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import rx.Producer;
import rx.Subscriber;

// Referenced classes of package rx.internal.operators:
//            OnSubscribeRange, BackpressureUtils

private static final class <init>
    implements Producer
{

    private static final AtomicLongFieldUpdater REQUESTED_UPDATER = AtomicLongFieldUpdater.newUpdater(rx/internal/operators/OnSubscribeRange$RangeProducer, "requested");
    private final int end;
    private long index;
    private final Subscriber o;
    private volatile long requested;

    public void request(long l)
    {
        if (requested != 0x7fffffffffffffffL) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (l != 0x7fffffffffffffffL || !REQUESTED_UPDATER.compareAndSet(this, 0L, 0x7fffffffffffffffL))
        {
            continue; /* Loop/switch isn't completed */
        }
        l = index;
_L4:
        if (l > (long)end)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (o.isUnsubscribed()) goto _L1; else goto _L3
_L3:
        o.onNext(Integer.valueOf((int)l));
        l++;
          goto _L4
        if (o.isUnsubscribed()) goto _L1; else goto _L5
_L5:
        o.onCompleted();
        return;
        if (l <= 0L || BackpressureUtils.getAndAddRequest(REQUESTED_UPDATER, this, l) != 0L) goto _L1; else goto _L6
_L6:
        boolean flag;
        long l1;
        long l2;
        l2 = requested;
        l = index;
        long l3 = ((long)end - l) + 1L;
        l1 = Math.min(l3, l2);
        if (l3 <= l2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l2 = l1 + l;
_L8:
        if (l >= l2)
        {
            break MISSING_BLOCK_LABEL_203;
        }
        if (o.isUnsubscribed()) goto _L1; else goto _L7
_L7:
        o.onNext(Integer.valueOf((int)l));
        l++;
          goto _L8
        index = l2;
        if (flag)
        {
            o.onCompleted();
            return;
        }
        if (REQUESTED_UPDATER.addAndGet(this, -l1) == 0L)
        {
            return;
        }
          goto _L6
    }


    private (Subscriber subscriber, int i, int j)
    {
        o = subscriber;
        index = i;
        end = j;
    }

    end(Subscriber subscriber, int i, int j, end end1)
    {
        this(subscriber, i, j);
    }
}
