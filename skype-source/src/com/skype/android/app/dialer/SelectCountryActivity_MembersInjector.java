// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.dialer;

import com.skype.android.SkypeActivity_MembersInjector;
import com.skype.android.app.ActionBarCustomizer;
import com.skype.android.app.settings.UserPreferences;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.dialer:
//            SelectCountryActivity, CountriesAdapter

public final class SelectCountryActivity_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider actionBarCustomizerProvider;
    private final Provider activityAccountStateObserverProvider;
    private final Provider adapterProvider;
    private final Provider analyticsInAppObserverProvider;
    private final Provider analyticsObserverProvider;
    private final Provider crashReporterProvider;
    private final Provider objectInterfaceFinderProvider;
    private final Provider shakeBugReportObserverProvider;
    private final Provider typeFaceTextStyleCallbackProvider;
    private final Provider upActionObserverProvider;
    private final Provider userPrefsProvider;

    public SelectCountryActivity_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8, Provider provider9, Provider provider10)
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
        adapterProvider = provider9;
        if (!$assertionsDisabled && provider10 == null)
        {
            throw new AssertionError();
        } else
        {
            userPrefsProvider = provider10;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9, Provider provider10)
    {
        return new SelectCountryActivity_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    public static void injectActionBarCustomizer(SelectCountryActivity selectcountryactivity, Provider provider)
    {
        selectcountryactivity.actionBarCustomizer = (ActionBarCustomizer)provider.get();
    }

    public static void injectAdapter(SelectCountryActivity selectcountryactivity, Provider provider)
    {
        selectcountryactivity.adapter = (CountriesAdapter)provider.get();
    }

    public static void injectUserPrefs(SelectCountryActivity selectcountryactivity, Provider provider)
    {
        selectcountryactivity.userPrefs = (UserPreferences)provider.get();
    }

    public final void injectMembers(SelectCountryActivity selectcountryactivity)
    {
        if (selectcountryactivity == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeActivity_MembersInjector.injectUpActionObserver(selectcountryactivity, upActionObserverProvider);
            SkypeActivity_MembersInjector.injectAnalyticsObserver(selectcountryactivity, analyticsObserverProvider);
            SkypeActivity_MembersInjector.injectAnalyticsInAppObserver(selectcountryactivity, analyticsInAppObserverProvider);
            SkypeActivity_MembersInjector.injectShakeBugReportObserver(selectcountryactivity, shakeBugReportObserverProvider);
            SkypeActivity_MembersInjector.injectCrashReporter(selectcountryactivity, crashReporterProvider);
            SkypeActivity_MembersInjector.injectTypeFaceTextStyleCallback(selectcountryactivity, typeFaceTextStyleCallbackProvider);
            SkypeActivity_MembersInjector.injectObjectInterfaceFinder(selectcountryactivity, objectInterfaceFinderProvider);
            SkypeActivity_MembersInjector.injectActivityAccountStateObserver(selectcountryactivity, activityAccountStateObserverProvider);
            selectcountryactivity.actionBarCustomizer = (ActionBarCustomizer)actionBarCustomizerProvider.get();
            selectcountryactivity.adapter = (CountriesAdapter)adapterProvider.get();
            selectcountryactivity.userPrefs = (UserPreferences)userPrefsProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((SelectCountryActivity)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/dialer/SelectCountryActivity_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
