// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import com.soundcloud.android.api.model.ApiPlaylist;
import com.soundcloud.android.api.model.ApiTrack;
import com.soundcloud.java.optional.Optional;

public class ApiLikeHolder
{

    private final ApiPlaylist playlist;
    private final ApiTrack track;

    public ApiLikeHolder(ApiTrack apitrack, ApiPlaylist apiplaylist)
    {
        track = apitrack;
        playlist = apiplaylist;
    }

    Optional getLike()
    {
        if (track != null)
        {
            return Optional.of(track);
        }
        if (playlist != null)
        {
            return Optional.of(playlist);
        } else
        {
            return Optional.absent();
        }
    }
}
