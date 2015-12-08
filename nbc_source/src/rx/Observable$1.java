// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx;

import rx.exceptions.OnErrorNotImplementedException;
import rx.plugins.RxJavaObservableExecutionHook;

// Referenced classes of package rx:
//            Observable, Subscriber

class 
    implements Subscribe
{

    final Observable this$0;
    final erator val$lift;

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(Subscriber subscriber)
    {
        Object obj;
        Throwable throwable;
        try
        {
            obj = (Subscriber)Observable.access$000().onLift(val$lift).call(subscriber);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            if (obj instanceof OnErrorNotImplementedException)
            {
                throw (OnErrorNotImplementedException)obj;
            } else
            {
                subscriber.onError(((Throwable) (obj)));
                return;
            }
        }
        ((Subscriber) (obj)).onStart();
        onSubscribe.call(obj);
        return;
        throwable;
        if (throwable instanceof OnErrorNotImplementedException)
        {
            throw (OnErrorNotImplementedException)throwable;
        }
        ((Subscriber) (obj)).onError(throwable);
        return;
    }

    erator()
    {
        this$0 = final_observable;
        val$lift = erator.this;
        super();
    }
}
