// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.thetransitapp.droid.model:
//            Stop, ServiceDay, Schedule, Route, 
//            SimplePlacemark

public class Itinerary
    implements Serializable
{
    public static final class DirectionType extends Enum
    {

        private static final DirectionType ENUM$VALUES[];
        public static final DirectionType INBOUND;
        public static final DirectionType OUTBOUND;
        public static final DirectionType UNDEFINED;

        public static DirectionType valueOf(String s)
        {
            return (DirectionType)Enum.valueOf(com/thetransitapp/droid/model/Itinerary$DirectionType, s);
        }

        public static DirectionType[] values()
        {
            DirectionType adirectiontype[] = ENUM$VALUES;
            int i = adirectiontype.length;
            DirectionType adirectiontype1[] = new DirectionType[i];
            System.arraycopy(adirectiontype, 0, adirectiontype1, 0, i);
            return adirectiontype1;
        }

        static 
        {
            INBOUND = new DirectionType("INBOUND", 0);
            OUTBOUND = new DirectionType("OUTBOUND", 1);
            UNDEFINED = new DirectionType("UNDEFINED", 2);
            ENUM$VALUES = (new DirectionType[] {
                INBOUND, OUTBOUND, UNDEFINED
            });
        }

        private DirectionType(String s, int i)
        {
            super(s, i);
        }
    }


    private static final long serialVersionUID = 0x57e3abc5a6ab585eL;
    private String branch;
    private String defaultHeadsign;
    private DirectionType directionType;
    private Map headsigns;
    private String id;
    private String itineraryId;
    private String realTimeRouteID;
    private Route route;
    private Map schedules;
    private String shape;
    private List stops;

    public Itinerary()
    {
        stops = new ArrayList();
        headsigns = new HashMap();
        schedules = new HashMap();
    }

    public void addSchedule(Schedule schedule, Stop stop, ServiceDay serviceday)
    {
        stop = (new StringBuilder(String.valueOf(stop.hashCode() + serviceday.hashCode()))).toString();
        if (!schedules.containsKey(stop) || schedule.isComplete())
        {
            schedules.put(stop, schedule);
        } else
        {
            stop = (Schedule)schedules.get(stop);
            if (!stop.isComplete())
            {
                stop.merge(schedule);
                return;
            }
        }
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof Itinerary)
        {
            if (id.equals(((Itinerary) (obj = (Itinerary)obj)).id) && stops.equals(((Itinerary) (obj)).getStops()) && directionType == ((Itinerary) (obj)).directionType)
            {
                return true;
            }
        }
        return false;
    }

    public String getBranch()
    {
        return branch;
    }

    public Stop getClosestStop(SimplePlacemark simpleplacemark)
    {
        Stop stop = null;
        Iterator iterator = stops.iterator();
        do
        {
            Stop stop1;
            do
            {
                if (!iterator.hasNext())
                {
                    return stop;
                }
                stop1 = (Stop)iterator.next();
            } while (1.7976931348623157E+308D <= (double)stop1.getDistance(simpleplacemark));
            stop = stop1;
        } while (true);
    }

    public String getDefaultHeadsign()
    {
        return defaultHeadsign;
    }

    public DirectionType getDirectionType()
    {
        return directionType;
    }

    public String getGroupingKey(Stop stop)
    {
        if (directionType == DirectionType.UNDEFINED)
        {
            return getHeadsign(stop);
        } else
        {
            return branch;
        }
    }

    public String getHeadsign(Stop stop)
    {
        return defaultHeadsign;
    }

    public Map getHeadsigns()
    {
        return headsigns;
    }

    public String getId()
    {
        return id;
    }

    public String getItineraryId()
    {
        return itineraryId;
    }

    public String getRealTimeRouteID()
    {
        return realTimeRouteID;
    }

    public Route getRoute()
    {
        return route;
    }

    public Schedule getSchedule(Stop stop, ServiceDay serviceday)
    {
        String s = (new StringBuilder(String.valueOf(stop.hashCode() + serviceday.hashCode()))).toString();
        if (!schedules.containsKey(s))
        {
            schedules.put(s, new Schedule(this, stop, serviceday));
        }
        return (Schedule)schedules.get(s);
    }

    public Map getSchedules()
    {
        return schedules;
    }

    public String getShape()
    {
        return shape;
    }

    public List getStops()
    {
        return stops;
    }

    public int hashCode()
    {
        return id.hashCode() + stops.hashCode() + directionType.hashCode();
    }

    public boolean isTripLoaded(String s)
    {
        int i = 0;
        Iterator iterator = schedules.keySet().iterator();
        do
        {
            do
            {
                String s1;
                if (!iterator.hasNext())
                {
                    return i > 2;
                }
                s1 = (String)iterator.next();
            } while (((Schedule)schedules.get(s1)).getScheduleItemForTrip(s) == null);
            i++;
        } while (true);
    }

    public void merge(Itinerary itinerary)
    {
        Iterator iterator = itinerary.getSchedules().keySet().iterator();
        do
        {
            String s;
            Schedule schedule;
            Schedule schedule1;
            do
            {
                if (!iterator.hasNext())
                {
                    return;
                }
                s = (String)iterator.next();
                schedule = (Schedule)schedules.get(s);
                schedule1 = (Schedule)itinerary.schedules.get(s);
            } while (schedule != null && schedule.isComplete());
            schedule1.mergeRealTime(schedule.getRealTimeItems());
            schedules.put(s, schedule1);
        } while (true);
    }

    public void setBranch(String s)
    {
        branch = s;
    }

    public void setDefaultHeadsign(String s)
    {
        defaultHeadsign = s;
    }

    public void setDirectionType(DirectionType directiontype)
    {
        directionType = directiontype;
    }

    public void setHeadsigns(Map map)
    {
        headsigns = map;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setItineraryId(String s)
    {
        itineraryId = s;
    }

    public void setRealTimeRouteID(String s)
    {
        realTimeRouteID = s;
    }

    public void setRoute(Route route1)
    {
        route = route1;
    }

    public void setSchedules(Map map)
    {
        schedules = map;
    }

    public void setShape(String s)
    {
        shape = s;
    }

    public void setStops(List list)
    {
        stops = list;
    }

    public String toString()
    {
        return (new StringBuilder("Itinerary(id=")).append(getId()).append(", itineraryId=").append(getItineraryId()).append(", route=").append(getRoute()).append(", shape=").append(getShape()).append(", stops=").append(getStops()).append(", directionType=").append(getDirectionType()).append(", branch=").append(getBranch()).append(", realTimeRouteID=").append(getRealTimeRouteID()).append(", defaultHeadsign=").append(getDefaultHeadsign()).append(", headsigns=").append(getHeadsigns()).append(", schedules=").append(getSchedules()).append(")").toString();
    }
}
