// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import rx.Observable;
import rx.Subscriber;
import rx.subjects.ReplaySubject;
import rx.subjects.Subject;

public final class OnSubscribeCache
    implements rx.Observable.OnSubscribe
{

    static final AtomicIntegerFieldUpdater SRC_SUBSCRIBED_UPDATER = AtomicIntegerFieldUpdater.newUpdater(rx/internal/operators/OnSubscribeCache, "sourceSubscribed");
    protected final Subject cache;
    protected final Observable source;
    volatile int sourceSubscribed;

    public OnSubscribeCache(Observable observable)
    {
        this(observable, ((Subject) (ReplaySubject.create())));
    }

    public OnSubscribeCache(Observable observable, int i)
    {
        this(observable, ((Subject) (ReplaySubject.create(i))));
    }

    OnSubscribeCache(Observable observable, Subject subject)
    {
        source = observable;
        cache = subject;
    }

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(Subscriber subscriber)
    {
        if (SRC_SUBSCRIBED_UPDATER.compareAndSet(this, 0, 1))
        {
            source.subscribe(cache);
        }
        cache.unsafeSubscribe(subscriber);
    }

}
