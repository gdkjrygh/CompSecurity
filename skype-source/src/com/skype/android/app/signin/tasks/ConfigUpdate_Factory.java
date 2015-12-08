// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin.tasks;

import android.app.Application;
import com.skype.android.config.ApplicationConfig;
import com.skype.android.config.ConfigUpdater;
import com.skype.android.config.web.WebConfigUpdater;
import com.skype.android.res.Urls;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.signin.tasks:
//            a

public final class ConfigUpdate_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider appConfigProvider;
    private final Provider applicationProvider;
    private final Provider configUpdaterProvider;
    private final Provider urlsProvider;
    private final Provider webConfigUpdaterProvider;

    public ConfigUpdate_Factory(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        applicationProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        appConfigProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        configUpdaterProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        webConfigUpdaterProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        } else
        {
            urlsProvider = provider4;
            return;
        }
    }

    public static Factory create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4)
    {
        return new ConfigUpdate_Factory(provider, provider1, provider2, provider3, provider4);
    }

    public final a get()
    {
        return new a((Application)applicationProvider.get(), (ApplicationConfig)appConfigProvider.get(), (ConfigUpdater)configUpdaterProvider.get(), (WebConfigUpdater)webConfigUpdaterProvider.get(), (Urls)urlsProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/signin/tasks/ConfigUpdate_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
