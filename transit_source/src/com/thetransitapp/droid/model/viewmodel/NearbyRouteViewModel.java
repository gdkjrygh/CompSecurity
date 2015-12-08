// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.model.viewmodel;

import com.thetransitapp.droid.data.TransitDatabaseHelper;
import com.thetransitapp.droid.model.Itinerary;
import com.thetransitapp.droid.model.Route;
import com.thetransitapp.droid.model.RouteDirection;
import com.thetransitapp.droid.model.ScheduleItem;
import com.thetransitapp.droid.model.ServiceDay;
import com.thetransitapp.droid.model.SimplePlacemark;
import com.thetransitapp.droid.model.Stop;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.thetransitapp.droid.model.viewmodel:
//            RouteViewModel, MergedItinerary, ItineraryDirectionGroup

public class NearbyRouteViewModel extends RouteViewModel
{

    private static final long serialVersionUID = 0x2c606ae30e958fc5L;
    private com.thetransitapp.droid.model.Itinerary.DirectionType currentDirection;
    private int currentIndex;
    private transient TransitDatabaseHelper databaseHelper;
    private Map directionGroups;
    private SimplePlacemark placemark;

    public NearbyRouteViewModel()
    {
    }

    public NearbyRouteViewModel(Route route, SimplePlacemark simpleplacemark, List list, TransitDatabaseHelper transitdatabasehelper)
    {
        super(route);
        databaseHelper = transitdatabasehelper;
        currentIndex = 0;
        placemark = simpleplacemark;
        directionGroups = new HashMap();
        groupItineraries(route.getItineraries(), list);
        if (!directionGroups.keySet().isEmpty())
        {
            currentDirection = (com.thetransitapp.droid.model.Itinerary.DirectionType)directionGroups.keySet().iterator().next();
            route = transitdatabasehelper.getSavedDirection(route, simpleplacemark.toLocation());
            if (route != null && directionGroups.keySet().contains(route.getDirection()))
            {
                currentDirection = route.getDirection();
                if (getItinerary(currentDirection, route.getDirectionIndex()) != null)
                {
                    currentIndex = route.getDirectionIndex();
                } else
                {
                    currentIndex = 0;
                }
            }
            if (!getCurrentItinerary().isActive() && isActive())
            {
                getNextActiveItinerary();
            }
        }
    }

    public NearbyRouteViewModel(Route route, SimplePlacemark simpleplacemark, boolean flag, TransitDatabaseHelper transitdatabasehelper)
    {
        List list;
        if (flag)
        {
            list = ServiceDay.getNextWeekServiceDates();
        } else
        {
            list = ServiceDay.getActiveServiceDates();
        }
        this(route, simpleplacemark, list, transitdatabasehelper);
    }

    private List findItinerariesForDirection(List list, com.thetransitapp.droid.model.Itinerary.DirectionType directiontype)
    {
        ArrayList arraylist = new ArrayList();
        list = list.iterator();
        do
        {
            Itinerary itinerary;
            do
            {
                if (!list.hasNext())
                {
                    return arraylist;
                }
                itinerary = (Itinerary)list.next();
            } while (itinerary.getDirectionType() != directiontype);
            arraylist.add(itinerary);
        } while (true);
    }

