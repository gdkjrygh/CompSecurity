// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.usersetup;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.apps.wallet.api.InternalIntents;
import com.google.android.apps.wallet.config.featurecontrol.Feature;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.config.sharedpreferences.SharedPreference;
import com.google.android.apps.wallet.filter.ActivityFilter;

// Referenced classes of package com.google.android.apps.wallet.usersetup:
//            SimplifiedSetupProfileActivity, SetupProfileActivity

public class SetupFilter extends ActivityFilter
{

    private final Activity activity;
    private final FeatureManager featureManager;
    private final SharedPreferences sharedPreferences;

    SetupFilter(Activity activity1, SharedPreferences sharedpreferences, FeatureManager featuremanager)
    {
        activity = activity1;
        sharedPreferences = sharedpreferences;
        featureManager = featuremanager;
    }

    public final Intent onCreate(Bundle bundle)
    {
        if (!((Boolean)SharedPreference.SETUP_COMPLETE.get(sharedPreferences)).booleanValue())
        {
            if (featureManager.isFeatureEnabled(Feature.SIMPLIFIED_SETUP))
            {
                bundle = com/google/android/apps/wallet/usersetup/SimplifiedSetupProfileActivity;
            } else
            {
                bundle = com/google/android/apps/wallet/usersetup/SetupProfileActivity;
            }
            return InternalIntents.forClass(activity, bundle);
        } else
        {
            return null;
        }
    }
}
