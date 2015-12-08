// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.accessenable;

import com.nbcsports.liveextra.library.tve.AuthService;
import com.phunware.nbc.sochi.metrics.TrackingHelper;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.phunware.nbc.sochi.accessenable:
//            SelectProviderActivity

public final class SelectProviderActivity_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider passProvider;
    private final MembersInjector supertypeInjector;
    private final Provider trackingHelperProvider;

    public SelectProviderActivity_MembersInjector(MembersInjector membersinjector, Provider provider, Provider provider1)
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
        passProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        } else
        {
            trackingHelperProvider = provider1;
            return;
        }
    }

    public static MembersInjector create(MembersInjector membersinjector, Provider provider, Provider provider1)
    {
        return new SelectProviderActivity_MembersInjector(membersinjector, provider, provider1);
    }

    public void injectMembers(SelectProviderActivity selectprovideractivity)
    {
        if (selectprovideractivity == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            supertypeInjector.injectMembers(selectprovideractivity);
            selectprovideractivity.pass = (AuthService)passProvider.get();
            selectprovideractivity.trackingHelper = (TrackingHelper)trackingHelperProvider.get();
            return;
        }
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((SelectProviderActivity)obj);
    }

    static 
    {
        boolean flag;
        if (!com/phunware/nbc/sochi/accessenable/SelectProviderActivity_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
