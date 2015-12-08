// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.eventshub.locationsearch.model;

import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Locations
    implements JacksonModel
{

    public static final Locations EMPTY = new Locations(null);
    private final List mLocations;

    public Locations(List list)
    {
        List list1 = list;
        if (list == null)
        {
            list1 = Collections.unmodifiableList(Arrays.asList(new Location[0]));
        }
        mLocations = list1;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        } else
        {
            obj = (Locations)obj;
            return mLocations.equals(((Locations) (obj)).mLocations);
        }
    }

    public List getLocations()
    {
        return mLocations;
    }

    public int hashCode()
    {
        return mLocations.hashCode();
    }


    private class Location
        implements JacksonModel
    {

        public static final Location EMPTY = new Location("", "");
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
                        obj = (Location)obj;
                        flag = flag1;
                        if (mGeoHash.equals(((Location) (obj)).mGeoHash))
                        {
                            return mLocationName.equals(((Location) (obj)).mLocationName);
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


        public Location(String s, String s1)
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

}
