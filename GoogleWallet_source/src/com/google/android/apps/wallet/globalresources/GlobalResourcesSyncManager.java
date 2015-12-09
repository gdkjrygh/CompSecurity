// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.globalresources;

import android.content.SharedPreferences;
import com.google.android.apps.wallet.base.java.System;
import com.google.android.apps.wallet.config.appcontrol.AppControl;
import com.google.android.apps.wallet.config.appcontrol.AppControlKey;
import com.google.android.apps.wallet.config.sharedpreferences.SharedPreference;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.rpc.RpcException;
import com.google.android.apps.wallet.util.proto.Protos;
import com.google.android.gms.gcm.GcmNetworkManager;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.globalresources:
//            GlobalResourceManager, GlobalResourcesSyncService, MultiSyncClient

public class GlobalResourcesSyncManager
{

    private static final String TAG = com/google/android/apps/wallet/globalresources/GlobalResourcesSyncManager.getSimpleName();
    private final AppControl appControl;
    private final Executor executor;
    private final Provider gcmNetworkManager;
    private final GlobalResourceManager globalResourceManager;
    private final MultiSyncClient multiSyncClient;
    private final AtomicBoolean syncEnabled = new AtomicBoolean(false);
    private final System system;
    private final SharedPreferences userPrefs;

    GlobalResourcesSyncManager(GlobalResourceManager globalresourcemanager, SharedPreferences sharedpreferences, System system1, AppControl appcontrol, MultiSyncClient multisyncclient, EventBus eventbus, Provider provider, 
            Executor executor1)
    {
        globalResourceManager = globalresourcemanager;
        userPrefs = sharedpreferences;
        system = system1;
        appControl = appcontrol;
        multiSyncClient = multisyncclient;
        gcmNetworkManager = provider;
        executor = executor1;
        eventbus.register(this);
    }

    private void fillSyncRequest(com.google.wallet.proto.NanoWalletTransport.MultiSyncRequest multisyncrequest)
    {
        long l1 = globalResourceManager.getCurrentFingerprint();
        long l = l1;
        if (l1 != -1L)
        {
            l = l1;
            if (!globalResourceManager.hasCache())
            {
                WLog.d(TAG, "No cached local copy of global resources found. Requesting sync of global resources with intentionally invalid fingerprint");
                l = 0x613716L;
            }
        }
        WLog.dfmt(TAG, "Sending GlobalResource sync with fingerprint: %d", new Object[] {
            Long.valueOf(l)
        });
        com.google.wallet.proto.NanoWalletTransport.GlobalResourceSyncRequest globalresourcesyncrequest = new com.google.wallet.proto.NanoWalletTransport.GlobalResourceSyncRequest();
        globalresourcesyncrequest.clientGlobalResourcesFingerprint = Long.valueOf(l);
        multisyncrequest.globalResourceSyncRequest = globalresourcesyncrequest;
    }

    private static int getSyncStatus(com.google.wallet.proto.NanoWalletTransport.MultiSyncResponse multisyncresponse)
    {
        if (multisyncresponse.globalResourceSyncResponse == null || multisyncresponse.globalResourceSyncResponse.syncStatus == null)
        {
            return 1;
        } else
        {
            return multisyncresponse.globalResourceSyncResponse.syncStatus.intValue();
        }
    }

    private static String getSyncStatusDetails(com.google.wallet.proto.NanoWalletTransport.MultiSyncResponse multisyncresponse)
    {
        if (multisyncresponse.globalResourceSyncResponse == null || multisyncresponse.globalResourceSyncResponse.syncStatusDetails == null)
        {
            return "";
        } else
        {
            return multisyncresponse.globalResourceSyncResponse.syncStatusDetails;
        }
    }

