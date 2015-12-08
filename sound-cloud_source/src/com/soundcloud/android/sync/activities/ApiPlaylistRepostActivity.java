// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.activities;

import com.soundcloud.android.api.model.ApiPlaylist;
import com.soundcloud.android.api.model.ApiUser;
import com.soundcloud.android.model.PlaylistHolder;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playlists.PlaylistRecord;
import com.soundcloud.android.users.UserRecord;
import java.util.Date;

// Referenced classes of package com.soundcloud.android.sync.activities:
//            ApiEngagementActivity

public class ApiPlaylistRepostActivity
    implements PlaylistHolder, ApiEngagementActivity
{

    private final Date createdAt;
    private final ApiPlaylist playlist;
    private final ApiUser reposter;

    public ApiPlaylistRepostActivity(ApiPlaylist apiplaylist, ApiUser apiuser, Date date)
    {
        playlist = apiplaylist;
        reposter = apiuser;
        createdAt = date;
    }

    public Date getCreatedAt()
    {
        return createdAt;
    }

    public ApiPlaylist getPlaylist()
    {
        return playlist;
    }

    public volatile PlaylistRecord getPlaylist()
    {
        return getPlaylist();
    }

    public Urn getTargetUrn()
    {
        return playlist.getUrn();
    }

    public UserRecord getUser()
    {
        return reposter;
    }

    public Urn getUserUrn()
    {
        return reposter.getUrn();
    }
}
