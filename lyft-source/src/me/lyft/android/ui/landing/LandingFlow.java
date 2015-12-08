// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import me.lyft.android.analytics.studies.OnBoardingAnalytics;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.common.AppFlow;
import me.lyft.android.domain.User;
import me.lyft.android.managers.DeepLinkManager;

public class LandingFlow
{

    private final AppFlow appFlow;
    private final DeepLinkManager deepLinkManager;
    private IUserProvider userProvider;

    public LandingFlow(IUserProvider iuserprovider, AppFlow appflow, DeepLinkManager deeplinkmanager)
    {
        userProvider = iuserprovider;
        appFlow = appflow;
        deepLinkManager = deeplinkmanager;
    }

    public void goToNextScreenInLoginFlow()
    {
        User user = userProvider.getUser();
        if (!user.hasValidPhoneNumber())
        {
            appFlow.goTo(new LandingScreens.LoginPhoneScreen());
            return;
        }
        if (!user.hasValidNameAndEmail())
        {
            appFlow.goTo(new LandingScreens.LoginEnterInfoScreen());
            return;
        }
        if (user.shouldRedirectToDriverOnboarding())
        {
            OnBoardingAnalytics.trackCompleteOnboarding();
            appFlow.resetToParent(new me.lyft.android.ui.onboarding.OnboardingScreens.WebApplicationStatusScreen());
            return;
        } else
        {
            OnBoardingAnalytics.trackCompleteOnboarding();
            showRideScreen();
            return;
        }
    }

    public void goToNextScreenInSignupFlow()
    {
        User user = userProvider.getUser();
        if (!user.hasValidPhoneNumber())
        {
            appFlow.goTo(new LandingScreens.SignupPhoneScreen());
            return;
        }
        if (!user.hasValidNameAndEmail())
        {
            appFlow.goTo(new LandingScreens.SignupEnterInfoScreen());
            return;
        } else
        {
            OnBoardingAnalytics.trackCompleteOnboarding();
            showRideScreen();
            return;
        }
    }

    public void launchFirstScreen()
    {
        Object obj;
        if (userProvider.getUser().profileIsComplete())
        {
            if (deepLinkManager.tryHandleDeepAfterAuthorized())
            {
                return;
            }
            obj = new me.lyft.android.ui.MainScreens.RideScreen();
        } else
        {
            obj = new LandingScreens.IntroductionScreen("incomplete_profile");
        }
        appFlow.resetTo(((com.lyft.scoop.Screen) (obj)));
    }

    public void openLoginScreen()
    {
        appFlow.resetToParent(new LandingScreens.LoginScreen());
    }

    public void openLoginVerifyPhoneScreen(String s)
    {
        appFlow.goTo(new LandingScreens.LoginVerifyPhoneScreen(s));
    }

    public void openSignupScreen()
    {
        appFlow.resetToParent(new LandingScreens.SignupScreen());
    }

    public void openSingupVerifyPhoneScreen(String s)
    {
        appFlow.goTo(new LandingScreens.SignupVerifyPhoneScreen(s));
    }

    public void openTermsOfServiceScreen()
    {
        appFlow.goTo(new me.lyft.android.ui.help.HelpScreens.HelpTermsScreen(false));
    }

    void showRideScreen()
    {
        if (!deepLinkManager.tryHandleDeepAfterAuthorized())
        {
            appFlow.resetTo(new me.lyft.android.ui.MainScreens.RideScreen());
        }
    }
}
