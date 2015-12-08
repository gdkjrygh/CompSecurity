// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.crash;

import com.skype.android.config.ApplicationConfig;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.crash:
//            HockeyAppCrashReporter

public final class HockeyAppCrashReporter_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider configProvider;

    public HockeyAppCrashReporter_Factory(Provider provider)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        } else
        {
            configProvider = provider;
            return;
        }
    }

    public static Factory create(Provider provider)
    {
        return new HockeyAppCrashReporter_Factory(provider);
    }

    public final HockeyAppCrashReporter get()
    {
        return new HockeyAppCrashReporter((ApplicationConfig)configProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/crash/HockeyAppCrashReporter_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
