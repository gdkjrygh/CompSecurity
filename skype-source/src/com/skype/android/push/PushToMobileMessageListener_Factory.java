// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.push;

import android.app.NotificationManager;
import android.content.Context;
import com.skype.android.analytics.Analytics;
import com.skype.android.app.BackgroundNavigation;
import com.skype.android.inject.AccountProvider;
import com.skype.android.wakeup.ForegroundState;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.push:
//            PushToMobileMessageListener

public final class PushToMobileMessageListener_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider accountProvider;
    private final Provider analyticsProvider;
    private final Provider contextProvider;
    private final Provider foregroundStateProvider;
    private final Provider navigationProvider;
    private final Provider notificationManagerProvider;
    private final Provider userPrefsProvider;

    public PushToMobileMessageListener_Factory(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        accountProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        contextProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        userPrefsProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        foregroundStateProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        notificationManagerProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        }
        navigationProvider = provider5;
        if (!$assertionsDisabled && provider6 == null)
        {
            throw new AssertionError();
        } else
        {
            analyticsProvider = provider6;
            return;
        }
    }

    public static Factory create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6)
    {
        return new PushToMobileMessageListener_Factory(provider, provider1, provider2, provider3, provider4, provider5, provider6);
    }

    public final PushToMobileMessageListener get()
    {
        return new PushToMobileMessageListener((AccountProvider)accountProvider.get(), (Context)contextProvider.get(), userPrefsProvider, (ForegroundState)foregroundStateProvider.get(), (NotificationManager)notificationManagerProvider.get(), (BackgroundNavigation)navigationProvider.get(), (Analytics)analyticsProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/push/PushToMobileMessageListener_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
