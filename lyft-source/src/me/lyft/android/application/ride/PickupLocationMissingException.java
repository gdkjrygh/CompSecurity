// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.ride;


// Referenced classes of package me.lyft.android.application.ride:
//            RideRequestException

public class PickupLocationMissingException extends RideRequestException
{

    public PickupLocationMissingException()
    {
    }

    public String getMessage()
    {
        return "Pickup location is missing";
    }

    public String getReason()
    {
        return "no_pickup_location";
    }
}
