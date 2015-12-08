// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.config.featurecontrol;

import android.app.Application;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.apps.wallet.logging.WLog;
import com.google.common.base.Throwables;

// Referenced classes of package com.google.android.apps.wallet.config.featurecontrol:
//            FeatureSet

public class ApplicationScopedFeatureModule
{

    public ApplicationScopedFeatureModule()
    {
    }

    static FeatureSet providesFeatureSet(Application application)
    {
        try
        {
            application = application.getPackageManager().getApplicationInfo(application.getPackageName(), 128).metaData.getString(com/google/android/apps/wallet/config/featurecontrol/FeatureSet.getName());
        }
        // Misplaced declaration of an exception variable
        catch (Application application)
        {
            throw Throwables.propagate(application);
        }
        if (application != null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        throw new IllegalArgumentException("Must have FEATURE_SET metadata in manifest!");
        application = FeatureSet.valueOf(application);
        if (application == FeatureSet.DEVELOPMENT || application == FeatureSet.FISHFOOD || application == FeatureSet.DOGFOOD)
        {
            WLog.setMinLogPriority(com.google.android.apps.wallet.logging.WLog.LogPriority.VERBOSE);
        }
        return application;
    }
}
