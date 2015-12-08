// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce;

import com.pinterest.activity.commerce.logic.CheckoutController;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.pinterest.activity.commerce:
//            CheckoutFragment

public final class CheckoutFragment_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider _checkoutControllerProvider;
    private final MembersInjector supertypeInjector;

    public CheckoutFragment_MembersInjector(MembersInjector membersinjector, Provider provider)
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
            _checkoutControllerProvider = provider;
            return;
        }
    }

    public static MembersInjector create(MembersInjector membersinjector, Provider provider)
    {
        return new CheckoutFragment_MembersInjector(membersinjector, provider);
    }

    public final void injectMembers(CheckoutFragment checkoutfragment)
    {
        if (checkoutfragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            supertypeInjector.injectMembers(checkoutfragment);
            checkoutfragment._checkoutController = (CheckoutController)_checkoutControllerProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((CheckoutFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!com/pinterest/activity/commerce/CheckoutFragment_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
