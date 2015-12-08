// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.ride;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.common.Objects;

// Referenced classes of package me.lyft.android.domain.ride:
//            FareEstimate, FixedFare

public class PreRideInfo
{

    protected String errorMessage;
    FareEstimate fareEstimate;
    List fares;
    protected boolean routeIsValid;

    public PreRideInfo(List list, boolean flag, String s, FareEstimate fareestimate)
    {
        fares = list;
        routeIsValid = flag;
        errorMessage = s;
        fareEstimate = fareestimate;
    }

    public static PreRideInfo empty()
    {
        return new PreRideInfo(Collections.emptyList(), true, "", FareEstimate.empty());
    }

    public FixedFare findCourierByPartySize(int i)
    {
        return FixedFare.findFareByPartySize(fares, i);
    }

    public String getErrorMessage()
    {
        return (String)Objects.firstNonNull(errorMessage, "");
    }

    public FareEstimate getFareEstimate()
    {
        return fareEstimate;
    }

    public List getFares()
    {
        return (List)Objects.firstNonNull(fares, Collections.emptyList());
    }

    public boolean getRouteIsValid()
    {
        return routeIsValid;
    }

    public FixedFare selectedFare()
    {
        for (Iterator iterator = fares.iterator(); iterator.hasNext();)
        {
            FixedFare fixedfare = (FixedFare)iterator.next();
            if (fixedfare.isSelected().booleanValue())
            {
                return fixedfare;
            }
        }

        return FixedFare.empty();
    }
}
