// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.likes;

import com.soundcloud.android.api.ApiClient;
import com.soundcloud.android.api.ApiEndpoints;
import com.soundcloud.android.commands.StorePlaylistsCommand;
import com.soundcloud.android.commands.StoreTracksCommand;
import com.soundcloud.android.sync.commands.FetchPlaylistsCommand;
import com.soundcloud.android.sync.commands.FetchTracksCommand;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.rx.eventbus.EventBus;

// Referenced classes of package com.soundcloud.android.sync.likes:
//            PushLikesCommand, LikesSyncer, FetchLikesCommand, LoadLikesCommand, 
//            LoadLikesPendingAdditionCommand, LoadLikesPendingRemovalCommand, RemoveLikesCommand, StoreLikesCommand

public class LikesSyncModule
{

    public static final String PLAYLIST_LIKES_SYNCER = "PlaylistLikesSyncer";
    public static final String PLAYLIST_LIKE_ADDITIONS = "PlaylistLikeAdditions";
    public static final String PLAYLIST_LIKE_DELETIONS = "PlaylistLikeDeletions";
    public static final String REMOVE_PLAYLIST_LIKES = "RemovePlaylistLikes";
    public static final String REMOVE_TRACK_LIKES = "RemoveTrackLikes";
    public static final String TRACK_LIKES_SYNCER = "TrackLikesSyncer";
    public static final String TRACK_LIKE_ADDITIONS = "TrackLikeAdditions";
    public static final String TRACK_LIKE_DELETIONS = "TrackLikeDeletions";

    public LikesSyncModule()
    {
    }

    PushLikesCommand providePlaylistLikeAdditionsPushCommand(ApiClient apiclient)
    {
        return new PushLikesCommand(apiclient, ApiEndpoints.CREATE_PLAYLIST_LIKES, new _cls3());
    }

    PushLikesCommand providePlaylistLikeDeletionsPushCommand(ApiClient apiclient)
    {
        return new PushLikesCommand(apiclient, ApiEndpoints.DELETE_PLAYLIST_LIKES, new _cls4());
    }

    LikesSyncer providePlaylistLikesSyncer(FetchLikesCommand fetchlikescommand, FetchPlaylistsCommand fetchplaylistscommand, LoadLikesCommand loadlikescommand, PushLikesCommand pushlikescommand, PushLikesCommand pushlikescommand1, LoadLikesPendingAdditionCommand loadlikespendingadditioncommand, LoadLikesPendingRemovalCommand loadlikespendingremovalcommand, 
            StorePlaylistsCommand storeplaylistscommand, StoreLikesCommand storelikescommand, RemoveLikesCommand removelikescommand, EventBus eventbus)
    {
        return new LikesSyncer((FetchLikesCommand)fetchlikescommand.with(ApiEndpoints.LIKED_PLAYLISTS), fetchplaylistscommand, pushlikescommand, pushlikescommand1, (LoadLikesCommand)loadlikescommand.with(Integer.valueOf(1)), (LoadLikesPendingAdditionCommand)loadlikespendingadditioncommand.with(Integer.valueOf(1)), (LoadLikesPendingRemovalCommand)loadlikespendingremovalcommand.with(Integer.valueOf(1)), storeplaylistscommand, storelikescommand, removelikescommand, eventbus);
    }

    RemoveLikesCommand provideRemovePlaylistLikesCommand(PropellerDatabase propellerdatabase)
    {
        return new RemoveLikesCommand(propellerdatabase, 1);
    }

    RemoveLikesCommand provideRemoveTrackLikesCommand(PropellerDatabase propellerdatabase)
    {
        return new RemoveLikesCommand(propellerdatabase, 0);
    }

    PushLikesCommand provideTrackLikeAdditionsPushCommand(ApiClient apiclient)
    {
        return new PushLikesCommand(apiclient, ApiEndpoints.CREATE_TRACK_LIKES, new _cls1());
    }

    PushLikesCommand provideTrackLikeDeletionsPushCommand(ApiClient apiclient)
    {
        return new PushLikesCommand(apiclient, ApiEndpoints.DELETE_TRACK_LIKES, new _cls2());
    }

    LikesSyncer provideTrackLikesSyncer(FetchLikesCommand fetchlikescommand, FetchTracksCommand fetchtrackscommand, LoadLikesCommand loadlikescommand, PushLikesCommand pushlikescommand, PushLikesCommand pushlikescommand1, LoadLikesPendingAdditionCommand loadlikespendingadditioncommand, LoadLikesPendingRemovalCommand loadlikespendingremovalcommand, 
            StoreTracksCommand storetrackscommand, StoreLikesCommand storelikescommand, RemoveLikesCommand removelikescommand, EventBus eventbus)
    {
        return new LikesSyncer((FetchLikesCommand)fetchlikescommand.with(ApiEndpoints.LIKED_TRACKS), fetchtrackscommand, pushlikescommand, pushlikescommand1, (LoadLikesCommand)loadlikescommand.with(Integer.valueOf(0)), (LoadLikesPendingAdditionCommand)loadlikespendingadditioncommand.with(Integer.valueOf(0)), (LoadLikesPendingRemovalCommand)loadlikespendingremovalcommand.with(Integer.valueOf(0)), storetrackscommand, storelikescommand, removelikescommand, eventbus);
    }

    private class _cls3 extends TypeToken
    {

        final LikesSyncModule this$0;

        _cls3()
        {
            this$0 = LikesSyncModule.this;
            super();
        }
    }


    private class _cls4 extends TypeToken
    {

        final LikesSyncModule this$0;

        _cls4()
        {
            this$0 = LikesSyncModule.this;
            super();
        }
    }


    private class _cls1 extends TypeToken
    {

        final LikesSyncModule this$0;

        _cls1()
        {
            this$0 = LikesSyncModule.this;
            super();
        }
    }


    private class _cls2 extends TypeToken
    {

        final LikesSyncModule this$0;

        _cls2()
        {
            this$0 = LikesSyncModule.this;
            super();
        }
    }

}
