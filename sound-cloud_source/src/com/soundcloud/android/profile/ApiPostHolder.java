// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import com.soundcloud.android.api.model.ApiPlaylistPost;
import com.soundcloud.android.api.model.ApiPlaylistRepost;
import com.soundcloud.android.api.model.ApiTrackPost;
import com.soundcloud.android.api.model.ApiTrackRepost;
import com.soundcloud.java.optional.Optional;

public class ApiPostHolder
{

    private final ApiPlaylistPost playlistPost;
    private final ApiPlaylistRepost playlistRepost;
    private final ApiTrackPost trackPost;
    private final ApiTrackRepost trackRepost;

    public ApiPostHolder(ApiTrackPost apitrackpost, ApiTrackRepost apitrackrepost, ApiPlaylistPost apiplaylistpost, ApiPlaylistRepost apiplaylistrepost)
    {
        trackPost = apitrackpost;
        trackRepost = apitrackrepost;
        playlistPost = apiplaylistpost;
        playlistRepost = apiplaylistrepost;
    }

    Optional getPost()
    {
        if (trackPost != null)
        {
            return Optional.of(trackPost);
        }
        if (trackRepost != null)
        {
            return Optional.of(trackRepost);
        }
        if (playlistPost != null)
        {
            return Optional.of(playlistPost);
        }
        if (playlistRepost != null)
        {
            return Optional.of(playlistRepost);
        } else
        {
            return Optional.absent();
        }
    }
}
