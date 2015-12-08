// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.googleplaces;

import com.google.android.gms.location.places.AutocompletePrediction;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.location.SphericalUtils;

// Referenced classes of package me.lyft.android.infrastructure.googleplaces:
//            GooglePlaceType, GooglePlacePrediction, GooglePlace

class GooglePlaceMapper
{

    private static final List CATEGORIES_BAR;
    private static final List CATEGORIES_BUSINESS;
    private static final List CATEGORIES_CAFE;
    private static final List CATEGORIES_GEOCODE;
    private static final List CATEGORIES_RESTAURANT;
    private static final Map CATEGORY_MAP;
    private static final int DIAMETER_IN_METERS = 20000;
    private static final double HYPOTENUSE_IN_KM = Math.sqrt(800000000D);

    private GooglePlaceMapper()
    {
    }

    static LatLngBounds calculateBounds(Location location)
    {
        Location location1 = SphericalUtils.computeOffset(location, HYPOTENUSE_IN_KM, 225D);
        location = SphericalUtils.computeOffset(location, HYPOTENUSE_IN_KM, 45D);
        return new LatLngBounds(new LatLng(location1.getLat().doubleValue(), location1.getLng().doubleValue()), new LatLng(location.getLat().doubleValue(), location.getLng().doubleValue()));
    }

    static GooglePlaceType convertGooglePlayPlaceType(List list)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            Integer integer = (Integer)list.next();
            if (CATEGORY_MAP.containsKey(integer))
            {
                return (GooglePlaceType)CATEGORY_MAP.get(integer);
            }
        }

        return GooglePlaceType.OTHER;
    }

    static GooglePlacePrediction fromGooglePlayAutomcomplete(AutocompletePrediction autocompleteprediction)
    {
        return new GooglePlacePrediction(autocompleteprediction.c(), autocompleteprediction.b(), convertGooglePlayPlaceType(autocompleteprediction.d()));
    }

    static GooglePlace fromGooglePlayPlace(Place place)
    {
        return new GooglePlace(place.b(), place.e().toString(), place.g().toString(), place.d().toString(), convertGooglePlayPlaceType(place.c()), place.f().a, place.f().b);
    }

    private static void insertToMap(Map map, List list, GooglePlaceType googleplacetype)
    {
        for (list = list.iterator(); list.hasNext(); map.put((Integer)list.next(), googleplacetype)) { }
    }

    static 
    {
        CATEGORIES_GEOCODE = Arrays.asList(new Integer[] {
            Integer.valueOf(1012), Integer.valueOf(1015)
        });
        CATEGORIES_BAR = Arrays.asList(new Integer[] {
            Integer.valueOf(9), Integer.valueOf(67)
        });
        CATEGORIES_CAFE = Arrays.asList(new Integer[] {
            Integer.valueOf(15)
        });
        CATEGORIES_RESTAURANT = Arrays.asList(new Integer[] {
            Integer.valueOf(79), Integer.valueOf(38), Integer.valueOf(60), Integer.valueOf(61)
        });
        CATEGORIES_BUSINESS = Arrays.asList(new Integer[] {
            Integer.valueOf(1), Integer.valueOf(5), Integer.valueOf(6), Integer.valueOf(7), Integer.valueOf(8), Integer.valueOf(10), Integer.valueOf(11), Integer.valueOf(12), Integer.valueOf(17), Integer.valueOf(18), 
            Integer.valueOf(19), Integer.valueOf(20), Integer.valueOf(21), Integer.valueOf(24), Integer.valueOf(25), Integer.valueOf(26), Integer.valueOf(27), Integer.valueOf(28), Integer.valueOf(29), Integer.valueOf(30), 
            Integer.valueOf(31), Integer.valueOf(32), Integer.valueOf(33), Integer.valueOf(34), Integer.valueOf(35), Integer.valueOf(36), Integer.valueOf(37), Integer.valueOf(39), Integer.valueOf(40), Integer.valueOf(42), 
            Integer.valueOf(43), Integer.valueOf(44), Integer.valueOf(45), Integer.valueOf(46), Integer.valueOf(47), Integer.valueOf(49), Integer.valueOf(50), Integer.valueOf(51), Integer.valueOf(52), Integer.valueOf(53), 
            Integer.valueOf(54), Integer.valueOf(55), Integer.valueOf(56), Integer.valueOf(57), Integer.valueOf(58), Integer.valueOf(59), Integer.valueOf(63), Integer.valueOf(64), Integer.valueOf(65), Integer.valueOf(66), 
            Integer.valueOf(68), Integer.valueOf(71), Integer.valueOf(72), Integer.valueOf(73), Integer.valueOf(75), Integer.valueOf(76), Integer.valueOf(77), Integer.valueOf(78), Integer.valueOf(80), Integer.valueOf(82), 
            Integer.valueOf(83), Integer.valueOf(84), Integer.valueOf(87), Integer.valueOf(88), Integer.valueOf(93), Integer.valueOf(94), Integer.valueOf(95)
        });
        HashMap hashmap = new HashMap();
        insertToMap(hashmap, CATEGORIES_BAR, GooglePlaceType.BAR);
        insertToMap(hashmap, CATEGORIES_CAFE, GooglePlaceType.CAFE);
        insertToMap(hashmap, CATEGORIES_RESTAURANT, GooglePlaceType.RESTAURANT);
        insertToMap(hashmap, CATEGORIES_BUSINESS, GooglePlaceType.BUSINESS);
        insertToMap(hashmap, CATEGORIES_GEOCODE, GooglePlaceType.GEOCODE);
        CATEGORY_MAP = Collections.unmodifiableMap(hashmap);
    }
}
