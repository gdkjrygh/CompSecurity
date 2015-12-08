// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.caching;

import android.content.SharedPreferences;
import com.google.android.apps.wallet.callstatus.CallErrorException;
import com.google.android.apps.wallet.config.sharedpreferences.SharedPreference;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.eventbus.InitializedEventPublisher;
import com.google.android.apps.wallet.eventbus.RegistrationCallback;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.rpc.RpcException;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.android.apps.wallet.util.proto.Protos;
import com.google.android.apps.wallet.wobs.api.WobsColdStartSyncer;
import com.google.android.apps.wallet.wobs.provider.WobDeletionEvent;
import com.google.android.apps.wallet.wobs.provider.WobUpdateEvent;
import com.google.android.apps.wallet.wobs.provider.WobsClient;
import com.google.common.primitives.Ints;
import java.util.List;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.wobs.caching:
//            WobsCacheClient, WobDatastore, WobCategory, WobHeadListByCategoryEvent, 
//            WobTailListByCategoryEvent

public class WobsManager
    implements InitializedEventPublisher, WobsColdStartSyncer
{
    static final class UpdateCacheHeadResult extends Enum
    {

        private static final UpdateCacheHeadResult $VALUES[];
        public static final UpdateCacheHeadResult ERROR;
        public static final UpdateCacheHeadResult NO_UPDATE;
        public static final UpdateCacheHeadResult SUCCESS_UPDATED;

        public static UpdateCacheHeadResult valueOf(String s)
        {
            return (UpdateCacheHeadResult)Enum.valueOf(com/google/android/apps/wallet/wobs/caching/WobsManager$UpdateCacheHeadResult, s);
        }

        public static UpdateCacheHeadResult[] values()
        {
            return (UpdateCacheHeadResult[])$VALUES.clone();
        }

        static 
        {
            SUCCESS_UPDATED = new UpdateCacheHeadResult("SUCCESS_UPDATED", 0);
            NO_UPDATE = new UpdateCacheHeadResult("NO_UPDATE", 1);
            ERROR = new UpdateCacheHeadResult("ERROR", 2);
            $VALUES = (new UpdateCacheHeadResult[] {
                SUCCESS_UPDATED, NO_UPDATE, ERROR
            });
        }

        private UpdateCacheHeadResult(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String TAG = com/google/android/apps/wallet/wobs/caching/WobsManager.getSimpleName();
    private final ActionExecutor actionExecutor;
    private final EventBus eventBus;
    private final SharedPreferences sharedPreferences;
    private final WobDatastore wobDatastore;
    private final WobsCacheClient wobsCacheClient;
    private final WobsClient wobsClient;

    public WobsManager(WobsCacheClient wobscacheclient, WobsClient wobsclient, EventBus eventbus, SharedPreferences sharedpreferences, WobDatastore wobdatastore, ActionExecutor actionexecutor)
    {
        wobsCacheClient = wobscacheclient;
        wobsClient = wobsclient;
        eventBus = eventbus;
        sharedPreferences = sharedpreferences;
        wobDatastore = wobdatastore;
        actionExecutor = actionexecutor;
    }

    private com.google.wallet.proto.api.NanoWalletWobs.FetchCacheConfigResponse fetchCacheConfig()
        throws RpcException
    {
        byte abyte0[] = (byte[])SharedPreference.WOBS_CACHE_CONFIGURATION_ID.get(sharedPreferences);
        com.google.wallet.proto.api.NanoWalletWobs.FetchCacheConfigResponse fetchcacheconfigresponse = wobsCacheClient.fetchCacheConfiguration(abyte0);
        WLog.d(TAG, "FetchCacheConfigResponse contained the following category ids: ");
        int ai[] = fetchcacheconfigresponse.categoryId;
        int j = ai.length;
        for (int i = 0; i < j; i++)
        {
            int k = ai[i];
            String s = TAG;
            String s1 = String.valueOf(Integer.valueOf(k));
            WLog.d(s, (new StringBuilder(String.valueOf(s1).length() + 12)).append("categoryId: ").append(s1).toString());
        }

        SharedPreference.WOBS_CACHE_CONFIGURATION_ID.put(sharedPreferences, fetchcacheconfigresponse.configurationId);
        return fetchcacheconfigresponse;
    }

    private UpdateCacheHeadResult fetchCacheHeadAndUpdateDb(byte abyte0[], int i)
    {
label0:
        {
            try
            {
                com.google.wallet.proto.api.NanoWalletWobs.HeadState headstate = wobDatastore.readHeadState(i);
                abyte0 = wobsCacheClient.updateCacheHead(abyte0, headstate);
                if (((com.google.wallet.proto.api.NanoWalletWobs.UpdateCacheHeadResponse) (abyte0)).callError == null)
                {
                    break label0;
                }
                if (((com.google.wallet.proto.api.NanoWalletWobs.UpdateCacheHeadResponse) (abyte0)).callError.errorCode.intValue() == 1)
                {
                    WLog.i(TAG, "Received INVALID_CONFIGURATION, refetching WOBs cache configuration.");
                    resetConfiguration();
                }
                abyte0 = UpdateCacheHeadResult.ERROR;
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                WLog.e(TAG, "WOBs updateCacheHead RPC failed.", abyte0);
                return UpdateCacheHeadResult.ERROR;
            }
            return abyte0;
        }
        wobDatastore.updateCacheHead(i, ((com.google.wallet.proto.api.NanoWalletWobs.UpdateCacheHeadResponse) (abyte0)).state, Protos.valueWithDefaultTrue(((com.google.wallet.proto.api.NanoWalletWobs.UpdateCacheHeadResponse) (abyte0)).isIncremental), ((com.google.wallet.proto.api.NanoWalletWobs.UpdateCacheHeadResponse) (abyte0)).removedWobId, ((com.google.wallet.proto.api.NanoWalletWobs.UpdateCacheHeadResponse) (abyte0)).changedWob);
        if (((com.google.wallet.proto.api.NanoWalletWobs.UpdateCacheHeadResponse) (abyte0)).removedWobId.length == 0 && ((com.google.wallet.proto.api.NanoWalletWobs.UpdateCacheHeadResponse) (abyte0)).changedWob.length == 0)
        {
            return UpdateCacheHeadResult.NO_UPDATE;
        } else
        {
            wobDatastore.updateNextPageToken(Integer.valueOf(i), ((com.google.wallet.proto.api.NanoWalletWobs.UpdateCacheHeadResponse) (abyte0)).state.nextPageToken);
            return UpdateCacheHeadResult.SUCCESS_UPDATED;
        }
    }

    private byte[] getCacheConfigurationId()
        throws RpcException
    {
        byte abyte0[] = (byte[])SharedPreference.WOBS_CACHE_CONFIGURATION_ID.get(sharedPreferences);
        if (abyte0.length != 0)
        {
            return abyte0;
        } else
        {
            return fetchCacheConfig().configurationId;
        }
    }

    private void handleWobHeadListByCategoryEventRegistration(final WobCategory wobCategory)
    {
        actionExecutor.executeAction(new Callable() {

            final WobsManager this$0;
            final WobCategory val$wobCategory;

            private Void call()
            {
                List list = wobDatastore.readWobsByCategoryId(wobCategory.getId());
                boolean flag;
                if (wobDatastore.getNextPageToken(wobCategory) != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                eventBus.post(wobCategory, new WobHeadListByCategoryEvent(list, false, flag));
                refreshHeadCache(wobCategory);
                return null;
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = WobsManager.this;
                wobCategory = wobcategory;
                super();
            }
        });
    }

    private void handleWobUpdateEventRegistration(final String wobInstanceId)
    {
        actionExecutor.executeAction(new Callable() {

            final WobsManager this$0;
            final String val$wobInstanceId;

            private Void call()
            {
                Object obj = wobDatastore.readWob(wobInstanceId);
                if (obj != null)
                {
                    WLog.i(WobsManager.TAG, "Read WOB from db");
                    eventBus.post(wobInstanceId, new WobUpdateEvent(((com.google.wallet.proto.NanoWalletObjects.WobInstance) (obj))));
                    return null;
                }
                WLog.i(WobsManager.TAG, "WOB is not in db - fetching");
                try
                {
                    obj = wobsCacheClient.fetchWob(wobInstanceId);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    eventBus.post(wobInstanceId, WobUpdateEvent.errorEvent());
                    return null;
                }
                if (((com.google.wallet.proto.api.NanoWalletWobs.FetchWobsResponse) (obj)).callError != null)
                {
                    WLog.efmt(WobsManager.TAG, "WOB fetching error %d", new Object[] {
                        ((com.google.wallet.proto.api.NanoWalletWobs.FetchWobsResponse) (obj)).callError.errorCode
                    });
                    obj = WobUpdateEvent.errorEvent();
                } else
                if (((com.google.wallet.proto.api.NanoWalletWobs.FetchWobsResponse) (obj)).wob != null && ((com.google.wallet.proto.api.NanoWalletWobs.FetchWobsResponse) (obj)).wob.length == 1)
                {
                    obj = new WobUpdateEvent(((com.google.wallet.proto.api.NanoWalletWobs.FetchWobsResponse) (obj)).wob[0]);
                } else
                {
                    WLog.e(WobsManager.TAG, "Could not find WobInstance in FetchWobsResponse");
                    obj = WobUpdateEvent.errorEvent();
                }
                eventBus.post(wobInstanceId, obj);
                return null;
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = WobsManager.this;
                wobInstanceId = s;
                super();
            }
        });
    }

    private void refreshHeadCache(WobCategory wobcategory)
    {
        boolean flag1 = true;
        byte abyte0[];
        Object obj;
        try
        {
            abyte0 = getCacheConfigurationId();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            eventBus.post(wobcategory, WobHeadListByCategoryEvent.errorEvent());
            return;
        }
        obj = fetchCacheHeadAndUpdateDb(abyte0, wobcategory.getId());
        if (obj == UpdateCacheHeadResult.ERROR)
        {
            eventBus.post(wobcategory, WobHeadListByCategoryEvent.errorEvent());
            return;
        }
        EventBus eventbus = eventBus;
        List list = wobDatastore.readWobsByCategoryId(wobcategory.getId());
        boolean flag;
        if (obj == UpdateCacheHeadResult.SUCCESS_UPDATED)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (wobDatastore.getNextPageToken(wobcategory) == null)
        {
            flag1 = false;
        }
        eventbus.post(wobcategory, new WobHeadListByCategoryEvent(list, flag, flag1));
    }

    private void removeInvalidatedCategoryAndWobs(Integer ainteger[])
    {
        if (ainteger.length == 0)
        {
            return;
        } else
        {
            wobDatastore.removeCategories(ainteger);
            wobDatastore.removeAllWobsInCategories(ainteger);
            return;
        }
    }

    private void resetConfiguration()
    {
        com.google.wallet.proto.api.NanoWalletWobs.FetchCacheConfigResponse fetchcacheconfigresponse = fetchCacheConfig();
        removeInvalidatedCategoryAndWobs((Integer[])Ints.asList(fetchcacheconfigresponse.invalidatedCategoryId).toArray(new Integer[0]));
        int ai[] = fetchcacheconfigresponse.categoryId;
        int j = ai.length;
        for (int i = 0; i < j; i++)
        {
            refreshHeadCache(WobCategory.fromId(Integer.valueOf(ai[i]).intValue()));
        }

        break MISSING_BLOCK_LABEL_77;
        RpcException rpcexception;
        rpcexception;
        WLog.e(TAG, "failed to fetch WOBs Cache Configuration", rpcexception);
    }

    private void syncHeadWobsFromCrossbar()
    {
        WLog.i(TAG, "begin syncing all WOB caches from crossbar.");
        Integer ainteger[] = null;
        byte abyte0[];
        int ai[];
        int j;
        try
        {
            com.google.wallet.proto.api.NanoWalletWobs.FetchCacheConfigResponse fetchcacheconfigresponse = fetchCacheConfig();
            abyte0 = fetchcacheconfigresponse.configurationId;
            ai = fetchcacheconfigresponse.categoryId;
            if (fetchcacheconfigresponse.invalidatedCategoryId != null)
            {
                ainteger = (Integer[])Ints.asList(fetchcacheconfigresponse.invalidatedCategoryId).toArray(new Integer[0]);
            }
        }
        catch (RpcException rpcexception)
        {
            WLog.e(TAG, "failed to fetch WOBs Cache Configuration", rpcexception);
            return;
        }
        removeInvalidatedCategoryAndWobs(ainteger);
        j = ai.length;
        for (int i = 0; i < j; i++)
        {
            if (fetchCacheHeadAndUpdateDb(abyte0, Integer.valueOf(ai[i]).intValue()) == UpdateCacheHeadResult.ERROR)
            {
                return;
            }
        }

        WLog.i(TAG, "Successfully synced all WOB caches from crossbar.");
    }

    public final void deleteWob(final com.google.wallet.proto.NanoWalletObjects.WobInstance wobInstance)
    {
        actionExecutor.executeAction(new Callable() {

            final WobsManager this$0;
            final com.google.wallet.proto.NanoWalletObjects.WobInstance val$wobInstance;

            private com.google.wallet.proto.api.NanoWalletWobs.DeleteWobResponse call()
                throws Exception
            {
                com.google.wallet.proto.api.NanoWalletWobs.DeleteWobResponse deletewobresponse = wobsClient.deleteWob(wobInstance);
                if (deletewobresponse.callError == null)
                {
                    if (deletewobresponse.instance == null)
                    {
                        throw new RpcException("Crossbar returned both deleteWobResponse.callError == null and deleteWobResponse.instance == null");
                    }
                    wobDatastore.removeWobs(wobInstance.categoryId.intValue(), new String[] {
                        wobInstance.id
                    });
                }
                return deletewobresponse;
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = WobsManager.this;
                wobInstance = wobinstance;
                super();
            }
        }, new AsyncCallback() {

            final WobsManager this$0;
            final com.google.wallet.proto.NanoWalletObjects.WobInstance val$wobInstance;

            private void onSuccess(com.google.wallet.proto.api.NanoWalletWobs.DeleteWobResponse deletewobresponse)
            {
                if (deletewobresponse.callError != null)
                {
                    eventBus.post(wobInstance.id, new WobDeletionEvent(wobInstance, deletewobresponse.callError));
                    return;
                } else
                {
                    deletewobresponse.instance.categoryId = wobInstance.categoryId;
                    eventBus.post(deletewobresponse.instance.id, new WobDeletionEvent(deletewobresponse.instance));
                    return;
                }
            }

            public final void onFailure(Exception exception)
            {
                eventBus.post(wobInstance.id, new WobDeletionEvent(wobInstance, new com.google.wallet.proto.NanoWalletError.CallError()));
            }

            public final volatile void onSuccess(Object obj)
            {
                onSuccess((com.google.wallet.proto.api.NanoWalletWobs.DeleteWobResponse)obj);
            }

            
            {
                this$0 = WobsManager.this;
                wobInstance = wobinstance;
                super();
            }
        });
    }

    public final void fetchNextPage(final WobCategory wobCategory)
    {
        actionExecutor.executeAction(new Callable() {

            final WobsManager this$0;
            final WobCategory val$wobCategory;

            private Void call()
            {
                boolean flag = true;
                byte abyte0[] = wobDatastore.getNextPageToken(wobCategory);
                if (abyte0 == null)
                {
                    eventBus.post(wobCategory, new WobTailListByCategoryEvent(new com.google.wallet.proto.NanoWalletObjects.WobInstance[0], false));
                    return null;
                }
                Object obj;
                try
                {
                    byte abyte1[] = getCacheConfigurationId();
                    obj = wobsCacheClient.fetchTailWobs(abyte1, wobCategory, abyte0);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    eventBus.post(wobCategory, WobTailListByCategoryEvent.errorEvent());
                    return null;
                }
                if (((com.google.wallet.proto.api.NanoWalletWobs.FetchNextWobsResponse) (obj)).callError != null)
                {
                    if (((com.google.wallet.proto.api.NanoWalletWobs.FetchNextWobsResponse) (obj)).callError.errorCode.intValue() == 1)
                    {
                        resetConfiguration();
                    }
                    eventBus.post(wobCategory, WobTailListByCategoryEvent.errorEvent());
                    return null;
                }
                wobDatastore.writeTailWobs(((com.google.wallet.proto.api.NanoWalletWobs.FetchNextWobsResponse) (obj)).wob);
                wobDatastore.updateNextPageToken(Integer.valueOf(wobCategory.getId()), ((com.google.wallet.proto.api.NanoWalletWobs.FetchNextWobsResponse) (obj)).nextPageToken);
                EventBus eventbus = eventBus;
                WobCategory wobcategory = wobCategory;
                com.google.wallet.proto.NanoWalletObjects.WobInstance awobinstance[] = ((com.google.wallet.proto.api.NanoWalletWobs.FetchNextWobsResponse) (obj)).wob;
                if (((com.google.wallet.proto.api.NanoWalletWobs.FetchNextWobsResponse) (obj)).nextPageToken == null)
                {
                    flag = false;
                }
                eventbus.post(wobcategory, new WobTailListByCategoryEvent(awobinstance, flag));
                return null;
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = WobsManager.this;
                wobCategory = wobcategory;
                super();
            }
        });
    }

    public final void initialize()
    {
        eventBus.registerEventProducer(com/google/android/apps/wallet/wobs/caching/WobHeadListByCategoryEvent, new RegistrationCallback() {

            final WobsManager this$0;

            public final void handleRegistration(Object obj)
            {
                handleWobHeadListByCategoryEventRegistration((WobCategory)obj);
            }

            
            {
                this$0 = WobsManager.this;
                super();
            }
        });
        eventBus.registerEventProducer(com/google/android/apps/wallet/wobs/provider/WobUpdateEvent, new RegistrationCallback() {

            final WobsManager this$0;

            public final void handleRegistration(Object obj)
            {
                if (obj instanceof String)
                {
                    handleWobUpdateEventRegistration((String)obj);
                }
            }

            
            {
                this$0 = WobsManager.this;
                super();
            }
        });
    }

    public final com.google.wallet.proto.api.NanoWalletWobs.PerformWobsActionResponse performWobsAction(String s)
        throws RpcException
    {
        s = wobsClient.performWobsAction(s);
        break MISSING_BLOCK_LABEL_9;
        if (((com.google.wallet.proto.api.NanoWalletWobs.PerformWobsActionResponse) (s)).updatedWobInstance != null && !upsertWobIfNecessary(((com.google.wallet.proto.api.NanoWalletWobs.PerformWobsActionResponse) (s)).updatedWobInstance))
        {
            com.google.wallet.proto.NanoWalletObjects.WobInstance wobinstance = wobDatastore.readWob(((com.google.wallet.proto.api.NanoWalletWobs.PerformWobsActionResponse) (s)).updatedWobInstance.id);
            if (wobinstance != null)
            {
                wobDatastore.removeWobs(wobinstance.categoryId.intValue(), new String[] {
                    wobinstance.id
                });
                eventBus.post(wobinstance.id, WobDeletionEvent.deletionCausedByCategoryChange(wobinstance));
                eventBus.post(((com.google.wallet.proto.api.NanoWalletWobs.PerformWobsActionResponse) (s)).updatedWobInstance.id, new WobUpdateEvent(((com.google.wallet.proto.api.NanoWalletWobs.PerformWobsActionResponse) (s)).updatedWobInstance));
                return s;
            }
        }
        return s;
    }

    public final void refresh(final WobCategory wobCategory)
    {
        actionExecutor.executeAction(new Callable() {

            final WobsManager this$0;
            final WobCategory val$wobCategory;

            private Void call()
                throws Exception
            {
                wobDatastore.removeAllWobsInCategories(new Integer[] {
                    Integer.valueOf(wobCategory.getId())
                });
                wobDatastore.removeCategories(new Integer[] {
                    Integer.valueOf(wobCategory.getId())
                });
                refreshHeadCache(wobCategory);
                return null;
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = WobsManager.this;
                wobCategory = wobcategory;
                super();
            }
        });
    }

    public final void sync()
    {
        syncHeadWobsFromCrossbar();
    }

    public final void updateInstanceNotificationSettings(com.google.wallet.proto.NanoWalletObjects.WobInstance wobinstance, boolean flag)
        throws CallErrorException
    {
        com.google.wallet.proto.api.NanoWalletWobs.UpdateInstanceNotificationSettingsResponse updateinstancenotificationsettingsresponse;
        try
        {
            updateinstancenotificationsettingsresponse = wobsClient.updateInstanceNotificationSettings(wobinstance, flag);
        }
        // Misplaced declaration of an exception variable
        catch (com.google.wallet.proto.NanoWalletObjects.WobInstance wobinstance)
        {
            throw new CallErrorException(new com.google.wallet.proto.NanoWalletError.CallError());
        }
        if (updateinstancenotificationsettingsresponse.callError != null)
        {
            throw new CallErrorException(updateinstancenotificationsettingsresponse.callError);
        } else
        {
            wobinstance.notificationSettings.geofencedNotificationsEnabled = Boolean.valueOf(flag);
            upsertWobIfNecessary(wobinstance);
            return;
        }
    }

    public final boolean upsertWobIfNecessary(com.google.wallet.proto.NanoWalletObjects.WobInstance wobinstance)
    {
        if (wobDatastore.ifWobInCachedRange(wobinstance))
        {
            wobDatastore.upsertWob(wobinstance);
            eventBus.post(wobinstance.id, new WobUpdateEvent(wobinstance));
            return true;
        } else
        {
            return false;
        }
    }











}
