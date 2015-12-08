// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.ArrayList;
import java.util.List;
import rx.Subscriber;

// Referenced classes of package rx.internal.operators:
//            OperatorBufferWithSingleObservable

final class chunk extends Subscriber
{

    final Subscriber child;
    List chunk;
    boolean done;
    final OperatorBufferWithSingleObservable this$0;

    void emit()
    {
        this;
        JVM INSTR monitorenter ;
        if (!done)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        List list;
        list = chunk;
        chunk = new ArrayList(initialCapacity);
        this;
        JVM INSTR monitorexit ;
        child.onNext(list);
        return;
        Object obj;
        obj;
        unsubscribe();
        this;
        JVM INSTR monitorenter ;
        if (!done)
        {
            break MISSING_BLOCK_LABEL_73;
        }
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
        done = true;
        this;
        JVM INSTR monitorexit ;
        child.onError(((Throwable) (obj)));
        return;
    }

    public void onCompleted()
    {
        this;
        JVM INSTR monitorenter ;
        if (!done)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        List list;
        done = true;
        list = chunk;
        chunk = null;
        this;
        JVM INSTR monitorexit ;
        child.onNext(list);
        child.onCompleted();
        unsubscribe();
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        catch (Throwable throwable)
        {
            child.onError(throwable);
        }
        return;
    }

    public void onError(Throwable throwable)
    {
        this;
        JVM INSTR monitorenter ;
        if (!done)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        done = true;
        chunk = null;
        this;
        JVM INSTR monitorexit ;
        child.onError(throwable);
        unsubscribe();
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
        if (!done)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        chunk.add(obj);
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public (Subscriber subscriber)
    {
        this$0 = OperatorBufferWithSingleObservable.this;
        super();
        child = subscriber;
        chunk = new ArrayList(initialCapacity);
    }
}
