// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import com.soundcloud.android.ads.AdsOperations;
import com.soundcloud.android.playback.PlayQueueManager;
import com.soundcloud.android.playback.PlaySessionController;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            PlayerPresenter, PlayerPagerPresenter, PlayerPagerScrollListener

public final class  extends b
    implements a, Provider
{

    private b adsOperations;
    private b eventBus;
    private b playQueueDataSwitcherProvider;
    private b playQueueManager;
    private b playSessionController;
    private b playerPagerScrollListener;
    private b presenter;
    private b supertype;

    public final void attach(l l1)
    {
        presenter = l1.a("com.soundcloud.android.playback.ui.PlayerPagerPresenter", com/soundcloud/android/playback/ui/PlayerPresenter, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/playback/ui/PlayerPresenter, getClass().getClassLoader());
        playQueueManager = l1.a("com.soundcloud.android.playback.PlayQueueManager", com/soundcloud/android/playback/ui/PlayerPresenter, getClass().getClassLoader());
        playSessionController = l1.a("com.soundcloud.android.playback.PlaySessionController", com/soundcloud/android/playback/ui/PlayerPresenter, getClass().getClassLoader());
        playQueueDataSwitcherProvider = l1.a("javax.inject.Provider<com.soundcloud.android.playback.ui.PlayQueueDataSource>", com/soundcloud/android/playback/ui/PlayerPresenter, getClass().getClassLoader());
        playerPagerScrollListener = l1.a("com.soundcloud.android.playback.ui.PlayerPagerScrollListener", com/soundcloud/android/playback/ui/PlayerPresenter, getClass().getClassLoader());
        adsOperations = l1.a("com.soundcloud.android.ads.AdsOperations", com/soundcloud/android/playback/ui/PlayerPresenter, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.lightcycle.SupportFragmentLightCycleDispatcher", com/soundcloud/android/playback/ui/PlayerPresenter, getClass().getClassLoader(), false);
    }

    public final PlayerPresenter get()
    {
        PlayerPresenter playerpresenter = new PlayerPresenter((PlayerPagerPresenter)presenter.get(), (EventBus)eventBus.get(), (PlayQueueManager)playQueueManager.get(), (PlaySessionController)playSessionController.get(), (Provider)playQueueDataSwitcherProvider.get(), (PlayerPagerScrollListener)playerPagerScrollListener.get(), (AdsOperations)adsOperations.get());
        injectMembers(playerpresenter);
        return playerpresenter;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(presenter);
        set.add(eventBus);
        set.add(playQueueManager);
        set.add(playSessionController);
        set.add(playQueueDataSwitcherProvider);
        set.add(playerPagerScrollListener);
        set.add(adsOperations);
        set1.add(supertype);
    }

    public final void injectMembers(PlayerPresenter playerpresenter)
    {
        supertype.injectMembers(playerpresenter);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((PlayerPresenter)obj);
    }

    public ()
    {
        super("com.soundcloud.android.playback.ui.PlayerPresenter", "members/com.soundcloud.android.playback.ui.PlayerPresenter", false, com/soundcloud/android/playback/ui/PlayerPresenter);
    }
}
