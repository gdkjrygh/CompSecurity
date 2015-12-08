// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.init;

import android.content.SharedPreferences;
import com.google.android.apps.wallet.config.sharedpreferences.SharedPreference;
import com.google.android.apps.wallet.globalresources.GlobalResourceManager;
import com.google.android.apps.wallet.globalresources.GlobalResourcesSyncManager;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.rpc.RpcException;
import java.util.concurrent.Callable;

public class LoadGlobalResourcesTask
    implements Callable
{

    private static final String TAG = com/google/android/apps/wallet/init/LoadGlobalResourcesTask.getSimpleName();
    private final GlobalResourceManager globalResourceManager;
    private final GlobalResourcesSyncManager globalResourcesSyncManager;
    private final SharedPreferences userPrefs;

    public LoadGlobalResourcesTask(SharedPreferences sharedpreferences, GlobalResourceManager globalresourcemanager, GlobalResourcesSyncManager globalresourcessyncmanager)
    {
        userPrefs = sharedpreferences;
        globalResourceManager = globalresourcemanager;
        globalResourcesSyncManager = globalresourcessyncmanager;
    }

    private Void call()
        throws RpcException
    {
        if (((Boolean)SharedPreference.SETUP_COMPLETE.get(userPrefs)).booleanValue()) goto _L2; else goto _L1
_L1:
        WLog.d(TAG, "Setup not complete, no-oping");
_L4:
        return null;
_L2:
        boolean flag;
        boolean flag1;
        flag1 = true;
        flag = true;
        if (((Long)SharedPreference.LAST_SYNC_TIMESTAMP.get(userPrefs)).longValue() <= 0L)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!globalResourceManager.hasCache())
        {
            break MISSING_BLOCK_LABEL_96;
        }
        flag = flag1;
        WLog.d(TAG, "Re-initializing local state using cached global resources");
        flag = flag1;
        globalResourceManager.updateFromCache();
        flag = false;
        flag1 = false;
        globalResourcesSyncManager.syncGlobalResourcesNow();
        flag = flag1;
_L5:
        if (flag)
        {
            WLog.d(TAG, "No valid local cache of global resources could be found, requesting a new version");
            globalResourcesSyncManager.syncGlobalResourcesNow();
            return null;
        }
        if (true) goto _L4; else goto _L3
_L3:
        WLog.d(TAG, "GlobalResources has not been synced before.");
          goto _L5
        Object obj;
        obj;
          goto _L5
        obj;
        flag = flag1;
          goto _L5
    }

    public volatile Object call()
        throws Exception
    {
        return call();
    }

}
