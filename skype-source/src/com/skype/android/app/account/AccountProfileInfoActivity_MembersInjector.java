// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.account;

import com.skype.Account;
import com.skype.android.SkypeActivity_MembersInjector;
import com.skype.android.app.ActionBarCustomizer;
import com.skype.android.app.Navigation;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.TimeUtil;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.account:
//            AccountProfileInfoActivity

public final class AccountProfileInfoActivity_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accountProvider;
    private final Provider actionBarCustomizerProvider;
    private final Provider activityAccountStateObserverProvider;
    private final Provider analyticsInAppObserverProvider;
    private final Provider analyticsObserverProvider;
    private final Provider contactUtilProvider;
    private final Provider crashReporterProvider;
    private final Provider navProvider;
    private final Provider objectInterfaceFinderProvider;
    private final Provider shakeBugReportObserverProvider;
    private final Provider timeUtilProvider;
    private final Provider typeFaceTextStyleCallbackProvider;
    private final Provider upActionObserverProvider;

    public AccountProfileInfoActivity_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
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
        navProvider = provider8;
        if (!$assertionsDisabled && provider9 == null)
        {
            throw new AssertionError();
        }
        accountProvider = provider9;
        if (!$assertionsDisabled && provider10 == null)
        {
            throw new AssertionError();
        }
        actionBarCustomizerProvider = provider10;
        if (!$assertionsDisabled && provider11 == null)
        {
            throw new AssertionError();
        }
        timeUtilProvider = provider11;
        if (!$assertionsDisabled && provider12 == null)
        {
            throw new AssertionError();
        } else
        {
            contactUtilProvider = provider12;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12)
    {
        return new AccountProfileInfoActivity_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12);
    }

    public static void injectAccount(AccountProfileInfoActivity accountprofileinfoactivity, Provider provider)
    {
        accountprofileinfoactivity.account = (Account)provider.get();
    }

    public static void injectActionBarCustomizer(AccountProfileInfoActivity accountprofileinfoactivity, Provider provider)
    {
        accountprofileinfoactivity.actionBarCustomizer = (ActionBarCustomizer)provider.get();
    }

    public static void injectContactUtil(AccountProfileInfoActivity accountprofileinfoactivity, Provider provider)
    {
        accountprofileinfoactivity.contactUtil = (ContactUtil)provider.get();
    }

    public static void injectNav(AccountProfileInfoActivity accountprofileinfoactivity, Provider provider)
    {
        accountprofileinfoactivity.nav = (Navigation)provider.get();
    }

    public static void injectTimeUtil(AccountProfileInfoActivity accountprofileinfoactivity, Provider provider)
    {
        accountprofileinfoactivity.timeUtil = (TimeUtil)provider.get();
    }

    public final void injectMembers(AccountProfileInfoActivity accountprofileinfoactivity)
    {
        if (accountprofileinfoactivity == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeActivity_MembersInjector.injectUpActionObserver(accountprofileinfoactivity, upActionObserverProvider);
            SkypeActivity_MembersInjector.injectAnalyticsObserver(accountprofileinfoactivity, analyticsObserverProvider);
            SkypeActivity_MembersInjector.injectAnalyticsInAppObserver(accountprofileinfoactivity, analyticsInAppObserverProvider);
            SkypeActivity_MembersInjector.injectShakeBugReportObserver(accountprofileinfoactivity, shakeBugReportObserverProvider);
            SkypeActivity_MembersInjector.injectCrashReporter(accountprofileinfoactivity, crashReporterProvider);
            SkypeActivity_MembersInjector.injectTypeFaceTextStyleCallback(accountprofileinfoactivity, typeFaceTextStyleCallbackProvider);
            SkypeActivity_MembersInjector.injectObjectInterfaceFinder(accountprofileinfoactivity, objectInterfaceFinderProvider);
            SkypeActivity_MembersInjector.injectActivityAccountStateObserver(accountprofileinfoactivity, activityAccountStateObserverProvider);
            accountprofileinfoactivity.nav = (Navigation)navProvider.get();
            accountprofileinfoactivity.account = (Account)accountProvider.get();
            accountprofileinfoactivity.actionBarCustomizer = (ActionBarCustomizer)actionBarCustomizerProvider.get();
            accountprofileinfoactivity.timeUtil = (TimeUtil)timeUtilProvider.get();
            accountprofileinfoactivity.contactUtil = (ContactUtil)contactUtilProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((AccountProfileInfoActivity)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/account/AccountProfileInfoActivity_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
