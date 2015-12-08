// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Subscriber;
import rx.functions.Action0;
import rx.observers.Subscribers;

public class OperatorDoOnSubscribe
    implements rx.Observable.Operator
{

    private final Action0 subscribe;

    public OperatorDoOnSubscribe(Action0 action0)
    {
        subscribe = action0;
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(Subscriber subscriber)
    {
        subscribe.call();
        return Subscribers.wrap(subscriber);
    }
}
