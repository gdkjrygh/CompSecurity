// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding.auth.tasks;


public class SignupResponseBody
{

    public static final int ERROR_CAPTCHA_REQUIRED = 103;
    public static final int ERROR_DOMAIN_BLACKLISTED = 102;
    public static final int ERROR_EMAIL_INVALID = 104;
    public static final int ERROR_EMAIL_TAKEN = 101;
    public static final int ERROR_OTHER = 105;
    private int error;

    public SignupResponseBody()
    {
    }

    public int getError()
    {
        return error;
    }

    public void setError(int i)
    {
        error = i;
    }
}
