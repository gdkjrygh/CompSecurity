// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.model;


public class RouteDirection
{

    private Itinerary.DirectionType direction;
    private int directionIndex;

    public RouteDirection()
    {
    }

    public boolean canEqual(Object obj)
    {
        return obj instanceof RouteDirection;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof RouteDirection))
            {
                return false;
            }
            obj = (RouteDirection)obj;
            if (!((RouteDirection) (obj)).canEqual(this))
            {
                return false;
            }
            Itinerary.DirectionType directiontype = getDirection();
            Itinerary.DirectionType directiontype1 = ((RouteDirection) (obj)).getDirection();
            if (directiontype != null ? !directiontype.equals(directiontype1) : directiontype1 != null)
            {
                return false;
            }
            if (getDirectionIndex() != ((RouteDirection) (obj)).getDirectionIndex())
            {
                return false;
            }
        }
        return true;
    }

    public Itinerary.DirectionType getDirection()
    {
        return direction;
    }

    public int getDirectionIndex()
    {
        return directionIndex;
    }

    public int hashCode()
    {
        Itinerary.DirectionType directiontype = getDirection();
        int i;
        if (directiontype == null)
        {
            i = 0;
        } else
        {
            i = directiontype.hashCode();
        }
        return (i + 31) * 31 + getDirectionIndex();
    }

    public void setDirection(Itinerary.DirectionType directiontype)
    {
        direction = directiontype;
    }

    public void setDirectionIndex(int i)
    {
        directionIndex = i;
    }

    public String toString()
    {
        return (new StringBuilder("RouteDirection(direction=")).append(getDirection()).append(", directionIndex=").append(getDirectionIndex()).append(")").toString();
    }
}
