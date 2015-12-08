// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.search;

import com.soundcloud.android.api.model.ApiPlaylist;
import com.soundcloud.android.api.model.ApiTrack;
import com.soundcloud.android.api.model.ApiUser;
import com.soundcloud.android.model.PropertySetSource;
import com.soundcloud.java.collections.PropertySet;

class ApiUniversalSearchItem
    implements PropertySetSource
{

    private final ApiPlaylist playlist;
    private final ApiTrack track;
    private final ApiUser user;

    ApiUniversalSearchItem(ApiUser apiuser, ApiPlaylist apiplaylist, ApiTrack apitrack)
    {
        user = apiuser;
        playlist = apiplaylist;
        track = apitrack;
    }

    static ApiUniversalSearchItem forPlaylist(ApiPlaylist apiplaylist)
    {
        return new ApiUniversalSearchItem(null, apiplaylist, null);
    }

    static ApiUniversalSearchItem forTrack(ApiTrack apitrack)
    {
        return new ApiUniversalSearchItem(null, null, apitrack);
    }

    static ApiUniversalSearchItem forUser(ApiUser apiuser)
    {
        return new ApiUniversalSearchItem(apiuser, null, null);
    }

    public ApiPlaylist getPlaylist()
    {
        return playlist;
    }

    public ApiTrack getTrack()
    {
        return track;
    }

    public ApiUser getUser()
    {
        return user;
    }

    public boolean isPlaylist()
    {
        return playlist != null;
    }

    public boolean isTrack()
    {
        return track != null;
    }

    public boolean isUser()
    {
        return user != null;
    }

    public PropertySet toPropertySet()
    {
        if (user != null)
        {
            return user.toPropertySet();
        }
        if (playlist != null)
        {
            return playlist.toPropertySet();
        }
        if (track != null)
        {
            return track.toPropertySet();
        } else
        {
            throw new IllegalStateException("missing wrapped search result entity");
        }
    }
}
