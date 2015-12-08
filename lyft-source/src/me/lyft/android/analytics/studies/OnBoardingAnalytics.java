// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.studies;

import me.lyft.android.analytics.ActionAnalytics;
import me.lyft.android.analytics.IntentAnalytics;
import me.lyft.android.analytics.SpanningAnalytics;
import me.lyft.android.common.Strings;

public class OnBoardingAnalytics
{

    private static final IntentAnalytics ONBOARDING_INTENT;
    public static final String SOURCE_BACK_FROM_UPSTREAM = "back_from_upstream";
    public static final String SOURCE_ENVIRONMENT_SWITCH = "environment_switch";
    public static final String SOURCE_INCOMPLETE_PROFILE = "incomplete_profile";
    public static final String SOURCE_NEW_USER = "new_user";
    public static final String SOURCE_SERVER_LOGOUT = "server_logout";
    public static final String SOURCE_USER_LOGOUT = "user_logout";
    private static final String TAG = "onboarding";

    public OnBoardingAnalytics()
    {
    }

    public static ActionAnalytics trackAddFacebook()
    {
        return (ActionAnalytics)(new ActionAnalytics(me.lyft.android.analytics.definitions.ActionEvent.Action.ADD_FACEBOOK)).setIntentId(ONBOARDING_INTENT.getId()).setTag("onboarding").trackInitiation();
    }

    public static ActionAnalytics trackAddPhone()
    {
        return (ActionAnalytics)(new ActionAnalytics(me.lyft.android.analytics.definitions.ActionEvent.Action.ADD_PHONE)).setIntentId(ONBOARDING_INTENT.getId()).setTag("onboarding").trackInitiation();
    }

    public static ActionAnalytics trackAddProfileInfo()
    {
        return (ActionAnalytics)(new ActionAnalytics(me.lyft.android.analytics.definitions.ActionEvent.Action.ADD_PROFILE_INFO)).setIntentId(ONBOARDING_INTENT.getId()).setTag("onboarding").trackInitiation();
    }

    public static void trackCompleteOnboarding()
    {
        ONBOARDING_INTENT.trackSuccess();
    }

    public static void trackInitiateLogin()
    {
        (new ActionAnalytics(me.lyft.android.analytics.definitions.ActionEvent.Action.INITIATE_LOGIN)).setIntentId(ONBOARDING_INTENT.getId()).setTag("onboarding").trackInitiation().trackSuccess();
    }

    public static void trackInitiateOnboarding(String s)
    {
        String s1 = ONBOARDING_INTENT.getParameter();
        boolean flag;
        boolean flag1;
        if (Strings.isNullOrEmpty(s1) || !s1.equals(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = "back_from_upstream".equals(s);
        if (flag && !flag1)
        {
            ONBOARDING_INTENT.setTag("onboarding").setParameter(s).trackInitiation();
        }
    }

    public static void trackInitiateSignup()
    {
        (new ActionAnalytics(me.lyft.android.analytics.definitions.ActionEvent.Action.INITIATE_SIGNUP)).setIntentId(ONBOARDING_INTENT.getId()).setTag("onboarding").trackInitiation().trackSuccess();
    }

    public static ActionAnalytics trackLogoutUser(String s)
    {
        return (ActionAnalytics)(new ActionAnalytics(me.lyft.android.analytics.definitions.ActionEvent.Action.LOGOUT_USER)).setIntentId(ONBOARDING_INTENT.getId()).setTag("onboarding").setParameter(s).trackInitiation();
    }

    public static ActionAnalytics trackResendPhoneCode()
    {
        return (ActionAnalytics)(new ActionAnalytics(me.lyft.android.analytics.definitions.ActionEvent.Action.RESEND_PHONE_CODE)).setIntentId(ONBOARDING_INTENT.getId()).setTag("onboarding").trackInitiation();
    }

    public static ActionAnalytics trackVerifyPhone()
    {
        return (ActionAnalytics)(new ActionAnalytics(me.lyft.android.analytics.definitions.ActionEvent.Action.VERIFY_PHONE)).setIntentId(ONBOARDING_INTENT.getId()).setTag("onboarding").trackInitiation();
    }

    static 
    {
        ONBOARDING_INTENT = new IntentAnalytics(me.lyft.android.analytics.definitions.IntentEvent.Intent.ONBOARD);
    }
}
