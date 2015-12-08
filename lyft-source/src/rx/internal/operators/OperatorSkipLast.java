// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.ArrayDeque;
import java.util.Deque;
import rx.Subscriber;

// Referenced classes of package rx.internal.operators:
//            NotificationLite

public class OperatorSkipLast
    implements rx.Observable.Operator
{

    private final int count;

    public OperatorSkipLast(int i)
    {
        if (i < 0)
        {
            throw new IndexOutOfBoundsException("count could not be negative");
        } else
        {
            count = i;
            return;
        }
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(final Subscriber final_subscriber1)
    {
        return new Subscriber(final_subscriber1) {

            private final Deque deque = new ArrayDeque();
            private final NotificationLite on = NotificationLite.instance();
            final OperatorSkipLast this$0;
            final Subscriber val$subscriber;

            public void onCompleted()
            {
                subscriber.onCompleted();
            }

            public void onError(Throwable throwable)
            {
                subscriber.onError(throwable);
            }

            public void onNext(Object obj)
            {
                if (count == 0)
                {
                    subscriber.onNext(obj);
                    return;
                }
                if (deque.size() == count)
                {
                    subscriber.onNext(on.getValue(deque.removeFirst()));
                } else
                {
                    request(1L);
                }
                deque.offerLast(on.next(obj));
            }

            
            {
                this$0 = OperatorSkipLast.this;
                subscriber = subscriber2;
                super(final_subscriber1);
            }
        };
    }

}
