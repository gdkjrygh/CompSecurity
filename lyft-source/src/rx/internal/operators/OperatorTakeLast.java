// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.ArrayDeque;
import java.util.Deque;
import rx.Subscriber;

// Referenced classes of package rx.internal.operators:
//            NotificationLite, TakeLastQueueProducer

public final class OperatorTakeLast
    implements rx.Observable.Operator
{

    private final int count;

    public OperatorTakeLast(int i)
    {
        if (i < 0)
        {
            throw new IndexOutOfBoundsException("count cannot be negative");
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
        final ArrayDeque deque = new ArrayDeque();
        final NotificationLite notification = NotificationLite.instance();
        final TakeLastQueueProducer producer = new TakeLastQueueProducer(notification, deque, final_subscriber1);
        final_subscriber1.setProducer(producer);
        return new Subscriber(final_subscriber1) {

            final OperatorTakeLast this$0;
            final Deque val$deque;
            final NotificationLite val$notification;
            final TakeLastQueueProducer val$producer;
            final Subscriber val$subscriber;

            public void onCompleted()
            {
                deque.offer(notification.completed());
                producer.startEmitting();
            }

            public void onError(Throwable throwable)
            {
                deque.clear();
                subscriber.onError(throwable);
            }

            public void onNext(Object obj)
            {
                if (count == 0)
                {
                    return;
                }
                if (deque.size() == count)
                {
                    deque.removeFirst();
                }
                deque.offerLast(notification.next(obj));
            }

            public void onStart()
            {
                request(0x7fffffffffffffffL);
            }

            
            {
                this$0 = OperatorTakeLast.this;
                deque = deque1;
                notification = notificationlite;
                producer = takelastqueueproducer;
                subscriber = subscriber2;
                super(final_subscriber1);
            }
        };
    }

}
