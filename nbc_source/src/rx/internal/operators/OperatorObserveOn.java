// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import rx.Producer;
import rx.Scheduler;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.MissingBackpressureException;
import rx.functions.Action0;
import rx.internal.util.RxRingBuffer;
import rx.internal.util.SynchronizedQueue;
import rx.internal.util.unsafe.SpscArrayQueue;
import rx.internal.util.unsafe.UnsafeAccess;
import rx.schedulers.ImmediateScheduler;
import rx.schedulers.TrampolineScheduler;

// Referenced classes of package rx.internal.operators:
//            NotificationLite, BackpressureUtils

public final class OperatorObserveOn
    implements rx.Observable.Operator
{
    private static final class ObserveOnSubscriber extends Subscriber
    {

        static final AtomicLongFieldUpdater COUNTER_UPDATER = AtomicLongFieldUpdater.newUpdater(rx/internal/operators/OperatorObserveOn$ObserveOnSubscriber, "counter");
        static final AtomicLongFieldUpdater REQUESTED = AtomicLongFieldUpdater.newUpdater(rx/internal/operators/OperatorObserveOn$ObserveOnSubscriber, "requested");
        final Action0 action = new _cls2();
        final Subscriber child;
        volatile long counter;
        volatile Throwable error;
        volatile boolean finished;
        final NotificationLite on = NotificationLite.instance();
        final Queue queue;
        final rx.Scheduler.Worker recursiveScheduler;
        volatile long requested;
        final ScheduledUnsubscribe scheduledUnsubscribe;

        void init()
        {
            child.add(scheduledUnsubscribe);
            child.setProducer(new Producer() {

                final ObserveOnSubscriber this$0;

                public void request(long l)
                {
                    BackpressureUtils.getAndAddRequest(ObserveOnSubscriber.REQUESTED, ObserveOnSubscriber.this, l);
                    schedule();
                }

            
            {
                this$0 = ObserveOnSubscriber.this;
                super();
            }
            });
            child.add(recursiveScheduler);
            child.add(this);
        }

        public void onCompleted()
        {
            if (isUnsubscribed() || finished)
            {
                return;
            } else
            {
                finished = true;
                schedule();
                return;
            }
        }

        public void onError(Throwable throwable)
        {
            if (isUnsubscribed() || finished)
            {
                return;
            } else
            {
                error = throwable;
                unsubscribe();
                finished = true;
                schedule();
                return;
            }
        }

        public void onNext(Object obj)
        {
            if (isUnsubscribed())
            {
                return;
            }
            if (!queue.offer(on.next(obj)))
            {
                onError(new MissingBackpressureException());
                return;
            } else
            {
                schedule();
                return;
            }
        }

        public void onStart()
        {
            request(RxRingBuffer.SIZE);
        }

        void pollQueue()
        {
            int i = 0;
_L5:
            int j;
            long l;
            long l1;
            counter = 1L;
            l = 0L;
            l1 = requested;
            j = i;
_L3:
            if (!child.isUnsubscribed()) goto _L2; else goto _L1
_L1:
            return;
_L2:
label0:
            {
                if (finished)
                {
                    Throwable throwable = error;
                    if (throwable != null)
                    {
                        queue.clear();
                        child.onError(throwable);
                        return;
                    }
                    if (queue.isEmpty())
                    {
                        child.onCompleted();
                        return;
                    }
                }
                if (l1 <= 0L)
                {
                    break label0;
                }
                Object obj = queue.poll();
                if (obj == null)
                {
                    break label0;
                }
                child.onNext(on.getValue(obj));
                l1--;
                j++;
                l++;
            }
              goto _L3
            if (l > 0L && requested != 0x7fffffffffffffffL)
            {
                REQUESTED.addAndGet(this, -l);
            }
            i = j;
            if (COUNTER_UPDATER.decrementAndGet(this) > 0L) goto _L5; else goto _L4
_L4:
            if (j <= 0) goto _L1; else goto _L6
_L6:
            request(j);
            return;
              goto _L3
        }

        protected void schedule()
        {
            if (COUNTER_UPDATER.getAndIncrement(this) == 0L)
            {
                recursiveScheduler.schedule(action);
            }
        }


        public ObserveOnSubscriber(Scheduler scheduler1, Subscriber subscriber)
        {
            finished = false;
            requested = 0L;
            child = subscriber;
            recursiveScheduler = scheduler1.createWorker();
            if (UnsafeAccess.isUnsafeAvailable())
            {
                queue = new SpscArrayQueue(RxRingBuffer.SIZE);
            } else
            {
                queue = new SynchronizedQueue(RxRingBuffer.SIZE);
            }
            scheduledUnsubscribe = new ScheduledUnsubscribe(recursiveScheduler);
        }
    }

    static final class ScheduledUnsubscribe
        implements Subscription
    {

        static final AtomicIntegerFieldUpdater ONCE_UPDATER = AtomicIntegerFieldUpdater.newUpdater(rx/internal/operators/OperatorObserveOn$ScheduledUnsubscribe, "once");
        volatile int once;
        volatile boolean unsubscribed;
        final rx.Scheduler.Worker worker;

        public boolean isUnsubscribed()
        {
            return unsubscribed;
        }

        public void unsubscribe()
        {
            if (ONCE_UPDATER.getAndSet(this, 1) == 0)
            {
                worker.schedule(new Action0() {

                    final ScheduledUnsubscribe this$0;

                    public void call()
                    {
                        worker.unsubscribe();
                        unsubscribed = true;
                    }

            
            {
                this$0 = ScheduledUnsubscribe.this;
                super();
            }
                });
            }
        }


        public ScheduledUnsubscribe(rx.Scheduler.Worker worker1)
        {
            unsubscribed = false;
            worker = worker1;
        }
    }


    private final Scheduler scheduler;

    public OperatorObserveOn(Scheduler scheduler1)
    {
        scheduler = scheduler1;
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(Subscriber subscriber)
    {
        while ((scheduler instanceof ImmediateScheduler) || (scheduler instanceof TrampolineScheduler)) 
        {
            return subscriber;
        }
        subscriber = new ObserveOnSubscriber(scheduler, subscriber);
        subscriber.init();
        return subscriber;
    }

    // Unreferenced inner class rx/internal/operators/OperatorObserveOn$ObserveOnSubscriber$2

/* anonymous class */
    class ObserveOnSubscriber._cls2
        implements Action0
    {

        final ObserveOnSubscriber this$0;

        public void call()
        {
            pollQueue();
        }

            
            {
                this$0 = ObserveOnSubscriber.this;
                super();
            }
    }

}
