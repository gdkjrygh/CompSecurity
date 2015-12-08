// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.entities;

import com.soundcloud.android.commands.StorePlaylistsCommand;
import com.soundcloud.android.commands.StoreTracksCommand;
import com.soundcloud.android.commands.StoreUsersCommand;
import com.soundcloud.android.sync.commands.FetchPlaylistsCommand;
import com.soundcloud.android.sync.commands.FetchTracksCommand;
import com.soundcloud.android.sync.commands.FetchUsersCommand;

// Referenced classes of package com.soundcloud.android.sync.entities:
//            EntitySyncJob

public class EntitySyncModule
{

    public static final String PLAYLISTS_SYNC = "PlaylistsSync";
    public static final String TRACKS_SYNC = "TracksSync";
    public static final String USERS_SYNC = "UsersSync";

    public EntitySyncModule()
    {
    }

    EntitySyncJob providePlaylistSyncJob(FetchPlaylistsCommand fetchplaylistscommand, StorePlaylistsCommand storeplaylistscommand)
    {
        return new EntitySyncJob(fetchplaylistscommand, storeplaylistscommand);
    }

    EntitySyncJob provideTrackSyncJob(FetchTracksCommand fetchtrackscommand, StoreTracksCommand storetrackscommand)
    {
        return new EntitySyncJob(fetchtrackscommand, storetrackscommand);
    }

    EntitySyncJob provideUsersSyncJob(FetchUsersCommand fetchuserscommand, StoreUsersCommand storeuserscommand)
    {
        return new EntitySyncJob(fetchuserscommand, storeuserscommand);
    }
}
