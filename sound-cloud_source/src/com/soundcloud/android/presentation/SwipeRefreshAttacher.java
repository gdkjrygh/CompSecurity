// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.presentation;

import android.view.View;
import com.soundcloud.android.view.MultiSwipeRefreshLayout;

public class SwipeRefreshAttacher
{

    private MultiSwipeRefreshLayout swipeRefreshLayout;

    public SwipeRefreshAttacher()
    {
    }

    public transient void attach(android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener onrefreshlistener, MultiSwipeRefreshLayout multiswiperefreshlayout, View aview[])
    {
        swipeRefreshLayout = multiswiperefreshlayout;
        multiswiperefreshlayout.setOnRefreshListener(onrefreshlistener);
        multiswiperefreshlayout.setSwipeableChildren(aview);
        multiswiperefreshlayout.setColorSchemeResources(new int[] {
            com.soundcloud.androidkit.R.color.ak_sc_orange
        });
    }

    public void detach()
    {
        swipeRefreshLayout = null;
    }

    public boolean isAttached()
    {
        return swipeRefreshLayout != null;
    }

    public boolean isRefreshing()
    {
        return isAttached() && swipeRefreshLayout.isRefreshing();
    }

    public void setRefreshing(boolean flag)
    {
        if (isAttached())
        {
            swipeRefreshLayout.setRefreshing(flag);
        }
    }
}
