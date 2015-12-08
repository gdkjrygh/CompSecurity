// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.beacon.model;


// Referenced classes of package com.dominos.beacon.model:
//            GeofenceData

public class 
{

    private double mLatitude;
    private double mLongitude;
    private String mStoreId;

    public GeofenceData build()
    {
        return new GeofenceData(mLatitude, mLongitude, mStoreId, null);
    }

    public mStoreId setLatitude(double d)
    {
        mLatitude = d;
        return this;
    }

    public mLatitude setLongitude(double d)
    {
        mLongitude = d;
        return this;
    }

    public mLongitude setStoreId(String s)
    {
        mStoreId = s;
        return this;
    }

    public ()
    {
    }
}
