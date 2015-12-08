// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RoutingItinerary
    implements Serializable
{

    private static final long serialVersionUID = 0xdccf42360e1f21d6L;
    private long duration;
    private float durationFactor;
    private Date endTime;
    private List feedIds;
    private Date fetchDate;
    private int itineraryIndex;
    private List legs;
    private Date startTime;
    private long transitDuration;
    private double waitingDuration;
    private double walkingDistance;
    private long walkingDuration;

    public RoutingItinerary()
    {
        legs = new ArrayList();
        feedIds = new ArrayList();
    }

    public boolean canEqual(Object obj)
    {
        return obj instanceof RoutingItinerary;
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof RoutingItinerary))
        {
            return false;
        }
        obj = (RoutingItinerary)obj;
        if (!((RoutingItinerary) (obj)).canEqual(this))
        {
            return false;
        }
        if (getDuration() != ((RoutingItinerary) (obj)).getDuration())
        {
            return false;
        }
        Object obj1 = getStartTime();
        Object obj2 = ((RoutingItinerary) (obj)).getStartTime();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getEndTime();
        obj2 = ((RoutingItinerary) (obj)).getEndTime();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getFetchDate();
        obj2 = ((RoutingItinerary) (obj)).getFetchDate();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        if (Float.compare(getDurationFactor(), ((RoutingItinerary) (obj)).getDurationFactor()) != 0)
        {
            return false;
        }
        if (getItineraryIndex() != ((RoutingItinerary) (obj)).getItineraryIndex())
        {
            return false;
        }
        if (getTransitDuration() != ((RoutingItinerary) (obj)).getTransitDuration())
        {
            return false;
        }
        if (getWalkingDuration() != ((RoutingItinerary) (obj)).getWalkingDuration())
        {
            return false;
        }
        if (Double.compare(getWaitingDuration(), ((RoutingItinerary) (obj)).getWaitingDuration()) != 0)
        {
            return false;
        }
        if (Double.compare(getWalkingDistance(), ((RoutingItinerary) (obj)).getWalkingDistance()) != 0)
        {
            return false;
        }
        obj1 = getLegs();
        obj2 = ((RoutingItinerary) (obj)).getLegs();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getFeedIds();
        obj = ((RoutingItinerary) (obj)).getFeedIds();
        return obj1 != null ? !obj1.equals(obj) : obj != null;
    }

    public long getDuration()
    {
        return duration;
    }

    public float getDurationFactor()
    {
        return durationFactor;
    }

    public Date getEndTime()
    {
        return endTime;
    }

    public List getFeedIds()
    {
        return feedIds;
    }

    public Date getFetchDate()
    {
        return fetchDate;
    }

    public int getItineraryIndex()
    {
        return itineraryIndex;
    }

    public List getLegs()
    {
        return legs;
    }

    public Date getStartTime()
    {
        return startTime;
    }

    public long getTransitDuration()
    {
        return transitDuration;
    }

    public double getWaitingDuration()
    {
        return waitingDuration;
    }

    public double getWalkingDistance()
    {
        return walkingDistance;
    }

    public long getWalkingDuration()
    {
        return walkingDuration;
    }

    public int hashCode()
    {
        long l3 = getDuration();
        int j1 = (int)(l3 >>> 32 ^ l3);
        Object obj = getStartTime();
        int i;
        int j;
        int k;
        int l;
        int i1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        if (obj == null)
        {
            i = 0;
        } else
        {
            i = obj.hashCode();
        }
        obj = getEndTime();
        if (obj == null)
        {
            j = 0;
        } else
        {
            j = obj.hashCode();
        }
        obj = getFetchDate();
        if (obj == null)
        {
            k = 0;
        } else
        {
            k = obj.hashCode();
        }
        k1 = Float.floatToIntBits(getDurationFactor());
        l1 = getItineraryIndex();
        l3 = getTransitDuration();
        i2 = (int)(l3 >>> 32 ^ l3);
        l3 = getWalkingDuration();
        j2 = (int)(l3 >>> 32 ^ l3);
        l3 = Double.doubleToLongBits(getWaitingDuration());
        k2 = (int)(l3 >>> 32 ^ l3);
        l3 = Double.doubleToLongBits(getWalkingDistance());
        l2 = (int)(l3 >>> 32 ^ l3);
        obj = getLegs();
        if (obj == null)
        {
            l = 0;
        } else
        {
            l = obj.hashCode();
        }
        obj = getFeedIds();
        if (obj == null)
        {
            i1 = 0;
        } else
        {
            i1 = obj.hashCode();
        }
        return (((((((((((j1 + 31) * 31 + i) * 31 + j) * 31 + k) * 31 + k1) * 31 + l1) * 31 + i2) * 31 + j2) * 31 + k2) * 31 + l2) * 31 + l) * 31 + i1;
    }

    public void setDuration(long l)
    {
        duration = l;
    }

    public void setDurationFactor(float f)
    {
        durationFactor = f;
    }

    public void setEndTime(Date date)
    {
        endTime = date;
    }

    public void setFeedIds(List list)
    {
        feedIds = list;
    }

    public void setFetchDate(Date date)
    {
        fetchDate = date;
    }

    public void setItineraryIndex(int i)
    {
        itineraryIndex = i;
    }

    public void setLegs(List list)
    {
        legs = list;
    }

    public void setStartTime(Date date)
    {
        startTime = date;
    }

    public void setTransitDuration(long l)
    {
        transitDuration = l;
    }

    public void setWaitingDuration(double d)
    {
        waitingDuration = d;
    }

    public void setWalkingDistance(double d)
    {
        walkingDistance = d;
    }

    public void setWalkingDuration(long l)
    {
        walkingDuration = l;
    }

    public String toString()
    {
        return (new StringBuilder("RoutingItinerary(duration=")).append(getDuration()).append(", startTime=").append(getStartTime()).append(", endTime=").append(getEndTime()).append(", fetchDate=").append(getFetchDate()).append(", durationFactor=").append(getDurationFactor()).append(", itineraryIndex=").append(getItineraryIndex()).append(", transitDuration=").append(getTransitDuration()).append(", walkingDuration=").append(getWalkingDuration()).append(", waitingDuration=").append(getWaitingDuration()).append(", walkingDistance=").append(getWalkingDistance()).append(", legs=").append(getLegs()).append(", feedIds=").append(getFeedIds()).append(")").toString();
    }
}
