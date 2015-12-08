// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bricolsoftconsulting.geocoderplus;


// Referenced classes of package com.bricolsoftconsulting.geocoderplus:
//            Position

public class Area
{

    Position mNorthEast;
    Position mSouthWest;

    public Area()
    {
    }

    public Area(Position position, Position position1)
    {
        mNorthEast = position;
        mSouthWest = position1;
    }

    public double getLatitudeSpan()
    {
        return mNorthEast.getLatitude() - mSouthWest.getLatitude();
    }

    public int getLatitudeSpanE6()
    {
        return (int)(getLatitudeSpan() * 1000000D);
    }

    public double getLongitudeSpan()
    {
        return mNorthEast.getLongitude() - mSouthWest.getLongitude();
    }

    public int getLongitudeSpanE6()
    {
        return (int)(getLongitudeSpan() * 1000000D);
    }

    public Position getNorthEast()
    {
        return mNorthEast;
    }

    public Position getSouthWest()
    {
        return mSouthWest;
    }

    public void setNorthEast(Position position)
    {
        mNorthEast = position;
    }

    public void setSouthWest(Position position)
    {
        mSouthWest = position;
    }
}
