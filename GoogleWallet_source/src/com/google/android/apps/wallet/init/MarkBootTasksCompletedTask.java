// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.init;

import android.content.SharedPreferences;
import com.google.android.apps.wallet.config.sharedpreferences.SharedPreference;
import com.google.android.apps.wallet.logging.WLog;
import java.util.concurrent.Callable;

public class MarkBootTasksCompletedTask
    implements Callable
{

    private static final String TAG = com/google/android/apps/wallet/init/MarkBootTasksCompletedTask.getSimpleName();
    private final SharedPreferences globalPrefs;
    private final SharedPreferences userPrefs;

    MarkBootTasksCompletedTask(SharedPreferences sharedpreferences, SharedPreferences sharedpreferences1)
    {
        globalPrefs = sharedpreferences;
        userPrefs = sharedpreferences1;
    }

    private Void call()
    {
        Long long1 = (Long)SharedPreference.BOOT_OR_UPGRADE_GENERATION_NUMBER.get(globalPrefs);
        WLog.dfmt(TAG, "Marking boot tasks complete at generation no: %d", new Object[] {
            long1
        });
        SharedPreference.BOOT_OR_UPGRADE_GENERATION_NUMBER.put(userPrefs, long1);
        return null;
    }

    public volatile Object call()
        throws Exception
    {
        return call();
    }

}
