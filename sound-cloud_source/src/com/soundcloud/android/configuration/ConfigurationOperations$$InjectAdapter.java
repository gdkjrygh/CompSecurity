// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.configuration;

import com.soundcloud.android.configuration.experiments.ExperimentOperations;
import com.soundcloud.android.properties.FeatureFlags;
import dagger.Lazy;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;
import rx.R;

// Referenced classes of package com.soundcloud.android.configuration:
//            ConfigurationOperations, FeatureOperations

public final class Q extends b
    implements Provider
{

    private b apiClient;
    private b apiClientRx;
    private b experimentOperations;
    private b featureFlags;
    private b featureOperations;
    private b scheduler;

    public final void attach(l l1)
    {
        apiClientRx = l1.a("dagger.Lazy<com.soundcloud.android.api.ApiClientRx>", com/soundcloud/android/configuration/ConfigurationOperations, getClass().getClassLoader());
        apiClient = l1.a("dagger.Lazy<com.soundcloud.android.api.ApiClient>", com/soundcloud/android/configuration/ConfigurationOperations, getClass().getClassLoader());
        experimentOperations = l1.a("com.soundcloud.android.configuration.experiments.ExperimentOperations", com/soundcloud/android/configuration/ConfigurationOperations, getClass().getClassLoader());
        featureOperations = l1.a("com.soundcloud.android.configuration.FeatureOperations", com/soundcloud/android/configuration/ConfigurationOperations, getClass().getClassLoader());
        featureFlags = l1.a("com.soundcloud.android.properties.FeatureFlags", com/soundcloud/android/configuration/ConfigurationOperations, getClass().getClassLoader());
        scheduler = l1.a("@javax.inject.Named(value=HighPriority)/rx.Scheduler", com/soundcloud/android/configuration/ConfigurationOperations, getClass().getClassLoader());
    }

    public final ConfigurationOperations get()
    {
        return new ConfigurationOperations((Lazy)apiClientRx.get(), (Lazy)apiClient.get(), (ExperimentOperations)experimentOperations.get(), (FeatureOperations)featureOperations.get(), (FeatureFlags)featureFlags.get(), (R)scheduler.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(apiClientRx);
        set.add(apiClient);
        set.add(experimentOperations);
        set.add(featureOperations);
        set.add(featureFlags);
        set.add(scheduler);
    }

    public Q()
    {
        super("com.soundcloud.android.configuration.ConfigurationOperations", "members/com.soundcloud.android.configuration.ConfigurationOperations", false, com/soundcloud/android/configuration/ConfigurationOperations);
    }
}
