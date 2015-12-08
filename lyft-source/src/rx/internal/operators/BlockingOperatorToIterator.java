// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import rx.Notification;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.Exceptions;

public final class BlockingOperatorToIterator
{

    private BlockingOperatorToIterator()
    {
        throw new IllegalStateException("No instances!");
    }

    public static Iterator toIterator(Observable observable)
    {
        final LinkedBlockingQueue notifications = new LinkedBlockingQueue();
        return new Iterator() {

            private Notification buf;
            final BlockingQueue val$notifications;
            final Subscription val$subscription;

            private Notification take()
            {
                Notification notification;
                try
                {
                    notification = (Notification)notifications.poll();
                }
                catch (InterruptedException interruptedexception)
                {
                    subscription.unsubscribe();
                    throw Exceptions.propagate(interruptedexception);
                }
                if (notification != null)
                {
                    return notification;
                }
                notification = (Notification)notifications.take();
                return notification;
            }

            public boolean hasNext()
            {
                if (buf == null)
                {
                    buf = take();
                }
                if (buf.isOnError())
                {
                    throw Exceptions.propagate(buf.getThrowable());
                }
                return !buf.isOnCompleted();
            }

            public Object next()
            {
                if (hasNext())
                {
                    Object obj = buf.getValue();
                    buf = null;
                    return obj;
                } else
                {
                    throw new NoSuchElementException();
                }
            }

            public void remove()
            {
                throw new UnsupportedOperationException("Read-only iterator");
            }

            
            {
                notifications = blockingqueue;
                subscription = subscription1;
                super();
            }
        };
    }

    // Unreferenced inner class rx/internal/operators/BlockingOperatorToIterator$1

/* anonymous class */
    final class _cls1 extends Subscriber
    {

        final BlockingQueue val$notifications;

        public void onCompleted()
        {
        }

        public void onError(Throwable throwable)
        {
            notifications.offer(Notification.createOnError(throwable));
        }

        public volatile void onNext(Object obj)
        {
            onNext((Notification)obj);
        }

        public void onNext(Notification notification)
        {
            notifications.offer(notification);
        }

            
            {
                notifications = blockingqueue;
                super();
            }
    }

}
