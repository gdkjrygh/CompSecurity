// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import com.soundcloud.android.api.model.PagedRemoteCollection;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playlists.PlaylistProperty;
import com.soundcloud.android.search.LoadPlaylistLikedStatuses;
import com.soundcloud.java.collections.PropertySet;
import java.util.Iterator;
import java.util.Map;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.profile:
//            UserProfileOperations

class this._cls0
    implements f
{

    final UserProfileOperations this$0;

    public PagedRemoteCollection call(PagedRemoteCollection pagedremotecollection)
    {
        Map map = UserProfileOperations.access$000(UserProfileOperations.this).call(pagedremotecollection);
        Iterator iterator = pagedremotecollection.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            PropertySet propertyset = (PropertySet)iterator.next();
            Urn urn = (Urn)propertyset.getOrElse(PlaylistProperty.URN, Urn.NOT_SET);
            if (map.containsKey(urn))
            {
                propertyset.update((PropertySet)map.get(urn));
            }
        } while (true);
        return pagedremotecollection;
    }

    public volatile Object call(Object obj)
    {
        return call((PagedRemoteCollection)obj);
    }

    ()
    {
        this$0 = UserProfileOperations.this;
        super();
    }
}
