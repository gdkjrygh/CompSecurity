// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.playlists;

import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playlists.PlaylistTrackProperty;
import com.soundcloud.java.collections.Property;
import com.soundcloud.java.collections.PropertyBinding;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.propeller.CursorReader;
import com.soundcloud.propeller.rx.RxResultMapper;

// Referenced classes of package com.soundcloud.android.sync.playlists:
//            LoadPlaylistTracksWithChangesCommand

private class <init> extends RxResultMapper
{

    final LoadPlaylistTracksWithChangesCommand this$0;

    public PropertySet map(CursorReader cursorreader)
    {
        Object obj = Urn.forTrack(cursorreader.getLong("track_id"));
        obj = PropertySet.from(new PropertyBinding[] {
            PlaylistTrackProperty.TRACK_URN.bind(obj)
        });
        if (cursorreader.isNotNull("added_at"))
        {
            ((PropertySet) (obj)).put(PlaylistTrackProperty.ADDED_AT, cursorreader.getDateFromTimestamp("added_at"));
        }
        if (cursorreader.isNotNull("removed_at"))
        {
            ((PropertySet) (obj)).put(PlaylistTrackProperty.REMOVED_AT, cursorreader.getDateFromTimestamp("removed_at"));
        }
        return ((PropertySet) (obj));
    }

    public volatile Object map(CursorReader cursorreader)
    {
        return map(cursorreader);
    }

    private ()
    {
        this$0 = LoadPlaylistTracksWithChangesCommand.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
