// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.analytics;

import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.analytics:
//            SessionReporter, Analytics

public final class SessionReporter_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accountProvider;
    private final Provider analyticsProvider;

    public SessionReporter_MembersInjector(Provider provider, Provider provider1)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        analyticsProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        } else
        {
            accountProvider = provider1;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1)
    {
        return new SessionReporter_MembersInjector(provider, provider1);
    }

    public static void injectAccountProvider(SessionReporter sessionreporter, Provider provider)
    {
        sessionreporter.b = provider;
    }

    public static void injectAnalytics(SessionReporter sessionreporter, Provider provider)
    {
        sessionreporter.a = (Analytics)provider.get();
    }

    public final void injectMembers(SessionReporter sessionreporter)
    {
        if (sessionreporter == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            sessionreporter.a = (Analytics)analyticsProvider.get();
            sessionreporter.b = accountProvider;
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((SessionReporter)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/analytics/SessionReporter_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
