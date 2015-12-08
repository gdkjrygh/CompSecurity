// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util;

import rx.Observable;
import rx.Subscriber;
import rx.functions.Func1;

// Referenced classes of package rx.internal.util:
//            ScalarSynchronousObservable

class val.child extends Subscriber
{

    final val.child this$1;
    final Subscriber val$child;

    public void onCompleted()
    {
        val$child.onCompleted();
    }

    public void onError(Throwable throwable)
    {
        val$child.onError(throwable);
    }

    public void onNext(Object obj)
    {
        val$child.onNext(obj);
    }

    l.func(Subscriber subscriber1)
    {
        this$1 = final_func;
        val$child = subscriber1;
        super(Subscriber.this);
    }

    // Unreferenced inner class rx/internal/util/ScalarSynchronousObservable$2

/* anonymous class */
    class ScalarSynchronousObservable._cls2
        implements rx.Observable.OnSubscribe
    {

        final ScalarSynchronousObservable this$0;
        final Func1 val$func;

        public volatile void call(Object obj)
        {
            call((Subscriber)obj);
        }

        public void call(Subscriber subscriber)
        {
            Observable observable = (Observable)func.call(ScalarSynchronousObservable.access$100(ScalarSynchronousObservable.this));
            if (observable.getClass() == rx/internal/util/ScalarSynchronousObservable)
            {
                subscriber.onNext(ScalarSynchronousObservable.access$100((ScalarSynchronousObservable)observable));
                subscriber.onCompleted();
                return;
            } else
            {
                observable.unsafeSubscribe(subscriber. new ScalarSynchronousObservable._cls2._cls1(subscriber));
                return;
            }
        }

            
            {
                this$0 = final_scalarsynchronousobservable;
                func = Func1.this;
                super();
            }
    }

}
