// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import rx.Q;
import rx.X;
import rx.Y;
import rx.b.e;
import rx.b.f;
import rx.exceptions.MissingBackpressureException;
import rx.internal.util.unsafe.SpscArrayQueue;
import rx.internal.util.unsafe.UnsafeAccess;

// Referenced classes of package rx.internal.a:
//            bk, g

public final class bj
    implements rx.b.g
{
    static final class a extends AtomicLong
        implements Q, Y
    {

        final g a = rx.internal.a.g.a();
        final X b;
        final Q c;
        final Y d;
        final Queue e;
        volatile boolean f;
        boolean g;
        boolean h;

        final void a()
        {
            boolean flag = true;
            boolean flag1 = false;
            this;
            JVM INSTR monitorenter ;
            if (!g)
            {
                break MISSING_BLOCK_LABEL_21;
            }
            h = true;
            this;
            JVM INSTR monitorexit ;
            return;
            g = true;
            h = false;
            this;
            JVM INSTR monitorexit ;
_L14:
            long l;
            boolean flag2;
            boolean flag3;
            l = get();
            flag2 = f;
            flag3 = e.isEmpty();
            if (!flag2 || !flag3) goto _L2; else goto _L1
_L1:
            b.onCompleted();
            return;
            Exception exception;
            exception;
            flag = flag1;
_L12:
            if (flag) goto _L4; else goto _L3
_L3:
            this;
            JVM INSTR monitorenter ;
            g = false;
            this;
            JVM INSTR monitorexit ;
_L4:
            throw exception;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
_L2:
            if (l <= 0L) goto _L6; else goto _L5
_L5:
            Object obj = e.poll();
            if (obj == null) goto _L8; else goto _L7
_L7:
            b.onNext(rx.internal.a.g.e(obj));
_L9:
            l = get();
            long l1;
            if (l < 0L)
            {
                break; /* Loop/switch isn't completed */
            }
            l1 = l - 1L;
            if (l1 >= 0L)
            {
                continue; /* Loop/switch isn't completed */
            }
            throw new IllegalStateException((new StringBuilder("More produced (1) than requested (")).append(l).append(")").toString());
            if (!compareAndSet(l, l1)) goto _L9; else goto _L6
_L6:
            this;
            JVM INSTR monitorenter ;
            flag2 = h;
            if (flag2) goto _L11; else goto _L10
_L10:
            flag1 = flag;
            g = false;
            flag1 = flag;
            this;
            JVM INSTR monitorexit ;
            return;
_L15:
            flag1 = flag;
            this;
            JVM INSTR monitorexit ;
            throw obj;
            obj;
              goto _L12
_L8:
            if (!flag2) goto _L6; else goto _L13
_L13:
            b.onCompleted();
            return;
_L11:
            h = false;
            this;
            JVM INSTR monitorexit ;
              goto _L14
            obj;
            flag = false;
              goto _L15
            obj;
            this;
            JVM INSTR monitorexit ;
            throw obj;
            obj;
            flag = flag1;
              goto _L15
        }

        public final void a(long l)
        {
            long l1;
            long l3;
            do
            {
                l3 = get();
                if (l3 < 0L)
                {
                    return;
                }
                long l2 = l3 + l;
                l1 = l2;
                if (l2 < 0L)
                {
                    l1 = 0x7fffffffffffffffL;
                }
            } while (!compareAndSet(l3, l1));
            c.a(l);
            a();
        }

        public final void a(Object obj)
        {
            if (!e.offer(obj))
            {
                b.onError(new MissingBackpressureException());
                unsubscribe();
                return;
            } else
            {
                f = true;
                a();
                return;
            }
        }

        public final boolean isUnsubscribed()
        {
            return get() < 0L;
        }

        public final void unsubscribe()
        {
            if (get() != 0x8000000000000000L && getAndSet(0x8000000000000000L) != 0x8000000000000000L)
            {
                d.unsubscribe();
            }
        }

        public a(X x, Q q, Y y)
        {
            b = x;
            c = q;
            d = y;
            if (UnsafeAccess.isUnsafeAvailable())
            {
                x = new SpscArrayQueue(2);
            } else
            {
                x = new ConcurrentLinkedQueue();
            }
            e = x;
        }
    }


    final f a;
    final f b;
    final e c;

    public bj(f f, f f1, e e)
    {
        a = f;
        b = f1;
        c = e;
    }

    public final Object call(Object obj)
    {
        obj = (X)obj;
        bk bk1 = new bk(this, ((X) (obj)));
        ((X) (obj)).add(bk1);
        return bk1;
    }
}
