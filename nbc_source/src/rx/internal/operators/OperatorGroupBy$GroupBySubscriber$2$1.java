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

// Referenced classes of package rx.internal.operators:
//            OperatorGroupBy

class this._cls1
    implements Producer
{

    final l.groupState this$1;

    public void request(long l)
    {
        estFromGroupedObservable(l, groupState);
    }

    l.key()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class rx/internal/operators/OperatorGroupBy$GroupBySubscriber$2

/* anonymous class */
    class OperatorGroupBy.GroupBySubscriber._cls2
        implements rx.Observable.OnSubscribe
    {

        final OperatorGroupBy.GroupBySubscriber this$0;
        final OperatorGroupBy.GroupBySubscriber.GroupState val$groupState;
        final Object val$key;

        public volatile void call(Object obj)
        {
            call((Subscriber)obj);
        }

        public void call(final Subscriber final_subscriber)
        {
            final_subscriber.setProducer(new OperatorGroupBy.GroupBySubscriber._cls2._cls1());
            final AtomicBoolean once = new AtomicBoolean();
            groupState.getObservable().doOnUnsubscribe(new OperatorGroupBy.GroupBySubscriber._cls2._cls3()).unsafeSubscribe(new OperatorGroupBy.GroupBySubscriber._cls2._cls2(once));
        }

            
            {
                this$0 = final_groupbysubscriber;
                groupState = groupstate;
                key = Object.this;
                super();
            }

        // Unreferenced inner class rx/internal/operators/OperatorGroupBy$GroupBySubscriber$2$2

/* anonymous class */
        class OperatorGroupBy.GroupBySubscriber._cls2._cls2 extends Subscriber
        {

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
        }


        // Unreferenced inner class rx/internal/operators/OperatorGroupBy$GroupBySubscriber$2$3

/* anonymous class */
        class OperatorGroupBy.GroupBySubscriber._cls2._cls3
            implements Action0
        {

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
        }

    }

}
