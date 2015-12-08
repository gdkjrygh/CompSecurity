// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.Iterator;
import java.util.NoSuchElementException;
import rx.Notification;
import rx.Observable;
import rx.exceptions.Exceptions;

// Referenced classes of package rx.internal.operators:
//            BlockingOperatorNext

static final class <init>
    implements Iterator
{

    private Throwable error;
    private boolean hasNext;
    private boolean isNextConsumed;
    private final Observable items;
    private Object next;
    private final next observer;
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

    private (Observable observable,  )
    {
        hasNext = true;
        isNextConsumed = true;
        error = null;
        started = false;
        items = observable;
        observer = ;
    }

    observer(Observable observable, observer observer1, observer observer2)
    {
        this(observable, observer1);
    }
}
