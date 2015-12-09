// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.mywallet;

import android.location.Location;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.eventbus.EventHandler;
import com.google.android.apps.wallet.eventbus.InitializedEventPublisher;
import com.google.android.apps.wallet.eventbus.RegistrationCallback;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.network.NetworkConnectivityEvent;
import com.google.android.apps.wallet.network.NetworkConnectivityReturnChecker;
import com.google.android.apps.wallet.refresh.RequestRefreshEvent;
import com.google.android.apps.wallet.rpc.RpcCaller;
import com.google.android.apps.wallet.rpc.RpcException;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.android.apps.wallet.util.async.ThreadPreconditions;
import com.google.android.apps.wallet.util.location.LocationFetcher;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.apps.wallet.mywallet:
//            MyWalletEvent, MyWalletStorageManager

public class MyWalletManager
    implements InitializedEventPublisher
{

    private static final String TAG = com/google/android/apps/wallet/mywallet/MyWalletManager.getSimpleName();
    private final ActionExecutor actionExecutor;
    private com.google.wallet.proto.api.NanoWalletMywallet.FetchMyWalletResponse cachedResponse;
    private final com.google.wallet.proto.NanoWalletWobl.LayoutContextParameters contextParameters;
    private final EventBus eventBus;
    private final AsyncCallback fetchFromDataStoreCallback = new AsyncCallback() {

        final MyWalletManager this$0;

        private void onSuccess(com.google.wallet.proto.api.NanoWalletMywallet.FetchMyWalletResponse fetchmywalletresponse)
        {
            while (fetchmywalletresponse == null || cachedResponse != null) 
            {
                return;
            }
            cachedResponse = fetchmywalletresponse;
            eventBus.post(new MyWalletEvent(fetchmywalletresponse.tileGroups));
        }

        public final void onFailure(Exception exception)
        {
            WLog.efmt(MyWalletManager.TAG, "Error retrieving cached response from data store: %s", new Object[] {
                exception
            });
        }

        public final volatile void onSuccess(Object obj)
        {
            onSuccess((com.google.wallet.proto.api.NanoWalletMywallet.FetchMyWalletResponse)obj);
        }

            
            {
                this$0 = MyWalletManager.this;
                super();
            }
    };
    private final Callable fetchFromDatastore = new Callable() {

        final MyWalletManager this$0;

        private com.google.wallet.proto.api.NanoWalletMywallet.FetchMyWalletResponse call()
            throws Exception
        {
            return (com.google.wallet.proto.api.NanoWalletMywallet.FetchMyWalletResponse)storageManager.get(new com.google.wallet.proto.api.NanoWalletMywallet.FetchMyWalletResponse());
        }

        public final volatile Object call()
            throws Exception
        {
            return call();
        }

            
            {
                this$0 = MyWalletManager.this;
                super();
            }
    };
    private final Callable fetchFromXBar = new Callable() {

        final MyWalletManager this$0;

        private com.google.wallet.proto.api.NanoWalletMywallet.FetchMyWalletResponse call()
            throws Exception
        {
            Object obj = new com.google.wallet.proto.api.NanoWalletMywallet.FetchMyWalletRequest();
            obj.renderInfo = new com.google.wallet.proto.NanoWalletTransport.RequestRenderInfo();
            ((com.google.wallet.proto.api.NanoWalletMywallet.FetchMyWalletRequest) (obj)).renderInfo.contextParameters = contextParameters;
            ((com.google.wallet.proto.api.NanoWalletMywallet.FetchMyWalletRequest) (obj)).renderInfo.entrypointNames = (new String[] {
                "g_my_wallet_tile"
            });
            Location location = locationFetcher.getLastKnownLocation(TimeUnit.MINUTES.toMillis(10L));
            if (location != null)
            {
                com.google.wallet.proto.NanoWalletEntities.PhysicalLocation physicallocation = new com.google.wallet.proto.NanoWalletEntities.PhysicalLocation();
                physicallocation.accuracy = Float.valueOf(location.getAccuracy());
                physicallocation.longitude = Double.valueOf(location.getLongitude());
                physicallocation.latitude = Double.valueOf(location.getLatitude());
                obj.location = physicallocation;
            }
            obj.supportedTileType = (new int[] {
                16, 5, 9, 17, 4, 10, 11, 3, 12, 15, 
                14
            });
            obj = (com.google.wallet.proto.api.NanoWalletMywallet.FetchMyWalletResponse)rpcCaller.call("b/mywallet/fetch", ((com.google.protobuf.nano.MessageNano) (obj)), new com.google.wallet.proto.api.NanoWalletMywallet.FetchMyWalletResponse());
            storageManager.put(((com.google.protobuf.nano.MessageNano) (obj)));
            return ((com.google.wallet.proto.api.NanoWalletMywallet.FetchMyWalletResponse) (obj));
        }

        public final volatile Object call()
            throws Exception
        {
            return call();
        }

            
            {
                this$0 = MyWalletManager.this;
                super();
            }
    };
    private final AsyncCallback fetchFromXBarCallback = new AsyncCallback() {

        final MyWalletManager this$0;

        private void onSuccess(com.google.wallet.proto.api.NanoWalletMywallet.FetchMyWalletResponse fetchmywalletresponse)
        {
            if (fetchmywalletresponse == null)
            {
                WLog.efmt(MyWalletManager.TAG, "Error, null response from xBar", new Object[0]);
                return;
            } else
            {
                eventBus.post(new MyWalletEvent(fetchmywalletresponse.tileGroups));
                cachedResponse = fetchmywalletresponse;
                return;
            }
        }

        public final void onFailure(Exception exception)
        {
            WLog.efmt(MyWalletManager.TAG, "Error retrieving response from xBar: %s", new Object[] {
                exception
            });
            if (cachedResponse != null)
            {
                eventBus.post(new MyWalletEvent(cachedResponse.tileGroups));
            }
        }

        public final volatile void onSuccess(Object obj)
        {
            onSuccess((com.google.wallet.proto.api.NanoWalletMywallet.FetchMyWalletResponse)obj);
        }

            
            {
                this$0 = MyWalletManager.this;
                super();
            }
    };
    private final LocationFetcher locationFetcher;
    private final NetworkConnectivityReturnChecker networkConnectivityReturnChecker;
    private final RpcCaller rpcCaller;
    private final MyWalletStorageManager storageManager;

    public MyWalletManager(EventBus eventbus, ActionExecutor actionexecutor, RpcCaller rpccaller, MyWalletStorageManager mywalletstoragemanager, com.google.wallet.proto.NanoWalletWobl.LayoutContextParameters layoutcontextparameters, LocationFetcher locationfetcher, NetworkConnectivityReturnChecker networkconnectivityreturnchecker)
    {
        eventBus = eventbus;
        actionExecutor = actionexecutor;
        rpcCaller = rpccaller;
        storageManager = mywalletstoragemanager;
        contextParameters = layoutcontextparameters;
        locationFetcher = locationfetcher;
        networkConnectivityReturnChecker = networkconnectivityreturnchecker;
    }

    private void handleRegistrationEvent()
    {
        ThreadPreconditions.checkOnUiThread();
        if (cachedResponse != null)
        {
            eventBus.post(new MyWalletEvent(cachedResponse.tileGroups));
        } else
        {
            actionExecutor.executeAction(fetchFromDatastore, fetchFromDataStoreCallback);
        }
        actionExecutor.executeAction(fetchFromXBar, fetchFromXBarCallback);
    }

    public final void dismissTile(String s)
        throws RpcException
    {
        com.google.wallet.proto.api.NanoWalletMywallet.DismissWalletTileRequest dismisswallettilerequest = new com.google.wallet.proto.api.NanoWalletMywallet.DismissWalletTileRequest();
        dismisswallettilerequest.walletTileId = s;
        rpcCaller.call("b/mywallet/dismissTile", dismisswallettilerequest, new com.google.wallet.proto.api.NanoWalletMywallet.DismissWalletTileResponse());
    }

    public final void initialize()
    {
        eventBus.registerEventProducer(com/google/android/apps/wallet/mywallet/MyWalletEvent, new RegistrationCallback() {

            final MyWalletManager this$0;

            public final void handleRegistration(Object obj)
            {
                handleRegistrationEvent();
            }

            
            {
                this$0 = MyWalletManager.this;
                super();
            }
        });
        eventBus.register(this, com/google/android/apps/wallet/refresh/RequestRefreshEvent, new EventHandler() {

            final MyWalletManager this$0;

            private void handleEvent(RequestRefreshEvent requestrefreshevent)
            {
                actionExecutor.executeAction(fetchFromXBar, fetchFromXBarCallback);
            }

            public final volatile void handleEvent(Object obj)
            {
                handleEvent((RequestRefreshEvent)obj);
            }

            
            {
                this$0 = MyWalletManager.this;
                super();
            }
        });
        eventBus.register(this, com/google/android/apps/wallet/network/NetworkConnectivityEvent, new EventHandler() {

            final MyWalletManager this$0;

            private void handleEvent(NetworkConnectivityEvent networkconnectivityevent)
            {
                if (networkConnectivityReturnChecker.isConnectivityReturned(networkconnectivityevent))
                {
                    actionExecutor.executeAction(fetchFromXBar, fetchFromXBarCallback);
                }
            }

            public final volatile void handleEvent(Object obj)
            {
                handleEvent((NetworkConnectivityEvent)obj);
            }

            
            {
                this$0 = MyWalletManager.this;
                super();
            }
        });
    }












/*
    static com.google.wallet.proto.api.NanoWalletMywallet.FetchMyWalletResponse access$602(MyWalletManager mywalletmanager, com.google.wallet.proto.api.NanoWalletMywallet.FetchMyWalletResponse fetchmywalletresponse)
    {
        mywalletmanager.cachedResponse = fetchmywalletresponse;
        return fetchmywalletresponse;
    }

*/



}
