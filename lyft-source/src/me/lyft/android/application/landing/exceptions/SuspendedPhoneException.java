// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.landing.exceptions;


// Referenced classes of package me.lyft.android.application.landing.exceptions:
//            LandingServiceException

public class SuspendedPhoneException extends LandingServiceException
{

    public SuspendedPhoneException(String s, Throwable throwable)
    {
        super(s, throwable);
    }

    public String getReason()
    {
        return "account_suspended";
    }
}
