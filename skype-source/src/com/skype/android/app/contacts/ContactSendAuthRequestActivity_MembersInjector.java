// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.view.inputmethod.InputMethodManager;
import com.skype.android.SkypeActivity_MembersInjector;
import com.skype.android.analytics.Analytics;
import com.skype.android.app.ActionBarCustomizer;
import com.skype.android.app.LayoutExperience;
import com.skype.android.util.ContactUtil;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactSendAuthRequestActivity

public final class ContactSendAuthRequestActivity_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider actionBarCustomizerProvider;
    private final Provider activityAccountStateObserverProvider;
    private final Provider analyticsInAppObserverProvider;
    private final Provider analyticsObserverProvider;
    private final Provider analyticsProvider;
    private final Provider contactUtilProvider;
    private final Provider crashReporterProvider;
    private final Provider imeProvider;
    private final Provider navProvider;
    private final Provider objectInterfaceFinderProvider;
    private final Provider shakeBugReportObserverProvider;
    private final Provider typeFaceTextStyleCallbackProvider;
    private final Provider upActionObserverProvider;

    public ContactSendAuthRequestActivity_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
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
        contactUtilProvider = provider9;
        if (!$assertionsDisabled && provider10 == null)
        {
            throw new AssertionError();
        }
        imeProvider = provider10;
        if (!$assertionsDisabled && provider11 == null)
        {
            throw new AssertionError();
        }
        analyticsProvider = provider11;
        if (!$assertionsDisabled && provider12 == null)
        {
            throw new AssertionError();
        } else
        {
            navProvider = provider12;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12)
    {
        return new ContactSendAuthRequestActivity_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12);
    }

    public static void injectActionBarCustomizer(ContactSendAuthRequestActivity contactsendauthrequestactivity, Provider provider)
    {
        contactsendauthrequestactivity.actionBarCustomizer = (ActionBarCustomizer)provider.get();
    }

    public static void injectAnalytics(ContactSendAuthRequestActivity contactsendauthrequestactivity, Provider provider)
    {
        contactsendauthrequestactivity.analytics = (Analytics)provider.get();
    }

    public static void injectContactUtil(ContactSendAuthRequestActivity contactsendauthrequestactivity, Provider provider)
    {
        contactsendauthrequestactivity.contactUtil = (ContactUtil)provider.get();
    }

    public static void injectIme(ContactSendAuthRequestActivity contactsendauthrequestactivity, Provider provider)
    {
        contactsendauthrequestactivity.ime = (InputMethodManager)provider.get();
    }

    public static void injectNav(ContactSendAuthRequestActivity contactsendauthrequestactivity, Provider provider)
    {
        contactsendauthrequestactivity.nav = (LayoutExperience)provider.get();
    }

    public final void injectMembers(ContactSendAuthRequestActivity contactsendauthrequestactivity)
    {
        if (contactsendauthrequestactivity == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeActivity_MembersInjector.injectUpActionObserver(contactsendauthrequestactivity, upActionObserverProvider);
            SkypeActivity_MembersInjector.injectAnalyticsObserver(contactsendauthrequestactivity, analyticsObserverProvider);
            SkypeActivity_MembersInjector.injectAnalyticsInAppObserver(contactsendauthrequestactivity, analyticsInAppObserverProvider);
            SkypeActivity_MembersInjector.injectShakeBugReportObserver(contactsendauthrequestactivity, shakeBugReportObserverProvider);
            SkypeActivity_MembersInjector.injectCrashReporter(contactsendauthrequestactivity, crashReporterProvider);
            SkypeActivity_MembersInjector.injectTypeFaceTextStyleCallback(contactsendauthrequestactivity, typeFaceTextStyleCallbackProvider);
            SkypeActivity_MembersInjector.injectObjectInterfaceFinder(contactsendauthrequestactivity, objectInterfaceFinderProvider);
            SkypeActivity_MembersInjector.injectActivityAccountStateObserver(contactsendauthrequestactivity, activityAccountStateObserverProvider);
            contactsendauthrequestactivity.actionBarCustomizer = (ActionBarCustomizer)actionBarCustomizerProvider.get();
            contactsendauthrequestactivity.contactUtil = (ContactUtil)contactUtilProvider.get();
            contactsendauthrequestactivity.ime = (InputMethodManager)imeProvider.get();
            contactsendauthrequestactivity.analytics = (Analytics)analyticsProvider.get();
            contactsendauthrequestactivity.nav = (LayoutExperience)navProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ContactSendAuthRequestActivity)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/contacts/ContactSendAuthRequestActivity_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
