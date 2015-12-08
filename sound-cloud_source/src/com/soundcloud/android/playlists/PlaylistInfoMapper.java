// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import com.soundcloud.android.model.PlayableProperty;
import com.soundcloud.android.model.Urn;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.propeller.CursorReader;

// Referenced classes of package com.soundcloud.android.playlists:
//            OfflinePlaylistMapper, PlaylistProperty

public class PlaylistInfoMapper extends OfflinePlaylistMapper
{

    private final Urn loggedInUserUrn;

    public PlaylistInfoMapper(Urn urn)
    {
        loggedInUserUrn = urn;
    }

    public PropertySet map(CursorReader cursorreader)
    {
        PropertySet propertyset = super.map(cursorreader);
        Object obj = readCreatorUrn(cursorreader);
        propertyset.put(PlaylistProperty.CREATOR_URN, obj);
        propertyset.put(PlaylistProperty.DURATION, Long.valueOf(cursorreader.getLong("duration")));
        propertyset.put(PlaylistProperty.REPOSTS_COUNT, Integer.valueOf(cursorreader.getInt("reposts_count")));
        propertyset.put(PlaylistProperty.CREATED_AT, cursorreader.getDateFromTimestamp("created_at"));
        propertyset.put(PlayableProperty.IS_LIKED, Boolean.valueOf(cursorreader.getBoolean("sound_user_like")));
        propertyset.put(PlayableProperty.IS_REPOSTED, Boolean.valueOf(cursorreader.getBoolean("sound_user_repost")));
        propertyset.put(PlaylistProperty.IS_POSTED, Boolean.valueOf(((Urn) (obj)).equals(loggedInUserUrn)));
        cursorreader = cursorreader.getString("permalink_url");
        obj = PlaylistProperty.PERMALINK_URL;
        if (cursorreader == null)
        {
            cursorreader = "";
        }
        propertyset.put(((com.soundcloud.java.collections.Property) (obj)), cursorreader);
        return propertyset;
    }

    public volatile Object map(CursorReader cursorreader)
    {
        return map(cursorreader);
    }
}
