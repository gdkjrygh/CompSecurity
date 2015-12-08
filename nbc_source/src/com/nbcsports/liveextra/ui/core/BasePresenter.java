// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.core;

import android.view.View;
import butterknife.ButterKnife;
import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

public abstract class BasePresenter
{

    private CompositeSubscription subscriptions;
    protected View view;

    public BasePresenter()
    {
    }

    protected void addSubscription(Subscription subscription)
    {
        subscriptions.add(subscription);
    }

    public boolean hasView()
    {
        return view != null;
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
        ButterKnife.unbind(view);
        view = null;
        pause();
    }

    public void resume()
    {
        subscriptions = new CompositeSubscription();
        load();
    }

    protected void setupView()
    {
    }

    public void takeView(View view1)
    {
        view = view1;
        if (view1.isInEditMode())
        {
            return;
        } else
        {
            ButterKnife.bind(view1);
            setupView();
            resume();
            return;
        }
    }
}
