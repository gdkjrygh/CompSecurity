// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.ILogoutService;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.application.landing.ILandingService;
import me.lyft.android.infrastructure.device.IDevice;
import me.lyft.android.persistence.landing.ISignUpUserRepository;
import me.lyft.android.providers.ProfileProvider;
import me.lyft.android.ui.IProgressController;

// Referenced classes of package me.lyft.android.ui.landing:
//            SignupView, LandingFlow

public final class tory extends Binding
    implements MembersInjector
{

    private Binding device;
    private Binding landingFlow;
    private Binding landingService;
    private Binding logoutService;
    private Binding profileProvider;
    private Binding progressController;
    private Binding signUpUserRepository;
    private Binding userProvider;

    public void attach(Linker linker)
    {
        profileProvider = linker.requestBinding("me.lyft.android.providers.ProfileProvider", me/lyft/android/ui/landing/SignupView, getClass().getClassLoader());
        userProvider = linker.requestBinding("me.lyft.android.application.IUserProvider", me/lyft/android/ui/landing/SignupView, getClass().getClassLoader());
        device = linker.requestBinding("me.lyft.android.infrastructure.device.IDevice", me/lyft/android/ui/landing/SignupView, getClass().getClassLoader());
        landingService = linker.requestBinding("me.lyft.android.application.landing.ILandingService", me/lyft/android/ui/landing/SignupView, getClass().getClassLoader());
        landingFlow = linker.requestBinding("me.lyft.android.ui.landing.LandingFlow", me/lyft/android/ui/landing/SignupView, getClass().getClassLoader());
        logoutService = linker.requestBinding("me.lyft.android.application.ILogoutService", me/lyft/android/ui/landing/SignupView, getClass().getClassLoader());
        signUpUserRepository = linker.requestBinding("me.lyft.android.persistence.landing.ISignUpUserRepository", me/lyft/android/ui/landing/SignupView, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/landing/SignupView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(profileProvider);
        set1.add(userProvider);
        set1.add(device);
        set1.add(landingService);
        set1.add(landingFlow);
        set1.add(logoutService);
        set1.add(signUpUserRepository);
        set1.add(progressController);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((SignupView)obj);
    }

    public void injectMembers(SignupView signupview)
    {
        signupview.profileProvider = (ProfileProvider)profileProvider.get();
        signupview.userProvider = (IUserProvider)userProvider.get();
        signupview.device = (IDevice)device.get();
        signupview.landingService = (ILandingService)landingService.get();
        signupview.landingFlow = (LandingFlow)landingFlow.get();
        signupview.logoutService = (ILogoutService)logoutService.get();
        signupview.signUpUserRepository = (ISignUpUserRepository)signUpUserRepository.get();
        signupview.progressController = (IProgressController)progressController.get();
    }

    public tory()
    {
        super(null, "members/me.lyft.android.ui.landing.SignupView", false, me/lyft/android/ui/landing/SignupView);
    }
}
