// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.discovery;

import com.soundcloud.android.Navigator;
import com.soundcloud.android.playback.PlaybackInitiator;
import com.soundcloud.android.presentation.SwipeRefreshAttacher;
import com.soundcloud.android.properties.FeatureFlags;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.discovery:
//            DiscoveryPresenter, DiscoveryOperations, DiscoveryAdapter

public final class  extends b
    implements a, Provider
{

    private b adapter;
    private b discoveryOperations;
    private b featureFlags;
    private b navigator;
    private b playbackInitiator;
    private b subscriberProvider;
    private b supertype;
    private b swipeRefreshAttacher;

    public final void attach(l l1)
    {
        swipeRefreshAttacher = l1.a("com.soundcloud.android.presentation.SwipeRefreshAttacher", com/soundcloud/android/discovery/DiscoveryPresenter, getClass().getClassLoader());
        discoveryOperations = l1.a("com.soundcloud.android.discovery.DiscoveryOperations", com/soundcloud/android/discovery/DiscoveryPresenter, getClass().getClassLoader());
        adapter = l1.a("com.soundcloud.android.discovery.DiscoveryAdapter", com/soundcloud/android/discovery/DiscoveryPresenter, getClass().getClassLoader());
        subscriberProvider = l1.a("javax.inject.Provider<com.soundcloud.android.playback.ExpandPlayerSubscriber>", com/soundcloud/android/discovery/DiscoveryPresenter, getClass().getClassLoader());
        playbackInitiator = l1.a("com.soundcloud.android.playback.PlaybackInitiator", com/soundcloud/android/discovery/DiscoveryPresenter, getClass().getClassLoader());
        navigator = l1.a("com.soundcloud.android.Navigator", com/soundcloud/android/discovery/DiscoveryPresenter, getClass().getClassLoader());
        featureFlags = l1.a("com.soundcloud.android.properties.FeatureFlags", com/soundcloud/android/discovery/DiscoveryPresenter, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.presentation.RecyclerViewPresenter", com/soundcloud/android/discovery/DiscoveryPresenter, getClass().getClassLoader(), false);
    }

    public final DiscoveryPresenter get()
    {
        DiscoveryPresenter discoverypresenter = new DiscoveryPresenter((SwipeRefreshAttacher)swipeRefreshAttacher.get(), (DiscoveryOperations)discoveryOperations.get(), (DiscoveryAdapter)adapter.get(), (Provider)subscriberProvider.get(), (PlaybackInitiator)playbackInitiator.get(), (Navigator)navigator.get(), (FeatureFlags)featureFlags.get());
        injectMembers(discoverypresenter);
        return discoverypresenter;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(swipeRefreshAttacher);
        set.add(discoveryOperations);
        set.add(adapter);
        set.add(subscriberProvider);
        set.add(playbackInitiator);
        set.add(navigator);
        set.add(featureFlags);
        set1.add(supertype);
    }

    public final void injectMembers(DiscoveryPresenter discoverypresenter)
    {
        supertype.injectMembers(discoverypresenter);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((DiscoveryPresenter)obj);
    }

    public ()
    {
        super("com.soundcloud.android.discovery.DiscoveryPresenter", "members/com.soundcloud.android.discovery.DiscoveryPresenter", false, com/soundcloud/android/discovery/DiscoveryPresenter);
    }
}
