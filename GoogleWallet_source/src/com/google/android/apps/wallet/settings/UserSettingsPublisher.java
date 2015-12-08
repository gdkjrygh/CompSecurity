// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.settings;

import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.eventbus.InitializedEventPublisher;
import com.google.android.apps.wallet.eventbus.RegistrationCallback;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.rpc.RpcCaller;
import com.google.android.apps.wallet.rpc.RpcException;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.android.apps.wallet.util.async.ThreadPreconditions;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.settings:
//            UserSettingsStorageManager, UserSettingsEvent, ActionQueue

public class UserSettingsPublisher
    implements InitializedEventPublisher
{

    private static final String TAG = com/google/android/apps/wallet/settings/UserSettingsPublisher.getSimpleName();
    private final ActionExecutor actionExecutor;
    private final EventBus eventBus;
    private final Callable fetchSettingsFromDataStore = new Callable() {

        final UserSettingsPublisher this$0;

        private com.google.wallet.proto.api.NanoWalletSettings.FetchSettingsResponse call()
            throws Exception
        {
            return (com.google.wallet.proto.api.NanoWalletSettings.FetchSettingsResponse)userSettingsStorageManager.get(new com.google.wallet.proto.api.NanoWalletSettings.FetchSettingsResponse());
        }

        public final volatile Object call()
            throws Exception
        {
            return call();
        }

            
            {
                this$0 = UserSettingsPublisher.this;
                super();
            }
    };
    private final AsyncCallback fetchSettingsFromDataStoreCallback = new AsyncCallback() {

        final UserSettingsPublisher this$0;

        private void onSuccess(com.google.wallet.proto.api.NanoWalletSettings.FetchSettingsResponse fetchsettingsresponse)
        {
            if (fetchsettingsresponse == null || fetchsettingsresponse.settings == null)
            {
                return;
            } else
            {
                eventBus.post(new UserSettingsEvent(fetchsettingsresponse.settings));
                return;
            }
        }

        public final void onFailure(Exception exception)
        {
        }

        public final volatile void onSuccess(Object obj)
        {
            onSuccess((com.google.wallet.proto.api.NanoWalletSettings.FetchSettingsResponse)obj);
        }

            
            {
                this$0 = UserSettingsPublisher.this;
                super();
            }
    };
    private final Callable fetchSettingsFromXBar = new Callable() {

        final UserSettingsPublisher this$0;

        private com.google.wallet.proto.api.NanoWalletSettings.FetchSettingsResponse call()
            throws Exception
        {
            com.google.wallet.proto.api.NanoWalletSettings.FetchSettingsResponse fetchsettingsresponse = (com.google.wallet.proto.api.NanoWalletSettings.FetchSettingsResponse)rpcCaller.call("b/preferences/fetchSettings", new com.google.wallet.proto.api.NanoWalletSettings.FetchSettingsRequest(), new com.google.wallet.proto.api.NanoWalletSettings.FetchSettingsResponse());
            if (fetchsettingsresponse.settings != null)
            {
                userSettingsStorageManager.put(fetchsettingsresponse);
            }
            return fetchsettingsresponse;
        }

        public final volatile Object call()
            throws Exception
        {
            return call();
        }

            
            {
                this$0 = UserSettingsPublisher.this;
                super();
            }
    };
    private final AsyncCallback fetchSettingsFromXBarCallback = new AsyncCallback() {

        final UserSettingsPublisher this$0;

        private void onSuccess(com.google.wallet.proto.api.NanoWalletSettings.FetchSettingsResponse fetchsettingsresponse)
        {
            rpcInFlight = false;
            if (fetchsettingsresponse.callError != null)
            {
                fetchsettingsresponse = new UserSettingsEvent(fetchsettingsresponse.callError);
            } else
            {
                fetchsettingsresponse = new UserSettingsEvent(fetchsettingsresponse.settings);
            }
            eventBus.post(fetchsettingsresponse);
        }

        public final void onFailure(Exception exception)
        {
            rpcInFlight = false;
            WLog.efmt(UserSettingsPublisher.TAG, "Exception in RPC trying to retrieve Settings from xBar: %s", new Object[] {
                exception
            });
            eventBus.post(new UserSettingsEvent(exception));
        }

        public final volatile void onSuccess(Object obj)
        {
            onSuccess((com.google.wallet.proto.api.NanoWalletSettings.FetchSettingsResponse)obj);
        }

            
            {
                this$0 = UserSettingsPublisher.this;
                super();
            }
    };
    private final ActionQueue pendingUpdateRequests;
    private final RpcCaller rpcCaller;
    private boolean rpcInFlight;
    private final AsyncCallback updateSettingToXBarCallback = new AsyncCallback() {

        final UserSettingsPublisher this$0;

        private void onSuccess(com.google.wallet.proto.api.NanoWalletSettings.FetchSettingsResponse fetchsettingsresponse)
        {
            if (!pendingUpdateRequests.processQueue())
            {
                if (fetchsettingsresponse.callError != null)
                {
                    fetchsettingsresponse = new UserSettingsEvent(fetchsettingsresponse.callError);
                } else
                {
                    fetchsettingsresponse = new UserSettingsEvent(fetchsettingsresponse.settings);
                }
                eventBus.post(fetchsettingsresponse);
            }
        }

        public final void onFailure(Exception exception)
        {
            WLog.efmt(UserSettingsPublisher.TAG, "Exception in RPC trying to update a user setting on xBar: %s", new Object[] {
                exception
            });
            pendingUpdateRequests.cancel();
            eventBus.post(new UserSettingsEvent(exception));
            launchXBarFetchSettings();
        }

        public final volatile void onSuccess(Object obj)
        {
            onSuccess((com.google.wallet.proto.api.NanoWalletSettings.FetchSettingsResponse)obj);
        }

            
            {
                this$0 = UserSettingsPublisher.this;
                super();
            }
    };
    private final UserSettingsStorageManager userSettingsStorageManager;

    public UserSettingsPublisher(EventBus eventbus, ActionExecutor actionexecutor, RpcCaller rpccaller, ActionQueue actionqueue, UserSettingsStorageManager usersettingsstoragemanager)
    {
        eventBus = eventbus;
        actionExecutor = actionexecutor;
        rpcCaller = rpccaller;
        pendingUpdateRequests = actionqueue;
        userSettingsStorageManager = usersettingsstoragemanager;
    }

    private Callable createSettingUpdaterAction(final com.google.wallet.proto.api.NanoWalletSettings.UpdateSettingRequest request)
    {
        return new Callable() {

            final UserSettingsPublisher this$0;
            final com.google.wallet.proto.api.NanoWalletSettings.UpdateSettingRequest val$request;

            private com.google.wallet.proto.api.NanoWalletSettings.FetchSettingsResponse call()
                throws Exception
            {
                com.google.wallet.proto.api.NanoWalletSettings.UpdateSettingResponse updatesettingresponse = (com.google.wallet.proto.api.NanoWalletSettings.UpdateSettingResponse)rpcCaller.call("b/preferences/updateSetting", request, new com.google.wallet.proto.api.NanoWalletSettings.UpdateSettingResponse());
                com.google.wallet.proto.api.NanoWalletSettings.FetchSettingsResponse fetchsettingsresponse = new com.google.wallet.proto.api.NanoWalletSettings.FetchSettingsResponse();
                fetchsettingsresponse.settings = updatesettingresponse.currentSettings;
                userSettingsStorageManager.put(fetchsettingsresponse);
                return fetchsettingsresponse;
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = UserSettingsPublisher.this;
                request = updatesettingrequest;
                super();
            }
        };
    }

    private void handleRegistrationEvent()
    {
        ThreadPreconditions.checkOnUiThread();
        actionExecutor.executeAction(fetchSettingsFromDataStore, fetchSettingsFromDataStoreCallback);
        launchXBarFetchSettings();
    }

    private void launchXBarFetchSettings()
    {
        if (!rpcInFlight)
        {
            rpcInFlight = true;
            actionExecutor.executeAction(fetchSettingsFromXBar, fetchSettingsFromXBarCallback);
        }
    }

    public final com.google.wallet.proto.api.NanoWalletSettings.Settings getCachedSettings()
        throws RpcException
    {
        com.google.wallet.proto.api.NanoWalletSettings.FetchSettingsResponse fetchsettingsresponse = (com.google.wallet.proto.api.NanoWalletSettings.FetchSettingsResponse)userSettingsStorageManager.get(new com.google.wallet.proto.api.NanoWalletSettings.FetchSettingsResponse());
        if (fetchsettingsresponse != null && fetchsettingsresponse.settings != null)
        {
            return fetchsettingsresponse.settings;
        } else
        {
            com.google.wallet.proto.api.NanoWalletSettings.FetchSettingsResponse fetchsettingsresponse1 = (com.google.wallet.proto.api.NanoWalletSettings.FetchSettingsResponse)rpcCaller.call("b/preferences/fetchSettings", new com.google.wallet.proto.api.NanoWalletSettings.FetchSettingsRequest(), new com.google.wallet.proto.api.NanoWalletSettings.FetchSettingsResponse());
            userSettingsStorageManager.put(fetchsettingsresponse1);
            return fetchsettingsresponse1.settings;
        }
    }

    public final void initialize()
    {
        eventBus.registerEventProducer(com/google/android/apps/wallet/settings/UserSettingsEvent, new RegistrationCallback() {

            final UserSettingsPublisher this$0;

            public final void handleRegistration(Object obj)
            {
                handleRegistrationEvent();
            }

            
            {
                this$0 = UserSettingsPublisher.this;
                super();
            }
        });
    }

    public final void updateSetting(int i, long l)
    {
        com.google.wallet.proto.api.NanoWalletSettings.UpdateSettingRequest updatesettingrequest = new com.google.wallet.proto.api.NanoWalletSettings.UpdateSettingRequest();
        updatesettingrequest.id = Integer.valueOf(i);
        updatesettingrequest.newNumberValue = Long.valueOf(l);
        pendingUpdateRequests.submit(createSettingUpdaterAction(updatesettingrequest), updateSettingToXBarCallback);
    }

    public final void updateSetting(int i, String s)
    {
        com.google.wallet.proto.api.NanoWalletSettings.UpdateSettingRequest updatesettingrequest = new com.google.wallet.proto.api.NanoWalletSettings.UpdateSettingRequest();
        updatesettingrequest.id = Integer.valueOf(i);
        updatesettingrequest.newStringValue = s;
        pendingUpdateRequests.submit(createSettingUpdaterAction(updatesettingrequest), updateSettingToXBarCallback);
    }

    public final void updateSetting(int i, boolean flag)
    {
        updateSetting(i, flag, null);
    }

    public final void updateSetting(int i, boolean flag, com.google.wallet.proto.NanoWalletEntities.MoneyProto moneyproto)
    {
        com.google.wallet.proto.api.NanoWalletSettings.UpdateSettingRequest updatesettingrequest = new com.google.wallet.proto.api.NanoWalletSettings.UpdateSettingRequest();
        updatesettingrequest.id = Integer.valueOf(i);
        updatesettingrequest.newValue = Boolean.valueOf(flag);
        updatesettingrequest.newMoneyValue = moneyproto;
        pendingUpdateRequests.submit(createSettingUpdaterAction(updatesettingrequest), updateSettingToXBarCallback);
    }







/*
    static boolean access$402(UserSettingsPublisher usersettingspublisher, boolean flag)
    {
        usersettingspublisher.rpcInFlight = flag;
        return flag;
    }

*/



}
