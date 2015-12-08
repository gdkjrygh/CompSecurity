// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.logic;

import android.content.Context;
import com.pinterest.activity.commerce.CommerceAddressManager;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.pinterest.activity.commerce.logic:
//            AddressFormController

public final class AddressFormController_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider commerceAddressManagerProvider;
    private final Provider contextProvider;

    public AddressFormController_Factory(Provider provider, Provider provider1)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        contextProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        } else
        {
            commerceAddressManagerProvider = provider1;
            return;
        }
    }

    public static Factory create(Provider provider, Provider provider1)
    {
        return new AddressFormController_Factory(provider, provider1);
    }

    public final AddressFormController get()
    {
        return new AddressFormController((Context)contextProvider.get(), (CommerceAddressManager)commerceAddressManagerProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/pinterest/activity/commerce/logic/AddressFormController_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
