// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.model;

import com.soundcloud.android.model.PostProperty;
import com.soundcloud.android.model.PropertySetSource;
import com.soundcloud.android.playlists.PlaylistRecord;
import com.soundcloud.android.playlists.PlaylistRecordHolder;
import com.soundcloud.java.collections.PropertySet;
import java.util.Date;

// Referenced classes of package com.soundcloud.android.api.model:
//            ApiPlaylist

public class ApiPlaylistRepost
    implements PropertySetSource, PlaylistRecordHolder
{

    private final ApiPlaylist apiPlaylist;
    private final Date createdAt;

    public ApiPlaylistRepost(ApiPlaylist apiplaylist, Date date)
    {
        apiPlaylist = apiplaylist;
        createdAt = date;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof ApiPlaylistRepost))
            {
                return false;
            }
            obj = (ApiPlaylistRepost)obj;
            if (!apiPlaylist.equals(((ApiPlaylistRepost) (obj)).apiPlaylist) || !createdAt.equals(((ApiPlaylistRepost) (obj)).createdAt))
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
        return apiPlaylist.hashCode() * 31 + createdAt.hashCode();
    }

    public PropertySet toPropertySet()
    {
        return apiPlaylist.toPropertySet().put(PostProperty.IS_REPOST, Boolean.valueOf(true)).put(PostProperty.CREATED_AT, createdAt);
    }
}
