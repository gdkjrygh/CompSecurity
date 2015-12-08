// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import rx.X;
import rx.e.d;

// Referenced classes of package rx.internal.a:
//            bq

public final class bp
    implements rx.b.g
{
    private static final class a
    {

        public static final bp a = new bp((byte)0);

    }

    private static class b extends X
    {

        static final AtomicLongFieldUpdater a = AtomicLongFieldUpdater.newUpdater(rx/internal/a/bp$b, "f");
        private final X b;
        private volatile rx.a c;
        private boolean d;
        private boolean e;
        private volatile long f;

        final void a()
        {
            this;
            JVM INSTR monitorenter ;
            if (!d)
            {
                break MISSING_BLOCK_LABEL_17;
            }
            e = true;
            this;
            JVM INSTR monitorexit ;
            return;
            this;
            JVM INSTR monitorexit ;
_L2:
            if (b.isUnsubscribed())
            {
                break; /* Loop/switch isn't completed */
            }
            rx.a a1 = c;
            if (a1 != null && f > 0L)
            {
                c = null;
                b.onNext(a1);
                if (!b.isUnsubscribed())
                {
                    b.onCompleted();
                    return;
                }
                break; /* Loop/switch isn't completed */
            }
            break MISSING_BLOCK_LABEL_83;
            Exception exception;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
            this;
            JVM INSTR monitorenter ;
            if (e)
            {
                break MISSING_BLOCK_LABEL_105;
            }
            d = false;
            this;
            JVM INSTR monitorexit ;
            return;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
            this;
            JVM INSTR monitorexit ;
            if (true) goto _L2; else goto _L1
_L1:
        }

        public void onCompleted()
        {
            c = rx.a.a();
            a();
        }

        public void onError(Throwable throwable)
        {
            c = rx.a.a(throwable);
            rx.e.d.a().b();
            a();
        }

        public void onNext(Object obj)
        {
            b.onNext(rx.a.a(obj));
            long l;
            do
            {
                l = f;
            } while (l != 0x7fffffffffffffffL && !a.compareAndSet(this, l, l - 1L));
        }

        public void onStart()
        {
            request(0L);
        }


        b(X x)
        {
            d = false;
            e = false;
            b = x;
        }
    }


    private bp()
    {
    }

    bp(byte byte0)
    {
        this();
    }

    public final Object call(Object obj)
    {
        obj = (X)obj;
        b b1 = new b(((X) (obj)));
        ((X) (obj)).add(b1);
        ((X) (obj)).setProducer(new bq(this, b1));
        return b1;
    }
}
