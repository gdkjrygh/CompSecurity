// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.logic;

import android.content.Context;
import com.pinterest.activity.commerce.CommerceAddressManager;
import com.pinterest.data.CommerceApiManager;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.pinterest.activity.commerce.logic:
//            AddressFormFragmentController

public final class AddressFormFragmentController_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider commerceAddressManagerProvider;
    private final Provider commerceApiManagerProvider;
    private final Provider contextProvider;
    private final MembersInjector membersInjector;

    public AddressFormFragmentController_Factory(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2)
    {
        if (!$assertionsDisabled && membersinjector == null)
        {
            throw new AssertionError();
        }
        membersInjector = membersinjector;
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        contextProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        commerceApiManagerProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        } else
        {
            commerceAddressManagerProvider = provider2;
            return;
        }
    }

    public static Factory create(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2)
    {
        return new AddressFormFragmentController_Factory(membersinjector, provider, provider1, provider2);
    }

    public final AddressFormFragmentController get()
    {
        AddressFormFragmentController addressformfragmentcontroller = new AddressFormFragmentController((Context)contextProvider.get(), (CommerceApiManager)commerceApiManagerProvider.get(), (CommerceAddressManager)commerceAddressManagerProvider.get());
        membersInjector.injectMembers(addressformfragmentcontroller);
        return addressformfragmentcontroller;
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/pinterest/activity/commerce/logic/AddressFormFragmentController_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