    private final void groupItineraries(List list, List list1)
    {
        com.thetransitapp.droid.model.Itinerary.DirectionType adirectiontype[] = com.thetransitapp.droid.model.Itinerary.DirectionType.values();
        int j = adirectiontype.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                return;
            }
            com.thetransitapp.droid.model.Itinerary.DirectionType directiontype = adirectiontype[i];
            Object obj = findItinerariesForDirection(list, directiontype);
            if (!((List) (obj)).isEmpty())
            {
                obj = mergeItineraries(((List) (obj)), directiontype, list1);
                if (obj != null)
                {
                    directionGroups.put(directiontype, obj);
                }
            }
            i++;
        } while (true);
    }

    private ItineraryDirectionGroup mergeItineraries(List list, com.thetransitapp.droid.model.Itinerary.DirectionType directiontype, List list1)
    {
        HashMap hashmap;
        hashmap = new HashMap();
        list = list.iterator();
_L6:
        if (list.hasNext()) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        list = null;
        obj = new ArrayList();
        obj1 = hashmap.keySet().iterator();
_L4:
        String s;
        if (!((Iterator) (obj1)).hasNext())
        {
            if (((List) (obj)).isEmpty())
            {
                if (list == null)
                {
                    break; /* Loop/switch isn't completed */
                }
                ((List) (obj)).add(list);
            }
            list = new ItineraryDirectionGroup();
            list.setItineraries(((List) (obj)));
            list.setDirectionType(directiontype);
            return list;
        }
        list1 = (MergedItinerary)hashmap.get((String)((Iterator) (obj1)).next());
        list1.updateServiceItem();
        if (list1.isActive())
        {
            ((List) (obj)).add(list1);
        } else
        if (list == null && !list1.isTerminus())
        {
            list = list1;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        obj = (Itinerary)list.next();
        obj1 = ((Itinerary) (obj)).getClosestStop(placemark);
        s = (new StringBuilder(String.valueOf(((Itinerary) (obj)).getGroupingKey(((Stop) (obj1)))))).append(((Stop) (obj1)).getId()).toString();
        if (!hashmap.containsKey(s))
        {
            hashmap.put(s, new MergedItinerary(this, ((Stop) (obj1)), list1));
        }
        ((MergedItinerary)hashmap.get(s)).getItineraries().add(obj);
        continue; /* Loop/switch isn't completed */
        if (true) goto _L4; else goto _L3
_L3:
        return null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final MergedItinerary getCurrentItinerary()
    {
        return getItinerary(currentDirection, currentIndex);
    }

    public Map getDirectionGroups()
    {
        return directionGroups;
    }

    public double getDistance()
    {
        double d = 1.7976931348623157E+308D;
        Iterator iterator = directionGroups.values().iterator();
        do
        {
            double d1;
            do
            {
                if (!iterator.hasNext())
                {
                    return d;
                }
                d1 = ((ItineraryDirectionGroup)iterator.next()).getDistance(placemark, isActive());
            } while (d1 >= d);
            d = d1;
        } while (true);
    }

    public MergedItinerary getItinerary(com.thetransitapp.droid.model.Itinerary.DirectionType directiontype, int i)
    {
        if (directionGroups == null)
        {
            return null;
        }
        directiontype = ((ItineraryDirectionGroup)directionGroups.get(directiontype)).getItineraries();
        if (directiontype == null || directiontype.size() <= i)
        {
            return null;
        } else
        {
            return (MergedItinerary)directiontype.get(i);
        }
    }

    public boolean getNextActiveItinerary()
    {
        return getNextItinerary(false, false);
    }

    public boolean getNextItinerary(boolean flag)
    {
        return getNextItinerary(flag, false);
    }

    public boolean getNextItinerary(boolean flag, boolean flag1)
    {
        Object obj = currentDirection;
        int i = currentIndex;
        Iterator iterator = directionGroups.keySet().iterator();
        boolean flag3 = false;
        int k = i;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_278;
        }
        Object obj2;
        do
        {
            com.thetransitapp.droid.model.Itinerary.DirectionType directiontype = (com.thetransitapp.droid.model.Itinerary.DirectionType)iterator.next();
            obj2 = directiontype;
            k = i;
            obj = iterator;
            if (directiontype == currentDirection)
            {
                break;
            }
            if (iterator.hasNext())
            {
                continue;
            }
            obj = iterator;
            k = i;
            obj2 = directiontype;
            break;
        } while (true);
        do
        {
            k++;
            Object obj1 = obj2;
            int j = k;
            Object obj3 = obj;
            if (k >= ((ItineraryDirectionGroup)directionGroups.get(obj2)).getItineraries().size())
            {
                j = 0;
                obj1 = obj;
                if (!((Iterator) (obj)).hasNext())
                {
                    obj1 = directionGroups.keySet().iterator();
                }
                obj = (com.thetransitapp.droid.model.Itinerary.DirectionType)((Iterator) (obj1)).next();
                obj3 = obj1;
                obj1 = obj;
            }
            boolean flag2;
            if (obj1 == currentDirection && j == currentIndex)
            {
                flag2 = false;
            } else
            {
                flag2 = true;
            }
            flag3 = flag2;
            obj = obj1;
            k = j;
            if (flag)
            {
                break MISSING_BLOCK_LABEL_278;
            }
            flag3 = flag2;
            obj = obj1;
            k = j;
            if (getItinerary(((com.thetransitapp.droid.model.Itinerary.DirectionType) (obj1)), j).isActive())
            {
                break MISSING_BLOCK_LABEL_278;
            }
            obj2 = obj1;
            k = j;
            obj = obj3;
        } while (flag2);
        k = j;
        obj = obj1;
        flag3 = flag2;
        if (flag3)
        {
            currentDirection = ((com.thetransitapp.droid.model.Itinerary.DirectionType) (obj));
            currentIndex = k;
            if (flag1)
            {
                obj = new RouteDirection();
                ((RouteDirection) (obj)).setDirection(currentDirection);
                ((RouteDirection) (obj)).setDirectionIndex(currentIndex);
                databaseHelper.saveDirection(super.getRoute(), ((RouteDirection) (obj)), placemark.toLocation());
            }
        }
        return flag3;
    }

    public SimplePlacemark getPlacemark()
    {
        return placemark;
    }

    public double getPoint()
    {
        double d1 = getDistance();
        double d = d1;
        if (getRoute().isFavorite())
        {
            d = d1 * 0.050000000000000003D;
        }
        d1 = d;
        if (getRoute().getType().ordinal() < 3)
        {
            d1 = d * 0.5D;
        }
        ScheduleItem scheduleitem = getCurrentItinerary().getCurrentScheduleItem();
        d = d1;
        if (scheduleitem != null)
        {
            int i = scheduleitem.getMinutesRemaining();
            d = d1;
            if (i > 0)
            {
                d = d1;
                if (i < 90)
                {
                    d = d1 + (double)i * 0.59999999999999998D;
                }
            }
        }
        return d;
    }

    public final boolean isActive()
    {
        Iterator iterator = directionGroups.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return false;
            }
        } while (!((ItineraryDirectionGroup)iterator.next()).isActive());
        return true;
    }
}
