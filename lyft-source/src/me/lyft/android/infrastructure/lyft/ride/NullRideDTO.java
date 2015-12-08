// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.ride;


// Referenced classes of package me.lyft.android.infrastructure.lyft.ride:
//            RideDTO

public class NullRideDTO extends RideDTO
{

    private static final NullRideDTO instance = new NullRideDTO();

    private NullRideDTO()
    {
        super(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public static NullRideDTO getInstance()
    {
        return instance;
    }

    public static boolean isNull(RideDTO ridedto)
    {
        return instance.equals(ridedto);
    }

}
