// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.search;

import com.soundcloud.android.tracks.TrackItemRenderer;
import com.soundcloud.android.view.adapters.FollowableUserItemRenderer;
import com.soundcloud.android.view.adapters.PlaylistItemRenderer;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.search:
//            SearchResultsAdapter

public final class  extends b
    implements a, Provider
{

    private b playlistRenderer;
    private b supertype;
    private b trackRenderer;
    private b userRenderer;

    public final void attach(l l1)
    {
        userRenderer = l1.a("com.soundcloud.android.view.adapters.FollowableUserItemRenderer", com/soundcloud/android/search/SearchResultsAdapter, getClass().getClassLoader());
        trackRenderer = l1.a("com.soundcloud.android.tracks.TrackItemRenderer", com/soundcloud/android/search/SearchResultsAdapter, getClass().getClassLoader());
        playlistRenderer = l1.a("com.soundcloud.android.view.adapters.PlaylistItemRenderer", com/soundcloud/android/search/SearchResultsAdapter, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.presentation.PagingRecyclerItemAdapter", com/soundcloud/android/search/SearchResultsAdapter, getClass().getClassLoader(), false);
    }

    public final SearchResultsAdapter get()
    {
        SearchResultsAdapter searchresultsadapter = new SearchResultsAdapter((FollowableUserItemRenderer)userRenderer.get(), (TrackItemRenderer)trackRenderer.get(), (PlaylistItemRenderer)playlistRenderer.get());
        injectMembers(searchresultsadapter);
        return searchresultsadapter;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(userRenderer);
        set.add(trackRenderer);
        set.add(playlistRenderer);
        set1.add(supertype);
    }

    public final void injectMembers(SearchResultsAdapter searchresultsadapter)
    {
        supertype.injectMembers(searchresultsadapter);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((SearchResultsAdapter)obj);
    }

    public ()
    {
        super("com.soundcloud.android.search.SearchResultsAdapter", "members/com.soundcloud.android.search.SearchResultsAdapter", false, com/soundcloud/android/search/SearchResultsAdapter);
    }
}
