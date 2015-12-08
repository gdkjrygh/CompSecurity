// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.contacts;

import com.pinterest.kit.data.PreferencesManager;
import com.pinterest.kit.time.Clock;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.pinterest.activity.contacts:
//            InviterManager

public final class InviterManager_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider clockProvider;
    private final Provider prefManagerProvider;

    public InviterManager_Factory(Provider provider, Provider provider1)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        clockProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        } else
        {
            prefManagerProvider = provider1;
            return;
        }
    }

    public static Factory create(Provider provider, Provider provider1)
    {
        return new InviterManager_Factory(provider, provider1);
    }

    public final InviterManager get()
    {
        return new InviterManager((Clock)clockProvider.get(), (PreferencesManager)prefManagerProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/pinterest/activity/contacts/InviterManager_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
