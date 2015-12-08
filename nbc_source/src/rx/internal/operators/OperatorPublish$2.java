// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.observables.ConnectableObservable;

// Referenced classes of package rx.internal.operators:
//            OperatorPublish

static final class val.selector
    implements rx.ribe
{

    final Func1 val$selector;
    final Observable val$source;

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(final Subscriber child)
    {
        ConnectableObservable connectableobservable = OperatorPublish.create(val$source);
        ((Observable)val$selector.call(connectableobservable)).unsafeSubscribe(child);
        connectableobservable.connect(new Action1() {

            final OperatorPublish._cls2 this$0;
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
                this$0 = OperatorPublish._cls2.this;
                child = subscriber;
                super();
            }
        });
    }

    _cls1.val.child(Observable observable, Func1 func1)
    {
        val$source = observable;
        val$selector = func1;
        super();
    }
}
