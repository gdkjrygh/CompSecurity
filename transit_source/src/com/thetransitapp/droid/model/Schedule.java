// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.thetransitapp.droid.model:
//            ScheduleItem, Itinerary, ServiceDay, Stop

public class Schedule
    implements Serializable
{

    private static final long serialVersionUID = 0xa9705bf62d16dc15L;
    private boolean isComplete;
    private Itinerary itinerary;
    private List scheduleItems;
    private ServiceDay serviceDay;
    private Stop stop;

    public Schedule()
    {
        scheduleItems = new ArrayList();
    }

    public Schedule(Itinerary itinerary1, Stop stop1, ServiceDay serviceday)
    {
        this();
        itinerary = itinerary1;
        stop = stop1;
        serviceDay = serviceday;
    }

    public boolean canEqual(Object obj)
    {
        return obj instanceof Schedule;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof Schedule))
            {
                return false;
            }
            obj = (Schedule)obj;
            if (!((Schedule) (obj)).canEqual(this))
            {
                return false;
            }
            Object obj1 = getServiceDay();
            Object obj2 = ((Schedule) (obj)).getServiceDay();
            if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
            {
                return false;
            }
            obj1 = getItinerary();
            obj2 = ((Schedule) (obj)).getItinerary();
            if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
            {
                return false;
            }
            obj1 = getStop();
            obj2 = ((Schedule) (obj)).getStop();
            if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
            {
                return false;
            }
            if (isComplete() != ((Schedule) (obj)).isComplete())
            {
                return false;
            }
            obj1 = getScheduleItems();
            obj = ((Schedule) (obj)).getScheduleItems();
            if (obj1 != null ? !obj1.equals(obj) : obj != null)
            {
                return false;
            }
        }
        return true;
    }

    public Itinerary getItinerary()
    {
        return itinerary;
    }

    public List getRealTimeItems()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = scheduleItems.iterator();
        do
        {
            ScheduleItem scheduleitem;
            do
            {
                if (!iterator.hasNext())
                {
                    return arraylist;
                }
                scheduleitem = (ScheduleItem)iterator.next();
            } while (scheduleitem.getRealStopTime() == null && !scheduleitem.isCancelled());
            arraylist.add(scheduleitem);
        } while (true);
    }

    public ScheduleItem getScheduleItemForTrip(String s)
    {
        Iterator iterator = scheduleItems.iterator();
        ScheduleItem scheduleitem;
        do
        {
            if (!iterator.hasNext())
            {
                return null;
            }
            scheduleitem = (ScheduleItem)iterator.next();
        } while (!scheduleitem.getTripId().equals(s));
        return scheduleitem;
    }

    public List getScheduleItems()
    {
        return scheduleItems;
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
        int l = 0;
        Object obj = getServiceDay();
        int i;
        int j;
        int k;
        char c;
        if (obj == null)
        {
            i = 0;
        } else
        {
            i = obj.hashCode();
        }
        obj = getItinerary();
        if (obj == null)
        {
            j = 0;
        } else
        {
            j = obj.hashCode();
        }
        obj = getStop();
        if (obj == null)
        {
            k = 0;
        } else
        {
            k = obj.hashCode();
        }
        if (isComplete())
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        obj = getScheduleItems();
        if (obj != null)
        {
            l = obj.hashCode();
        }
        return ((((i + 31) * 31 + j) * 31 + k) * 31 + c) * 31 + l;
    }

    public boolean isComplete()
    {
        return isComplete;
    }

    public void merge(Schedule schedule)
    {
        schedule = schedule.getScheduleItems().iterator();
        do
        {
            ScheduleItem scheduleitem;
            do
            {
                if (!schedule.hasNext())
                {
                    return;
                }
                scheduleitem = (ScheduleItem)schedule.next();
            } while (scheduleItems.contains(scheduleitem));
            scheduleItems.add(scheduleitem);
        } while (true);
    }

    public void mergeRealTime(List list)
    {
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                return;
            }
            ScheduleItem scheduleitem = (ScheduleItem)list.next();
            Iterator iterator = scheduleItems.iterator();
            while (iterator.hasNext()) 
            {
                ScheduleItem scheduleitem1 = (ScheduleItem)iterator.next();
                if (scheduleitem.equals(scheduleitem1))
                {
                    scheduleitem1.setRealStopTime(scheduleitem.getRealStopTime());
                    scheduleitem1.setCancelled(scheduleitem.isCancelled());
                }
            }
        } while (true);
    }

    public void setComplete(boolean flag)
    {
        isComplete = flag;
    }

    public void setItinerary(Itinerary itinerary1)
    {
        itinerary = itinerary1;
    }

    public void setScheduleItems(List list)
    {
        scheduleItems = list;
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
        return (new StringBuilder("Schedule(serviceDay=")).append(getServiceDay()).append(", itinerary=").append(getItinerary()).append(", stop=").append(getStop()).append(", isComplete=").append(isComplete()).append(", scheduleItems=").append(getScheduleItems()).append(")").toString();
    }
}
