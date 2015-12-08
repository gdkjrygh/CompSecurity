// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import com.soundcloud.android.Navigator;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.actionbar.PullToRefreshController;
import com.soundcloud.android.configuration.FeatureOperations;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.offline.OfflinePlaybackOperations;
import com.soundcloud.android.playback.PlayQueueManager;
import com.soundcloud.android.playback.PlaySessionController;
import com.soundcloud.android.playback.ui.view.PlaybackToastHelper;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistDetailFragment, PlaylistOperations, PlaylistEngagementsPresenter, PlaylistPresenter

public final class  extends b
    implements a, Provider
{

    private b accountOperations;
    private b controllerProvider;
    private b engagementsPresenter;
    private b eventBus;
    private b expandPlayerSubscriberProvider;
    private b featureOperations;
    private b imageOperations;
    private b navigator;
    private b offlinePlaybackOperations;
    private b playQueueManager;
    private b playSessionController;
    private b playbackToastHelper;
    private b playlistOperations;
    private b playlistPresenter;
    private b pullToRefreshController;
    private b supertype;

    public final void attach(l l1)
    {
        controllerProvider = l1.a("com.soundcloud.android.playlists.PlaylistDetailsController$Provider", com/soundcloud/android/playlists/PlaylistDetailFragment, getClass().getClassLoader());
        playlistOperations = l1.a("com.soundcloud.android.playlists.PlaylistOperations", com/soundcloud/android/playlists/PlaylistDetailFragment, getClass().getClassLoader());
        playSessionController = l1.a("com.soundcloud.android.playback.PlaySessionController", com/soundcloud/android/playlists/PlaylistDetailFragment, getClass().getClassLoader());
        offlinePlaybackOperations = l1.a("com.soundcloud.android.offline.OfflinePlaybackOperations", com/soundcloud/android/playlists/PlaylistDetailFragment, getClass().getClassLoader());
        imageOperations = l1.a("com.soundcloud.android.image.ImageOperations", com/soundcloud/android/playlists/PlaylistDetailFragment, getClass().getClassLoader());
        engagementsPresenter = l1.a("com.soundcloud.android.playlists.PlaylistEngagementsPresenter", com/soundcloud/android/playlists/PlaylistDetailFragment, getClass().getClassLoader());
        pullToRefreshController = l1.a("com.soundcloud.android.actionbar.PullToRefreshController", com/soundcloud/android/playlists/PlaylistDetailFragment, getClass().getClassLoader());
        playQueueManager = l1.a("com.soundcloud.android.playback.PlayQueueManager", com/soundcloud/android/playlists/PlaylistDetailFragment, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/playlists/PlaylistDetailFragment, getClass().getClassLoader());
        playlistPresenter = l1.a("com.soundcloud.android.playlists.PlaylistPresenter", com/soundcloud/android/playlists/PlaylistDetailFragment, getClass().getClassLoader());
        playbackToastHelper = l1.a("com.soundcloud.android.playback.ui.view.PlaybackToastHelper", com/soundcloud/android/playlists/PlaylistDetailFragment, getClass().getClassLoader());
        expandPlayerSubscriberProvider = l1.a("javax.inject.Provider<com.soundcloud.android.playback.ExpandPlayerSubscriber>", com/soundcloud/android/playlists/PlaylistDetailFragment, getClass().getClassLoader());
        accountOperations = l1.a("com.soundcloud.android.accounts.AccountOperations", com/soundcloud/android/playlists/PlaylistDetailFragment, getClass().getClassLoader());
        navigator = l1.a("com.soundcloud.android.Navigator", com/soundcloud/android/playlists/PlaylistDetailFragment, getClass().getClassLoader());
        featureOperations = l1.a("com.soundcloud.android.configuration.FeatureOperations", com/soundcloud/android/playlists/PlaylistDetailFragment, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.lightcycle.LightCycleSupportFragment", com/soundcloud/android/playlists/PlaylistDetailFragment, getClass().getClassLoader(), false);
    }

    public final PlaylistDetailFragment get()
    {
        PlaylistDetailFragment playlistdetailfragment = new PlaylistDetailFragment();
        injectMembers(playlistdetailfragment);
        return playlistdetailfragment;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(controllerProvider);
        set1.add(playlistOperations);
        set1.add(playSessionController);
        set1.add(offlinePlaybackOperations);
        set1.add(imageOperations);
        set1.add(engagementsPresenter);
        set1.add(pullToRefreshController);
        set1.add(playQueueManager);
        set1.add(eventBus);
        set1.add(playlistPresenter);
        set1.add(playbackToastHelper);
        set1.add(expandPlayerSubscriberProvider);
        set1.add(accountOperations);
        set1.add(navigator);
        set1.add(featureOperations);
        set1.add(supertype);
    }

    public final void injectMembers(PlaylistDetailFragment playlistdetailfragment)
    {
        playlistdetailfragment.controllerProvider = (der)controllerProvider.get();
        playlistdetailfragment.playlistOperations = (PlaylistOperations)playlistOperations.get();
        playlistdetailfragment.playSessionController = (PlaySessionController)playSessionController.get();
        playlistdetailfragment.offlinePlaybackOperations = (OfflinePlaybackOperations)offlinePlaybackOperations.get();
        playlistdetailfragment.imageOperations = (ImageOperations)imageOperations.get();
        playlistdetailfragment.engagementsPresenter = (PlaylistEngagementsPresenter)engagementsPresenter.get();
        playlistdetailfragment.pullToRefreshController = (PullToRefreshController)pullToRefreshController.get();
        playlistdetailfragment.playQueueManager = (PlayQueueManager)playQueueManager.get();
        playlistdetailfragment.eventBus = (EventBus)eventBus.get();
        playlistdetailfragment.playlistPresenter = (PlaylistPresenter)playlistPresenter.get();
        playlistdetailfragment.playbackToastHelper = (PlaybackToastHelper)playbackToastHelper.get();
        playlistdetailfragment.expandPlayerSubscriberProvider = (Provider)expandPlayerSubscriberProvider.get();
        playlistdetailfragment.accountOperations = (AccountOperations)accountOperations.get();
        playlistdetailfragment.navigator = (Navigator)navigator.get();
        playlistdetailfragment.featureOperations = (FeatureOperations)featureOperations.get();
        supertype.injectMembers(playlistdetailfragment);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((PlaylistDetailFragment)obj);
    }

    public ()
    {
        super("com.soundcloud.android.playlists.PlaylistDetailFragment", "members/com.soundcloud.android.playlists.PlaylistDetailFragment", false, com/soundcloud/android/playlists/PlaylistDetailFragment);
    }
}
