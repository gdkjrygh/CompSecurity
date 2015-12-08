// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import android.view.inputmethod.InputMethodManager;
import com.skype.SkyLib;
import com.skype.android.SkypeActivity_MembersInjector;
import com.skype.android.app.ActionBarCustomizer;
import com.skype.android.app.LayoutExperience;
import com.skype.android.app.Navigation;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.event.EventBus;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.TimeUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.android.util.cache.ContactMoodCache;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.calling:
//            CallActivity, b

public final class CallActivity_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accessibilityProvider;
    private final Provider actionBarCustomizerProvider;
    private final Provider activityAccountStateObserverProvider;
    private final Provider analyticsInAppObserverProvider;
    private final Provider analyticsObserverProvider;
    private final Provider callEndedOverlayProvider;
    private final Provider contactUtilProvider;
    private final Provider conversationUtilProvider;
    private final Provider crashReporterProvider;
    private final Provider eventBusProvider;
    private final Provider imeProvider;
    private final Provider layoutExperienceProvider;
    private final Provider libProvider;
    private final Provider mapProvider;
    private final Provider navigationProvider;
    private final Provider objectInterfaceFinderProvider;
    private final Provider shakeBugReportObserverProvider;
    private final Provider spannedTextProvider;
    private final Provider timeUtilProvider;
    private final Provider typeFaceTextStyleCallbackProvider;
    private final Provider upActionObserverProvider;
    private final Provider userPreferencesProvider;

    public CallActivity_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, 
            Provider provider14, Provider provider15, Provider provider16, Provider provider17, Provider provider18, Provider provider19, Provider provider20, 
            Provider provider21)
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
        mapProvider = provider8;
        if (!$assertionsDisabled && provider9 == null)
        {
            throw new AssertionError();
        }
        conversationUtilProvider = provider9;
        if (!$assertionsDisabled && provider10 == null)
        {
            throw new AssertionError();
        }
        contactUtilProvider = provider10;
        if (!$assertionsDisabled && provider11 == null)
        {
            throw new AssertionError();
        }
        timeUtilProvider = provider11;
        if (!$assertionsDisabled && provider12 == null)
        {
            throw new AssertionError();
        }
        navigationProvider = provider12;
        if (!$assertionsDisabled && provider13 == null)
        {
            throw new AssertionError();
        }
        layoutExperienceProvider = provider13;
        if (!$assertionsDisabled && provider14 == null)
        {
            throw new AssertionError();
        }
        imeProvider = provider14;
        if (!$assertionsDisabled && provider15 == null)
        {
            throw new AssertionError();
        }
        actionBarCustomizerProvider = provider15;
        if (!$assertionsDisabled && provider16 == null)
        {
            throw new AssertionError();
        }
        spannedTextProvider = provider16;
        if (!$assertionsDisabled && provider17 == null)
        {
            throw new AssertionError();
        }
        callEndedOverlayProvider = provider17;
        if (!$assertionsDisabled && provider18 == null)
        {
            throw new AssertionError();
        }
        accessibilityProvider = provider18;
        if (!$assertionsDisabled && provider19 == null)
        {
            throw new AssertionError();
        }
        eventBusProvider = provider19;
        if (!$assertionsDisabled && provider20 == null)
        {
            throw new AssertionError();
        }
        libProvider = provider20;
        if (!$assertionsDisabled && provider21 == null)
        {
            throw new AssertionError();
        } else
        {
            userPreferencesProvider = provider21;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14, 
            Provider provider15, Provider provider16, Provider provider17, Provider provider18, Provider provider19, Provider provider20, Provider provider21)
    {
        return new CallActivity_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19, provider20, provider21);
    }

    public static void injectAccessibility(CallActivity callactivity, Provider provider)
    {
        callactivity.accessibility = (AccessibilityUtil)provider.get();
    }

    public static void injectActionBarCustomizer(CallActivity callactivity, Provider provider)
    {
        callactivity.actionBarCustomizer = (ActionBarCustomizer)provider.get();
    }

    public static void injectCallEndedOverlay(CallActivity callactivity, Provider provider)
    {
        callactivity.callEndedOverlay = (b)provider.get();
    }

    public static void injectContactUtil(CallActivity callactivity, Provider provider)
    {
        callactivity.contactUtil = (ContactUtil)provider.get();
    }

    public static void injectConversationUtil(CallActivity callactivity, Provider provider)
    {
        callactivity.conversationUtil = (ConversationUtil)provider.get();
    }

    public static void injectEventBus(CallActivity callactivity, Provider provider)
    {
        callactivity.eventBus = (EventBus)provider.get();
    }

    public static void injectIme(CallActivity callactivity, Provider provider)
    {
        callactivity.ime = (InputMethodManager)provider.get();
    }

    public static void injectLayoutExperience(CallActivity callactivity, Provider provider)
    {
        callactivity.layoutExperience = (LayoutExperience)provider.get();
    }

    public static void injectLib(CallActivity callactivity, Provider provider)
    {
        callactivity.lib = (SkyLib)provider.get();
    }

    public static void injectMap(CallActivity callactivity, Provider provider)
    {
        callactivity.map = (ObjectIdMap)provider.get();
    }

    public static void injectNavigation(CallActivity callactivity, Provider provider)
    {
        callactivity.navigation = (Navigation)provider.get();
    }

    public static void injectSpannedText(CallActivity callactivity, Provider provider)
    {
        callactivity.spannedText = (ContactMoodCache)provider.get();
    }

    public static void injectTimeUtil(CallActivity callactivity, Provider provider)
    {
        callactivity.timeUtil = (TimeUtil)provider.get();
    }

    public static void injectUserPreferences(CallActivity callactivity, Provider provider)
    {
        callactivity.userPreferences = (UserPreferences)provider.get();
    }

    public final void injectMembers(CallActivity callactivity)
    {
        if (callactivity == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeActivity_MembersInjector.injectUpActionObserver(callactivity, upActionObserverProvider);
            SkypeActivity_MembersInjector.injectAnalyticsObserver(callactivity, analyticsObserverProvider);
            SkypeActivity_MembersInjector.injectAnalyticsInAppObserver(callactivity, analyticsInAppObserverProvider);
            SkypeActivity_MembersInjector.injectShakeBugReportObserver(callactivity, shakeBugReportObserverProvider);
            SkypeActivity_MembersInjector.injectCrashReporter(callactivity, crashReporterProvider);
            SkypeActivity_MembersInjector.injectTypeFaceTextStyleCallback(callactivity, typeFaceTextStyleCallbackProvider);
            SkypeActivity_MembersInjector.injectObjectInterfaceFinder(callactivity, objectInterfaceFinderProvider);
            SkypeActivity_MembersInjector.injectActivityAccountStateObserver(callactivity, activityAccountStateObserverProvider);
            callactivity.map = (ObjectIdMap)mapProvider.get();
            callactivity.conversationUtil = (ConversationUtil)conversationUtilProvider.get();
            callactivity.contactUtil = (ContactUtil)contactUtilProvider.get();
            callactivity.timeUtil = (TimeUtil)timeUtilProvider.get();
            callactivity.navigation = (Navigation)navigationProvider.get();
            callactivity.layoutExperience = (LayoutExperience)layoutExperienceProvider.get();
            callactivity.ime = (InputMethodManager)imeProvider.get();
            callactivity.actionBarCustomizer = (ActionBarCustomizer)actionBarCustomizerProvider.get();
            callactivity.spannedText = (ContactMoodCache)spannedTextProvider.get();
            callactivity.callEndedOverlay = (b)callEndedOverlayProvider.get();
            callactivity.accessibility = (AccessibilityUtil)accessibilityProvider.get();
            callactivity.eventBus = (EventBus)eventBusProvider.get();
            callactivity.lib = (SkyLib)libProvider.get();
            callactivity.userPreferences = (UserPreferences)userPreferencesProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((CallActivity)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/calling/CallActivity_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
