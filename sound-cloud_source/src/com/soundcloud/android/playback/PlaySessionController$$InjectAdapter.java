// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import android.content.SharedPreferences;
import android.content.res.Resources;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.ads.AdsController;
import com.soundcloud.android.ads.AdsOperations;
import com.soundcloud.android.cast.CastConnectionHelper;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.playback.ui.view.PlaybackToastHelper;
import com.soundcloud.android.stations.StationsOperations;
import com.soundcloud.android.tracks.TrackRepository;
import com.soundcloud.android.utils.NetworkConnectionHelper;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.Lazy;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playback:
//            PlaySessionController, PlayQueueManager, PlayQueueOperations, PlaySessionStateProvider

public final class  extends b
    implements Provider
{

    private b accountOperations;
    private b adsController;
    private b adsOperations;
    private b audioManager;
    private b castConnectionHelper;
    private b connectionHelper;
    private b eventBus;
    private b imageOperations;
    private b playQueueManager;
    private b playQueueOperations;
    private b playSessionStateProvider;
    private b playbackStrategyProvider;
    private b playbackToastHelper;
    private b resources;
    private b sharedPreferences;
    private b stationsOperations;
    private b trackRepository;

    public final void attach(l l1)
    {
        resources = l1.a("android.content.res.Resources", com/soundcloud/android/playback/PlaySessionController, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/playback/PlaySessionController, getClass().getClassLoader());
        adsOperations = l1.a("com.soundcloud.android.ads.AdsOperations", com/soundcloud/android/playback/PlaySessionController, getClass().getClassLoader());
        adsController = l1.a("com.soundcloud.android.ads.AdsController", com/soundcloud/android/playback/PlaySessionController, getClass().getClassLoader());
        playQueueManager = l1.a("com.soundcloud.android.playback.PlayQueueManager", com/soundcloud/android/playback/PlaySessionController, getClass().getClassLoader());
        trackRepository = l1.a("com.soundcloud.android.tracks.TrackRepository", com/soundcloud/android/playback/PlaySessionController, getClass().getClassLoader());
        audioManager = l1.a("dagger.Lazy<com.soundcloud.android.playback.IRemoteAudioManager>", com/soundcloud/android/playback/PlaySessionController, getClass().getClassLoader());
        playQueueOperations = l1.a("com.soundcloud.android.playback.PlayQueueOperations", com/soundcloud/android/playback/PlaySessionController, getClass().getClassLoader());
        imageOperations = l1.a("com.soundcloud.android.image.ImageOperations", com/soundcloud/android/playback/PlaySessionController, getClass().getClassLoader());
        playSessionStateProvider = l1.a("com.soundcloud.android.playback.PlaySessionStateProvider", com/soundcloud/android/playback/PlaySessionController, getClass().getClassLoader());
        castConnectionHelper = l1.a("com.soundcloud.android.cast.CastConnectionHelper", com/soundcloud/android/playback/PlaySessionController, getClass().getClassLoader());
        sharedPreferences = l1.a("android.content.SharedPreferences", com/soundcloud/android/playback/PlaySessionController, getClass().getClassLoader());
        connectionHelper = l1.a("com.soundcloud.android.utils.NetworkConnectionHelper", com/soundcloud/android/playback/PlaySessionController, getClass().getClassLoader());
        playbackStrategyProvider = l1.a("javax.inject.Provider<com.soundcloud.android.playback.PlaybackStrategy>", com/soundcloud/android/playback/PlaySessionController, getClass().getClassLoader());
        playbackToastHelper = l1.a("com.soundcloud.android.playback.ui.view.PlaybackToastHelper", com/soundcloud/android/playback/PlaySessionController, getClass().getClassLoader());
        accountOperations = l1.a("com.soundcloud.android.accounts.AccountOperations", com/soundcloud/android/playback/PlaySessionController, getClass().getClassLoader());
        stationsOperations = l1.a("com.soundcloud.android.stations.StationsOperations", com/soundcloud/android/playback/PlaySessionController, getClass().getClassLoader());
    }

    public final PlaySessionController get()
    {
        return new PlaySessionController((Resources)resources.get(), (EventBus)eventBus.get(), (AdsOperations)adsOperations.get(), (AdsController)adsController.get(), (PlayQueueManager)playQueueManager.get(), (TrackRepository)trackRepository.get(), (Lazy)audioManager.get(), (PlayQueueOperations)playQueueOperations.get(), (ImageOperations)imageOperations.get(), (PlaySessionStateProvider)playSessionStateProvider.get(), (CastConnectionHelper)castConnectionHelper.get(), (SharedPreferences)sharedPreferences.get(), (NetworkConnectionHelper)connectionHelper.get(), (Provider)playbackStrategyProvider.get(), (PlaybackToastHelper)playbackToastHelper.get(), (AccountOperations)accountOperations.get(), (StationsOperations)stationsOperations.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(resources);
        set.add(eventBus);
        set.add(adsOperations);
        set.add(adsController);
        set.add(playQueueManager);
        set.add(trackRepository);
        set.add(audioManager);
        set.add(playQueueOperations);
        set.add(imageOperations);
        set.add(playSessionStateProvider);
        set.add(castConnectionHelper);
        set.add(sharedPreferences);
        set.add(connectionHelper);
        set.add(playbackStrategyProvider);
        set.add(playbackToastHelper);
        set.add(accountOperations);
        set.add(stationsOperations);
    }

    public ()
    {
        super("com.soundcloud.android.playback.PlaySessionController", "members/com.soundcloud.android.playback.PlaySessionController", true, com/soundcloud/android/playback/PlaySessionController);
    }
}
