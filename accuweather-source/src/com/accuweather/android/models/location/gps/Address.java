// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models.location.gps;

import java.util.HashMap;
import java.util.Map;

public class Address
{

    private Map additionalProperties;
    private String addressLine;
    private String adminDistrict;
    private String adminDistrict2;
    private String countryRegion;
    private String formattedAddress;
    private String locality;
    private String postalCode;

    public Address()
    {
        additionalProperties = new HashMap();
    }

    public Map getAdditionalProperties()
    {
        return additionalProperties;
    }

    public String getAddressLine()
    {
        return addressLine;
    }

    public String getAdminDistrict()
    {
        return adminDistrict;
    }

    public String getAdminDistrict2()
    {
        return adminDistrict2;
    }

    public String getCountryRegion()
    {
        return countryRegion;
    }

    public String getFormattedAddress()
    {
        return formattedAddress;
    }

    public String getLocality()
    {
        return locality;
    }

    public String getPostalCode()
    {
        return postalCode;
    }

    public void setAdditionalProperty(String s, Object obj)
    {
        additionalProperties.put(s, obj);
    }

    public void setAddressLine(String s)
    {
        addressLine = s;
    }

    public void setAdminDistrict(String s)
    {
        adminDistrict = s;
    }

    public void setAdminDistrict2(String s)
    {
        adminDistrict2 = s;
    }

    public void setCountryRegion(String s)
    {
        countryRegion = s;
    }

    public void setFormattedAddress(String s)
    {
        formattedAddress = s;
    }

    public void setLocality(String s)
    {
        locality = s;
    }

    public void setPostalCode(String s)
    {
        postalCode = s;
    }
}
