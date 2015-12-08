// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.network;

import com.google.common.base.Preconditions;

// Referenced classes of package com.google.android.apps.wallet.network:
//            NetworkConnectivityEvent

public class NetworkConnectivityReturnChecker
{

    private NetworkConnectivityEvent mLastKnownNetworkConnectivity;

    public NetworkConnectivityReturnChecker()
    {
    }

    public final boolean isConnectivityReturned(NetworkConnectivityEvent networkconnectivityevent)
    {
        Preconditions.checkNotNull(networkconnectivityevent);
        NetworkConnectivityEvent networkconnectivityevent1 = mLastKnownNetworkConnectivity;
        mLastKnownNetworkConnectivity = networkconnectivityevent;
        return networkconnectivityevent.isConnected() && networkconnectivityevent1 != null && !networkconnectivityevent1.isConnected();
    }
}
