// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.observables;

import rx.Observable;
import rx.Subscription;
import rx.functions.Action1;
import rx.functions.Actions;
import rx.internal.operators.OnSubscribeAutoConnect;
import rx.internal.operators.OnSubscribeRefCount;

public abstract class ConnectableObservable extends Observable
{

    protected ConnectableObservable(rx.Observable.OnSubscribe onsubscribe)
    {
        super(onsubscribe);
    }

    public Observable autoConnect()
    {
        return autoConnect(1);
    }

    public Observable autoConnect(int i)
    {
        return autoConnect(i, ((Action1) (Actions.empty())));
    }

    public Observable autoConnect(int i, Action1 action1)
    {
        if (i <= 0)
        {
            connect(action1);
            return this;
        } else
        {
            return create(new OnSubscribeAutoConnect(this, i, action1));
        }
    }

    public final Subscription connect()
    {
        final Subscription out[] = new Subscription[1];
        connect(new Action1() {

            final ConnectableObservable this$0;
            final Subscription val$out[];

            public volatile void call(Object obj)
            {
                call((Subscription)obj);
            }

            public void call(Subscription subscription)
            {
                out[0] = subscription;
            }

            
            {
                this$0 = ConnectableObservable.this;
                out = asubscription;
                super();
            }
        });
        return out[0];
    }

    public abstract void connect(Action1 action1);

    public Observable refCount()
    {
        return create(new OnSubscribeRefCount(this));
    }
}
