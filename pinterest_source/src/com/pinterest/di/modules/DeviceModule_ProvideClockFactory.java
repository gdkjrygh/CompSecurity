// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.di.modules;

import dagger.internal.Factory;

// Referenced classes of package com.pinterest.di.modules:
//            DeviceModule

public final class DeviceModule_ProvideClockFactory
    implements Factory
{

    static final boolean a;
    private final DeviceModule b;

    private DeviceModule_ProvideClockFactory(DeviceModule devicemodule)
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
        return new DeviceModule_ProvideClockFactory(devicemodule);
    }

    public final Object get()
    {
        com.pinterest.kit.time.Clock clock = DeviceModule.b();
        if (clock == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return clock;
        }
    }

    static 
    {
        boolean flag;
        if (!com/pinterest/di/modules/DeviceModule_ProvideClockFactory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
