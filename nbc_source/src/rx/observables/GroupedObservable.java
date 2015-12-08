// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.observables;

import rx.Observable;
import rx.Subscriber;

public class GroupedObservable extends Observable
{

    private final Object key;

    protected GroupedObservable(Object obj, rx.Observable.OnSubscribe onsubscribe)
    {
        super(onsubscribe);
        key = obj;
    }

    public static final GroupedObservable create(Object obj, rx.Observable.OnSubscribe onsubscribe)
    {
        return new GroupedObservable(obj, onsubscribe);
    }

    public static GroupedObservable from(Object obj, Observable observable)
    {
        return new GroupedObservable(obj, new rx.Observable.OnSubscribe(observable) {

            final Observable val$o;

            public volatile void call(Object obj1)
            {
                call((Subscriber)obj1);
            }

            public void call(Subscriber subscriber)
            {
                o.unsafeSubscribe(subscriber);
            }

            
            {
                o = observable;
                super();
            }
        });
    }

    public Object getKey()
    {
        return key;
    }
}
