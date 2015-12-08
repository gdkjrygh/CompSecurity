// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public class GetAddressResponseModel
    implements Parcelable, Serializable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private String addressLineOne;
    private String addressLineTwo;
    private String city;
    private String company;
    private String country;
    private boolean expressCheckout;
    private String firstName;
    private String id;
    private boolean isDefault;
    private String lastName;
    private String militaryAddressType;
    private String phone;
    private String state;
    private String url;
    private String zip;

    public GetAddressResponseModel()
    {
    }

    protected GetAddressResponseModel(Parcel parcel)
    {
        url = parcel.readString();
        id = parcel.readString();
        firstName = parcel.readString();
        lastName = parcel.readString();
        addressLineOne = parcel.readString();
        company = parcel.readString();
        city = parcel.readString();
        state = parcel.readString();
        zip = parcel.readString();
        country = parcel.readString();
        phone = parcel.readString();
        addressLineTwo = parcel.readString();
        militaryAddressType = parcel.readString();
    }

    public int describeContents()
    {
        return 0;
    }

    public String getAddressLineOne()
    {
        return addressLineOne;
    }

    public String getAddressLineTwo()
    {
        return addressLineTwo;
    }

    public String getCity()
    {
        return city;
    }

    public String getCompany()
    {
        return company;
    }

    public String getCountry()
    {
        return country;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getId()
    {
        return id;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getMilitaryAddressType()
    {
        return militaryAddressType;
    }

    public String getPhone()
    {
        return phone;
    }

    public String getState()
    {
        return state;
    }

    public String getUrl()
    {
        return url;
    }

    public String getZip()
    {
        return zip;
    }

    public boolean isDefault()
    {
        return isDefault;
    }

    public boolean isExpressCheckout()
    {
        return expressCheckout;
    }

    public void setAddressLineOne(String s)
    {
        addressLineOne = s;
    }

    public void setAddressLineTwo(String s)
    {
        addressLineTwo = s;
    }

    public void setCity(String s)
    {
        city = s;
    }

    public void setCompany(String s)
    {
        company = s;
    }

    public void setCountry(String s)
    {
        country = s;
    }

    public void setDefault(boolean flag)
    {
        isDefault = flag;
    }

    public void setExpressCheckout(boolean flag)
    {
        expressCheckout = flag;
    }

    public void setFirstName(String s)
    {
        firstName = s;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setLastName(String s)
    {
        lastName = s;
    }

    public void setMilitaryAddressType(String s)
    {
        militaryAddressType = s;
    }

    public void setPhone(String s)
    {
        phone = s;
    }

    public void setState(String s)
    {
        state = s;
    }

    public void setUrl(String s)
    {
        url = s;
    }

    public void setZip(String s)
    {
        zip = s;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(url);
        parcel.writeString(id);
        parcel.writeString(firstName);
        parcel.writeString(lastName);
        parcel.writeString(addressLineOne);
        parcel.writeString(company);
        parcel.writeString(city);
        parcel.writeString(state);
        parcel.writeString(zip);
        parcel.writeString(country);
        parcel.writeString(phone);
        parcel.writeString(addressLineTwo);
        parcel.writeString(militaryAddressType);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public GetAddressResponseModel createFromParcel(Parcel parcel)
        {
            return new GetAddressResponseModel(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public GetAddressResponseModel[] newArray(int i)
        {
            return new GetAddressResponseModel[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        _cls1()
        {
        }
    }

}
