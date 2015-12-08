// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.thetransitapp.droid.model:
//            Itinerary

public class Route
    implements Serializable
{
    public static final class RouteType extends Enum
    {

        public static final RouteType BUS;
        public static final RouteType CABLE_CAR;
        private static final RouteType ENUM$VALUES[];
        public static final RouteType FERRY;
        public static final RouteType FUNICULAR;
        public static final RouteType GONDOLA;
        public static final RouteType SUBWAY;
        public static final RouteType TRAIN;
        public static final RouteType TRAMWAY;

        public static RouteType valueOf(String s)
        {
            return (RouteType)Enum.valueOf(com/thetransitapp/droid/model/Route$RouteType, s);
        }

        public static RouteType[] values()
        {
            RouteType aroutetype[] = ENUM$VALUES;
            int i = aroutetype.length;
            RouteType aroutetype1[] = new RouteType[i];
            System.arraycopy(aroutetype, 0, aroutetype1, 0, i);
            return aroutetype1;
        }

        static 
        {
            TRAMWAY = new RouteType("TRAMWAY", 0);
            SUBWAY = new RouteType("SUBWAY", 1);
            TRAIN = new RouteType("TRAIN", 2);
            BUS = new RouteType("BUS", 3);
            FERRY = new RouteType("FERRY", 4);
            CABLE_CAR = new RouteType("CABLE_CAR", 5);
            GONDOLA = new RouteType("GONDOLA", 6);
            FUNICULAR = new RouteType("FUNICULAR", 7);
            ENUM$VALUES = (new RouteType[] {
                TRAMWAY, SUBWAY, TRAIN, BUS, FERRY, CABLE_CAR, GONDOLA, FUNICULAR
            });
        }

        private RouteType(String s, int i)
        {
            super(s, i);
        }
    }


    private static final long serialVersionUID = 0x9687416fb5ab2febL;
    private int color;
    private boolean favorite;
    private String feedId;
    private String id;
    private List itineraries;
    private String longName;
    private String shortName;
    private int textColor;
    private RouteType type;

    public Route()
    {
        itineraries = new ArrayList();
    }

    public void addItinerary(Itinerary itinerary)
    {
        itinerary.setRoute(this);
        Iterator iterator = itineraries.iterator();
        Itinerary itinerary1;
        do
        {
            if (!iterator.hasNext())
            {
                itineraries.add(itinerary);
                return;
            }
            itinerary1 = (Itinerary)iterator.next();
        } while (!itinerary1.equals(itinerary));
        itinerary1.merge(itinerary);
    }

    public boolean canEqual(Object obj)
    {
        return obj instanceof Route;
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof Route))
        {
            return false;
        }
        obj = (Route)obj;
        if (!((Route) (obj)).canEqual(this))
        {
            return false;
        }
        Object obj1 = getId();
        Object obj2 = ((Route) (obj)).getId();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getFeedId();
        obj2 = ((Route) (obj)).getFeedId();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        if (getColor() != ((Route) (obj)).getColor())
        {
            return false;
        }
        if (getTextColor() != ((Route) (obj)).getTextColor())
        {
            return false;
        }
        obj1 = getShortName();
        obj2 = ((Route) (obj)).getShortName();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getLongName();
        obj2 = ((Route) (obj)).getLongName();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getType();
        obj2 = ((Route) (obj)).getType();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        if (isFavorite() != ((Route) (obj)).isFavorite())
        {
            return false;
        }
        obj1 = getItineraries();
        obj = ((Route) (obj)).getItineraries();
        return obj1 != null ? !obj1.equals(obj) : obj != null;
    }

    public int getColor()
    {
        return color;
    }

    public String getFeedId()
    {
        return feedId;
    }

    public String getId()
    {
        return id;
    }

    public List getItineraries()
    {
        return itineraries;
    }

    public Itinerary getItinerary(String s)
    {
        Iterator iterator = itineraries.iterator();
        Itinerary itinerary;
        do
        {
            if (!iterator.hasNext())
            {
                return null;
            }
            itinerary = (Itinerary)iterator.next();
        } while (!itinerary.getId().equals(s));
        return itinerary;
    }

    public String getLongName()
    {
        return longName;
    }

    public String getShortName()
    {
        return shortName;
    }

    public int getTextColor()
    {
        return textColor;
    }

    public RouteType getType()
    {
        return type;
    }

    public int hashCode()
    {
        int j1 = 0;
        Object obj = getId();
        int i;
        int j;
        int k;
        int l;
        int i1;
        char c;
        int k1;
        int l1;
        if (obj == null)
        {
            i = 0;
        } else
        {
            i = obj.hashCode();
        }
        obj = getFeedId();
        if (obj == null)
        {
            j = 0;
        } else
        {
            j = obj.hashCode();
        }
        k1 = getColor();
        l1 = getTextColor();
        obj = getShortName();
        if (obj == null)
        {
            k = 0;
        } else
        {
            k = obj.hashCode();
        }
        obj = getLongName();
        if (obj == null)
        {
            l = 0;
        } else
        {
            l = obj.hashCode();
        }
        obj = getType();
        if (obj == null)
        {
            i1 = 0;
        } else
        {
            i1 = obj.hashCode();
        }
        if (isFavorite())
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        obj = getItineraries();
        if (obj != null)
        {
            j1 = obj.hashCode();
        }
        return ((((((((i + 31) * 31 + j) * 31 + k1) * 31 + l1) * 31 + k) * 31 + l) * 31 + i1) * 31 + c) * 31 + j1;
    }

    public boolean isFavorite()
    {
        return favorite;
    }

    public void setColor(int i)
    {
        color = i;
    }

    public void setFavorite(boolean flag)
    {
        favorite = flag;
    }

    public void setFeedId(String s)
    {
        feedId = s;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setItineraries(List list)
    {
        itineraries = list;
    }

    public void setLongName(String s)
    {
        longName = s;
    }

    public void setShortName(String s)
    {
        shortName = s;
    }

    public void setTextColor(int i)
    {
        textColor = i;
    }

    public void setType(RouteType routetype)
    {
        type = routetype;
    }

    public String toString()
    {
        return (new StringBuilder("Route(id=")).append(getId()).append(", feedId=").append(getFeedId()).append(", color=").append(getColor()).append(", textColor=").append(getTextColor()).append(", shortName=").append(getShortName()).append(", longName=").append(getLongName()).append(", type=").append(getType()).append(", favorite=").append(isFavorite()).append(", itineraries=").append(getItineraries()).append(")").toString();
    }
}
