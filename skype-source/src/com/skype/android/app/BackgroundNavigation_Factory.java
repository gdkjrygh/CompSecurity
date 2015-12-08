// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app;

import android.app.Application;
import com.skype.SkyLib;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsPersistentStorage;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.inject.AccountProvider;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.NetworkUtil;
import com.skype.android.util.SignInDurationReporter;
import com.skype.android.util.TimeUtil;
import com.skype.android.wakeup.DreamKeeper;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app:
//            BackgroundNavigation, LayoutExperience

public final class BackgroundNavigation_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider accountProvider;
    private final Provider analyticsPersistentStorageProvider;
    private final Provider analyticsProvider;
    private final Provider applicationProvider;
    private final Provider configurationProvider;
    private final Provider conversationUtilProvider;
    private final Provider dreamKeeperProvider;
    private final Provider layoutExperienceProvider;
    private final Provider libProvider;
    private final MembersInjector membersInjector;
    private final Provider networkUtilsProvider;
    private final Provider signInDurationReporterProvider;
    private final Provider timeUtilProvider;

    public BackgroundNavigation_Factory(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, 
            Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11)
    {
        if (!$assertionsDisabled && membersinjector == null)
        {
            throw new AssertionError();
        }
        membersInjector = membersinjector;
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        applicationProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        accountProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        libProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        dreamKeeperProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        conversationUtilProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        }
        analyticsProvider = provider5;
        if (!$assertionsDisabled && provider6 == null)
        {
            throw new AssertionError();
        }
        networkUtilsProvider = provider6;
        if (!$assertionsDisabled && provider7 == null)
        {
            throw new AssertionError();
        }
        configurationProvider = provider7;
        if (!$assertionsDisabled && provider8 == null)
        {
            throw new AssertionError();
        }
        signInDurationReporterProvider = provider8;
        if (!$assertionsDisabled && provider9 == null)
        {
            throw new AssertionError();
        }
        analyticsPersistentStorageProvider = provider9;
        if (!$assertionsDisabled && provider10 == null)
        {
            throw new AssertionError();
        }
        layoutExperienceProvider = provider10;
        if (!$assertionsDisabled && provider11 == null)
        {
            throw new AssertionError();
        } else
        {
            timeUtilProvider = provider11;
            return;
        }
    }

    public static Factory create(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11)
    {
        return new BackgroundNavigation_Factory(membersinjector, provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    public final BackgroundNavigation get()
    {
        BackgroundNavigation backgroundnavigation = new BackgroundNavigation((Application)applicationProvider.get(), (AccountProvider)accountProvider.get(), (SkyLib)libProvider.get(), (DreamKeeper)dreamKeeperProvider.get(), (ConversationUtil)conversationUtilProvider.get(), (Analytics)analyticsProvider.get(), (NetworkUtil)networkUtilsProvider.get(), (EcsConfiguration)configurationProvider.get(), (SignInDurationReporter)signInDurationReporterProvider.get(), (AnalyticsPersistentStorage)analyticsPersistentStorageProvider.get(), (LayoutExperience)layoutExperienceProvider.get(), (TimeUtil)timeUtilProvider.get());
        membersInjector.injectMembers(backgroundnavigation);
        return backgroundnavigation;
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/BackgroundNavigation_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
