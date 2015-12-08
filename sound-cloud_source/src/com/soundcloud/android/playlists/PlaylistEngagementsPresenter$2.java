// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import com.soundcloud.android.model.EntityProperty;
import com.soundcloud.android.model.Urn;
import com.soundcloud.java.collections.PropertySet;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistWithTracks, PlaylistEngagementsPresenter

class val.playlistWithTracks
    implements f
{

    final PlaylistEngagementsPresenter this$0;
    final PlaylistWithTracks val$playlistWithTracks;

    public Boolean call(PropertySet propertyset)
    {
        return Boolean.valueOf(((Urn)propertyset.get(EntityProperty.URN)).equals(val$playlistWithTracks.getUrn()));
    }

    public volatile Object call(Object obj)
    {
        return call((PropertySet)obj);
    }

    ()
    {
        this$0 = final_playlistengagementspresenter;
        val$playlistWithTracks = PlaylistWithTracks.this;
        super();
    }
}
