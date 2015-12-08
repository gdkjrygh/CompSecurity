// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bricolsoftconsulting.geocoderplus;

import java.util.Locale;

// Referenced classes of package com.bricolsoftconsulting.geocoderplus:
//            Area

public class Address
{

    String mAdminArea;
    Area mBounds;
    String mCountryCode;
    String mCountryName;
    String mFloor;
    String mFormattedAddress;
    double mLatitude;
    Locale mLocale;
    String mLocality;
    double mLongitude;
    String mNeighborhood;
    String mPostalCode;
    String mPremise;
    String mRoom;
    String mRoute;
    String mStreetNumber;
    String mSubAdminArea;
    String mSubAdminArea2;
    String mSubLocality;
    String mSubPremise;
    Area mViewPort;

    public Address()
    {
        mLocale = Locale.getDefault();
    }

    public Address(Locale locale)
    {
        mLocale = locale;
    }

    public String getAdminArea()
    {
        return mAdminArea;
    }

    public Area getBounds()
    {
        return mBounds;
    }

    public String getCountryCode()
    {
        return mCountryCode;
    }

    public String getCountryName()
    {
        return mCountryName;
    }

    public String getFloor()
    {
        return mFloor;
    }

    public String getFormattedAddress()
    {
        return mFormattedAddress;
    }

    public double getLatitude()
    {
        return mLatitude;
    }

    public int getLatitudeE6()
    {
        return (int)(mLatitude * 1000000D);
    }

    public Locale getLocale()
    {
        return mLocale;
    }

    public String getLocality()
    {
        return mLocality;
    }

    public double getLongitude()
    {
        return mLongitude;
    }

    public int getLongitudeE6()
    {
        return (int)(mLongitude * 1000000D);
    }

    public String getNeighborhood()
    {
        return mNeighborhood;
    }

    public String getPostalCode()
    {
        return mPostalCode;
    }

    public String getPremise()
    {
        return mPremise;
    }

    public String getRoom()
    {
        return mRoom;
    }

    public String getRoute()
    {
        return mRoute;
    }

    public String getStreetNumber()
    {
        return mStreetNumber;
    }

    public String getSubAdminArea()
    {
        return mSubAdminArea;
    }

    public String getSubAdminArea2()
    {
        return mSubAdminArea2;
    }

    public String getSubLocality()
    {
        return mSubLocality;
    }

    public String getSubPremise()
    {
        return mSubPremise;
    }

    public Area getViewPort()
    {
        return mViewPort;
    }

    public void setAdminArea(String s)
    {
        mAdminArea = s;
    }

    public void setBounds(Area area)
    {
        mBounds = area;
    }

    public void setCountryCode(String s)
    {
        mCountryCode = s;
    }

    public void setCountryName(String s)
    {
        mCountryName = s;
    }

    public void setFloor(String s)
    {
        mFloor = s;
    }

    public void setFormattedAddress(String s)
    {
        mFormattedAddress = s;
    }

    public void setLatitude(double d)
    {
        mLatitude = d;
    }

    public void setLocale(Locale locale)
    {
        mLocale = locale;
    }

    public void setLocality(String s)
    {
        mLocality = s;
    }

    public void setLongitude(double d)
    {
        mLongitude = d;
    }

    public void setNeighborhood(String s)
    {
        mNeighborhood = s;
    }

    public void setPostalCode(String s)
    {
        mPostalCode = s;
    }

    public void setPremise(String s)
    {
        mPremise = s;
    }

    public void setRoom(String s)
    {
        mRoom = s;
    }

    public void setRoute(String s)
    {
        mRoute = s;
    }

    public void setStreetNumber(String s)
    {
        mStreetNumber = s;
    }

    public void setSubAdminArea(String s)
    {
        mSubAdminArea = s;
    }

    public void setSubAdminArea2(String s)
    {
        mSubAdminArea = s;
    }

    public void setSubLocality(String s)
    {
        mSubLocality = s;
    }

    public void setSubPremise(String s)
    {
        mSubPremise = s;
    }

    public void setViewPort(Area area)
    {
        mViewPort = area;
    }
}
