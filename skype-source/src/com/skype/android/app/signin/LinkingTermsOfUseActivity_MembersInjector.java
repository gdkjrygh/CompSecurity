// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import com.skype.android.SkypeActivity_MembersInjector;
import com.skype.android.app.LayoutExperience;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.util.HttpUtil;
import com.skype.android.util.SignInDurationReporter;
import com.skype.android.util.accessibility.AccessibilityUtil;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.signin:
//            LinkingTermsOfUseActivity, LinkingUtil

public final class LinkingTermsOfUseActivity_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accessibilityUtilProvider;
    private final Provider activityAccountStateObserverProvider;
    private final Provider analyticsInAppObserverProvider;
    private final Provider analyticsObserverProvider;
    private final Provider crashReporterProvider;
    private final Provider ecsConfigurationProvider;
    private final Provider httpUtilProvider;
    private final Provider layoutExperienceProvider;
    private final Provider linkingUtilProvider;
    private final Provider objectInterfaceFinderProvider;
    private final Provider shakeBugReportObserverProvider;
    private final Provider signInDurationReporterProvider;
    private final Provider typeFaceTextStyleCallbackProvider;
    private final Provider upActionObserverProvider;

    public LinkingTermsOfUseActivity_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13)
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
        accessibilityUtilProvider = provider8;
        if (!$assertionsDisabled && provider9 == null)
        {
            throw new AssertionError();
        }
        linkingUtilProvider = provider9;
        if (!$assertionsDisabled && provider10 == null)
        {
            throw new AssertionError();
        }
        layoutExperienceProvider = provider10;
        if (!$assertionsDisabled && provider11 == null)
        {
            throw new AssertionError();
        }
        httpUtilProvider = provider11;
        if (!$assertionsDisabled && provider12 == null)
        {
            throw new AssertionError();
        }
        signInDurationReporterProvider = provider12;
        if (!$assertionsDisabled && provider13 == null)
        {
            throw new AssertionError();
        } else
        {
            ecsConfigurationProvider = provider13;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13)
    {
        return new LinkingTermsOfUseActivity_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13);
    }

    public static void injectAccessibilityUtil(LinkingTermsOfUseActivity linkingtermsofuseactivity, Provider provider)
    {
        linkingtermsofuseactivity.accessibilityUtil = (AccessibilityUtil)provider.get();
    }

    public static void injectEcsConfiguration(LinkingTermsOfUseActivity linkingtermsofuseactivity, Provider provider)
    {
        linkingtermsofuseactivity.ecsConfiguration = (EcsConfiguration)provider.get();
    }

    public static void injectHttpUtil(LinkingTermsOfUseActivity linkingtermsofuseactivity, Provider provider)
    {
        linkingtermsofuseactivity.httpUtil = (HttpUtil)provider.get();
    }

    public static void injectLayoutExperience(LinkingTermsOfUseActivity linkingtermsofuseactivity, Provider provider)
    {
        linkingtermsofuseactivity.layoutExperience = (LayoutExperience)provider.get();
    }

    public static void injectLinkingUtil(LinkingTermsOfUseActivity linkingtermsofuseactivity, Provider provider)
    {
        linkingtermsofuseactivity.linkingUtil = (LinkingUtil)provider.get();
    }

    public static void injectSignInDurationReporter(LinkingTermsOfUseActivity linkingtermsofuseactivity, Provider provider)
    {
        linkingtermsofuseactivity.signInDurationReporter = (SignInDurationReporter)provider.get();
    }

    public final void injectMembers(LinkingTermsOfUseActivity linkingtermsofuseactivity)
    {
        if (linkingtermsofuseactivity == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeActivity_MembersInjector.injectUpActionObserver(linkingtermsofuseactivity, upActionObserverProvider);
            SkypeActivity_MembersInjector.injectAnalyticsObserver(linkingtermsofuseactivity, analyticsObserverProvider);
            SkypeActivity_MembersInjector.injectAnalyticsInAppObserver(linkingtermsofuseactivity, analyticsInAppObserverProvider);
            SkypeActivity_MembersInjector.injectShakeBugReportObserver(linkingtermsofuseactivity, shakeBugReportObserverProvider);
            SkypeActivity_MembersInjector.injectCrashReporter(linkingtermsofuseactivity, crashReporterProvider);
            SkypeActivity_MembersInjector.injectTypeFaceTextStyleCallback(linkingtermsofuseactivity, typeFaceTextStyleCallbackProvider);
            SkypeActivity_MembersInjector.injectObjectInterfaceFinder(linkingtermsofuseactivity, objectInterfaceFinderProvider);
            SkypeActivity_MembersInjector.injectActivityAccountStateObserver(linkingtermsofuseactivity, activityAccountStateObserverProvider);
            linkingtermsofuseactivity.accessibilityUtil = (AccessibilityUtil)accessibilityUtilProvider.get();
            linkingtermsofuseactivity.linkingUtil = (LinkingUtil)linkingUtilProvider.get();
            linkingtermsofuseactivity.layoutExperience = (LayoutExperience)layoutExperienceProvider.get();
            linkingtermsofuseactivity.httpUtil = (HttpUtil)httpUtilProvider.get();
            linkingtermsofuseactivity.signInDurationReporter = (SignInDurationReporter)signInDurationReporterProvider.get();
            linkingtermsofuseactivity.ecsConfiguration = (EcsConfiguration)ecsConfigurationProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((LinkingTermsOfUseActivity)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/signin/LinkingTermsOfUseActivity_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
