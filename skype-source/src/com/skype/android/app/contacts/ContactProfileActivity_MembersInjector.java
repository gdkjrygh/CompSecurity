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
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.TimeUtil;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactProfileActivity

public final class ContactProfileActivity_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider actionBarCustomizerProvider;
    private final Provider activityAccountStateObserverProvider;
    private final Provider analyticsInAppObserverProvider;
    private final Provider analyticsObserverProvider;
    private final Provider contactUtilProvider;
    private final Provider conversationUtilProvider;
    private final Provider crashReporterProvider;
    private final Provider layoutExperienceProvider;
    private final Provider libProvider;
    private final Provider navigationProvider;
    private final Provider objectInterfaceFinderProvider;
    private final Provider shakeBugReportObserverProvider;
    private final Provider timeUtilProvider;
    private final Provider typeFaceTextStyleCallbackProvider;
    private final Provider upActionObserverProvider;

    public ContactProfileActivity_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, 
            Provider provider14)
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
        timeUtilProvider = provider10;
        if (!$assertionsDisabled && provider11 == null)
        {
            throw new AssertionError();
        }
        conversationUtilProvider = provider11;
        if (!$assertionsDisabled && provider12 == null)
        {
            throw new AssertionError();
        }
        layoutExperienceProvider = provider12;
        if (!$assertionsDisabled && provider13 == null)
        {
            throw new AssertionError();
        }
        navigationProvider = provider13;
        if (!$assertionsDisabled && provider14 == null)
        {
            throw new AssertionError();
        } else
        {
            libProvider = provider14;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14)
    {
        return new ContactProfileActivity_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14);
    }

    public static void injectActionBarCustomizer(ContactProfileActivity contactprofileactivity, Provider provider)
    {
        contactprofileactivity.actionBarCustomizer = (ActionBarCustomizer)provider.get();
    }

    public static void injectContactUtil(ContactProfileActivity contactprofileactivity, Provider provider)
    {
        contactprofileactivity.contactUtil = (ContactUtil)provider.get();
    }

    public static void injectConversationUtil(ContactProfileActivity contactprofileactivity, Provider provider)
    {
        contactprofileactivity.conversationUtil = (ConversationUtil)provider.get();
    }

    public static void injectLayoutExperience(ContactProfileActivity contactprofileactivity, Provider provider)
    {
        contactprofileactivity.layoutExperience = (LayoutExperience)provider.get();
    }

    public static void injectLib(ContactProfileActivity contactprofileactivity, Provider provider)
    {
        contactprofileactivity.lib = (SkyLib)provider.get();
    }

    public static void injectNavigation(ContactProfileActivity contactprofileactivity, Provider provider)
    {
        contactprofileactivity.navigation = (Navigation)provider.get();
    }

    public static void injectTimeUtil(ContactProfileActivity contactprofileactivity, Provider provider)
    {
        contactprofileactivity.timeUtil = (TimeUtil)provider.get();
    }

    public final void injectMembers(ContactProfileActivity contactprofileactivity)
    {
        if (contactprofileactivity == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeActivity_MembersInjector.injectUpActionObserver(contactprofileactivity, upActionObserverProvider);
            SkypeActivity_MembersInjector.injectAnalyticsObserver(contactprofileactivity, analyticsObserverProvider);
            SkypeActivity_MembersInjector.injectAnalyticsInAppObserver(contactprofileactivity, analyticsInAppObserverProvider);
            SkypeActivity_MembersInjector.injectShakeBugReportObserver(contactprofileactivity, shakeBugReportObserverProvider);
            SkypeActivity_MembersInjector.injectCrashReporter(contactprofileactivity, crashReporterProvider);
            SkypeActivity_MembersInjector.injectTypeFaceTextStyleCallback(contactprofileactivity, typeFaceTextStyleCallbackProvider);
            SkypeActivity_MembersInjector.injectObjectInterfaceFinder(contactprofileactivity, objectInterfaceFinderProvider);
            SkypeActivity_MembersInjector.injectActivityAccountStateObserver(contactprofileactivity, activityAccountStateObserverProvider);
            contactprofileactivity.actionBarCustomizer = (ActionBarCustomizer)actionBarCustomizerProvider.get();
            contactprofileactivity.contactUtil = (ContactUtil)contactUtilProvider.get();
            contactprofileactivity.timeUtil = (TimeUtil)timeUtilProvider.get();
            contactprofileactivity.conversationUtil = (ConversationUtil)conversationUtilProvider.get();
            contactprofileactivity.layoutExperience = (LayoutExperience)layoutExperienceProvider.get();
            contactprofileactivity.navigation = (Navigation)navigationProvider.get();
            contactprofileactivity.lib = (SkyLib)libProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ContactProfileActivity)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/contacts/ContactProfileActivity_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
