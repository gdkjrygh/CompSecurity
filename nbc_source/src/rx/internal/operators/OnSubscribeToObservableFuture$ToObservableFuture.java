// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import rx.Subscriber;
import rx.functions.Action0;
import rx.subscriptions.Subscriptions;

// Referenced classes of package rx.internal.operators:
//            OnSubscribeToObservableFuture

static class unit
    implements rx.ToObservableFuture
{

    private final Future that;
    private final long time;
    private final TimeUnit unit;

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(Subscriber subscriber)
    {
        subscriber.add(Subscriptions.create(new Action0() {

            final OnSubscribeToObservableFuture.ToObservableFuture this$0;

            public void call()
            {
                that.cancel(true);
            }

            
            {
                this$0 = OnSubscribeToObservableFuture.ToObservableFuture.this;
                super();
            }
        }));
        Object obj;
        try
        {
            if (subscriber.isUnsubscribed())
            {
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            if (!subscriber.isUnsubscribed())
            {
                subscriber.onError(((Throwable) (obj)));
                return;
            } else
            {
                return;
            }
        }
        if (unit != null)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        obj = that.get();
_L1:
        subscriber.onNext(obj);
        subscriber.onCompleted();
        return;
        obj = that.get(time, unit);
          goto _L1
    }


    public _cls1.this._cls0(Future future)
    {
        that = future;
        time = 0L;
        unit = null;
    }

    public unit(Future future, long l, TimeUnit timeunit)
    {
        that = future;
        time = l;
        unit = timeunit;
    }
}
