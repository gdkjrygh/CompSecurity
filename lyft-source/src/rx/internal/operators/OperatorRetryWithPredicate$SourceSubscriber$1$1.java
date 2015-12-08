// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.functions.Action0;
import rx.functions.Func2;
import rx.internal.producers.ProducerArbiter;
import rx.subscriptions.SerialSubscription;

class val._self extends Subscriber
{

    boolean done;
    final d this$1;
    final Action0 val$_self;

    public void onCompleted()
    {
        if (!done)
        {
            done = true;
            d.onCompleted();
        }
    }

    public void onError(Throwable throwable)
    {
label0:
        {
            if (!done)
            {
                done = true;
                if (!((Boolean)icate.call(Integer.valueOf(mpts), throwable)).booleanValue() || r.inner())
                {
                    break label0;
                }
                r.inner(val$_self);
            }
            return;
        }
        d.onError(throwable);
    }

    public void onNext(Object obj)
    {
        if (!done)
        {
            d.onNext(obj);
            d.produced(1L);
        }
    }

    public void setProducer(Producer producer)
    {
        d.setProducer(producer);
    }

    l.o()
    {
        this$1 = final_o;
        val$_self = Action0.this;
        super();
    }

    // Unreferenced inner class rx/internal/operators/OperatorRetryWithPredicate$SourceSubscriber$1

/* anonymous class */
    class OperatorRetryWithPredicate.SourceSubscriber._cls1
        implements Action0
    {

        final OperatorRetryWithPredicate.SourceSubscriber this$0;
        final Observable val$o;

        public void call()
        {
            OperatorRetryWithPredicate.SourceSubscriber.ATTEMPTS_UPDATER.incrementAndGet(OperatorRetryWithPredicate.SourceSubscriber.this);
            OperatorRetryWithPredicate.SourceSubscriber._cls1._cls1 _lcls1 = new OperatorRetryWithPredicate.SourceSubscriber._cls1._cls1();
            serialSubscription.set(_lcls1);
            o.unsafeSubscribe(_lcls1);
        }

            
            {
                this$0 = final_sourcesubscriber;
                o = Observable.this;
                super();
            }
    }

}
