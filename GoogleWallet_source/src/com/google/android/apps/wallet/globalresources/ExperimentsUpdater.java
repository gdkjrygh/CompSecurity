// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.globalresources;

import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.common.collect.ImmutableList;
import dagger.Lazy;

// Referenced classes of package com.google.android.apps.wallet.globalresources:
//            GlobalResourceManager

public class ExperimentsUpdater
{

    private final AnalyticsUtil analyticsUtil;
    private final Lazy globalResourceManager;

    ExperimentsUpdater(Lazy lazy, AnalyticsUtil analyticsutil)
    {
        globalResourceManager = lazy;
        analyticsUtil = analyticsutil;
    }

    public final void updateExperiments()
    {
        com.google.wallet.proto.NanoWalletEntities.GlobalResources globalresources = ((GlobalResourceManager)globalResourceManager.get()).blockingGet();
        if (globalresources != null && globalresources.clientConfiguration != null)
        {
            updateExperimentsFromInfo(globalresources.clientConfiguration.analyticsInfo);
        }
    }

    public final void updateExperimentsFromInfo(com.google.wallet.proto.NanoWalletAnalytics.AnalyticsInfo analyticsinfo)
    {
        if (analyticsinfo == null)
        {
            analyticsUtil.setCustomDimensions(ImmutableList.of());
            return;
        }
        com.google.common.collect.ImmutableList.Builder builder = ImmutableList.builder();
        analyticsinfo = analyticsinfo.sessionScopedCustomDimension;
        int j = analyticsinfo.length;
        for (int i = 0; i < j; i++)
        {
            Object obj = analyticsinfo[i];
            builder.add(new AnalyticsCustomDimension(((com.google.wallet.proto.NanoWalletAnalytics.GoogleAnalyticsCustomDimension) (obj)).id.intValue(), ((com.google.wallet.proto.NanoWalletAnalytics.GoogleAnalyticsCustomDimension) (obj)).value));
        }

        analyticsUtil.setCustomDimensions(builder.build());
    }
}
