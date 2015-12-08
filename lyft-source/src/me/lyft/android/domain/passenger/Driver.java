// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.passenger;

import java.util.List;
import me.lyft.android.common.INullable;
import me.lyft.android.domain.driver.Vehicle;
import me.lyft.android.domain.location.Location;

public class Driver
    implements INullable
{

    String icon;
    String id;
    Location location;
    String name;
    String phoneNumber;
    String photo;
    Float rating;
    List recentLocations;
    Vehicle vehicle;

    public Driver(String s, String s1, String s2, String s3, Vehicle vehicle1, Location location1, Double double1, 
            List list, String s4)
    {
        id = s;
        name = s1;
        photo = s2;
        phoneNumber = s3;
        vehicle = vehicle1;
        location = location1;
        if (double1 == null)
        {
            s = null;
        } else
        {
            s = Float.valueOf(double1.floatValue());
        }
        rating = s;
        recentLocations = list;
        icon = s4;
    }

    public static Driver empty()
    {
        return NullDriver.getInstance();
    }

    public String getIcon()
    {
        return icon;
    }

    public String getId()
    {
        return id;
    }

    public Location getLocation()
    {
        return location;
    }

    public String getName()
    {
        return name;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public String getPhoto()
    {
        return photo;
    }

    public Float getRating()
    {
        return rating;
    }

    public List getRecentLocations()
    {
        return recentLocations;
    }

    public Vehicle getVehicle()
    {
        return vehicle;
    }

    public String getVehiclePhoto()
    {
        return vehicle.getPhoto();
    }

    public boolean isNull()
    {
        return false;
    }

    private class NullDriver extends Driver
    {

        private static final Driver INSTANCE = new NullDriver();

        public static Driver getInstance()
        {
            return INSTANCE;
        }

        public boolean isNull()
        {
            return true;
        }


        private NullDriver()
        {
            super("", "", "", "", Vehicle.empty(), NullLocation.getInstance(), Double.valueOf(0.0D), Collections.emptyList(), "");
        }
    }

}
