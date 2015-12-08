// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.location;

import com.google.android.gms.maps.model.LatLng;
import me.lyft.android.common.AddressUtils;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.location.NullLocation;
import me.lyft.android.infrastructure.googlegeo.GoogleGeometryDTO;
import me.lyft.android.infrastructure.googlegeo.GoogleLatLngDTO;
import me.lyft.android.infrastructure.googlegeo.GooglePlacesSearchResultDTO;
import me.lyft.android.infrastructure.googleplaces.GooglePlace;

public class GoogleLocationMapper
{

    public GoogleLocationMapper()
    {
    }

    public static Location fromDeepLink(String s, String s1)
    {
        try
        {
            s = new Location(Double.valueOf(s).doubleValue(), Double.valueOf(s1).doubleValue());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return NullLocation.getInstance();
        }
        return s;
    }

    public static Location fromGooglePlace(GooglePlace googleplace)
    {
        Location location = new Location(googleplace.getLat().doubleValue(), googleplace.getLng().doubleValue());
        location.setPlaceName(googleplace.getName());
        location.setAddress(AddressUtils.getStreetAddress(googleplace.getAddress()));
        location.setRoutableAddress(googleplace.getAddress());
        location.setPlaceId(googleplace.getPlaceId());
        return location;
    }

    public static Location fromGooglePlaceSearchDTO(GooglePlacesSearchResultDTO googleplacessearchresultdto)
    {
        Location location = new Location(googleplacessearchresultdto.getGeometry().getLocation().getLat().doubleValue(), googleplacessearchresultdto.getGeometry().getLocation().getLng().doubleValue());
        location.setPlaceName(googleplacessearchresultdto.getName());
        location.setAddress(googleplacessearchresultdto.getShortAddress());
        location.setRoutableAddress(googleplacessearchresultdto.getVicinityOrFormattedAddress());
        location.setPlaceId(googleplacessearchresultdto.getPlaceId());
        return location;
    }

    public static Location fromMapLatLng(LatLng latlng)
    {
        return new Location(latlng.a, latlng.b);
    }

    public static android.location.Location toAndroidLocation(Location location)
    {
        android.location.Location location1 = new android.location.Location("gps");
        location1.setLatitude(location.getLat().doubleValue());
        location1.setLongitude(location.getLng().doubleValue());
        location1.setTime(location.getTime().longValue());
        Double double1 = location.getAccuracy();
        if (double1 != null)
        {
            location1.setAccuracy(double1.floatValue());
        }
        double1 = location.getBearing();
        if (double1 != null)
        {
            location1.setBearing(double1.floatValue());
        }
        double1 = location.getSpeed();
        if (double1 != null)
        {
            location1.setSpeed(double1.floatValue());
        }
        location = location.getAltitude();
        if (location != null)
        {
            location1.setAltitude(location.doubleValue());
        }
        return location1;
    }

    public static Location toDomainLocation(android.location.Location location)
    {
        Location location1 = new Location(location.getLatitude(), location.getLongitude());
        location1.setTime(location.getTime());
        double d;
        if (location.hasAccuracy())
        {
            d = location.getAccuracy();
        } else
        {
            d = 1.7976931348623157E+308D;
        }
        location1.setAccuracy(d);
        if (location.hasBearing())
        {
            d = location.getBearing();
        } else
        {
            d = -1D;
        }
        location1.setBearing(d);
        location1.setSpeed(location.getSpeed());
        location1.setAltitude(Double.valueOf(location.getAltitude()));
        return location1;
    }

    public static LatLng toMapLatLng(Location location)
    {
        return new LatLng(location.getLat().doubleValue(), location.getLng().doubleValue());
    }
}
