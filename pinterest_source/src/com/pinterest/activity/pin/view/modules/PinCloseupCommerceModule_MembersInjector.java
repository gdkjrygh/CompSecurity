// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view.modules;

import com.pinterest.data.CommerceApiManager;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.pinterest.activity.pin.view.modules:
//            PinCloseupCommerceModule

public final class PinCloseupCommerceModule_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider _commerceApiManagerProvider;
    private final MembersInjector supertypeInjector;

    public PinCloseupCommerceModule_MembersInjector(MembersInjector membersinjector, Provider provider)
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
            _commerceApiManagerProvider = provider;
            return;
        }
    }

    public static MembersInjector create(MembersInjector membersinjector, Provider provider)
    {
        return new PinCloseupCommerceModule_MembersInjector(membersinjector, provider);
    }

    public final void injectMembers(PinCloseupCommerceModule pincloseupcommercemodule)
    {
        if (pincloseupcommercemodule == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            supertypeInjector.injectMembers(pincloseupcommercemodule);
            pincloseupcommercemodule._commerceApiManager = (CommerceApiManager)_commerceApiManagerProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((PinCloseupCommerceModule)obj);
    }

    static 
    {
        boolean flag;
        if (!com/pinterest/activity/pin/view/modules/PinCloseupCommerceModule_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
