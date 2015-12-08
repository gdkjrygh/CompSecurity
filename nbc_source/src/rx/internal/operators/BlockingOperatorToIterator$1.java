// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.BlockingQueue;
import rx.Notification;
import rx.Subscriber;

// Referenced classes of package rx.internal.operators:
//            BlockingOperatorToIterator

static final class val.notifications extends Subscriber
{

    final BlockingQueue val$notifications;

    public void onCompleted()
    {
    }

    public void onError(Throwable throwable)
    {
        val$notifications.offer(Notification.createOnError(throwable));
    }

    public volatile void onNext(Object obj)
    {
        onNext((Notification)obj);
    }

    public void onNext(Notification notification)
    {
        val$notifications.offer(notification);
    }

    (BlockingQueue blockingqueue)
    {
        val$notifications = blockingqueue;
        super();
    }
}
