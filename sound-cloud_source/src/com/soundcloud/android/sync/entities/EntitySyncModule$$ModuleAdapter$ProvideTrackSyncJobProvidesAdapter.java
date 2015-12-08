// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.entities;

import com.soundcloud.android.commands.StoreTracksCommand;
import com.soundcloud.android.sync.commands.FetchTracksCommand;
import dagger.a.b;
import dagger.a.l;
import dagger.a.t;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.sync.entities:
//            EntitySyncModule, EntitySyncJob

public static final class setLibrary extends t
    implements Provider
{

    private b fetchTracks;
    private final EntitySyncModule module;
    private b storeTracks;

    public final void attach(l l1)
    {
        fetchTracks = l1.a("com.soundcloud.android.sync.commands.FetchTracksCommand", com/soundcloud/android/sync/entities/EntitySyncModule, getClass().getClassLoader());
        storeTracks = l1.a("com.soundcloud.android.commands.StoreTracksCommand", com/soundcloud/android/sync/entities/EntitySyncModule, getClass().getClassLoader());
    }

    public final EntitySyncJob get()
    {
        return module.provideTrackSyncJob((FetchTracksCommand)fetchTracks.get(), (StoreTracksCommand)storeTracks.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(fetchTracks);
        set.add(storeTracks);
    }

    public (EntitySyncModule entitysyncmodule)
    {
        super("@javax.inject.Named(value=TracksSync)/com.soundcloud.android.sync.entities.EntitySyncJob", false, "com.soundcloud.android.sync.entities.EntitySyncModule", "provideTrackSyncJob");
        module = entitysyncmodule;
        setLibrary(true);
    }
}
