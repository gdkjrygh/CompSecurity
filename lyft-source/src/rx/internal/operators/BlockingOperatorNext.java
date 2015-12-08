// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.Iterator;
import rx.Observable;

public final class BlockingOperatorNext
{

    private BlockingOperatorNext()
    {
        throw new IllegalStateException("No instances!");
    }

    public static Iterable next(final Observable items)
    {
        return new Iterable() {

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

            private class NextObserver extends Subscriber
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


                private NextObserver()
                {
                    buf = new ArrayBlockingQueue(1);
                }

            }


            private class NextIterator
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

        };
    }
}
