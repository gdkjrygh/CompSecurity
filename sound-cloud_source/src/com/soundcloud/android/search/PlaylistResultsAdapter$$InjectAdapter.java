// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.search;

import com.soundcloud.android.view.adapters.PlaylistGridRenderer;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.search:
//            PlaylistResultsAdapter

public final class I extends b
    implements a, Provider
{

    private b cellRenderer;
    private b supertype;

    public final void attach(l l1)
    {
        cellRenderer = l1.a("com.soundcloud.android.view.adapters.PlaylistGridRenderer", com/soundcloud/android/search/PlaylistResultsAdapter, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.presentation.PagingRecyclerItemAdapter", com/soundcloud/android/search/PlaylistResultsAdapter, getClass().getClassLoader(), false);
    }

    public final PlaylistResultsAdapter get()
    {
        PlaylistResultsAdapter playlistresultsadapter = new PlaylistResultsAdapter((PlaylistGridRenderer)cellRenderer.get());
        injectMembers(playlistresultsadapter);
        return playlistresultsadapter;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(cellRenderer);
        set1.add(supertype);
    }

    public final void injectMembers(PlaylistResultsAdapter playlistresultsadapter)
    {
        supertype.injectMembers(playlistresultsadapter);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((PlaylistResultsAdapter)obj);
    }

    public I()
    {
        super("com.soundcloud.android.search.PlaylistResultsAdapter", "members/com.soundcloud.android.search.PlaylistResultsAdapter", false, com/soundcloud/android/search/PlaylistResultsAdapter);
    }
}
