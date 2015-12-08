// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.configuration;

import com.soundcloud.android.configuration.features.FeatureStorage;
import java.util.List;
import rx.b;

// Referenced classes of package com.soundcloud.android.configuration:
//            PlanStorage

public class FeatureOperations
{

    private final FeatureStorage featureStorage;
    private final PlanStorage planStorage;

    public FeatureOperations(FeatureStorage featurestorage, PlanStorage planstorage)
    {
        featureStorage = featurestorage;
        planStorage = planstorage;
    }

    private b getUpdates(String s)
    {
        return featureStorage.getUpdates(s);
    }

    private boolean isFeatureAvailableInPlan(String s, String s1)
    {
        return featureStorage.getPlans(s).contains(s1);
    }

    private boolean isFeatureAvailableViaUpgrade(String s)
    {
        return isFeatureAvailableInPlan(s, "mid_tier") && upsellMidTier();
    }

    public String getPlan()
    {
        return planStorage.getPlan();
    }

    public boolean isOfflineContentEnabled()
    {
        return featureStorage.isEnabled("offline_sync", false);
    }

    public boolean isOfflineContentOrUpsellEnabled()
    {
        return isOfflineContentEnabled() || upsellOfflineContent();
    }

    public b offlineContentEnabled()
    {
        return getUpdates("offline_sync");
    }

    public void updateFeatures(List list)
    {
        featureStorage.update(list);
    }

    public void updatePlan(String s, List list)
    {
        planStorage.updatePlan(s);
        planStorage.updateUpsells(list);
    }

    public boolean upsellMidTier()
    {
        return planStorage.getUpsells().contains("mid_tier");
    }

    public boolean upsellOfflineContent()
    {
        return !isOfflineContentEnabled() && isFeatureAvailableViaUpgrade("offline_sync");
    }

    public boolean upsellRemoveAudioAds()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (!featureStorage.isEnabled("no_audio_ads", false))
        {
            flag = flag1;
            if (isFeatureAvailableViaUpgrade("no_audio_ads"))
            {
                flag = true;
            }
        }
        return flag;
    }
}
