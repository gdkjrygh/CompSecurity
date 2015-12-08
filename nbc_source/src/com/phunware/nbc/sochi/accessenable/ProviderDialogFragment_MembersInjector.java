// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.accessenable;

import com.nbcsports.liveextra.library.configuration.Configuration;
import com.nbcsports.liveextra.library.tve.AuthService;
import com.phunware.nbc.sochi.metrics.TrackingHelper;
import com.squareup.picasso.Picasso;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.phunware.nbc.sochi.accessenable:
//            ProviderDialogFragment

public final class ProviderDialogFragment_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider configProvider;
    private final Provider passProvider;
    private final Provider picassoProvider;
    private final MembersInjector supertypeInjector;
    private final Provider trackingHelperProvider;

    public ProviderDialogFragment_MembersInjector(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3)
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
        }
        passProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        picassoProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        } else
        {
            trackingHelperProvider = provider3;
            return;
        }
    }

    public static MembersInjector create(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3)
    {
        return new ProviderDialogFragment_MembersInjector(membersinjector, provider, provider1, provider2, provider3);
    }

    public void injectMembers(ProviderDialogFragment providerdialogfragment)
    {
        if (providerdialogfragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            supertypeInjector.injectMembers(providerdialogfragment);
            providerdialogfragment.config = (Configuration)configProvider.get();
            providerdialogfragment.pass = (AuthService)passProvider.get();
            providerdialogfragment.picasso = (Picasso)picassoProvider.get();
            providerdialogfragment.trackingHelper = (TrackingHelper)trackingHelperProvider.get();
            return;
        }
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((ProviderDialogFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!com/phunware/nbc/sochi/accessenable/ProviderDialogFragment_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
