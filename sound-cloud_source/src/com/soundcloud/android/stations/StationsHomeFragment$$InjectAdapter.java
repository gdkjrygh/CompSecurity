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
//            StationsHomeFragment, StationsHomePresenter

public final class I extends b
    implements a, Provider
{

    private b eventBus;
    private b stationsHomePresenter;
    private b supertype;

    public final void attach(l l1)
    {
        stationsHomePresenter = l1.a("com.soundcloud.android.stations.StationsHomePresenter", com/soundcloud/android/stations/StationsHomeFragment, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/stations/StationsHomeFragment, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.lightcycle.LightCycleSupportFragment", com/soundcloud/android/stations/StationsHomeFragment, getClass().getClassLoader(), false);
    }

    public final StationsHomeFragment get()
    {
        StationsHomeFragment stationshomefragment = new StationsHomeFragment();
        injectMembers(stationshomefragment);
        return stationshomefragment;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(stationsHomePresenter);
        set1.add(eventBus);
        set1.add(supertype);
    }

    public final void injectMembers(StationsHomeFragment stationshomefragment)
    {
        stationshomefragment.stationsHomePresenter = (StationsHomePresenter)stationsHomePresenter.get();
        stationshomefragment.eventBus = (EventBus)eventBus.get();
        supertype.injectMembers(stationshomefragment);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((StationsHomeFragment)obj);
    }

    public I()
    {
        super("com.soundcloud.android.stations.StationsHomeFragment", "members/com.soundcloud.android.stations.StationsHomeFragment", false, com/soundcloud/android/stations/StationsHomeFragment);
    }
}
