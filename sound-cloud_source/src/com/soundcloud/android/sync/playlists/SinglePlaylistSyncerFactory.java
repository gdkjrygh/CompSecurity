// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.playlists;

import com.soundcloud.android.commands.StoreTracksCommand;
import com.soundcloud.android.model.Urn;

// Referenced classes of package com.soundcloud.android.sync.playlists:
//            SinglePlaylistSyncer, FetchPlaylistWithTracksCommand, RemovePlaylistCommand, LoadPlaylistTracksWithChangesCommand, 
//            PushPlaylistAdditionsCommand, PushPlaylistRemovalsCommand, ReplacePlaylistTracksCommand, StorePlaylistCommand

public class SinglePlaylistSyncerFactory
{

    private final FetchPlaylistWithTracksCommand fetchPlaylistWithTracks;
    private final LoadPlaylistTracksWithChangesCommand loadUnpushedTracksForPlaylist;
    private final PushPlaylistAdditionsCommand pushPlaylistAdditions;
    private final PushPlaylistRemovalsCommand pushPlaylistRemovals;
    private final RemovePlaylistCommand removePlaylist;
    private final ReplacePlaylistTracksCommand replacePlaylistTracks;
    private final StorePlaylistCommand storePlaylist;
    private final StoreTracksCommand storeTracks;

    public SinglePlaylistSyncerFactory(LoadPlaylistTracksWithChangesCommand loadplaylisttrackswithchangescommand, PushPlaylistAdditionsCommand pushplaylistadditionscommand, PushPlaylistRemovalsCommand pushplaylistremovalscommand, FetchPlaylistWithTracksCommand fetchplaylistwithtrackscommand, StorePlaylistCommand storeplaylistcommand, RemovePlaylistCommand removeplaylistcommand, StoreTracksCommand storetrackscommand, 
            ReplacePlaylistTracksCommand replaceplaylisttrackscommand)
    {
        loadUnpushedTracksForPlaylist = loadplaylisttrackswithchangescommand;
        pushPlaylistAdditions = pushplaylistadditionscommand;
        pushPlaylistRemovals = pushplaylistremovalscommand;
        fetchPlaylistWithTracks = fetchplaylistwithtrackscommand;
        storePlaylist = storeplaylistcommand;
        removePlaylist = removeplaylistcommand;
        storeTracks = storetrackscommand;
        replacePlaylistTracks = replaceplaylisttrackscommand;
    }

    public SinglePlaylistSyncer create(Urn urn)
    {
        return new SinglePlaylistSyncer((FetchPlaylistWithTracksCommand)fetchPlaylistWithTracks.with(urn), (RemovePlaylistCommand)removePlaylist.with(urn), (LoadPlaylistTracksWithChangesCommand)loadUnpushedTracksForPlaylist.with(urn), pushPlaylistAdditions.with(urn), pushPlaylistRemovals.with(urn), storeTracks, storePlaylist, replacePlaylistTracks.with(urn));
    }
}
