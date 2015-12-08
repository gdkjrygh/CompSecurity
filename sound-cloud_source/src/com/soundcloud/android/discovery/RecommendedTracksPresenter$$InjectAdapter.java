// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.discovery;

import com.soundcloud.android.playback.PlaybackInitiator;
import com.soundcloud.android.presentation.SwipeRefreshAttacher;
import com.soundcloud.android.view.adapters.TracksRecyclerItemAdapter;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.discovery:
//            RecommendedTracksPresenter, DiscoveryOperations

public final class  extends b
    implements a, Provider
{

    private b adapter;
    private b discoveryOperations;
    private b eventBus;
    private b playbackInitiator;
    private b subscriberProvider;
    private b supertype;
    private b swipeRefreshAttacher;

    public final void attach(l l1)
    {
        swipeRefreshAttacher = l1.a("com.soundcloud.android.presentation.SwipeRefreshAttacher", com/soundcloud/android/discovery/RecommendedTracksPresenter, getClass().getClassLoader());
        discoveryOperations = l1.a("com.soundcloud.android.discovery.DiscoveryOperations", com/soundcloud/android/discovery/RecommendedTracksPresenter, getClass().getClassLoader());
        adapter = l1.a("com.soundcloud.android.view.adapters.TracksRecyclerItemAdapter", com/soundcloud/android/discovery/RecommendedTracksPresenter, getClass().getClassLoader());
        subscriberProvider = l1.a("javax.inject.Provider<com.soundcloud.android.playback.ExpandPlayerSubscriber>", com/soundcloud/android/discovery/RecommendedTracksPresenter, getClass().getClassLoader());
        playbackInitiator = l1.a("com.soundcloud.android.playback.PlaybackInitiator", com/soundcloud/android/discovery/RecommendedTracksPresenter, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/discovery/RecommendedTracksPresenter, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.presentation.RecyclerViewPresenter", com/soundcloud/android/discovery/RecommendedTracksPresenter, getClass().getClassLoader(), false);
    }

    public final RecommendedTracksPresenter get()
    {
        RecommendedTracksPresenter recommendedtrackspresenter = new RecommendedTracksPresenter((SwipeRefreshAttacher)swipeRefreshAttacher.get(), (DiscoveryOperations)discoveryOperations.get(), (TracksRecyclerItemAdapter)adapter.get(), (Provider)subscriberProvider.get(), (PlaybackInitiator)playbackInitiator.get(), (EventBus)eventBus.get());
        injectMembers(recommendedtrackspresenter);
        return recommendedtrackspresenter;
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
        set.add(eventBus);
        set1.add(supertype);
    }

    public final void injectMembers(RecommendedTracksPresenter recommendedtrackspresenter)
    {
        supertype.injectMembers(recommendedtrackspresenter);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((RecommendedTracksPresenter)obj);
    }

    public ()
    {
        super("com.soundcloud.android.discovery.RecommendedTracksPresenter", "members/com.soundcloud.android.discovery.RecommendedTracksPresenter", false, com/soundcloud/android/discovery/RecommendedTracksPresenter);
    }
}
