// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import com.soundcloud.android.model.Urn;
import com.soundcloud.propeller.CursorReader;
import com.soundcloud.propeller.ResultMapper;
import java.util.List;

// Referenced classes of package com.soundcloud.android.offline:
//            LoadExpectedContentCommand

private static class <init>
    implements ResultMapper
{

    private final List syncablePlaylists;

    public <init> map(CursorReader cursorreader)
    {
        Urn urn;
        if (cursorreader.getBoolean("syncable") || !syncablePlaylists.contains(Long.valueOf(cursorreader.getLong("playlist_id"))))
        {
            urn = Urn.forPlaylist(cursorreader.getLong("playlist_id"));
        } else
        {
            urn = Urn.NOT_SET;
        }
        return new init>(cursorreader.getLong("_id"), cursorreader.getLong("user_id"), cursorreader.getLong("duration"), cursorreader.getString("waveform_url"), cursorreader.getBoolean("syncable"), urn);
    }

    public volatile Object map(CursorReader cursorreader)
    {
        return map(cursorreader);
    }

    private (List list)
    {
        syncablePlaylists = list;
    }

    syncablePlaylists(List list, syncablePlaylists syncableplaylists)
    {
        this(list);
    }
}
