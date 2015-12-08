// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import com.skype.android.SkypeFragment_MembersInjector;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsPersistentStorage;
import com.skype.android.util.ImageCache;
import com.skype.android.util.SignInDurationReporter;
import com.skype.android.util.accessibility.AccessibilityUtil;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.signin:
//            UnifiedSignInPickAccountFragment

public final class UnifiedSignInPickAccountFragment_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accessibilityUtilProvider;
    private final Provider analyticsPersistentStorageProvider;
    private final Provider analyticsProvider;
    private final Provider imageCacheProvider;
    private final Provider objectInterfaceFinderProvider;
    private final Provider signInDurationReporterProvider;

    public UnifiedSignInPickAccountFragment_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        objectInterfaceFinderProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        imageCacheProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        accessibilityUtilProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        analyticsProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        signInDurationReporterProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        } else
        {
            analyticsPersistentStorageProvider = provider5;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5)
    {
        return new UnifiedSignInPickAccountFragment_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5);
    }

    public static void injectAccessibilityUtil(UnifiedSignInPickAccountFragment unifiedsigninpickaccountfragment, Provider provider)
    {
        unifiedsigninpickaccountfragment.accessibilityUtil = (AccessibilityUtil)provider.get();
    }

    public static void injectAnalytics(UnifiedSignInPickAccountFragment unifiedsigninpickaccountfragment, Provider provider)
    {
        unifiedsigninpickaccountfragment.analytics = (Analytics)provider.get();
    }

    public static void injectAnalyticsPersistentStorage(UnifiedSignInPickAccountFragment unifiedsigninpickaccountfragment, Provider provider)
    {
        unifiedsigninpickaccountfragment.analyticsPersistentStorage = (AnalyticsPersistentStorage)provider.get();
    }

    public static void injectImageCache(UnifiedSignInPickAccountFragment unifiedsigninpickaccountfragment, Provider provider)
    {
        unifiedsigninpickaccountfragment.imageCache = (ImageCache)provider.get();
    }

    public static void injectSignInDurationReporter(UnifiedSignInPickAccountFragment unifiedsigninpickaccountfragment, Provider provider)
    {
        unifiedsigninpickaccountfragment.signInDurationReporter = (SignInDurationReporter)provider.get();
    }

    public final void injectMembers(UnifiedSignInPickAccountFragment unifiedsigninpickaccountfragment)
    {
        if (unifiedsigninpickaccountfragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeFragment_MembersInjector.injectObjectInterfaceFinder(unifiedsigninpickaccountfragment, objectInterfaceFinderProvider);
            unifiedsigninpickaccountfragment.imageCache = (ImageCache)imageCacheProvider.get();
            unifiedsigninpickaccountfragment.accessibilityUtil = (AccessibilityUtil)accessibilityUtilProvider.get();
            unifiedsigninpickaccountfragment.analytics = (Analytics)analyticsProvider.get();
            unifiedsigninpickaccountfragment.signInDurationReporter = (SignInDurationReporter)signInDurationReporterProvider.get();
            unifiedsigninpickaccountfragment.analyticsPersistentStorage = (AnalyticsPersistentStorage)analyticsPersistentStorageProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((UnifiedSignInPickAccountFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/signin/UnifiedSignInPickAccountFragment_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
