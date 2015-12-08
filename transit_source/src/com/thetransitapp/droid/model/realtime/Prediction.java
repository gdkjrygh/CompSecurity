// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.model.realtime;

import java.util.Date;

public class Prediction
{

    String branch;
    boolean cancelled;
    double delay;
    String directionTag;
    boolean scheduleBased;
    Date stopTime;
    String tripHeadsign;
    String tripID;

    public Prediction()
    {
    }

    public boolean canEqual(Object obj)
    {
        return obj instanceof Prediction;
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof Prediction))
        {
            return false;
        }
        obj = (Prediction)obj;
        if (!((Prediction) (obj)).canEqual(this))
        {
            return false;
        }
        Object obj1 = getStopTime();
        Object obj2 = ((Prediction) (obj)).getStopTime();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        if (Double.compare(getDelay(), ((Prediction) (obj)).getDelay()) != 0)
        {
            return false;
        }
        if (isScheduleBased() != ((Prediction) (obj)).isScheduleBased())
        {
            return false;
        }
        if (isCancelled() != ((Prediction) (obj)).isCancelled())
        {
            return false;
        }
        obj1 = getTripHeadsign();
        obj2 = ((Prediction) (obj)).getTripHeadsign();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getDirectionTag();
        obj2 = ((Prediction) (obj)).getDirectionTag();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getBranch();
        obj2 = ((Prediction) (obj)).getBranch();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getTripID();
        obj = ((Prediction) (obj)).getTripID();
        return obj1 != null ? !obj1.equals(obj) : obj != null;
    }

    public String getBranch()
    {
        return branch;
    }

    public double getDelay()
    {
        return delay;
    }

    public String getDirectionTag()
    {
        if (directionTag != null)
        {
            return directionTag;
        } else
        {
            return tripHeadsign;
        }
    }

    public Date getStopTime()
    {
        return stopTime;
    }

    public String getTripHeadsign()
    {
        return tripHeadsign;
    }

    public String getTripID()
    {
        return tripID;
    }

    public int hashCode()
    {
        char c1 = '\u04CF';
        int i1 = 0;
        Object obj = getStopTime();
        int i;
        char c;
        int j;
        int k;
        int l;
        int j1;
        long l1;
        if (obj == null)
        {
            i = 0;
        } else
        {
            i = obj.hashCode();
        }
        l1 = Double.doubleToLongBits(getDelay());
        j1 = (int)(l1 >>> 32 ^ l1);
        if (isScheduleBased())
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        if (!isCancelled())
        {
            c1 = '\u04D5';
        }
        obj = getTripHeadsign();
        if (obj == null)
        {
            j = 0;
        } else
        {
            j = obj.hashCode();
        }
        obj = getDirectionTag();
        if (obj == null)
        {
            k = 0;
        } else
        {
            k = obj.hashCode();
        }
        obj = getBranch();
        if (obj == null)
        {
            l = 0;
        } else
        {
            l = obj.hashCode();
        }
        obj = getTripID();
        if (obj != null)
        {
            i1 = obj.hashCode();
        }
        return (((((((i + 31) * 31 + j1) * 31 + c) * 31 + c1) * 31 + j) * 31 + k) * 31 + l) * 31 + i1;
    }

    public boolean isCancelled()
    {
        return cancelled;
    }

    public boolean isScheduleBased()
    {
        return scheduleBased;
    }

    public void setBranch(String s)
    {
        branch = s;
    }

    public void setCancelled(boolean flag)
    {
        cancelled = flag;
    }

    public void setDelay(double d)
    {
        delay = d;
    }

    public void setDirectionTag(String s)
    {
        directionTag = s;
    }

    public void setScheduleBased(boolean flag)
    {
        scheduleBased = flag;
    }

    public void setStopTime(Date date)
    {
        stopTime = date;
    }

    public void setTripHeadsign(String s)
    {
        tripHeadsign = s;
    }

    public void setTripID(String s)
    {
        tripID = s;
    }

    public String toString()
    {
        return (new StringBuilder("Prediction(stopTime=")).append(getStopTime()).append(", delay=").append(getDelay()).append(", scheduleBased=").append(isScheduleBased()).append(", cancelled=").append(isCancelled()).append(", tripHeadsign=").append(getTripHeadsign()).append(", directionTag=").append(getDirectionTag()).append(", branch=").append(getBranch()).append(", tripID=").append(getTripID()).append(")").toString();
    }
}
