// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.ride;


// Referenced classes of package me.lyft.android.application.ride:
//            RideRequestException

public class PickupNotConfirmedException extends RideRequestException
{

    public PickupNotConfirmedException()
    {
    }

    public String getMessage()
    {
        return "Pickup needs to be confirmed to request ride";
    }

    public String getReason()
    {
        return "pickup_not_confirmed";
    }
}
