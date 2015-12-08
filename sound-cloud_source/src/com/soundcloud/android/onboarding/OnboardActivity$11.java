// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding;

import com.soundcloud.android.onboarding.auth.SignupVia;

class oardingState
{

    static final int $SwitchMap$com$soundcloud$android$onboarding$OnboardActivity$OnboardingState[];
    static final int $SwitchMap$com$soundcloud$android$onboarding$auth$SignupVia[];

    static 
    {
        $SwitchMap$com$soundcloud$android$onboarding$auth$SignupVia = new int[SignupVia.values().length];
        try
        {
            $SwitchMap$com$soundcloud$android$onboarding$auth$SignupVia[SignupVia.GOOGLE_PLUS.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            $SwitchMap$com$soundcloud$android$onboarding$auth$SignupVia[SignupVia.FACEBOOK_SSO.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            $SwitchMap$com$soundcloud$android$onboarding$auth$SignupVia[SignupVia.API.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        $SwitchMap$com$soundcloud$android$onboarding$OnboardActivity$OnboardingState = new int[oardingState.values().length];
        try
        {
            $SwitchMap$com$soundcloud$android$onboarding$OnboardActivity$OnboardingState[oardingState.LOGIN.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$soundcloud$android$onboarding$OnboardActivity$OnboardingState[oardingState.SIGN_UP_METHOD.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$soundcloud$android$onboarding$OnboardActivity$OnboardingState[oardingState.ACCEPT_TERMS.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$soundcloud$android$onboarding$OnboardActivity$OnboardingState[oardingState.SIGN_UP_BASICS.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$soundcloud$android$onboarding$OnboardActivity$OnboardingState[oardingState.SIGN_UP_DETAILS.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$soundcloud$android$onboarding$OnboardActivity$OnboardingState[oardingState.PHOTOS.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
