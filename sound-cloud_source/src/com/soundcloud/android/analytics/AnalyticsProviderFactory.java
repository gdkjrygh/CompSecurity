// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics;

import android.content.SharedPreferences;
import com.soundcloud.android.analytics.adjust.AdjustAnalyticsProvider;
import com.soundcloud.android.analytics.comscore.ComScoreAnalyticsProvider;
import com.soundcloud.android.analytics.crashlytics.FabricAnalyticsProvider;
import com.soundcloud.android.analytics.eventlogger.EventLoggerAnalyticsProvider;
import com.soundcloud.android.analytics.playcounts.PlayCountAnalyticsProvider;
import com.soundcloud.android.analytics.promoted.PromotedAnalyticsProvider;
import com.soundcloud.android.properties.FeatureFlags;
import com.soundcloud.android.properties.Flag;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.analytics:
//            AnalyticsProperties

public class AnalyticsProviderFactory
{

    private static final int EXPECTED_PROVIDER_COUNT = 7;
    private final AdjustAnalyticsProvider adjustAnalyticsProvider;
    private final AnalyticsProperties analyticsProperties;
    private final Provider appboyAnalyticsProvider;
    private final ComScoreAnalyticsProvider comScoreAnalyticsProvider;
    private final EventLoggerAnalyticsProvider eventLoggerAnalyticsProvider;
    private final FabricAnalyticsProvider fabricAnalyticsProvider;
    private final FeatureFlags featureFlags;
    private final PlayCountAnalyticsProvider playCountAnalyticsProvider;
    private final PromotedAnalyticsProvider promotedAnalyticsProvider;
    private final SharedPreferences sharedPreferences;

    public AnalyticsProviderFactory(AnalyticsProperties analyticsproperties, SharedPreferences sharedpreferences, FeatureFlags featureflags, EventLoggerAnalyticsProvider eventloggeranalyticsprovider, PlayCountAnalyticsProvider playcountanalyticsprovider, Provider provider, PromotedAnalyticsProvider promotedanalyticsprovider, 
            AdjustAnalyticsProvider adjustanalyticsprovider, ComScoreAnalyticsProvider comscoreanalyticsprovider, FabricAnalyticsProvider fabricanalyticsprovider)
    {
        sharedPreferences = sharedpreferences;
        analyticsProperties = analyticsproperties;
        featureFlags = featureflags;
        eventLoggerAnalyticsProvider = eventloggeranalyticsprovider;
        playCountAnalyticsProvider = playcountanalyticsprovider;
        appboyAnalyticsProvider = provider;
        adjustAnalyticsProvider = adjustanalyticsprovider;
        comScoreAnalyticsProvider = comscoreanalyticsprovider;
        promotedAnalyticsProvider = promotedanalyticsprovider;
        fabricAnalyticsProvider = fabricanalyticsprovider;
    }

    private void addOptInProviders(List list)
    {
        list.add(adjustAnalyticsProvider);
        list.add(fabricAnalyticsProvider);
        if (featureFlags.isEnabled(Flag.APPBOY))
        {
            list.add(appboyAnalyticsProvider.get());
        }
        if (comScoreAnalyticsProvider != null)
        {
            list.add(comScoreAnalyticsProvider);
        }
    }

    private List getBaseProviders()
    {
        ArrayList arraylist = new ArrayList(7);
        arraylist.add(eventLoggerAnalyticsProvider);
        arraylist.add(playCountAnalyticsProvider);
        arraylist.add(promotedAnalyticsProvider);
        return arraylist;
    }

    public List getProviders()
    {
        List list;
        if (!analyticsProperties.isAnalyticsAvailable())
        {
            list = Collections.emptyList();
        } else
        {
            List list1 = getBaseProviders();
            list = list1;
            if (sharedPreferences.getBoolean("analytics_enabled", true))
            {
                addOptInProviders(list1);
                return list1;
            }
        }
        return list;
    }
}
