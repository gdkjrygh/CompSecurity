// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.dialog;

import com.pinterest.activity.commerce.logic.AddressFormFragmentController;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.pinterest.activity.commerce.dialog:
//            CommerceFormAddressFragment

public final class CommerceFormAddressFragment_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider addressFormControllerProvider;
    private final MembersInjector supertypeInjector;

    public CommerceFormAddressFragment_MembersInjector(MembersInjector membersinjector, Provider provider)
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
            addressFormControllerProvider = provider;
            return;
        }
    }

    public static MembersInjector create(MembersInjector membersinjector, Provider provider)
    {
        return new CommerceFormAddressFragment_MembersInjector(membersinjector, provider);
    }

    public final void injectMembers(CommerceFormAddressFragment commerceformaddressfragment)
    {
        if (commerceformaddressfragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            supertypeInjector.injectMembers(commerceformaddressfragment);
            commerceformaddressfragment.addressFormController = (AddressFormFragmentController)addressFormControllerProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((CommerceFormAddressFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!com/pinterest/activity/commerce/dialog/CommerceFormAddressFragment_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
