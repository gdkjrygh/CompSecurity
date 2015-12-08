// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.ads.AdsOperations;
import com.soundcloud.android.tracks.TrackRepository;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playback:
//            PlaybackSessionAnalyticsController, PlayQueueManager

public final class  extends b
    implements Provider
{

    private b accountOperations;
    private b adsOperations;
    private b eventBus;
    private b playQueueManager;
    private b trackRepository;

    public final void attach(l l1)
    {
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/playback/PlaybackSessionAnalyticsController, getClass().getClassLoader());
        trackRepository = l1.a("com.soundcloud.android.tracks.TrackRepository", com/soundcloud/android/playback/PlaybackSessionAnalyticsController, getClass().getClassLoader());
        accountOperations = l1.a("com.soundcloud.android.accounts.AccountOperations", com/soundcloud/android/playback/PlaybackSessionAnalyticsController, getClass().getClassLoader());
        playQueueManager = l1.a("com.soundcloud.android.playback.PlayQueueManager", com/soundcloud/android/playback/PlaybackSessionAnalyticsController, getClass().getClassLoader());
        adsOperations = l1.a("com.soundcloud.android.ads.AdsOperations", com/soundcloud/android/playback/PlaybackSessionAnalyticsController, getClass().getClassLoader());
    }

    public final PlaybackSessionAnalyticsController get()
    {
        return new PlaybackSessionAnalyticsController((EventBus)eventBus.get(), (TrackRepository)trackRepository.get(), (AccountOperations)accountOperations.get(), (PlayQueueManager)playQueueManager.get(), (AdsOperations)adsOperations.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(eventBus);
        set.add(trackRepository);
        set.add(accountOperations);
        set.add(playQueueManager);
        set.add(adsOperations);
    }

    public ()
    {
        super("com.soundcloud.android.playback.PlaybackSessionAnalyticsController", "members/com.soundcloud.android.playback.PlaybackSessionAnalyticsController", false, com/soundcloud/android/playback/PlaybackSessionAnalyticsController);
    }
}
