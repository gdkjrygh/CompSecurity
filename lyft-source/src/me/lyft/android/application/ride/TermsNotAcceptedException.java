// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.ride;


// Referenced classes of package me.lyft.android.application.ride:
//            RideRequestException

public class TermsNotAcceptedException extends RideRequestException
{

    public TermsNotAcceptedException()
    {
    }

    public String getMessage()
    {
        return "Terms of service should be accepted to request ride";
    }

    public String getReason()
    {
        return "terms_not_accepted";
    }
}
