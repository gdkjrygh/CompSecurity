// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.ride;

import me.lyft.android.common.INullable;
import me.lyft.android.common.Strings;

public class RideType
    implements INullable
{

    public static final String CARPOOL = "chauffeur";
    public static final String COURIER = "courier";
    public static final String PLUS = "plus";
    public static final String STANDARD = "standard";
    private final String type;

    private RideType(String s)
    {
        type = s;
    }


    public static RideType empty()
    {
        return NullRideType.getInstance();
    }

    public static RideType getInstance(String s)
    {
        if (Strings.isNullOrEmpty(s))
        {
            return empty();
        } else
        {
            return new RideType(s);
        }
    }

    public String getType()
    {
        return type;
    }

    public boolean isCarpool()
    {
        return Strings.equalsIgnoreCase(type, "chauffeur");
    }

    public boolean isCourier()
    {
        return Strings.equalsIgnoreCase(type, "courier");
    }

    public boolean isNull()
    {
        return false;
    }

    public boolean isPlus()
    {
        return Strings.equalsIgnoreCase(type, "plus");
    }

    public boolean isStandard()
    {
        return Strings.equalsIgnoreCase(type, "standard");
    }

    private class NullRideType extends RideType
    {

        private static final RideType INSTANCE = new NullRideType();

        public static RideType getInstance()
        {
            return INSTANCE;
        }

        public boolean isNull()
        {
            return true;
        }


        private NullRideType()
        {
            super("standard", null);
        }
    }

}
