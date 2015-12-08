// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import rx.Subscriber;
import rx.Subscription;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.observables.ConnectableObservable;
import rx.subscriptions.CompositeSubscription;
import rx.subscriptions.Subscriptions;

public final class OnSubscribeRefCount
    implements rx.Observable.OnSubscribe
{

    private volatile CompositeSubscription baseSubscription;
    private final ReentrantLock lock = new ReentrantLock();
    private final ConnectableObservable source;
    private final AtomicInteger subscriptionCount = new AtomicInteger(0);

    public OnSubscribeRefCount(ConnectableObservable connectableobservable)
    {
        baseSubscription = new CompositeSubscription();
        source = connectableobservable;
    }

    private Subscription disconnect(final CompositeSubscription current)
    {
        return Subscriptions.create(new Action0() {

            final OnSubscribeRefCount this$0;
            final CompositeSubscription val$current;

            public void call()
            {
                lock.lock();
                if (baseSubscription == current && subscriptionCount.decrementAndGet() == 0)
                {
                    baseSubscription.unsubscribe();
                    baseSubscription = new CompositeSubscription();
                }
                lock.unlock();
                return;
                Exception exception;
                exception;
                lock.unlock();
                throw exception;
            }

            
            {
                this$0 = OnSubscribeRefCount.this;
                current = compositesubscription;
                super();
            }
        });
    }

    private Action1 onSubscribe(final Subscriber subscriber, final AtomicBoolean writeLocked)
    {
        return new Action1() {

            final OnSubscribeRefCount this$0;
            final Subscriber val$subscriber;
            final AtomicBoolean val$writeLocked;

            public volatile void call(Object obj)
            {
                call((Subscription)obj);
            }

            public void call(Subscription subscription)
            {
                baseSubscription.add(subscription);
                doSubscribe(subscriber, baseSubscription);
                lock.unlock();
                writeLocked.set(false);
                return;
                subscription;
                lock.unlock();
                writeLocked.set(false);
                throw subscription;
            }

            
            {
                this$0 = OnSubscribeRefCount.this;
                subscriber = subscriber1;
                writeLocked = atomicboolean;
                super();
            }
        };
    }

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(Subscriber subscriber)
    {
        AtomicBoolean atomicboolean;
        lock.lock();
        if (subscriptionCount.incrementAndGet() != 1)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        atomicboolean = new AtomicBoolean(true);
        source.connect(onSubscribe(subscriber, atomicboolean));
        if (atomicboolean.get())
        {
            lock.unlock();
        }
        return;
        subscriber;
        if (atomicboolean.get())
        {
            lock.unlock();
        }
        throw subscriber;
        doSubscribe(subscriber, baseSubscription);
        lock.unlock();
        return;
        subscriber;
        lock.unlock();
        throw subscriber;
    }

    void doSubscribe(final Subscriber final_subscriber1, CompositeSubscription compositesubscription)
    {
        final_subscriber1.add(disconnect(compositesubscription));
        source.unsafeSubscribe(new Subscriber(compositesubscription) {

            final OnSubscribeRefCount this$0;
            final CompositeSubscription val$currentBase;
            final Subscriber val$subscriber;

            void cleanup()
            {
                lock.lock();
                if (baseSubscription == currentBase)
                {
                    baseSubscription.unsubscribe();
                    baseSubscription = new CompositeSubscription();
                    subscriptionCount.set(0);
                }
                lock.unlock();
                return;
                Exception exception;
                exception;
                lock.unlock();
                throw exception;
            }

            public void onCompleted()
            {
                cleanup();
                subscriber.onCompleted();
            }

            public void onError(Throwable throwable)
            {
                cleanup();
                subscriber.onError(throwable);
            }

            public void onNext(Object obj)
            {
                subscriber.onNext(obj);
            }

            
            {
                this$0 = OnSubscribeRefCount.this;
                subscriber = subscriber2;
                currentBase = compositesubscription;
                super(final_subscriber1);
            }
        });
    }



/*
    static CompositeSubscription access$002(OnSubscribeRefCount onsubscriberefcount, CompositeSubscription compositesubscription)
    {
        onsubscriberefcount.baseSubscription = compositesubscription;
        return compositesubscription;
    }

*/


}
