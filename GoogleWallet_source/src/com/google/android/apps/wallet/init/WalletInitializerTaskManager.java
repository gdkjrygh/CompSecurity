// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.init;

import android.app.Application;
import android.content.SharedPreferences;
import com.google.android.apps.wallet.config.sharedpreferences.SharedPreference;
import com.google.android.apps.wallet.eventbus.InitializeEventPublishersTask;
import com.google.android.apps.wallet.hce.setup.SetupHceOnBootTask;
import com.google.android.apps.wallet.pin.ExpirePinTask;
import com.google.android.apps.wallet.pin.FetchCloudPinStateTask;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;

// Referenced classes of package com.google.android.apps.wallet.init:
//            InitializerTaskManager, LoadGlobalResourcesTask, ClearNotificationsTask, MarkBootTasksCompletedTask, 
//            MarkChangedUserTasksCompletedTask, CombinedSyncTask, CombinedBackgroundInitializerTask

public class WalletInitializerTaskManager extends InitializerTaskManager
{

    private static final ImmutableList BOOT_TASKS = ImmutableList.of(com/google/android/apps/wallet/init/LoadGlobalResourcesTask, com/google/android/apps/wallet/pin/FetchCloudPinStateTask, com/google/android/apps/wallet/pin/ExpirePinTask, com/google/android/apps/wallet/init/ClearNotificationsTask, com/google/android/apps/wallet/init/MarkBootTasksCompletedTask, com/google/android/apps/wallet/init/MarkChangedUserTasksCompletedTask);
    private static final ImmutableList CHANGED_USER_TASKS = ImmutableList.of(com/google/android/apps/wallet/pin/ExpirePinTask, com/google/android/apps/wallet/init/ClearNotificationsTask, com/google/android/apps/wallet/init/MarkChangedUserTasksCompletedTask);
    private static final ImmutableList COMMON_TASKS = ImmutableList.of(com/google/android/apps/wallet/hce/setup/SetupHceOnBootTask, com/google/android/apps/wallet/eventbus/InitializeEventPublishersTask, com/google/android/apps/wallet/init/CombinedSyncTask, com/google/android/apps/wallet/init/CombinedBackgroundInitializerTask);
    private final SharedPreferences globalPrefs;
    private final SharedPreferences userPrefs;

    public WalletInitializerTaskManager(Application application, SharedPreferences sharedpreferences, SharedPreferences sharedpreferences1)
    {
        super(application);
        globalPrefs = sharedpreferences;
        userPrefs = sharedpreferences1;
    }

    private boolean needsBootTasks()
    {
        while (!SharedPreference.BOOT_OR_UPGRADE_GENERATION_NUMBER.isPresent(userPrefs) || !((Long)SharedPreference.BOOT_OR_UPGRADE_GENERATION_NUMBER.get(globalPrefs)).equals(SharedPreference.BOOT_OR_UPGRADE_GENERATION_NUMBER.get(userPrefs))) 
        {
            return true;
        }
        return false;
    }

    protected final ImmutableList getAllNecessaryTasks()
    {
        if (needsBootTasks())
        {
            return ImmutableList.copyOf(Iterables.concat(BOOT_TASKS, COMMON_TASKS));
        }
        if (((Boolean)SharedPreference.CHANGED_USER.get(globalPrefs)).booleanValue())
        {
            return ImmutableList.copyOf(Iterables.concat(CHANGED_USER_TASKS, COMMON_TASKS));
        } else
        {
            return COMMON_TASKS;
        }
    }

}
