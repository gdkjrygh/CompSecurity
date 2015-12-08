// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import com.soundcloud.android.model.EntityProperty;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playlists.PlaylistItem;
import com.soundcloud.android.tracks.TrackItem;
import com.soundcloud.java.collections.PropertySet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.profile:
//            ProfilePlayablePresenter

class this._cls0
    implements f
{

    final ProfilePlayablePresenter this$0;

    public volatile Object call(Object obj)
    {
        return call((Iterable)obj);
    }

    public List call(Iterable iterable)
    {
        ArrayList arraylist = new ArrayList();
        iterable = iterable.iterator();
        do
        {
            if (!iterable.hasNext())
            {
                break;
            }
            PropertySet propertyset = (PropertySet)iterable.next();
            Urn urn = (Urn)propertyset.get(EntityProperty.URN);
            if (urn.isTrack())
            {
                arraylist.add(TrackItem.from(propertyset));
            } else
            if (urn.isPlaylist())
            {
                arraylist.add(PlaylistItem.from(propertyset));
            }
        } while (true);
        return arraylist;
    }

    ()
    {
        this$0 = ProfilePlayablePresenter.this;
        super();
    }
}
