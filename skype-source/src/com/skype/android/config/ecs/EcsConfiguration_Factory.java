// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.config.ecs;

import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.config.ecs:
//            EcsConfiguration, EcsClient

public final class EcsConfiguration_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider ecsClientProvider;

    public EcsConfiguration_Factory(Provider provider)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        } else
        {
            ecsClientProvider = provider;
            return;
        }
    }

    public static Factory create(Provider provider)
    {
        return new EcsConfiguration_Factory(provider);
    }

    public final EcsConfiguration get()
    {
        return new EcsConfiguration((EcsClient)ecsClientProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/config/ecs/EcsConfiguration_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
