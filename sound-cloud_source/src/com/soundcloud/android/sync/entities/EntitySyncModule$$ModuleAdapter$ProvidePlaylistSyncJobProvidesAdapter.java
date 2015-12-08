// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.entities;

import com.soundcloud.android.commands.StorePlaylistsCommand;
import com.soundcloud.android.sync.commands.FetchPlaylistsCommand;
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

    private b fetchPlaylists;
    private final EntitySyncModule module;
    private b storePlaylists;

    public final void attach(l l1)
    {
        fetchPlaylists = l1.a("com.soundcloud.android.sync.commands.FetchPlaylistsCommand", com/soundcloud/android/sync/entities/EntitySyncModule, getClass().getClassLoader());
        storePlaylists = l1.a("com.soundcloud.android.commands.StorePlaylistsCommand", com/soundcloud/android/sync/entities/EntitySyncModule, getClass().getClassLoader());
    }

    public final EntitySyncJob get()
    {
        return module.providePlaylistSyncJob((FetchPlaylistsCommand)fetchPlaylists.get(), (StorePlaylistsCommand)storePlaylists.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(fetchPlaylists);
        set.add(storePlaylists);
    }

    public (EntitySyncModule entitysyncmodule)
    {
        super("@javax.inject.Named(value=PlaylistsSync)/com.soundcloud.android.sync.entities.EntitySyncJob", false, "com.soundcloud.android.sync.entities.EntitySyncModule", "providePlaylistSyncJob");
        module = entitysyncmodule;
        setLibrary(true);
    }
}
