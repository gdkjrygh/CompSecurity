// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.functions.Func0;
import rx.observers.SerializedSubscriber;
import rx.subscriptions.SerialSubscription;

// Referenced classes of package rx.internal.operators:
//            BufferUntilSubscriber, OperatorWindowWithObservableFactory, NotificationLite

final class ssub extends Subscriber
{

    final Subscriber child;
    Observer consumer;
    boolean emitting;
    final Object guard = new Object();
    final Func0 otherFactory;
    Observable producer;
    List queue;
    final SerialSubscription ssub = new SerialSubscription();

    void complete()
    {
        Observer observer = consumer;
        consumer = null;
        producer = null;
        if (observer != null)
        {
            observer.onCompleted();
        }
        child.onCompleted();
        unsubscribe();
    }

    void createNewWindow()
    {
        Object obj = BufferUntilSubscriber.create();
        consumer = ((Observer) (obj));
        producer = ((Observable) (obj));
        r r;
        try
        {
            obj = (Observable)otherFactory.call();
        }
        catch (Throwable throwable)
        {
            child.onError(throwable);
            unsubscribe();
            return;
        }
        r = new r(child, this);
        ssub.set(r);
        ((Observable) (obj)).unsafeSubscribe(r);
    }

    void drain(List list)
    {
        if (list != null)
        {
            list = list.iterator();
            while (list.hasNext()) 
            {
                Object obj = list.next();
                if (obj == OperatorWindowWithObservableFactory.NEXT_SUBJECT)
                {
                    replaceSubject();
                } else
                {
                    if (OperatorWindowWithObservableFactory.nl.isError(obj))
                    {
                        error(OperatorWindowWithObservableFactory.nl.getError(obj));
                        return;
                    }
                    if (OperatorWindowWithObservableFactory.nl.isCompleted(obj))
                    {
                        complete();
                        return;
                    }
                    emitValue(obj);
                }
            }
        }
    }

    void emitValue(Object obj)
    {
        Observer observer = consumer;
        if (observer != null)
        {
            observer.onNext(obj);
        }
    }

    void error(Throwable throwable)
    {
        Observer observer = consumer;
        consumer = null;
        producer = null;
        if (observer != null)
        {
            observer.onError(throwable);
        }
        child.onError(throwable);
        unsubscribe();
    }

    public void onCompleted()
    {
label0:
        {
            synchronized (guard)
            {
                if (!emitting)
                {
                    break label0;
                }
                if (queue == null)
                {
                    queue = new ArrayList();
                }
                queue.add(OperatorWindowWithObservableFactory.nl.completed());
            }
            return;
        }
        List list;
        list = queue;
        queue = null;
        emitting = true;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            drain(list);
        }
        catch (Throwable throwable)
        {
            error(throwable);
            return;
        }
        complete();
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onError(Throwable throwable)
    {
label0:
        {
            synchronized (guard)
            {
                if (!emitting)
                {
                    break label0;
                }
                queue = Collections.singletonList(OperatorWindowWithObservableFactory.nl.error(throwable));
            }
            return;
        }
        queue = null;
        emitting = true;
        obj;
        JVM INSTR monitorexit ;
        error(throwable);
        return;
        throwable;
        obj;
        JVM INSTR monitorexit ;
        throw throwable;
    }

    public void onNext(Object obj)
    {
        boolean flag2;
        boolean flag3;
label0:
        {
            flag2 = true;
            flag3 = false;
            synchronized (guard)
            {
                if (!emitting)
                {
                    break label0;
                }
                if (queue == null)
                {
                    queue = new ArrayList();
                }
                queue.add(obj);
            }
            return;
        }
        List list;
        list = queue;
        queue = null;
        emitting = true;
        obj2;
        JVM INSTR monitorexit ;
        boolean flag = true;
_L4:
        drain(list);
        boolean flag1;
        flag1 = flag;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        emitValue(obj);
        flag1 = false;
        obj2 = guard;
        obj2;
        JVM INSTR monitorenter ;
        list = queue;
        queue = null;
        if (list != null) goto _L2; else goto _L1
_L1:
        emitting = false;
        flag1 = flag2;
        obj2;
        JVM INSTR monitorexit ;
        return;
_L6:
        flag1 = flag;
        obj2;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
_L5:
        if (!flag)
        {
            synchronized (guard)
            {
                emitting = false;
            }
        }
        throw obj;
        obj;
        obj2;
        JVM INSTR monitorexit ;
        throw obj;
_L2:
        obj2;
        JVM INSTR monitorexit ;
        boolean flag4 = child.isUnsubscribed();
        flag = flag1;
        if (!flag4) goto _L4; else goto _L3
_L3:
        synchronized (guard)
        {
            emitting = false;
        }
        return;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        flag = flag3;
          goto _L5
        obj;
        flag = false;
          goto _L6
        obj;
        flag = flag1;
          goto _L6
    }

    public void onStart()
    {
        request(0x7fffffffffffffffL);
    }

    void replaceSubject()
    {
        Observer observer = consumer;
        if (observer != null)
        {
            observer.onCompleted();
        }
        createNewWindow();
        child.onNext(producer);
    }

    void replaceWindow()
    {
        boolean flag2;
        boolean flag3;
label0:
        {
            flag2 = true;
            flag3 = false;
            synchronized (guard)
            {
                if (!emitting)
                {
                    break label0;
                }
                if (queue == null)
                {
                    queue = new ArrayList();
                }
                queue.add(OperatorWindowWithObservableFactory.NEXT_SUBJECT);
            }
            return;
        }
        Object obj;
        obj = queue;
        queue = null;
        emitting = true;
        obj1;
        JVM INSTR monitorexit ;
        boolean flag = true;
_L4:
        drain(((List) (obj)));
        boolean flag1;
        flag1 = flag;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        replaceSubject();
        flag1 = false;
        obj1 = guard;
        obj1;
        JVM INSTR monitorenter ;
        obj = queue;
        queue = null;
        if (obj != null) goto _L2; else goto _L1
_L1:
        emitting = false;
        flag1 = flag2;
        obj1;
        JVM INSTR monitorexit ;
        return;
_L6:
        flag1 = flag;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
        exception;
_L5:
        if (!flag)
        {
            synchronized (guard)
            {
                emitting = false;
            }
        }
        throw exception;
        exception;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        obj1;
        JVM INSTR monitorexit ;
        boolean flag4 = child.isUnsubscribed();
        flag = flag1;
        if (!flag4) goto _L4; else goto _L3
_L3:
        synchronized (guard)
        {
            emitting = false;
        }
        return;
        obj1;
        exception;
        JVM INSTR monitorexit ;
        throw obj1;
        exception;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
        exception;
        flag = flag3;
          goto _L5
        exception;
        flag = false;
          goto _L6
        exception;
        flag = flag1;
          goto _L6
    }

    public r(Subscriber subscriber, Func0 func0)
    {
        child = new SerializedSubscriber(subscriber);
        otherFactory = func0;
        add(ssub);
    }
}
