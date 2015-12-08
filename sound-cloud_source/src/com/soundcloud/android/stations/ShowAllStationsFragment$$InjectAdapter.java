// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.stations:
//            ShowAllStationsFragment, ShowAllStationsPresenter

public final class  extends b
    implements a, Provider
{

    private b presenter;
    private b supertype;

    public final void attach(l l1)
    {
        presenter = l1.a("com.soundcloud.android.stations.ShowAllStationsPresenter", com/soundcloud/android/stations/ShowAllStationsFragment, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.lightcycle.LightCycleSupportFragment", com/soundcloud/android/stations/ShowAllStationsFragment, getClass().getClassLoader(), false);
    }

    public final ShowAllStationsFragment get()
    {
        ShowAllStationsFragment showallstationsfragment = new ShowAllStationsFragment();
        injectMembers(showallstationsfragment);
        return showallstationsfragment;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(presenter);
        set1.add(supertype);
    }

    public final void injectMembers(ShowAllStationsFragment showallstationsfragment)
    {
        showallstationsfragment.presenter = (ShowAllStationsPresenter)presenter.get();
        supertype.injectMembers(showallstationsfragment);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ShowAllStationsFragment)obj);
    }

    public ()
    {
        super("com.soundcloud.android.stations.ShowAllStationsFragment", "members/com.soundcloud.android.stations.ShowAllStationsFragment", false, com/soundcloud/android/stations/ShowAllStationsFragment);
    }
}
