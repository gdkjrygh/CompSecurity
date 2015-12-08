// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.model;

import com.soundcloud.android.model.PostProperty;
import com.soundcloud.android.model.PropertySetSource;
import com.soundcloud.android.playlists.PlaylistRecord;
import com.soundcloud.android.playlists.PlaylistRecordHolder;
import com.soundcloud.java.collections.PropertySet;

// Referenced classes of package com.soundcloud.android.api.model:
//            ApiPlaylist

public class ApiPlaylistPost
    implements PropertySetSource, PlaylistRecordHolder
{

    private final ApiPlaylist apiPlaylist;

    public ApiPlaylistPost(ApiPlaylist apiplaylist)
    {
        apiPlaylist = apiplaylist;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof ApiPlaylistPost))
            {
                return false;
            }
            if (!apiPlaylist.equals(((ApiPlaylistPost)obj).apiPlaylist))
            {
                return false;
            }
        }
        return true;
    }

    public PlaylistRecord getPlaylistRecord()
    {
        return apiPlaylist;
    }

    public int hashCode()
    {
        return apiPlaylist.hashCode();
    }

    public PropertySet toPropertySet()
    {
        return apiPlaylist.toPropertySet().put(PostProperty.IS_REPOST, Boolean.valueOf(false)).put(PostProperty.CREATED_AT, apiPlaylist.getCreatedAt());
    }
}
