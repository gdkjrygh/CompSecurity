// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.actionbar;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;
import com.soundcloud.android.presentation.SwipeRefreshAttacher;
import com.soundcloud.android.rx.RxUtils;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.android.view.MultiSwipeRefreshLayout;
import com.soundcloud.android.view.RefreshableListComponent;
import com.soundcloud.android.view.adapters.ReactiveAdapter;
import com.soundcloud.java.checks.Preconditions;
import com.soundcloud.lightcycle.DefaultSupportFragmentLightCycle;
import rx.Y;
import rx.b;

public class PullToRefreshController extends DefaultSupportFragmentLightCycle
{
    private final class RefreshSubscriber extends DefaultSubscriber
    {

        private final ReactiveAdapter adapter;
        final PullToRefreshController this$0;

        public final void onError(Throwable throwable)
        {
            stopRefreshing();
            super.onError(throwable);
        }

        public final void onNext(Iterable iterable)
        {
            adapter.clear();
            adapter.onNext(iterable);
            stopRefreshing();
            unsubscribe();
        }

        public final volatile void onNext(Object obj)
        {
            onNext((Iterable)obj);
        }

        public RefreshSubscriber(ReactiveAdapter reactiveadapter)
        {
            this$0 = PullToRefreshController.this;
            super();
            adapter = reactiveadapter;
        }
    }


    private android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener refreshListener;
    private Y refreshSubscription;
    private boolean wasRefreshing;
    private final SwipeRefreshAttacher wrapper;

    public PullToRefreshController(SwipeRefreshAttacher swiperefreshattacher)
    {
        refreshSubscription = RxUtils.invalidSubscription();
        wrapper = swiperefreshattacher;
    }

    public void connect(b b1, ReactiveAdapter reactiveadapter)
    {
        if (wasRefreshing)
        {
            refreshSubscription = b1.subscribe(new RefreshSubscriber(reactiveadapter));
        }
    }

    public boolean isAttached()
    {
        return wrapper.isAttached();
    }

    public boolean isRefreshing()
    {
        return wrapper.isRefreshing();
    }

    public void onDestroyView(Fragment fragment)
    {
        wasRefreshing = isRefreshing();
        refreshSubscription.unsubscribe();
        wrapper.detach();
    }

    public void onViewCreated(Fragment fragment, View view, Bundle bundle)
    {
        Preconditions.checkNotNull(refreshListener, "You must set a refresh listener before calling onViewCreated");
        if (view instanceof SwipeRefreshLayout)
        {
            fragment = (MultiSwipeRefreshLayout)view;
        } else
        {
            fragment = (MultiSwipeRefreshLayout)view.findViewById(0x7f0f0153);
        }
        wrapper.attach(refreshListener, fragment, new View[] {
            view.findViewById(0x102000a), view.findViewById(0x1020004)
        });
        wrapper.setRefreshing(wasRefreshing);
    }

    public void setRefreshListener(android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener onrefreshlistener)
    {
        refreshListener = onrefreshlistener;
    }

    public void setRefreshListener(final RefreshableListComponent component, final ReactiveAdapter adapter)
    {
        refreshListener = new _cls1();
    }

    public void startRefreshing()
    {
        if (isAttached())
        {
            wrapper.setRefreshing(true);
        }
    }

    public void stopRefreshing()
    {
        if (isAttached())
        {
            wrapper.setRefreshing(false);
        }
    }


/*
    static Y access$002(PullToRefreshController pulltorefreshcontroller, Y y)
    {
        pulltorefreshcontroller.refreshSubscription = y;
        return y;
    }

*/

    private class _cls1
        implements android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener
    {

        final PullToRefreshController this$0;
        final ReactiveAdapter val$adapter;
        final RefreshableListComponent val$component;

        public void onRefresh()
        {
            b b1 = component.refreshObservable();
            refreshSubscription = b1.subscribe(new RefreshSubscriber(adapter));
            component.connectObservable(b1);
        }

        _cls1()
        {
            this$0 = PullToRefreshController.this;
            component = refreshablelistcomponent;
            adapter = reactiveadapter;
            super();
        }
    }

}
