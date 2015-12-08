// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import com.skype.SkyLib;
import com.skype.android.SkypeActivity_MembersInjector;
import com.skype.android.app.ActionBarCustomizer;
import com.skype.android.app.LayoutExperience;
import com.skype.android.app.Navigation;
import com.skype.android.util.ContactUtil;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactAddNumberActivity

public final class ContactAddNumberActivity_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider actionBarCustomizerProvider;
    private final Provider activityAccountStateObserverProvider;
    private final Provider analyticsInAppObserverProvider;
    private final Provider analyticsObserverProvider;
    private final Provider contactUtilProvider;
    private final Provider crashReporterProvider;
    private final Provider layoutExperienceProvider;
    private final Provider libProvider;
    private final Provider navigationProvider;
    private final Provider objectInterfaceFinderProvider;
    private final Provider shakeBugReportObserverProvider;
    private final Provider typeFaceTextStyleCallbackProvider;
    private final Provider upActionObserverProvider;

    public ContactAddNumberActivity_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
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
        libProvider = provider8;
        if (!$assertionsDisabled && provider9 == null)
        {
            throw new AssertionError();
        }
        contactUtilProvider = provider9;
        if (!$assertionsDisabled && provider10 == null)
        {
            throw new AssertionError();
        }
        navigationProvider = provider10;
        if (!$assertionsDisabled && provider11 == null)
        {
            throw new AssertionError();
        }
        layoutExperienceProvider = provider11;
        if (!$assertionsDisabled && provider12 == null)
        {
            throw new AssertionError();
        } else
        {
            actionBarCustomizerProvider = provider12;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12)
    {
        return new ContactAddNumberActivity_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12);
    }

    public static void injectActionBarCustomizer(ContactAddNumberActivity contactaddnumberactivity, Provider provider)
    {
        contactaddnumberactivity.actionBarCustomizer = (ActionBarCustomizer)provider.get();
    }

    public static void injectContactUtil(ContactAddNumberActivity contactaddnumberactivity, Provider provider)
    {
        contactaddnumberactivity.contactUtil = (ContactUtil)provider.get();
    }

    public static void injectLayoutExperience(ContactAddNumberActivity contactaddnumberactivity, Provider provider)
    {
        contactaddnumberactivity.layoutExperience = (LayoutExperience)provider.get();
    }

    public static void injectLib(ContactAddNumberActivity contactaddnumberactivity, Provider provider)
    {
        contactaddnumberactivity.lib = (SkyLib)provider.get();
    }

    public static void injectNavigation(ContactAddNumberActivity contactaddnumberactivity, Provider provider)
    {
        contactaddnumberactivity.navigation = (Navigation)provider.get();
    }

    public final void injectMembers(ContactAddNumberActivity contactaddnumberactivity)
    {
        if (contactaddnumberactivity == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeActivity_MembersInjector.injectUpActionObserver(contactaddnumberactivity, upActionObserverProvider);
            SkypeActivity_MembersInjector.injectAnalyticsObserver(contactaddnumberactivity, analyticsObserverProvider);
            SkypeActivity_MembersInjector.injectAnalyticsInAppObserver(contactaddnumberactivity, analyticsInAppObserverProvider);
            SkypeActivity_MembersInjector.injectShakeBugReportObserver(contactaddnumberactivity, shakeBugReportObserverProvider);
            SkypeActivity_MembersInjector.injectCrashReporter(contactaddnumberactivity, crashReporterProvider);
            SkypeActivity_MembersInjector.injectTypeFaceTextStyleCallback(contactaddnumberactivity, typeFaceTextStyleCallbackProvider);
            SkypeActivity_MembersInjector.injectObjectInterfaceFinder(contactaddnumberactivity, objectInterfaceFinderProvider);
            SkypeActivity_MembersInjector.injectActivityAccountStateObserver(contactaddnumberactivity, activityAccountStateObserverProvider);
            contactaddnumberactivity.lib = (SkyLib)libProvider.get();
            contactaddnumberactivity.contactUtil = (ContactUtil)contactUtilProvider.get();
            contactaddnumberactivity.navigation = (Navigation)navigationProvider.get();
            contactaddnumberactivity.layoutExperience = (LayoutExperience)layoutExperienceProvider.get();
            contactaddnumberactivity.actionBarCustomizer = (ActionBarCustomizer)actionBarCustomizerProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ContactAddNumberActivity)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/contacts/ContactAddNumberActivity_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
