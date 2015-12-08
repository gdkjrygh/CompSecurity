// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.wearable;

import com.skype.SkyLib;
import com.skype.android.analytics.Analytics;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.inject.LoginManager;
import com.skype.android.util.ConversationUtil;
import com.skype.android.wakeup.DreamKeeper;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.wearable:
//            WearReplyReceiver

public final class WearReplyReceiver_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider analyticsProvider;
    private final Provider conversationUtilProvider;
    private final Provider dreamKeeperProvider;
    private final Provider ecsConfigurationProvider;
    private final Provider libProvider;
    private final Provider loginManagerProvider;

    public WearReplyReceiver_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5)
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
        dreamKeeperProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        ecsConfigurationProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        conversationUtilProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        loginManagerProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        } else
        {
            analyticsProvider = provider5;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5)
    {
        return new WearReplyReceiver_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5);
    }

    public static void injectAnalytics(WearReplyReceiver wearreplyreceiver, Provider provider)
    {
        wearreplyreceiver.analytics = (Analytics)provider.get();
    }

    public static void injectConversationUtil(WearReplyReceiver wearreplyreceiver, Provider provider)
    {
        wearreplyreceiver.conversationUtil = (ConversationUtil)provider.get();
    }

    public static void injectDreamKeeper(WearReplyReceiver wearreplyreceiver, Provider provider)
    {
        wearreplyreceiver.dreamKeeper = (DreamKeeper)provider.get();
    }

    public static void injectEcsConfiguration(WearReplyReceiver wearreplyreceiver, Provider provider)
    {
        wearreplyreceiver.ecsConfiguration = (EcsConfiguration)provider.get();
    }

    public static void injectLib(WearReplyReceiver wearreplyreceiver, Provider provider)
    {
        wearreplyreceiver.lib = (SkyLib)provider.get();
    }

    public static void injectLoginManager(WearReplyReceiver wearreplyreceiver, Provider provider)
    {
        wearreplyreceiver.loginManager = (LoginManager)provider.get();
    }

    public final void injectMembers(WearReplyReceiver wearreplyreceiver)
    {
        if (wearreplyreceiver == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            wearreplyreceiver.lib = (SkyLib)libProvider.get();
            wearreplyreceiver.dreamKeeper = (DreamKeeper)dreamKeeperProvider.get();
            wearreplyreceiver.ecsConfiguration = (EcsConfiguration)ecsConfigurationProvider.get();
            wearreplyreceiver.conversationUtil = (ConversationUtil)conversationUtilProvider.get();
            wearreplyreceiver.loginManager = (LoginManager)loginManagerProvider.get();
            wearreplyreceiver.analytics = (Analytics)analyticsProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((WearReplyReceiver)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/wearable/WearReplyReceiver_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
