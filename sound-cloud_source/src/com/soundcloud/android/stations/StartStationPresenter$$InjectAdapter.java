// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import com.soundcloud.android.analytics.ScreenProvider;
import com.soundcloud.android.playback.PlaybackInitiator;
import com.soundcloud.android.playback.ui.view.PlaybackToastHelper;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.stations:
//            StartStationPresenter, StationsOperations

public final class  extends b
    implements Provider
{

    private b dialogBuilder;
    private b eventBus;
    private b playbackInitiator;
    private b playbackToastHelper;
    private b screenProvider;
    private b stationsOperations;

    public final void attach(l l1)
    {
        dialogBuilder = l1.a("com.soundcloud.android.tracks.DelayedLoadingDialogPresenter$Builder", com/soundcloud/android/stations/StartStationPresenter, getClass().getClassLoader());
        stationsOperations = l1.a("com.soundcloud.android.stations.StationsOperations", com/soundcloud/android/stations/StartStationPresenter, getClass().getClassLoader());
        playbackInitiator = l1.a("com.soundcloud.android.playback.PlaybackInitiator", com/soundcloud/android/stations/StartStationPresenter, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/stations/StartStationPresenter, getClass().getClassLoader());
        playbackToastHelper = l1.a("com.soundcloud.android.playback.ui.view.PlaybackToastHelper", com/soundcloud/android/stations/StartStationPresenter, getClass().getClassLoader());
        screenProvider = l1.a("com.soundcloud.android.analytics.ScreenProvider", com/soundcloud/android/stations/StartStationPresenter, getClass().getClassLoader());
    }

    public final StartStationPresenter get()
    {
        return new StartStationPresenter((com.soundcloud.android.tracks.)dialogBuilder.get(), (StationsOperations)stationsOperations.get(), (PlaybackInitiator)playbackInitiator.get(), (EventBus)eventBus.get(), (PlaybackToastHelper)playbackToastHelper.get(), (ScreenProvider)screenProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(dialogBuilder);
        set.add(stationsOperations);
        set.add(playbackInitiator);
        set.add(eventBus);
        set.add(playbackToastHelper);
        set.add(screenProvider);
    }

    public ()
    {
        super("com.soundcloud.android.stations.StartStationPresenter", "members/com.soundcloud.android.stations.StartStationPresenter", false, com/soundcloud/android/stations/StartStationPresenter);
    }
}
