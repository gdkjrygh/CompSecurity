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
//            ExploreFragment, ExplorePagerAdapterFactory, ExplorePagerScreenListener

public final class  extends b
    implements a, Provider
{

    private b pagerAdapterFactory;
    private b resources;
    private b screenListener;

    public final void attach(l l1)
    {
        resources = l1.a("android.content.res.Resources", com/soundcloud/android/explore/ExploreFragment, getClass().getClassLoader());
        pagerAdapterFactory = l1.a("com.soundcloud.android.explore.ExplorePagerAdapterFactory", com/soundcloud/android/explore/ExploreFragment, getClass().getClassLoader());
        screenListener = l1.a("com.soundcloud.android.explore.ExplorePagerScreenListener", com/soundcloud/android/explore/ExploreFragment, getClass().getClassLoader());
    }

    public final ExploreFragment get()
    {
        ExploreFragment explorefragment = new ExploreFragment();
        injectMembers(explorefragment);
        return explorefragment;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(resources);
        set1.add(pagerAdapterFactory);
        set1.add(screenListener);
    }

    public final void injectMembers(ExploreFragment explorefragment)
    {
        explorefragment.resources = (Resources)resources.get();
        explorefragment.pagerAdapterFactory = (ExplorePagerAdapterFactory)pagerAdapterFactory.get();
        explorefragment.screenListener = (ExplorePagerScreenListener)screenListener.get();
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ExploreFragment)obj);
    }

    public ()
    {
        super("com.soundcloud.android.explore.ExploreFragment", "members/com.soundcloud.android.explore.ExploreFragment", false, com/soundcloud/android/explore/ExploreFragment);
    }
}
