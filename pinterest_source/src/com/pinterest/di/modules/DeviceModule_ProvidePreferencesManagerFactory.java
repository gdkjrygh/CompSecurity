// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.di.modules;

import dagger.internal.Factory;

// Referenced classes of package com.pinterest.di.modules:
//            DeviceModule

public final class DeviceModule_ProvidePreferencesManagerFactory
    implements Factory
{

    static final boolean a;
    private final DeviceModule b;

    private DeviceModule_ProvidePreferencesManagerFactory(DeviceModule devicemodule)
    {
        if (!a && devicemodule == null)
        {
            throw new AssertionError();
        } else
        {
            b = devicemodule;
            return;
        }
    }

    public static Factory a(DeviceModule devicemodule)
    {
        return new DeviceModule_ProvidePreferencesManagerFactory(devicemodule);
    }

    public final Object get()
    {
        com.pinterest.kit.data.PreferencesManager preferencesmanager = DeviceModule.a();
        if (preferencesmanager == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return preferencesmanager;
        }
    }

    static 
    {
        boolean flag;
        if (!com/pinterest/di/modules/DeviceModule_ProvidePreferencesManagerFactory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
