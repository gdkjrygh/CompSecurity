// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import java.io.Serializable;

public class TinderLocation
    implements Parcelable, Serializable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final TinderLocation createFromParcel(Parcel parcel)
        {
            return new TinderLocation(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final TinderLocation[] newArray(int i)
        {
            return new TinderLocation[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private String mAddress;
    private String mCity;
    private String mCountryLong;
    private String mCountryShort;
    private String mCounty;
    private long mLastSeenDate;
    private double mLatitude;
    private double mLongitude;
    private String mRoute;
    private String mStateProvinceLong;
    private String mStateProvinceShort;
    private String mStreetNum;

    public TinderLocation()
    {
        mLastSeenDate = System.currentTimeMillis();
    }

    protected TinderLocation(Parcel parcel)
    {
        mLatitude = parcel.readDouble();
        mLongitude = parcel.readDouble();
        mStateProvinceLong = parcel.readString();
        mStateProvinceShort = parcel.readString();
        mCountryLong = parcel.readString();
        mCountryShort = parcel.readString();
        mCounty = parcel.readString();
        mAddress = parcel.readString();
        mRoute = parcel.readString();
        mStreetNum = parcel.readString();
        mCity = parcel.readString();
        mLastSeenDate = parcel.readLong();
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof TinderLocation)
        {
            obj = (TinderLocation)obj;
            return ((TinderLocation) (obj)).getLatitude() == getLatitude() && ((TinderLocation) (obj)).getLongitude() == getLongitude();
        } else
        {
            return super.equals(obj);
        }
    }

    public String getAddress()
    {
        return mAddress;
    }

    public String getAddressShort()
    {
        String s = "";
        if (!TextUtils.isEmpty(mStreetNum))
        {
            s = (new StringBuilder()).append("").append(mStreetNum).toString();
        }
        String s1 = s;
        if (!TextUtils.isEmpty(mRoute))
        {
            s1 = s;
            if (s.length() > 0)
            {
                s1 = (new StringBuilder()).append(s).append(" ").toString();
            }
            s1 = (new StringBuilder()).append(s1).append(mRoute).toString();
        }
        return s1;
    }

    public String getCity()
    {
        return mCity;
    }

    public String getCountryLong()
    {
        return mCountryLong;
    }

    public String getCountryShort()
    {
        return mCountryShort;
    }

    public String getCounty()
    {
        return mCounty;
    }

    public String getDisplayLabel()
    {
        Pair pair = getLabels();
        return (new StringBuilder()).append((String)pair.first).append(", ").append((String)pair.second).toString();
    }

    public String getId()
    {
        return String.format("%s.%s", new Object[] {
            Double.valueOf(mLatitude), Double.valueOf(mLongitude)
        });
    }

    public Pair getLabels()
    {
label0:
        {
            {
                String s1 = getAddressShort();
                String s4 = mCity;
                String s5 = mCounty;
                String s3 = mStateProvinceLong;
                String s2 = mCountryShort;
                if (TextUtils.isEmpty(getAddressShort()))
                {
                    break label0;
                }
                String s;
                if (!TextUtils.isEmpty(s4))
                {
                    s = s4;
                } else
                if (!TextUtils.isEmpty(s3))
                {
                    s = s3;
                } else
                {
                    s = null;
                }
            }
            return new Pair(s, s1);
        }
        if (!TextUtils.isEmpty(s4))
        {
            s = s4;
            s1 = s3;
            if (!TextUtils.isEmpty(s3))
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        if (!TextUtils.isEmpty(s4) && !TextUtils.isEmpty(s2))
        {
            s1 = s2;
            s = s4;
        } else
        if (!TextUtils.isEmpty(s5))
        {
            s = s5;
            s1 = s3;
        } else
        if (!TextUtils.isEmpty(s3))
        {
            s = s3;
            s1 = s2;
        } else
        if (!TextUtils.isEmpty(s2))
        {
            s1 = null;
            s = s2;
        } else
        {
            s1 = null;
            s = null;
        }
        if (true) goto _L2; else goto _L1
_L1:
        break MISSING_BLOCK_LABEL_171;
_L2:
        break MISSING_BLOCK_LABEL_49;
    }

    public long getLastSeenDate()
    {
        return mLastSeenDate;
    }

    public double getLatitude()
    {
        return mLatitude;
    }

    public double getLongitude()
    {
        return mLongitude;
    }

    public String getRoute()
    {
        return mRoute;
    }

    public String getStateProvinceLong()
    {
        return mStateProvinceLong;
    }

    public String getStateProvinceShort()
    {
        return mStateProvinceShort;
    }

    public String getStreetNumber()
    {
        return mStreetNum;
    }

    public boolean hasGeoData()
    {
        return mLatitude != 0.0D && mLongitude != 0.0D;
    }

    public void setAddress(String s)
    {
        mAddress = s;
    }

    public void setCity(String s)
    {
        mCity = s;
    }

    public void setCountryLong(String s)
    {
        mCountryLong = s;
    }

    public void setCountryShort(String s)
    {
        mCountryShort = s;
    }

    public void setCounty(String s)
    {
        mCounty = s;
    }

    public void setLastSeenDate(long l)
    {
        mLastSeenDate = l;
    }

    public void setLatitude(double d)
    {
        mLatitude = d;
    }

    public void setLongitude(double d)
    {
        mLongitude = d;
    }

    public void setRoute(String s)
    {
        mRoute = s;
    }

    public void setStateProvinceLong(String s)
    {
        mStateProvinceLong = s;
    }

    public void setStateProvinceShort(String s)
    {
        mStateProvinceShort = s;
    }

    public void setStreetNumber(String s)
    {
        mStreetNum = s;
    }

    public String toString()
    {
        return (new StringBuilder("TinderLocation{mLatitude=")).append(mLatitude).append(", mLongitude=").append(mLongitude).append(", mCity='").append(mCity).append('\'').append('}').toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeDouble(mLatitude);
        parcel.writeDouble(mLongitude);
        parcel.writeString(mStateProvinceLong);
        parcel.writeString(mStateProvinceShort);
        parcel.writeString(mCountryLong);
        parcel.writeString(mCountryShort);
        parcel.writeString(mCounty);
        parcel.writeString(mAddress);
        parcel.writeString(mRoute);
        parcel.writeString(mStreetNum);
        parcel.writeString(mCity);
        parcel.writeLong(mLastSeenDate);
    }

}
