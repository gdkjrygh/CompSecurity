// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import rx.Observable;
import rx.Subscriber;
import rx.functions.Func1;
import rx.subscriptions.CompositeSubscription;

// Referenced classes of package rx.internal.operators:
//            OperatorBufferWithStartEndObservable

final class closingSubscriptions extends Subscriber
{

    final Subscriber child;
    final List chunks = new LinkedList();
    final CompositeSubscription closingSubscriptions = new CompositeSubscription();
    boolean done;
    final OperatorBufferWithStartEndObservable this$0;

    void endBuffer(List list)
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
        Iterator iterator;
        iterator = chunks.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_72;
            }
        } while ((List)iterator.next() != list);
        boolean flag = true;
        iterator.remove();
_L1:
        this;
        JVM INSTR monitorexit ;
        if (flag)
        {
            child.onNext(list);
            return;
        } else
        {
            return;
        }
        list;
        this;
        JVM INSTR monitorexit ;
        throw list;
        flag = false;
          goto _L1
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
        Object obj;
        done = true;
        obj = new LinkedList(chunks);
        chunks.clear();
        this;
        JVM INSTR monitorexit ;
        try
        {
            List list;
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); child.onNext(list))
            {
                list = (List)((Iterator) (obj)).next();
            }

        }
        catch (Throwable throwable)
        {
            child.onError(throwable);
            return;
        }
        break MISSING_BLOCK_LABEL_92;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        child.onCompleted();
        unsubscribe();
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
        chunks.clear();
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
        for (Iterator iterator = chunks.iterator(); iterator.hasNext(); ((List)iterator.next()).add(obj)) { }
        break MISSING_BLOCK_LABEL_45;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        this;
        JVM INSTR monitorexit ;
    }

    void startBuffer(Object obj)
    {
        final ArrayList chunk = new ArrayList();
        this;
        JVM INSTR monitorenter ;
        if (!done)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        chunks.add(chunk);
        this;
        JVM INSTR monitorexit ;
        try
        {
            obj = (Observable)bufferClosing.call(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            onError(((Throwable) (obj)));
            return;
        }
        chunk = new Subscriber() {

            final OperatorBufferWithStartEndObservable.BufferingSubscriber this$1;
            final List val$chunk;

            public void onCompleted()
            {
                closingSubscriptions.remove(this);
                endBuffer(chunk);
            }

            public void onError(Throwable throwable)
            {
                OperatorBufferWithStartEndObservable.BufferingSubscriber.this.onError(throwable);
            }

            public void onNext(Object obj1)
            {
                closingSubscriptions.remove(this);
                endBuffer(chunk);
            }

            
            {
                this$1 = OperatorBufferWithStartEndObservable.BufferingSubscriber.this;
                chunk = list;
                super();
            }
        };
        closingSubscriptions.add(chunk);
        ((Observable) (obj)).unsafeSubscribe(chunk);
        return;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public _cls1.val.chunk(Subscriber subscriber)
    {
        this$0 = OperatorBufferWithStartEndObservable.this;
        super();
        child = subscriber;
        add(closingSubscriptions);
    }
}
