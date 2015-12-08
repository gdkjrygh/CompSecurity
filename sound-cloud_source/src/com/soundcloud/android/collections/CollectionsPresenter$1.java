// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.collections;

import com.soundcloud.android.playlists.PlaylistItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.collections:
//            MyCollections, CollectionsPresenter, CollectionsOptionsStorage, CollectionsItem

class this._cls0
    implements f
{

    final CollectionsPresenter this$0;

    public volatile Object call(Object obj)
    {
        return call((MyCollections)obj);
    }

    public List call(MyCollections mycollections)
    {
        List list = mycollections.getPlaylistItems();
        ArrayList arraylist = new ArrayList(list.size() + 4);
        if (CollectionsPresenter.access$000(CollectionsPresenter.this).isOnboardingEnabled())
        {
            arraylist.add(CollectionsItem.fromOnboarding());
        }
        arraylist.add(CollectionsItem.fromCollectionsPreview(mycollections.getLikes(), mycollections.getRecentStations()));
        arraylist.add(CollectionsItem.fromPlaylistHeader());
        for (mycollections = list.iterator(); mycollections.hasNext(); arraylist.add(CollectionsItem.fromPlaylistItem((PlaylistItem)mycollections.next()))) { }
        if (CollectionsPresenter.access$100(CollectionsPresenter.this))
        {
            arraylist.add(CollectionsItem.fromKillFilter());
        } else
        if (list.isEmpty())
        {
            arraylist.add(CollectionsItem.fromEmptyPlaylists());
            return arraylist;
        }
        return arraylist;
    }

    ge()
    {
        this$0 = CollectionsPresenter.this;
        super();
    }
}
