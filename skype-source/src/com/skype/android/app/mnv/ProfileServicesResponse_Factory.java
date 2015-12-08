// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;

import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.mnv:
//            ProfileServicesResponse, MnvAnalytics

public final class ProfileServicesResponse_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider mnvAnalyticsProvider;

    public ProfileServicesResponse_Factory(Provider provider)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        } else
        {
            mnvAnalyticsProvider = provider;
            return;
        }
    }

    public static Factory create(Provider provider)
    {
        return new ProfileServicesResponse_Factory(provider);
    }

    public final ProfileServicesResponse get()
    {
        return new ProfileServicesResponse((MnvAnalytics)mnvAnalyticsProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/mnv/ProfileServicesResponse_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
