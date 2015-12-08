// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import rx.Observable;
import rx.Scheduler;
import rx.Subscriber;
import rx.Subscription;
import rx.functions.Func3;
import rx.functions.Func4;
import rx.observers.SerializedSubscriber;
import rx.subscriptions.SerialSubscription;

class OperatorTimeoutBase
    implements rx.Observable.Operator
{
    static interface FirstTimeoutStub
        extends Func3
    {
    }

    static interface TimeoutStub
        extends Func4
    {
    }

    static final class TimeoutSubscriber extends Subscriber
    {

        static final AtomicLongFieldUpdater ACTUAL_UPDATER = AtomicLongFieldUpdater.newUpdater(rx/internal/operators/OperatorTimeoutBase$TimeoutSubscriber, "actual");
        static final AtomicIntegerFieldUpdater TERMINATED_UPDATER = AtomicIntegerFieldUpdater.newUpdater(rx/internal/operators/OperatorTimeoutBase$TimeoutSubscriber, "terminated");
        volatile long actual;
        private final Object gate;
        private final rx.Scheduler.Worker inner;
        private final Observable other;
        private final SerialSubscription serial;
        private final SerializedSubscriber serializedSubscriber;
        volatile int terminated;
        private final TimeoutStub timeoutStub;

        public void onCompleted()
        {
            boolean flag = false;
            Object obj = gate;
            obj;
            JVM INSTR monitorenter ;
            if (TERMINATED_UPDATER.getAndSet(this, 1) == 0)
            {
                flag = true;
            }
            obj;
            JVM INSTR monitorexit ;
            if (flag)
            {
                serial.unsubscribe();
                serializedSubscriber.onCompleted();
            }
            return;
            Exception exception;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void onError(Throwable throwable)
        {
            boolean flag = false;
            Object obj = gate;
            obj;
            JVM INSTR monitorenter ;
            if (TERMINATED_UPDATER.getAndSet(this, 1) == 0)
            {
                flag = true;
            }
            obj;
            JVM INSTR monitorexit ;
            if (flag)
            {
                serial.unsubscribe();
                serializedSubscriber.onError(throwable);
            }
            return;
            throwable;
            obj;
            JVM INSTR monitorexit ;
            throw throwable;
        }

        public void onNext(Object obj)
        {
            boolean flag = false;
            Object obj1 = gate;
            obj1;
            JVM INSTR monitorenter ;
            if (terminated != 0)
            {
                break MISSING_BLOCK_LABEL_26;
            }
            ACTUAL_UPDATER.incrementAndGet(this);
            flag = true;
            obj1;
            JVM INSTR monitorexit ;
            if (flag)
            {
                serializedSubscriber.onNext(obj);
                serial.set((Subscription)timeoutStub.call(this, Long.valueOf(actual), obj, inner));
            }
            return;
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
        }

        public void onTimeout(long l)
        {
            boolean flag1 = false;
            Object obj = gate;
            obj;
            JVM INSTR monitorenter ;
            boolean flag = flag1;
            if (l != actual)
            {
                break MISSING_BLOCK_LABEL_41;
            }
            flag = flag1;
            if (TERMINATED_UPDATER.getAndSet(this, 1) == 0)
            {
                flag = true;
            }
            obj;
            JVM INSTR monitorexit ;
            if (flag)
            {
                if (other != null)
                {
                    break MISSING_BLOCK_LABEL_77;
                }
                serializedSubscriber.onError(new TimeoutException());
            }
            return;
            Exception exception;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
            other.unsafeSubscribe(serializedSubscriber);
            serial.set(serializedSubscriber);
            return;
        }


        private TimeoutSubscriber(SerializedSubscriber serializedsubscriber, TimeoutStub timeoutstub, SerialSubscription serialsubscription, Observable observable, rx.Scheduler.Worker worker)
        {
            super(serializedsubscriber);
            gate = new Object();
            serializedSubscriber = serializedsubscriber;
            timeoutStub = timeoutstub;
            serial = serialsubscription;
            other = observable;
            inner = worker;
        }

    }


    private final FirstTimeoutStub firstTimeoutStub;
    private final Observable other;
    private final Scheduler scheduler;
    private final TimeoutStub timeoutStub;

    OperatorTimeoutBase(FirstTimeoutStub firsttimeoutstub, TimeoutStub timeoutstub, Observable observable, Scheduler scheduler1)
    {
        firstTimeoutStub = firsttimeoutstub;
        timeoutStub = timeoutstub;
        other = observable;
        scheduler = scheduler1;
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(Subscriber subscriber)
    {
        rx.Scheduler.Worker worker = scheduler.createWorker();
        subscriber.add(worker);
        SerialSubscription serialsubscription = new SerialSubscription();
        subscriber.add(serialsubscription);
        subscriber = new TimeoutSubscriber(new SerializedSubscriber(subscriber), timeoutStub, serialsubscription, other, worker);
        serialsubscription.set((Subscription)firstTimeoutStub.call(subscriber, Long.valueOf(0L), worker));
        return subscriber;
    }
}
