// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.model.rewards;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class RewardsAccount
    implements Serializable
{

    private String addressLineOne;
    private String addressLineTwo;
    private String birthDate;
    private String birthMonth;
    private String city;
    private String email;
    private String firstName;
    private String lastName;
    private String phone;
    private String state;
    private String type;
    private String zip;

    public RewardsAccount()
    {
    }

    public String getAddressLineOne()
    {
        return addressLineOne;
    }

    public String getAddressLineTwo()
    {
        return addressLineTwo;
    }

    public String getBirthDate()
    {
        return birthDate;
    }

    public String getBirthMonth()
    {
        return birthMonth;
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

    public String getLastName()
    {
        return lastName;
    }

    public String getPhone()
    {
        return phone;
    }

    public String getState()
    {
        return state;
    }

    public String getType()
    {
        return type;
    }

    public String getZip()
    {
        return zip;
    }

    public void setAddressLineOne(String s)
    {
        addressLineOne = s;
    }

    public void setAddressLineTwo(String s)
    {
        addressLineTwo = s;
    }

    public void setBirthDate(String s)
    {
        birthDate = s;
    }

    public void setBirthMonth(String s)
    {
        birthMonth = s;
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

    public void setPhone(String s)
    {
        phone = s;
    }

    public void setState(String s)
    {
        state = s;
    }

    public void setType(String s)
    {
        type = s;
    }

    public void setZip(String s)
    {
        zip = s;
    }

    public Map toMap()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("email", email);
        hashmap.put("firstname", firstName);
        hashmap.put("lastName", lastName);
        hashmap.put("phone", phone);
        hashmap.put("type", type);
        hashmap.put("addressLineOne", addressLineOne);
        hashmap.put("addressLineTwo", addressLineTwo);
        hashmap.put("city", city);
        hashmap.put("state", state);
        hashmap.put("zip", zip);
        hashmap.put("birthMonth", birthMonth);
        hashmap.put("birthDate", birthDate);
        return hashmap;
    }
}
