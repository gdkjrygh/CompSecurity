// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import com.soundcloud.android.offline.OfflineProperty;
import com.soundcloud.android.offline.OfflineState;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.propeller.CursorReader;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistMapper

public abstract class OfflinePlaylistMapper extends PlaylistMapper
{

    public static final String HAS_OFFLINE_TRACKS = "has_offline_tracks";
    public static final String HAS_PENDING_DOWNLOAD_REQUEST = "has_pending_download_request";
    public static final String IS_MARKED_FOR_OFFLINE = "is_marked_for_offline";

    public OfflinePlaylistMapper()
    {
    }

    public PropertySet map(CursorReader cursorreader)
    {
        PropertySet propertyset = super.map(cursorreader);
        boolean flag = cursorreader.getBoolean("is_marked_for_offline");
        propertyset.put(com.soundcloud.android.offline.OfflineProperty.Collection.IS_MARKED_FOR_OFFLINE, Boolean.valueOf(flag));
        if (flag)
        {
            if (cursorreader.getBoolean("has_pending_download_request"))
            {
                cursorreader = OfflineState.REQUESTED;
            } else
            if (cursorreader.getBoolean("has_offline_tracks"))
            {
                cursorreader = OfflineState.DOWNLOADED;
            } else
            {
                cursorreader = OfflineState.UNAVAILABLE;
            }
            propertyset.put(OfflineProperty.OFFLINE_STATE, cursorreader);
        }
        return propertyset;
    }

    public volatile Object map(CursorReader cursorreader)
    {
        return map(cursorreader);
    }
}
