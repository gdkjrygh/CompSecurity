// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.search;

import com.soundcloud.android.model.EntityProperty;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playlists.PlaylistItem;
import com.soundcloud.android.tracks.TrackItem;
import com.soundcloud.android.users.UserItem;
import com.soundcloud.java.collections.PropertySet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.search:
//            SearchResult

final class 
    implements f
{

    public final volatile Object call(Object obj)
    {
        return call((SearchResult)obj);
    }

    public final List call(SearchResult searchresult)
    {
        Object obj = searchresult.getItems();
        searchresult = new ArrayList(((List) (obj)).size());
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            PropertySet propertyset = (PropertySet)((Iterator) (obj)).next();
            Urn urn = (Urn)propertyset.get(EntityProperty.URN);
            if (urn.isTrack())
            {
                searchresult.add(TrackItem.from(propertyset));
            } else
            if (urn.isPlaylist())
            {
                searchresult.add(PlaylistItem.from(propertyset));
            } else
            if (urn.isUser())
            {
                searchresult.add(UserItem.from(propertyset));
            }
        } while (true);
        return searchresult;
    }

    ()
    {
    }
}
