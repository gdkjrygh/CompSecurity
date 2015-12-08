// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import com.soundcloud.rx.eventbus.EventBus;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.stations:
//            StationsNowPlayingController

public final class Q extends b
    implements a, Provider
{

    private b eventBus;
    private b supertype;

    public final void attach(l l1)
    {
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/stations/StationsNowPlayingController, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.lightcycle.DefaultSupportFragmentLightCycle", com/soundcloud/android/stations/StationsNowPlayingController, getClass().getClassLoader(), false);
    }

    public final StationsNowPlayingController get()
    {
        StationsNowPlayingController stationsnowplayingcontroller = new StationsNowPlayingController((EventBus)eventBus.get());
        injectMembers(stationsnowplayingcontroller);
        return stationsnowplayingcontroller;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(eventBus);
        set1.add(supertype);
    }

    public final void injectMembers(StationsNowPlayingController stationsnowplayingcontroller)
    {
        supertype.injectMembers(stationsnowplayingcontroller);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((StationsNowPlayingController)obj);
    }

    public Q()
    {
        super("com.soundcloud.android.stations.StationsNowPlayingController", "members/com.soundcloud.android.stations.StationsNowPlayingController", false, com/soundcloud/android/stations/StationsNowPlayingController);
    }
}
