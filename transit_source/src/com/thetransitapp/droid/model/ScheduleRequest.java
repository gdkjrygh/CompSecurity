// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.model;


// Referenced classes of package com.thetransitapp.droid.model:
//            Route, ServiceDay, Stop

public class ScheduleRequest
{

    private Route route;
    private ServiceDay serviceDay;
    private Stop stop;

    public ScheduleRequest()
    {
    }

    public boolean canEqual(Object obj)
    {
        return obj instanceof ScheduleRequest;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ScheduleRequest))
            {
                return false;
            }
            obj = (ScheduleRequest)obj;
            if (!((ScheduleRequest) (obj)).canEqual(this))
            {
                return false;
            }
            Object obj1 = getRoute();
            Object obj2 = ((ScheduleRequest) (obj)).getRoute();
            if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
            {
                return false;
            }
            obj1 = getStop();
            obj2 = ((ScheduleRequest) (obj)).getStop();
            if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
            {
                return false;
            }
            obj1 = getServiceDay();
            obj = ((ScheduleRequest) (obj)).getServiceDay();
            if (obj1 != null ? !obj1.equals(obj) : obj != null)
            {
                return false;
            }
        }
        return true;
    }

    public Route getRoute()
    {
        return route;
    }

    public ServiceDay getServiceDay()
    {
        return serviceDay;
    }

    public Stop getStop()
    {
        return stop;
    }

    public int hashCode()
    {
        int k = 0;
        Object obj = getRoute();
        int i;
        int j;
        if (obj == null)
        {
            i = 0;
        } else
        {
            i = obj.hashCode();
        }
        obj = getStop();
        if (obj == null)
        {
            j = 0;
        } else
        {
            j = obj.hashCode();
        }
        obj = getServiceDay();
        if (obj != null)
        {
            k = obj.hashCode();
        }
        return ((i + 31) * 31 + j) * 31 + k;
    }

    public void setRoute(Route route1)
    {
        route = route1;
    }

    public void setServiceDay(ServiceDay serviceday)
    {
        serviceDay = serviceday;
    }

    public void setStop(Stop stop1)
    {
        stop = stop1;
    }

    public String toString()
    {
        return (new StringBuilder("ScheduleRequest(route=")).append(getRoute()).append(", stop=").append(getStop()).append(", serviceDay=").append(getServiceDay()).append(")").toString();
    }
}
