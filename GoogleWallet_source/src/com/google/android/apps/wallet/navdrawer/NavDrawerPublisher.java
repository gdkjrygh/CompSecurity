// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.navdrawer;

import com.google.android.apps.wallet.base.java.System;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.eventbus.InitializedEventPublisher;
import com.google.android.apps.wallet.eventbus.RegistrationCallback;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.rpc.RpcCaller;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.android.apps.wallet.util.async.ThreadPreconditions;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.navdrawer:
//            NavDrawerEvent, NavigationStorageManager

public class NavDrawerPublisher
    implements InitializedEventPublisher
{

    private static final String TAG = com/google/android/apps/wallet/navdrawer/NavDrawerPublisher.getSimpleName();
    private final ActionExecutor actionExecutor;
    private final EventBus eventBus;
    private long lastRpcTimeMillis;
    private final RpcCaller rpcCaller;
    private final NavigationStorageManager storageManager;
    private final System system;

    public NavDrawerPublisher(EventBus eventbus, ActionExecutor actionexecutor, RpcCaller rpccaller, NavigationStorageManager navigationstoragemanager, System system1)
    {
        eventBus = eventbus;
        actionExecutor = actionexecutor;
        rpcCaller = rpccaller;
        storageManager = navigationstoragemanager;
        system = system1;
    }

    private void getModelFromDatabaseAndPost(final Runnable doAfter)
    {
        actionExecutor.executeAction(new Callable() {

            final NavDrawerPublisher this$0;

            private com.google.wallet.proto.api.NanoWalletNavigation.FetchNavigationResponse call()
                throws Exception
            {
                return (com.google.wallet.proto.api.NanoWalletNavigation.FetchNavigationResponse)storageManager.get(new com.google.wallet.proto.api.NanoWalletNavigation.FetchNavigationResponse());
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = NavDrawerPublisher.this;
                super();
            }
        }, new AsyncCallback() {

            final NavDrawerPublisher this$0;
            final Runnable val$doAfter;

            private void onSuccess(com.google.wallet.proto.api.NanoWalletNavigation.FetchNavigationResponse fetchnavigationresponse)
            {
                if (fetchnavigationresponse != null)
                {
                    eventBus.post(new NavDrawerEvent(fetchnavigationresponse.topNavigation));
                } else
                {
                    WLog.dfmt(NavDrawerPublisher.TAG, "FetchNavigationResponse from db is null", new Object[0]);
                }
                if (doAfter != null)
                {
                    doAfter.run();
                }
            }

            public final void onFailure(Exception exception)
            {
                WLog.efmt(NavDrawerPublisher.TAG, "Exception retrieving NavDrawer from db: %s", new Object[] {
                    exception
                });
                if (doAfter != null)
                {
                    doAfter.run();
                }
            }

            public final volatile void onSuccess(Object obj)
            {
                onSuccess((com.google.wallet.proto.api.NanoWalletNavigation.FetchNavigationResponse)obj);
            }

            
            {
                this$0 = NavDrawerPublisher.this;
                doAfter = runnable;
                super();
            }
        });
    }

    private void getModelFromServerAndPost()
    {
        System system1 = system;
        if (System.currentTimeMillis() > lastRpcTimeMillis + 0x5265c00L)
        {
            actionExecutor.executeAction(new Callable() {

                final NavDrawerPublisher this$0;

                private com.google.wallet.proto.api.NanoWalletNavigation.FetchNavigationResponse call()
                    throws Exception
                {
                    Object obj = new com.google.wallet.proto.api.NanoWalletNavigation.FetchNavigationRequest();
                    obj.theme = Integer.valueOf(1);
                    obj = (com.google.wallet.proto.api.NanoWalletNavigation.FetchNavigationResponse)rpcCaller.call("b/navigation/fetch", ((com.google.protobuf.nano.MessageNano) (obj)), new com.google.wallet.proto.api.NanoWalletNavigation.FetchNavigationResponse());
                    if (((com.google.wallet.proto.api.NanoWalletNavigation.FetchNavigationResponse) (obj)).topNavigation == null)
                    {
                        throw new IllegalArgumentException("RPC to xBar to retrieve NavDrawer succeeded, but NavDrawer data was invalid");
                    } else
                    {
                        storageManager.put(((com.google.protobuf.nano.MessageNano) (obj)));
                        return ((com.google.wallet.proto.api.NanoWalletNavigation.FetchNavigationResponse) (obj));
                    }
                }

                public final volatile Object call()
                    throws Exception
                {
                    return call();
                }

            
            {
                this$0 = NavDrawerPublisher.this;
                super();
            }
            }, new AsyncCallback() {

                final NavDrawerPublisher this$0;

                private void onSuccess(com.google.wallet.proto.api.NanoWalletNavigation.FetchNavigationResponse fetchnavigationresponse)
                {
                    eventBus.post(new NavDrawerEvent(fetchnavigationresponse.topNavigation));
                    fetchnavigationresponse = NavDrawerPublisher.this;
                    System _tmp = system;
                    fetchnavigationresponse.lastRpcTimeMillis = System.currentTimeMillis();
                }

                public final void onFailure(Exception exception)
                {
                    WLog.efmt(NavDrawerPublisher.TAG, "Exception in RPC trying to retrieve NavDrawer from xBar: %s", new Object[] {
                        exception
                    });
                }

                public final volatile void onSuccess(Object obj)
                {
                    onSuccess((com.google.wallet.proto.api.NanoWalletNavigation.FetchNavigationResponse)obj);
                }

            
            {
                this$0 = NavDrawerPublisher.this;
                super();
            }
            });
        }
    }

    private void handleRegistrationEvent()
    {
        ThreadPreconditions.checkOnUiThread();
        getModelFromDatabaseAndPost(new Runnable() {

            final NavDrawerPublisher this$0;

            public final void run()
            {
                getModelFromServerAndPost();
            }

            
            {
                this$0 = NavDrawerPublisher.this;
                super();
            }
        });
    }

    public final void initialize()
    {
        eventBus.registerEventProducer(com/google/android/apps/wallet/navdrawer/NavDrawerEvent, new RegistrationCallback() {

            final NavDrawerPublisher this$0;

            public final void handleRegistration(Object obj)
            {
                handleRegistrationEvent();
            }

            
            {
                this$0 = NavDrawerPublisher.this;
                super();
            }
        });
    }









/*
    static long access$602(NavDrawerPublisher navdrawerpublisher, long l)
    {
        navdrawerpublisher.lastRpcTimeMillis = l;
        return l;
    }

*/

}
