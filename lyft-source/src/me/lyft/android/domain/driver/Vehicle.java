// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.driver;

import me.lyft.android.common.INullable;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Strings;

public class Vehicle
    implements INullable
{

    String color;
    String licensePlate;
    String make;
    String model;
    String photo;
    String state;
    Integer year;

    public Vehicle(String s, String s1, String s2, String s3, Integer integer, String s4, String s5)
    {
        photo = s;
        color = s1;
        make = s2;
        model = s3;
        year = integer;
        state = s4;
        licensePlate = s5;
    }

    public static Vehicle empty()
    {
        return NullVehicle.getInstance();
    }

    public String getColor()
    {
        return (String)Objects.firstNonNull(color, "");
    }

    public String getLicensePlate()
    {
        return (String)Objects.firstNonNull(licensePlate, "");
    }

    public String getMake()
    {
        return (String)Objects.firstNonNull(make, "");
    }

    public String getModel()
    {
        return (String)Objects.firstNonNull(model, "");
    }

    public String getPhoto()
    {
        return photo;
    }

    public String getState()
    {
        return (String)Objects.firstNonNull(state, "");
    }

    public Integer getYear()
    {
        return (Integer)Objects.firstNonNull(year, Integer.valueOf(0));
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

    public boolean hasLicensePlate()
    {
        return !Strings.isNullOrEmpty(licensePlate);
    }

    public boolean isNull()
    {
        return false;
    }

    private class NullVehicle extends Vehicle
    {

        private static Vehicle INSTANCE = new NullVehicle();

        public static Vehicle getInstance()
        {
            return INSTANCE;
        }

        public boolean isNull()
        {
            return true;
        }


        private NullVehicle()
        {
            super("", "", "", "", Integer.valueOf(0), "", "");
        }
    }

}
