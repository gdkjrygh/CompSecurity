// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.ILogoutService;
import me.lyft.android.application.landing.ILandingService;
import me.lyft.android.infrastructure.device.IDevice;
import me.lyft.android.persistence.landing.ISignUpUserRepository;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;

// Referenced classes of package me.lyft.android.ui.landing:
//            LoginView, LandingFlow

public final class itory extends Binding
    implements MembersInjector
{

    private Binding device;
    private Binding landingFlow;
    private Binding landingService;
    private Binding logoutService;
    private Binding progressController;
    private Binding signUpUserRepository;
    private Binding viewErrorHandler;

    public void attach(Linker linker)
    {
        device = linker.requestBinding("me.lyft.android.infrastructure.device.IDevice", me/lyft/android/ui/landing/LoginView, getClass().getClassLoader());
        logoutService = linker.requestBinding("me.lyft.android.application.ILogoutService", me/lyft/android/ui/landing/LoginView, getClass().getClassLoader());
        landingService = linker.requestBinding("me.lyft.android.application.landing.ILandingService", me/lyft/android/ui/landing/LoginView, getClass().getClassLoader());
        landingFlow = linker.requestBinding("me.lyft.android.ui.landing.LandingFlow", me/lyft/android/ui/landing/LoginView, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/landing/LoginView, getClass().getClassLoader());
        viewErrorHandler = linker.requestBinding("me.lyft.android.ui.IViewErrorHandler", me/lyft/android/ui/landing/LoginView, getClass().getClassLoader());
        signUpUserRepository = linker.requestBinding("me.lyft.android.persistence.landing.ISignUpUserRepository", me/lyft/android/ui/landing/LoginView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(device);
        set1.add(logoutService);
        set1.add(landingService);
        set1.add(landingFlow);
        set1.add(progressController);
        set1.add(viewErrorHandler);
        set1.add(signUpUserRepository);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((LoginView)obj);
    }

    public void injectMembers(LoginView loginview)
    {
        loginview.device = (IDevice)device.get();
        loginview.logoutService = (ILogoutService)logoutService.get();
        loginview.landingService = (ILandingService)landingService.get();
        loginview.landingFlow = (LandingFlow)landingFlow.get();
        loginview.progressController = (IProgressController)progressController.get();
        loginview.viewErrorHandler = (IViewErrorHandler)viewErrorHandler.get();
        loginview.signUpUserRepository = (ISignUpUserRepository)signUpUserRepository.get();
    }

    public itory()
    {
        super(null, "members/me.lyft.android.ui.landing.LoginView", false, me/lyft/android/ui/landing/LoginView);
    }
}
