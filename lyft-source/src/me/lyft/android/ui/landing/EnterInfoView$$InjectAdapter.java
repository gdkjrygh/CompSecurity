// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.application.landing.LandingService;
import me.lyft.android.infrastructure.device.IDevice;
import me.lyft.android.providers.ProfileProvider;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;

// Referenced classes of package me.lyft.android.ui.landing:
//            EnterInfoView, LandingFlow

public final class  extends Binding
    implements MembersInjector
{

    private Binding device;
    private Binding landingFlow;
    private Binding landingService;
    private Binding profileProvider;
    private Binding progressController;
    private Binding userProvider;
    private Binding viewErrorHandler;

    public void attach(Linker linker)
    {
        profileProvider = linker.requestBinding("me.lyft.android.providers.ProfileProvider", me/lyft/android/ui/landing/EnterInfoView, getClass().getClassLoader());
        userProvider = linker.requestBinding("me.lyft.android.application.IUserProvider", me/lyft/android/ui/landing/EnterInfoView, getClass().getClassLoader());
        device = linker.requestBinding("me.lyft.android.infrastructure.device.IDevice", me/lyft/android/ui/landing/EnterInfoView, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/landing/EnterInfoView, getClass().getClassLoader());
        landingFlow = linker.requestBinding("me.lyft.android.ui.landing.LandingFlow", me/lyft/android/ui/landing/EnterInfoView, getClass().getClassLoader());
        landingService = linker.requestBinding("me.lyft.android.application.landing.LandingService", me/lyft/android/ui/landing/EnterInfoView, getClass().getClassLoader());
        viewErrorHandler = linker.requestBinding("me.lyft.android.ui.IViewErrorHandler", me/lyft/android/ui/landing/EnterInfoView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(profileProvider);
        set1.add(userProvider);
        set1.add(device);
        set1.add(progressController);
        set1.add(landingFlow);
        set1.add(landingService);
        set1.add(viewErrorHandler);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((EnterInfoView)obj);
    }

    public void injectMembers(EnterInfoView enterinfoview)
    {
        enterinfoview.profileProvider = (ProfileProvider)profileProvider.get();
        enterinfoview.userProvider = (IUserProvider)userProvider.get();
        enterinfoview.device = (IDevice)device.get();
        enterinfoview.progressController = (IProgressController)progressController.get();
        enterinfoview.landingFlow = (LandingFlow)landingFlow.get();
        enterinfoview.landingService = (LandingService)landingService.get();
        enterinfoview.viewErrorHandler = (IViewErrorHandler)viewErrorHandler.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.landing.EnterInfoView", false, me/lyft/android/ui/landing/EnterInfoView);
    }
}
