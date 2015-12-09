// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.api;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.ui.GamesUiConfiguration;

// Referenced classes of package com.google.android.gms.games.ui.api:
//            DestinationApiHelper

public final class GamesDestinationApi
{

    public static void checkClientUi(Activity activity)
    {
        Asserts.checkState(activity instanceof com.google.android.gms.games.ui.GamesUiConfiguration.GamesUiConfigurationProvider);
        activity = ((com.google.android.gms.games.ui.GamesUiConfiguration.GamesUiConfigurationProvider)activity).getConfiguration();
        boolean flag;
        if (activity.isClientUi() || activity.isRestrictedUi())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag, "This method can only be called from client or restricted UI");
    }

    public static Integer getDestinationAppClientJarVersion(Context context)
    {
        Object obj = null;
        Bundle bundle;
        try
        {
            context = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            GamesLog.e("GamesDestApi", "Cannot find the destination app. We should have check that already.");
            return null;
        }
        bundle = ((ApplicationInfo) (context)).metaData;
        context = obj;
        if (bundle != null)
        {
            int i = bundle.getInt("com.google.android.gms.version");
            context = obj;
            if (i != 0)
            {
                context = Integer.valueOf(i);
            }
        }
        return context;
    }

    public static void startIntent(Activity activity, Intent intent, String s)
    {
        Asserts.checkState(activity instanceof DestinationApiHelper.DestinationApiHelperProvider);
        ((DestinationApiHelper.DestinationApiHelperProvider)activity).getDestinationApiHelper().startIntent(intent, s);
    }
}
