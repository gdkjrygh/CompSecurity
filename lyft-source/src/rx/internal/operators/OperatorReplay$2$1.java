// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.Exceptions;
import rx.functions.Action1;
import rx.functions.Func0;
import rx.functions.Func1;
import rx.observables.ConnectableObservable;

// Referenced classes of package rx.internal.operators:
//            OperatorReplay

class val.child
    implements Action1
{

    final val.child this$0;
    final Subscriber val$child;

    public volatile void call(Object obj)
    {
        call((Subscription)obj);
    }

    public void call(Subscription subscription)
    {
        val$child.add(subscription);
    }

    l.selector()
    {
        this$0 = final_selector;
        val$child = Subscriber.this;
        super();
    }

    // Unreferenced inner class rx/internal/operators/OperatorReplay$2

/* anonymous class */
    final class OperatorReplay._cls2
        implements rx.Observable.OnSubscribe
    {

        final Func0 val$connectableFactory;
        final Func1 val$selector;

        public volatile void call(Object obj)
        {
            call((Subscriber)obj);
        }

        public void call(Subscriber subscriber)
        {
            ConnectableObservable connectableobservable;
            Observable observable;
            try
            {
                connectableobservable = (ConnectableObservable)connectableFactory.call();
                observable = (Observable)selector.call(connectableobservable);
            }
            catch (Throwable throwable)
            {
                Exceptions.throwIfFatal(throwable);
                subscriber.onError(throwable);
                return;
            }
            observable.subscribe(subscriber);
            connectableobservable.connect(subscriber. new OperatorReplay._cls2._cls1());
        }

            
            {
                connectableFactory = func0;
                selector = func1;
                super();
            }
    }

}
