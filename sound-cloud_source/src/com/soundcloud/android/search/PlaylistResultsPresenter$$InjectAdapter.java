// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.search;

import com.soundcloud.android.Navigator;
import com.soundcloud.android.presentation.SwipeRefreshAttacher;
import com.soundcloud.android.view.adapters.RecyclerViewParallaxer;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.search:
//            PlaylistResultsPresenter, PlaylistDiscoveryOperations, PlaylistResultsAdapter

public final class  extends b
    implements a, Provider
{

    private b adapter;
    private b eventBus;
    private b navigator;
    private b operations;
    private b parallaxer;
    private b supertype;
    private b swipeRefreshAttacher;

    public final void attach(l l1)
    {
        operations = l1.a("com.soundcloud.android.search.PlaylistDiscoveryOperations", com/soundcloud/android/search/PlaylistResultsPresenter, getClass().getClassLoader());
        adapter = l1.a("com.soundcloud.android.search.PlaylistResultsAdapter", com/soundcloud/android/search/PlaylistResultsPresenter, getClass().getClassLoader());
        swipeRefreshAttacher = l1.a("com.soundcloud.android.presentation.SwipeRefreshAttacher", com/soundcloud/android/search/PlaylistResultsPresenter, getClass().getClassLoader());
        parallaxer = l1.a("com.soundcloud.android.view.adapters.RecyclerViewParallaxer", com/soundcloud/android/search/PlaylistResultsPresenter, getClass().getClassLoader());
        navigator = l1.a("com.soundcloud.android.Navigator", com/soundcloud/android/search/PlaylistResultsPresenter, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/search/PlaylistResultsPresenter, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.presentation.RecyclerViewPresenter", com/soundcloud/android/search/PlaylistResultsPresenter, getClass().getClassLoader(), false);
    }

    public final PlaylistResultsPresenter get()
    {
        PlaylistResultsPresenter playlistresultspresenter = new PlaylistResultsPresenter((PlaylistDiscoveryOperations)operations.get(), (PlaylistResultsAdapter)adapter.get(), (SwipeRefreshAttacher)swipeRefreshAttacher.get(), (RecyclerViewParallaxer)parallaxer.get(), (Navigator)navigator.get(), (EventBus)eventBus.get());
        injectMembers(playlistresultspresenter);
        return playlistresultspresenter;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(operations);
        set.add(adapter);
        set.add(swipeRefreshAttacher);
        set.add(parallaxer);
        set.add(navigator);
        set.add(eventBus);
        set1.add(supertype);
    }

    public final void injectMembers(PlaylistResultsPresenter playlistresultspresenter)
    {
        supertype.injectMembers(playlistresultspresenter);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((PlaylistResultsPresenter)obj);
    }

    public ()
    {
        super("com.soundcloud.android.search.PlaylistResultsPresenter", "members/com.soundcloud.android.search.PlaylistResultsPresenter", false, com/soundcloud/android/search/PlaylistResultsPresenter);
    }
}
