// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.inject;

import android.telephony.TelephonyManager;
import dagger.internal.Factory;

// Referenced classes of package com.skype.android.inject:
//            ApplicationModule

public final class ApplicationModule_TelephonyManagerFactory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final ApplicationModule module;

    public ApplicationModule_TelephonyManagerFactory(ApplicationModule applicationmodule)
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
        return new ApplicationModule_TelephonyManagerFactory(applicationmodule);
    }

    public final TelephonyManager get()
    {
        TelephonyManager telephonymanager = module.telephonyManager();
        if (telephonymanager == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return telephonymanager;
        }
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/inject/ApplicationModule_TelephonyManagerFactory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
