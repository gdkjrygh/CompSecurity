// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.geo;

import java.util.List;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.ride.RequestRideType;
import rx.Observable;

public interface IGeoService
{

    public abstract Observable addressLookupFromZip(String s, String s1);

    public abstract Observable directions(String s, List list);

    public transient abstract Observable directions(String s, Location alocation[]);

    public abstract Observable directionsWithDriverLocation(String s, Location location, List list);

    public abstract Observable getClosestDriverEta(Location location, RequestRideType requestridetype);

    public abstract Observable getDriverEta(String s, Location location, List list);

    public transient abstract Observable getDriverEta(String s, Location location, Location alocation[]);

    public abstract Observable getPassengerEtd(String s, Location location, List list);

    public abstract Observable reverseGeocode(Location location);
}
