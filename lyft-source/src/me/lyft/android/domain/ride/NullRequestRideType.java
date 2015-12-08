// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.ride;

import java.util.Collections;

// Referenced classes of package me.lyft.android.domain.ride:
//            RequestRideType, RideType, Pricing

public class NullRequestRideType extends RequestRideType
{

    private static final NullRequestRideType INSTANCE = new NullRequestRideType();

    private NullRequestRideType()
    {
        super(RideType.getInstance("standard"), Pricing.empty(), Boolean.valueOf(false), Collections.emptyList(), Long.valueOf(0L));
    }

    public static RequestRideType getInstance()
    {
        return INSTANCE;
    }

    public boolean isNull()
    {
        return true;
    }

}
