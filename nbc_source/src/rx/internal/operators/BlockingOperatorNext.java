// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import rx.Notification;
import rx.Observable;
import rx.Subscriber;
import rx.exceptions.Exceptions;

public final class BlockingOperatorNext
{
    static final class NextIterator
        implements Iterator
    {

        private Throwable error;
        private boolean hasNext;
        private boolean isNextConsumed;
        private final Observable items;
        private Object next;
        private final NextObserver observer;
        private boolean started;

        private boolean moveToNext()
        {
            Notification notification;
            if (!started)
            {
                started = true;
                observer.setWaiting(1);
                items.materialize().subscribe(observer);
            }
            notification = observer.takeNext();
            if (!notification.isOnNext())
            {
                break MISSING_BLOCK_LABEL_65;
            }
            isNextConsumed = false;
            next = notification.getValue();
            return true;
            hasNext = false;
            if (notification.isOnCompleted())
            {
                return false;
            }
            try
            {
                if (notification.isOnError())
                {
                    error = notification.getThrowable();
                    throw Exceptions.propagate(error);
                }
            }
            catch (InterruptedException interruptedexception)
            {
                observer.unsubscribe();
                Thread.currentThread().interrupt();
                error = interruptedexception;
                throw Exceptions.propagate(error);
            }
            throw new IllegalStateException("Should not reach here");
        }

        public boolean hasNext()
        {
            if (error != null)
            {
                throw Exceptions.propagate(error);
            }
            if (!hasNext)
            {
                return false;
            }
            if (!isNextConsumed)
            {
                return true;
            } else
            {
                return moveToNext();
            }
        }

        public Object next()
        {
            if (error != null)
            {
                throw Exceptions.propagate(error);
            }
            if (hasNext())
            {
                isNextConsumed = true;
                return next;
            } else
            {
                throw new NoSuchElementException("No more elements");
            }
        }

        public void remove()
        {
            throw new UnsupportedOperationException("Read only iterator");
        }

        private NextIterator(Observable observable, NextObserver nextobserver)
        {
            hasNext = true;
            isNextConsumed = true;
            error = null;
            started = false;
            items = observable;
            observer = nextobserver;
        }

    }

    private static class NextObserver extends Subscriber
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


        private NextObserver()
        {
            buf = new ArrayBlockingQueue(1);
        }

    }


    private BlockingOperatorNext()
    {
        throw new IllegalStateException("No instances!");
    }

    public static Iterable next(Observable observable)
    {
        return new Iterable(observable) {

            final Observable val$items;

            public Iterator iterator()
            {
                NextObserver nextobserver = new NextObserver();
                return new NextIterator(items, nextobserver);
            }

            
            {
                items = observable;
                super();
            }
        };
    }
}
