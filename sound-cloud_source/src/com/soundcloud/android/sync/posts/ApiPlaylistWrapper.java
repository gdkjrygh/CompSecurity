// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.posts;

import com.soundcloud.android.api.model.ApiPlaylist;

class ApiPlaylistWrapper
{

    private final ApiPlaylist apiPlaylist;

    ApiPlaylistWrapper(ApiPlaylist apiplaylist)
    {
        apiPlaylist = apiplaylist;
    }

    ApiPlaylist getApiPlaylist()
    {
        return apiPlaylist;
    }
}
