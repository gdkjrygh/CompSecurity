// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.playlists;

import com.soundcloud.android.commands.StoreTracksCommand;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.sync.playlists:
//            SinglePlaylistSyncerFactory, LoadPlaylistTracksWithChangesCommand, PushPlaylistAdditionsCommand, PushPlaylistRemovalsCommand, 
//            FetchPlaylistWithTracksCommand, StorePlaylistCommand, RemovePlaylistCommand, ReplacePlaylistTracksCommand

public final class  extends b
    implements Provider
{

    private b fetchPlaylistWithTracks;
    private b loadUnpushedTracksForPlaylist;
    private b pushPlaylistAdditions;
    private b pushPlaylistRemovals;
    private b removePlaylist;
    private b replacePlaylistTracks;
    private b storePlaylist;
    private b storeTracks;

    public final void attach(l l1)
    {
        loadUnpushedTracksForPlaylist = l1.a("com.soundcloud.android.sync.playlists.LoadPlaylistTracksWithChangesCommand", com/soundcloud/android/sync/playlists/SinglePlaylistSyncerFactory, getClass().getClassLoader());
        pushPlaylistAdditions = l1.a("com.soundcloud.android.sync.playlists.PushPlaylistAdditionsCommand", com/soundcloud/android/sync/playlists/SinglePlaylistSyncerFactory, getClass().getClassLoader());
        pushPlaylistRemovals = l1.a("com.soundcloud.android.sync.playlists.PushPlaylistRemovalsCommand", com/soundcloud/android/sync/playlists/SinglePlaylistSyncerFactory, getClass().getClassLoader());
        fetchPlaylistWithTracks = l1.a("com.soundcloud.android.sync.playlists.FetchPlaylistWithTracksCommand", com/soundcloud/android/sync/playlists/SinglePlaylistSyncerFactory, getClass().getClassLoader());
        storePlaylist = l1.a("com.soundcloud.android.sync.playlists.StorePlaylistCommand", com/soundcloud/android/sync/playlists/SinglePlaylistSyncerFactory, getClass().getClassLoader());
        removePlaylist = l1.a("com.soundcloud.android.sync.playlists.RemovePlaylistCommand", com/soundcloud/android/sync/playlists/SinglePlaylistSyncerFactory, getClass().getClassLoader());
        storeTracks = l1.a("com.soundcloud.android.commands.StoreTracksCommand", com/soundcloud/android/sync/playlists/SinglePlaylistSyncerFactory, getClass().getClassLoader());
        replacePlaylistTracks = l1.a("com.soundcloud.android.sync.playlists.ReplacePlaylistTracksCommand", com/soundcloud/android/sync/playlists/SinglePlaylistSyncerFactory, getClass().getClassLoader());
    }

    public final SinglePlaylistSyncerFactory get()
    {
        return new SinglePlaylistSyncerFactory((LoadPlaylistTracksWithChangesCommand)loadUnpushedTracksForPlaylist.get(), (PushPlaylistAdditionsCommand)pushPlaylistAdditions.get(), (PushPlaylistRemovalsCommand)pushPlaylistRemovals.get(), (FetchPlaylistWithTracksCommand)fetchPlaylistWithTracks.get(), (StorePlaylistCommand)storePlaylist.get(), (RemovePlaylistCommand)removePlaylist.get(), (StoreTracksCommand)storeTracks.get(), (ReplacePlaylistTracksCommand)replacePlaylistTracks.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(loadUnpushedTracksForPlaylist);
        set.add(pushPlaylistAdditions);
        set.add(pushPlaylistRemovals);
        set.add(fetchPlaylistWithTracks);
        set.add(storePlaylist);
        set.add(removePlaylist);
        set.add(storeTracks);
        set.add(replacePlaylistTracks);
    }

    public ()
    {
        super("com.soundcloud.android.sync.playlists.SinglePlaylistSyncerFactory", "members/com.soundcloud.android.sync.playlists.SinglePlaylistSyncerFactory", false, com/soundcloud/android/sync/playlists/SinglePlaylistSyncerFactory);
    }
}
