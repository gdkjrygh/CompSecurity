// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.ArrayList;
import java.util.List;
import rx.Subscriber;
import rx.functions.Action0;

// Referenced classes of package rx.internal.operators:
//            OperatorBufferWithTime

final class chunk extends Subscriber
{

    final Subscriber child;
    List chunk;
    boolean done;
    final rx.me.unit inner;
    final OperatorBufferWithTime this$0;

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
        chunk = new ArrayList();
        this;
        JVM INSTR monitorexit ;
        try
        {
            child.onNext(list);
            return;
        }
        catch (Throwable throwable)
        {
            onError(throwable);
        }
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onCompleted()
    {
        inner.inner();
        this;
        JVM INSTR monitorenter ;
        if (!done)
        {
            break MISSING_BLOCK_LABEL_19;
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
        Object obj1 = null;
        this;
        JVM INSTR monitorenter ;
        if (!done)
        {
            break MISSING_BLOCK_LABEL_14;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        chunk.add(obj);
        obj = obj1;
        if (chunk.size() == count)
        {
            obj = chunk;
            chunk = new ArrayList();
        }
        this;
        JVM INSTR monitorexit ;
        if (obj != null)
        {
            child.onNext(obj);
            return;
        } else
        {
            return;
        }
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }

    void scheduleExact()
    {
        inner.inner(new Action0() {

            final OperatorBufferWithTime.ExactSubscriber this$1;

            public void call()
            {
                emit();
            }

            
            {
                this$1 = OperatorBufferWithTime.ExactSubscriber.this;
                super();
            }
        }, timespan, timespan, unit);
    }

    public _cls1.this._cls1(Subscriber subscriber, rx.me me)
    {
        this$0 = OperatorBufferWithTime.this;
        super();
        child = subscriber;
        inner = me;
        chunk = new ArrayList();
    }
}
