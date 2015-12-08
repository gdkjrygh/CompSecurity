// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.observers;

import rx.Observer;
import rx.exceptions.Exceptions;
import rx.exceptions.OnErrorThrowable;
import rx.internal.operators.NotificationLite;

public class SerializedObserver
    implements Observer
{

    private static final int MAX_DRAIN_ITERATION = 1024;
    private final Observer actual;
    private boolean emitting;
    private final NotificationLite nl = NotificationLite.instance();
    private FastList queue;
    private volatile boolean terminated;

    public SerializedObserver(Observer observer)
    {
        actual = observer;
    }

    public void onCompleted()
    {
        if (terminated)
        {
            return;
        }
        this;
        JVM INSTR monitorenter ;
        if (!terminated)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        FastList fastlist1;
        terminated = true;
        if (!emitting)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        fastlist1 = queue;
        FastList fastlist;
        fastlist = fastlist1;
        if (fastlist1 != null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        fastlist = new FastList();
        queue = fastlist;
        fastlist.add(nl.completed());
        this;
        JVM INSTR monitorexit ;
        return;
        emitting = true;
        this;
        JVM INSTR monitorexit ;
        actual.onCompleted();
        return;
    }

    public void onError(Throwable throwable)
    {
        Exceptions.throwIfFatal(throwable);
        if (terminated)
        {
            return;
        }
        this;
        JVM INSTR monitorenter ;
        if (!terminated)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        throwable;
        this;
        JVM INSTR monitorexit ;
        throw throwable;
        FastList fastlist1;
        terminated = true;
        if (!emitting)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        fastlist1 = queue;
        FastList fastlist;
        fastlist = fastlist1;
        if (fastlist1 != null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        fastlist = new FastList();
        queue = fastlist;
        fastlist.add(nl.error(throwable));
        this;
        JVM INSTR monitorexit ;
        return;
        emitting = true;
        this;
        JVM INSTR monitorexit ;
        actual.onError(throwable);
        return;
    }

    public void onNext(Object obj)
    {
        if (terminated)
        {
            return;
        }
        this;
        JVM INSTR monitorenter ;
        if (!terminated)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        Object obj2;
        if (!emitting)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        obj2 = queue;
        Object obj1;
        obj1 = obj2;
        if (obj2 != null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        obj1 = new FastList();
        queue = ((FastList) (obj1));
        ((FastList) (obj1)).add(nl.next(obj));
        this;
        JVM INSTR monitorexit ;
        return;
        emitting = true;
        this;
        JVM INSTR monitorexit ;
        int i;
        try
        {
            actual.onNext(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            terminated = true;
            Exceptions.throwIfFatal(((Throwable) (obj1)));
            actual.onError(OnErrorThrowable.addValueAsLastCause(((Throwable) (obj1)), obj));
            return;
        }
_L7:
        i = 0;
_L2:
        if (i >= 1024)
        {
            continue; /* Loop/switch isn't completed */
        }
        this;
        JVM INSTR monitorenter ;
        obj1 = queue;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_148;
        }
        emitting = false;
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        queue = null;
        this;
        JVM INSTR monitorexit ;
        Object aobj[];
        int j;
        int k;
        aobj = ((FastList) (obj1)).array;
        k = aobj.length;
        j = 0;
_L4:
label0:
        {
            if (j < k)
            {
                obj2 = aobj[j];
                if (obj2 != null)
                {
                    break label0;
                }
            }
            i++;
        }
        if (true) goto _L2; else goto _L1
_L1:
        try
        {
            if (nl.accept(actual, obj2))
            {
                terminated = true;
                return;
            }
        }
        catch (Throwable throwable)
        {
            terminated = true;
            Exceptions.throwIfFatal(throwable);
            actual.onError(OnErrorThrowable.addValueAsLastCause(throwable, obj));
            return;
        }
        j++;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L2; else goto _L5
_L5:
        if (true) goto _L7; else goto _L6
_L6:
    }

    private class FastList
    {

        Object array[];
        int size;

        public void add(Object obj)
        {
            Object aobj[];
            int i;
            i = size;
            aobj = array;
            if (aobj != null) goto _L2; else goto _L1
_L1:
            aobj = new Object[16];
            array = aobj;
_L4:
            aobj[i] = obj;
            size = i + 1;
            return;
_L2:
            if (i == aobj.length)
            {
                Object aobj1[] = new Object[(i >> 2) + i];
                System.arraycopy(((Object) (aobj)), 0, ((Object) (aobj1)), 0, i);
                array = aobj1;
                aobj = aobj1;
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        FastList()
        {
        }
    }

}
