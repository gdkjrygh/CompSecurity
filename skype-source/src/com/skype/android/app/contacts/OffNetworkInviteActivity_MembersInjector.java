// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import com.skype.android.SkypeActivity_MembersInjector;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.res.DefaultAvatars;
import com.skype.android.util.ContactUtil;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.contacts:
//            OffNetworkInviteActivity, JoinRequestHelper

public final class OffNetworkInviteActivity_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider activityAccountStateObserverProvider;
    private final Provider analyticsInAppObserverProvider;
    private final Provider analyticsObserverProvider;
    private final Provider asyncServiceProvider;
    private final Provider contactUtilProvider;
    private final Provider crashReporterProvider;
    private final Provider defaultAvatarsProvider;
    private final Provider ecsConfigurationProvider;
    private final Provider joinRequestHelperProvider;
    private final Provider objectInterfaceFinderProvider;
    private final Provider shakeBugReportObserverProvider;
    private final Provider typeFaceTextStyleCallbackProvider;
    private final Provider upActionObserverProvider;

    public OffNetworkInviteActivity_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        upActionObserverProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        analyticsObserverProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        analyticsInAppObserverProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        shakeBugReportObserverProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        crashReporterProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        }
        typeFaceTextStyleCallbackProvider = provider5;
        if (!$assertionsDisabled && provider6 == null)
        {
            throw new AssertionError();
        }
        objectInterfaceFinderProvider = provider6;
        if (!$assertionsDisabled && provider7 == null)
        {
            throw new AssertionError();
        }
        activityAccountStateObserverProvider = provider7;
        if (!$assertionsDisabled && provider8 == null)
        {
            throw new AssertionError();
        }
        asyncServiceProvider = provider8;
        if (!$assertionsDisabled && provider9 == null)
        {
            throw new AssertionError();
        }
        contactUtilProvider = provider9;
        if (!$assertionsDisabled && provider10 == null)
        {
            throw new AssertionError();
        }
        defaultAvatarsProvider = provider10;
        if (!$assertionsDisabled && provider11 == null)
        {
            throw new AssertionError();
        }
        joinRequestHelperProvider = provider11;
        if (!$assertionsDisabled && provider12 == null)
        {
            throw new AssertionError();
        } else
        {
            ecsConfigurationProvider = provider12;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12)
    {
        return new OffNetworkInviteActivity_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12);
    }

    public static void injectAsyncService(OffNetworkInviteActivity offnetworkinviteactivity, Provider provider)
    {
        offnetworkinviteactivity.asyncService = (AsyncService)provider.get();
    }

    public static void injectContactUtil(OffNetworkInviteActivity offnetworkinviteactivity, Provider provider)
    {
        offnetworkinviteactivity.contactUtil = (ContactUtil)provider.get();
    }

    public static void injectDefaultAvatars(OffNetworkInviteActivity offnetworkinviteactivity, Provider provider)
    {
        offnetworkinviteactivity.defaultAvatars = (DefaultAvatars)provider.get();
    }

    public static void injectEcsConfiguration(OffNetworkInviteActivity offnetworkinviteactivity, Provider provider)
    {
        offnetworkinviteactivity.ecsConfiguration = (EcsConfiguration)provider.get();
    }

    public static void injectJoinRequestHelper(OffNetworkInviteActivity offnetworkinviteactivity, Provider provider)
    {
        offnetworkinviteactivity.joinRequestHelper = (JoinRequestHelper)provider.get();
    }

    public final void injectMembers(OffNetworkInviteActivity offnetworkinviteactivity)
    {
        if (offnetworkinviteactivity == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeActivity_MembersInjector.injectUpActionObserver(offnetworkinviteactivity, upActionObserverProvider);
            SkypeActivity_MembersInjector.injectAnalyticsObserver(offnetworkinviteactivity, analyticsObserverProvider);
            SkypeActivity_MembersInjector.injectAnalyticsInAppObserver(offnetworkinviteactivity, analyticsInAppObserverProvider);
            SkypeActivity_MembersInjector.injectShakeBugReportObserver(offnetworkinviteactivity, shakeBugReportObserverProvider);
            SkypeActivity_MembersInjector.injectCrashReporter(offnetworkinviteactivity, crashReporterProvider);
            SkypeActivity_MembersInjector.injectTypeFaceTextStyleCallback(offnetworkinviteactivity, typeFaceTextStyleCallbackProvider);
            SkypeActivity_MembersInjector.injectObjectInterfaceFinder(offnetworkinviteactivity, objectInterfaceFinderProvider);
            SkypeActivity_MembersInjector.injectActivityAccountStateObserver(offnetworkinviteactivity, activityAccountStateObserverProvider);
            offnetworkinviteactivity.asyncService = (AsyncService)asyncServiceProvider.get();
            offnetworkinviteactivity.contactUtil = (ContactUtil)contactUtilProvider.get();
            offnetworkinviteactivity.defaultAvatars = (DefaultAvatars)defaultAvatarsProvider.get();
            offnetworkinviteactivity.joinRequestHelper = (JoinRequestHelper)joinRequestHelperProvider.get();
            offnetworkinviteactivity.ecsConfiguration = (EcsConfiguration)ecsConfigurationProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((OffNetworkInviteActivity)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/contacts/OffNetworkInviteActivity_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
