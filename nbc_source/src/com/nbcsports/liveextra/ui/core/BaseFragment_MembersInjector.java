// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.core;

import com.nbcsports.liveextra.ads.AdManager;
import com.nbcsports.liveextra.library.tve.AuthService;
import com.squareup.picasso.Picasso;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.nbcsports.liveextra.ui.core:
//            BaseFragment

public final class BaseFragment_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider adManagerProvider;
    private final Provider passProvider;
    private final Provider picassoProvider;
    private final MembersInjector supertypeInjector;

    public BaseFragment_MembersInjector(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2)
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
        }
        picassoProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        } else
        {
            adManagerProvider = provider2;
            return;
        }
    }

    public static MembersInjector create(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2)
    {
        return new BaseFragment_MembersInjector(membersinjector, provider, provider1, provider2);
    }

    public void injectMembers(BaseFragment basefragment)
    {
        if (basefragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            supertypeInjector.injectMembers(basefragment);
            basefragment.pass = (AuthService)passProvider.get();
            basefragment.picasso = (Picasso)picassoProvider.get();
            basefragment.adManager = (AdManager)adManagerProvider.get();
            return;
        }
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((BaseFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/ui/core/BaseFragment_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
