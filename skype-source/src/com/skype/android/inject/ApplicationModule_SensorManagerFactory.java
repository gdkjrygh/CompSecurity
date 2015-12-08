// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.inject;

import android.hardware.SensorManager;
import dagger.internal.Factory;

// Referenced classes of package com.skype.android.inject:
//            ApplicationModule

public final class ApplicationModule_SensorManagerFactory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final ApplicationModule module;

    public ApplicationModule_SensorManagerFactory(ApplicationModule applicationmodule)
    {
        if (!$assertionsDisabled && applicationmodule == null)
        {
            throw new AssertionError();
        } else
        {
            module = applicationmodule;
            return;
        }
    }

    public static Factory create(ApplicationModule applicationmodule)
    {
        return new ApplicationModule_SensorManagerFactory(applicationmodule);
    }

    public final SensorManager get()
    {
        SensorManager sensormanager = module.sensorManager();
        if (sensormanager == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return sensormanager;
        }
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/inject/ApplicationModule_SensorManagerFactory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
