// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.entities;

import com.soundcloud.rx.eventbus.EventBus;
import dagger.Lazy;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.sync.entities:
//            EntitySyncRequestFactory

public final class  extends b
    implements Provider
{

    private b eventBus;
    private b playlistSyncJob;
    private b trackSyncJob;
    private b usersSyncJob;

    public final void attach(l l1)
    {
        trackSyncJob = l1.a("@javax.inject.Named(value=TracksSync)/dagger.Lazy<com.soundcloud.android.sync.entities.EntitySyncJob>", com/soundcloud/android/sync/entities/EntitySyncRequestFactory, getClass().getClassLoader());
        playlistSyncJob = l1.a("@javax.inject.Named(value=PlaylistsSync)/dagger.Lazy<com.soundcloud.android.sync.entities.EntitySyncJob>", com/soundcloud/android/sync/entities/EntitySyncRequestFactory, getClass().getClassLoader());
        usersSyncJob = l1.a("@javax.inject.Named(value=UsersSync)/dagger.Lazy<com.soundcloud.android.sync.entities.EntitySyncJob>", com/soundcloud/android/sync/entities/EntitySyncRequestFactory, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/sync/entities/EntitySyncRequestFactory, getClass().getClassLoader());
    }

    public final EntitySyncRequestFactory get()
    {
        return new EntitySyncRequestFactory((Lazy)trackSyncJob.get(), (Lazy)playlistSyncJob.get(), (Lazy)usersSyncJob.get(), (EventBus)eventBus.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(trackSyncJob);
        set.add(playlistSyncJob);
        set.add(usersSyncJob);
        set.add(eventBus);
    }

    public ()
    {
        super("com.soundcloud.android.sync.entities.EntitySyncRequestFactory", "members/com.soundcloud.android.sync.entities.EntitySyncRequestFactory", false, com/soundcloud/android/sync/entities/EntitySyncRequestFactory);
    }
}
