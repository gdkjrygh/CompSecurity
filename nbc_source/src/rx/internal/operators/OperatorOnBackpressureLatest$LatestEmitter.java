// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.Observer;
import rx.Producer;
import rx.Subscriber;
import rx.Subscription;

// Referenced classes of package rx.internal.operators:
//            OperatorOnBackpressureLatest

static final class lazySet extends AtomicLong
    implements Observer, Producer, Subscription
{

    static final Object EMPTY = new Object();
    static final long NOT_REQUESTED = 0xc000000000000000L;
    private static final long serialVersionUID = 0xed10b32c1f7b675eL;
    final Subscriber child;
    volatile boolean done;
    boolean emitting;
    boolean missed;
    er parent;
    Throwable terminal;
    final AtomicReference value;

    void emit()
    {
        this;
        JVM INSTR monitorenter ;
        if (!emitting)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        missed = true;
        this;
        JVM INSTR monitorexit ;
        return;
        emitting = true;
        missed = false;
        this;
        JVM INSTR monitorexit ;
        boolean flag1;
        boolean flag2;
        flag2 = false;
        flag1 = false;
_L11:
        boolean flag = flag2;
        long l = get();
        if (l != 0x8000000000000000L) goto _L2; else goto _L1
_L1:
        if (true)
        {
            break; /* Loop/switch isn't completed */
        }
        this;
        JVM INSTR monitorenter ;
        emitting = false;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        flag = flag2;
        Object obj1 = value.get();
        Object obj;
        obj = obj1;
        if (l <= 0L)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        obj = obj1;
        flag = flag2;
        if (obj1 == EMPTY)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        flag = flag2;
        child.onNext(obj1);
        flag = flag2;
        value.compareAndSet(obj1, EMPTY);
        flag = flag2;
        produced(1L);
        flag = flag2;
        obj = EMPTY;
        flag = flag2;
        if (obj != EMPTY) goto _L4; else goto _L3
_L3:
        flag = flag2;
        if (!done) goto _L4; else goto _L5
_L5:
        flag = flag2;
        obj = terminal;
        if (obj == null) goto _L7; else goto _L6
_L6:
        flag = flag2;
        child.onError(((Throwable) (obj)));
_L4:
        flag = flag2;
        this;
        JVM INSTR monitorenter ;
        flag = flag1;
        if (missed)
        {
            break MISSING_BLOCK_LABEL_258;
        }
        flag = flag1;
        emitting = false;
        flag = true;
        this;
        JVM INSTR monitorexit ;
          goto _L1
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        if (flag) goto _L9; else goto _L8
_L8:
        this;
        JVM INSTR monitorenter ;
        emitting = false;
        this;
        JVM INSTR monitorexit ;
_L9:
        throw obj;
_L7:
        flag = flag2;
        child.onCompleted();
          goto _L4
        flag = flag1;
        missed = false;
        flag = flag1;
        this;
        JVM INSTR monitorexit ;
        if (true) goto _L11; else goto _L10
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
_L10:
    }

    public boolean isUnsubscribed()
    {
        return get() == 0x8000000000000000L;
    }

    public void onCompleted()
    {
        done = true;
        emit();
    }

    public void onError(Throwable throwable)
    {
        terminal = throwable;
        done = true;
        emit();
    }

    public void onNext(Object obj)
    {
        value.lazySet(obj);
        emit();
    }

    long produced(long l)
    {
        long l1;
        long l2;
        do
        {
            l1 = get();
            if (l1 < 0L)
            {
                return l1;
            }
            l2 = l1 - l;
        } while (!compareAndSet(l1, l2));
        return l2;
    }

    public void request(long l)
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
                parent.requestMore(0x7fffffffffffffffL);
            }
            emit();
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

    public void unsubscribe()
    {
        if (get() >= 0L)
        {
            getAndSet(0x8000000000000000L);
        }
    }


    public er(Subscriber subscriber)
    {
        child = subscriber;
        value = new AtomicReference(EMPTY);
        lazySet(0xc000000000000000L);
    }
}
