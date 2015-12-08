// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.model.viewmodel;

import com.thetransitapp.droid.model.SimplePlacemark;
import com.thetransitapp.droid.model.Stop;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.thetransitapp.droid.model.viewmodel:
//            MergedItinerary

public class ItineraryDirectionGroup
    implements Serializable
{

    private static final long serialVersionUID = 0xe3f46f8e56254e59L;
    private com.thetransitapp.droid.model.Itinerary.DirectionType directionType;
    private List itineraries;

    public ItineraryDirectionGroup()
    {
    }

    public boolean canEqual(Object obj)
    {
        return obj instanceof ItineraryDirectionGroup;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ItineraryDirectionGroup))
            {
                return false;
            }
            obj = (ItineraryDirectionGroup)obj;
            if (!((ItineraryDirectionGroup) (obj)).canEqual(this))
            {
                return false;
            }
            Object obj1 = getItineraries();
            List list = ((ItineraryDirectionGroup) (obj)).getItineraries();
            if (obj1 != null ? !obj1.equals(list) : list != null)
            {
                return false;
            }
            obj1 = getDirectionType();
            obj = ((ItineraryDirectionGroup) (obj)).getDirectionType();
            if (obj1 != null ? !obj1.equals(obj) : obj != null)
            {
                return false;
            }
        }
        return true;
    }

    public com.thetransitapp.droid.model.Itinerary.DirectionType getDirectionType()
    {
        return directionType;
    }

    public double getDistance(SimplePlacemark simpleplacemark, boolean flag)
    {
        double d = 1.7976931348623157E+308D;
        Iterator iterator = itineraries.iterator();
        do
        {
            double d1;
            do
            {
                MergedItinerary mergeditinerary;
                do
                {
                    if (!iterator.hasNext())
                    {
                        return d;
                    }
                    mergeditinerary = (MergedItinerary)iterator.next();
                } while (!mergeditinerary.isActive() && flag);
                d1 = mergeditinerary.getClosestStop().getDistance(simpleplacemark);
            } while (d1 >= d);
            d = d1;
        } while (true);
    }

    public List getItineraries()
    {
        return itineraries;
    }

    public int hashCode()
    {
        int j = 0;
        Object obj = getItineraries();
        int i;
        if (obj == null)
        {
            i = 0;
        } else
        {
            i = obj.hashCode();
        }
        obj = getDirectionType();
        if (obj != null)
        {
            j = obj.hashCode();
        }
        return (i + 31) * 31 + j;
    }

    public boolean isActive()
    {
        Iterator iterator = itineraries.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return false;
            }
        } while (!((MergedItinerary)iterator.next()).isActive());
        return true;
    }

    public void setDirectionType(com.thetransitapp.droid.model.Itinerary.DirectionType directiontype)
    {
        directionType = directiontype;
    }

    public void setItineraries(List list)
    {
        itineraries = list;
    }

    public String toString()
    {
        return (new StringBuilder("ItineraryDirectionGroup(itineraries=")).append(getItineraries()).append(", directionType=").append(getDirectionType()).append(")").toString();
    }
}
