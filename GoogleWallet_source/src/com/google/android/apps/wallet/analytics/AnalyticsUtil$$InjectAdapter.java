// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.analytics;

import com.google.android.gms.analytics.Tracker;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.analytics:
//            AnalyticsUtil, CsiManager, ClientTimingReportingConfiguration

public final class ation extends Binding
    implements Provider
{

    private Binding csi;
    private Binding reportingConfig;
    private Binding tracker;

    public final void attach(Linker linker)
    {
        tracker = linker.requestBinding("com.google.android.gms.analytics.Tracker", com/google/android/apps/wallet/analytics/AnalyticsUtil, getClass().getClassLoader());
        csi = linker.requestBinding("com.google.android.apps.wallet.analytics.CsiManager", com/google/android/apps/wallet/analytics/AnalyticsUtil, getClass().getClassLoader());
        reportingConfig = linker.requestBinding("com.google.android.apps.wallet.analytics.ClientTimingReportingConfiguration", com/google/android/apps/wallet/analytics/AnalyticsUtil, getClass().getClassLoader());
    }

    public final AnalyticsUtil get()
    {
        return new AnalyticsUtil((Tracker)tracker.get(), (CsiManager)csi.get(), (ClientTimingReportingConfiguration)reportingConfig.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(tracker);
        set.add(csi);
        set.add(reportingConfig);
    }

    public ation()
    {
        super("com.google.android.apps.wallet.analytics.AnalyticsUtil", "members/com.google.android.apps.wallet.analytics.AnalyticsUtil", true, com/google/android/apps/wallet/analytics/AnalyticsUtil);
    }
}
