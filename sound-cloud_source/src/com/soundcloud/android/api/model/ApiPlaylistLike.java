// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.model;

import com.soundcloud.android.likes.LikeProperty;
import com.soundcloud.android.model.PropertySetSource;
import com.soundcloud.android.playlists.PlaylistRecord;
import com.soundcloud.android.playlists.PlaylistRecordHolder;
import com.soundcloud.java.collections.PropertySet;
import java.util.Date;

// Referenced classes of package com.soundcloud.android.api.model:
//            ApiPlaylist

public class ApiPlaylistLike
    implements PropertySetSource, PlaylistRecordHolder
{

    private final ApiPlaylist apiPlaylist;
    private final Date createdAt;

    public ApiPlaylistLike(ApiPlaylist apiplaylist, Date date)
    {
        apiPlaylist = apiplaylist;
        createdAt = date;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof ApiPlaylistLike))
            {
                return false;
            }
            if (!apiPlaylist.equals(((ApiPlaylistLike)obj).apiPlaylist))
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
        return apiPlaylist.toPropertySet().put(LikeProperty.CREATED_AT, createdAt);
    }
}
