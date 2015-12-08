// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import com.soundcloud.rx.eventbus.EventBus;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.stations:
//            StationsSyncRequestFactory, StationsSyncer

public final class  extends b
    implements Provider
{

    private b eventBus;
    private b syncer;

    public final void attach(l l1)
    {
        syncer = l1.a("com.soundcloud.android.stations.StationsSyncer", com/soundcloud/android/stations/StationsSyncRequestFactory, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/stations/StationsSyncRequestFactory, getClass().getClassLoader());
    }

    public final StationsSyncRequestFactory get()
    {
        return new StationsSyncRequestFactory((StationsSyncer)syncer.get(), (EventBus)eventBus.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(syncer);
        set.add(eventBus);
    }

    public ()
    {
        super("com.soundcloud.android.stations.StationsSyncRequestFactory", "members/com.soundcloud.android.stations.StationsSyncRequestFactory", false, com/soundcloud/android/stations/StationsSyncRequestFactory);
    }
}
