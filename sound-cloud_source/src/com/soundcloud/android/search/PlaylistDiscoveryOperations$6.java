// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.search;

import com.soundcloud.android.api.model.Link;
import com.soundcloud.android.playlists.ApiPlaylistCollection;
import com.soundcloud.java.optional.Optional;
import com.soundcloud.rx.Pager;
import rx.b;

// Referenced classes of package com.soundcloud.android.search:
//            PlaylistDiscoveryOperations

class val.searchTag
    implements com.soundcloud.rx.perations._cls6
{

    final PlaylistDiscoveryOperations this$0;
    final String val$searchTag;

    public volatile Object call(Object obj)
    {
        return call((ApiPlaylistCollection)obj);
    }

    public b call(ApiPlaylistCollection apiplaylistcollection)
    {
        apiplaylistcollection = apiplaylistcollection.getNextLink();
        if (apiplaylistcollection.isPresent())
        {
            return PlaylistDiscoveryOperations.access$300(PlaylistDiscoveryOperations.this, val$searchTag, ((Link)apiplaylistcollection.get()).getHref());
        } else
        {
            return Pager.finish();
        }
    }

    A()
    {
        this$0 = final_playlistdiscoveryoperations;
        val$searchTag = String.this;
        super();
    }
}
