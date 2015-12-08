// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.activities;

import com.soundcloud.java.collections.MoreArrays;

// Referenced classes of package com.soundcloud.android.sync.activities:
//            ApiActivityItem, ApiActivity, ApiPlaylistLikeActivity, ApiPlaylistRepostActivity, 
//            ApiTrackCommentActivity, ApiTrackLikeActivity, ApiTrackRepostActivity, ApiUserFollowActivity

public static abstract class y
{

    protected abstract ApiActivityItem autoBuild();

    public ApiActivityItem build()
    {
        ApiActivityItem apiactivityitem = autoBuild();
        ApiActivityItem.access$002(apiactivityitem, (ApiActivity)MoreArrays.firstNonNull(new ApiActivity[] {
            apiactivityitem.trackLike(), apiactivityitem.trackRepost(), apiactivityitem.trackComment(), apiactivityitem.playlistLike(), apiactivityitem.playlistRepost(), apiactivityitem.userFollow()
        }));
        return apiactivityitem;
    }

    public abstract ow playlistLike(ApiPlaylistLikeActivity apiplaylistlikeactivity);

    public abstract y playlistRepost(ApiPlaylistRepostActivity apiplaylistrepostactivity);

    public abstract y trackComment(ApiTrackCommentActivity apitrackcommentactivity);

    public abstract y trackLike(ApiTrackLikeActivity apitracklikeactivity);

    public abstract y trackRepost(ApiTrackRepostActivity apitrackrepostactivity);

    public abstract y userFollow(ApiUserFollowActivity apiuserfollowactivity);

    public y()
    {
    }
}
