// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;

import com.soundcloud.android.api.ApiClientRx;
import com.soundcloud.android.commands.StoreTracksCommand;
import com.soundcloud.android.playback.PlayQueueManager;
import com.soundcloud.android.properties.FeatureFlags;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;
import rx.R;

// Referenced classes of package com.soundcloud.android.ads:
//            AdsOperations

public final class  extends b
    implements Provider
{

    private b apiClientRx;
    private b featureFlags;
    private b playQueueManager;
    private b scheduler;
    private b storeTracksCommand;

    public final void attach(l l1)
    {
        storeTracksCommand = l1.a("com.soundcloud.android.commands.StoreTracksCommand", com/soundcloud/android/ads/AdsOperations, getClass().getClassLoader());
        playQueueManager = l1.a("com.soundcloud.android.playback.PlayQueueManager", com/soundcloud/android/ads/AdsOperations, getClass().getClassLoader());
        apiClientRx = l1.a("com.soundcloud.android.api.ApiClientRx", com/soundcloud/android/ads/AdsOperations, getClass().getClassLoader());
        scheduler = l1.a("@javax.inject.Named(value=HighPriority)/rx.Scheduler", com/soundcloud/android/ads/AdsOperations, getClass().getClassLoader());
        featureFlags = l1.a("com.soundcloud.android.properties.FeatureFlags", com/soundcloud/android/ads/AdsOperations, getClass().getClassLoader());
    }

    public final AdsOperations get()
    {
        return new AdsOperations((StoreTracksCommand)storeTracksCommand.get(), (PlayQueueManager)playQueueManager.get(), (ApiClientRx)apiClientRx.get(), (R)scheduler.get(), (FeatureFlags)featureFlags.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(storeTracksCommand);
        set.add(playQueueManager);
        set.add(apiClientRx);
        set.add(scheduler);
        set.add(featureFlags);
    }

    public ()
    {
        super("com.soundcloud.android.ads.AdsOperations", "members/com.soundcloud.android.ads.AdsOperations", false, com/soundcloud/android/ads/AdsOperations);
    }
}
