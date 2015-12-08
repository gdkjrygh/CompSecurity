// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import rx.Observable;
import rx.Subscriber;
import rx.functions.Action0;
import rx.functions.Func2;
import rx.subscriptions.SerialSubscription;

// Referenced classes of package rx.internal.operators:
//            OperatorRetryWithPredicate

class val.o
    implements Action0
{

    final val.o this$0;
    final Observable val$o;

    public void call()
    {
        TEMPTS_UPDATER.incrementAndGet(this._cls0.this);
        Subscriber subscriber = new Subscriber() {

            boolean done;
            final OperatorRetryWithPredicate.SourceSubscriber._cls1 this$1;
            final Action0 val$_self;

            public void onCompleted()
            {
                if (!done)
                {
                    done = true;
                    child.onCompleted();
                }
            }

            public void onError(Throwable throwable)
            {
label0:
                {
                    if (!done)
                    {
                        done = true;
                        if (!((Boolean)predicate.call(Integer.valueOf(attempts), throwable)).booleanValue() || inner.isUnsubscribed())
                        {
                            break label0;
                        }
                        inner.schedule(_self);
                    }
                    return;
                }
                child.onError(throwable);
            }

            public void onNext(Object obj)
            {
                if (!done)
                {
                    child.onNext(obj);
                }
            }

            
            {
                this$1 = OperatorRetryWithPredicate.SourceSubscriber._cls1.this;
                _self = action0;
                super();
            }
        };
        rialSubscription.set(subscriber);
        val$o.unsafeSubscribe(subscriber);
    }

    _cls1.val._self()
    {
        this$0 = final__pself;
        val$o = Observable.this;
        super();
    }
}
