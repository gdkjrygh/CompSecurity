// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.likes;

import com.soundcloud.android.commands.StorePlaylistsCommand;
import com.soundcloud.android.sync.commands.FetchPlaylistsCommand;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a.b;
import dagger.a.l;
import dagger.a.t;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.sync.likes:
//            LikesSyncModule, FetchLikesCommand, LoadLikesCommand, PushLikesCommand, 
//            LoadLikesPendingAdditionCommand, LoadLikesPendingRemovalCommand, StoreLikesCommand, RemoveLikesCommand, 
//            LikesSyncer

public static final class setLibrary extends t
    implements Provider
{

    private b eventBus;
    private b fetchLikesCommand;
    private b fetchPlaylists;
    private b loadLikes;
    private b loadLikesPendingAddition;
    private b loadLikesPendingRemoval;
    private final LikesSyncModule module;
    private b pushLikeAdditions;
    private b pushLikeDeletions;
    private b removeLikes;
    private b storeLikes;
    private b storePlaylists;

    public final void attach(l l1)
    {
        fetchLikesCommand = l1.a("com.soundcloud.android.sync.likes.FetchLikesCommand", com/soundcloud/android/sync/likes/LikesSyncModule, getClass().getClassLoader());
        fetchPlaylists = l1.a("com.soundcloud.android.sync.commands.FetchPlaylistsCommand", com/soundcloud/android/sync/likes/LikesSyncModule, getClass().getClassLoader());
        loadLikes = l1.a("com.soundcloud.android.sync.likes.LoadLikesCommand", com/soundcloud/android/sync/likes/LikesSyncModule, getClass().getClassLoader());
        pushLikeAdditions = l1.a("@javax.inject.Named(value=PlaylistLikeAdditions)/com.soundcloud.android.sync.likes.PushLikesCommand<com.soundcloud.android.sync.likes.ApiLike>", com/soundcloud/android/sync/likes/LikesSyncModule, getClass().getClassLoader());
        pushLikeDeletions = l1.a("@javax.inject.Named(value=PlaylistLikeDeletions)/com.soundcloud.android.sync.likes.PushLikesCommand<com.soundcloud.android.sync.likes.ApiDeletedLike>", com/soundcloud/android/sync/likes/LikesSyncModule, getClass().getClassLoader());
        loadLikesPendingAddition = l1.a("com.soundcloud.android.sync.likes.LoadLikesPendingAdditionCommand", com/soundcloud/android/sync/likes/LikesSyncModule, getClass().getClassLoader());
        loadLikesPendingRemoval = l1.a("com.soundcloud.android.sync.likes.LoadLikesPendingRemovalCommand", com/soundcloud/android/sync/likes/LikesSyncModule, getClass().getClassLoader());
        storePlaylists = l1.a("com.soundcloud.android.commands.StorePlaylistsCommand", com/soundcloud/android/sync/likes/LikesSyncModule, getClass().getClassLoader());
        storeLikes = l1.a("com.soundcloud.android.sync.likes.StoreLikesCommand", com/soundcloud/android/sync/likes/LikesSyncModule, getClass().getClassLoader());
        removeLikes = l1.a("@javax.inject.Named(value=RemovePlaylistLikes)/com.soundcloud.android.sync.likes.RemoveLikesCommand", com/soundcloud/android/sync/likes/LikesSyncModule, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/sync/likes/LikesSyncModule, getClass().getClassLoader());
    }

    public final LikesSyncer get()
    {
        return module.providePlaylistLikesSyncer((FetchLikesCommand)fetchLikesCommand.get(), (FetchPlaylistsCommand)fetchPlaylists.get(), (LoadLikesCommand)loadLikes.get(), (PushLikesCommand)pushLikeAdditions.get(), (PushLikesCommand)pushLikeDeletions.get(), (LoadLikesPendingAdditionCommand)loadLikesPendingAddition.get(), (LoadLikesPendingRemovalCommand)loadLikesPendingRemoval.get(), (StorePlaylistsCommand)storePlaylists.get(), (StoreLikesCommand)storeLikes.get(), (RemoveLikesCommand)removeLikes.get(), (EventBus)eventBus.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(fetchLikesCommand);
        set.add(fetchPlaylists);
        set.add(loadLikes);
        set.add(pushLikeAdditions);
        set.add(pushLikeDeletions);
        set.add(loadLikesPendingAddition);
        set.add(loadLikesPendingRemoval);
        set.add(storePlaylists);
        set.add(storeLikes);
        set.add(removeLikes);
        set.add(eventBus);
    }

    public (LikesSyncModule likessyncmodule)
    {
        super("@javax.inject.Named(value=PlaylistLikesSyncer)/com.soundcloud.android.sync.likes.LikesSyncer<com.soundcloud.android.api.model.ApiPlaylist>", false, "com.soundcloud.android.sync.likes.LikesSyncModule", "providePlaylistLikesSyncer");
        module = likessyncmodule;
        setLibrary(true);
    }
}
