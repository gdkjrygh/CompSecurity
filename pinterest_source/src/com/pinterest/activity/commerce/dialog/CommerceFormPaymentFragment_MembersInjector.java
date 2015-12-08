// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.dialog;

import com.pinterest.activity.commerce.logic.PaymentFormFragmentController;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.pinterest.activity.commerce.dialog:
//            CommerceFormPaymentFragment

public final class CommerceFormPaymentFragment_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider paymentFormControllerProvider;
    private final MembersInjector supertypeInjector;

    public CommerceFormPaymentFragment_MembersInjector(MembersInjector membersinjector, Provider provider)
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
            paymentFormControllerProvider = provider;
            return;
        }
    }

    public static MembersInjector create(MembersInjector membersinjector, Provider provider)
    {
        return new CommerceFormPaymentFragment_MembersInjector(membersinjector, provider);
    }

    public final void injectMembers(CommerceFormPaymentFragment commerceformpaymentfragment)
    {
        if (commerceformpaymentfragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            supertypeInjector.injectMembers(commerceformpaymentfragment);
            commerceformpaymentfragment.paymentFormController = (PaymentFormFragmentController)paymentFormControllerProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((CommerceFormPaymentFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!com/pinterest/activity/commerce/dialog/CommerceFormPaymentFragment_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
