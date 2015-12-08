// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.main.home;

import com.nbcsports.liveextra.content.ContentService;
import com.nbcsports.liveextra.ui.main.core.AssetViewModelTransformer;
import com.nbcsports.liveextra.ui.main.showcase.ShowcasePresenter;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.nbcsports.liveextra.ui.main.home:
//            HomeListPresenter

public final class HomeListPresenter_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final MembersInjector membersInjector;
    private final Provider serviceProvider;
    private final Provider showcasePresenterProvider;
    private final Provider sportProvider;
    private final Provider transformerProvider;

    public HomeListPresenter_Factory(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3)
    {
        if (!$assertionsDisabled && membersinjector == null)
        {
            throw new AssertionError();
        }
        membersInjector = membersinjector;
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        serviceProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        transformerProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        showcasePresenterProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        } else
        {
            sportProvider = provider3;
            return;
        }
    }

    public static Factory create(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3)
    {
        return new HomeListPresenter_Factory(membersinjector, provider, provider1, provider2, provider3);
    }

    public HomeListPresenter get()
    {
        HomeListPresenter homelistpresenter = new HomeListPresenter((ContentService)serviceProvider.get(), (AssetViewModelTransformer)transformerProvider.get(), (ShowcasePresenter)showcasePresenterProvider.get(), sportProvider);
        membersInjector.injectMembers(homelistpresenter);
        return homelistpresenter;
    }

    public volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/ui/main/home/HomeListPresenter_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
