// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import dagger.internal.ModuleAdapter;

// Referenced classes of package me.lyft.android.ui.landing:
//            LandingModule

public final class INCLUDES extends ModuleAdapter
{

    private static final Class INCLUDES[] = new Class[0];
    private static final String INJECTS[] = {
        "members/me.lyft.android.ui.payment.AddChargeAccountView", "members/me.lyft.android.ui.landing.StarterView", "members/me.lyft.android.ui.landing.IntroductionView", "members/me.lyft.android.ui.landing.SignupView", "members/me.lyft.android.ui.landing.SignupPhoneView", "members/me.lyft.android.ui.landing.SignupVerifyPhoneView", "members/me.lyft.android.ui.landing.VerifyPhoneNumberView", "members/me.lyft.android.ui.landing.LoginView", "members/me.lyft.android.ui.landing.LoginEnterInfoView", "members/me.lyft.android.ui.landing.LoginPhoneView", 
        "members/me.lyft.android.ui.landing.LoginVerifyPhoneView", "members/me.lyft.android.ui.landing.TermsOfServiceView", "members/me.lyft.android.ui.landing.SignupPromoBannerView", "members/me.lyft.android.ui.landing.SignupEnterInfoView", "members/me.lyft.android.ui.landing.EnterPhoneView", "members/me.lyft.android.ui.landing.EnterInfoView", "members/me.lyft.android.controls.PhoneInputView", "members/me.lyft.android.ui.landing.AppLoadingView"
    };
    private static final Class STATIC_INJECTIONS[] = new Class[0];

    public volatile Object newModule()
    {
        return newModule();
    }

    public LandingModule newModule()
    {
        return new LandingModule();
    }


    public ()
    {
        super(me/lyft/android/ui/landing/LandingModule, INJECTS, STATIC_INJECTIONS, false, INCLUDES, false, false);
    }
}
