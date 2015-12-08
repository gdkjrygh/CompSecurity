// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce;

import com.pinterest.data.CommerceApiManager;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.pinterest.activity.commerce:
//            CommerceSettingsFragment

public final class CommerceSettingsFragment_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider commerceApiManagerProvider;
    private final MembersInjector supertypeInjector;

    public CommerceSettingsFragment_MembersInjector(MembersInjector membersinjector, Provider provider)
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
            commerceApiManagerProvider = provider;
            return;
        }
    }

    public static MembersInjector create(MembersInjector membersinjector, Provider provider)
    {
        return new CommerceSettingsFragment_MembersInjector(membersinjector, provider);
    }

    public final void injectMembers(CommerceSettingsFragment commercesettingsfragment)
    {
        if (commercesettingsfragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            supertypeInjector.injectMembers(commercesettingsfragment);
            commercesettingsfragment.commerceApiManager = (CommerceApiManager)commerceApiManagerProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((CommerceSettingsFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!com/pinterest/activity/commerce/CommerceSettingsFragment_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
