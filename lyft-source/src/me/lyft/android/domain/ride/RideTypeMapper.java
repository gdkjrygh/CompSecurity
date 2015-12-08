// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.ride;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.common.Objects;
import me.lyft.android.infrastructure.lyft.location.LocationDTO;
import me.lyft.android.infrastructure.lyft.ride.NearbyDriverDTO;
import me.lyft.android.infrastructure.lyft.ride.PricingDTO;
import me.lyft.android.infrastructure.lyft.ride.RideTypeDTO;
import me.lyft.android.logging.L;

// Referenced classes of package me.lyft.android.domain.ride:
//            Pricing, NearbyDriverMapper, RequestRideType, RideType

public class RideTypeMapper
{

    public RideTypeMapper()
    {
    }

    private static Pricing fromPricingDTO(PricingDTO pricingdto)
    {
        if (pricingdto == null)
        {
            return Pricing.empty();
        } else
        {
            Pricing pricing = new Pricing();
            pricing.setDynamicPricing((Integer)Objects.firstNonNull(pricingdto.getDynamicPricing(), Integer.valueOf(0)));
            pricing.setMinimum(pricingdto.getMinimum());
            pricing.setPickup(pricingdto.getPickup());
            pricing.setPerMile(pricingdto.getPerMile());
            pricing.setPerMinute(pricingdto.getPerMinute());
            return pricing;
        }
    }

    public static RequestRideType fromRideTypeDTO(RideTypeDTO ridetypedto)
    {
        Object obj = (List)Objects.firstNonNull(ridetypedto.getDrivers(), Collections.emptyList());
        ArrayList arraylist = new ArrayList(((List) (obj)).size());
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
        {
            NearbyDriverDTO nearbydriverdto = (NearbyDriverDTO)((Iterator) (obj)).next();
            LocationDTO locationdto = nearbydriverdto.location;
            if (locationdto == null)
            {
                L.e(new Exception("null LocationDTO found"), "%s", new Object[] {
                    nearbydriverdto
                });
            } else
            if (locationdto.isNull())
            {
                L.e(new Exception("nullable LocationDTO found"), "%s", new Object[] {
                    nearbydriverdto
                });
            } else
            if (((Double)Objects.firstNonNull(locationdto.getLat(), Double.valueOf(0.0D))).doubleValue() == 0.0D || ((Double)Objects.firstNonNull(locationdto.getLng(), Double.valueOf(0.0D))).doubleValue() == 0.0D)
            {
                L.e(new Exception("0.0 Lat/Lng found"), "%s", new Object[] {
                    nearbydriverdto
                });
            } else
            {
                arraylist.add(NearbyDriverMapper.fromNearbyDriverDTO(nearbydriverdto));
            }
        }

        return new RequestRideType(RideType.getInstance(ridetypedto.getId()), fromPricingDTO(ridetypedto.getPricingDTO()), (Boolean)Objects.firstNonNull(ridetypedto.getIsDefault(), Boolean.valueOf(false)), arraylist, ridetypedto.getClosestDriverEta());
    }

    public static List fromRideTypeDTOs(List list)
    {
        ArrayList arraylist = new ArrayList(list.size());
        for (list = list.iterator(); list.hasNext(); arraylist.add(fromRideTypeDTO((RideTypeDTO)list.next()))) { }
        return arraylist;
    }
}
