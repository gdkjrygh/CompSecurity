// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import com.soundcloud.android.likes.LikeProperty;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.propeller.CursorReader;

// Referenced classes of package com.soundcloud.android.playlists:
//            OfflinePlaylistMapper, PlaylistProperty

public class LikedPlaylistMapper extends OfflinePlaylistMapper
{

    public LikedPlaylistMapper()
    {
    }

    public PropertySet map(CursorReader cursorreader)
    {
        PropertySet propertyset = super.map(cursorreader);
        propertyset.put(LikeProperty.CREATED_AT, cursorreader.getDateFromTimestamp("created_at"));
        propertyset.put(PlaylistProperty.IS_LIKED, Boolean.valueOf(true));
        return propertyset;
    }

    public volatile Object map(CursorReader cursorreader)
    {
        return map(cursorreader);
    }
}
