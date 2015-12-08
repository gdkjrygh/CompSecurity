// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.search;

import com.soundcloud.android.presentation.SwipeRefreshAttacher;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.search:
//            SearchResultsPresenter, SearchOperations, SearchResultsAdapter

public final class I extends b
    implements a, Provider
{

    private b adapter;
    private b clickListenerFactory;
    private b eventBus;
    private b searchOperations;
    private b supertype;
    private b swipeRefreshAttacher;

    public final void attach(l l1)
    {
        swipeRefreshAttacher = l1.a("com.soundcloud.android.presentation.SwipeRefreshAttacher", com/soundcloud/android/search/SearchResultsPresenter, getClass().getClassLoader());
        searchOperations = l1.a("com.soundcloud.android.search.SearchOperations", com/soundcloud/android/search/SearchResultsPresenter, getClass().getClassLoader());
        adapter = l1.a("com.soundcloud.android.search.SearchResultsAdapter", com/soundcloud/android/search/SearchResultsPresenter, getClass().getClassLoader());
        clickListenerFactory = l1.a("com.soundcloud.android.view.adapters.MixedItemClickListener$Factory", com/soundcloud/android/search/SearchResultsPresenter, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/search/SearchResultsPresenter, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.presentation.RecyclerViewPresenter", com/soundcloud/android/search/SearchResultsPresenter, getClass().getClassLoader(), false);
    }

    public final SearchResultsPresenter get()
    {
        SearchResultsPresenter searchresultspresenter = new SearchResultsPresenter((SwipeRefreshAttacher)swipeRefreshAttacher.get(), (SearchOperations)searchOperations.get(), (SearchResultsAdapter)adapter.get(), (com.soundcloud.android.view.adapters.)clickListenerFactory.get(), (EventBus)eventBus.get());
        injectMembers(searchresultspresenter);
        return searchresultspresenter;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(swipeRefreshAttacher);
        set.add(searchOperations);
        set.add(adapter);
        set.add(clickListenerFactory);
        set.add(eventBus);
        set1.add(supertype);
    }

    public final void injectMembers(SearchResultsPresenter searchresultspresenter)
    {
        supertype.injectMembers(searchresultspresenter);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((SearchResultsPresenter)obj);
    }

    public I()
    {
        super("com.soundcloud.android.search.SearchResultsPresenter", "members/com.soundcloud.android.search.SearchResultsPresenter", false, com/soundcloud/android/search/SearchResultsPresenter);
    }
}
