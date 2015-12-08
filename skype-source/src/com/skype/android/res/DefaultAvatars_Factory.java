// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.res;

import android.app.Application;
import com.skype.android.config.ecs.EcsConfiguration;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.res:
//            DefaultAvatars

public final class DefaultAvatars_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider contextProvider;
    private final Provider ecsConfigurationProvider;

    public DefaultAvatars_Factory(Provider provider, Provider provider1)
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
            ecsConfigurationProvider = provider1;
            return;
        }
    }

    public static Factory create(Provider provider, Provider provider1)
    {
        return new DefaultAvatars_Factory(provider, provider1);
    }

    public final DefaultAvatars get()
    {
        return new DefaultAvatars((Application)contextProvider.get(), (EcsConfiguration)ecsConfigurationProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/res/DefaultAvatars_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
