// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi;

import com.nbcsports.liveextra.library.configuration.Configuration;
import com.nbcsports.liveextra.library.tve.AuthService;
import com.nbcsports.liveextra.ui.main.core.SectionSelector;
import com.phunware.nbc.sochi.metrics.TrackingHelper;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.phunware.nbc.sochi:
//            MainNavigationContentActivity

public final class MainNavigationContentActivity_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider configProvider;
    private final Provider passProvider;
    private final Provider selectorProvider;
    private final MembersInjector supertypeInjector;
    private final Provider trackingHelperProvider;

    public MainNavigationContentActivity_MembersInjector(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3)
    {
        if (!$assertionsDisabled && membersinjector == null)
        {
            throw new AssertionError();
        }
        supertypeInjector = membersinjector;
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        selectorProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        configProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        trackingHelperProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        } else
        {
            passProvider = provider3;
            return;
        }
    }

    public static MembersInjector create(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3)
    {
        return new MainNavigationContentActivity_MembersInjector(membersinjector, provider, provider1, provider2, provider3);
    }

    public void injectMembers(MainNavigationContentActivity mainnavigationcontentactivity)
    {
        if (mainnavigationcontentactivity == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            supertypeInjector.injectMembers(mainnavigationcontentactivity);
            mainnavigationcontentactivity.selector = (SectionSelector)selectorProvider.get();
            mainnavigationcontentactivity.config = (Configuration)configProvider.get();
            mainnavigationcontentactivity.trackingHelper = (TrackingHelper)trackingHelperProvider.get();
            mainnavigationcontentactivity.pass = (AuthService)passProvider.get();
            return;
        }
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((MainNavigationContentActivity)obj);
    }

    static 
    {
        boolean flag;
        if (!com/phunware/nbc/sochi/MainNavigationContentActivity_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
