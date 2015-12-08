// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import rx.Q;
import rx.X;

// Referenced classes of package rx.internal.a:
//            a

public final class s
    implements rx.b.f
{
    private static final class a extends AtomicLong
        implements Q
    {

        private final X a;
        private final Iterator b;

        public final void a(long l)
        {
            if (get() != 0x7fffffffffffffffL)
            {
                if (l != 0x7fffffffffffffffL || !compareAndSet(0L, 0x7fffffffffffffffL))
                {
                    continue;
                }
                x = a;
                Iterator iterator = b;
                while (!x.isUnsubscribed()) 
                {
                    if (!iterator.hasNext())
                    {
                        continue;
                    }
                    x.onNext(iterator.next());
                }
            }
_L2:
            X x1;
            Iterator iterator1;
            do
            {
                X x;
                do
                {
                    return;
                } while (x.isUnsubscribed());
                x.onCompleted();
                return;
            } while (l <= 0L || rx.internal.a.a.a(this, l) != 0L);
            x1 = a;
            iterator1 = b;
_L4:
            long l1 = l;
            while (!x1.isUnsubscribed()) 
            {
                if (!iterator1.hasNext())
                {
                    continue; /* Loop/switch isn't completed */
                }
                l1--;
                if (l1 < 0L)
                {
                    break MISSING_BLOCK_LABEL_171;
                }
                x1.onNext(iterator1.next());
            }
            if (true) goto _L2; else goto _L1
_L1:
            if (x1.isUnsubscribed()) goto _L2; else goto _L3
_L3:
            x1.onCompleted();
            return;
            long l2 = addAndGet(-l);
            l = l2;
            if (l2 == 0L)
            {
                return;
            }
              goto _L4
        }

        private a(X x, Iterator iterator)
        {
            a = x;
            b = iterator;
        }

        a(X x, Iterator iterator, byte byte0)
        {
            this(x, iterator);
        }
    }


    final Iterable a;

    public s(Iterable iterable)
    {
        if (iterable == null)
        {
            throw new NullPointerException("iterable must not be null");
        } else
        {
            a = iterable;
            return;
        }
    }

    public final void call(Object obj)
    {
        obj = (X)obj;
        Iterator iterator = a.iterator();
        if (!iterator.hasNext() && !((X) (obj)).isUnsubscribed())
        {
            ((X) (obj)).onCompleted();
            return;
        } else
        {
            ((X) (obj)).setProducer(new a(((X) (obj)), iterator, (byte)0));
            return;
        }
    }
}
