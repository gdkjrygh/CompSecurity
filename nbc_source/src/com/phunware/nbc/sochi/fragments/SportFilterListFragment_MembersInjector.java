// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.fragments;

import com.nbcsports.liveextra.library.configuration.Configuration;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.phunware.nbc.sochi.fragments:
//            SportFilterListFragment

public final class SportFilterListFragment_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider configProvider;
    private final MembersInjector supertypeInjector;

    public SportFilterListFragment_MembersInjector(MembersInjector membersinjector, Provider provider)
    {
        if (!$assertionsDisabled && membersinjector == null)
        {
            throw new AssertionError();
        }
        supertypeInjector = membersinjector;
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        } else
        {
            configProvider = provider;
            return;
        }
    }

    public static MembersInjector create(MembersInjector membersinjector, Provider provider)
    {
        return new SportFilterListFragment_MembersInjector(membersinjector, provider);
    }

    public void injectMembers(SportFilterListFragment sportfilterlistfragment)
    {
        if (sportfilterlistfragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            supertypeInjector.injectMembers(sportfilterlistfragment);
            sportfilterlistfragment.config = (Configuration)configProvider.get();
            return;
        }
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((SportFilterListFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!com/phunware/nbc/sochi/fragments/SportFilterListFragment_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
