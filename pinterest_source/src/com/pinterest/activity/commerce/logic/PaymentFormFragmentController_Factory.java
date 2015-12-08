// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.logic;

import android.content.Context;
import com.pinterest.data.CommerceApiManager;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.pinterest.activity.commerce.logic:
//            PaymentFormFragmentController, AddressFormController

public final class PaymentFormFragmentController_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider addressFormControllerProvider;
    private final Provider commerceApiManagerProvider;
    private final Provider contextProvider;

    public PaymentFormFragmentController_Factory(Provider provider, Provider provider1, Provider provider2)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        commerceApiManagerProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        contextProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        } else
        {
            addressFormControllerProvider = provider2;
            return;
        }
    }

    public static Factory create(Provider provider, Provider provider1, Provider provider2)
    {
        return new PaymentFormFragmentController_Factory(provider, provider1, provider2);
    }

    public final PaymentFormFragmentController get()
    {
        return new PaymentFormFragmentController((CommerceApiManager)commerceApiManagerProvider.get(), (Context)contextProvider.get(), (AddressFormController)addressFormControllerProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/pinterest/activity/commerce/logic/PaymentFormFragmentController_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
