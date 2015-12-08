// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;

import com.nbcsports.liveextra.ApplicationComponent;
import com.nbcsports.liveextra.analytics.PlayerAnalyticsModule;
import com.nbcsports.liveextra.player.PlayerConfigurationModule;
import com.nbcsports.liveextra.ui.player.dataviews.DataViewModule;

// Referenced classes of package com.nbcsports.liveextra.ui.player:
//            DaggerPlayerActivity_Component

public static final class <init>
{

    private ApplicationComponent applicationComponent;
    private DataViewModule dataViewModule;
    private playerConfigurationModule module;
    private PlayerAnalyticsModule playerAnalyticsModule;
    private PlayerConfigurationModule playerConfigurationModule;

    public <init> applicationComponent(ApplicationComponent applicationcomponent)
    {
        if (applicationcomponent == null)
        {
            throw new NullPointerException("applicationComponent");
        } else
        {
            applicationComponent = applicationcomponent;
            return this;
        }
    }

    public applicationComponent build()
    {
        if (module == null)
        {
            throw new IllegalStateException("module must be set");
        }
        if (dataViewModule == null)
        {
            dataViewModule = new DataViewModule();
        }
        if (playerConfigurationModule == null)
        {
            playerConfigurationModule = new PlayerConfigurationModule();
        }
        if (playerAnalyticsModule == null)
        {
            playerAnalyticsModule = new PlayerAnalyticsModule();
        }
        if (applicationComponent == null)
        {
            throw new IllegalStateException("applicationComponent must be set");
        } else
        {
            return new DaggerPlayerActivity_Component(this, null);
        }
    }

    public applicationComponent dataViewModule(DataViewModule dataviewmodule)
    {
        if (dataviewmodule == null)
        {
            throw new NullPointerException("dataViewModule");
        } else
        {
            dataViewModule = dataviewmodule;
            return this;
        }
    }

    public dataViewModule module(dataViewModule dataviewmodule)
    {
        if (dataviewmodule == null)
        {
            throw new NullPointerException("module");
        } else
        {
            module = dataviewmodule;
            return this;
        }
    }

    public module playerAnalyticsModule(PlayerAnalyticsModule playeranalyticsmodule)
    {
        if (playeranalyticsmodule == null)
        {
            throw new NullPointerException("playerAnalyticsModule");
        } else
        {
            playerAnalyticsModule = playeranalyticsmodule;
            return this;
        }
    }

    public playerAnalyticsModule playerConfigurationModule(PlayerConfigurationModule playerconfigurationmodule)
    {
        if (playerconfigurationmodule == null)
        {
            throw new NullPointerException("playerConfigurationModule");
        } else
        {
            playerConfigurationModule = playerconfigurationmodule;
            return this;
        }
    }






    private ()
    {
    }

    ( )
    {
        this();
    }
}
