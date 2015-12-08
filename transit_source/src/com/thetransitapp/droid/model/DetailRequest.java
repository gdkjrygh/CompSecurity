// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.model;

import java.util.List;

// Referenced classes of package com.thetransitapp.droid.model:
//            ScheduleItem

public class DetailRequest
{

    private Exception error;
    private List itineraries;
    private ScheduleItem scheduleItem;
    private Exception warning;

    public DetailRequest()
    {
    }

    public boolean canEqual(Object obj)
    {
        return obj instanceof DetailRequest;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof DetailRequest))
            {
                return false;
            }
            obj = (DetailRequest)obj;
            if (!((DetailRequest) (obj)).canEqual(this))
            {
                return false;
            }
            Object obj1 = getItineraries();
            Object obj2 = ((DetailRequest) (obj)).getItineraries();
            if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
            {
                return false;
            }
            obj1 = getScheduleItem();
            obj2 = ((DetailRequest) (obj)).getScheduleItem();
            if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
            {
                return false;
            }
            obj1 = getError();
            obj2 = ((DetailRequest) (obj)).getError();
            if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
            {
                return false;
            }
            obj1 = getWarning();
            obj = ((DetailRequest) (obj)).getWarning();
            if (obj1 != null ? !obj1.equals(obj) : obj != null)
            {
                return false;
            }
        }
        return true;
    }

    public Exception getError()
    {
        return error;
    }

    public List getItineraries()
    {
        return itineraries;
    }

    public ScheduleItem getScheduleItem()
    {
        return scheduleItem;
    }

    public Exception getWarning()
    {
        return warning;
    }

    public int hashCode()
    {
        int l = 0;
        Object obj = getItineraries();
        int i;
        int j;
        int k;
        if (obj == null)
        {
            i = 0;
        } else
        {
            i = obj.hashCode();
        }
        obj = getScheduleItem();
        if (obj == null)
        {
            j = 0;
        } else
        {
            j = obj.hashCode();
        }
        obj = getError();
        if (obj == null)
        {
            k = 0;
        } else
        {
            k = obj.hashCode();
        }
        obj = getWarning();
        if (obj != null)
        {
            l = obj.hashCode();
        }
        return (((i + 31) * 31 + j) * 31 + k) * 31 + l;
    }

    public void setError(Exception exception)
    {
        error = exception;
    }

    public void setItineraries(List list)
    {
        itineraries = list;
    }

    public void setScheduleItem(ScheduleItem scheduleitem)
    {
        scheduleItem = scheduleitem;
    }

    public void setWarning(Exception exception)
    {
        warning = exception;
    }

    public String toString()
    {
        return (new StringBuilder("DetailRequest(itineraries=")).append(getItineraries()).append(", scheduleItem=").append(getScheduleItem()).append(", error=").append(getError()).append(", warning=").append(getWarning()).append(")").toString();
    }
}
