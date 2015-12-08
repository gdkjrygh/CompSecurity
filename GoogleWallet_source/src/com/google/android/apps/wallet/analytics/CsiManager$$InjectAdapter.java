// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.analytics;

import com.google.android.apps.common.csi.lib.Reporter;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.analytics:
//            CsiManager, ClientTimingReportingConfiguration

public final class guration extends Binding
    implements Provider
{

    private Binding reporter;
    private Binding reportingConfig;

    public final void attach(Linker linker)
    {
        reporter = linker.requestBinding("com.google.android.apps.common.csi.lib.Reporter", com/google/android/apps/wallet/analytics/CsiManager, getClass().getClassLoader());
        reportingConfig = linker.requestBinding("com.google.android.apps.wallet.analytics.ClientTimingReportingConfiguration", com/google/android/apps/wallet/analytics/CsiManager, getClass().getClassLoader());
    }

    public final CsiManager get()
    {
        return new CsiManager((Reporter)reporter.get(), (ClientTimingReportingConfiguration)reportingConfig.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(reporter);
        set.add(reportingConfig);
    }

    public guration()
    {
        super("com.google.android.apps.wallet.analytics.CsiManager", "members/com.google.android.apps.wallet.analytics.CsiManager", true, com/google/android/apps/wallet/analytics/CsiManager);
    }
}
