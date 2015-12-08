// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import android.os.Vibrator;
import com.skype.Account;
import com.skype.android.SkypeFragment_MembersInjector;
import com.skype.android.analytics.Analytics;
import com.skype.android.config.ecs.EcsConfiguration;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.settings:
//            NotificationSettingsFragment

public final class NotificationSettingsFragment_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accountProvider;
    private final Provider analyticsProvider;
    private final Provider ecsConfigurationProvider;
    private final Provider objectInterfaceFinderProvider;
    private final Provider vibratorProvider;

    public NotificationSettingsFragment_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        objectInterfaceFinderProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        accountProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        analyticsProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        vibratorProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        } else
        {
            ecsConfigurationProvider = provider4;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4)
    {
        return new NotificationSettingsFragment_MembersInjector(provider, provider1, provider2, provider3, provider4);
    }

    public static void injectAccount(NotificationSettingsFragment notificationsettingsfragment, Provider provider)
    {
        notificationsettingsfragment.account = (Account)provider.get();
    }

    public static void injectAnalytics(NotificationSettingsFragment notificationsettingsfragment, Provider provider)
    {
        notificationsettingsfragment.analytics = (Analytics)provider.get();
    }

    public static void injectEcsConfiguration(NotificationSettingsFragment notificationsettingsfragment, Provider provider)
    {
        notificationsettingsfragment.ecsConfiguration = (EcsConfiguration)provider.get();
    }

    public static void injectVibrator(NotificationSettingsFragment notificationsettingsfragment, Provider provider)
    {
        notificationsettingsfragment.vibrator = (Vibrator)provider.get();
    }

    public final void injectMembers(NotificationSettingsFragment notificationsettingsfragment)
    {
        if (notificationsettingsfragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeFragment_MembersInjector.injectObjectInterfaceFinder(notificationsettingsfragment, objectInterfaceFinderProvider);
            notificationsettingsfragment.account = (Account)accountProvider.get();
            notificationsettingsfragment.analytics = (Analytics)analyticsProvider.get();
            notificationsettingsfragment.vibrator = (Vibrator)vibratorProvider.get();
            notificationsettingsfragment.ecsConfiguration = (EcsConfiguration)ecsConfigurationProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((NotificationSettingsFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/settings/NotificationSettingsFragment_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
