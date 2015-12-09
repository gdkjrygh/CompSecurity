// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.analytics;

import android.app.Activity;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.analytics:
//            AnalyticsFilter, AnalyticsUtil

public final class  extends Binding
    implements Provider
{

    private Binding activity;
    private Binding analyticsUtil;

    public final void attach(Linker linker)
    {
        activity = linker.requestBinding("android.app.Activity", com/google/android/apps/wallet/analytics/AnalyticsFilter, getClass().getClassLoader());
        analyticsUtil = linker.requestBinding("com.google.android.apps.wallet.analytics.AnalyticsUtil", com/google/android/apps/wallet/analytics/AnalyticsFilter, getClass().getClassLoader());
    }

    public final AnalyticsFilter get()
    {
        return new AnalyticsFilter((Activity)activity.get(), (AnalyticsUtil)analyticsUtil.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(activity);
        set.add(analyticsUtil);
    }

    public ()
    {
        super("com.google.android.apps.wallet.analytics.AnalyticsFilter", "members/com.google.android.apps.wallet.analytics.AnalyticsFilter", false, com/google/android/apps/wallet/analytics/AnalyticsFilter);
    }
}
