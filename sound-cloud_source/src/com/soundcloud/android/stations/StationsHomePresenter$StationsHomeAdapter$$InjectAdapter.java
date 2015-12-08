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
//            StationsBucketRenderer

public final class  extends b
    implements a, Provider
{

    private b renderer;
    private b supertype;

    public final void attach(l l1)
    {
        renderer = l1.a("com.soundcloud.android.stations.StationsBucketRenderer", com/soundcloud/android/stations/StationsHomePresenter$StationsHomeAdapter, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.presentation.RecyclerItemAdapter", com/soundcloud/android/stations/StationsHomePresenter$StationsHomeAdapter, getClass().getClassLoader(), false);
    }

    public final supertype get()
    {
        supertype supertype1 = new supertype((StationsBucketRenderer)renderer.get());
        injectMembers(supertype1);
        return supertype1;
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

    public final void injectMembers(supertype supertype1)
    {
        supertype.injectMembers(supertype1);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((injectMembers)obj);
    }

    public ()
    {
        super("com.soundcloud.android.stations.StationsHomePresenter$StationsHomeAdapter", "members/com.soundcloud.android.stations.StationsHomePresenter$StationsHomeAdapter", false, com/soundcloud/android/stations/StationsHomePresenter$StationsHomeAdapter);
    }
}
