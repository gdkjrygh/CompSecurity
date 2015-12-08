// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Subscriber;
import rx.observers.SerializedSubscriber;
import rx.subscriptions.SerialSubscription;

public final class OperatorConcat
    implements rx.Observable.Operator
{

    private OperatorConcat()
    {
    }


    public static OperatorConcat instance()
    {
        return Holder.INSTANCE;
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(Subscriber subscriber)
    {
        Object obj = new SerializedSubscriber(subscriber);
        SerialSubscription serialsubscription = new SerialSubscription();
        subscriber.add(serialsubscription);
        obj = new ConcatSubscriber(((Subscriber) (obj)), serialsubscription);
        subscriber.setProducer(new ConcatProducer(((ConcatSubscriber) (obj))));
        return ((Subscriber) (obj));
    }

    private class Holder
    {

        static final OperatorConcat INSTANCE = new OperatorConcat();


        private Holder()
        {
        }
    }


    private class ConcatSubscriber extends Subscriber
    {

        private static final AtomicLongFieldUpdater REQUESTED = AtomicLongFieldUpdater.newUpdater(rx/internal/operators/OperatorConcat$ConcatSubscriber, "requested");
        static final AtomicIntegerFieldUpdater WIP = AtomicIntegerFieldUpdater.newUpdater(rx/internal/operators/OperatorConcat$ConcatSubscriber, "wip");
        private final ProducerArbiter arbiter = new ProducerArbiter();
        private final Subscriber child;
        private final SerialSubscription current;
        volatile ConcatInnerSubscriber currentSubscriber;
        final NotificationLite nl = NotificationLite.instance();
        final ConcurrentLinkedQueue queue = new ConcurrentLinkedQueue();
        private volatile long requested;
        volatile int wip;

        private void decrementRequested()
        {
            REQUESTED.decrementAndGet(this);
        }

        private void requestFromChild(long l)
        {
            if (l > 0L)
            {
                long l1 = BackpressureUtils.getAndAddRequest(REQUESTED, this, l);
                arbiter.request(l);
                if (l1 == 0L && currentSubscriber == null && wip > 0)
                {
                    subscribeNext();
                    return;
                }
            }
        }

        void completeInner()
        {
            currentSubscriber = null;
            if (WIP.decrementAndGet(this) > 0)
            {
                subscribeNext();
            }
            request(1L);
        }

        public void onCompleted()
        {
            queue.add(nl.completed());
            if (WIP.getAndIncrement(this) == 0)
            {
                subscribeNext();
            }
        }

        public void onError(Throwable throwable)
        {
            child.onError(throwable);
            unsubscribe();
        }

        public volatile void onNext(Object obj)
        {
            onNext((Observable)obj);
        }

        public void onNext(Observable observable)
        {
            queue.add(nl.next(observable));
            if (WIP.getAndIncrement(this) == 0)
            {
                subscribeNext();
            }
        }

        public void onStart()
        {
            request(2L);
        }

        void subscribeNext()
        {
            if (requested <= 0L) goto _L2; else goto _L1
_L1:
            Object obj = queue.poll();
            if (!nl.isCompleted(obj)) goto _L4; else goto _L3
_L3:
            child.onCompleted();
_L6:
            return;
_L4:
            if (obj != null)
            {
                obj = (Observable)nl.getValue(obj);
                currentSubscriber = new ConcatInnerSubscriber(child, arbiter);
                current.set(currentSubscriber);
                ((Observable) (obj)).unsafeSubscribe(currentSubscriber);
                return;
            }
            continue; /* Loop/switch isn't completed */
_L2:
            Object obj1 = queue.peek();
            if (nl.isCompleted(obj1))
            {
                child.onCompleted();
                return;
            }
            if (true) goto _L6; else goto _L5
_L5:
        }




        public ConcatSubscriber(Subscriber subscriber, SerialSubscription serialsubscription)
        {
            super(subscriber);
            child = subscriber;
            current = serialsubscription;
            add(Subscriptions.create(new Action0() {

                final ConcatSubscriber this$0;

                public void call()
                {
                    queue.clear();
                }

                
                {
                    this$0 = ConcatSubscriber.this;
                    super();
                }
            }));
        }

        private class ConcatInnerSubscriber extends Subscriber
        {

            private static final AtomicIntegerFieldUpdater ONCE = AtomicIntegerFieldUpdater.newUpdater(rx/internal/operators/OperatorConcat$ConcatInnerSubscriber, "once");
            private final ProducerArbiter arbiter;
            private final Subscriber child;
            private volatile int once;
            private final ConcatSubscriber parent;

            public void onCompleted()
            {
                if (ONCE.compareAndSet(this, 0, 1))
                {
                    parent.completeInner();
                }
            }

            public void onError(Throwable throwable)
            {
                if (ONCE.compareAndSet(this, 0, 1))
                {
                    parent.onError(throwable);
                }
            }

            public void onNext(Object obj)
            {
                child.onNext(obj);
                parent.decrementRequested();
                arbiter.produced(1L);
            }

            public void setProducer(Producer producer)
            {
                arbiter.setProducer(producer);
            }


            public ConcatInnerSubscriber(Subscriber subscriber, ProducerArbiter producerarbiter)
            {
                once = 0;
                parent = ConcatSubscriber.this;
                child = subscriber;
                arbiter = producerarbiter;
            }
        }

    }


    private class ConcatProducer
        implements Producer
    {

        final ConcatSubscriber cs;

        public void request(long l)
        {
            cs.requestFromChild(l);
        }

        ConcatProducer(ConcatSubscriber concatsubscriber)
        {
            cs = concatsubscriber;
        }
    }

}
