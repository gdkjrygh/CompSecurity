// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.config.featurecontrol;

import android.app.Application;
import com.google.android.apps.wallet.config.clientconfig.ClientConfigurationManager;
import com.google.android.apps.wallet.logging.WLog;
import com.google.common.collect.ImmutableSet;
import java.util.Iterator;

// Referenced classes of package com.google.android.apps.wallet.config.featurecontrol:
//            Feature, FeatureStateEvaluator

public class FeatureManager
{

    private static final String TAG = com/google/android/apps/wallet/config/featurecontrol/FeatureManager.getSimpleName();
    private final ClientConfigurationManager clientConfigurationManager;
    private final FeatureStateEvaluator featureStateEvaluator;
    private final ImmutableSet supportedServerControlledFeatures;

    public FeatureManager(ClientConfigurationManager clientconfigurationmanager, FeatureStateEvaluator featurestateevaluator, ImmutableSet immutableset)
    {
        clientConfigurationManager = clientconfigurationmanager;
        featureStateEvaluator = featurestateevaluator;
        supportedServerControlledFeatures = immutableset;
    }

    public static ImmutableSet getSupportedServerControlledFeatures(Application application, FeatureStateEvaluator featurestateevaluator)
    {
        com.google.common.collect.ImmutableSet.Builder builder = ImmutableSet.builder();
        Iterator iterator = Feature.getServerControlledFeatures().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Feature feature = (Feature)iterator.next();
            if (featurestateevaluator.isEnabled(feature.getFeatureState()) && feature.isSupported(application).booleanValue())
            {
                builder.add(feature);
            }
        } while (true);
        return builder.build();
    }

    public final boolean isFeatureEnabled(Feature feature)
    {
        if (feature.isServerControlled())
        {
            if (clientConfigurationManager.isClientConfigurationInitialized())
            {
                if (!clientConfigurationManager.isFeatureEnabled(feature.getFeatureCode()))
                {
                    return false;
                } else
                {
                    return supportedServerControlledFeatures.contains(feature);
                }
            } else
            {
                WLog.wfmt(TAG, "isFeatureEnabled(%s) called before the first sync of ClientConfiguration.", new Object[] {
                    feature
                });
                return false;
            }
        } else
        {
            return featureStateEvaluator.isEnabled(feature.getFeatureState());
        }
    }

}
