// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import rx.Producer;

public final class BackpressureDrainManager
    implements Producer
{
    public static interface BackpressureQueueCallback
    {

        public abstract boolean accept(Object obj);

        public abstract void complete(Throwable throwable);

        public abstract Object peek();

        public abstract Object poll();
    }


    protected static final AtomicLongFieldUpdater REQUESTED_COUNT = AtomicLongFieldUpdater.newUpdater(rx/internal/util/BackpressureDrainManager, "requestedCount");
    protected final BackpressureQueueCallback actual;
    protected boolean emitting;
    protected Throwable exception;
    protected volatile long requestedCount;
    protected volatile boolean terminated;

    public BackpressureDrainManager(BackpressureQueueCallback backpressurequeuecallback)
    {
        actual = backpressurequeuecallback;
    }

    public final void drain()
    {
        this;
        JVM INSTR monitorenter ;
        if (!emitting)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        boolean flag3;
        emitting = true;
        flag3 = terminated;
        this;
        JVM INSTR monitorexit ;
        int i;
        boolean flag1;
        boolean flag2;
        long l;
        l = requestedCount;
        flag2 = false;
        flag1 = false;
        i = ((flag2) ? 1 : 0);
        Object obj = actual;
          goto _L1
_L23:
        if (!flag3) goto _L3; else goto _L2
_L2:
        i = ((flag2) ? 1 : 0);
        if (((BackpressureQueueCallback) (obj)).peek() != null) goto _L5; else goto _L4
_L4:
        i = 1;
        ((BackpressureQueueCallback) (obj)).complete(exception);
        if (true) goto _L7; else goto _L6
_L6:
        this;
        JVM INSTR monitorenter ;
        emitting = false;
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
_L5:
        if (l != 0L) goto _L3; else goto _L8
_L8:
        i = ((flag2) ? 1 : 0);
        this;
        JVM INSTR monitorenter ;
        i = ((flag1) ? 1 : 0);
        flag3 = terminated;
        i = ((flag1) ? 1 : 0);
        int j;
        boolean flag;
        Exception exception1;
        Object obj1;
        boolean flag4;
        if (((BackpressureQueueCallback) (obj)).peek() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i = ((flag1) ? 1 : 0);
        if (requestedCount != 0x7fffffffffffffffL) goto _L10; else goto _L9
_L9:
        if (flag || flag3) goto _L12; else goto _L11
_L11:
        j = 1;
        i = j;
        emitting = false;
        i = j;
        this;
        JVM INSTR monitorexit ;
        if (true) goto _L7; else goto _L13
_L13:
        this;
        JVM INSTR monitorenter ;
        emitting = false;
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
_L3:
        i = ((flag2) ? 1 : 0);
        obj1 = ((BackpressureQueueCallback) (obj)).poll();
        if (obj1 == null) goto _L8; else goto _L14
_L14:
        i = ((flag2) ? 1 : 0);
        flag4 = ((BackpressureQueueCallback) (obj)).accept(obj1);
        if (!flag4) goto _L16; else goto _L15
_L15:
        if (true) goto _L7; else goto _L17
_L17:
        this;
        JVM INSTR monitorenter ;
        emitting = false;
        this;
        JVM INSTR monitorexit ;
        return;
        exception1;
        this;
        JVM INSTR monitorexit ;
        throw exception1;
_L16:
        l--;
        j++;
        continue; /* Loop/switch isn't completed */
_L12:
        l = 0x7fffffffffffffffL;
_L21:
        i = ((flag1) ? 1 : 0);
        this;
        JVM INSTR monitorexit ;
          goto _L1
        Exception exception2;
        exception2;
        this;
        JVM INSTR monitorexit ;
        throw exception2;
        exception2;
        if (i != 0) goto _L19; else goto _L18
_L18:
        this;
        JVM INSTR monitorenter ;
        emitting = false;
        this;
        JVM INSTR monitorexit ;
_L19:
        throw exception2;
_L10:
        i = ((flag1) ? 1 : 0);
        long l1 = REQUESTED_COUNT.addAndGet(this, -j);
        if (l1 == 0L)
        {
            break; /* Loop/switch isn't completed */
        }
        l = l1;
        if (flag) goto _L21; else goto _L20
_L25:
        j = 1;
        i = j;
        emitting = false;
        i = j;
        this;
        JVM INSTR monitorexit ;
        if (true) goto _L7; else goto _L22
_L22:
        this;
        JVM INSTR monitorenter ;
        emitting = false;
        this;
        JVM INSTR monitorexit ;
        return;
        exception2;
        this;
        JVM INSTR monitorexit ;
        throw exception2;
        exception2;
        this;
        JVM INSTR monitorexit ;
        throw exception2;
_L7:
        return;
_L1:
        j = 0;
        if (l <= 0L && !flag3) goto _L8; else goto _L23
_L20:
        if (!flag3) goto _L25; else goto _L24
_L24:
        l = l1;
        if (!flag) goto _L21; else goto _L25
    }

    public final boolean isTerminated()
    {
        return terminated;
    }

    public final void request(long l)
    {
        if (l != 0L) goto _L2; else goto _L1
_L1:
        return;
_L2:
        boolean flag;
        long l2;
        l2 = requestedCount;
        if (l2 == 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (l2 != 0x7fffffffffffffffL) goto _L4; else goto _L3
_L3:
        if (flag)
        {
            drain();
            return;
        }
          goto _L1
_L4:
        long l1;
        if (l == 0x7fffffffffffffffL)
        {
            l1 = l;
            flag = true;
        } else
        if (l2 > 0x7fffffffffffffffL - l)
        {
            l1 = 0x7fffffffffffffffL;
        } else
        {
            l1 = l2 + l;
        }
        if (!REQUESTED_COUNT.compareAndSet(this, l2, l1)) goto _L2; else goto _L3
    }

    public final void terminate()
    {
        terminated = true;
    }

    public final void terminate(Throwable throwable)
    {
        if (!terminated)
        {
            exception = throwable;
            terminated = true;
        }
    }

    public final void terminateAndDrain()
    {
        terminated = true;
        drain();
    }

    public final void terminateAndDrain(Throwable throwable)
    {
        if (!terminated)
        {
            exception = throwable;
            terminated = true;
            drain();
        }
    }

}
