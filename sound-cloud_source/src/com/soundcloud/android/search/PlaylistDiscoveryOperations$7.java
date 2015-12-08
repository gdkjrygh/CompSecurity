// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.search;

import com.soundcloud.android.api.model.ApiPlaylist;
import com.soundcloud.android.playlists.ApiPlaylistCollection;
import java.util.Iterator;
import java.util.LinkedList;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.search:
//            PlaylistDiscoveryOperations

class val.searchTag
    implements f
{

    final PlaylistDiscoveryOperations this$0;
    final String val$searchTag;

    public ApiPlaylistCollection call(ApiPlaylistCollection apiplaylistcollection)
    {
        ApiPlaylist apiplaylist;
        LinkedList linkedlist;
        for (Iterator iterator = apiplaylistcollection.iterator(); iterator.hasNext(); apiplaylist.setTags(linkedlist))
        {
            apiplaylist = (ApiPlaylist)iterator.next();
            linkedlist = new LinkedList(PlaylistDiscoveryOperations.access$400(PlaylistDiscoveryOperations.this, apiplaylist.getTags(), val$searchTag));
            linkedlist.addFirst(val$searchTag);
        }

        return apiplaylistcollection;
    }

    public volatile Object call(Object obj)
    {
        return call((ApiPlaylistCollection)obj);
    }

    A()
    {
        this$0 = final_playlistdiscoveryoperations;
        val$searchTag = String.this;
        super();
    }
}
