// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.ride;


// Referenced classes of package me.lyft.android.application.ride:
//            RideRequestException

public class NoValidChargeAccountException extends RideRequestException
{

    public NoValidChargeAccountException()
    {
    }

    public String getMessage()
    {
        return "Valid charge account is required to request ride";
    }

    public String getReason()
    {
        return "no_valid_charge_account";
    }
}
