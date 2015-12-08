// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.explore;

import com.soundcloud.android.view.ListViewController;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.explore:
//            ExploreGenresFragment, ExploreTracksOperations, ExploreGenresAdapter

public final class I extends b
    implements a, Provider
{

    private b adapter;
    private b eventBus;
    private b exploreOperations;
    private b listViewController;
    private b supertype;

    public final void attach(l l1)
    {
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/explore/ExploreGenresFragment, getClass().getClassLoader());
        exploreOperations = l1.a("com.soundcloud.android.explore.ExploreTracksOperations", com/soundcloud/android/explore/ExploreGenresFragment, getClass().getClassLoader());
        adapter = l1.a("com.soundcloud.android.explore.ExploreGenresAdapter", com/soundcloud/android/explore/ExploreGenresFragment, getClass().getClassLoader());
        listViewController = l1.a("com.soundcloud.android.view.ListViewController", com/soundcloud/android/explore/ExploreGenresFragment, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.lightcycle.LightCycleSupportFragment", com/soundcloud/android/explore/ExploreGenresFragment, getClass().getClassLoader(), false);
    }

    public final ExploreGenresFragment get()
    {
        ExploreGenresFragment exploregenresfragment = new ExploreGenresFragment();
        injectMembers(exploregenresfragment);
        return exploregenresfragment;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(eventBus);
        set1.add(exploreOperations);
        set1.add(adapter);
        set1.add(listViewController);
        set1.add(supertype);
    }

    public final void injectMembers(ExploreGenresFragment exploregenresfragment)
    {
        exploregenresfragment.eventBus = (EventBus)eventBus.get();
        exploregenresfragment.exploreOperations = (ExploreTracksOperations)exploreOperations.get();
        exploregenresfragment.adapter = (ExploreGenresAdapter)adapter.get();
        exploregenresfragment.listViewController = (ListViewController)listViewController.get();
        supertype.injectMembers(exploregenresfragment);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ExploreGenresFragment)obj);
    }

    public I()
    {
        super("com.soundcloud.android.explore.ExploreGenresFragment", "members/com.soundcloud.android.explore.ExploreGenresFragment", false, com/soundcloud/android/explore/ExploreGenresFragment);
    }
}
