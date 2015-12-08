// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import com.soundcloud.android.api.model.Sharing;
import com.soundcloud.propeller.CursorReader;
import com.soundcloud.propeller.rx.RxResultMapper;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistTracksStorage, AddTrackToPlaylistItem, PlaylistMapper

private static final class <init> extends RxResultMapper
{

    private boolean readPrivateFlag(CursorReader cursorreader)
    {
        return Sharing.PRIVATE.name().equalsIgnoreCase(cursorreader.getString("sharing"));
    }

    public final AddTrackToPlaylistItem map(CursorReader cursorreader)
    {
        return new AddTrackToPlaylistItem(PlaylistMapper.readSoundUrn(cursorreader), cursorreader.getString("title"), PlaylistMapper.readTrackCount(cursorreader), readPrivateFlag(cursorreader), cursorreader.getBoolean("is_marked_for_offline"), cursorreader.getBoolean("track_exists_in_playlist"));
    }

    public final volatile Object map(CursorReader cursorreader)
    {
        return map(cursorreader);
    }

    private Y()
    {
    }

    Y(Y y)
    {
        this();
    }
}
