// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;

import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.playback.PlayQueueManager;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.ads:
//            VisualAdImpressionOperations, AdsOperations

public final class  extends b
    implements Provider
{

    private b accountOperations;
    private b adsOperations;
    private b eventBus;
    private b playQueueManager;

    public final void attach(l l1)
    {
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/ads/VisualAdImpressionOperations, getClass().getClassLoader());
        playQueueManager = l1.a("com.soundcloud.android.playback.PlayQueueManager", com/soundcloud/android/ads/VisualAdImpressionOperations, getClass().getClassLoader());
        accountOperations = l1.a("com.soundcloud.android.accounts.AccountOperations", com/soundcloud/android/ads/VisualAdImpressionOperations, getClass().getClassLoader());
        adsOperations = l1.a("com.soundcloud.android.ads.AdsOperations", com/soundcloud/android/ads/VisualAdImpressionOperations, getClass().getClassLoader());
    }

    public final VisualAdImpressionOperations get()
    {
        return new VisualAdImpressionOperations((EventBus)eventBus.get(), (PlayQueueManager)playQueueManager.get(), (AccountOperations)accountOperations.get(), (AdsOperations)adsOperations.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(eventBus);
        set.add(playQueueManager);
        set.add(accountOperations);
        set.add(adsOperations);
    }

    public ()
    {
        super("com.soundcloud.android.ads.VisualAdImpressionOperations", "members/com.soundcloud.android.ads.VisualAdImpressionOperations", false, com/soundcloud/android/ads/VisualAdImpressionOperations);
    }
}
