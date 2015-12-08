// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.ride;


// Referenced classes of package me.lyft.android.application.ride:
//            RideRequestException

public class NoChargeAccountException extends RideRequestException
{

    public NoChargeAccountException()
    {
    }

    public String getMessage()
    {
        return "Charge account is required to request ride";
    }

    public String getReason()
    {
        return "no_charge_account";
    }
}
