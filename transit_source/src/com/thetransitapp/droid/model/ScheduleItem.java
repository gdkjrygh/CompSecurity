// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.model;

import android.content.Context;
import android.text.format.DateFormat;
import java.io.Serializable;
import java.util.Date;

// Referenced classes of package com.thetransitapp.droid.model:
//            Itinerary, ServiceDay, Stop

public class ScheduleItem
    implements Serializable, Comparable
{

    private static final long serialVersionUID = 0x406a919a760a55b8L;
    private boolean cancelled;
    private boolean dropOffCancelled;
    private Date frequencyEndTime;
    private long frequencyHeadway;
    private Date frequencyStartTime;
    private String headsign;
    private Itinerary itinerary;
    private boolean lastItemOfService;
    private boolean pickupCancelled;
    private Date realStopTime;
    private String realTimeDirectionId;
    private Date scheduledStopTime;
    private ServiceDay serviceDay;
    private Stop stop;
    private String tripId;

    public ScheduleItem()
    {
    }

    public ScheduleItem(Date date)
    {
        scheduledStopTime = date;
    }

    public int compareTo(ScheduleItem scheduleitem)
    {
        return getEndDate().compareTo(scheduleitem.getEndDate());
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((ScheduleItem)obj);
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof ScheduleItem) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        obj = (ScheduleItem)obj;
        if (tripId == null && ((ScheduleItem) (obj)).tripId != null) goto _L1; else goto _L3
_L3:
        if (tripId != null) goto _L5; else goto _L4
_L4:
        if (((ScheduleItem) (obj)).tripId != null) goto _L1; else goto _L6
_L6:
        if (getStopTime() != null)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        if (((ScheduleItem) (obj)).getStopTime() != null) goto _L1; else goto _L7
_L7:
        if (isFrequency() == ((ScheduleItem) (obj)).isFrequency())
        {
            return true;
        }
          goto _L1
_L5:
        if (!tripId.equals(((ScheduleItem) (obj)).tripId))
        {
            return false;
        }
          goto _L6
        if (!getStopTime().equals(((ScheduleItem) (obj)).getStopTime()))
        {
            return false;
        }
          goto _L7
    }

    public Date getEndDate()
    {
        if (isFrequency())
        {
            return frequencyEndTime;
        } else
        {
            return getStopTime();
        }
    }

    public Date getFrequencyEndTime()
    {
        return frequencyEndTime;
    }

    public long getFrequencyHeadway()
    {
        return frequencyHeadway;
    }

    public Date getFrequencyStartTime()
    {
        return frequencyStartTime;
    }

    public String getHeadsign()
    {
        return headsign;
    }

    public Itinerary getItinerary()
    {
        return itinerary;
    }

    public String getMapCalloutAbsoluteDepartureString()
    {
        return null;
    }

    public String getMapCalloutArrivalString()
    {
        return null;
    }

    public String getMapCalloutDepartureString()
    {
        return null;
    }

    public int getMinutesRemaining()
    {
        if (!isFrequency())
        {
            return (int)(getStopTime().getTime() - System.currentTimeMillis()) / 60000;
        } else
        {
            return (int)frequencyHeadway / 60;
        }
    }

    public Date getRealStopTime()
    {
        return realStopTime;
    }

    public String getRealTimeDirectionId()
    {
        return realTimeDirectionId;
    }

    public String getRelativeTimeString()
    {
        return null;
    }

    public String getScheduleViewLabelString()
    {
        return null;
    }

    public String getScheduleViewString(Context context)
    {
        return context.getString(0x7f0a0048, new Object[] {
            Integer.valueOf((int)(frequencyHeadway / 60L)), DateFormat.getTimeFormat(context).format(getEndDate())
        });
    }

    public Date getScheduledStopTime()
    {
        return scheduledStopTime;
    }

    public ServiceDay getServiceDay()
    {
        return serviceDay;
    }

    public Date getSortDate()
    {
        return getEndDate();
    }

    public Date getStartDate()
    {
        if (isFrequency())
        {
            return frequencyStartTime;
        } else
        {
            return getStopTime();
        }
    }

    public Stop getStop()
    {
        return stop;
    }

    public Date getStopTime()
    {
        if (realStopTime != null)
        {
            return realStopTime;
        } else
        {
            return scheduledStopTime;
        }
    }

    public String getTripId()
    {
        return tripId;
    }

    public boolean isCancelled()
    {
        return cancelled;
    }

    public boolean isDropOffCancelled()
    {
        return dropOffCancelled;
    }

    public boolean isFrequency()
    {
        return getStopTime() == null;
    }

    public boolean isLastItemOfService()
    {
        return lastItemOfService;
    }

    public boolean isPastItem()
    {
        return getEndDate().before(new Date());
    }

    public boolean isPickupCancelled()
    {
        return pickupCancelled;
    }

    public void setCancelled(boolean flag)
    {
        cancelled = flag;
    }

    public void setDropOffCancelled(boolean flag)
    {
        dropOffCancelled = flag;
    }

    public void setFrequencyEndTime(Date date)
    {
        frequencyEndTime = date;
    }

    public void setFrequencyHeadway(long l)
    {
        frequencyHeadway = l;
    }

    public void setFrequencyStartTime(Date date)
    {
        frequencyStartTime = date;
    }

    public void setHeadsign(String s)
    {
        headsign = s;
    }

    public void setItinerary(Itinerary itinerary1)
    {
        itinerary = itinerary1;
    }

    public void setLastItemOfService(boolean flag)
    {
        lastItemOfService = flag;
    }

    public void setPickupCancelled(boolean flag)
    {
        pickupCancelled = flag;
    }

    public void setRealStopTime(Date date)
    {
        realStopTime = date;
    }

    public void setRealTimeDirectionId(String s)
    {
        realTimeDirectionId = s;
    }

    public void setScheduledStopTime(Date date)
    {
        scheduledStopTime = date;
    }

    public void setServiceDay(ServiceDay serviceday)
    {
        serviceDay = serviceday;
    }

    public void setStop(Stop stop1)
    {
        stop = stop1;
    }

    public void setTripId(String s)
    {
        tripId = s;
    }

    public String toString()
    {
        return (new StringBuilder("ScheduleItem(itinerary=")).append(getItinerary()).append(", serviceDay=").append(getServiceDay()).append(", stop=").append(getStop()).append(", scheduledStopTime=").append(getScheduledStopTime()).append(", realStopTime=").append(getRealStopTime()).append(", realTimeDirectionId=").append(getRealTimeDirectionId()).append(", headsign=").append(getHeadsign()).append(", cancelled=").append(isCancelled()).append(", lastItemOfService=").append(isLastItemOfService()).append(", frequencyStartTime=").append(getFrequencyStartTime()).append(", frequencyEndTime=").append(getFrequencyEndTime()).append(", frequencyHeadway=").append(getFrequencyHeadway()).append(", tripId=").append(getTripId()).append(", pickupCancelled=").append(isPickupCancelled()).append(", dropOffCancelled=").append(isDropOffCancelled()).append(")").toString();
    }
}
