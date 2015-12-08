// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.concurrent.atomic.AtomicLong;
import rx.Q;
import rx.X;

// Referenced classes of package rx.internal.a:
//            a

public final class v
    implements rx.b.f
{
    private static final class a extends AtomicLong
        implements Q
    {

        private final X a;
        private final int b;
        private long c;

        public final void a(long l)
        {
            if (get() != 0x7fffffffffffffffL) goto _L2; else goto _L1
_L1:
            return;
_L2:
            X x;
            long l1;
            if (l != 0x7fffffffffffffffL || !compareAndSet(0L, 0x7fffffffffffffffL))
            {
                continue; /* Loop/switch isn't completed */
            }
            l1 = b;
            x = a;
            l = c;
_L4:
            if (l == 1L + l1)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (x.isUnsubscribed()) goto _L1; else goto _L3
_L3:
            x.onNext(Integer.valueOf((int)l));
            l++;
              goto _L4
            if (x.isUnsubscribed()) goto _L1; else goto _L5
_L5:
            x.onCompleted();
            return;
            if (l <= 0L || rx.internal.a.a.a(this, l) != 0L) goto _L1; else goto _L6
_L6:
            long l2 = c;
            l1 = l;
            l = l2;
_L10:
            boolean flag;
            long l3;
            long l4 = ((long)b - l) + 1L;
            l3 = Math.min(l4, l1);
            if (l4 <= l1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            l1 = l3 + l;
            x = a;
_L8:
            if (l == l1)
            {
                break MISSING_BLOCK_LABEL_198;
            }
            if (x.isUnsubscribed()) goto _L1; else goto _L7
_L7:
            x.onNext(Integer.valueOf((int)l));
            l++;
              goto _L8
label0:
            {
                if (!flag)
                {
                    break label0;
                }
                if (!x.isUnsubscribed())
                {
                    x.onCompleted();
                    return;
                }
            }
              goto _L1
            c = l1;
            l3 = addAndGet(-l3);
            if (l3 == 0L) goto _L1; else goto _L9
_L9:
            l = l1;
            l1 = l3;
              goto _L10
        }

        private a(X x, int i, int j)
        {
            a = x;
            c = i;
            b = j;
        }

        a(X x, int i, int j, byte byte0)
        {
            this(x, i, j);
        }
    }


    private final int a;
    private final int b;

    public v(int i, int j)
    {
        a = i;
        b = j;
    }

    public final void call(Object obj)
    {
        obj = (X)obj;
        ((X) (obj)).setProducer(new a(((X) (obj)), a, b, (byte)0));
    }
}
