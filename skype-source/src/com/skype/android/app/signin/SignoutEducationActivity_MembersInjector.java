// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import com.skype.android.SkypeActivity_MembersInjector;
import com.skype.android.analytics.Analytics;
import com.skype.android.app.LayoutExperience;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.util.accessibility.AccessibilityUtil;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.signin:
//            SignoutEducationActivity

public final class SignoutEducationActivity_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accessibilityUtilProvider;
    private final Provider activityAccountStateObserverProvider;
    private final Provider analyticsInAppObserverProvider;
    private final Provider analyticsObserverProvider;
    private final Provider analyticsProvider;
    private final Provider crashReporterProvider;
    private final Provider layoutExperienceProvider;
    private final Provider objectInterfaceFinderProvider;
    private final Provider shakeBugReportObserverProvider;
    private final Provider typeFaceTextStyleCallbackProvider;
    private final Provider upActionObserverProvider;
    private final Provider userPreferencesProvider;

    public SignoutEducationActivity_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11)
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
        userPreferencesProvider = provider8;
        if (!$assertionsDisabled && provider9 == null)
        {
            throw new AssertionError();
        }
        analyticsProvider = provider9;
        if (!$assertionsDisabled && provider10 == null)
        {
            throw new AssertionError();
        }
        accessibilityUtilProvider = provider10;
        if (!$assertionsDisabled && provider11 == null)
        {
            throw new AssertionError();
        } else
        {
            layoutExperienceProvider = provider11;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9, Provider provider10, Provider provider11)
    {
        return new SignoutEducationActivity_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    public static void injectAccessibilityUtil(SignoutEducationActivity signouteducationactivity, Provider provider)
    {
        signouteducationactivity.accessibilityUtil = (AccessibilityUtil)provider.get();
    }

    public static void injectAnalytics(SignoutEducationActivity signouteducationactivity, Provider provider)
    {
        signouteducationactivity.analytics = (Analytics)provider.get();
    }

    public static void injectLayoutExperience(SignoutEducationActivity signouteducationactivity, Provider provider)
    {
        signouteducationactivity.layoutExperience = (LayoutExperience)provider.get();
    }

    public static void injectUserPreferences(SignoutEducationActivity signouteducationactivity, Provider provider)
    {
        signouteducationactivity.userPreferences = (UserPreferences)provider.get();
    }

    public final void injectMembers(SignoutEducationActivity signouteducationactivity)
    {
        if (signouteducationactivity == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeActivity_MembersInjector.injectUpActionObserver(signouteducationactivity, upActionObserverProvider);
            SkypeActivity_MembersInjector.injectAnalyticsObserver(signouteducationactivity, analyticsObserverProvider);
            SkypeActivity_MembersInjector.injectAnalyticsInAppObserver(signouteducationactivity, analyticsInAppObserverProvider);
            SkypeActivity_MembersInjector.injectShakeBugReportObserver(signouteducationactivity, shakeBugReportObserverProvider);
            SkypeActivity_MembersInjector.injectCrashReporter(signouteducationactivity, crashReporterProvider);
            SkypeActivity_MembersInjector.injectTypeFaceTextStyleCallback(signouteducationactivity, typeFaceTextStyleCallbackProvider);
            SkypeActivity_MembersInjector.injectObjectInterfaceFinder(signouteducationactivity, objectInterfaceFinderProvider);
            SkypeActivity_MembersInjector.injectActivityAccountStateObserver(signouteducationactivity, activityAccountStateObserverProvider);
            signouteducationactivity.userPreferences = (UserPreferences)userPreferencesProvider.get();
            signouteducationactivity.analytics = (Analytics)analyticsProvider.get();
            signouteducationactivity.accessibilityUtil = (AccessibilityUtil)accessibilityUtilProvider.get();
            signouteducationactivity.layoutExperience = (LayoutExperience)layoutExperienceProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((SignoutEducationActivity)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/signin/SignoutEducationActivity_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
