// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.vim;

import com.skype.android.SkypeActivity_MembersInjector;
import com.skype.android.analytics.Analytics;
import com.skype.android.app.Navigation;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.vim:
//            VideoMessagePromotionActivity

public final class VideoMessagePromotionActivity_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider activityAccountStateObserverProvider;
    private final Provider analyticsInAppObserverProvider;
    private final Provider analyticsObserverProvider;
    private final Provider analyticsProvider;
    private final Provider contactUtilProvider;
    private final Provider conversationUtilProvider;
    private final Provider crashReporterProvider;
    private final Provider navigationProvider;
    private final Provider objectInterfaceFinderProvider;
    private final Provider shakeBugReportObserverProvider;
    private final Provider typeFaceTextStyleCallbackProvider;
    private final Provider upActionObserverProvider;

    public VideoMessagePromotionActivity_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
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
        navigationProvider = provider8;
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
        } else
        {
            analyticsProvider = provider11;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9, Provider provider10, Provider provider11)
    {
        return new VideoMessagePromotionActivity_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    public static void injectAnalytics(VideoMessagePromotionActivity videomessagepromotionactivity, Provider provider)
    {
        videomessagepromotionactivity.analytics = (Analytics)provider.get();
    }

    public static void injectContactUtil(VideoMessagePromotionActivity videomessagepromotionactivity, Provider provider)
    {
        videomessagepromotionactivity.contactUtil = (ContactUtil)provider.get();
    }

    public static void injectConversationUtil(VideoMessagePromotionActivity videomessagepromotionactivity, Provider provider)
    {
        videomessagepromotionactivity.conversationUtil = (ConversationUtil)provider.get();
    }

    public static void injectNavigation(VideoMessagePromotionActivity videomessagepromotionactivity, Provider provider)
    {
        videomessagepromotionactivity.navigation = (Navigation)provider.get();
    }

    public final void injectMembers(VideoMessagePromotionActivity videomessagepromotionactivity)
    {
        if (videomessagepromotionactivity == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeActivity_MembersInjector.injectUpActionObserver(videomessagepromotionactivity, upActionObserverProvider);
            SkypeActivity_MembersInjector.injectAnalyticsObserver(videomessagepromotionactivity, analyticsObserverProvider);
            SkypeActivity_MembersInjector.injectAnalyticsInAppObserver(videomessagepromotionactivity, analyticsInAppObserverProvider);
            SkypeActivity_MembersInjector.injectShakeBugReportObserver(videomessagepromotionactivity, shakeBugReportObserverProvider);
            SkypeActivity_MembersInjector.injectCrashReporter(videomessagepromotionactivity, crashReporterProvider);
            SkypeActivity_MembersInjector.injectTypeFaceTextStyleCallback(videomessagepromotionactivity, typeFaceTextStyleCallbackProvider);
            SkypeActivity_MembersInjector.injectObjectInterfaceFinder(videomessagepromotionactivity, objectInterfaceFinderProvider);
            SkypeActivity_MembersInjector.injectActivityAccountStateObserver(videomessagepromotionactivity, activityAccountStateObserverProvider);
            videomessagepromotionactivity.navigation = (Navigation)navigationProvider.get();
            videomessagepromotionactivity.conversationUtil = (ConversationUtil)conversationUtilProvider.get();
            videomessagepromotionactivity.contactUtil = (ContactUtil)contactUtilProvider.get();
            videomessagepromotionactivity.analytics = (Analytics)analyticsProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((VideoMessagePromotionActivity)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/vim/VideoMessagePromotionActivity_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
