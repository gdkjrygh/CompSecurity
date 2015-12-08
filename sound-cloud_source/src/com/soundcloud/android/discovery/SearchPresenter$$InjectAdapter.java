// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.discovery;

import android.content.res.Resources;
import com.soundcloud.android.search.suggestions.SuggestionsAdapter;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.discovery:
//            SearchPresenter, SuggestionsHelperFactory

public final class  extends b
    implements a, Provider
{

    private b adapter;
    private b eventbus;
    private b resources;
    private b suggestionsHelperFactory;
    private b supertype;

    public final void attach(l l1)
    {
        eventbus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/discovery/SearchPresenter, getClass().getClassLoader());
        resources = l1.a("android.content.res.Resources", com/soundcloud/android/discovery/SearchPresenter, getClass().getClassLoader());
        adapter = l1.a("com.soundcloud.android.search.suggestions.SuggestionsAdapter", com/soundcloud/android/discovery/SearchPresenter, getClass().getClassLoader());
        suggestionsHelperFactory = l1.a("com.soundcloud.android.discovery.SuggestionsHelperFactory", com/soundcloud/android/discovery/SearchPresenter, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.lightcycle.DefaultActivityLightCycle", com/soundcloud/android/discovery/SearchPresenter, getClass().getClassLoader(), false);
    }

    public final SearchPresenter get()
    {
        SearchPresenter searchpresenter = new SearchPresenter((EventBus)eventbus.get(), (Resources)resources.get(), (SuggestionsAdapter)adapter.get(), (SuggestionsHelperFactory)suggestionsHelperFactory.get());
        injectMembers(searchpresenter);
        return searchpresenter;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(eventbus);
        set.add(resources);
        set.add(adapter);
        set.add(suggestionsHelperFactory);
        set1.add(supertype);
    }

    public final void injectMembers(SearchPresenter searchpresenter)
    {
        supertype.injectMembers(searchpresenter);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((SearchPresenter)obj);
    }

    public ()
    {
        super("com.soundcloud.android.discovery.SearchPresenter", "members/com.soundcloud.android.discovery.SearchPresenter", false, com/soundcloud/android/discovery/SearchPresenter);
    }
}
