// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.Deque;
import rx.Scheduler;
import rx.Subscriber;

// Referenced classes of package rx.internal.operators:
//            OperatorTakeLastTimed, NotificationLite, TakeLastQueueProducer

class val.producer extends Subscriber
{

    final OperatorTakeLastTimed this$0;
    final Deque val$buffer;
    final NotificationLite val$notification;
    final TakeLastQueueProducer val$producer;
    final Subscriber val$subscriber;
    final Deque val$timestampBuffer;

    public void onCompleted()
    {
        runEvictionPolicy(OperatorTakeLastTimed.access$200(OperatorTakeLastTimed.this).now());
        val$timestampBuffer.clear();
        val$buffer.offer(val$notification.completed());
        val$producer.startEmitting();
    }

    public void onError(Throwable throwable)
    {
        val$timestampBuffer.clear();
        val$buffer.clear();
        val$subscriber.onError(throwable);
    }

    public void onNext(Object obj)
    {
        long l = OperatorTakeLastTimed.access$200(OperatorTakeLastTimed.this).now();
        val$timestampBuffer.add(Long.valueOf(l));
        val$buffer.add(val$notification.next(obj));
        runEvictionPolicy(l);
    }

    public void onStart()
    {
        request(0x7fffffffffffffffL);
    }

    protected void runEvictionPolicy(long l)
    {
        for (; OperatorTakeLastTimed.access$000(OperatorTakeLastTimed.this) >= 0 && val$buffer.size() > OperatorTakeLastTimed.access$000(OperatorTakeLastTimed.this); val$buffer.pollFirst())
        {
            val$timestampBuffer.pollFirst();
        }

        for (; !val$buffer.isEmpty() && ((Long)val$timestampBuffer.peekFirst()).longValue() < l - OperatorTakeLastTimed.access$100(OperatorTakeLastTimed.this); val$buffer.pollFirst())
        {
            val$timestampBuffer.pollFirst();
        }

    }

    (TakeLastQueueProducer takelastqueueproducer)
    {
        this$0 = final_operatortakelasttimed;
        val$buffer = deque;
        val$timestampBuffer = deque1;
        val$notification = notificationlite;
        val$subscriber = Subscriber.this;
        val$producer = takelastqueueproducer;
        super(final_subscriber1);
    }
}
