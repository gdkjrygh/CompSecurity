// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.ArrayDeque;
import java.util.Deque;
import rx.Subscriber;

// Referenced classes of package rx.internal.operators:
//            OperatorSkipLast, NotificationLite

class val.subscriber extends Subscriber
{

    private final Deque deque = new ArrayDeque();
    private final NotificationLite on = NotificationLite.instance();
    final OperatorSkipLast this$0;
    final Subscriber val$subscriber;

    public void onCompleted()
    {
        val$subscriber.onCompleted();
    }

    public void onError(Throwable throwable)
    {
        val$subscriber.onError(throwable);
    }

    public void onNext(Object obj)
    {
        if (OperatorSkipLast.access$000(OperatorSkipLast.this) == 0)
        {
            val$subscriber.onNext(obj);
            return;
        }
        if (deque.size() == OperatorSkipLast.access$000(OperatorSkipLast.this))
        {
            val$subscriber.onNext(on.getValue(deque.removeFirst()));
        } else
        {
            request(1L);
        }
        deque.offerLast(on.next(obj));
    }

    (Subscriber subscriber2)
    {
        this$0 = final_operatorskiplast;
        val$subscriber = subscriber2;
        super(Subscriber.this);
    }
}
