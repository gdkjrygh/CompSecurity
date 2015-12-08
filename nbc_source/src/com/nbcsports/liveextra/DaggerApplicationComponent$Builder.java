// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra;

import com.nbcsports.liveextra.library.configuration.ConfigurationModule;
import com.nbcsports.liveextra.library.core.DataModule;
import com.nbcsports.liveextra.library.preferences.PreferencesModule;
import com.nbcsports.liveextra.library.tve.AuthModule;

// Referenced classes of package com.nbcsports.liveextra:
//            DaggerApplicationComponent, ApplicationModule, ApplicationComponent

public static final class <init>
{

    private ApplicationModule applicationModule;
    private AuthModule authModule;
    private ConfigurationModule configurationModule;
    private DataModule dataModule;
    private PreferencesModule preferencesModule;

    public <init> applicationModule(ApplicationModule applicationmodule)
    {
        if (applicationmodule == null)
        {
            throw new NullPointerException("applicationModule");
        } else
        {
            applicationModule = applicationmodule;
            return this;
        }
    }

    public applicationModule authModule(AuthModule authmodule)
    {
        if (authmodule == null)
        {
            throw new NullPointerException("authModule");
        } else
        {
            authModule = authmodule;
            return this;
        }
    }

    public ApplicationComponent build()
    {
        if (applicationModule == null)
        {
            throw new IllegalStateException("applicationModule must be set");
        }
        if (configurationModule == null)
        {
            configurationModule = new ConfigurationModule();
        }
        if (preferencesModule == null)
        {
            preferencesModule = new PreferencesModule();
        }
        if (dataModule == null)
        {
            dataModule = new DataModule();
        }
        if (authModule == null)
        {
            authModule = new AuthModule();
        }
        return new DaggerApplicationComponent(this, null);
    }

    public Module configurationModule(ConfigurationModule configurationmodule)
    {
        if (configurationmodule == null)
        {
            throw new NullPointerException("configurationModule");
        } else
        {
            configurationModule = configurationmodule;
            return this;
        }
    }

    public configurationModule dataModule(DataModule datamodule)
    {
        if (datamodule == null)
        {
            throw new NullPointerException("dataModule");
        } else
        {
            dataModule = datamodule;
            return this;
        }
    }

    public le preferencesModule(PreferencesModule preferencesmodule)
    {
        if (preferencesmodule == null)
        {
            throw new NullPointerException("preferencesModule");
        } else
        {
            preferencesModule = preferencesmodule;
            return this;
        }
    }






    private Module()
    {
    }

    Module(Module module)
    {
        this();
    }
}
