// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.eventshub.locationsearch.model;

import com.spotify.mobile.android.cosmos.JacksonModel;

public class mLocationName
    implements JacksonModel
{

    public static final mLocationName EMPTY = new <init>("", "");
    public final String mGeoHash;
    public final String mLocationName;

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag;
        if (this == obj)
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (obj != null)
            {
                flag = flag1;
                if (getClass() == obj.getClass())
                {
                    obj = (mLocationName)obj;
                    flag = flag1;
                    if (mGeoHash.equals(((mGeoHash) (obj)).mGeoHash))
                    {
                        return mLocationName.equals(((mLocationName) (obj)).mLocationName);
                    }
                }
            }
        }
        return flag;
    }

    public String getGeoHash()
    {
        return mGeoHash;
    }

    public String getLocationName()
    {
        return mLocationName;
    }

    public int hashCode()
    {
        return mGeoHash.hashCode() * 31 + mLocationName.hashCode();
    }


    public (String s, String s1)
    {
        String s2 = s;
        if (s == null)
        {
            s2 = "";
        }
        mGeoHash = s2;
        s = s1;
        if (s1 == null)
        {
            s = "";
        }
        mLocationName = s;
    }
}
