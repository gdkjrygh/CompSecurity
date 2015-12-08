// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.googleplaces;


// Referenced classes of package me.lyft.android.infrastructure.googleplaces:
//            GooglePlaceType

public class GooglePlace
{

    private final String address;
    private final Double lat;
    private final Double lng;
    private final String name;
    private final String phoneNumber;
    private final String placeId;
    private final GooglePlaceType placeType;

    public GooglePlace(String s, String s1, String s2, String s3, GooglePlaceType googleplacetype, double d, 
            double d1)
    {
        placeId = s;
        name = s1;
        phoneNumber = s2;
        address = s3;
        placeType = googleplacetype;
        lat = Double.valueOf(d);
        lng = Double.valueOf(d1);
    }

    public String getAddress()
    {
        return address;
    }

    public Double getLat()
    {
        return lat;
    }

    public Double getLng()
    {
        return lng;
    }

    public String getName()
    {
        return name;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public String getPlaceId()
    {
        return placeId;
    }

    public GooglePlaceType getPlaceType()
    {
        return placeType;
    }
}
