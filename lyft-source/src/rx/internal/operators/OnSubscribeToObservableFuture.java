// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public final class OnSubscribeToObservableFuture
{

    private OnSubscribeToObservableFuture()
    {
        throw new IllegalStateException("No instances!");
    }

    public static rx.Observable.OnSubscribe toObservableFuture(Future future)
    {
        return new ToObservableFuture(future);
    }

    public static rx.Observable.OnSubscribe toObservableFuture(Future future, long l, TimeUnit timeunit)
    {
        return new ToObservableFuture(future, l, timeunit);
    }

    private class ToObservableFuture
        implements rx.Observable.OnSubscribe
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

                final ToObservableFuture this$0;

                public void call()
                {
                    that.cancel(true);
                }

                
                {
                    this$0 = ToObservableFuture.this;
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


        public ToObservableFuture(Future future)
        {
            that = future;
            time = 0L;
            unit = null;
        }

        public ToObservableFuture(Future future, long l, TimeUnit timeunit)
        {
            that = future;
            time = l;
            unit = timeunit;
        }
    }

}
