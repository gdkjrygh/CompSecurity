// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding.auth;

import android.content.Intent;
import android.os.Bundle;

public final class SignupVia extends Enum
{

    private static final SignupVia $VALUES[];
    public static final SignupVia API;
    public static final String EXTRA = "signed_up";
    public static final SignupVia FACEBOOK_SSO;
    public static final SignupVia FACEBOOK_WEBFLOW;
    public static final SignupVia GOOGLE_PLUS;
    public static final SignupVia NONE;
    public final String name;

    private SignupVia(String s, int i, String s1)
    {
        super(s, i);
        name = s1;
    }

    public static SignupVia fromBundle(Bundle bundle)
    {
        return fromString(bundle.getString("signed_up"));
    }

    public static SignupVia fromIntent(Intent intent)
    {
        return fromBundle(intent.getExtras());
    }

    public static SignupVia fromString(String s)
    {
        SignupVia asignupvia[] = values();
        int j = asignupvia.length;
        for (int i = 0; i < j; i++)
        {
            SignupVia signupvia = asignupvia[i];
            if (signupvia.name.equals(s))
            {
                return signupvia;
            }
        }

        return NONE;
    }

    public static SignupVia valueOf(String s)
    {
        return (SignupVia)Enum.valueOf(com/soundcloud/android/onboarding/auth/SignupVia, s);
    }

    public static SignupVia[] values()
    {
        return (SignupVia[])$VALUES.clone();
    }

    public final String getSignupIdentifier()
    {
        return name;
    }

    public final boolean isFacebook()
    {
        return this == FACEBOOK_SSO || this == FACEBOOK_WEBFLOW;
    }

    static 
    {
        API = new SignupVia("API", 0, "api");
        FACEBOOK_SSO = new SignupVia("FACEBOOK_SSO", 1, "facebook:access-token");
        FACEBOOK_WEBFLOW = new SignupVia("FACEBOOK_WEBFLOW", 2, "facebook:web-flow");
        GOOGLE_PLUS = new SignupVia("GOOGLE_PLUS", 3, "google_plus:access-token");
        NONE = new SignupVia("NONE", 4, "none");
        $VALUES = (new SignupVia[] {
            API, FACEBOOK_SSO, FACEBOOK_WEBFLOW, GOOGLE_PLUS, NONE
        });
    }
}
