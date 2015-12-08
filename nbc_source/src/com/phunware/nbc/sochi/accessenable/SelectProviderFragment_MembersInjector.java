// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.accessenable;

import com.nbcsports.liveextra.library.configuration.Configuration;
import com.nbcsports.liveextra.library.tve.AuthService;
import com.nbcsports.liveextra.library.tve.MvpdLookups;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.phunware.nbc.sochi.accessenable:
//            SelectProviderFragment

public final class SelectProviderFragment_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider configProvider;
    private final Provider lookupsProvider;
    private final Provider passProvider;
    private final MembersInjector supertypeInjector;

    public SelectProviderFragment_MembersInjector(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2)
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
        lookupsProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        configProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        } else
        {
            passProvider = provider2;
            return;
        }
    }

    public static MembersInjector create(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2)
    {
        return new SelectProviderFragment_MembersInjector(membersinjector, provider, provider1, provider2);
    }

    public void injectMembers(SelectProviderFragment selectproviderfragment)
    {
        if (selectproviderfragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            supertypeInjector.injectMembers(selectproviderfragment);
            selectproviderfragment.lookups = (MvpdLookups)lookupsProvider.get();
            selectproviderfragment.config = (Configuration)configProvider.get();
            selectproviderfragment.pass = (AuthService)passProvider.get();
            return;
        }
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((SelectProviderFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!com/phunware/nbc/sochi/accessenable/SelectProviderFragment_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
