// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import com.skype.android.analytics.Analytics;
import com.skype.android.config.ecs.EcsConfiguration;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.settings:
//            SnoozeNotificationHelper, UserPreferences

public final class SnoozeNotificationHelper_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider analyticsProvider;
    private final Provider ecsConfigurationProvider;
    private final Provider userPreferencesProvider;

    public SnoozeNotificationHelper_MembersInjector(Provider provider, Provider provider1, Provider provider2)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        userPreferencesProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        ecsConfigurationProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        } else
        {
            analyticsProvider = provider2;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2)
    {
        return new SnoozeNotificationHelper_MembersInjector(provider, provider1, provider2);
    }

    public static void injectAnalytics(SnoozeNotificationHelper snoozenotificationhelper, Provider provider)
    {
        snoozenotificationhelper.analytics = (Analytics)provider.get();
    }

    public static void injectEcsConfiguration(SnoozeNotificationHelper snoozenotificationhelper, Provider provider)
    {
        snoozenotificationhelper.ecsConfiguration = (EcsConfiguration)provider.get();
    }

    public static void injectUserPreferences(SnoozeNotificationHelper snoozenotificationhelper, Provider provider)
    {
        snoozenotificationhelper.userPreferences = (UserPreferences)provider.get();
    }

    public final void injectMembers(SnoozeNotificationHelper snoozenotificationhelper)
    {
        if (snoozenotificationhelper == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            snoozenotificationhelper.userPreferences = (UserPreferences)userPreferencesProvider.get();
            snoozenotificationhelper.ecsConfiguration = (EcsConfiguration)ecsConfigurationProvider.get();
            snoozenotificationhelper.analytics = (Analytics)analyticsProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((SnoozeNotificationHelper)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/settings/SnoozeNotificationHelper_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
