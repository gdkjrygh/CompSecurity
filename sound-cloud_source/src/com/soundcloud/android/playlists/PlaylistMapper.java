// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import com.soundcloud.android.api.model.Sharing;
import com.soundcloud.android.model.Urn;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.propeller.CursorReader;
import com.soundcloud.propeller.rx.RxResultMapper;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistProperty

public abstract class PlaylistMapper extends RxResultMapper
{

    public static final String LOCAL_TRACK_COUNT = "local_track_count";

    public PlaylistMapper()
    {
    }

    static Urn readSoundUrn(CursorReader cursorreader)
    {
        return Urn.forPlaylist(cursorreader.getLong("_id"));
    }

    static int readTrackCount(CursorReader cursorreader)
    {
        return Math.max(cursorreader.getInt("local_track_count"), cursorreader.getInt("track_count"));
    }

    public PropertySet map(CursorReader cursorreader)
    {
        PropertySet propertyset = PropertySet.create(cursorreader.getColumnCount());
        propertyset.put(PlaylistProperty.URN, readSoundUrn(cursorreader));
        propertyset.put(PlaylistProperty.TITLE, cursorreader.getString("title"));
        propertyset.put(PlaylistProperty.CREATOR_NAME, cursorreader.getString("sound_user_username"));
        propertyset.put(PlaylistProperty.TRACK_COUNT, Integer.valueOf(readTrackCount(cursorreader)));
        propertyset.put(PlaylistProperty.LIKES_COUNT, Integer.valueOf(cursorreader.getInt("favoritings_count")));
        propertyset.put(PlaylistProperty.IS_PRIVATE, Boolean.valueOf(Sharing.PRIVATE.name().equalsIgnoreCase(cursorreader.getString("sharing"))));
        return propertyset;
    }

    public volatile Object map(CursorReader cursorreader)
    {
        return map(cursorreader);
    }

    Urn readCreatorUrn(CursorReader cursorreader)
    {
        return Urn.forUser(cursorreader.getLong("sound_user_id"));
    }
}
