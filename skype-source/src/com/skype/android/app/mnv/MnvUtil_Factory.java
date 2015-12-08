// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;

import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.inject.AccountProvider;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.NetworkUtil;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.mnv:
//            MnvUtil

public final class MnvUtil_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider accountProvider;
    private final Provider configurationProvider;
    private final Provider contactUtilProvider;
    private final Provider networkUtilProvider;

    public MnvUtil_Factory(Provider provider, Provider provider1, Provider provider2, Provider provider3)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        accountProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        networkUtilProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        configurationProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        } else
        {
            contactUtilProvider = provider3;
            return;
        }
    }

    public static Factory create(Provider provider, Provider provider1, Provider provider2, Provider provider3)
    {
        return new MnvUtil_Factory(provider, provider1, provider2, provider3);
    }

    public final MnvUtil get()
    {
        return new MnvUtil((AccountProvider)accountProvider.get(), (NetworkUtil)networkUtilProvider.get(), (EcsConfiguration)configurationProvider.get(), (ContactUtil)contactUtilProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/mnv/MnvUtil_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
