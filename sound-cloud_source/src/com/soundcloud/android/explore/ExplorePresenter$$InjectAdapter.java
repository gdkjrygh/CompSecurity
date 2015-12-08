// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.explore;

import android.content.res.Resources;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.explore:
//            ExplorePresenter, ExplorePagerAdapterFactory, ExplorePagerScreenListener

public final class  extends b
    implements a, Provider
{

    private b adapterFactory;
    private b resources;
    private b screenListener;
    private b supertype;

    public final void attach(l l1)
    {
        resources = l1.a("android.content.res.Resources", com/soundcloud/android/explore/ExplorePresenter, getClass().getClassLoader());
        adapterFactory = l1.a("com.soundcloud.android.explore.ExplorePagerAdapterFactory", com/soundcloud/android/explore/ExplorePresenter, getClass().getClassLoader());
        screenListener = l1.a("com.soundcloud.android.explore.ExplorePagerScreenListener", com/soundcloud/android/explore/ExplorePresenter, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.lightcycle.DefaultActivityLightCycle", com/soundcloud/android/explore/ExplorePresenter, getClass().getClassLoader(), false);
    }

    public final ExplorePresenter get()
    {
        ExplorePresenter explorepresenter = new ExplorePresenter((Resources)resources.get(), (ExplorePagerAdapterFactory)adapterFactory.get(), (ExplorePagerScreenListener)screenListener.get());
        injectMembers(explorepresenter);
        return explorepresenter;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(resources);
        set.add(adapterFactory);
        set.add(screenListener);
        set1.add(supertype);
    }

    public final void injectMembers(ExplorePresenter explorepresenter)
    {
        supertype.injectMembers(explorepresenter);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ExplorePresenter)obj);
    }

    public ()
    {
        super("com.soundcloud.android.explore.ExplorePresenter", "members/com.soundcloud.android.explore.ExplorePresenter", false, com/soundcloud/android/explore/ExplorePresenter);
    }
}
