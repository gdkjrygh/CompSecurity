// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util;

import rx.Observable;
import rx.Subscriber;
import rx.functions.Func1;

// Referenced classes of package rx.internal.util:
//            ScalarSynchronousObservable

class val.func
    implements rx.sObservable._cls2
{

    final ScalarSynchronousObservable this$0;
    final Func1 val$func;

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(final Subscriber final_subscriber)
    {
        Observable observable = (Observable)val$func.call(ScalarSynchronousObservable.access$100(ScalarSynchronousObservable.this));
        if (observable.getClass() == rx/internal/util/ScalarSynchronousObservable)
        {
            final_subscriber.onNext(ScalarSynchronousObservable.access$100((ScalarSynchronousObservable)observable));
            final_subscriber.onCompleted();
            return;
        } else
        {
            observable.unsafeSubscribe(new Subscriber(final_subscriber) {

                final ScalarSynchronousObservable._cls2 this$1;
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
                this$1 = ScalarSynchronousObservable._cls2.this;
                child = subscriber1;
                super(final_subscriber);
            }
            });
            return;
        }
    }

    _cls1.val.child()
    {
        this$0 = final_scalarsynchronousobservable;
        val$func = Func1.this;
        super();
    }
}
