// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;

import com.soundcloud.android.playback.PlayQueueManager;
import com.soundcloud.android.tracks.TrackRepository;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.ads:
//            AdsController, AdsOperations, VisualAdImpressionOperations, AdOverlayImpressionOperations

public final class  extends b
    implements Provider
{

    private b adOverlayImpressionOperations;
    private b adsOperations;
    private b eventBus;
    private b playQueueManager;
    private b trackRepository;
    private b visualAdImpressionOperations;

    public final void attach(l l1)
    {
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/ads/AdsController, getClass().getClassLoader());
        adsOperations = l1.a("com.soundcloud.android.ads.AdsOperations", com/soundcloud/android/ads/AdsController, getClass().getClassLoader());
        visualAdImpressionOperations = l1.a("com.soundcloud.android.ads.VisualAdImpressionOperations", com/soundcloud/android/ads/AdsController, getClass().getClassLoader());
        adOverlayImpressionOperations = l1.a("com.soundcloud.android.ads.AdOverlayImpressionOperations", com/soundcloud/android/ads/AdsController, getClass().getClassLoader());
        playQueueManager = l1.a("com.soundcloud.android.playback.PlayQueueManager", com/soundcloud/android/ads/AdsController, getClass().getClassLoader());
        trackRepository = l1.a("com.soundcloud.android.tracks.TrackRepository", com/soundcloud/android/ads/AdsController, getClass().getClassLoader());
    }

    public final AdsController get()
    {
        return new AdsController((EventBus)eventBus.get(), (AdsOperations)adsOperations.get(), (VisualAdImpressionOperations)visualAdImpressionOperations.get(), (AdOverlayImpressionOperations)adOverlayImpressionOperations.get(), (PlayQueueManager)playQueueManager.get(), (TrackRepository)trackRepository.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(eventBus);
        set.add(adsOperations);
        set.add(visualAdImpressionOperations);
        set.add(adOverlayImpressionOperations);
        set.add(playQueueManager);
        set.add(trackRepository);
    }

    public ()
    {
        super("com.soundcloud.android.ads.AdsController", "members/com.soundcloud.android.ads.AdsController", true, com/soundcloud/android/ads/AdsController);
    }
}
