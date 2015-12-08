// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.BlockingQueue;
import rx.Notification;
import rx.Subscription;
import rx.exceptions.Exceptions;

// Referenced classes of package rx.internal.operators:
//            BlockingOperatorToIterator

static final class val.subscription
    implements Iterator
{

    private Notification buf;
    final BlockingQueue val$notifications;
    final Subscription val$subscription;

    private Notification take()
    {
        Notification notification;
        try
        {
            notification = (Notification)val$notifications.take();
        }
        catch (InterruptedException interruptedexception)
        {
            val$subscription.unsubscribe();
            throw Exceptions.propagate(interruptedexception);
        }
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

    (BlockingQueue blockingqueue, Subscription subscription1)
    {
        val$notifications = blockingqueue;
        val$subscription = subscription1;
        super();
    }
}
