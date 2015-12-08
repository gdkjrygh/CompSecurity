// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.landing.exceptions;


// Referenced classes of package me.lyft.android.application.landing.exceptions:
//            InvalidVerificationCodeException

public class VerificationCodeTooShortException extends InvalidVerificationCodeException
{

    public VerificationCodeTooShortException()
    {
        super("Verification code is too short", null);
    }

    public String getReason()
    {
        return "verification_code_too_short";
    }
}
