// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Subscriber;

// Referenced classes of package rx.internal.operators:
//            OperatorDebounceWithTime

static final class 
{

    boolean emitting;
    boolean hasValue;
    int index;
    boolean terminate;
    Object value;

    public void clear()
    {
        this;
        JVM INSTR monitorenter ;
        index = index + 1;
        value = null;
        hasValue = false;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void emit(int i, Subscriber subscriber, Subscriber subscriber1)
    {
        this;
        JVM INSTR monitorenter ;
        if (!emitting && hasValue && i == index)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj = value;
        value = null;
        hasValue = false;
        emitting = true;
        this;
        JVM INSTR monitorexit ;
        try
        {
            subscriber.onNext(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Subscriber subscriber)
        {
            subscriber1.onError(subscriber);
            return;
        }
        this;
        JVM INSTR monitorenter ;
        if (terminate)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        emitting = false;
        this;
        JVM INSTR monitorexit ;
        return;
        subscriber;
        this;
        JVM INSTR monitorexit ;
        throw subscriber;
        subscriber;
        this;
        JVM INSTR monitorexit ;
        throw subscriber;
        this;
        JVM INSTR monitorexit ;
        subscriber.onCompleted();
        return;
    }

    public void emitAndComplete(Subscriber subscriber, Subscriber subscriber1)
    {
        this;
        JVM INSTR monitorenter ;
        if (!emitting)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        terminate = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        boolean flag;
        obj = value;
        flag = hasValue;
        value = null;
        hasValue = false;
        emitting = true;
        this;
        JVM INSTR monitorexit ;
        if (flag)
        {
            try
            {
                subscriber.onNext(obj);
            }
            // Misplaced declaration of an exception variable
            catch (Subscriber subscriber)
            {
                subscriber1.onError(subscriber);
                return;
            }
        }
        subscriber.onCompleted();
        return;
        subscriber;
        this;
        JVM INSTR monitorexit ;
        throw subscriber;
    }

    public int next(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        int i;
        value = obj;
        hasValue = true;
        i = index + 1;
        index = i;
        this;
        JVM INSTR monitorexit ;
        return i;
        obj;
        throw obj;
    }

    ()
    {
    }
}
