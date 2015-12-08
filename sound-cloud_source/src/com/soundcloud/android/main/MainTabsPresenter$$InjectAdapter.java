// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.main;

import com.soundcloud.android.view.screen.BaseLayoutHelper;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.main:
//            MainTabsPresenter, NavigationModel

public final class  extends b
    implements a, Provider
{

    private b eventBus;
    private b layoutHelper;
    private b navigationModel;
    private b pagerAdapterFactory;
    private b supertype;

    public final void attach(l l1)
    {
        navigationModel = l1.a("com.soundcloud.android.main.NavigationModel", com/soundcloud/android/main/MainTabsPresenter, getClass().getClassLoader());
        layoutHelper = l1.a("com.soundcloud.android.view.screen.BaseLayoutHelper", com/soundcloud/android/main/MainTabsPresenter, getClass().getClassLoader());
        pagerAdapterFactory = l1.a("com.soundcloud.android.main.MainPagerAdapter$Factory", com/soundcloud/android/main/MainTabsPresenter, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/main/MainTabsPresenter, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.lightcycle.DefaultActivityLightCycle", com/soundcloud/android/main/MainTabsPresenter, getClass().getClassLoader(), false);
    }

    public final MainTabsPresenter get()
    {
        MainTabsPresenter maintabspresenter = new MainTabsPresenter((NavigationModel)navigationModel.get(), (BaseLayoutHelper)layoutHelper.get(), (layoutHelper)pagerAdapterFactory.get(), (EventBus)eventBus.get());
        injectMembers(maintabspresenter);
        return maintabspresenter;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(navigationModel);
        set.add(layoutHelper);
        set.add(pagerAdapterFactory);
        set.add(eventBus);
        set1.add(supertype);
    }

    public final void injectMembers(MainTabsPresenter maintabspresenter)
    {
        supertype.injectMembers(maintabspresenter);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((MainTabsPresenter)obj);
    }

    public ()
    {
        super("com.soundcloud.android.main.MainTabsPresenter", "members/com.soundcloud.android.main.MainTabsPresenter", false, com/soundcloud/android/main/MainTabsPresenter);
    }
}
