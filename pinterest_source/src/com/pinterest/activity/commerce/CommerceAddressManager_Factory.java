// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce;

import android.app.Activity;
import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.pinterest.activity.commerce:
//            CommerceAddressManager

public final class CommerceAddressManager_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider activityProvider;
    private final Provider contextProvider;

    public CommerceAddressManager_Factory(Provider provider, Provider provider1)
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
            activityProvider = provider1;
            return;
        }
    }

    public static Factory create(Provider provider, Provider provider1)
    {
        return new CommerceAddressManager_Factory(provider, provider1);
    }

    public final CommerceAddressManager get()
    {
        return new CommerceAddressManager((Context)contextProvider.get(), (Activity)activityProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/pinterest/activity/commerce/CommerceAddressManager_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
