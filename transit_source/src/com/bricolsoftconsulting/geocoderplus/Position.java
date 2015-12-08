// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bricolsoftconsulting.geocoderplus;


public class Position
{

    double mLatitude;
    double mLongitude;

    public Position()
    {
    }

    public Position(double d, double d1)
    {
        mLatitude = d;
        mLongitude = d1;
    }

    public double getLatitude()
    {
        return mLatitude;
    }

    public double getLongitude()
    {
        return mLongitude;
    }

    public void setLatitude(double d)
    {
        mLatitude = d;
    }

    public void setLongitude(double d)
    {
        mLongitude = d;
    }
}
