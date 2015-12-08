// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.config.ecs;

import com.skype.SkyLib;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.config.ecs:
//            SkyLibEcsClient

public final class SkyLibEcsClient_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider libProvider;

    public SkyLibEcsClient_Factory(Provider provider)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        } else
        {
            libProvider = provider;
            return;
        }
    }

    public static Factory create(Provider provider)
    {
        return new SkyLibEcsClient_Factory(provider);
    }

    public final SkyLibEcsClient get()
    {
        return new SkyLibEcsClient((SkyLib)libProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/config/ecs/SkyLibEcsClient_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
