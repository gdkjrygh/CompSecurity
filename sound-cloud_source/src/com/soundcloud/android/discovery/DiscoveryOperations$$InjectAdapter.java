// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.discovery;

import com.soundcloud.android.search.PlaylistDiscoveryOperations;
import com.soundcloud.android.sync.recommendations.StoreRecommendationsCommand;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;
import rx.R;

// Referenced classes of package com.soundcloud.android.discovery:
//            DiscoveryOperations, DiscoverySyncer, RecommendationsStorage

public final class and extends b
    implements Provider
{

    private b discoverySyncer;
    private b playlistDiscoveryOperations;
    private b recommendationsStorage;
    private b scheduler;
    private b storeRecommendationsCommand;

    public final void attach(l l1)
    {
        discoverySyncer = l1.a("com.soundcloud.android.discovery.DiscoverySyncer", com/soundcloud/android/discovery/DiscoveryOperations, getClass().getClassLoader());
        recommendationsStorage = l1.a("com.soundcloud.android.discovery.RecommendationsStorage", com/soundcloud/android/discovery/DiscoveryOperations, getClass().getClassLoader());
        storeRecommendationsCommand = l1.a("com.soundcloud.android.sync.recommendations.StoreRecommendationsCommand", com/soundcloud/android/discovery/DiscoveryOperations, getClass().getClassLoader());
        playlistDiscoveryOperations = l1.a("com.soundcloud.android.search.PlaylistDiscoveryOperations", com/soundcloud/android/discovery/DiscoveryOperations, getClass().getClassLoader());
        scheduler = l1.a("@javax.inject.Named(value=HighPriority)/rx.Scheduler", com/soundcloud/android/discovery/DiscoveryOperations, getClass().getClassLoader());
    }

    public final DiscoveryOperations get()
    {
        return new DiscoveryOperations((DiscoverySyncer)discoverySyncer.get(), (RecommendationsStorage)recommendationsStorage.get(), (StoreRecommendationsCommand)storeRecommendationsCommand.get(), (PlaylistDiscoveryOperations)playlistDiscoveryOperations.get(), (R)scheduler.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(discoverySyncer);
        set.add(recommendationsStorage);
        set.add(storeRecommendationsCommand);
        set.add(playlistDiscoveryOperations);
        set.add(scheduler);
    }

    public and()
    {
        super("com.soundcloud.android.discovery.DiscoveryOperations", "members/com.soundcloud.android.discovery.DiscoveryOperations", false, com/soundcloud/android/discovery/DiscoveryOperations);
    }
}
