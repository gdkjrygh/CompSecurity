// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.ads.AdsOperations;
import com.soundcloud.android.playback.notification.PlaybackNotificationController;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.Lazy;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playback:
//            PlaybackService, StreamPlayer, PlaybackSessionAnalyticsController

public final class ler extends b
    implements a, Provider
{

    private b accountOperations;
    private b adsOperations;
    private b analyticsController;
    private b eventBus;
    private b playbackNotificationController;
    private b playbackReceiverFactory;
    private b remoteAudioManagerProvider;
    private b streamPlayer;

    public final void attach(l l1)
    {
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/playback/PlaybackService, getClass().getClassLoader());
        accountOperations = l1.a("com.soundcloud.android.accounts.AccountOperations", com/soundcloud/android/playback/PlaybackService, getClass().getClassLoader());
        streamPlayer = l1.a("com.soundcloud.android.playback.StreamPlayer", com/soundcloud/android/playback/PlaybackService, getClass().getClassLoader());
        playbackReceiverFactory = l1.a("com.soundcloud.android.playback.PlaybackReceiver$Factory", com/soundcloud/android/playback/PlaybackService, getClass().getClassLoader());
        remoteAudioManagerProvider = l1.a("dagger.Lazy<com.soundcloud.android.playback.IRemoteAudioManager>", com/soundcloud/android/playback/PlaybackService, getClass().getClassLoader());
        playbackNotificationController = l1.a("com.soundcloud.android.playback.notification.PlaybackNotificationController", com/soundcloud/android/playback/PlaybackService, getClass().getClassLoader());
        analyticsController = l1.a("com.soundcloud.android.playback.PlaybackSessionAnalyticsController", com/soundcloud/android/playback/PlaybackService, getClass().getClassLoader());
        adsOperations = l1.a("com.soundcloud.android.ads.AdsOperations", com/soundcloud/android/playback/PlaybackService, getClass().getClassLoader());
    }

    public final PlaybackService get()
    {
        PlaybackService playbackservice = new PlaybackService();
        injectMembers(playbackservice);
        return playbackservice;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(eventBus);
        set1.add(accountOperations);
        set1.add(streamPlayer);
        set1.add(playbackReceiverFactory);
        set1.add(remoteAudioManagerProvider);
        set1.add(playbackNotificationController);
        set1.add(analyticsController);
        set1.add(adsOperations);
    }

    public final void injectMembers(PlaybackService playbackservice)
    {
        playbackservice.eventBus = (EventBus)eventBus.get();
        playbackservice.accountOperations = (AccountOperations)accountOperations.get();
        playbackservice.streamPlayer = (StreamPlayer)streamPlayer.get();
        playbackservice.playbackReceiverFactory = (rFactory)playbackReceiverFactory.get();
        playbackservice.remoteAudioManagerProvider = (Lazy)remoteAudioManagerProvider.get();
        playbackservice.playbackNotificationController = (PlaybackNotificationController)playbackNotificationController.get();
        playbackservice.analyticsController = (PlaybackSessionAnalyticsController)analyticsController.get();
        playbackservice.adsOperations = (AdsOperations)adsOperations.get();
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((PlaybackService)obj);
    }

    public ler()
    {
        super("com.soundcloud.android.playback.PlaybackService", "members/com.soundcloud.android.playback.PlaybackService", false, com/soundcloud/android/playback/PlaybackService);
    }
}
