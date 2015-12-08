// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.viewmodel;

import com.pinterest.model.commerce.Address;
import com.pinterest.model.commerce.DetailedShipping;

public class AddressFormViewModel
{

    private static final String SPACE = " ";
    private String city;
    private String email;
    private String firstName;
    private String lastName;
    private String merchantName;
    private String phoneNumber;
    private boolean showDisclaimer;
    private String state;
    private String streetLine1;
    private String streetLine2;
    private String zip;

    public AddressFormViewModel()
    {
    }

    public AddressFormViewModel(DetailedShipping detailedshipping)
    {
        firstName = detailedshipping.getFirstName();
        lastName = detailedshipping.getLastName();
        Address address = detailedshipping.getAddress();
        if (address != null)
        {
            streetLine1 = address.getStreet();
            streetLine2 = address.getExtraStreet();
            zip = address.getPostalCode();
            city = address.getLocality();
            state = address.getRegion();
        }
        email = detailedshipping.getEmail();
        phoneNumber = detailedshipping.getPhone();
    }

    public AddressFormViewModel(String s, String s1, String s2, String s3, String s4, String s5, String s6, 
            String s7, String s8)
    {
        firstName = s;
        lastName = s1;
        streetLine1 = s2;
        streetLine2 = s3;
        zip = s4;
        city = s5;
        state = s6;
        email = s7;
        phoneNumber = s8;
    }

    public String getCity()
    {
        return city;
    }

    public String getEmail()
    {
        return email;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getFullName()
    {
        return (new StringBuilder(firstName.length() + lastName.length() + 1)).append(firstName).append(" ").append(lastName).toString();
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getMerchantName()
    {
        return merchantName;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public String getState()
    {
        return state;
    }

    public String getStreetLine1()
    {
        return streetLine1;
    }

    public String getStreetLine2()
    {
        return streetLine2;
    }

    public String getZip()
    {
        return zip;
    }

    public void setCity(String s)
    {
        city = s;
    }

    public void setEmail(String s)
    {
        email = s;
    }

    public void setFirstName(String s)
    {
        firstName = s;
    }

    public void setLastName(String s)
    {
        lastName = s;
    }

    public void setMerchantName(String s)
    {
        merchantName = s;
    }

    public void setPhoneNumber(String s)
    {
        phoneNumber = s;
    }

    public void setShowDisclaimer(boolean flag)
    {
        showDisclaimer = flag;
    }

    public void setState(String s)
    {
        state = s;
    }

    public void setStreetLine1(String s)
    {
        streetLine1 = s;
    }

    public void setStreetLine2(String s)
    {
        streetLine2 = s;
    }

    public void setZip(String s)
    {
        zip = s;
    }

    public boolean showDisclaimer()
    {
        return showDisclaimer;
    }
}
