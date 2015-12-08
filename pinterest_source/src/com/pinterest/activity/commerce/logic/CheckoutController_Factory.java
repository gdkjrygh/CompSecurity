// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.logic;

import android.app.Activity;
import android.content.Context;
import com.pinterest.activity.commerce.CheckoutFragment;
import com.pinterest.data.CommerceApiManager;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.pinterest.activity.commerce.logic:
//            CheckoutController

public final class CheckoutController_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider activityProvider;
    private final Provider checkoutFragmentProvider;
    private final Provider commerceApiManagerProvider;
    private final Provider contextProvider;

    public CheckoutController_Factory(Provider provider, Provider provider1, Provider provider2, Provider provider3)
    {
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
        }
        activityProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        } else
        {
            checkoutFragmentProvider = provider3;
            return;
        }
    }

    public static Factory create(Provider provider, Provider provider1, Provider provider2, Provider provider3)
    {
        return new CheckoutController_Factory(provider, provider1, provider2, provider3);
    }

    public final CheckoutController get()
    {
        return new CheckoutController((Context)contextProvider.get(), (CommerceApiManager)commerceApiManagerProvider.get(), (Activity)activityProvider.get(), (CheckoutFragment)checkoutFragmentProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/pinterest/activity/commerce/logic/CheckoutController_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
