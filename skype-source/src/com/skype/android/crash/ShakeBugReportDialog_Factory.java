// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.crash;

import android.app.Activity;
import com.skype.Account;
import com.skype.SkyLib;
import com.skype.android.analytics.AnalyticsPersistentStorage;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.crash:
//            ShakeBugReportDialog

public final class ShakeBugReportDialog_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider accountProvider;
    private final Provider activityProvider;
    private final Provider analyticsPersistentStorageProvider;
    private final Provider libProvider;

    public ShakeBugReportDialog_Factory(Provider provider, Provider provider1, Provider provider2, Provider provider3)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        activityProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        libProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        accountProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        } else
        {
            analyticsPersistentStorageProvider = provider3;
            return;
        }
    }

    public static Factory create(Provider provider, Provider provider1, Provider provider2, Provider provider3)
    {
        return new ShakeBugReportDialog_Factory(provider, provider1, provider2, provider3);
    }

    public final ShakeBugReportDialog get()
    {
        return new ShakeBugReportDialog((Activity)activityProvider.get(), (SkyLib)libProvider.get(), (Account)accountProvider.get(), (AnalyticsPersistentStorage)analyticsPersistentStorageProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/crash/ShakeBugReportDialog_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
