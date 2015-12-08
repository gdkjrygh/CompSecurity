// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.observers;

import rx.Observer;
import rx.exceptions.Exceptions;

public class SerializedObserver
    implements Observer
{
    private static final class ErrorSentinel
    {

        final Throwable e;

        ErrorSentinel(Throwable throwable)
        {
            e = throwable;
        }
    }

    static final class FastList
    {

        Object array[];
        int size;

        public void add(Object obj)
        {
            Object aobj1[];
            int i;
            i = size;
            aobj1 = array;
            if (aobj1 != null) goto _L2; else goto _L1
_L1:
            Object aobj[];
            aobj = new Object[16];
            array = aobj;
_L4:
            aobj[i] = obj;
            size = i + 1;
            return;
_L2:
            aobj = aobj1;
            if (i == aobj1.length)
            {
                aobj = new Object[(i >> 2) + i];
                System.arraycopy(((Object) (aobj1)), 0, ((Object) (aobj)), 0, i);
                array = aobj;
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        FastList()
        {
        }
    }


    private static final Object COMPLETE_SENTINEL = new Object();
    private static final int MAX_DRAIN_ITERATION = 0x7fffffff;
    private static final Object NULL_SENTINEL = new Object();
    private final Observer actual;
    private boolean emitting;
    private FastList queue;
    private boolean terminated;

    public SerializedObserver(Observer observer)
    {
        emitting = false;
        terminated = false;
        actual = observer;
    }

    void drainQueue(FastList fastlist)
    {
        if (fastlist != null && fastlist.size != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i;
        int j;
        fastlist = ((FastList) (fastlist.array));
        j = fastlist.length;
        i = 0;
_L5:
        if (i >= j) goto _L1; else goto _L3
_L3:
        Object obj = fastlist[i];
        if (obj == null) goto _L1; else goto _L4
_L4:
        if (obj == NULL_SENTINEL)
        {
            actual.onNext(null);
        } else
        if (obj == COMPLETE_SENTINEL)
        {
            actual.onCompleted();
        } else
        if (obj.getClass() == rx/observers/SerializedObserver$ErrorSentinel)
        {
            actual.onError(((ErrorSentinel)obj).e);
        } else
        {
            actual.onNext(obj);
        }
        i++;
          goto _L5
    }

    public void onCompleted()
    {
        this;
        JVM INSTR monitorenter ;
        if (!terminated)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        terminated = true;
        if (!emitting)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        if (queue == null)
        {
            queue = new FastList();
        }
        queue.add(COMPLETE_SENTINEL);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        FastList fastlist;
        emitting = true;
        fastlist = queue;
        queue = null;
        this;
        JVM INSTR monitorexit ;
        drainQueue(fastlist);
        actual.onCompleted();
        return;
    }

    public void onError(Throwable throwable)
    {
        Exceptions.throwIfFatal(throwable);
        this;
        JVM INSTR monitorenter ;
        if (!terminated)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        if (!emitting)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        if (queue == null)
        {
            queue = new FastList();
        }
        queue.add(new ErrorSentinel(throwable));
        this;
        JVM INSTR monitorexit ;
        return;
        throwable;
        this;
        JVM INSTR monitorexit ;
        throw throwable;
        FastList fastlist;
        emitting = true;
        fastlist = queue;
        queue = null;
        this;
        JVM INSTR monitorexit ;
        drainQueue(fastlist);
        actual.onError(throwable);
        this;
        JVM INSTR monitorenter ;
        emitting = false;
        this;
        JVM INSTR monitorexit ;
        return;
        throwable;
        this;
        JVM INSTR monitorexit ;
        throw throwable;
    }

    public void onNext(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        if (!terminated)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        FastList fastlist;
        if (!emitting)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        if (queue == null)
        {
            queue = new FastList();
        }
        fastlist = queue;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
_L1:
        fastlist.add(obj);
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj = NULL_SENTINEL;
          goto _L1
        FastList fastlist2;
        emitting = true;
        fastlist2 = queue;
        queue = null;
        this;
        JVM INSTR monitorexit ;
        int i;
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = false;
        i = 0x7fffffff;
_L10:
        int j = ((flag1) ? 1 : 0);
        drainQueue(fastlist2);
        if (i != 0x7fffffff)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        j = ((flag1) ? 1 : 0);
        actual.onNext(obj);
        int k;
        k = i - 1;
        fastlist = fastlist2;
        if (k <= 0) goto _L3; else goto _L2
_L2:
        j = ((flag1) ? 1 : 0);
        this;
        JVM INSTR monitorenter ;
        i = ((flag) ? 1 : 0);
        fastlist = queue;
        i = ((flag) ? 1 : 0);
        queue = null;
        if (fastlist != null) goto _L5; else goto _L4
_L4:
        i = ((flag) ? 1 : 0);
        emitting = false;
        i = 1;
        this;
        JVM INSTR monitorexit ;
        if (true) goto _L7; else goto _L6
_L6:
        this;
        JVM INSTR monitorenter ;
        if (!terminated)
        {
            break MISSING_BLOCK_LABEL_209;
        }
        obj = queue;
        queue = null;
_L8:
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        emitting = false;
          goto _L8
_L5:
        i = ((flag) ? 1 : 0);
        this;
        JVM INSTR monitorexit ;
_L3:
        i = k;
        fastlist2 = fastlist;
        if (k > 0) goto _L10; else goto _L9
_L9:
        obj = fastlist;
        if (false) goto _L12; else goto _L11
_L11:
        this;
        JVM INSTR monitorenter ;
        if (!terminated) goto _L14; else goto _L13
_L13:
        obj = queue;
        queue = null;
_L21:
        this;
        JVM INSTR monitorexit ;
_L12:
        drainQueue(((FastList) (obj)));
        return;
        obj;
        this;
        JVM INSTR monitorexit ;
        j = i;
        throw obj;
        obj;
        if (j != 0) goto _L16; else goto _L15
_L15:
        this;
        JVM INSTR monitorenter ;
        if (!terminated) goto _L18; else goto _L17
_L17:
        FastList fastlist1 = queue;
        queue = null;
_L19:
        this;
        JVM INSTR monitorexit ;
_L16:
        throw obj;
_L14:
        emitting = false;
        obj = null;
        continue; /* Loop/switch isn't completed */
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
_L18:
        emitting = false;
          goto _L19
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
_L7:
        return;
        if (true) goto _L21; else goto _L20
_L20:
    }

}
