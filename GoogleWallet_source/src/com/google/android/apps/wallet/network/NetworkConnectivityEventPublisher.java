// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.network;

import android.app.Application;
import android.content.Intent;
import com.google.android.apps.wallet.eventbus.BroadcastEventPublisher;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.android.apps.wallet.util.async.ThreadChecker;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.network:
//            NetworkConnectivityEvent, NetworkInformationProvider

public class NetworkConnectivityEventPublisher extends BroadcastEventPublisher
{

    private static final String TAG = com/google/android/apps/wallet/network/NetworkConnectivityEventPublisher.getSimpleName();
    private final ActionExecutor actionExecutor;
    private final NetworkInformationProvider networkInformationProvider;

    public NetworkConnectivityEventPublisher(Application application, EventBus eventbus, ThreadChecker threadchecker, ActionExecutor actionexecutor, NetworkInformationProvider networkinformationprovider)
    {
        super(application, eventbus, threadchecker, com/google/android/apps/wallet/network/NetworkConnectivityEvent, "android.net.conn.CONNECTIVITY_CHANGE");
        actionExecutor = actionexecutor;
        networkInformationProvider = networkinformationprovider;
    }

    private static NetworkConnectivityEvent translateIntent(Intent intent)
    {
        boolean flag = false;
        if (!intent.getBooleanExtra("noConnectivity", false))
        {
            flag = true;
        }
        WLog.v(TAG, (new StringBuilder(48)).append("Firing NetworkConnectivityEvent connected: ").append(flag).toString());
        return new NetworkConnectivityEvent(flag);
    }

    protected final void getInitialEvent(AsyncCallback asynccallback)
    {
        WLog.v(TAG, "Entered: getInitialEvent()");
        actionExecutor.executeAction(new Callable() {

            final NetworkConnectivityEventPublisher this$0;

            private NetworkConnectivityEvent call()
                throws Exception
            {
                boolean flag = networkInformationProvider.hasNetworkAccess();
                WLog.v(NetworkConnectivityEventPublisher.TAG, (new StringBuilder(59)).append("Returning initial NetworkConnectivityEvent connected: ").append(flag).toString());
                return new NetworkConnectivityEvent(flag);
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = NetworkConnectivityEventPublisher.this;
                super();
            }
        }, asynccallback);
    }

    protected final volatile Object translateIntent(Intent intent)
    {
        return translateIntent(intent);
    }



}
