// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.profile;


public class VehicleDTO
{

    public final String color;
    public final String currentRideTypeId;
    public final String licensePlate;
    public final String make;
    public final String model;
    public final String photo;
    public final String state;
    public final Integer year;

    public VehicleDTO(Integer integer, String s, String s1, String s2, String s3, String s4, String s5, 
            String s6)
    {
        year = integer;
        make = s;
        model = s1;
        state = s2;
        licensePlate = s3;
        photo = s4;
        color = s5;
        currentRideTypeId = s6;
    }

    public String getColor()
    {
        return color;
    }

    public String getCurrentRideTypeId()
    {
        return currentRideTypeId;
    }

    public String getLicensePlate()
    {
        return licensePlate;
    }

    public String getMake()
    {
        return make;
    }

    public String getModel()
    {
        return model;
    }

    public String getPhoto()
    {
        return photo;
    }

    public String getState()
    {
        return state;
    }

    public Integer getYear()
    {
        return year;
    }

    public String getYearFormatted()
    {
        String s = "";
        if (year != null)
        {
            s = year.toString();
        }
        return s;
    }
}
