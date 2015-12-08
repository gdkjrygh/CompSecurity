// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.dialer;

import android.os.Vibrator;
import com.skype.SkyLib;
import com.skype.android.SkypeActivity_MembersInjector;
import com.skype.android.analytics.Analytics;
import com.skype.android.app.LayoutExperience;
import com.skype.android.app.Navigation;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.permission.PermissionRequest;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.dialer:
//            DialpadActivity

public final class DialpadActivity_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider activityAccountStateObserverProvider;
    private final Provider analyticsInAppObserverProvider;
    private final Provider analyticsObserverProvider;
    private final Provider analyticsProvider;
    private final Provider asyncServiceProvider;
    private final Provider contactUtilProvider;
    private final Provider crashReporterProvider;
    private final Provider layoutExperienceProvider;
    private final Provider libProvider;
    private final Provider navProvider;
    private final Provider objectInterfaceFinderProvider;
    private final Provider permissionRequestProvider;
    private final Provider shakeBugReportObserverProvider;
    private final Provider typeFaceTextStyleCallbackProvider;
    private final Provider upActionObserverProvider;
    private final Provider vibratorProvider;

    public DialpadActivity_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
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
        contactUtilProvider = provider8;
        if (!$assertionsDisabled && provider9 == null)
        {
            throw new AssertionError();
        }
        layoutExperienceProvider = provider9;
        if (!$assertionsDisabled && provider10 == null)
        {
            throw new AssertionError();
        }
        navProvider = provider10;
        if (!$assertionsDisabled && provider11 == null)
        {
            throw new AssertionError();
        }
        libProvider = provider11;
        if (!$assertionsDisabled && provider12 == null)
        {
            throw new AssertionError();
        }
        vibratorProvider = provider12;
        if (!$assertionsDisabled && provider13 == null)
        {
            throw new AssertionError();
        }
        analyticsProvider = provider13;
        if (!$assertionsDisabled && provider14 == null)
        {
            throw new AssertionError();
        }
        asyncServiceProvider = provider14;
        if (!$assertionsDisabled && provider15 == null)
        {
            throw new AssertionError();
        } else
        {
            permissionRequestProvider = provider15;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, 
            Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14, 
            Provider provider15)
    {
        return new DialpadActivity_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15);
    }

    public static void injectAnalytics(DialpadActivity dialpadactivity, Provider provider)
    {
        dialpadactivity.analytics = (Analytics)provider.get();
    }

    public static void injectAsyncService(DialpadActivity dialpadactivity, Provider provider)
    {
        dialpadactivity.asyncService = (AsyncService)provider.get();
    }

    public static void injectContactUtil(DialpadActivity dialpadactivity, Provider provider)
    {
        dialpadactivity.contactUtil = (ContactUtil)provider.get();
    }

    public static void injectLayoutExperience(DialpadActivity dialpadactivity, Provider provider)
    {
        dialpadactivity.layoutExperience = (LayoutExperience)provider.get();
    }

    public static void injectLib(DialpadActivity dialpadactivity, Provider provider)
    {
        dialpadactivity.lib = (SkyLib)provider.get();
    }

    public static void injectNav(DialpadActivity dialpadactivity, Provider provider)
    {
        dialpadactivity.nav = (Navigation)provider.get();
    }

    public static void injectPermissionRequest(DialpadActivity dialpadactivity, Provider provider)
    {
        dialpadactivity.permissionRequest = (PermissionRequest)provider.get();
    }

    public static void injectVibrator(DialpadActivity dialpadactivity, Provider provider)
    {
        dialpadactivity.vibrator = (Vibrator)provider.get();
    }

    public final void injectMembers(DialpadActivity dialpadactivity)
    {
        if (dialpadactivity == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeActivity_MembersInjector.injectUpActionObserver(dialpadactivity, upActionObserverProvider);
            SkypeActivity_MembersInjector.injectAnalyticsObserver(dialpadactivity, analyticsObserverProvider);
            SkypeActivity_MembersInjector.injectAnalyticsInAppObserver(dialpadactivity, analyticsInAppObserverProvider);
            SkypeActivity_MembersInjector.injectShakeBugReportObserver(dialpadactivity, shakeBugReportObserverProvider);
            SkypeActivity_MembersInjector.injectCrashReporter(dialpadactivity, crashReporterProvider);
            SkypeActivity_MembersInjector.injectTypeFaceTextStyleCallback(dialpadactivity, typeFaceTextStyleCallbackProvider);
            SkypeActivity_MembersInjector.injectObjectInterfaceFinder(dialpadactivity, objectInterfaceFinderProvider);
            SkypeActivity_MembersInjector.injectActivityAccountStateObserver(dialpadactivity, activityAccountStateObserverProvider);
            dialpadactivity.contactUtil = (ContactUtil)contactUtilProvider.get();
            dialpadactivity.layoutExperience = (LayoutExperience)layoutExperienceProvider.get();
            dialpadactivity.nav = (Navigation)navProvider.get();
            dialpadactivity.lib = (SkyLib)libProvider.get();
            dialpadactivity.vibrator = (Vibrator)vibratorProvider.get();
            dialpadactivity.analytics = (Analytics)analyticsProvider.get();
            dialpadactivity.asyncService = (AsyncService)asyncServiceProvider.get();
            dialpadactivity.permissionRequest = (PermissionRequest)permissionRequestProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((DialpadActivity)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/dialer/DialpadActivity_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
