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
//            StationsAdapter, StationRenderer

public final class  extends b
    implements a, Provider
{

    private b renderer;
    private b supertype;

    public final void attach(l l1)
    {
        renderer = l1.a("com.soundcloud.android.stations.StationRenderer", com/soundcloud/android/stations/StationsAdapter, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.presentation.RecyclerItemAdapter", com/soundcloud/android/stations/StationsAdapter, getClass().getClassLoader(), false);
    }

    public final StationsAdapter get()
    {
        StationsAdapter stationsadapter = new StationsAdapter((StationRenderer)renderer.get());
        injectMembers(stationsadapter);
        return stationsadapter;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(renderer);
        set1.add(supertype);
    }

    public final void injectMembers(StationsAdapter stationsadapter)
    {
        supertype.injectMembers(stationsadapter);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((StationsAdapter)obj);
    }

    public ()
    {
        super("com.soundcloud.android.stations.StationsAdapter", "members/com.soundcloud.android.stations.StationsAdapter", false, com/soundcloud/android/stations/StationsAdapter);
    }
}
