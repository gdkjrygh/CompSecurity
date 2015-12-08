// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.config.featurecontrol;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.wallet.filter.ActivityFilter;

// Referenced classes of package com.google.android.apps.wallet.config.featurecontrol:
//            FeatureRestriction, FeatureManager

public class RestrictedFeatureFilter extends ActivityFilter
{

    private final Activity activity;
    private final FeatureManager featureManager;

    public RestrictedFeatureFilter(Activity activity1, FeatureManager featuremanager)
    {
        activity = activity1;
        featureManager = featuremanager;
    }

    protected final Intent onCreate(Bundle bundle)
    {
        bundle = (FeatureRestriction)activity.getClass().getAnnotation(com/google/android/apps/wallet/config/featurecontrol/FeatureRestriction);
        if (bundle != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        bundle = bundle.value();
        int j = bundle.length;
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= j)
                {
                    break label1;
                }
                Feature feature = bundle[i];
                if (featureManager.isFeatureEnabled(feature))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        throw new IllegalStateException("None of the required feature(s) are enabled.");
    }
}
