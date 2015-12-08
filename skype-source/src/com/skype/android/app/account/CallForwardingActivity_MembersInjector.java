// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.account;

import com.skype.Account;
import com.skype.SkyLib;
import com.skype.android.SkypeActivity_MembersInjector;
import com.skype.android.analytics.Analytics;
import com.skype.android.app.ActionBarCustomizer;
import com.skype.android.app.Navigation;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.account:
//            CallForwardingActivity

public final class CallForwardingActivity_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accountProvider;
    private final Provider actionBarCustomizerProvider;
    private final Provider activityAccountStateObserverProvider;
    private final Provider analyticsInAppObserverProvider;
    private final Provider analyticsObserverProvider;
    private final Provider analyticsProvider;
    private final Provider crashReporterProvider;
    private final Provider libProvider;
    private final Provider navProvider;
    private final Provider objectInterfaceFinderProvider;
    private final Provider shakeBugReportObserverProvider;
    private final Provider typeFaceTextStyleCallbackProvider;
    private final Provider upActionObserverProvider;

    public CallForwardingActivity_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
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
        actionBarCustomizerProvider = provider8;
        if (!$assertionsDisabled && provider9 == null)
        {
            throw new AssertionError();
        }
        accountProvider = provider9;
        if (!$assertionsDisabled && provider10 == null)
        {
            throw new AssertionError();
        }
        navProvider = provider10;
        if (!$assertionsDisabled && provider11 == null)
        {
            throw new AssertionError();
        }
        libProvider = provider11;
        if (!$assertionsDisabled && provider12 == null)
        {
            throw new AssertionError();
        } else
        {
            analyticsProvider = provider12;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12)
    {
        return new CallForwardingActivity_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12);
    }

    public static void injectAccount(CallForwardingActivity callforwardingactivity, Provider provider)
    {
        callforwardingactivity.account = (Account)provider.get();
    }

    public static void injectActionBarCustomizer(CallForwardingActivity callforwardingactivity, Provider provider)
    {
        callforwardingactivity.actionBarCustomizer = (ActionBarCustomizer)provider.get();
    }

    public static void injectAnalytics(CallForwardingActivity callforwardingactivity, Provider provider)
    {
        callforwardingactivity.analytics = (Analytics)provider.get();
    }

    public static void injectLib(CallForwardingActivity callforwardingactivity, Provider provider)
    {
        callforwardingactivity.lib = (SkyLib)provider.get();
    }

    public static void injectNav(CallForwardingActivity callforwardingactivity, Provider provider)
    {
        callforwardingactivity.nav = (Navigation)provider.get();
    }

    public final void injectMembers(CallForwardingActivity callforwardingactivity)
    {
        if (callforwardingactivity == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeActivity_MembersInjector.injectUpActionObserver(callforwardingactivity, upActionObserverProvider);
            SkypeActivity_MembersInjector.injectAnalyticsObserver(callforwardingactivity, analyticsObserverProvider);
            SkypeActivity_MembersInjector.injectAnalyticsInAppObserver(callforwardingactivity, analyticsInAppObserverProvider);
            SkypeActivity_MembersInjector.injectShakeBugReportObserver(callforwardingactivity, shakeBugReportObserverProvider);
            SkypeActivity_MembersInjector.injectCrashReporter(callforwardingactivity, crashReporterProvider);
            SkypeActivity_MembersInjector.injectTypeFaceTextStyleCallback(callforwardingactivity, typeFaceTextStyleCallbackProvider);
            SkypeActivity_MembersInjector.injectObjectInterfaceFinder(callforwardingactivity, objectInterfaceFinderProvider);
            SkypeActivity_MembersInjector.injectActivityAccountStateObserver(callforwardingactivity, activityAccountStateObserverProvider);
            callforwardingactivity.actionBarCustomizer = (ActionBarCustomizer)actionBarCustomizerProvider.get();
            callforwardingactivity.account = (Account)accountProvider.get();
            callforwardingactivity.nav = (Navigation)navProvider.get();
            callforwardingactivity.lib = (SkyLib)libProvider.get();
            callforwardingactivity.analytics = (Analytics)analyticsProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((CallForwardingActivity)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/account/CallForwardingActivity_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
