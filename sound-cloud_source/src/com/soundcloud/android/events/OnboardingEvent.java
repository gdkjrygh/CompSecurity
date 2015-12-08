// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.events;

import com.soundcloud.java.strings.Strings;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public final class OnboardingEvent
{

    private static final String ACCEPT = "accept";
    private static final String ACTION = "action";
    public static final int AUTH_COMPLETE = 3;
    public static final int AUTH_CREDENTIALS = 1;
    public static final int AUTH_PROMPT = 0;
    private static final String CANCEL = "cancel";
    public static final int CONFIRM_TERMS = 2;
    private static final String DENIED_SIGNUP = "denied_signup";
    public static final int DEVICE_CONFLICT = 8;
    private static final String DEVICE_LIMIT = "device_limit";
    private static final String DISMISS = "dismiss";
    public static final int EMAIL_MARKETING = 6;
    private static final String ERROR_TYPE = "error_type";
    private static final String EXISTING_EMAIL = "existing_email";
    private static final String FACEBOOK = "facebook";
    private static final String FACEBOOK_EMAIL_DENIED = "facebook_email_denied";
    private static final String GENERAL_ERROR = "general_error";
    private static final String GOOGLE_PLUS = "google_plus";
    private static final String INVALID_EMAIL = "invalid_email";
    private static final String LOGGED_OUT = "logged_out";
    private static final String LOG_IN = "sign in";
    private static final String NATIVE = "native";
    private static final String NO = "no";
    public static final int ONBOARDING_COMPLETE = 5;
    private static final String OPT_IN = "opt_in";
    private static final String SERVE_CAPTCHA = "serve_captcha";
    public static final int SIGNUP_ERROR = 7;
    private static final String SIGN_UP = "sign up";
    private static final String TYPE = "type";
    public static final int USER_INFO = 4;
    private static final String USER_INFO_ADDED_PICTURE = "added_picture";
    private static final String USER_INFO_ADDED_USERNAME = "added_username";
    private static final String YES = "yes";
    private final Map attributes = new HashMap();
    private final int kind;

    private OnboardingEvent(int i)
    {
        kind = i;
    }

    public static OnboardingEvent acceptEmailOptIn()
    {
        return (new OnboardingEvent(6)).put("opt_in", "yes");
    }

    public static OnboardingEvent authComplete()
    {
        return new OnboardingEvent(3);
    }

    public static OnboardingEvent deviceConflictLoggedOut()
    {
        return (new OnboardingEvent(8)).put("error_type", "logged_out");
    }

    public static OnboardingEvent deviceConflictOnLogin()
    {
        return (new OnboardingEvent(8)).put("error_type", "device_limit");
    }

    public static OnboardingEvent dismissEmailOptIn()
    {
        return (new OnboardingEvent(6)).put("opt_in", "dismiss");
    }

    public static OnboardingEvent facebookAuthEvent()
    {
        return (new OnboardingEvent(1)).put("type", "facebook");
    }

    public static OnboardingEvent googleAuthEvent()
    {
        return (new OnboardingEvent(1)).put("type", "google_plus");
    }

    private static String kindToString(int i)
    {
        switch (i)
        {
        default:
            return (new StringBuilder("unknown ")).append(i).toString();

        case 0: // '\0'
            return "auth prompt";

        case 1: // '\001'
            return "auth credentials";

        case 2: // '\002'
            return "confirm terms";

        case 3: // '\003'
            return "auth complete";

        case 4: // '\004'
            return "user info";

        case 5: // '\005'
            return "onboarding complete";

        case 6: // '\006'
            return "email marketing";

        case 7: // '\007'
            return "signup error";

        case 8: // '\b'
            return "device conflict";
        }
    }

    public static OnboardingEvent logInPrompt()
    {
        return (new OnboardingEvent(0)).put("type", "sign in");
    }

    public static OnboardingEvent nativeAuthEvent()
    {
        return (new OnboardingEvent(1)).put("type", "native");
    }

    public static OnboardingEvent onboardingComplete()
    {
        return new OnboardingEvent(5);
    }

    private OnboardingEvent put(String s, String s1)
    {
        attributes.put(s, s1);
        return this;
    }

    public static OnboardingEvent rejectEmailOptIn()
    {
        return (new OnboardingEvent(6)).put("opt_in", "no");
    }

    public static OnboardingEvent savedUserInfo(String s, File file)
    {
        OnboardingEvent onboardingevent = new OnboardingEvent(4);
        if (Strings.isNotBlank(s))
        {
            s = "yes";
        } else
        {
            s = "no";
        }
        onboardingevent = onboardingevent.put("added_username", s);
        if (file != null)
        {
            s = "yes";
        } else
        {
            s = "no";
        }
        return onboardingevent.put("added_picture", s);
    }

    public static OnboardingEvent signUpPrompt()
    {
        return (new OnboardingEvent(0)).put("type", "sign up");
    }

    public static OnboardingEvent signupDenied()
    {
        return (new OnboardingEvent(7)).put("error_type", "denied_signup");
    }

    public static OnboardingEvent signupExistingEmail()
    {
        return (new OnboardingEvent(7)).put("error_type", "existing_email");
    }

    public static OnboardingEvent signupFacebookEmailDenied()
    {
        return (new OnboardingEvent(7)).put("error_type", "facebook_email_denied");
    }

    public static OnboardingEvent signupGeneralError()
    {
        return (new OnboardingEvent(7)).put("error_type", "general_error");
    }

    public static OnboardingEvent signupInvalidEmail()
    {
        return (new OnboardingEvent(7)).put("error_type", "invalid_email");
    }

    public static OnboardingEvent signupServeCaptcha()
    {
        return (new OnboardingEvent(7)).put("error_type", "serve_captcha");
    }

    public static OnboardingEvent skippedUserInfo()
    {
        return (new OnboardingEvent(4)).put("added_username", "no").put("added_picture", "no");
    }

    public static OnboardingEvent termsAccepted()
    {
        return (new OnboardingEvent(2)).put("action", "accept");
    }

    public static OnboardingEvent termsRejected()
    {
        return (new OnboardingEvent(2)).put("action", "cancel");
    }

    public final Map getAttributes()
    {
        return attributes;
    }

    public final int getKind()
    {
        return kind;
    }

    public final String toString()
    {
        return String.format("Onboarding Event with type '%s' and %s", new Object[] {
            kindToString(kind), attributes.toString()
        });
    }
}
