// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.vo;

import java.io.Serializable;

// Referenced classes of package com.kohls.mcommerce.opal.framework.vo:
//            ProfileInfo

public static class Location
    implements Serializable
{

    private static final long serialVersionUID = 0xed5eb3139dbe03bfL;
    private String ID;
    private String addr1;
    private String addr2;
    private String city;
    private String countryCode;
    private String county;
    private String firstName;
    private String lastName;
    private Location location;
    private String phoneNumber;
    private String postalCode;
    private boolean preferredAddr;
    private String state;

    public String getAddr1()
    {
        return addr1;
    }

    public String getAddr2()
    {
        return addr2;
    }

    public String getCity()
    {
        return city;
    }

    public String getCountryCode()
    {
        return countryCode;
    }

    public String getCounty()
    {
        return county;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getID()
    {
        return ID;
    }

    public String getLastName()
    {
        return lastName;
    }

    public Location getLocation()
    {
        return location;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public String getPostalCode()
    {
        return postalCode;
    }

    public boolean getPreferredAddr()
    {
        return preferredAddr;
    }

    public String getState()
    {
        return state;
    }

    public void setAddr1(String s)
    {
        addr1 = s;
    }

    public void setAddr2(String s)
    {
        addr2 = s;
    }

    public void setCity(String s)
    {
        city = s;
    }

    public void setCountryCode(String s)
    {
        countryCode = s;
    }

    public void setCounty(String s)
    {
        county = s;
    }

    public void setFirstName(String s)
    {
        firstName = s;
    }

    public void setID(String s)
    {
        ID = s;
    }

    public void setLastName(String s)
    {
        lastName = s;
    }

    public void setLocation(Location location1)
    {
        location = location1;
    }

    public void setPhoneNumber(String s)
    {
        phoneNumber = s;
    }

    public void setPostalCode(String s)
    {
        postalCode = s;
    }

    public void setPreferredAddr(boolean flag)
    {
        preferredAddr = flag;
    }

    public void setState(String s)
    {
        state = s;
    }

    public Location()
    {
    }

    // Unreferenced inner class com/kohls/mcommerce/opal/framework/vo/ProfileInfo$Address$Location
    /* block-local class not found */
    class Location {}

}
