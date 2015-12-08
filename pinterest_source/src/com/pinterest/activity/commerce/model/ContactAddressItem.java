// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.model;

import android.os.Parcel;
import android.os.Parcelable;

public class ContactAddressItem
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private String city;
    private String country;
    private String email;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String state;
    private String streetAddress1;
    private String streetAddress2;
    private String zipCode;

    public ContactAddressItem()
    {
    }

    protected ContactAddressItem(Parcel parcel)
    {
        firstName = parcel.readString();
        lastName = parcel.readString();
        streetAddress1 = parcel.readString();
        streetAddress2 = parcel.readString();
        city = parcel.readString();
        state = parcel.readString();
        zipCode = parcel.readString();
        country = parcel.readString();
        email = parcel.readString();
        phoneNumber = parcel.readString();
    }

    public int describeContents()
    {
        return 0;
    }

    public String getCity()
    {
        return city;
    }

    public String getCountry()
    {
        return country;
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

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public String getState()
    {
        return state;
    }

    public String getStreetAddress1()
    {
        return streetAddress1;
    }

    public String getStreetAddress2()
    {
        return streetAddress2;
    }

    public String getZipCode()
    {
        return zipCode;
    }

    public void setCity(String s)
    {
        city = s;
    }

    public void setCountry(String s)
    {
        country = s;
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

    public void setPhoneNumber(String s)
    {
        phoneNumber = s;
    }

    public void setState(String s)
    {
        state = s;
    }

    public void setStreetAddress1(String s)
    {
        streetAddress1 = s;
    }

    public void setStreetAddress2(String s)
    {
        streetAddress2 = s;
    }

    public void setZipCode(String s)
    {
        zipCode = s;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(firstName);
        parcel.writeString(lastName);
        parcel.writeString(streetAddress1);
        parcel.writeString(streetAddress2);
        parcel.writeString(city);
        parcel.writeString(state);
        parcel.writeString(zipCode);
        parcel.writeString(country);
        parcel.writeString(email);
        parcel.writeString(phoneNumber);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final ContactAddressItem createFromParcel(Parcel parcel)
        {
            return new ContactAddressItem(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final ContactAddressItem[] newArray(int i)
        {
            return new ContactAddressItem[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        _cls1()
        {
        }
    }

}
