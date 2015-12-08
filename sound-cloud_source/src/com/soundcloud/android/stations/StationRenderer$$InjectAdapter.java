// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import android.content.res.Resources;
import com.soundcloud.android.image.ImageOperations;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.stations:
//            StationRenderer, StartStationPresenter

public final class  extends b
    implements Provider
{

    private b imageOperations;
    private b resources;
    private b startStationPresenter;

    public final void attach(l l1)
    {
        imageOperations = l1.a("com.soundcloud.android.image.ImageOperations", com/soundcloud/android/stations/StationRenderer, getClass().getClassLoader());
        resources = l1.a("android.content.res.Resources", com/soundcloud/android/stations/StationRenderer, getClass().getClassLoader());
        startStationPresenter = l1.a("com.soundcloud.android.stations.StartStationPresenter", com/soundcloud/android/stations/StationRenderer, getClass().getClassLoader());
    }

    public final StationRenderer get()
    {
        return new StationRenderer((ImageOperations)imageOperations.get(), (Resources)resources.get(), (StartStationPresenter)startStationPresenter.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(imageOperations);
        set.add(resources);
        set.add(startStationPresenter);
    }

    public ()
    {
        super("com.soundcloud.android.stations.StationRenderer", "members/com.soundcloud.android.stations.StationRenderer", false, com/soundcloud/android/stations/StationRenderer);
    }
}
