// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import com.soundcloud.android.model.PlayableProperty;
import com.soundcloud.android.model.PostProperty;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.propeller.CursorReader;

// Referenced classes of package com.soundcloud.android.playlists:
//            OfflinePlaylistMapper

public class PostedPlaylistMapper extends OfflinePlaylistMapper
{

    public PostedPlaylistMapper()
    {
    }

    public PropertySet map(CursorReader cursorreader)
    {
        PropertySet propertyset = super.map(cursorreader);
        propertyset.put(PostProperty.CREATED_AT, cursorreader.getDateFromTimestamp("created_at"));
        propertyset.put(PlayableProperty.IS_LIKED, Boolean.valueOf(cursorreader.getBoolean("sound_user_like")));
        return propertyset;
    }

    public volatile Object map(CursorReader cursorreader)
    {
        return map(cursorreader);
    }
}
