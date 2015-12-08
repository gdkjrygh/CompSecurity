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

final class val.selector
    implements rx.cribe
{

    final Func0 val$connectableFactory;
    final Func1 val$selector;

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(final Subscriber child)
    {
        ConnectableObservable connectableobservable;
        Observable observable;
        try
        {
            connectableobservable = (ConnectableObservable)val$connectableFactory.call();
            observable = (Observable)val$selector.call(connectableobservable);
        }
        catch (Throwable throwable)
        {
            Exceptions.throwIfFatal(throwable);
            child.onError(throwable);
            return;
        }
        observable.subscribe(child);
        connectableobservable.connect(new Action1() {

            final OperatorReplay._cls2 this$0;
            final Subscriber val$child;

            public volatile void call(Object obj)
            {
                call((Subscription)obj);
            }

            public void call(Subscription subscription)
            {
                child.add(subscription);
            }

            
            {
                this$0 = OperatorReplay._cls2.this;
                child = subscriber;
                super();
            }
        });
    }

    _cls1.val.child()
    {
        val$connectableFactory = func0;
        val$selector = func1;
        super();
    }
}
