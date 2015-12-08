// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin.tasks;

import android.accounts.AccountManager;
import android.app.Application;
import com.skype.android.util.TimeUtil;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.signin.tasks:
//            c

public final class CreateDeviceAccount_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider accountManagerProvider;
    private final Provider contextProvider;
    private final Provider timeUtilProvider;
    private final Provider userPrefsProvider;

    public CreateDeviceAccount_Factory(Provider provider, Provider provider1, Provider provider2, Provider provider3)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        contextProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        accountManagerProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        userPrefsProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        } else
        {
            timeUtilProvider = provider3;
            return;
        }
    }

    public static Factory create(Provider provider, Provider provider1, Provider provider2, Provider provider3)
    {
        return new CreateDeviceAccount_Factory(provider, provider1, provider2, provider3);
    }

    public final c get()
    {
        return new c((Application)contextProvider.get(), (AccountManager)accountManagerProvider.get(), userPrefsProvider, (TimeUtil)timeUtilProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/signin/tasks/CreateDeviceAccount_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
