// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.network.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.wallet.base.fragment.WalletFragment;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.network.NetworkConnectivityEvent;

public class NoInternetConnectionFragment extends WalletFragment
{

    EventBus eventBus;
    private View view;

    public NoInternetConnectionFragment()
    {
    }

    public void handleNetworkConnectivityEvent(NetworkConnectivityEvent networkconnectivityevent)
    {
        View view1 = view;
        byte byte0;
        if (networkconnectivityevent.isConnected())
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        view1.setVisibility(byte0);
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        view = layoutinflater.inflate(com.google.android.apps.walletnfcrel.R.layout.no_internet_connection, viewgroup, false);
        view.setVisibility(8);
        return view;
    }

    public final void onPause()
    {
        super.onPause();
        eventBus.unregisterAll(this);
    }

    public final void onResume()
    {
        super.onResume();
        eventBus.register(this);
    }
}
