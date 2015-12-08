// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android;

import com.skype.android.analytics.AnalyticsInAppObserver;
import com.skype.android.analytics.AnalyticsLifecycleObserver;
import com.skype.android.crash.CrashReporter;
import com.skype.android.inject.ActivityAccountStateObserver;
import com.skype.android.inject.ObjectInterfaceFinder;
import com.skype.android.inject.ShakeBugReportObserver;
import com.skype.android.inject.UpActionObserver;
import com.skype.android.text.TypeFaceTextStyleCallback;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android:
//            SkypeActivity

public final class SkypeActivity_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider activityAccountStateObserverProvider;
    private final Provider analyticsInAppObserverProvider;
    private final Provider analyticsObserverProvider;
    private final Provider crashReporterProvider;
    private final Provider objectInterfaceFinderProvider;
    private final Provider shakeBugReportObserverProvider;
    private final Provider typeFaceTextStyleCallbackProvider;
    private final Provider upActionObserverProvider;

    public SkypeActivity_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7)
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
        } else
        {
            activityAccountStateObserverProvider = provider7;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7)
    {
        return new SkypeActivity_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static void injectActivityAccountStateObserver(SkypeActivity skypeactivity, Provider provider)
    {
        skypeactivity.activityAccountStateObserver = (ActivityAccountStateObserver)provider.get();
    }

    public static void injectAnalyticsInAppObserver(SkypeActivity skypeactivity, Provider provider)
    {
        skypeactivity.analyticsInAppObserver = (AnalyticsInAppObserver)provider.get();
    }

    public static void injectAnalyticsObserver(SkypeActivity skypeactivity, Provider provider)
    {
        skypeactivity.analyticsObserver = (AnalyticsLifecycleObserver)provider.get();
    }

    public static void injectCrashReporter(SkypeActivity skypeactivity, Provider provider)
    {
        skypeactivity.crashReporter = (CrashReporter)provider.get();
    }

    public static void injectObjectInterfaceFinder(SkypeActivity skypeactivity, Provider provider)
    {
        skypeactivity.objectInterfaceFinder = (ObjectInterfaceFinder)provider.get();
    }

    public static void injectShakeBugReportObserver(SkypeActivity skypeactivity, Provider provider)
    {
        skypeactivity.shakeBugReportObserver = (ShakeBugReportObserver)provider.get();
    }

    public static void injectTypeFaceTextStyleCallback(SkypeActivity skypeactivity, Provider provider)
    {
        skypeactivity.typeFaceTextStyleCallback = (TypeFaceTextStyleCallback)provider.get();
    }

    public static void injectUpActionObserver(SkypeActivity skypeactivity, Provider provider)
    {
        skypeactivity.upActionObserver = (UpActionObserver)provider.get();
    }

    public final void injectMembers(SkypeActivity skypeactivity)
    {
        if (skypeactivity == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            skypeactivity.upActionObserver = (UpActionObserver)upActionObserverProvider.get();
            skypeactivity.analyticsObserver = (AnalyticsLifecycleObserver)analyticsObserverProvider.get();
            skypeactivity.analyticsInAppObserver = (AnalyticsInAppObserver)analyticsInAppObserverProvider.get();
            skypeactivity.shakeBugReportObserver = (ShakeBugReportObserver)shakeBugReportObserverProvider.get();
            skypeactivity.crashReporter = (CrashReporter)crashReporterProvider.get();
            skypeactivity.typeFaceTextStyleCallback = (TypeFaceTextStyleCallback)typeFaceTextStyleCallbackProvider.get();
            skypeactivity.objectInterfaceFinder = (ObjectInterfaceFinder)objectInterfaceFinderProvider.get();
            skypeactivity.activityAccountStateObserver = (ActivityAccountStateObserver)activityAccountStateObserverProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((SkypeActivity)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/SkypeActivity_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
