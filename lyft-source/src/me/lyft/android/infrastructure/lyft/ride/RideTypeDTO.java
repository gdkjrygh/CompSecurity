// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.ride;

import java.util.List;

// Referenced classes of package me.lyft.android.infrastructure.lyft.ride:
//            PricingDTO

public class RideTypeDTO
{

    public final Long closestDriverEta;
    public final List drivers;
    public final String id;
    public final Boolean isDefault;
    public final PricingDTO pricingDTO;

    public RideTypeDTO(String s, PricingDTO pricingdto, Boolean boolean1, List list, Long long1)
    {
        id = s;
        pricingDTO = pricingdto;
        isDefault = boolean1;
        drivers = list;
        closestDriverEta = long1;
    }

    public Long getClosestDriverEta()
    {
        return closestDriverEta;
    }

    public List getDrivers()
    {
        return drivers;
    }

    public String getId()
    {
        return id;
    }

    public Boolean getIsDefault()
    {
        return isDefault;
    }

    public PricingDTO getPricingDTO()
    {
        return pricingDTO;
    }
}
