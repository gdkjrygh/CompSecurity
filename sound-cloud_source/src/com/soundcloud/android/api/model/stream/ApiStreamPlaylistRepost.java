// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.model.stream;

import com.soundcloud.android.api.model.ApiPlaylist;
import com.soundcloud.android.api.model.ApiUser;
import java.util.Date;

public class ApiStreamPlaylistRepost
{

    private final ApiPlaylist apiPlaylist;
    private final long createdAtTime;
    private final ApiUser reposter;

    public ApiStreamPlaylistRepost(ApiPlaylist apiplaylist, ApiUser apiuser, Date date)
    {
        apiPlaylist = apiplaylist;
        reposter = apiuser;
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

    public ApiUser getReposter()
    {
        return reposter;
    }
}
