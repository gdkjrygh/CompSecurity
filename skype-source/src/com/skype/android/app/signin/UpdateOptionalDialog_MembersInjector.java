// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import com.skype.android.SkypeDialogFragment_MembersInjector;
import com.skype.android.analytics.Analytics;
import com.skype.android.config.ApplicationConfig;
import com.skype.android.res.Urls;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.signin:
//            UpdateOptionalDialog

public final class UpdateOptionalDialog_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider analyticsProvider;
    private final Provider appConfigProvider;
    private final Provider objectInterfaceFinderProvider;
    private final Provider urlsProvider;

    public UpdateOptionalDialog_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3)
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
        urlsProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        appConfigProvider = provider2;
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
        return new UpdateOptionalDialog_MembersInjector(provider, provider1, provider2, provider3);
    }

    public static void injectAnalytics(UpdateOptionalDialog updateoptionaldialog, Provider provider)
    {
        updateoptionaldialog.analytics = (Analytics)provider.get();
    }

    public static void injectAppConfig(UpdateOptionalDialog updateoptionaldialog, Provider provider)
    {
        updateoptionaldialog.appConfig = (ApplicationConfig)provider.get();
    }

    public static void injectUrls(UpdateOptionalDialog updateoptionaldialog, Provider provider)
    {
        updateoptionaldialog.urls = (Urls)provider.get();
    }

    public final void injectMembers(UpdateOptionalDialog updateoptionaldialog)
    {
        if (updateoptionaldialog == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeDialogFragment_MembersInjector.injectObjectInterfaceFinder(updateoptionaldialog, objectInterfaceFinderProvider);
            updateoptionaldialog.urls = (Urls)urlsProvider.get();
            updateoptionaldialog.appConfig = (ApplicationConfig)appConfigProvider.get();
            updateoptionaldialog.analytics = (Analytics)analyticsProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((UpdateOptionalDialog)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/signin/UpdateOptionalDialog_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
