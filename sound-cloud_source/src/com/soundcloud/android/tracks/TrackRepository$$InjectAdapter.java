// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.tracks;

import com.soundcloud.android.sync.SyncInitiator;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;
import rx.R;

// Referenced classes of package com.soundcloud.android.tracks:
//            TrackRepository, TrackStorage

public final class  extends b
    implements Provider
{

    private b eventBus;
    private b scheduler;
    private b syncInitiator;
    private b trackStorage;

    public final void attach(l l1)
    {
        trackStorage = l1.a("com.soundcloud.android.tracks.TrackStorage", com/soundcloud/android/tracks/TrackRepository, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/tracks/TrackRepository, getClass().getClassLoader());
        syncInitiator = l1.a("com.soundcloud.android.sync.SyncInitiator", com/soundcloud/android/tracks/TrackRepository, getClass().getClassLoader());
        scheduler = l1.a("@javax.inject.Named(value=HighPriority)/rx.Scheduler", com/soundcloud/android/tracks/TrackRepository, getClass().getClassLoader());
    }

    public final TrackRepository get()
    {
        return new TrackRepository((TrackStorage)trackStorage.get(), (EventBus)eventBus.get(), (SyncInitiator)syncInitiator.get(), (R)scheduler.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(trackStorage);
        set.add(eventBus);
        set.add(syncInitiator);
        set.add(scheduler);
    }

    public ()
    {
        super("com.soundcloud.android.tracks.TrackRepository", "members/com.soundcloud.android.tracks.TrackRepository", false, com/soundcloud/android/tracks/TrackRepository);
    }
}
