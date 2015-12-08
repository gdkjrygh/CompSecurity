// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.discovery;

import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.discovery:
//            RecommendedTracksFragment, RecommendedTracksPresenter

public final class  extends b
    implements a, Provider
{

    private b recommendedTracksPresenter;
    private b supertype;

    public final void attach(l l1)
    {
        recommendedTracksPresenter = l1.a("com.soundcloud.android.discovery.RecommendedTracksPresenter", com/soundcloud/android/discovery/RecommendedTracksFragment, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.lightcycle.LightCycleSupportFragment", com/soundcloud/android/discovery/RecommendedTracksFragment, getClass().getClassLoader(), false);
    }

    public final RecommendedTracksFragment get()
    {
        RecommendedTracksFragment recommendedtracksfragment = new RecommendedTracksFragment();
        injectMembers(recommendedtracksfragment);
        return recommendedtracksfragment;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(recommendedTracksPresenter);
        set1.add(supertype);
    }

    public final void injectMembers(RecommendedTracksFragment recommendedtracksfragment)
    {
        recommendedtracksfragment.recommendedTracksPresenter = (RecommendedTracksPresenter)recommendedTracksPresenter.get();
        supertype.injectMembers(recommendedtracksfragment);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((RecommendedTracksFragment)obj);
    }

    public ()
    {
        super("com.soundcloud.android.discovery.RecommendedTracksFragment", "members/com.soundcloud.android.discovery.RecommendedTracksFragment", false, com/soundcloud/android/discovery/RecommendedTracksFragment);
    }
}
