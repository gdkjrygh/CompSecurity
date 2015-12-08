// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func0;
import rx.observables.ConnectableObservable;
import rx.observers.Subscribers;
import rx.subjects.Subject;
import rx.subscriptions.Subscriptions;

public final class OperatorMulticast extends ConnectableObservable
{

    final AtomicReference connectedSubject;
    final Object guard;
    private Subscription guardedSubscription;
    final Observable source;
    final Func0 subjectFactory;
    private Subscriber subscription;
    final List waitingForConnect;

    private OperatorMulticast(final Object guard, final AtomicReference connectedSubject, final List waitingForConnect, Observable observable, Func0 func0)
    {
        super(new rx.Observable.OnSubscribe() {

            final AtomicReference val$connectedSubject;
            final Object val$guard;
            final List val$waitingForConnect;

            public volatile void call(Object obj)
            {
                call((Subscriber)obj);
            }

            public void call(Subscriber subscriber)
            {
                Object obj = guard;
                obj;
                JVM INSTR monitorenter ;
                if (connectedSubject.get() != null)
                {
                    break MISSING_BLOCK_LABEL_31;
                }
                waitingForConnect.add(subscriber);
_L2:
                return;
                ((Subject)connectedSubject.get()).unsafeSubscribe(subscriber);
                if (true) goto _L2; else goto _L1
_L1:
                subscriber;
                obj;
                JVM INSTR monitorexit ;
                throw subscriber;
            }

            
            {
                guard = obj;
                connectedSubject = atomicreference;
                waitingForConnect = list;
                super();
            }
        });
        this.guard = guard;
        this.connectedSubject = connectedSubject;
        this.waitingForConnect = waitingForConnect;
        source = observable;
        subjectFactory = func0;
    }

    public OperatorMulticast(Observable observable, Func0 func0)
    {
        this(new Object(), new AtomicReference(), ((List) (new ArrayList())), observable, func0);
    }

    public void connect(Action1 action1)
    {
label0:
        {
            synchronized (guard)
            {
                if (subscription == null)
                {
                    break label0;
                }
                action1.call(guardedSubscription);
            }
            return;
        }
        Subject subject;
        subject = (Subject)subjectFactory.call();
        subscription = Subscribers.from(subject);
        final AtomicReference gs = new AtomicReference();
        gs.set(Subscriptions.create(new Action0() {

            final OperatorMulticast this$0;
            final AtomicReference val$gs;

            public void call()
            {
label0:
                {
                    Subscriber subscriber1;
                    synchronized (guard)
                    {
                        if (guardedSubscription != gs.get())
                        {
                            break label0;
                        }
                        subscriber1 = subscription;
                        subscription = null;
                        guardedSubscription = null;
                        connectedSubject.set(null);
                    }
                    if (subscriber1 != null)
                    {
                        subscriber1.unsubscribe();
                    }
                    return;
                }
                obj1;
                JVM INSTR monitorexit ;
                return;
                exception1;
                obj1;
                JVM INSTR monitorexit ;
                throw exception1;
            }

            
            {
                this$0 = OperatorMulticast.this;
                gs = atomicreference;
                super();
            }
        }));
        guardedSubscription = (Subscription)gs.get();
        final Subscriber final_subscriber;
        for (Iterator iterator = waitingForConnect.iterator(); iterator.hasNext(); subject.unsafeSubscribe(new Subscriber(final_subscriber) {

        final OperatorMulticast this$0;
        final Subscriber val$s;

        public void onCompleted()
        {
            s.onCompleted();
        }

        public void onError(Throwable throwable)
        {
            s.onError(throwable);
        }

        public void onNext(Object obj1)
        {
            s.onNext(obj1);
        }

            
            {
                this$0 = OperatorMulticast.this;
                s = subscriber1;
                super(final_subscriber);
            }
    }))
        {
            final_subscriber = (Subscriber)iterator.next();
        }

        break MISSING_BLOCK_LABEL_145;
        action1;
        obj;
        JVM INSTR monitorexit ;
        throw action1;
        waitingForConnect.clear();
        connectedSubject.set(subject);
        obj;
        JVM INSTR monitorexit ;
        action1.call(guardedSubscription);
        Subscriber subscriber;
        synchronized (guard)
        {
            subscriber = subscription;
        }
        if (subscriber != null)
        {
            source.subscribe(subscriber);
            return;
        } else
        {
            return;
        }
        exception;
        action1;
        JVM INSTR monitorexit ;
        throw exception;
    }



/*
    static Subscription access$002(OperatorMulticast operatormulticast, Subscription subscription1)
    {
        operatormulticast.guardedSubscription = subscription1;
        return subscription1;
    }

*/



/*
    static Subscriber access$102(OperatorMulticast operatormulticast, Subscriber subscriber)
    {
        operatormulticast.subscription = subscriber;
        return subscriber;
    }

*/
}
