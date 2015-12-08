// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.activities;

import com.soundcloud.android.model.PlaylistHolder;
import com.soundcloud.android.model.TrackHolder;
import com.soundcloud.java.collections.MoreArrays;
import com.soundcloud.java.optional.Optional;

// Referenced classes of package com.soundcloud.android.sync.activities:
//            ApiEngagementActivity, ApiActivity, ApiTrackLikeActivity, ApiTrackRepostActivity, 
//            ApiTrackCommentActivity, ApiPlaylistLikeActivity, ApiPlaylistRepostActivity, ApiUserFollowActivity

public abstract class ApiActivityItem
{
    public static abstract class Builder
    {

        protected abstract ApiActivityItem autoBuild();

        public ApiActivityItem build()
        {
            ApiActivityItem apiactivityitem = autoBuild();
            apiactivityitem.activity = (ApiActivity)MoreArrays.firstNonNull(new ApiActivity[] {
                apiactivityitem.trackLike(), apiactivityitem.trackRepost(), apiactivityitem.trackComment(), apiactivityitem.playlistLike(), apiactivityitem.playlistRepost(), apiactivityitem.userFollow()
            });
            return apiactivityitem;
        }

        public abstract Builder playlistLike(ApiPlaylistLikeActivity apiplaylistlikeactivity);

        public abstract Builder playlistRepost(ApiPlaylistRepostActivity apiplaylistrepostactivity);

        public abstract Builder trackComment(ApiTrackCommentActivity apitrackcommentactivity);

        public abstract Builder trackLike(ApiTrackLikeActivity apitracklikeactivity);

        public abstract Builder trackRepost(ApiTrackRepostActivity apitrackrepostactivity);

        public abstract Builder userFollow(ApiUserFollowActivity apiuserfollowactivity);

        public Builder()
        {
        }
    }


    private ApiActivity activity;

    public ApiActivityItem()
    {
    }

    public static Builder builder()
    {
        return new AutoValue_ApiActivityItem.Builder();
    }

    public static ApiActivityItem create(ApiTrackLikeActivity apitracklikeactivity, ApiTrackRepostActivity apitrackrepostactivity, ApiTrackCommentActivity apitrackcommentactivity, ApiPlaylistLikeActivity apiplaylistlikeactivity, ApiPlaylistRepostActivity apiplaylistrepostactivity, ApiUserFollowActivity apiuserfollowactivity)
    {
        return builder().trackLike(apitracklikeactivity).trackRepost(apitrackrepostactivity).trackComment(apitrackcommentactivity).playlistLike(apiplaylistlikeactivity).playlistRepost(apiplaylistrepostactivity).userFollow(apiuserfollowactivity).build();
    }

    public Optional getFollow()
    {
        return Optional.fromNullable(userFollow());
    }

    public Optional getLike()
    {
        return Optional.fromNullable(MoreArrays.firstNonNull(new ApiEngagementActivity[] {
            trackLike(), playlistLike()
        }));
    }

    public Optional getPlaylist()
    {
        if (activity instanceof PlaylistHolder)
        {
            return Optional.fromNullable(((PlaylistHolder)activity).getPlaylist());
        } else
        {
            return Optional.absent();
        }
    }

    public Optional getRepost()
    {
        return Optional.fromNullable(MoreArrays.firstNonNull(new ApiEngagementActivity[] {
            trackRepost(), playlistRepost()
        }));
    }

    public Optional getTrack()
    {
        if (activity instanceof TrackHolder)
        {
            return Optional.fromNullable(((TrackHolder)activity).getTrack());
        } else
        {
            return Optional.absent();
        }
    }

    public Optional getTrackComment()
    {
        return Optional.fromNullable(trackComment());
    }

    public Optional getUser()
    {
        if (activity != null)
        {
            return Optional.fromNullable(activity.getUser());
        } else
        {
            return Optional.absent();
        }
    }

    public boolean isValid()
    {
        return activity != null;
    }

    protected abstract ApiPlaylistLikeActivity playlistLike();

    protected abstract ApiPlaylistRepostActivity playlistRepost();

    protected abstract ApiTrackCommentActivity trackComment();

    protected abstract ApiTrackLikeActivity trackLike();

    protected abstract ApiTrackRepostActivity trackRepost();

    protected abstract ApiUserFollowActivity userFollow();


/*
    static ApiActivity access$002(ApiActivityItem apiactivityitem, ApiActivity apiactivity)
    {
        apiactivityitem.activity = apiactivity;
        return apiactivity;
    }

*/
}
