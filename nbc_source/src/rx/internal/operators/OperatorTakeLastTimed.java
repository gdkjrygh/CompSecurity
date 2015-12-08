// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.TimeUnit;
import rx.Scheduler;
import rx.Subscriber;

// Referenced classes of package rx.internal.operators:
//            NotificationLite, TakeLastQueueProducer

public final class OperatorTakeLastTimed
    implements rx.Observable.Operator
{

    private final long ageMillis;
    private final int count;
    private final Scheduler scheduler;

    public OperatorTakeLastTimed(int i, long l, TimeUnit timeunit, Scheduler scheduler1)
    {
        if (i < 0)
        {
            throw new IndexOutOfBoundsException("count could not be negative");
        } else
        {
            ageMillis = timeunit.toMillis(l);
            scheduler = scheduler1;
            count = i;
            return;
        }
    }

    public OperatorTakeLastTimed(long l, TimeUnit timeunit, Scheduler scheduler1)
    {
        ageMillis = timeunit.toMillis(l);
        scheduler = scheduler1;
        count = -1;
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(final Subscriber final_subscriber1)
    {
        final ArrayDeque buffer = new ArrayDeque();
        final ArrayDeque timestampBuffer = new ArrayDeque();
        final NotificationLite notification = NotificationLite.instance();
        TakeLastQueueProducer takelastqueueproducer = new TakeLastQueueProducer(notification, buffer, final_subscriber1);
        final_subscriber1.setProducer(takelastqueueproducer);
        return new Subscriber(takelastqueueproducer) {

            final OperatorTakeLastTimed this$0;
            final Deque val$buffer;
            final NotificationLite val$notification;
            final TakeLastQueueProducer val$producer;
            final Subscriber val$subscriber;
            final Deque val$timestampBuffer;

            public void onCompleted()
            {
                runEvictionPolicy(scheduler.now());
                timestampBuffer.clear();
                buffer.offer(notification.completed());
                producer.startEmitting();
            }

            public void onError(Throwable throwable)
            {
                timestampBuffer.clear();
                buffer.clear();
                subscriber.onError(throwable);
            }

            public void onNext(Object obj)
            {
                long l = scheduler.now();
                timestampBuffer.add(Long.valueOf(l));
                buffer.add(notification.next(obj));
                runEvictionPolicy(l);
            }

            public void onStart()
            {
                request(0x7fffffffffffffffL);
            }

            protected void runEvictionPolicy(long l)
            {
                for (; count >= 0 && buffer.size() > count; buffer.pollFirst())
                {
                    timestampBuffer.pollFirst();
                }

                for (; !buffer.isEmpty() && ((Long)timestampBuffer.peekFirst()).longValue() < l - ageMillis; buffer.pollFirst())
                {
                    timestampBuffer.pollFirst();
                }

            }

            
            {
                this$0 = OperatorTakeLastTimed.this;
                buffer = deque;
                timestampBuffer = deque1;
                notification = notificationlite;
                subscriber = subscriber2;
                producer = takelastqueueproducer;
                super(final_subscriber1);
            }
        };
    }



}
