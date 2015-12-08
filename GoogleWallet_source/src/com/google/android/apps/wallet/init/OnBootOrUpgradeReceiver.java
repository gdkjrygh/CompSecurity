// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.init;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v4.content.WakefulBroadcastReceiver;
import com.google.android.apps.wallet.api.InternalIntents;
import com.google.android.apps.wallet.config.sharedpreferences.SharedPreference;
import com.google.android.apps.wallet.userscope.UserInjector;

// Referenced classes of package com.google.android.apps.wallet.init:
//            OnBootOrUpgradeService

public class OnBootOrUpgradeReceiver extends WakefulBroadcastReceiver
{

    SharedPreferences globalPrefs;
    SharedPreferences userPrefs;

    public OnBootOrUpgradeReceiver()
    {
    }

    private static boolean isOnBootIntent(Intent intent)
    {
        return "android.intent.action.BOOT_COMPLETED".equals(intent.getAction());
    }

    private static boolean isPackageReplaceIntent(Context context, Intent intent)
    {
        context = String.valueOf(context.getPackageName());
        if (context.length() != 0)
        {
            context = "package:".concat(context);
        } else
        {
            context = new String("package:");
        }
        return "android.intent.action.PACKAGE_REPLACED".equals(intent.getAction()) && context.equals(intent.getDataString());
    }

    public void onReceive(Context context, Intent intent)
    {
        UserInjector.inject(this, context);
        if (isPackageReplaceIntent(context, intent) || isOnBootIntent(intent))
        {
            long l = ((Long)SharedPreference.BOOT_OR_UPGRADE_GENERATION_NUMBER.get(globalPrefs)).longValue();
            SharedPreference.BOOT_OR_UPGRADE_GENERATION_NUMBER.putAndCommit(globalPrefs, Long.valueOf(1L + l));
            startWakefulService(context, InternalIntents.forClass(context, com/google/android/apps/wallet/init/OnBootOrUpgradeService));
        }
    }
}
