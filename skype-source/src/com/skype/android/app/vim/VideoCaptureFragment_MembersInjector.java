// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.vim;

import com.skype.android.SkypeFragment_MembersInjector;
import com.skype.android.analytics.Analytics;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.config.ecs.EcsConfiguration;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.vim:
//            VideoCaptureFragment

public final class VideoCaptureFragment_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider analyticsProvider;
    private final Provider ecsConfigurationProvider;
    private final Provider objectInterfaceFinderProvider;
    private final Provider userPreferencesProvider;

    public VideoCaptureFragment_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3)
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
        ecsConfigurationProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        userPreferencesProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        } else
        {
            analyticsProvider = provider3;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3)
    {
        return new VideoCaptureFragment_MembersInjector(provider, provider1, provider2, provider3);
    }

    public static void injectAnalytics(VideoCaptureFragment videocapturefragment, Provider provider)
    {
        videocapturefragment.analytics = (Analytics)provider.get();
    }

    public static void injectEcsConfiguration(VideoCaptureFragment videocapturefragment, Provider provider)
    {
        videocapturefragment.ecsConfiguration = (EcsConfiguration)provider.get();
    }

    public static void injectUserPreferences(VideoCaptureFragment videocapturefragment, Provider provider)
    {
        videocapturefragment.userPreferences = (UserPreferences)provider.get();
    }

    public final void injectMembers(VideoCaptureFragment videocapturefragment)
    {
        if (videocapturefragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeFragment_MembersInjector.injectObjectInterfaceFinder(videocapturefragment, objectInterfaceFinderProvider);
            videocapturefragment.ecsConfiguration = (EcsConfiguration)ecsConfigurationProvider.get();
            videocapturefragment.userPreferences = (UserPreferences)userPreferencesProvider.get();
            videocapturefragment.analytics = (Analytics)analyticsProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((VideoCaptureFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/vim/VideoCaptureFragment_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
