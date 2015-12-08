// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.posts;

import com.soundcloud.android.api.model.Sharing;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playlists.PlaylistProperty;
import com.soundcloud.java.collections.Property;
import com.soundcloud.java.collections.PropertyBinding;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.propeller.CursorReader;
import com.soundcloud.propeller.ResultMapper;

// Referenced classes of package com.soundcloud.android.sync.posts:
//            LoadLocalPlaylistsCommand

private static final class <init>
    implements ResultMapper
{

    public final PropertySet map(CursorReader cursorreader)
    {
        return PropertySet.from(new PropertyBinding[] {
            PlaylistProperty.URN.bind(Urn.forPlaylist(cursorreader.getLong("_id"))), PlaylistProperty.TITLE.bind(cursorreader.getString("title")), PlaylistProperty.IS_PRIVATE.bind(Boolean.valueOf(Sharing.PRIVATE.value().equals(cursorreader.getString("sharing"))))
        });
    }

    public final volatile Object map(CursorReader cursorreader)
    {
        return map(cursorreader);
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
