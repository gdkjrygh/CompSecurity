// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.globalresources;

import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.rpc.RpcException;
import com.google.android.apps.wallet.userscope.UserInjector;
import com.google.android.gms.gcm.GcmTaskService;
import com.google.android.gms.gcm.TaskParams;

// Referenced classes of package com.google.android.apps.wallet.globalresources:
//            GlobalResourcesSyncManager

public class GlobalResourcesSyncService extends GcmTaskService
{

    private static final String TAG = com/google/android/apps/wallet/globalresources/GlobalResourcesSyncService.getSimpleName();
    GlobalResourcesSyncManager globalResourcesSyncManager;

    public GlobalResourcesSyncService()
    {
    }

    public final int onRunTask(TaskParams taskparams)
    {
        WLog.d(TAG, "GlobalResourcesSyncService woke up");
        if (!taskparams.getTag().equals("syncGlobalResources"))
        {
            return 0;
        }
        UserInjector.inject(this, this);
        try
        {
            globalResourcesSyncManager.syncIfNeeded();
        }
        // Misplaced declaration of an exception variable
        catch (TaskParams taskparams)
        {
            return 1;
        }
        return 0;
    }

}
