// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.model.PostProperty;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playlists.PlaylistProperty;
import com.soundcloud.android.tracks.TrackProperty;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.propeller.CursorReader;
import com.soundcloud.propeller.rx.RxResultMapper;

// Referenced classes of package com.soundcloud.android.profile:
//            PostsStorage

private class <init> extends RxResultMapper
{

    final PostsStorage this$0;

    public PropertySet map(CursorReader cursorreader)
    {
        PropertySet propertyset = PropertySet.create(cursorreader.getColumnCount());
        if (cursorreader.getInt("_type") == 0)
        {
            propertyset.put(TrackProperty.URN, Urn.forTrack(cursorreader.getLong("_id")));
        } else
        {
            propertyset.put(PlaylistProperty.URN, Urn.forPlaylist(cursorreader.getLong("_id")));
        }
        if ("repost".equals(cursorreader.getString("type")))
        {
            propertyset.put(PostProperty.REPOSTER_URN, PostsStorage.access$400(PostsStorage.this).getLoggedInUserUrn());
        }
        return propertyset;
    }

    public volatile Object map(CursorReader cursorreader)
    {
        return map(cursorreader);
    }

    private ()
    {
        this$0 = PostsStorage.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
