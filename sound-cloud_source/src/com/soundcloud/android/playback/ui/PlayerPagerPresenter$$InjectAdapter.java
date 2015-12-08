// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import com.soundcloud.android.cast.CastConnectionHelper;
import com.soundcloud.android.playback.PlayQueueManager;
import com.soundcloud.android.playback.PlaySessionStateProvider;
import com.soundcloud.android.stations.StationsOperations;
import com.soundcloud.android.tracks.TrackRepository;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            PlayerPagerPresenter, TrackPagePresenter, AdPagePresenter, VideoPagePresenter

public final class  extends b
    implements a, Provider
{

    private b adPagePresenter;
    private b castConnectionHelper;
    private b eventBus;
    private b playQueueManager;
    private b playSessionStateProvider;
    private b stationsOperations;
    private b supertype;
    private b trackPagePresenter;
    private b trackRepository;
    private b videoPagePresenter;

    public final void attach(l l1)
    {
        playQueueManager = l1.a("com.soundcloud.android.playback.PlayQueueManager", com/soundcloud/android/playback/ui/PlayerPagerPresenter, getClass().getClassLoader());
        playSessionStateProvider = l1.a("com.soundcloud.android.playback.PlaySessionStateProvider", com/soundcloud/android/playback/ui/PlayerPagerPresenter, getClass().getClassLoader());
        trackRepository = l1.a("com.soundcloud.android.tracks.TrackRepository", com/soundcloud/android/playback/ui/PlayerPagerPresenter, getClass().getClassLoader());
        stationsOperations = l1.a("com.soundcloud.android.stations.StationsOperations", com/soundcloud/android/playback/ui/PlayerPagerPresenter, getClass().getClassLoader());
        trackPagePresenter = l1.a("com.soundcloud.android.playback.ui.TrackPagePresenter", com/soundcloud/android/playback/ui/PlayerPagerPresenter, getClass().getClassLoader());
        adPagePresenter = l1.a("com.soundcloud.android.playback.ui.AdPagePresenter", com/soundcloud/android/playback/ui/PlayerPagerPresenter, getClass().getClassLoader());
        videoPagePresenter = l1.a("com.soundcloud.android.playback.ui.VideoPagePresenter", com/soundcloud/android/playback/ui/PlayerPagerPresenter, getClass().getClassLoader());
        castConnectionHelper = l1.a("com.soundcloud.android.cast.CastConnectionHelper", com/soundcloud/android/playback/ui/PlayerPagerPresenter, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/playback/ui/PlayerPagerPresenter, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.lightcycle.DefaultSupportFragmentLightCycle", com/soundcloud/android/playback/ui/PlayerPagerPresenter, getClass().getClassLoader(), false);
    }

    public final PlayerPagerPresenter get()
    {
        PlayerPagerPresenter playerpagerpresenter = new PlayerPagerPresenter((PlayQueueManager)playQueueManager.get(), (PlaySessionStateProvider)playSessionStateProvider.get(), (TrackRepository)trackRepository.get(), (StationsOperations)stationsOperations.get(), (TrackPagePresenter)trackPagePresenter.get(), (AdPagePresenter)adPagePresenter.get(), (VideoPagePresenter)videoPagePresenter.get(), (CastConnectionHelper)castConnectionHelper.get(), (EventBus)eventBus.get());
        injectMembers(playerpagerpresenter);
        return playerpagerpresenter;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(playQueueManager);
        set.add(playSessionStateProvider);
        set.add(trackRepository);
        set.add(stationsOperations);
        set.add(trackPagePresenter);
        set.add(adPagePresenter);
        set.add(videoPagePresenter);
        set.add(castConnectionHelper);
        set.add(eventBus);
        set1.add(supertype);
    }

    public final void injectMembers(PlayerPagerPresenter playerpagerpresenter)
    {
        supertype.injectMembers(playerpagerpresenter);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((PlayerPagerPresenter)obj);
    }

    public ()
    {
        super("com.soundcloud.android.playback.ui.PlayerPagerPresenter", "members/com.soundcloud.android.playback.ui.PlayerPagerPresenter", false, com/soundcloud/android/playback/ui/PlayerPagerPresenter);
    }
}
