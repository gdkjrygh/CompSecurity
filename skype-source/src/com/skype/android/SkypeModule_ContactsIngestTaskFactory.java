// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android;

import android.content.Context;
import com.skype.SkyLib;
import com.skype.android.app.mnv.MnvAnalytics;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.inject.AccountProvider;
import com.skype.android.sync.ContactIngestionTokenRequest;
import com.skype.android.sync.ContactsIngestTask;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.NetworkUtil;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android:
//            SkypeModule

public final class SkypeModule_ContactsIngestTaskFactory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider accountProvider;
    private final Provider contactIngestionTokenRequestProvider;
    private final Provider contactUtilProvider;
    private final Provider contextProvider;
    private final Provider ecsConfigurationProvider;
    private final Provider libProvider;
    private final Provider mnvAnalyticsProvider;
    private final SkypeModule module;
    private final Provider networkUtilProvider;

    public SkypeModule_ContactsIngestTaskFactory(SkypeModule skypemodule, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, 
            Provider provider6, Provider provider7)
    {
        if (!$assertionsDisabled && skypemodule == null)
        {
            throw new AssertionError();
        }
        module = skypemodule;
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        contextProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        libProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        ecsConfigurationProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        accountProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        contactIngestionTokenRequestProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        }
        networkUtilProvider = provider5;
        if (!$assertionsDisabled && provider6 == null)
        {
            throw new AssertionError();
        }
        mnvAnalyticsProvider = provider6;
        if (!$assertionsDisabled && provider7 == null)
        {
            throw new AssertionError();
        } else
        {
            contactUtilProvider = provider7;
            return;
        }
    }

    public static Factory create(SkypeModule skypemodule, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7)
    {
        return new SkypeModule_ContactsIngestTaskFactory(skypemodule, provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public final ContactsIngestTask get()
    {
        return SkypeModule.a((Context)contextProvider.get(), (SkyLib)libProvider.get(), (EcsConfiguration)ecsConfigurationProvider.get(), (AccountProvider)accountProvider.get(), (ContactIngestionTokenRequest)contactIngestionTokenRequestProvider.get(), (NetworkUtil)networkUtilProvider.get(), (MnvAnalytics)mnvAnalyticsProvider.get(), (ContactUtil)contactUtilProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/SkypeModule_ContactsIngestTaskFactory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
