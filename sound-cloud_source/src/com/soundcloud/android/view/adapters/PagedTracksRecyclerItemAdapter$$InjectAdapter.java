// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view.adapters;

import com.soundcloud.android.tracks.DownloadableTrackItemRenderer;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.view.adapters:
//            PagedTracksRecyclerItemAdapter

public final class  extends b
    implements a, Provider
{

    private b supertype;
    private b trackRenderer;

    public final void attach(l l1)
    {
        trackRenderer = l1.a("com.soundcloud.android.tracks.DownloadableTrackItemRenderer", com/soundcloud/android/view/adapters/PagedTracksRecyclerItemAdapter, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.presentation.PagingRecyclerItemAdapter", com/soundcloud/android/view/adapters/PagedTracksRecyclerItemAdapter, getClass().getClassLoader(), false);
    }

    public final PagedTracksRecyclerItemAdapter get()
    {
        PagedTracksRecyclerItemAdapter pagedtracksrecycleritemadapter = new PagedTracksRecyclerItemAdapter((DownloadableTrackItemRenderer)trackRenderer.get());
        injectMembers(pagedtracksrecycleritemadapter);
        return pagedtracksrecycleritemadapter;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(trackRenderer);
        set1.add(supertype);
    }

    public final void injectMembers(PagedTracksRecyclerItemAdapter pagedtracksrecycleritemadapter)
    {
        supertype.injectMembers(pagedtracksrecycleritemadapter);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((PagedTracksRecyclerItemAdapter)obj);
    }

    public ()
    {
        super("com.soundcloud.android.view.adapters.PagedTracksRecyclerItemAdapter", "members/com.soundcloud.android.view.adapters.PagedTracksRecyclerItemAdapter", false, com/soundcloud/android/view/adapters/PagedTracksRecyclerItemAdapter);
    }
}
