// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.Iterator;
import rx.Observable;

public final class BlockingOperatorLatest
{

    private BlockingOperatorLatest()
    {
        throw new IllegalStateException("No instances!");
    }

    public static Iterable latest(final Observable source)
    {
        return new Iterable() {

            final Observable val$source;

            public Iterator iterator()
            {
                LatestObserverIterator latestobserveriterator = new LatestObserverIterator();
                source.materialize().subscribe(latestobserveriterator);
                return latestobserveriterator;
            }

            
            {
                source = observable;
                super();
            }

            private class LatestObserverIterator extends Subscriber
                implements Iterator
            {

                static final AtomicReferenceFieldUpdater REFERENCE_UPDATER = AtomicReferenceFieldUpdater.newUpdater(rx/internal/operators/BlockingOperatorLatest$LatestObserverIterator, rx/Notification, "value");
                Notification iNotif;
                final Semaphore notify = new Semaphore(0);
                volatile Notification value;

                public boolean hasNext()
                {
                    if (iNotif != null && iNotif.isOnError())
                    {
                        throw Exceptions.propagate(iNotif.getThrowable());
                    }
                    if ((iNotif == null || !iNotif.isOnCompleted()) && iNotif == null)
                    {
                        try
                        {
                            notify.acquire();
                        }
                        catch (InterruptedException interruptedexception)
                        {
                            unsubscribe();
                            Thread.currentThread().interrupt();
                            iNotif = Notification.createOnError(interruptedexception);
                            throw Exceptions.propagate(interruptedexception);
                        }
                        iNotif = (Notification)REFERENCE_UPDATER.getAndSet(this, null);
                        if (iNotif.isOnError())
                        {
                            throw Exceptions.propagate(iNotif.getThrowable());
                        }
                    }
                    return !iNotif.isOnCompleted();
                }

                public Object next()
                {
                    if (hasNext() && iNotif.isOnNext())
                    {
                        Object obj = iNotif.getValue();
                        iNotif = null;
                        return obj;
                    } else
                    {
                        throw new NoSuchElementException();
                    }
                }

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
                    boolean flag;
                    if (REFERENCE_UPDATER.getAndSet(this, notification) == null)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    if (flag)
                    {
                        notify.release();
                    }
                }

                public void remove()
                {
                    throw new UnsupportedOperationException("Read-only iterator.");
                }


                LatestObserverIterator()
                {
                }
            }

        };
    }
}
