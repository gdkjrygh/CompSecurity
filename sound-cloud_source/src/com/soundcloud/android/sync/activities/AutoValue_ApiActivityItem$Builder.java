// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.activities;


// Referenced classes of package com.soundcloud.android.sync.activities:
//            AutoValue_ApiActivityItem, ApiActivityItem, ApiPlaylistLikeActivity, ApiPlaylistRepostActivity, 
//            ApiTrackCommentActivity, ApiTrackLikeActivity, ApiTrackRepostActivity, ApiUserFollowActivity

static final class userFollow extends userFollow
{

    private ApiPlaylistLikeActivity playlistLike;
    private ApiPlaylistRepostActivity playlistRepost;
    private ApiTrackCommentActivity trackComment;
    private ApiTrackLikeActivity trackLike;
    private ApiTrackRepostActivity trackRepost;
    private ApiUserFollowActivity userFollow;

    public final ApiActivityItem autoBuild()
    {
        return new AutoValue_ApiActivityItem(trackLike, trackRepost, trackComment, playlistLike, playlistRepost, userFollow, null);
    }

    public final userFollow playlistLike(ApiPlaylistLikeActivity apiplaylistlikeactivity)
    {
        playlistLike = apiplaylistlikeactivity;
        return this;
    }

    public final playlistLike playlistRepost(ApiPlaylistRepostActivity apiplaylistrepostactivity)
    {
        playlistRepost = apiplaylistrepostactivity;
        return this;
    }

    public final playlistRepost trackComment(ApiTrackCommentActivity apitrackcommentactivity)
    {
        trackComment = apitrackcommentactivity;
        return this;
    }

    public final trackComment trackLike(ApiTrackLikeActivity apitracklikeactivity)
    {
        trackLike = apitracklikeactivity;
        return this;
    }

    public final trackLike trackRepost(ApiTrackRepostActivity apitrackrepostactivity)
    {
        trackRepost = apitrackrepostactivity;
        return this;
    }

    public final trackRepost userFollow(ApiUserFollowActivity apiuserfollowactivity)
    {
        userFollow = apiuserfollowactivity;
        return this;
    }

    ()
    {
    }

    (ApiActivityItem apiactivityitem)
    {
        trackLike = apiactivityitem.trackLike();
        trackRepost = apiactivityitem.trackRepost();
        trackComment = apiactivityitem.trackComment();
        playlistLike = apiactivityitem.playlistLike();
        playlistRepost = apiactivityitem.playlistRepost();
        userFollow = apiactivityitem.userFollow();
    }
}
