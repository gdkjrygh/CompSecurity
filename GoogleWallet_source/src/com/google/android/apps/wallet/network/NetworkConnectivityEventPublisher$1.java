// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.network;

import com.google.android.apps.wallet.logging.WLog;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.network:
//            NetworkConnectivityEventPublisher, NetworkInformationProvider, NetworkConnectivityEvent

final class this._cls0
    implements Callable
{

    final NetworkConnectivityEventPublisher this$0;

    private NetworkConnectivityEvent call()
        throws Exception
    {
        boolean flag = NetworkConnectivityEventPublisher.access$000(NetworkConnectivityEventPublisher.this).hasNetworkAccess();
        WLog.v(NetworkConnectivityEventPublisher.access$100(), (new StringBuilder(59)).append("Returning initial NetworkConnectivityEvent connected: ").append(flag).toString());
        return new NetworkConnectivityEvent(flag);
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    ()
    {
        this$0 = NetworkConnectivityEventPublisher.this;
        super();
    }
}
