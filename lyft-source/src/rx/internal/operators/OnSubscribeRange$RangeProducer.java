// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import rx.Producer;
import rx.Subscriber;

// Referenced classes of package rx.internal.operators:
//            BackpressureUtils

final class <init> extends AtomicLong
    implements Producer
{

    private static final long serialVersionUID = 0x391941e9d0fd3194L;
    private final int end;
    private long index;
    private final Subscriber o;

    void fastpath()
    {
        Subscriber subscriber;
        long l;
        long l1;
        l1 = end;
        subscriber = o;
        l = index;
_L7:
        if (l == l1 + 1L) goto _L2; else goto _L1
_L1:
        if (!subscriber.isUnsubscribed()) goto _L4; else goto _L3
_L3:
        return;
_L4:
        subscriber.onNext(Integer.valueOf((int)l));
        l++;
        continue; /* Loop/switch isn't completed */
_L2:
        if (subscriber.isUnsubscribed()) goto _L3; else goto _L5
_L5:
        subscriber.onCompleted();
        return;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void request(long l)
    {
        if (get() != 0x7fffffffffffffffL)
        {
            if (l == 0x7fffffffffffffffL && compareAndSet(0L, 0x7fffffffffffffffL))
            {
                fastpath();
                return;
            }
            if (l > 0L && BackpressureUtils.getAndAddRequest(this, l) == 0L)
            {
                slowpath(l);
                return;
            }
        }
    }

    void slowpath(long l)
    {
        long l1;
        long l2 = index;
        l1 = l;
        l = l2;
_L8:
        Subscriber subscriber;
        boolean flag;
        long l3;
        long l4 = ((long)end - l) + 1L;
        l3 = Math.min(l4, l1);
        if (l4 <= l1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l1 = l3 + l;
        subscriber = o;
_L5:
        if (l == l1) goto _L2; else goto _L1
_L1:
        if (!subscriber.isUnsubscribed()) goto _L4; else goto _L3
_L3:
        return;
_L4:
        subscriber.onNext(Integer.valueOf((int)l));
        l++;
          goto _L5
_L2:
label0:
        {
            if (!flag)
            {
                break label0;
            }
            if (!subscriber.isUnsubscribed())
            {
                subscriber.onCompleted();
                return;
            }
        }
          goto _L3
        index = l1;
        l3 = addAndGet(-l3);
        if (l3 == 0L) goto _L3; else goto _L6
_L6:
        l = l1;
        l1 = l3;
        if (true) goto _L8; else goto _L7
_L7:
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
