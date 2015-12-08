// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.common.AppFlow;
import me.lyft.android.managers.DeepLinkManager;

// Referenced classes of package me.lyft.android.ui.landing:
//            LandingFlow

public final class  extends Binding
    implements Provider
{

    private Binding appFlow;
    private Binding deepLinkManager;
    private Binding userProvider;

    public void attach(Linker linker)
    {
        userProvider = linker.requestBinding("me.lyft.android.application.IUserProvider", me/lyft/android/ui/landing/LandingFlow, getClass().getClassLoader());
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/landing/LandingFlow, getClass().getClassLoader());
        deepLinkManager = linker.requestBinding("me.lyft.android.managers.DeepLinkManager", me/lyft/android/ui/landing/LandingFlow, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public LandingFlow get()
    {
        return new LandingFlow((IUserProvider)userProvider.get(), (AppFlow)appFlow.get(), (DeepLinkManager)deepLinkManager.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(userProvider);
        set.add(appFlow);
        set.add(deepLinkManager);
    }

    public ()
    {
        super("me.lyft.android.ui.landing.LandingFlow", "members/me.lyft.android.ui.landing.LandingFlow", false, me/lyft/android/ui/landing/LandingFlow);
    }
}
