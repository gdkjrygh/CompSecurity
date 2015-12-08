// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.tracks;

import android.content.Context;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.analytics.ScreenProvider;
import com.soundcloud.android.associations.RepostOperations;
import com.soundcloud.android.likes.LikeOperations;
import com.soundcloud.android.playback.PlaybackInitiator;
import com.soundcloud.android.playback.ui.view.PlaybackToastHelper;
import com.soundcloud.android.playlists.PlaylistOperations;
import com.soundcloud.android.properties.FeatureFlags;
import com.soundcloud.android.share.ShareOperations;
import com.soundcloud.android.stations.StartStationPresenter;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.tracks:
//            TrackItemMenuPresenter, TrackRepository

public final class I extends b
    implements Provider
{

    private b accountOperations;
    private b context;
    private b dialogBuilder;
    private b eventBus;
    private b featureFlags;
    private b likeOperations;
    private b playbackInitiator;
    private b playbackToastHelper;
    private b playlistOperations;
    private b popupMenuWrapperFactory;
    private b repostOperations;
    private b screenProvider;
    private b shareOperations;
    private b startStationPresenter;
    private b trackRepository;

    public final void attach(l l1)
    {
        popupMenuWrapperFactory = l1.a("com.soundcloud.android.view.menu.PopupMenuWrapper$Factory", com/soundcloud/android/tracks/TrackItemMenuPresenter, getClass().getClassLoader());
        trackRepository = l1.a("com.soundcloud.android.tracks.TrackRepository", com/soundcloud/android/tracks/TrackItemMenuPresenter, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/tracks/TrackItemMenuPresenter, getClass().getClassLoader());
        context = l1.a("android.content.Context", com/soundcloud/android/tracks/TrackItemMenuPresenter, getClass().getClassLoader());
        likeOperations = l1.a("com.soundcloud.android.likes.LikeOperations", com/soundcloud/android/tracks/TrackItemMenuPresenter, getClass().getClassLoader());
        repostOperations = l1.a("com.soundcloud.android.associations.RepostOperations", com/soundcloud/android/tracks/TrackItemMenuPresenter, getClass().getClassLoader());
        playlistOperations = l1.a("com.soundcloud.android.playlists.PlaylistOperations", com/soundcloud/android/tracks/TrackItemMenuPresenter, getClass().getClassLoader());
        screenProvider = l1.a("com.soundcloud.android.analytics.ScreenProvider", com/soundcloud/android/tracks/TrackItemMenuPresenter, getClass().getClassLoader());
        playbackInitiator = l1.a("com.soundcloud.android.playback.PlaybackInitiator", com/soundcloud/android/tracks/TrackItemMenuPresenter, getClass().getClassLoader());
        playbackToastHelper = l1.a("com.soundcloud.android.playback.ui.view.PlaybackToastHelper", com/soundcloud/android/tracks/TrackItemMenuPresenter, getClass().getClassLoader());
        featureFlags = l1.a("com.soundcloud.android.properties.FeatureFlags", com/soundcloud/android/tracks/TrackItemMenuPresenter, getClass().getClassLoader());
        shareOperations = l1.a("com.soundcloud.android.share.ShareOperations", com/soundcloud/android/tracks/TrackItemMenuPresenter, getClass().getClassLoader());
        dialogBuilder = l1.a("com.soundcloud.android.tracks.DelayedLoadingDialogPresenter$Builder", com/soundcloud/android/tracks/TrackItemMenuPresenter, getClass().getClassLoader());
        startStationPresenter = l1.a("com.soundcloud.android.stations.StartStationPresenter", com/soundcloud/android/tracks/TrackItemMenuPresenter, getClass().getClassLoader());
        accountOperations = l1.a("com.soundcloud.android.accounts.AccountOperations", com/soundcloud/android/tracks/TrackItemMenuPresenter, getClass().getClassLoader());
    }

    public final TrackItemMenuPresenter get()
    {
        return new TrackItemMenuPresenter((com.soundcloud.android.view.menu.ountOperations)popupMenuWrapperFactory.get(), (TrackRepository)trackRepository.get(), (EventBus)eventBus.get(), (Context)context.get(), (LikeOperations)likeOperations.get(), (RepostOperations)repostOperations.get(), (PlaylistOperations)playlistOperations.get(), (ScreenProvider)screenProvider.get(), (PlaybackInitiator)playbackInitiator.get(), (PlaybackToastHelper)playbackToastHelper.get(), (FeatureFlags)featureFlags.get(), (ShareOperations)shareOperations.get(), (shareOperations)dialogBuilder.get(), (StartStationPresenter)startStationPresenter.get(), (AccountOperations)accountOperations.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(popupMenuWrapperFactory);
        set.add(trackRepository);
        set.add(eventBus);
        set.add(context);
        set.add(likeOperations);
        set.add(repostOperations);
        set.add(playlistOperations);
        set.add(screenProvider);
        set.add(playbackInitiator);
        set.add(playbackToastHelper);
        set.add(featureFlags);
        set.add(shareOperations);
        set.add(dialogBuilder);
        set.add(startStationPresenter);
        set.add(accountOperations);
    }

    public I()
    {
        super("com.soundcloud.android.tracks.TrackItemMenuPresenter", "members/com.soundcloud.android.tracks.TrackItemMenuPresenter", false, com/soundcloud/android/tracks/TrackItemMenuPresenter);
    }
}
