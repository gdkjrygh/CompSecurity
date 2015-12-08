// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Producer;
import rx.Subscriber;
import rx.functions.Action1;

public class OperatorDoOnRequest
    implements rx.Observable.Operator
{
    private static final class ParentSubscriber extends Subscriber
    {

        private final Subscriber child;

        private void requestMore(long l)
        {
            request(l);
        }

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


        private ParentSubscriber(Subscriber subscriber)
        {
            child = subscriber;
        }

    }


    private final Action1 request;

    public OperatorDoOnRequest(Action1 action1)
    {
        request = action1;
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(Subscriber subscriber)
    {
        final ParentSubscriber parent = new ParentSubscriber(subscriber);
        subscriber.setProducer(new Producer() {

            final OperatorDoOnRequest this$0;
            final ParentSubscriber val$parent;

            public void request(long l)
            {
                OperatorDoOnRequest.this.request.call(Long.valueOf(l));
                parent.requestMore(l);
            }

            
            {
                this$0 = OperatorDoOnRequest.this;
                parent = parentsubscriber;
                super();
            }
        });
        subscriber.add(parent);
        return parent;
    }

}
