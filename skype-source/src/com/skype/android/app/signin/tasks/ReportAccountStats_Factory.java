// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin.tasks;

import android.content.Context;
import com.skype.SkyLib;
import com.skype.android.analytics.Analytics;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.signin.tasks:
//            f

public final class ReportAccountStats_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider analyticsProvider;
    private final Provider contextProvider;
    private final Provider libProvider;
    private final Provider userPrefsProvider;

    public ReportAccountStats_Factory(Provider provider, Provider provider1, Provider provider2, Provider provider3)
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
        analyticsProvider = provider1;
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
            libProvider = provider3;
            return;
        }
    }

    public static Factory create(Provider provider, Provider provider1, Provider provider2, Provider provider3)
    {
        return new ReportAccountStats_Factory(provider, provider1, provider2, provider3);
    }

    public final f get()
    {
        return new f((Context)contextProvider.get(), (Analytics)analyticsProvider.get(), userPrefsProvider, (SkyLib)libProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/signin/tasks/ReportAccountStats_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
