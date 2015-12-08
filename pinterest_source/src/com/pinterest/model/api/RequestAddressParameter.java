// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.model.api;

import com.pinterest.model.commerce.Address;

public class RequestAddressParameter
{

    private final String country;
    private final String extraStreet;
    private final String locality;
    private final String postalCode;
    private final String region;
    private final String street;

    public RequestAddressParameter(Address address)
    {
        locality = address.getLocality();
        country = address.getCountry();
        region = address.getRegion();
        street = address.getStreet();
        postalCode = address.getPostalCode();
        extraStreet = address.getExtraStreet();
    }

    public RequestAddressParameter(String s, String s1, String s2, String s3, String s4)
    {
        this(s, null, s1, s2, s3, s4);
    }

    public RequestAddressParameter(String s, String s1, String s2, String s3, String s4, String s5)
    {
        locality = s;
        country = s1;
        region = s2;
        street = s3;
        postalCode = s4;
        extraStreet = s5;
    }
}
