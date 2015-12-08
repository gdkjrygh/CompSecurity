// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import com.soundcloud.android.ads.AdsOperations;
import com.soundcloud.android.playback.PlayQueueManager;
import com.soundcloud.android.playback.ui.view.PlaybackToastHelper;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            PlayerPagerScrollListener

public final class Q extends b
    implements Provider
{

    private b adsOperations;
    private b eventBus;
    private b playQueueManager;
    private b playbackToastHelper;

    public final void attach(l l1)
    {
        playQueueManager = l1.a("com.soundcloud.android.playback.PlayQueueManager", com/soundcloud/android/playback/ui/PlayerPagerScrollListener, getClass().getClassLoader());
        playbackToastHelper = l1.a("com.soundcloud.android.playback.ui.view.PlaybackToastHelper", com/soundcloud/android/playback/ui/PlayerPagerScrollListener, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/playback/ui/PlayerPagerScrollListener, getClass().getClassLoader());
        adsOperations = l1.a("com.soundcloud.android.ads.AdsOperations", com/soundcloud/android/playback/ui/PlayerPagerScrollListener, getClass().getClassLoader());
    }

    public final PlayerPagerScrollListener get()
    {
        return new PlayerPagerScrollListener((PlayQueueManager)playQueueManager.get(), (PlaybackToastHelper)playbackToastHelper.get(), (EventBus)eventBus.get(), (AdsOperations)adsOperations.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(playQueueManager);
        set.add(playbackToastHelper);
        set.add(eventBus);
        set.add(adsOperations);
    }

    public Q()
    {
        super("com.soundcloud.android.playback.ui.PlayerPagerScrollListener", "members/com.soundcloud.android.playback.ui.PlayerPagerScrollListener", false, com/soundcloud/android/playback/ui/PlayerPagerScrollListener);
    }
}