    private void handleSyncResponse(com.google.wallet.proto.NanoWalletTransport.MultiSyncResponse multisyncresponse)
    {
        if (multisyncresponse.globalResourceSyncResponse == null || multisyncresponse.globalResourceSyncResponse.globalResources == null)
        {
            WLog.d(TAG, "Global resources up to date.");
            multisyncresponse = SharedPreference.LAST_SYNC_TIMESTAMP;
            SharedPreferences sharedpreferences = userPrefs;
            System system1 = system;
            multisyncresponse.put(sharedpreferences, Long.valueOf(System.currentTimeMillis()));
            return;
        }
        int i = getSyncStatus(multisyncresponse);
        if (i != 1)
        {
            multisyncresponse = getSyncStatusDetails(multisyncresponse);
            WLog.e(TAG, (new StringBuilder(String.valueOf(multisyncresponse).length() + 69)).append("Aborting due to error status in sync response: ").append(i).append(". Details: ").append(multisyncresponse).toString());
            return;
        } else
        {
            long l = Protos.valueWithDefault(multisyncresponse.globalResourceSyncResponse.globalResourcesFingerprint, 0L);
            multisyncresponse = multisyncresponse.globalResourceSyncResponse.globalResources;
            globalResourceManager.update(multisyncresponse, l);
            multisyncresponse = SharedPreference.LAST_SYNC_TIMESTAMP;
            SharedPreferences sharedpreferences1 = userPrefs;
            System system2 = system;
            multisyncresponse.put(sharedpreferences1, Long.valueOf(System.currentTimeMillis()));
            return;
        }
    }

    private boolean hasGlobalResourcesBeenSynced()
    {
        return ((Long)SharedPreference.LAST_SYNC_TIMESTAMP.get(userPrefs)).longValue() > 0L;
    }

    private boolean isSyncingNeeded()
    {
        if (!syncEnabled.get())
        {
            return false;
        }
        if (!hasGlobalResourcesBeenSynced())
        {
            return true;
        }
        System system1 = system;
        return System.currentTimeMillis() - ((Long)SharedPreference.LAST_SYNC_TIMESTAMP.get(userPrefs)).longValue() >= appControl.getLong(AppControlKey.GLOBAL_RESOURCES_SYNC_REFRESH_RATE_MS);
    }

    public final void disablePeriodicSync()
    {
        syncEnabled.set(false);
        ((GcmNetworkManager)gcmNetworkManager.get()).cancelTask("syncGlobalResources", com/google/android/apps/wallet/globalresources/GlobalResourcesSyncService);
    }

    public final void enablePeriodicSync()
    {
        syncEnabled.set(true);
        com.google.android.gms.gcm.PeriodicTask periodictask = (new com.google.android.gms.gcm.PeriodicTask.Builder()).setTag("syncGlobalResources").setService(com/google/android/apps/wallet/globalresources/GlobalResourcesSyncService).setPeriod(TimeUnit.HOURS.toSeconds(2L)).setFlex(TimeUnit.MINUTES.toSeconds(10L)).setPersisted(false).setUpdateCurrent(true).build();
        ((GcmNetworkManager)gcmNetworkManager.get()).schedule(periodictask);
    }

    void handleEvent(com.google.wallet.proto.NanoWalletTransport.SystemNotificationBundle.SystemNotification systemnotification)
    {
        if (Protos.valuesEqual(systemnotification.type, 9))
        {
            executor.execute(new Runnable() {

                final GlobalResourcesSyncManager this$0;

                public final void run()
                {
                    WLog.d(GlobalResourcesSyncManager.TAG, "Got GET_GLOBAL_RESOURCES notification. Syncing global resources.");
                    try
                    {
                        syncGlobalResourcesNow();
                        return;
                    }
                    catch (RpcException rpcexception)
                    {
                        WLog.e(GlobalResourcesSyncManager.TAG, "Refreshing global resources failed", rpcexception);
                    }
                }

            
            {
                this$0 = GlobalResourcesSyncManager.this;
                super();
            }
            });
        }
    }

    public final void syncGlobalResourcesNow()
        throws RpcException
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = new com.google.wallet.proto.NanoWalletTransport.MultiSyncRequest();
        fillSyncRequest(((com.google.wallet.proto.NanoWalletTransport.MultiSyncRequest) (obj)));
        obj = multiSyncClient.multiSync(((com.google.wallet.proto.NanoWalletTransport.MultiSyncRequest) (obj)));
        if (((com.google.wallet.proto.NanoWalletTransport.MultiSyncResponse) (obj)).globalResourceSyncResponse != null)
        {
            handleSyncResponse(((com.google.wallet.proto.NanoWalletTransport.MultiSyncResponse) (obj)));
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void syncIfNeeded()
        throws RpcException
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = isSyncingNeeded();
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        syncGlobalResourcesNow();
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }


}
