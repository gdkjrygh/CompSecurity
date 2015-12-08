// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicInteger;
import rx.Subscriber;
import rx.functions.Action1;
import rx.observables.ConnectableObservable;
import rx.observers.Subscribers;

public final class OnSubscribeAutoConnect
    implements rx.Observable.OnSubscribe
{

    final AtomicInteger clients;
    final Action1 connection;
    final int numberOfSubscribers;
    final ConnectableObservable source;

    public OnSubscribeAutoConnect(ConnectableObservable connectableobservable, int i, Action1 action1)
    {
        if (i <= 0)
        {
            throw new IllegalArgumentException("numberOfSubscribers > 0 required");
        } else
        {
            source = connectableobservable;
            numberOfSubscribers = i;
            connection = action1;
            clients = new AtomicInteger();
            return;
        }
    }

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(Subscriber subscriber)
    {
        source.unsafeSubscribe(Subscribers.wrap(subscriber));
        if (clients.incrementAndGet() == numberOfSubscribers)
        {
            source.connect(connection);
        }
    }
}
