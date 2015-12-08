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
//            NotificationLite, BufferUntilSubscriber

public final class OperatorWindowWithObservableFactory
    implements rx.Observable.Operator
{
    static final class BoundarySubscriber extends Subscriber
    {

        boolean done;
        final SourceSubscriber sub;

        public void onCompleted()
        {
            if (!done)
            {
                done = true;
                sub.onCompleted();
            }
        }

        public void onError(Throwable throwable)
        {
            sub.onError(throwable);
        }

        public void onNext(Object obj)
        {
            if (!done)
            {
                done = true;
                sub.replaceWindow();
            }
        }

        public void onStart()
        {
            request(0x7fffffffffffffffL);
        }

        public BoundarySubscriber(Subscriber subscriber, SourceSubscriber sourcesubscriber)
        {
            sub = sourcesubscriber;
        }
    }

    static final class SourceSubscriber extends Subscriber
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
            BoundarySubscriber boundarysubscriber;
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
            boundarysubscriber = new BoundarySubscriber(child, this);
            ssub.set(boundarysubscriber);
            ((Observable) (obj)).unsafeSubscribe(boundarysubscriber);
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
                    queue.add(obj);
                }
                return;
            }
            List list;
            list = queue;
            queue = null;
            emitting = true;
            obj1;
            JVM INSTR monitorexit ;
            boolean flag2;
            boolean flag3;
            boolean flag4;
            flag2 = true;
            flag4 = false;
            flag3 = false;
_L2:
            boolean flag = flag4;
            drain(list);
            boolean flag1;
            flag1 = flag2;
            if (!flag2)
            {
                break MISSING_BLOCK_LABEL_102;
            }
            flag1 = false;
            flag = flag4;
            emitValue(obj);
            flag = flag4;
            obj1 = guard;
            flag = flag4;
            obj1;
            JVM INSTR monitorenter ;
            flag = flag3;
            list = queue;
            flag = flag3;
            queue = null;
            if (list != null)
            {
                break MISSING_BLOCK_LABEL_182;
            }
            flag = flag3;
            emitting = false;
            flag = true;
            obj1;
            JVM INSTR monitorexit ;
            if (false)
            {
                synchronized (guard)
                {
                    emitting = false;
                }
                return;
            }
            break MISSING_BLOCK_LABEL_266;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
            flag = flag3;
            obj1;
            JVM INSTR monitorexit ;
            flag = flag4;
            boolean flag5 = child.isUnsubscribed();
            flag2 = flag1;
            if (!flag5) goto _L2; else goto _L1
_L1:
            if (true)
            {
                synchronized (guard)
                {
                    emitting = false;
                }
                return;
            }
            break MISSING_BLOCK_LABEL_266;
            exception1;
            obj;
            JVM INSTR monitorexit ;
            throw exception1;
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
            Exception exception2;
            exception2;
            if (!flag)
            {
                synchronized (guard)
                {
                    emitting = false;
                }
            }
            throw exception2;
            exception3;
            obj;
            JVM INSTR monitorexit ;
            throw exception3;
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
                    queue.add(OperatorWindowWithObservableFactory.NEXT_SUBJECT);
                }
                return;
            }
            List list;
            list = queue;
            queue = null;
            emitting = true;
            obj3;
            JVM INSTR monitorexit ;
            boolean flag2;
            boolean flag3;
            boolean flag4;
            flag2 = true;
            flag4 = false;
            flag3 = false;
_L2:
            boolean flag = flag4;
            drain(list);
            boolean flag1;
            flag1 = flag2;
            if (!flag2)
            {
                break MISSING_BLOCK_LABEL_101;
            }
            flag1 = false;
            flag = flag4;
            replaceSubject();
            flag = flag4;
            obj3 = guard;
            flag = flag4;
            obj3;
            JVM INSTR monitorenter ;
            flag = flag3;
            list = queue;
            flag = flag3;
            queue = null;
            if (list != null)
            {
                break MISSING_BLOCK_LABEL_175;
            }
            flag = flag3;
            emitting = false;
            flag = true;
            obj3;
            JVM INSTR monitorexit ;
            if (false)
            {
                synchronized (guard)
                {
                    emitting = false;
                }
                return;
            }
            break MISSING_BLOCK_LABEL_256;
            obj3;
            obj;
            JVM INSTR monitorexit ;
            throw obj3;
            exception;
            obj3;
            JVM INSTR monitorexit ;
            throw exception;
            flag = flag3;
            obj3;
            JVM INSTR monitorexit ;
            flag = flag4;
            boolean flag5 = child.isUnsubscribed();
            flag2 = flag1;
            if (!flag5) goto _L2; else goto _L1
_L1:
            if (true)
            {
                synchronized (guard)
                {
                    emitting = false;
                }
                return;
            }
            break MISSING_BLOCK_LABEL_256;
            obj3;
            obj1;
            JVM INSTR monitorexit ;
            throw obj3;
            Exception exception1;
            exception1;
            obj3;
            JVM INSTR monitorexit ;
            throw exception1;
            Exception exception2;
            exception2;
            if (!flag)
            {
                synchronized (guard)
                {
                    emitting = false;
                }
            }
            throw exception2;
            exception3;
            obj2;
            JVM INSTR monitorexit ;
            throw exception3;
        }

        public SourceSubscriber(Subscriber subscriber, Func0 func0)
        {
            child = new SerializedSubscriber(subscriber);
            otherFactory = func0;
            add(ssub);
        }
    }


    static final Object NEXT_SUBJECT = new Object();
    static final NotificationLite nl = NotificationLite.instance();
    final Func0 otherFactory;

    public OperatorWindowWithObservableFactory(Func0 func0)
    {
        otherFactory = func0;
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(Subscriber subscriber)
    {
        SourceSubscriber sourcesubscriber = new SourceSubscriber(subscriber, otherFactory);
        subscriber.add(sourcesubscriber);
        sourcesubscriber.replaceWindow();
        return sourcesubscriber;
    }

}
