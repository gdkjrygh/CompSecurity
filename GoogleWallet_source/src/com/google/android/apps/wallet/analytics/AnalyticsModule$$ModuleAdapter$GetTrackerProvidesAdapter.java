// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.analytics;

import android.app.Application;
import com.google.android.gms.analytics.Tracker;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.analytics:
//            AnalyticsModule

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding application;
    private final AnalyticsModule module;

    public final void attach(Linker linker)
    {
        application = linker.requestBinding("android.app.Application", com/google/android/apps/wallet/analytics/AnalyticsModule, getClass().getClassLoader());
    }

    public final Tracker get()
    {
        AnalyticsModule analyticsmodule = module;
        return AnalyticsModule.getTracker((Application)application.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(application);
    }

    public (AnalyticsModule analyticsmodule)
    {
        super("com.google.android.gms.analytics.Tracker", true, "com.google.android.apps.wallet.analytics.AnalyticsModule", "getTracker");
        module = analyticsmodule;
        setLibrary(true);
    }
}
