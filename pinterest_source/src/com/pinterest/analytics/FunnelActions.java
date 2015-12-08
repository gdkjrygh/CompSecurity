// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.analytics;


public class FunnelActions
{

    private static String a[] = {
        "token_attempt", "email_signup_attempt", "register_twitter_attempt", "register_facebook_attempt", "register_rakuten_attempt", "register_gplus_attempt", "register_partner_attempt", "register_phone_number_attempt", "register_passwordless_attempt"
    };
    private static String b[] = {
        "register_token", "register_email", "register_twitter", "register_facebook", "register_rakuten", "register_gplus", "register_partner", "register_phone_number", "register_passwordless"
    };

    public static String a(int i)
    {
        return a[i];
    }

    public static String b(int i)
    {
        return b[i];
    }

}
