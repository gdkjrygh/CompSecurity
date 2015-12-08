// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.di.modules;

import dagger.internal.Factory;

// Referenced classes of package com.pinterest.di.modules:
//            CheckoutModule

public final class CheckoutModule_ProvidesCheckoutFragmentFactory
    implements Factory
{

    static final boolean a;
    private final CheckoutModule b;

    private CheckoutModule_ProvidesCheckoutFragmentFactory(CheckoutModule checkoutmodule)
    {
        if (!a && checkoutmodule == null)
        {
            throw new AssertionError();
        } else
        {
            b = checkoutmodule;
            return;
        }
    }

    public static Factory a(CheckoutModule checkoutmodule)
    {
        return new CheckoutModule_ProvidesCheckoutFragmentFactory(checkoutmodule);
    }

    public final Object get()
    {
        com.pinterest.activity.commerce.CheckoutFragment checkoutfragment = b.a();
        if (checkoutfragment == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return checkoutfragment;
        }
    }

    static 
    {
        boolean flag;
        if (!com/pinterest/di/modules/CheckoutModule_ProvidesCheckoutFragmentFactory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
