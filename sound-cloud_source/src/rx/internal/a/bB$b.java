// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.P;
import rx.Q;
import rx.X;
import rx.Y;

// Referenced classes of package rx.internal.a:
//            bB

static final class lazySet extends AtomicLong
    implements P, Q, Y
{

    static final Object h = new Object();
    final X a;
    nit> b;
    final AtomicReference c;
    Throwable d;
    volatile boolean e;
    boolean f;
    boolean g;

    private void a()
    {
        boolean flag1 = true;
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        if (!f)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        g = true;
        this;
        JVM INSTR monitorexit ;
        return;
        f = true;
        g = false;
        this;
        JVM INSTR monitorexit ;
_L14:
        long l = get();
        if (l == 0x8000000000000000L) goto _L2; else goto _L1
_L1:
        Object obj1 = c.get();
        Object obj;
        obj = obj1;
        if (l <= 0L)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        obj = obj1;
        if (obj1 == h)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        a.onNext(obj1);
        c.compareAndSet(obj1, h);
_L4:
        l = get();
        if (l < 0L)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!compareAndSet(l, l - 1L)) goto _L4; else goto _L3
_L3:
        obj = h;
        if (obj != h || !e) goto _L6; else goto _L5
_L5:
        obj = d;
        if (obj == null) goto _L8; else goto _L7
_L7:
        a.onError(((Throwable) (obj)));
_L6:
        this;
        JVM INSTR monitorenter ;
        if (g) goto _L10; else goto _L9
_L9:
        f = false;
        this;
        JVM INSTR monitorexit ;
        return;
_L15:
        flag1 = flag;
        this;
        JVM INSTR monitorexit ;
        Exception exception;
        throw exception;
        exception;
_L13:
        if (flag) goto _L12; else goto _L11
_L11:
        this;
        JVM INSTR monitorenter ;
        f = false;
        this;
        JVM INSTR monitorexit ;
_L12:
        throw exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
_L8:
        a.onCompleted();
          goto _L6
        exception;
          goto _L13
_L10:
        g = false;
        this;
        JVM INSTR monitorexit ;
          goto _L14
        exception;
        flag = false;
          goto _L15
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        return;
        exception;
        flag = flag1;
          goto _L15
    }

    public final void a(long l)
    {
        if (l < 0L) goto _L2; else goto _L1
_L1:
        long l3 = get();
        if (l3 != 0x8000000000000000L) goto _L3; else goto _L2
_L2:
        return;
_L3:
        long l1;
        if (l3 != 0xc000000000000000L)
        {
            break; /* Loop/switch isn't completed */
        }
        l1 = l;
_L5:
        if (compareAndSet(l3, l1))
        {
            if (l3 == 0xc000000000000000L)
            {
                b.request(0x7fffffffffffffffL);
            }
            a();
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
        long l2 = l3 + l;
        l1 = l2;
        if (l2 < 0L)
        {
            l1 = 0x7fffffffffffffffL;
        }
          goto _L5
        if (true) goto _L1; else goto _L6
_L6:
    }

    public final boolean isUnsubscribed()
    {
        return get() == 0x8000000000000000L;
    }

    public final void onCompleted()
    {
        e = true;
        a();
    }

    public final void onError(Throwable throwable)
    {
        d = throwable;
        e = true;
        a();
    }

    public final void onNext(Object obj)
    {
        c.lazySet(obj);
        a();
    }

    public final void unsubscribe()
    {
        if (get() >= 0L)
        {
            getAndSet(0x8000000000000000L);
        }
    }


    public (X x)
    {
        a = x;
        c = new AtomicReference(h);
        lazySet(0xc000000000000000L);
    }
}
