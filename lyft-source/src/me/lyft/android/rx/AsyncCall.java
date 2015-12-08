// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.rx;

import rx.Subscriber;
import rx.functions.Action0;
import rx.subscriptions.Subscriptions;

public class AsyncCall extends Subscriber
{

    public AsyncCall()
    {
        add(Subscriptions.create(new Action0() {

            final AsyncCall this$0;

            public void call()
            {
                onUnsubscribe();
            }

            
            {
                this$0 = AsyncCall.this;
                super();
            }
        }));
    }

    public final void onCompleted()
    {
        unsubscribe();
    }

    public final void onError(Throwable throwable)
    {
        if (!isUnsubscribed())
        {
            onFail(throwable);
        }
        unsubscribe();
    }

    public void onFail(Throwable throwable)
    {
    }

    public final void onNext(Object obj)
    {
        if (!isUnsubscribed())
        {
            onSuccess(obj);
        }
        unsubscribe();
    }

    public void onSuccess(Object obj)
    {
    }

    public void onUnsubscribe()
    {
    }
}
