// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.Deque;
import rx.Subscriber;

// Referenced classes of package rx.internal.operators:
//            OperatorTakeLast, NotificationLite, TakeLastQueueProducer

class val.subscriber extends Subscriber
{

    final OperatorTakeLast this$0;
    final Deque val$deque;
    final NotificationLite val$notification;
    final TakeLastQueueProducer val$producer;
    final Subscriber val$subscriber;

    public void onCompleted()
    {
        val$deque.offer(val$notification.completed());
        val$producer.startEmitting();
    }

    public void onError(Throwable throwable)
    {
        val$deque.clear();
        val$subscriber.onError(throwable);
    }

    public void onNext(Object obj)
    {
        if (OperatorTakeLast.access$000(OperatorTakeLast.this) == 0)
        {
            return;
        }
        if (val$deque.size() == OperatorTakeLast.access$000(OperatorTakeLast.this))
        {
            val$deque.removeFirst();
        }
        val$deque.offerLast(val$notification.next(obj));
    }

    public void onStart()
    {
        request(0x7fffffffffffffffL);
    }

    er(Subscriber subscriber2)
    {
        this$0 = final_operatortakelast;
        val$deque = deque1;
        val$notification = notificationlite;
        val$producer = TakeLastQueueProducer.this;
        val$subscriber = subscriber2;
        super(final_subscriber1);
    }
}
