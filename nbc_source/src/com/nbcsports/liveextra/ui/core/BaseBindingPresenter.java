// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.core;

import android.databinding.Observable;
import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

public abstract class BaseBindingPresenter
{

    protected Observable binder;
    private CompositeSubscription subscriptions;

    public BaseBindingPresenter()
    {
    }

    protected void addSubscription(Subscription subscription)
    {
        subscriptions.add(subscription);
    }

    public boolean hasBinder()
    {
        return binder != null;
    }

    protected abstract void load();

    public void pause()
    {
        if (subscriptions != null)
        {
            subscriptions.unsubscribe();
        }
    }

    public void release()
    {
        binder = null;
        pause();
    }

    public void resume()
    {
        subscriptions = new CompositeSubscription();
        load();
    }

    public void takeView(Observable observable)
    {
        binder = observable;
        resume();
    }
}
