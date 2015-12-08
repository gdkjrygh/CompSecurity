// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.posts;

import com.soundcloud.android.api.ApiClient;
import com.soundcloud.android.api.ApiEndpoints;
import com.soundcloud.android.commands.StorePlaylistsCommand;
import com.soundcloud.android.commands.StoreTracksCommand;
import com.soundcloud.android.sync.commands.FetchPlaylistsCommand;
import com.soundcloud.android.sync.commands.FetchTracksCommand;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.rx.eventbus.EventBus;

// Referenced classes of package com.soundcloud.android.sync.posts:
//            FetchPostsCommand, LoadLocalPostsCommand, PostsSyncer, StorePostsCommand, 
//            RemovePostsCommand

public class PostsSyncModule
{

    public static final String FETCH_PLAYLIST_POSTS = "FetchPlaylistPosts";
    public static final String FETCH_TRACK_POSTS = "FetchTrackPosts";
    public static final String LOAD_PLAYLIST_POSTS = "LoadPlaylistPosts";
    public static final String LOAD_TRACK_POSTS = "LoadTrackPosts";
    public static final String MY_PLAYLIST_POSTS_SYNCER = "MyPlaylistPostsSyncer";
    public static final String MY_TRACK_POSTS_SYNCER = "MyTrackPostsSyncer";

    public PostsSyncModule()
    {
    }

    FetchPostsCommand provideFetchPlaylistPostsCommand(ApiClient apiclient)
    {
        return (FetchPostsCommand)(new FetchPostsCommand(apiclient)).with(ApiEndpoints.MY_PLAYLIST_POSTS);
    }

    FetchPostsCommand provideFetchTrackPostsCommand(ApiClient apiclient)
    {
        return (FetchPostsCommand)(new FetchPostsCommand(apiclient)).with(ApiEndpoints.MY_TRACK_POSTS);
    }

    LoadLocalPostsCommand provideLoadLocalPlaylistPostsCommand(PropellerDatabase propellerdatabase)
    {
        return new LoadLocalPostsCommand(propellerdatabase, 1);
    }

    LoadLocalPostsCommand provideLoadLocalTrackPostsCommand(PropellerDatabase propellerdatabase)
    {
        return new LoadLocalPostsCommand(propellerdatabase, 0);
    }

    PostsSyncer provideMyPlaylistPostsSyncer(LoadLocalPostsCommand loadlocalpostscommand, FetchPostsCommand fetchpostscommand, StorePostsCommand storepostscommand, RemovePostsCommand removepostscommand, FetchPlaylistsCommand fetchplaylistscommand, StorePlaylistsCommand storeplaylistscommand, EventBus eventbus)
    {
        return new PostsSyncer(loadlocalpostscommand, fetchpostscommand, storepostscommand, removepostscommand, fetchplaylistscommand, storeplaylistscommand, eventbus);
    }

    PostsSyncer provideMyPostsSyncer(LoadLocalPostsCommand loadlocalpostscommand, FetchPostsCommand fetchpostscommand, StorePostsCommand storepostscommand, RemovePostsCommand removepostscommand, FetchTracksCommand fetchtrackscommand, StoreTracksCommand storetrackscommand, EventBus eventbus)
    {
        return new PostsSyncer(loadlocalpostscommand, fetchpostscommand, storepostscommand, removepostscommand, fetchtrackscommand, storetrackscommand, eventbus);
    }
}
