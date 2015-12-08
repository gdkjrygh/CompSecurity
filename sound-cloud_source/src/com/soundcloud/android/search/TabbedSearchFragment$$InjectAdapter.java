// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.search;

import android.content.res.Resources;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.search:
//            TabbedSearchFragment

public final class  extends b
    implements a, Provider
{

    private b eventBus;
    private b resources;

    public final void attach(l l1)
    {
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/search/TabbedSearchFragment, getClass().getClassLoader());
        resources = l1.a("android.content.res.Resources", com/soundcloud/android/search/TabbedSearchFragment, getClass().getClassLoader());
    }

    public final TabbedSearchFragment get()
    {
        TabbedSearchFragment tabbedsearchfragment = new TabbedSearchFragment();
        injectMembers(tabbedsearchfragment);
        return tabbedsearchfragment;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(eventBus);
        set1.add(resources);
    }

    public final void injectMembers(TabbedSearchFragment tabbedsearchfragment)
    {
        tabbedsearchfragment.eventBus = (EventBus)eventBus.get();
        tabbedsearchfragment.resources = (Resources)resources.get();
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((TabbedSearchFragment)obj);
    }

    public ()
    {
        super("com.soundcloud.android.search.TabbedSearchFragment", "members/com.soundcloud.android.search.TabbedSearchFragment", false, com/soundcloud/android/search/TabbedSearchFragment);
    }
}
