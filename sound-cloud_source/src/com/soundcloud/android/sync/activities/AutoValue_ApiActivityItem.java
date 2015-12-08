// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.activities;


// Referenced classes of package com.soundcloud.android.sync.activities:
//            ApiActivityItem, ApiPlaylistLikeActivity, ApiPlaylistRepostActivity, ApiTrackCommentActivity, 
//            ApiTrackLikeActivity, ApiTrackRepostActivity, ApiUserFollowActivity

final class AutoValue_ApiActivityItem extends ApiActivityItem
{
    static final class Builder extends ApiActivityItem.Builder
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

        public final ApiActivityItem.Builder playlistLike(ApiPlaylistLikeActivity apiplaylistlikeactivity)
        {
            playlistLike = apiplaylistlikeactivity;
            return this;
        }

        public final ApiActivityItem.Builder playlistRepost(ApiPlaylistRepostActivity apiplaylistrepostactivity)
        {
            playlistRepost = apiplaylistrepostactivity;
            return this;
        }

        public final ApiActivityItem.Builder trackComment(ApiTrackCommentActivity apitrackcommentactivity)
        {
            trackComment = apitrackcommentactivity;
            return this;
        }

        public final ApiActivityItem.Builder trackLike(ApiTrackLikeActivity apitracklikeactivity)
        {
            trackLike = apitracklikeactivity;
            return this;
        }

        public final ApiActivityItem.Builder trackRepost(ApiTrackRepostActivity apitrackrepostactivity)
        {
            trackRepost = apitrackrepostactivity;
            return this;
        }

        public final ApiActivityItem.Builder userFollow(ApiUserFollowActivity apiuserfollowactivity)
        {
            userFollow = apiuserfollowactivity;
            return this;
        }

        Builder()
        {
        }

        Builder(ApiActivityItem apiactivityitem)
        {
            trackLike = apiactivityitem.trackLike();
            trackRepost = apiactivityitem.trackRepost();
            trackComment = apiactivityitem.trackComment();
            playlistLike = apiactivityitem.playlistLike();
            playlistRepost = apiactivityitem.playlistRepost();
            userFollow = apiactivityitem.userFollow();
        }
    }


    private final ApiPlaylistLikeActivity playlistLike;
    private final ApiPlaylistRepostActivity playlistRepost;
    private final ApiTrackCommentActivity trackComment;
    private final ApiTrackLikeActivity trackLike;
    private final ApiTrackRepostActivity trackRepost;
    private final ApiUserFollowActivity userFollow;

    private AutoValue_ApiActivityItem(ApiTrackLikeActivity apitracklikeactivity, ApiTrackRepostActivity apitrackrepostactivity, ApiTrackCommentActivity apitrackcommentactivity, ApiPlaylistLikeActivity apiplaylistlikeactivity, ApiPlaylistRepostActivity apiplaylistrepostactivity, ApiUserFollowActivity apiuserfollowactivity)
    {
        trackLike = apitracklikeactivity;
        trackRepost = apitrackrepostactivity;
        trackComment = apitrackcommentactivity;
        playlistLike = apiplaylistlikeactivity;
        playlistRepost = apiplaylistrepostactivity;
        userFollow = apiuserfollowactivity;
    }

    AutoValue_ApiActivityItem(ApiTrackLikeActivity apitracklikeactivity, ApiTrackRepostActivity apitrackrepostactivity, ApiTrackCommentActivity apitrackcommentactivity, ApiPlaylistLikeActivity apiplaylistlikeactivity, ApiPlaylistRepostActivity apiplaylistrepostactivity, ApiUserFollowActivity apiuserfollowactivity, _cls1 _pcls1)
    {
        this(apitracklikeactivity, apitrackrepostactivity, apitrackcommentactivity, apiplaylistlikeactivity, apiplaylistrepostactivity, apiuserfollowactivity);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this) goto _L2; else goto _L1
_L1:
        return true;
_L2:
label0:
        {
            if (!(obj instanceof ApiActivityItem))
            {
                break MISSING_BLOCK_LABEL_206;
            }
            obj = (ApiActivityItem)obj;
            if ((trackLike != null ? trackLike.equals(((ApiActivityItem) (obj)).trackLike()) : ((ApiActivityItem) (obj)).trackLike() == null) && (trackRepost != null ? trackRepost.equals(((ApiActivityItem) (obj)).trackRepost()) : ((ApiActivityItem) (obj)).trackRepost() == null) && (trackComment != null ? trackComment.equals(((ApiActivityItem) (obj)).trackComment()) : ((ApiActivityItem) (obj)).trackComment() == null) && (playlistLike != null ? playlistLike.equals(((ApiActivityItem) (obj)).playlistLike()) : ((ApiActivityItem) (obj)).playlistLike() == null) && (playlistRepost != null ? playlistRepost.equals(((ApiActivityItem) (obj)).playlistRepost()) : ((ApiActivityItem) (obj)).playlistRepost() == null))
            {
                break label0;
            } else
            {
                break; /* Loop/switch isn't completed */
            }
        }
        if (userFollow != null) goto _L4; else goto _L3
_L3:
        if (((ApiActivityItem) (obj)).userFollow() == null) goto _L1; else goto _L5
_L5:
        return false;
_L4:
        if (!userFollow.equals(((ApiActivityItem) (obj)).userFollow())) goto _L5; else goto _L6
_L6:
        return true;
        return false;
    }

    public final int hashCode()
    {
        int j1 = 0;
        int i;
        int j;
        int k;
        int l;
        int i1;
        if (trackLike == null)
        {
            i = 0;
        } else
        {
            i = trackLike.hashCode();
        }
        if (trackRepost == null)
        {
            j = 0;
        } else
        {
            j = trackRepost.hashCode();
        }
        if (trackComment == null)
        {
            k = 0;
        } else
        {
            k = trackComment.hashCode();
        }
        if (playlistLike == null)
        {
            l = 0;
        } else
        {
            l = playlistLike.hashCode();
        }
        if (playlistRepost == null)
        {
            i1 = 0;
        } else
        {
            i1 = playlistRepost.hashCode();
        }
        if (userFollow != null)
        {
            j1 = userFollow.hashCode();
        }
        return (i1 ^ (l ^ (k ^ (j ^ (i ^ 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243 ^ j1;
    }

    protected final ApiPlaylistLikeActivity playlistLike()
    {
        return playlistLike;
    }

    protected final ApiPlaylistRepostActivity playlistRepost()
    {
        return playlistRepost;
    }

    public final String toString()
    {
        return (new StringBuilder("ApiActivityItem{trackLike=")).append(trackLike).append(", trackRepost=").append(trackRepost).append(", trackComment=").append(trackComment).append(", playlistLike=").append(playlistLike).append(", playlistRepost=").append(playlistRepost).append(", userFollow=").append(userFollow).append("}").toString();
    }

    protected final ApiTrackCommentActivity trackComment()
    {
        return trackComment;
    }

    protected final ApiTrackLikeActivity trackLike()
    {
        return trackLike;
    }

    protected final ApiTrackRepostActivity trackRepost()
    {
        return trackRepost;
    }

    protected final ApiUserFollowActivity userFollow()
    {
        return userFollow;
    }
}
