// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import me.lyft.android.common.Preconditions;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import rx.Observable;
import rx.Subscription;
import rx.functions.Action1;

public abstract class Presenter
{

    private Binder binder;
    protected View view;

    public Presenter()
    {
    }

    public final void attachView(View view1)
    {
        Preconditions.checkNotNull(view1);
        boolean flag;
        if (view == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "attachView has already been called");
        binder = new Binder();
        view = view1;
        onAttach();
    }

    public Subscription bind(Observable observable, AsyncCall asynccall)
    {
        return binder.bind(observable, asynccall);
    }

    public Subscription bind(Observable observable, Action1 action1)
    {
        return binder.bind(observable, action1);
    }

    public final void detachView(View view1)
    {
        Preconditions.checkNotNull(view1);
        Preconditions.checkNotNull(view, "attachView has not been called");
        boolean flag;
        if (view1 == view)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "views aren't equal");
        onDetach();
        binder.detach();
        binder = null;
        view = null;
    }

    protected abstract void onAttach();

    protected void onDetach()
    {
    }

    public void remove(Subscription subscription)
    {
        binder.remove(subscription);
    }
}
