// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.analytics;

import com.google.android.apps.common.csi.lib.Reporter;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import java.util.concurrent.Executor;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.analytics:
//            AnalyticsModule

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding executor;
    private final AnalyticsModule module;
    private Binding userAgent;

    public final void attach(Linker linker)
    {
        executor = linker.requestBinding("@com.google.android.apps.wallet.util.async.BindingAnnotations$Sequential()/java.util.concurrent.Executor", com/google/android/apps/wallet/analytics/AnalyticsModule, getClass().getClassLoader());
        userAgent = linker.requestBinding("@com.google.android.apps.wallet.http.BindingAnnotations$UserAgent()/java.lang.String", com/google/android/apps/wallet/analytics/AnalyticsModule, getClass().getClassLoader());
    }

    public final Reporter get()
    {
        AnalyticsModule analyticsmodule = module;
        return AnalyticsModule.getReporter((Executor)executor.get(), (String)userAgent.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(executor);
        set.add(userAgent);
    }

    public (AnalyticsModule analyticsmodule)
    {
        super("com.google.android.apps.common.csi.lib.Reporter", true, "com.google.android.apps.wallet.analytics.AnalyticsModule", "getReporter");
        module = analyticsmodule;
        setLibrary(true);
    }
}
