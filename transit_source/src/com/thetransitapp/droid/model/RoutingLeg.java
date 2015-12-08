// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.model;

import com.google.android.gms.maps.model.LatLngBounds;
import com.thetransitapp.droid.model.viewmodel.RouteViewModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.thetransitapp.droid.model:
//            SimplePlacemark, ScheduleItem

public class RoutingLeg
    implements Serializable
{
    public static final class LegType extends Enum
    {

        public static final LegType END;
        private static final LegType ENUM$VALUES[];
        public static final LegType START;
        public static final LegType TRANSIT;
        public static final LegType WAIT;
        public static final LegType WALK;

        public static LegType valueOf(String s)
        {
            return (LegType)Enum.valueOf(com/thetransitapp/droid/model/RoutingLeg$LegType, s);
        }

        public static LegType[] values()
        {
            LegType alegtype[] = ENUM$VALUES;
            int i = alegtype.length;
            LegType alegtype1[] = new LegType[i];
            System.arraycopy(alegtype, 0, alegtype1, 0, i);
            return alegtype1;
        }

        static 
        {
            START = new LegType("START", 0);
            WALK = new LegType("WALK", 1);
            WAIT = new LegType("WAIT", 2);
            TRANSIT = new LegType("TRANSIT", 3);
            END = new LegType("END", 4);
            ENUM$VALUES = (new LegType[] {
                START, WALK, WAIT, TRANSIT, END
            });
        }

        private LegType(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class TransportationMode extends Enum
    {

        public static final TransportationMode ALIGHTING;
        public static final TransportationMode BICYCLE;
        public static final TransportationMode BOARDING;
        public static final TransportationMode BUS;
        public static final TransportationMode BUSISH;
        public static final TransportationMode CABLE_CAR;
        public static final TransportationMode CAR;
        public static final TransportationMode CUSTOM_MOTOR_VEHICLE;
        private static final TransportationMode ENUM$VALUES[];
        public static final TransportationMode FERRY;
        public static final TransportationMode FUNICULAR;
        public static final TransportationMode GONDOLA;
        public static final TransportationMode RAIL;
        public static final TransportationMode STL;
        public static final TransportationMode SUBWAY;
        public static final TransportationMode TRAINISH;
        public static final TransportationMode TRAM;
        public static final TransportationMode TRANSFER;
        public static final TransportationMode TRANSIT;
        public static final TransportationMode WAIT;
        public static final TransportationMode WALK;

        public static TransportationMode valueOf(String s)
        {
            return (TransportationMode)Enum.valueOf(com/thetransitapp/droid/model/RoutingLeg$TransportationMode, s);
        }

        public static TransportationMode[] values()
        {
            TransportationMode atransportationmode[] = ENUM$VALUES;
            int i = atransportationmode.length;
            TransportationMode atransportationmode1[] = new TransportationMode[i];
            System.arraycopy(atransportationmode, 0, atransportationmode1, 0, i);
            return atransportationmode1;
        }

        static 
        {
            WAIT = new TransportationMode("WAIT", 0);
            WALK = new TransportationMode("WALK", 1);
            BICYCLE = new TransportationMode("BICYCLE", 2);
            CAR = new TransportationMode("CAR", 3);
            TRAM = new TransportationMode("TRAM", 4);
            SUBWAY = new TransportationMode("SUBWAY", 5);
            RAIL = new TransportationMode("RAIL", 6);
            BUS = new TransportationMode("BUS", 7);
            FERRY = new TransportationMode("FERRY", 8);
            CABLE_CAR = new TransportationMode("CABLE_CAR", 9);
            GONDOLA = new TransportationMode("GONDOLA", 10);
            FUNICULAR = new TransportationMode("FUNICULAR", 11);
            TRANSIT = new TransportationMode("TRANSIT", 12);
            TRAINISH = new TransportationMode("TRAINISH", 13);
            BUSISH = new TransportationMode("BUSISH", 14);
            BOARDING = new TransportationMode("BOARDING", 15);
            ALIGHTING = new TransportationMode("ALIGHTING", 16);
            TRANSFER = new TransportationMode("TRANSFER", 17);
            STL = new TransportationMode("STL", 18);
            CUSTOM_MOTOR_VEHICLE = new TransportationMode("CUSTOM_MOTOR_VEHICLE", 19);
            ENUM$VALUES = (new TransportationMode[] {
                WAIT, WALK, BICYCLE, CAR, TRAM, SUBWAY, RAIL, BUS, FERRY, CABLE_CAR, 
                GONDOLA, FUNICULAR, TRANSIT, TRAINISH, BUSISH, BOARDING, ALIGHTING, TRANSFER, STL, CUSTOM_MOTOR_VEHICLE
            });
        }

        private TransportationMode(String s, int i)
        {
            super(s, i);
        }
    }


    private static final long serialVersionUID = 0xc92e713bdbed684dL;
    private double distance;
    private long duration;
    private ScheduleItem endScheduleItem;
    private SimplePlacemark fromPlacemark;
    private String headsign;
    private List intermediateStops;
    private int legSequence;
    private LegType legType;
    private double previousStopLatitude;
    private double previousStopLongitude;
    private RouteViewModel route;
    private String shape;
    private ScheduleItem startScheduleItem;
    private String stepSubtitle;
    private String stepTimeString;
    private String stepTitle;
    private int timeBarColor;
    private SimplePlacemark toPlacemark;
    private long totalDuration;
    private TransportationMode transportationMode;
    private long waitDuration;

    public RoutingLeg()
    {
        intermediateStops = new ArrayList();
    }

    public boolean canEqual(Object obj)
    {
        return obj instanceof RoutingLeg;
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof RoutingLeg))
        {
            return false;
        }
        obj = (RoutingLeg)obj;
        if (!((RoutingLeg) (obj)).canEqual(this))
        {
            return false;
        }
        Object obj1 = getTransportationMode();
        Object obj2 = ((RoutingLeg) (obj)).getTransportationMode();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getLegType();
        obj2 = ((RoutingLeg) (obj)).getLegType();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        if (getDuration() != ((RoutingLeg) (obj)).getDuration())
        {
            return false;
        }
        if (getWaitDuration() != ((RoutingLeg) (obj)).getWaitDuration())
        {
            return false;
        }
        if (getTotalDuration() != ((RoutingLeg) (obj)).getTotalDuration())
        {
            return false;
        }
        obj1 = getStartScheduleItem();
        obj2 = ((RoutingLeg) (obj)).getStartScheduleItem();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getEndScheduleItem();
        obj2 = ((RoutingLeg) (obj)).getEndScheduleItem();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        if (Double.compare(getDistance(), ((RoutingLeg) (obj)).getDistance()) != 0)
        {
            return false;
        }
        if (getLegSequence() != ((RoutingLeg) (obj)).getLegSequence())
        {
            return false;
        }
        obj1 = getRoute();
        obj2 = ((RoutingLeg) (obj)).getRoute();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getHeadsign();
        obj2 = ((RoutingLeg) (obj)).getHeadsign();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getFromPlacemark();
        obj2 = ((RoutingLeg) (obj)).getFromPlacemark();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getToPlacemark();
        obj2 = ((RoutingLeg) (obj)).getToPlacemark();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getIntermediateStops();
        obj2 = ((RoutingLeg) (obj)).getIntermediateStops();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        if (Double.compare(getPreviousStopLatitude(), ((RoutingLeg) (obj)).getPreviousStopLatitude()) != 0)
        {
            return false;
        }
        if (Double.compare(getPreviousStopLongitude(), ((RoutingLeg) (obj)).getPreviousStopLongitude()) != 0)
        {
            return false;
        }
        obj1 = getStepTitle();
        obj2 = ((RoutingLeg) (obj)).getStepTitle();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getStepSubtitle();
        obj2 = ((RoutingLeg) (obj)).getStepSubtitle();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getStepTimeString();
        obj2 = ((RoutingLeg) (obj)).getStepTimeString();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        if (getTimeBarColor() != ((RoutingLeg) (obj)).getTimeBarColor())
        {
            return false;
        }
        obj1 = getShape();
        obj = ((RoutingLeg) (obj)).getShape();
        return obj1 != null ? !obj1.equals(obj) : obj != null;
    }

    public LatLngBounds getBounds()
    {
        com.google.android.gms.maps.model.LatLngBounds.Builder builder = new com.google.android.gms.maps.model.LatLngBounds.Builder();
        if (fromPlacemark != null)
        {
            builder.include(fromPlacemark.toLatLng());
        }
        if (toPlacemark != null)
        {
            builder.include(toPlacemark.toLatLng());
        }
        return builder.build();
    }

    public double getDistance()
    {
        return distance;
    }

    public long getDuration()
    {
        return duration;
    }

    public ScheduleItem getEndScheduleItem()
    {
        return endScheduleItem;
    }

    public Date getEndTime()
    {
        return endScheduleItem.getStopTime();
    }

    public SimplePlacemark getFromPlacemark()
    {
        return fromPlacemark;
    }

    public String getHeadsign()
    {
        return headsign;
    }

    public List getIntermediateStops()
    {
        return intermediateStops;
    }

    public int getLegSequence()
    {
        return legSequence;
    }

    public LegType getLegType()
    {
        return legType;
    }

    public double getPreviousStopLatitude()
    {
        return previousStopLatitude;
    }

    public double getPreviousStopLongitude()
    {
        return previousStopLongitude;
    }

    public RouteViewModel getRoute()
    {
        return route;
    }

    public String getShape()
    {
        return shape;
    }

    public ScheduleItem getStartScheduleItem()
    {
        return startScheduleItem;
    }

    public Date getStartTime()
    {
        return startScheduleItem.getStopTime();
    }

    public String getStepSubtitle()
    {
        return stepSubtitle;
    }

    public String getStepTimeString()
    {
        return stepTimeString;
    }

    public String getStepTitle()
    {
        return stepTitle;
    }

    public int getTimeBarColor()
    {
        return timeBarColor;
    }

    public SimplePlacemark getToPlacemark()
    {
        return toPlacemark;
    }

    public long getTotalDuration()
    {
        return totalDuration;
    }

    public TransportationMode getTransportationMode()
    {
        return transportationMode;
    }

    public long getWaitDuration()
    {
        return waitDuration;
    }

    public int hashCode()
    {
        Object obj = getTransportationMode();
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int j3;
        int k3;
        int l3;
        int i4;
        int j4;
        int k4;
        int l4;
        int i5;
        long l5;
        if (obj == null)
        {
            i = 0;
        } else
        {
            i = obj.hashCode();
        }
        obj = getLegType();
        if (obj == null)
        {
            j = 0;
        } else
        {
            j = obj.hashCode();
        }
        l5 = getDuration();
        j3 = (int)(l5 >>> 32 ^ l5);
        l5 = getWaitDuration();
        k3 = (int)(l5 >>> 32 ^ l5);
        l5 = getTotalDuration();
        l3 = (int)(l5 >>> 32 ^ l5);
        obj = getStartScheduleItem();
        if (obj == null)
        {
            k = 0;
        } else
        {
            k = obj.hashCode();
        }
        obj = getEndScheduleItem();
        if (obj == null)
        {
            l = 0;
        } else
        {
            l = obj.hashCode();
        }
        l5 = Double.doubleToLongBits(getDistance());
        i4 = (int)(l5 >>> 32 ^ l5);
        j4 = getLegSequence();
        obj = getRoute();
        if (obj == null)
        {
            i1 = 0;
        } else
        {
            i1 = obj.hashCode();
        }
        obj = getHeadsign();
        if (obj == null)
        {
            j1 = 0;
        } else
        {
            j1 = obj.hashCode();
        }
        obj = getFromPlacemark();
        if (obj == null)
        {
            k1 = 0;
        } else
        {
            k1 = obj.hashCode();
        }
        obj = getToPlacemark();
        if (obj == null)
        {
            l1 = 0;
        } else
        {
            l1 = obj.hashCode();
        }
        obj = getIntermediateStops();
        if (obj == null)
        {
            i2 = 0;
        } else
        {
            i2 = obj.hashCode();
        }
        l5 = Double.doubleToLongBits(getPreviousStopLatitude());
        k4 = (int)(l5 >>> 32 ^ l5);
        l5 = Double.doubleToLongBits(getPreviousStopLongitude());
        l4 = (int)(l5 >>> 32 ^ l5);
        obj = getStepTitle();
        if (obj == null)
        {
            j2 = 0;
        } else
        {
            j2 = obj.hashCode();
        }
        obj = getStepSubtitle();
        if (obj == null)
        {
            k2 = 0;
        } else
        {
            k2 = obj.hashCode();
        }
        obj = getStepTimeString();
        if (obj == null)
        {
            l2 = 0;
        } else
        {
            l2 = obj.hashCode();
        }
        i5 = getTimeBarColor();
        obj = getShape();
        if (obj == null)
        {
            i3 = 0;
        } else
        {
            i3 = obj.hashCode();
        }
        return ((((((((((((((((((((i + 31) * 31 + j) * 31 + j3) * 31 + k3) * 31 + l3) * 31 + k) * 31 + l) * 31 + i4) * 31 + j4) * 31 + i1) * 31 + j1) * 31 + k1) * 31 + l1) * 31 + i2) * 31 + k4) * 31 + l4) * 31 + j2) * 31 + k2) * 31 + l2) * 31 + i5) * 31 + i3;
    }

    public void setDistance(double d)
    {
        distance = d;
    }

    public void setDuration(long l)
    {
        duration = l;
    }

    public void setEndScheduleItem(ScheduleItem scheduleitem)
    {
        endScheduleItem = scheduleitem;
    }

    public void setFromPlacemark(SimplePlacemark simpleplacemark)
    {
        fromPlacemark = simpleplacemark;
    }

    public void setHeadsign(String s)
    {
        headsign = s;
    }

    public void setIntermediateStops(List list)
    {
        intermediateStops = list;
    }

    public void setLegSequence(int i)
    {
        legSequence = i;
    }

    public void setLegType(LegType legtype)
    {
        legType = legtype;
    }

    public void setPreviousStopLatitude(double d)
    {
        previousStopLatitude = d;
    }

    public void setPreviousStopLongitude(double d)
    {
        previousStopLongitude = d;
    }

    public void setRoute(RouteViewModel routeviewmodel)
    {
        route = routeviewmodel;
    }

    public void setShape(String s)
    {
        shape = s;
    }

    public void setStartScheduleItem(ScheduleItem scheduleitem)
    {
        startScheduleItem = scheduleitem;
    }

    public void setStepSubtitle(String s)
    {
        stepSubtitle = s;
    }

    public void setStepTimeString(String s)
    {
        stepTimeString = s;
    }

    public void setStepTitle(String s)
    {
        stepTitle = s;
    }

    public void setTimeBarColor(int i)
    {
        timeBarColor = i;
    }

    public void setToPlacemark(SimplePlacemark simpleplacemark)
    {
        toPlacemark = simpleplacemark;
    }

    public void setTotalDuration(long l)
    {
        totalDuration = l;
    }

    public void setTransportationMode(TransportationMode transportationmode)
    {
        transportationMode = transportationmode;
    }

    public void setWaitDuration(long l)
    {
        waitDuration = l;
    }

    public String toString()
    {
        return (new StringBuilder("RoutingLeg(transportationMode=")).append(getTransportationMode()).append(", legType=").append(getLegType()).append(", duration=").append(getDuration()).append(", waitDuration=").append(getWaitDuration()).append(", totalDuration=").append(getTotalDuration()).append(", startScheduleItem=").append(getStartScheduleItem()).append(", endScheduleItem=").append(getEndScheduleItem()).append(", distance=").append(getDistance()).append(", legSequence=").append(getLegSequence()).append(", route=").append(getRoute()).append(", headsign=").append(getHeadsign()).append(", fromPlacemark=").append(getFromPlacemark()).append(", toPlacemark=").append(getToPlacemark()).append(", intermediateStops=").append(getIntermediateStops()).append(", previousStopLatitude=").append(getPreviousStopLatitude()).append(", previousStopLongitude=").append(getPreviousStopLongitude()).append(", stepTitle=").append(getStepTitle()).append(", stepSubtitle=").append(getStepSubtitle()).append(", stepTimeString=").append(getStepTimeString()).append(", timeBarColor=").append(getTimeBarColor()).append(", shape=").append(getShape()).append(")").toString();
    }
}
