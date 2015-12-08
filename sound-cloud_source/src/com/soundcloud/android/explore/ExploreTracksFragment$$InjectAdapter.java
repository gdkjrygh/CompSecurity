// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.explore;

import com.soundcloud.android.actionbar.PullToRefreshController;
import com.soundcloud.android.playback.PlaybackInitiator;
import com.soundcloud.android.presentation.PagingListItemAdapter;
import com.soundcloud.android.view.ListViewController;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.explore:
//            ExploreTracksFragment, ExploreTracksOperations

public final class I extends b
    implements a, Provider
{

    private b adapter;
    private b listViewController;
    private b operations;
    private b playbackInitiator;
    private b pullToRefreshController;
    private b subscriberProvider;
    private b supertype;

    public final void attach(l l1)
    {
        adapter = l1.a("com.soundcloud.android.presentation.PagingListItemAdapter<com.soundcloud.android.tracks.TrackItem>", com/soundcloud/android/explore/ExploreTracksFragment, getClass().getClassLoader());
        playbackInitiator = l1.a("com.soundcloud.android.playback.PlaybackInitiator", com/soundcloud/android/explore/ExploreTracksFragment, getClass().getClassLoader());
        operations = l1.a("com.soundcloud.android.explore.ExploreTracksOperations", com/soundcloud/android/explore/ExploreTracksFragment, getClass().getClassLoader());
        pullToRefreshController = l1.a("com.soundcloud.android.actionbar.PullToRefreshController", com/soundcloud/android/explore/ExploreTracksFragment, getClass().getClassLoader());
        listViewController = l1.a("com.soundcloud.android.view.ListViewController", com/soundcloud/android/explore/ExploreTracksFragment, getClass().getClassLoader());
        subscriberProvider = l1.a("javax.inject.Provider<com.soundcloud.android.playback.ExpandPlayerSubscriber>", com/soundcloud/android/explore/ExploreTracksFragment, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.lightcycle.LightCycleSupportFragment", com/soundcloud/android/explore/ExploreTracksFragment, getClass().getClassLoader(), false);
    }

    public final ExploreTracksFragment get()
    {
        ExploreTracksFragment exploretracksfragment = new ExploreTracksFragment();
        injectMembers(exploretracksfragment);
        return exploretracksfragment;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(adapter);
        set1.add(playbackInitiator);
        set1.add(operations);
        set1.add(pullToRefreshController);
        set1.add(listViewController);
        set1.add(subscriberProvider);
        set1.add(supertype);
    }

    public final void injectMembers(ExploreTracksFragment exploretracksfragment)
    {
        exploretracksfragment.adapter = (PagingListItemAdapter)adapter.get();
        exploretracksfragment.playbackInitiator = (PlaybackInitiator)playbackInitiator.get();
        exploretracksfragment.operations = (ExploreTracksOperations)operations.get();
        exploretracksfragment.pullToRefreshController = (PullToRefreshController)pullToRefreshController.get();
        exploretracksfragment.listViewController = (ListViewController)listViewController.get();
        exploretracksfragment.subscriberProvider = (Provider)subscriberProvider.get();
        supertype.injectMembers(exploretracksfragment);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ExploreTracksFragment)obj);
    }

    public I()
    {
        super("com.soundcloud.android.explore.ExploreTracksFragment", "members/com.soundcloud.android.explore.ExploreTracksFragment", false, com/soundcloud/android/explore/ExploreTracksFragment);
    }
}
