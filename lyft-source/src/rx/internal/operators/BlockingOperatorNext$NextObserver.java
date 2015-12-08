// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import rx.Notification;
import rx.Subscriber;

class <init> extends Subscriber
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
label0:
        {
            Notification notification1 = notification;
            if (WAITING_UPDATER.getAndSet(this, 0) != 1)
            {
                if (notification.isOnNext())
                {
                    break label0;
                }
                notification1 = notification;
            }
            do
            {
                if (buf.offer(notification1))
                {
                    break;
                }
                notification = (Notification)buf.poll();
                if (notification != null && !notification.isOnNext())
                {
                    notification1 = notification;
                }
            } while (true);
        }
    }

    void setWaiting(int i)
    {
        waiting = i;
    }

    public Notification takeNext()
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
