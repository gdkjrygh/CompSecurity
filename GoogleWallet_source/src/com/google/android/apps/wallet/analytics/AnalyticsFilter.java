// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.analytics;

import android.app.Activity;
import com.google.android.apps.wallet.filter.ActivityFilter;

// Referenced classes of package com.google.android.apps.wallet.analytics:
//            AnalyticsContext, AnalyticsCustomDimension, AnalyticsUtil

public class AnalyticsFilter extends ActivityFilter
{

    private final Activity activity;
    private final AnalyticsUtil analyticsUtil;

    AnalyticsFilter(Activity activity1, AnalyticsUtil analyticsutil)
    {
        activity = activity1;
        analyticsUtil = analyticsutil;
    }

    protected final void onResume()
    {
        AnalyticsContext analyticscontext = (AnalyticsContext)activity.getClass().getAnnotation(com/google/android/apps/wallet/analytics/AnalyticsContext);
        if (analyticscontext != null)
        {
            analyticsUtil.sendScreen(analyticscontext.value(), new AnalyticsCustomDimension[0]);
        }
    }
}
