// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;

import com.skype.android.config.ecs.EcsConfiguration;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.mnv:
//            ProfileServiceConfiguration

public final class ProfileServiceConfiguration_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider configurationProvider;

    public ProfileServiceConfiguration_Factory(Provider provider)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        } else
        {
            configurationProvider = provider;
            return;
        }
    }

    public static Factory create(Provider provider)
    {
        return new ProfileServiceConfiguration_Factory(provider);
    }

    public final ProfileServiceConfiguration get()
    {
        return new ProfileServiceConfiguration((EcsConfiguration)configurationProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/mnv/ProfileServiceConfiguration_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
