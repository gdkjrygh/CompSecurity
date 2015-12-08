// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android;

import com.soundcloud.android.ads.AdsOperations;
import com.soundcloud.android.cast.CastConnectionHelper;
import com.soundcloud.android.offline.OfflinePlaybackOperations;
import com.soundcloud.android.playback.PlayQueueManager;
import com.soundcloud.android.playback.PlaySessionStateProvider;
import com.soundcloud.android.playback.PlaybackStrategy;
import com.soundcloud.android.tracks.TrackRepository;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.Lazy;
import dagger.a.b;
import dagger.a.l;
import dagger.a.t;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android:
//            ApplicationModule, ServiceInitiator

public static final class setLibrary extends t
    implements Provider
{

    private b adsOperations;
    private b castConnectionHelper;
    private b castPlayer;
    private b eventBus;
    private final ApplicationModule module;
    private b offlinePlaybackOperations;
    private b playQueueManager;
    private b playSessionStateProvider;
    private b serviceInitiator;
    private b trackRepository;

    public final void attach(l l1)
    {
        serviceInitiator = l1.a("com.soundcloud.android.ServiceInitiator", com/soundcloud/android/ApplicationModule, getClass().getClassLoader());
        castConnectionHelper = l1.a("com.soundcloud.android.cast.CastConnectionHelper", com/soundcloud/android/ApplicationModule, getClass().getClassLoader());
        playQueueManager = l1.a("com.soundcloud.android.playback.PlayQueueManager", com/soundcloud/android/ApplicationModule, getClass().getClassLoader());
        castPlayer = l1.a("dagger.Lazy<com.soundcloud.android.cast.CastPlayer>", com/soundcloud/android/ApplicationModule, getClass().getClassLoader());
        trackRepository = l1.a("com.soundcloud.android.tracks.TrackRepository", com/soundcloud/android/ApplicationModule, getClass().getClassLoader());
        adsOperations = l1.a("com.soundcloud.android.ads.AdsOperations", com/soundcloud/android/ApplicationModule, getClass().getClassLoader());
        offlinePlaybackOperations = l1.a("com.soundcloud.android.offline.OfflinePlaybackOperations", com/soundcloud/android/ApplicationModule, getClass().getClassLoader());
        playSessionStateProvider = l1.a("com.soundcloud.android.playback.PlaySessionStateProvider", com/soundcloud/android/ApplicationModule, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/ApplicationModule, getClass().getClassLoader());
    }

    public final PlaybackStrategy get()
    {
        return module.providePlaybackStrategy((ServiceInitiator)serviceInitiator.get(), (CastConnectionHelper)castConnectionHelper.get(), (PlayQueueManager)playQueueManager.get(), (Lazy)castPlayer.get(), (TrackRepository)trackRepository.get(), (AdsOperations)adsOperations.get(), (OfflinePlaybackOperations)offlinePlaybackOperations.get(), (PlaySessionStateProvider)playSessionStateProvider.get(), (EventBus)eventBus.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(serviceInitiator);
        set.add(castConnectionHelper);
        set.add(playQueueManager);
        set.add(castPlayer);
        set.add(trackRepository);
        set.add(adsOperations);
        set.add(offlinePlaybackOperations);
        set.add(playSessionStateProvider);
        set.add(eventBus);
    }

    public (ApplicationModule applicationmodule)
    {
        super("com.soundcloud.android.playback.PlaybackStrategy", false, "com.soundcloud.android.ApplicationModule", "providePlaybackStrategy");
        module = applicationmodule;
        setLibrary(true);
    }
}
