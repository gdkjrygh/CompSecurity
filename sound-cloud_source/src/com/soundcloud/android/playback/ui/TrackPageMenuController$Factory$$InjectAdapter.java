// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import com.soundcloud.android.associations.RepostOperations;
import com.soundcloud.android.playback.PlayQueueManager;
import com.soundcloud.android.properties.FeatureFlags;
import com.soundcloud.android.share.ShareOperations;
import com.soundcloud.android.stations.StartStationPresenter;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

public final class  extends b
    implements Provider
{

    private b eventBus;
    private b featureFlags;
    private b playQueueManager;
    private b popupMenuWrapperFactory;
    private b repostOperations;
    private b shareOperations;
    private b startStationPresenter;

    public final void attach(l l1)
    {
        featureFlags = l1.a("com.soundcloud.android.properties.FeatureFlags", com/soundcloud/android/playback/ui/TrackPageMenuController$Factory, getClass().getClassLoader());
        playQueueManager = l1.a("com.soundcloud.android.playback.PlayQueueManager", com/soundcloud/android/playback/ui/TrackPageMenuController$Factory, getClass().getClassLoader());
        repostOperations = l1.a("com.soundcloud.android.associations.RepostOperations", com/soundcloud/android/playback/ui/TrackPageMenuController$Factory, getClass().getClassLoader());
        popupMenuWrapperFactory = l1.a("com.soundcloud.android.view.menu.PopupMenuWrapper$Factory", com/soundcloud/android/playback/ui/TrackPageMenuController$Factory, getClass().getClassLoader());
        startStationPresenter = l1.a("com.soundcloud.android.stations.StartStationPresenter", com/soundcloud/android/playback/ui/TrackPageMenuController$Factory, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/playback/ui/TrackPageMenuController$Factory, getClass().getClassLoader());
        shareOperations = l1.a("com.soundcloud.android.share.ShareOperations", com/soundcloud/android/playback/ui/TrackPageMenuController$Factory, getClass().getClassLoader());
    }

    public final shareOperations get()
    {
        return new shareOperations((FeatureFlags)featureFlags.get(), (PlayQueueManager)playQueueManager.get(), (RepostOperations)repostOperations.get(), (com.soundcloud.android.view.menu.r.repostOperations)popupMenuWrapperFactory.get(), (StartStationPresenter)startStationPresenter.get(), (EventBus)eventBus.get(), (ShareOperations)shareOperations.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(featureFlags);
        set.add(playQueueManager);
        set.add(repostOperations);
        set.add(popupMenuWrapperFactory);
        set.add(startStationPresenter);
        set.add(eventBus);
        set.add(shareOperations);
    }

    public ()
    {
        super("com.soundcloud.android.playback.ui.TrackPageMenuController$Factory", "members/com.soundcloud.android.playback.ui.TrackPageMenuController$Factory", false, com/soundcloud/android/playback/ui/TrackPageMenuController$Factory);
    }
}
