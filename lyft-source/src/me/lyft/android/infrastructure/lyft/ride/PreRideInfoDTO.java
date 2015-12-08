// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.ride;

import java.util.List;

// Referenced classes of package me.lyft.android.infrastructure.lyft.ride:
//            FareEstimateDTO

public class PreRideInfoDTO
{

    public final String errorMessage;
    public final FareEstimateDTO fareEstimate;
    public final List fares;
    public final List hotspotLocations;
    public final Boolean routeIsValid;

    private PreRideInfoDTO(List list, Boolean boolean1, String s, List list1, FareEstimateDTO fareestimatedto)
    {
        fares = list;
        routeIsValid = boolean1;
        errorMessage = s;
        hotspotLocations = list1;
        fareEstimate = fareestimatedto;
    }
}
