// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.development;

import dagger.internal.ModuleAdapter;

// Referenced classes of package me.lyft.android.ui.development:
//            DevelopmentModule

public final class INCLUDES extends ModuleAdapter
{

    private static final Class INCLUDES[] = new Class[0];
    private static final String INJECTS[] = {
        "members/me.lyft.android.ui.development.BooleanSwitcherView", "members/me.lyft.android.ui.development.DevelopmentInappNotificationView", "members/me.lyft.android.ui.development.DevelopmentView", "members/me.lyft.android.ui.development.FeaturesView", "members/me.lyft.android.ui.development.ProxySettingsView", "members/me.lyft.android.ui.development.TestScreensView", "members/me.lyft.android.ui.development.DeepLinksView", "members/me.lyft.android.ui.development.EnvironmentSwitcherView"
    };
    private static final Class STATIC_INJECTIONS[] = new Class[0];

    public volatile Object newModule()
    {
        return newModule();
    }

    public DevelopmentModule newModule()
    {
        return new DevelopmentModule();
    }


    public ()
    {
        super(me/lyft/android/ui/development/DevelopmentModule, INJECTS, STATIC_INJECTIONS, false, INCLUDES, false, false);
    }
}
