// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.functions.Action0;

// Referenced classes of package rx.internal.operators:
//            OnSubscribeRedo

class this._cls1 extends Subscriber
{

    final compareAndSet this$1;

    public void onCompleted()
    {
        child.onCompleted();
    }

    public void onError(Throwable throwable)
    {
        child.onError(throwable);
    }

    public void onNext(Object obj)
    {
label0:
        {
            if (!child.isUnsubscribed())
            {
                if (consumerCapacity.get() <= 0L)
                {
                    break label0;
                }
                worker.edule(subscribeToSource);
            }
            return;
        }
        resumeBoundary.compareAndSet(false, true);
    }

    public void setProducer(Producer producer)
    {
        producer.request(0x7fffffffffffffffL);
    }

    l.resumeBoundary(Subscriber subscriber)
    {
        this$1 = this._cls1.this;
        super(subscriber);
    }

    // Unreferenced inner class rx/internal/operators/OnSubscribeRedo$4

/* anonymous class */
    class OnSubscribeRedo._cls4
        implements Action0
    {

        final OnSubscribeRedo this$0;
        final Subscriber val$child;
        final AtomicLong val$consumerCapacity;
        final Observable val$restarts;
        final AtomicBoolean val$resumeBoundary;
        final Action0 val$subscribeToSource;
        final rx.Scheduler.Worker val$worker;

        public void call()
        {
            restarts.unsafeSubscribe(new OnSubscribeRedo._cls4._cls1(child));
        }

            
            {
                this$0 = final_onsubscriberedo;
                restarts = observable;
                child = subscriber;
                consumerCapacity = atomiclong;
                worker = worker1;
                subscribeToSource = action0;
                resumeBoundary = AtomicBoolean.this;
                super();
            }
    }

}
