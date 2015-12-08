// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.config.featurecontrol;

import android.app.Application;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.common.collect.ImmutableSet;

// Referenced classes of package com.google.android.apps.wallet.config.featurecontrol:
//            FeaturesChangedEventPublisher, FeatureManager, FeatureStateEvaluator

public class FeatureModule
{

    public FeatureModule()
    {
    }

    static com.google.android.apps.wallet.config.clientconfig.ClientConfigurationManager.ClientConfigurationFeatureListener getClientConfigurationFeatureListener(EventBus eventbus)
    {
        return new FeaturesChangedEventPublisher(eventbus);
    }

    static ImmutableSet getSupportedServerControlledFeatures(Application application, FeatureStateEvaluator featurestateevaluator)
    {
        return FeatureManager.getSupportedServerControlledFeatures(application, featurestateevaluator);
    }
}
