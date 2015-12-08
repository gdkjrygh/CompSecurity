// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.ride;


// Referenced classes of package me.lyft.android.application.ride:
//            RideRequestException

public class DynamicPricingNotConfirmedException extends RideRequestException
{

    public DynamicPricingNotConfirmedException()
    {
    }

    public String getMessage()
    {
        return "Prime time confirmation is required to request ride";
    }

    public String getReason()
    {
        return "dynamic_pricing_not_confirmed";
    }
}
