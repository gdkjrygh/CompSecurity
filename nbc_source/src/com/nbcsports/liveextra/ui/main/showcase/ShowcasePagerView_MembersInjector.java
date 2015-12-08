// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.main.showcase;

import com.nbcsports.liveextra.library.configuration.Configuration;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.nbcsports.liveextra.ui.main.showcase:
//            ShowcasePagerView, ShowcasePresenter

public final class ShowcasePagerView_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider configProvider;
    private final Provider presenterProvider;
    private final MembersInjector supertypeInjector;

    public ShowcasePagerView_MembersInjector(MembersInjector membersinjector, Provider provider, Provider provider1)
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
        configProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        } else
        {
            presenterProvider = provider1;
            return;
        }
    }

    public static MembersInjector create(MembersInjector membersinjector, Provider provider, Provider provider1)
    {
        return new ShowcasePagerView_MembersInjector(membersinjector, provider, provider1);
    }

    public void injectMembers(ShowcasePagerView showcasepagerview)
    {
        if (showcasepagerview == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            supertypeInjector.injectMembers(showcasepagerview);
            showcasepagerview.config = (Configuration)configProvider.get();
            showcasepagerview.presenter = (ShowcasePresenter)presenterProvider.get();
            return;
        }
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((ShowcasePagerView)obj);
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/ui/main/showcase/ShowcasePagerView_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
