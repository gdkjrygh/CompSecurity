// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import com.soundcloud.android.api.model.Sharing;
import com.soundcloud.android.model.PlayableProperty;
import com.soundcloud.android.model.PostProperty;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playlists.OfflinePlaylistMapper;
import com.soundcloud.android.playlists.PlaylistProperty;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.propeller.CursorReader;

// Referenced classes of package com.soundcloud.android.profile:
//            PostsStorage

private static class <init> extends OfflinePlaylistMapper
{

    public PropertySet map(CursorReader cursorreader)
    {
        PropertySet propertyset = PropertySet.create(cursorreader.getColumnCount());
        propertyset.put(PlaylistProperty.URN, Urn.forPlaylist(cursorreader.getLong("_id")));
        propertyset.put(PlaylistProperty.TITLE, cursorreader.getString("title"));
        propertyset.put(PlaylistProperty.CREATOR_NAME, cursorreader.getString("sound_user_username"));
        propertyset.put(PlaylistProperty.TRACK_COUNT, Integer.valueOf(readTrackCount(cursorreader)));
        propertyset.put(PlaylistProperty.LIKES_COUNT, Integer.valueOf(cursorreader.getInt("favoritings_count")));
        propertyset.put(PlaylistProperty.IS_PRIVATE, Boolean.valueOf(Sharing.PRIVATE.name().equalsIgnoreCase(cursorreader.getString("sharing"))));
        propertyset.put(PlayableProperty.IS_LIKED, Boolean.valueOf(cursorreader.isNotNull("liked_id")));
        propertyset.put(PlayableProperty.IS_REPOSTED, Boolean.valueOf("repost".equals(cursorreader.getString("type"))));
        propertyset.put(PostProperty.CREATED_AT, cursorreader.getDateFromTimestamp("created_at"));
        return propertyset;
    }

    public volatile Object map(CursorReader cursorreader)
    {
        return map(cursorreader);
    }

    int readTrackCount(CursorReader cursorreader)
    {
        return Math.max(cursorreader.getInt("local_track_count"), cursorreader.getInt("track_count"));
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
