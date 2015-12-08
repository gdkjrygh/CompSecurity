// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.ride;

import java.util.List;
import me.lyft.android.common.Iterables;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.location.LocationMapper;
import me.lyft.android.infrastructure.lyft.location.LocationDTO;
import me.lyft.android.infrastructure.lyft.ride.NearbyDriverDTO;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.domain.ride:
//            NearbyDriver

public class NearbyDriverMapper
{

    static final Func1 MAP = new Func1() {

        public volatile Object call(Object obj)
        {
            return call((LocationDTO)obj);
        }

        public Location call(LocationDTO locationdto)
        {
            return LocationMapper.fromLocationDTO(locationdto);
        }

    };

    public NearbyDriverMapper()
    {
    }

    public static NearbyDriver fromNearbyDriverDTO(NearbyDriverDTO nearbydriverdto)
    {
        NearbyDriver nearbydriver = new NearbyDriver();
        nearbydriver.setId(nearbydriverdto.id);
        Location location = LocationMapper.fromLocationDTO(nearbydriverdto.location);
        nearbydriverdto = Iterables.select(nearbydriverdto.recentLocations, MAP);
        nearbydriver.setRecentLocations(nearbydriverdto);
        if (nearbydriverdto.isEmpty())
        {
            nearbydriverdto = location;
        } else
        {
            nearbydriverdto = (Location)Iterables.last(nearbydriverdto);
        }
        nearbydriver.setLocation(nearbydriverdto);
        return nearbydriver;
    }

}
