// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.config;

import android.app.Application;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.config:
//            ConfigUpdater

public final class ConfigUpdater_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider contextProvider;

    public ConfigUpdater_Factory(Provider provider)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        } else
        {
            contextProvider = provider;
            return;
        }
    }

    public static Factory create(Provider provider)
    {
        return new ConfigUpdater_Factory(provider);
    }

    public final ConfigUpdater get()
    {
        return new ConfigUpdater((Application)contextProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/config/ConfigUpdater_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
