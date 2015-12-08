// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.googleplaces;


public final class GooglePlaceType extends Enum
{

    private static final GooglePlaceType $VALUES[];
    public static final GooglePlaceType BAR;
    public static final GooglePlaceType BUSINESS;
    public static final GooglePlaceType CAFE;
    public static final GooglePlaceType GEOCODE;
    public static final GooglePlaceType HOME;
    public static final GooglePlaceType OTHER;
    public static final GooglePlaceType RESTAURANT;
    public static final GooglePlaceType TOP_DESTINATION;
    public static final GooglePlaceType WORK;

    private GooglePlaceType(String s, int i)
    {
        super(s, i);
    }

    public static GooglePlaceType valueOf(String s)
    {
        return (GooglePlaceType)Enum.valueOf(me/lyft/android/infrastructure/googleplaces/GooglePlaceType, s);
    }

    public static GooglePlaceType[] values()
    {
        return (GooglePlaceType[])$VALUES.clone();
    }

    static 
    {
        OTHER = new GooglePlaceType("OTHER", 0);
        BAR = new GooglePlaceType("BAR", 1);
        CAFE = new GooglePlaceType("CAFE", 2);
        BUSINESS = new GooglePlaceType("BUSINESS", 3);
        RESTAURANT = new GooglePlaceType("RESTAURANT", 4);
        TOP_DESTINATION = new GooglePlaceType("TOP_DESTINATION", 5);
        HOME = new GooglePlaceType("HOME", 6);
        WORK = new GooglePlaceType("WORK", 7);
        GEOCODE = new GooglePlaceType("GEOCODE", 8);
        $VALUES = (new GooglePlaceType[] {
            OTHER, BAR, CAFE, BUSINESS, RESTAURANT, TOP_DESTINATION, HOME, WORK, GEOCODE
        });
    }
}
