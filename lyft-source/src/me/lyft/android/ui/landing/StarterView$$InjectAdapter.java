// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.application.IAppInfoService;
import me.lyft.android.application.landing.ILandingService;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.infrastructure.assets.IAssetPackagingService;
import me.lyft.android.infrastructure.facebook.IFacebookService;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.ui.IViewErrorHandler;

// Referenced classes of package me.lyft.android.ui.landing:
//            StarterView, LandingFlow

public final class ervice extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding appInfoService;
    private Binding assetPackagingService;
    private Binding bus;
    private Binding dialogFlow;
    private Binding facebookService;
    private Binding landingFlow;
    private Binding landingService;
    private Binding lyftPreferences;
    private Binding viewErrorHandler;

    public void attach(Linker linker)
    {
        lyftPreferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/ui/landing/StarterView, getClass().getClassLoader());
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/landing/StarterView, getClass().getClassLoader());
        landingFlow = linker.requestBinding("me.lyft.android.ui.landing.LandingFlow", me/lyft/android/ui/landing/StarterView, getClass().getClassLoader());
        facebookService = linker.requestBinding("me.lyft.android.infrastructure.facebook.IFacebookService", me/lyft/android/ui/landing/StarterView, getClass().getClassLoader());
        appInfoService = linker.requestBinding("me.lyft.android.application.IAppInfoService", me/lyft/android/ui/landing/StarterView, getClass().getClassLoader());
        landingService = linker.requestBinding("me.lyft.android.application.landing.ILandingService", me/lyft/android/ui/landing/StarterView, getClass().getClassLoader());
        viewErrorHandler = linker.requestBinding("me.lyft.android.ui.IViewErrorHandler", me/lyft/android/ui/landing/StarterView, getClass().getClassLoader());
        bus = linker.requestBinding("me.lyft.android.rx.MessageBus", me/lyft/android/ui/landing/StarterView, getClass().getClassLoader());
        assetPackagingService = linker.requestBinding("me.lyft.android.infrastructure.assets.IAssetPackagingService", me/lyft/android/ui/landing/StarterView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/landing/StarterView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(lyftPreferences);
        set1.add(appFlow);
        set1.add(landingFlow);
        set1.add(facebookService);
        set1.add(appInfoService);
        set1.add(landingService);
        set1.add(viewErrorHandler);
        set1.add(bus);
        set1.add(assetPackagingService);
        set1.add(dialogFlow);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((StarterView)obj);
    }

    public void injectMembers(StarterView starterview)
    {
        starterview.lyftPreferences = (ILyftPreferences)lyftPreferences.get();
        starterview.appFlow = (AppFlow)appFlow.get();
        starterview.landingFlow = (LandingFlow)landingFlow.get();
        starterview.facebookService = (IFacebookService)facebookService.get();
        starterview.appInfoService = (IAppInfoService)appInfoService.get();
        starterview.landingService = (ILandingService)landingService.get();
        starterview.viewErrorHandler = (IViewErrorHandler)viewErrorHandler.get();
        starterview.bus = (MessageBus)bus.get();
        starterview.assetPackagingService = (IAssetPackagingService)assetPackagingService.get();
        starterview.dialogFlow = (DialogFlow)dialogFlow.get();
    }

    public ervice()
    {
        super(null, "members/me.lyft.android.ui.landing.StarterView", false, me/lyft/android/ui/landing/StarterView);
    }
}
