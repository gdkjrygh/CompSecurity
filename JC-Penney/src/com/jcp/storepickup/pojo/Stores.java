// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.storepickup.pojo;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

// Referenced classes of package com.jcp.storepickup.pojo:
//            Inventory

public class Stores
    implements Parcelable
{

    private String city;
    private String country;
    private String distance;
    private String id;
    private Inventory inventory;
    private boolean isSaved;
    private List items;
    private String latitude;
    private String longitude;
    private String name;
    private String number;
    private String phone;
    private String services[];
    private String state;
    private String stateCode;
    private String street;
    private List timings;
    private String timingsOverrideMessage;
    private String zip;

    public Stores()
    {
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

    public String getDistance()
    {
        return distance;
    }

    public String getId()
    {
        return id;
    }

    public Inventory getInventory()
    {
        return inventory;
    }

    public List getItems()
    {
        return items;
    }

    public String getLatitude()
    {
        return latitude;
    }

    public String getLongitude()
    {
        return longitude;
    }

    public String getName()
    {
        return name;
    }

    public String getNumber()
    {
        return number;
    }

    public String getPhone()
    {
        return phone;
    }

    public String[] getServices()
    {
        return services;
    }

    public String getState()
    {
        return state;
    }

    public String getStateCode()
    {
        return stateCode;
    }

    public String getStoreFullAddress()
    {
        return (new StringBuilder()).append(getStreet()).append(", ").append(getState()).append(" ").append(getZip()).toString();
    }

    public String getStreet()
    {
        return street;
    }

    public List getTimings()
    {
        return timings;
    }

    public String getTimingsOverrideMessage()
    {
        return timingsOverrideMessage;
    }

    public String getZip()
    {
        return zip;
    }

    public boolean isSaved()
    {
        return isSaved;
    }

    public void setCity(String s)
    {
        city = s;
    }

    public void setCountry(String s)
    {
        country = s;
    }

    public void setDistance(String s)
    {
        distance = s;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setInventory(Inventory inventory1)
    {
        inventory = inventory1;
    }

    public void setItems(List list)
    {
        items = list;
    }

    public void setLatitude(String s)
    {
        latitude = s;
    }

    public void setLongitude(String s)
    {
        longitude = s;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setNumber(String s)
    {
        number = s;
    }

    public void setPhone(String s)
    {
        phone = s;
    }

    public void setSaved(boolean flag)
    {
        isSaved = flag;
    }

    public void setServices(String as[])
    {
        services = as;
    }

    public void setState(String s)
    {
        state = s;
    }

    public void setStateCode(String s)
    {
        stateCode = s;
    }

    public void setStreet(String s)
    {
        street = s;
    }

    public void setTimings(List list)
    {
        timings = list;
    }

    public void setTimingsOverrideMessage(String s)
    {
        timingsOverrideMessage = s;
    }

    public void setZip(String s)
    {
        zip = s;
    }

    public String toString()
    {
        return (new StringBuilder()).append("ClassPojo [zip = ").append(zip).append(", phone = ").append(phone).append(", timingsOverrideMessage = ").append(timingsOverrideMessage).append(", timings = ").append(timings).append(", street = ").append(street).append(", state = ").append(state).append(", number = ").append(number).append(", city = ").append(city).append(", country = ").append(country).append(", id = ").append(id).append(", distance = ").append(distance).append(", items = ").append(items).append(", name = ").append(name).append(", longitude = ").append(longitude).append(", latitude = ").append(latitude).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
    }
}
