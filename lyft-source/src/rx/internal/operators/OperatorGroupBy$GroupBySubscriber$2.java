// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.OnErrorThrowable;
import rx.functions.Action0;
import rx.functions.Func1;

class val.key
    implements rx.roupBySubscriber._cls2
{

    final _cls2 this$0;
    final oupState val$groupState;
    final Object val$key;

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(final Subscriber final_subscriber)
    {
        final_subscriber.setProducer(new Producer() {

            final OperatorGroupBy.GroupBySubscriber._cls2 this$1;

            public void request(long l)
            {
                requestFromGroupedObservable(l, groupState);
            }

            
            {
                this$1 = OperatorGroupBy.GroupBySubscriber._cls2.this;
                super();
            }
        });
        final AtomicBoolean once = new AtomicBoolean();
        val$groupState.getObservable().doOnUnsubscribe(new Action0() {

            final OperatorGroupBy.GroupBySubscriber._cls2 this$1;
            final AtomicBoolean val$once;

            public void call()
            {
                if (once.compareAndSet(false, true))
                {
                    OperatorGroupBy.GroupBySubscriber.access$400(this$0, key);
                }
            }

            
            {
                this$1 = OperatorGroupBy.GroupBySubscriber._cls2.this;
                once = atomicboolean;
                super();
            }
        }).unsafeSubscribe(new Subscriber(once) {

            final OperatorGroupBy.GroupBySubscriber._cls2 this$1;
            final Subscriber val$o;
            final AtomicBoolean val$once;

            public void onCompleted()
            {
                o.onCompleted();
                if (once.compareAndSet(false, true))
                {
                    OperatorGroupBy.GroupBySubscriber.access$400(this$0, key);
                }
            }

            public void onError(Throwable throwable)
            {
                o.onError(throwable);
                if (once.compareAndSet(false, true))
                {
                    OperatorGroupBy.GroupBySubscriber.access$400(this$0, key);
                }
            }

            public void onNext(Object obj)
            {
                try
                {
                    o.onNext(elementSelector.call(obj));
                    return;
                }
                catch (Throwable throwable)
                {
                    onError(OnErrorThrowable.addValueAsLastCause(throwable, obj));
                }
            }

            public void onStart()
            {
            }

            
            {
                this$1 = OperatorGroupBy.GroupBySubscriber._cls2.this;
                o = subscriber1;
                once = atomicboolean;
                super(final_subscriber);
            }
        });
    }

    oupState()
    {
        this$0 = final_oupstate;
        val$groupState = oupstate1;
        val$key = Object.this;
        super();
    }
}
