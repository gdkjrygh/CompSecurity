// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import com.soundcloud.rx.eventbus.EventBus;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;
import rx.R;

// Referenced classes of package com.soundcloud.android.stations:
//            StationsController, StationsOperations

public final class  extends b
    implements Provider
{

    private b eventBus;
    private b operations;
    private b scheduler;

    public final void attach(l l1)
    {
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/stations/StationsController, getClass().getClassLoader());
        operations = l1.a("com.soundcloud.android.stations.StationsOperations", com/soundcloud/android/stations/StationsController, getClass().getClassLoader());
        scheduler = l1.a("@javax.inject.Named(value=HighPriority)/rx.Scheduler", com/soundcloud/android/stations/StationsController, getClass().getClassLoader());
    }

    public final StationsController get()
    {
        return new StationsController((EventBus)eventBus.get(), (StationsOperations)operations.get(), (R)scheduler.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(eventBus);
        set.add(operations);
        set.add(scheduler);
    }

    public ()
    {
        super("com.soundcloud.android.stations.StationsController", "members/com.soundcloud.android.stations.StationsController", false, com/soundcloud/android/stations/StationsController);
    }
}
