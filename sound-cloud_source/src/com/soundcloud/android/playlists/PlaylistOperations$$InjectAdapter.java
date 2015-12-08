// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import com.soundcloud.android.offline.OfflineContentOperations;
import com.soundcloud.android.sync.SyncInitiator;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;
import rx.R;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistOperations, PlaylistTracksStorage, PlaylistStorage, LoadPlaylistTrackUrnsCommand, 
//            AddTrackToPlaylistCommand, RemoveTrackFromPlaylistCommand

public final class  extends b
    implements Provider
{

    private b addTrackToPlaylistCommand;
    private b eventBus;
    private b loadPlaylistTrackUrns;
    private b offlineOperations;
    private b playlistStorage;
    private b playlistTracksStorage;
    private b removeTrackFromPlaylistCommand;
    private b scheduler;
    private b syncInitiator;

    public final void attach(l l1)
    {
        scheduler = l1.a("@javax.inject.Named(value=HighPriority)/rx.Scheduler", com/soundcloud/android/playlists/PlaylistOperations, getClass().getClassLoader());
        syncInitiator = l1.a("com.soundcloud.android.sync.SyncInitiator", com/soundcloud/android/playlists/PlaylistOperations, getClass().getClassLoader());
        playlistTracksStorage = l1.a("com.soundcloud.android.playlists.PlaylistTracksStorage", com/soundcloud/android/playlists/PlaylistOperations, getClass().getClassLoader());
        playlistStorage = l1.a("com.soundcloud.android.playlists.PlaylistStorage", com/soundcloud/android/playlists/PlaylistOperations, getClass().getClassLoader());
        loadPlaylistTrackUrns = l1.a("com.soundcloud.android.playlists.LoadPlaylistTrackUrnsCommand", com/soundcloud/android/playlists/PlaylistOperations, getClass().getClassLoader());
        offlineOperations = l1.a("com.soundcloud.android.offline.OfflineContentOperations", com/soundcloud/android/playlists/PlaylistOperations, getClass().getClassLoader());
        addTrackToPlaylistCommand = l1.a("com.soundcloud.android.playlists.AddTrackToPlaylistCommand", com/soundcloud/android/playlists/PlaylistOperations, getClass().getClassLoader());
        removeTrackFromPlaylistCommand = l1.a("com.soundcloud.android.playlists.RemoveTrackFromPlaylistCommand", com/soundcloud/android/playlists/PlaylistOperations, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/playlists/PlaylistOperations, getClass().getClassLoader());
    }

    public final PlaylistOperations get()
    {
        return new PlaylistOperations((R)scheduler.get(), (SyncInitiator)syncInitiator.get(), (PlaylistTracksStorage)playlistTracksStorage.get(), (PlaylistStorage)playlistStorage.get(), (LoadPlaylistTrackUrnsCommand)loadPlaylistTrackUrns.get(), (OfflineContentOperations)offlineOperations.get(), (AddTrackToPlaylistCommand)addTrackToPlaylistCommand.get(), (RemoveTrackFromPlaylistCommand)removeTrackFromPlaylistCommand.get(), (EventBus)eventBus.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(scheduler);
        set.add(syncInitiator);
        set.add(playlistTracksStorage);
        set.add(playlistStorage);
        set.add(loadPlaylistTrackUrns);
        set.add(offlineOperations);
        set.add(addTrackToPlaylistCommand);
        set.add(removeTrackFromPlaylistCommand);
        set.add(eventBus);
    }

    public ()
    {
        super("com.soundcloud.android.playlists.PlaylistOperations", "members/com.soundcloud.android.playlists.PlaylistOperations", false, com/soundcloud/android/playlists/PlaylistOperations);
    }
}
