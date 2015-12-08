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
//            DiscoveryFragment, DiscoveryPresenter

public final class  extends b
    implements a, Provider
{

    private b presenter;
    private b supertype;

    public final void attach(l l1)
    {
        presenter = l1.a("com.soundcloud.android.discovery.DiscoveryPresenter", com/soundcloud/android/discovery/DiscoveryFragment, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.lightcycle.LightCycleSupportFragment", com/soundcloud/android/discovery/DiscoveryFragment, getClass().getClassLoader(), false);
    }

    public final DiscoveryFragment get()
    {
        DiscoveryFragment discoveryfragment = new DiscoveryFragment();
        injectMembers(discoveryfragment);
        return discoveryfragment;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(presenter);
        set1.add(supertype);
    }

    public final void injectMembers(DiscoveryFragment discoveryfragment)
    {
        discoveryfragment.presenter = (DiscoveryPresenter)presenter.get();
        supertype.injectMembers(discoveryfragment);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((DiscoveryFragment)obj);
    }

    public ()
    {
        super("com.soundcloud.android.discovery.DiscoveryFragment", "members/com.soundcloud.android.discovery.DiscoveryFragment", false, com/soundcloud/android/discovery/DiscoveryFragment);
    }
}
