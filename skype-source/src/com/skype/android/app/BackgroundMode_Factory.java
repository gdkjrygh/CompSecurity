// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app;

import com.skype.SkyLib;
import com.skype.android.analytics.Analytics;
import com.skype.android.event.EventBus;
import com.skype.android.inject.AccountProvider;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ConversationUtil;
import com.skype.android.wakeup.ForegroundState;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app:
//            BackgroundMode

public final class BackgroundMode_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider accountProvider;
    private final Provider analyticsProvider;
    private final Provider conversationUtilProvider;
    private final Provider eventBusProvider;
    private final Provider foregroundStateProvider;
    private final Provider libProvider;
    private final Provider mapProvider;

    public BackgroundMode_Factory(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        libProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        mapProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        accountProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        conversationUtilProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        foregroundStateProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        }
        eventBusProvider = provider5;
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
        return new BackgroundMode_Factory(provider, provider1, provider2, provider3, provider4, provider5, provider6);
    }

    public final BackgroundMode get()
    {
        return new BackgroundMode((SkyLib)libProvider.get(), (ObjectIdMap)mapProvider.get(), (AccountProvider)accountProvider.get(), (ConversationUtil)conversationUtilProvider.get(), (ForegroundState)foregroundStateProvider.get(), (EventBus)eventBusProvider.get(), (Analytics)analyticsProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/BackgroundMode_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
