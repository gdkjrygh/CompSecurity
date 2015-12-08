// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import android.content.res.Resources;
import com.soundcloud.android.playback.PlayQueueManager;
import com.soundcloud.android.presentation.SwipeRefreshAttacher;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.stations:
//            StationsHomePresenter, StationsOperations, StationsNowPlayingController

public final class pter extends b
    implements a, Provider
{

    private b adapter;
    private b operations;
    private b playQueueManager;
    private b resources;
    private b stationsNowPlayingController;
    private b supertype;
    private b swipeRefreshAttacher;

    public final void attach(l l1)
    {
        swipeRefreshAttacher = l1.a("com.soundcloud.android.presentation.SwipeRefreshAttacher", com/soundcloud/android/stations/StationsHomePresenter, getClass().getClassLoader());
        resources = l1.a("android.content.res.Resources", com/soundcloud/android/stations/StationsHomePresenter, getClass().getClassLoader());
        operations = l1.a("com.soundcloud.android.stations.StationsOperations", com/soundcloud/android/stations/StationsHomePresenter, getClass().getClassLoader());
        adapter = l1.a("com.soundcloud.android.stations.StationsHomePresenter$StationsHomeAdapter", com/soundcloud/android/stations/StationsHomePresenter, getClass().getClassLoader());
        stationsNowPlayingController = l1.a("com.soundcloud.android.stations.StationsNowPlayingController", com/soundcloud/android/stations/StationsHomePresenter, getClass().getClassLoader());
        playQueueManager = l1.a("com.soundcloud.android.playback.PlayQueueManager", com/soundcloud/android/stations/StationsHomePresenter, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.presentation.RecyclerViewPresenter", com/soundcloud/android/stations/StationsHomePresenter, getClass().getClassLoader(), false);
    }

    public final StationsHomePresenter get()
    {
        StationsHomePresenter stationshomepresenter = new StationsHomePresenter((SwipeRefreshAttacher)swipeRefreshAttacher.get(), (Resources)resources.get(), (StationsOperations)operations.get(), (pter)adapter.get(), (StationsNowPlayingController)stationsNowPlayingController.get(), (PlayQueueManager)playQueueManager.get());
        injectMembers(stationshomepresenter);
        return stationshomepresenter;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(swipeRefreshAttacher);
        set.add(resources);
        set.add(operations);
        set.add(adapter);
        set.add(stationsNowPlayingController);
        set.add(playQueueManager);
        set1.add(supertype);
    }

    public final void injectMembers(StationsHomePresenter stationshomepresenter)
    {
        supertype.injectMembers(stationshomepresenter);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((StationsHomePresenter)obj);
    }

    public pter()
    {
        super("com.soundcloud.android.stations.StationsHomePresenter", "members/com.soundcloud.android.stations.StationsHomePresenter", false, com/soundcloud/android/stations/StationsHomePresenter);
    }
}
