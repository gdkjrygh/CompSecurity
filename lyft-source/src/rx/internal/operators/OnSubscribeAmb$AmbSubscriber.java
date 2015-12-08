// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicReference;
import rx.Subscriber;

final class <init> extends Subscriber
{

    private boolean chosen;
    private final subscriber selection;
    private final Subscriber subscriber;

    private boolean isSelected()
    {
        if (chosen)
        {
            return true;
        }
        if (selection.ce.get() == this)
        {
            chosen = true;
            return true;
        }
        if (selection.ce.compareAndSet(null, this))
        {
            selection.bscribeOthers(this);
            chosen = true;
            return true;
        } else
        {
            selection.bscribeLosers();
            return false;
        }
    }

    private final void requestMore(long l)
    {
        request(l);
    }

    public void onCompleted()
    {
        if (!isSelected())
        {
            return;
        } else
        {
            subscriber.onCompleted();
            return;
        }
    }

    public void onError(Throwable throwable)
    {
        if (!isSelected())
        {
            return;
        } else
        {
            subscriber.onError(throwable);
            return;
        }
    }

    public void onNext(Object obj)
    {
        if (!isSelected())
        {
            return;
        } else
        {
            subscriber.onNext(obj);
            return;
        }
    }


    private (long l, Subscriber subscriber1,  )
    {
        subscriber = subscriber1;
        selection = ;
        request(l);
    }

    request(long l, Subscriber subscriber1, request request, request request1)
    {
        this(l, subscriber1, request);
    }
}
