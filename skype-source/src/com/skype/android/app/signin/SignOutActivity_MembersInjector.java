// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import com.skype.Account;
import com.skype.android.SkypeActivity_MembersInjector;
import com.skype.android.app.Navigation;
import com.skype.android.app.calling.CallQualityFeedbackManager;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.mediacontent.MediaContentRoster;
import com.skype.android.push.SkypePushListener;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.signin:
//            SignOutActivity, AccountStatusNotifier

public final class SignOutActivity_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accountProvider;
    private final Provider accountStatusNotifierProvider;
    private final Provider activityAccountStateObserverProvider;
    private final Provider analyticsInAppObserverProvider;
    private final Provider analyticsObserverProvider;
    private final Provider cqfManagerProvider;
    private final Provider crashReporterProvider;
    private final Provider ecsConfigurationProvider;
    private final Provider emoticonsProvider;
    private final Provider navigationProvider;
    private final Provider objectInterfaceFinderProvider;
    private final Provider pushListenerProvider;
    private final Provider shakeBugReportObserverProvider;
    private final Provider typeFaceTextStyleCallbackProvider;
    private final Provider upActionObserverProvider;
    private final Provider userPreferencesProvider;

    public SignOutActivity_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, 
            Provider provider14, Provider provider15)
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
        accountProvider = provider8;
        if (!$assertionsDisabled && provider9 == null)
        {
            throw new AssertionError();
        }
        navigationProvider = provider9;
        if (!$assertionsDisabled && provider10 == null)
        {
            throw new AssertionError();
        }
        cqfManagerProvider = provider10;
        if (!$assertionsDisabled && provider11 == null)
        {
            throw new AssertionError();
        }
        userPreferencesProvider = provider11;
        if (!$assertionsDisabled && provider12 == null)
        {
            throw new AssertionError();
        }
        pushListenerProvider = provider12;
        if (!$assertionsDisabled && provider13 == null)
        {
            throw new AssertionError();
        }
        accountStatusNotifierProvider = provider13;
        if (!$assertionsDisabled && provider14 == null)
        {
            throw new AssertionError();
        }
        ecsConfigurationProvider = provider14;
        if (!$assertionsDisabled && provider15 == null)
        {
            throw new AssertionError();
        } else
        {
            emoticonsProvider = provider15;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14, 
            Provider provider15)
    {
        return new SignOutActivity_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15);
    }

    public static void injectAccount(SignOutActivity signoutactivity, Provider provider)
    {
        signoutactivity.account = (Account)provider.get();
    }

    public static void injectAccountStatusNotifier(SignOutActivity signoutactivity, Provider provider)
    {
        signoutactivity.accountStatusNotifier = (AccountStatusNotifier)provider.get();
    }

    public static void injectCqfManager(SignOutActivity signoutactivity, Provider provider)
    {
        signoutactivity.cqfManager = (CallQualityFeedbackManager)provider.get();
    }

    public static void injectEcsConfiguration(SignOutActivity signoutactivity, Provider provider)
    {
        signoutactivity.ecsConfiguration = (EcsConfiguration)provider.get();
    }

    public static void injectEmoticons(SignOutActivity signoutactivity, Provider provider)
    {
        signoutactivity.emoticons = (MediaContentRoster)provider.get();
    }

    public static void injectNavigation(SignOutActivity signoutactivity, Provider provider)
    {
        signoutactivity.navigation = (Navigation)provider.get();
    }

    public static void injectPushListener(SignOutActivity signoutactivity, Provider provider)
    {
        signoutactivity.pushListener = (SkypePushListener)provider.get();
    }

    public static void injectUserPreferences(SignOutActivity signoutactivity, Provider provider)
    {
        signoutactivity.userPreferences = (UserPreferences)provider.get();
    }

    public final void injectMembers(SignOutActivity signoutactivity)
    {
        if (signoutactivity == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeActivity_MembersInjector.injectUpActionObserver(signoutactivity, upActionObserverProvider);
            SkypeActivity_MembersInjector.injectAnalyticsObserver(signoutactivity, analyticsObserverProvider);
            SkypeActivity_MembersInjector.injectAnalyticsInAppObserver(signoutactivity, analyticsInAppObserverProvider);
            SkypeActivity_MembersInjector.injectShakeBugReportObserver(signoutactivity, shakeBugReportObserverProvider);
            SkypeActivity_MembersInjector.injectCrashReporter(signoutactivity, crashReporterProvider);
            SkypeActivity_MembersInjector.injectTypeFaceTextStyleCallback(signoutactivity, typeFaceTextStyleCallbackProvider);
            SkypeActivity_MembersInjector.injectObjectInterfaceFinder(signoutactivity, objectInterfaceFinderProvider);
            SkypeActivity_MembersInjector.injectActivityAccountStateObserver(signoutactivity, activityAccountStateObserverProvider);
            signoutactivity.account = (Account)accountProvider.get();
            signoutactivity.navigation = (Navigation)navigationProvider.get();
            signoutactivity.cqfManager = (CallQualityFeedbackManager)cqfManagerProvider.get();
            signoutactivity.userPreferences = (UserPreferences)userPreferencesProvider.get();
            signoutactivity.pushListener = (SkypePushListener)pushListenerProvider.get();
            signoutactivity.accountStatusNotifier = (AccountStatusNotifier)accountStatusNotifierProvider.get();
            signoutactivity.ecsConfiguration = (EcsConfiguration)ecsConfigurationProvider.get();
            signoutactivity.emoticons = (MediaContentRoster)emoticonsProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((SignOutActivity)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/signin/SignOutActivity_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
