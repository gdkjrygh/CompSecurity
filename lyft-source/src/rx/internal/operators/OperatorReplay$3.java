// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;

// Referenced classes of package rx.internal.operators:
//            OperatorReplay

final class val.observable
    implements rx.cribe
{

    final Observable val$observable;

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(final Subscriber final_subscriber)
    {
        val$observable.unsafeSubscribe(new Subscriber(final_subscriber) {

            final OperatorReplay._cls3 this$0;
            final Subscriber val$child;

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
                child.onNext(obj);
            }

            
            {
                this$0 = OperatorReplay._cls3.this;
                child = subscriber1;
                super(final_subscriber);
            }
        });
    }

    _cls1.val.child()
    {
        val$observable = observable1;
        super();
    }
}
