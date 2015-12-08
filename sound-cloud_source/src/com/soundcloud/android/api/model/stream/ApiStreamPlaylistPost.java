// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.model.stream;

import com.soundcloud.android.api.model.ApiPlaylist;
import java.util.Date;

public class ApiStreamPlaylistPost
{

    private final ApiPlaylist apiPlaylist;
    private final long createdAtTime;

    public ApiStreamPlaylistPost(ApiPlaylist apiplaylist, Date date)
    {
        apiPlaylist = apiplaylist;
        createdAtTime = date.getTime();
    }

    public ApiPlaylist getApiPlaylist()
    {
        return apiPlaylist;
    }

    public long getCreatedAtTime()
    {
        return createdAtTime;
    }
}
