// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import rx.Notification;
import rx.Subscriber;

// Referenced classes of package rx.internal.operators:
//            BlockingOperatorNext

private static class <init> extends Subscriber
{

    static final AtomicIntegerFieldUpdater WAITING_UPDATER = AtomicIntegerFieldUpdater.newUpdater(rx/internal/operators/BlockingOperatorNext$NextObserver, "waiting");
    private final BlockingQueue buf;
    volatile int waiting;

    public void onCompleted()
    {
    }

    public void onError(Throwable throwable)
    {
    }

    public volatile void onNext(Object obj)
    {
        onNext((Notification)obj);
    }

    public void onNext(Notification notification)
    {
        if (WAITING_UPDATER.getAndSet(this, 0) == 1 || !notification.isOnNext())
        {
            do
            {
                if (buf.offer(notification))
                {
                    break;
                }
                Notification notification1 = (Notification)buf.poll();
                if (notification1 != null && !notification1.isOnNext())
                {
                    notification = notification1;
                }
            } while (true);
        }
    }

    void setWaiting(int i)
    {
        waiting = i;
    }

    public Notification takeNext()
        throws InterruptedException
    {
        setWaiting(1);
        return (Notification)buf.take();
    }


    private ()
    {
        buf = new ArrayBlockingQueue(1);
    }

    buf(buf buf1)
    {
        this();
    }
}
