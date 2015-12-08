// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Producer;
import rx.Subscriber;
import rx.functions.Func1;

public final class OperatorTakeUntilPredicate
    implements rx.Observable.Operator
{

    private final Func1 stopPredicate;

    public OperatorTakeUntilPredicate(Func1 func1)
    {
        stopPredicate = func1;
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(Subscriber subscriber)
    {
        final ParentSubscriber parent = new ParentSubscriber(subscriber);
        subscriber.add(parent);
        subscriber.setProducer(new Producer() {

            final OperatorTakeUntilPredicate this$0;
            final ParentSubscriber val$parent;

            public void request(long l)
            {
                parent.downstreamRequest(l);
            }

            
            {
                this$0 = OperatorTakeUntilPredicate.this;
                parent = parentsubscriber;
                super();
            }
        });
        return parent;
    }


    private class ParentSubscriber extends Subscriber
    {

        private final Subscriber child;
        private boolean done;
        final OperatorTakeUntilPredicate this$0;

        void downstreamRequest(long l)
        {
            request(l);
        }

        public void onCompleted()
        {
            if (!done)
            {
                child.onCompleted();
            }
        }

        public void onError(Throwable throwable)
        {
            if (!done)
            {
                child.onError(throwable);
            }
        }

        public void onNext(Object obj)
        {
            child.onNext(obj);
            boolean flag;
            try
            {
                flag = ((Boolean)stopPredicate.call(obj)).booleanValue();
            }
            catch (Throwable throwable)
            {
                done = true;
                Exceptions.throwIfFatal(throwable);
                child.onError(OnErrorThrowable.addValueAsLastCause(throwable, obj));
                unsubscribe();
                return;
            }
            if (flag)
            {
                done = true;
                child.onCompleted();
                unsubscribe();
            }
        }

        private ParentSubscriber(Subscriber subscriber)
        {
            this$0 = OperatorTakeUntilPredicate.this;
            super();
            done = false;
            child = subscriber;
        }

    }

}
