// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.location;

import com.skype.android.SkypeActivity_MembersInjector;
import com.skype.android.analytics.Analytics;
import com.skype.android.app.ActionBarCustomizer;
import com.skype.android.event.EventBus;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ConversationUtil;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.location:
//            SendLocationActivity

public final class SendLocationActivity_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider actionBarCustomizerProvider;
    private final Provider activityAccountStateObserverProvider;
    private final Provider analyticsInAppObserverProvider;
    private final Provider analyticsObserverProvider;
    private final Provider analyticsProvider;
    private final Provider busProvider;
    private final Provider conversationUtilProvider;
    private final Provider crashReporterProvider;
    private final Provider mapProvider;
    private final Provider objectInterfaceFinderProvider;
    private final Provider shakeBugReportObserverProvider;
    private final Provider typeFaceTextStyleCallbackProvider;
    private final Provider upActionObserverProvider;

    public SendLocationActivity_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
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
        mapProvider = provider8;
        if (!$assertionsDisabled && provider9 == null)
        {
            throw new AssertionError();
        }
        actionBarCustomizerProvider = provider9;
        if (!$assertionsDisabled && provider10 == null)
        {
            throw new AssertionError();
        }
        analyticsProvider = provider10;
        if (!$assertionsDisabled && provider11 == null)
        {
            throw new AssertionError();
        }
        busProvider = provider11;
        if (!$assertionsDisabled && provider12 == null)
        {
            throw new AssertionError();
        } else
        {
            conversationUtilProvider = provider12;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12)
    {
        return new SendLocationActivity_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12);
    }

    public static void injectActionBarCustomizer(SendLocationActivity sendlocationactivity, Provider provider)
    {
        sendlocationactivity.actionBarCustomizer = (ActionBarCustomizer)provider.get();
    }

    public static void injectAnalytics(SendLocationActivity sendlocationactivity, Provider provider)
    {
        sendlocationactivity.analytics = (Analytics)provider.get();
    }

    public static void injectBus(SendLocationActivity sendlocationactivity, Provider provider)
    {
        sendlocationactivity.bus = (EventBus)provider.get();
    }

    public static void injectConversationUtil(SendLocationActivity sendlocationactivity, Provider provider)
    {
        sendlocationactivity.conversationUtil = (ConversationUtil)provider.get();
    }

    public static void injectMap(SendLocationActivity sendlocationactivity, Provider provider)
    {
        sendlocationactivity.map = (ObjectIdMap)provider.get();
    }

    public final void injectMembers(SendLocationActivity sendlocationactivity)
    {
        if (sendlocationactivity == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeActivity_MembersInjector.injectUpActionObserver(sendlocationactivity, upActionObserverProvider);
            SkypeActivity_MembersInjector.injectAnalyticsObserver(sendlocationactivity, analyticsObserverProvider);
            SkypeActivity_MembersInjector.injectAnalyticsInAppObserver(sendlocationactivity, analyticsInAppObserverProvider);
            SkypeActivity_MembersInjector.injectShakeBugReportObserver(sendlocationactivity, shakeBugReportObserverProvider);
            SkypeActivity_MembersInjector.injectCrashReporter(sendlocationactivity, crashReporterProvider);
            SkypeActivity_MembersInjector.injectTypeFaceTextStyleCallback(sendlocationactivity, typeFaceTextStyleCallbackProvider);
            SkypeActivity_MembersInjector.injectObjectInterfaceFinder(sendlocationactivity, objectInterfaceFinderProvider);
            SkypeActivity_MembersInjector.injectActivityAccountStateObserver(sendlocationactivity, activityAccountStateObserverProvider);
            sendlocationactivity.map = (ObjectIdMap)mapProvider.get();
            sendlocationactivity.actionBarCustomizer = (ActionBarCustomizer)actionBarCustomizerProvider.get();
            sendlocationactivity.analytics = (Analytics)analyticsProvider.get();
            sendlocationactivity.bus = (EventBus)busProvider.get();
            sendlocationactivity.conversationUtil = (ConversationUtil)conversationUtilProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((SendLocationActivity)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/location/SendLocationActivity_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
