// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.model.viewmodel;

import android.widget.ListView;
import com.thetransitapp.droid.model.Feed;
import com.thetransitapp.droid.model.Itinerary;
import com.thetransitapp.droid.model.Schedule;
import com.thetransitapp.droid.model.ScheduleItem;
import com.thetransitapp.droid.model.ServiceDay;
import com.thetransitapp.droid.model.Stop;
import com.thetransitapp.droid.model.realtime.BaseRealTimeDataSource;
import com.thetransitapp.droid.model.realtime.FeedRealTimeDataSource;
import com.thetransitapp.droid.widget.ListViewItem;
import com.thetransitapp.droid.widget.ScheduleAdapter;
import com.thetransitapp.droid.widget.route.RouteAdapter;
import com.thetransitapp.droid.widget.route.RouteItem;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.thetransitapp.droid.model.viewmodel:
//            NearbyRouteViewModel

public class MergedItinerary
    implements Serializable
{

    private static final long SCHEDULE_ITEM_END_INTERVAL = 0x5265c0L;
    private static final long SCHEDULE_ITEM_START_INTERVAL = 0xfffffffffff24460L;
    private static final long serialVersionUID = 0x94c4154b9a6e42aL;
    private Stop closestStop;
    private ScheduleItem currentScheduleItem;
    private List itineraries;
    private List ongoingScheduleItems;
    private String placeholderHeadsign;
    private Date predictionsFetchDate;
    private NearbyRouteViewModel route;
    private List scheduleItems;
    private List serviceDates;

    public MergedItinerary(NearbyRouteViewModel nearbyrouteviewmodel, Stop stop, List list)
    {
        route = nearbyrouteviewmodel;
        closestStop = stop;
        serviceDates = list;
        itineraries = new ArrayList();
    }

    public boolean canEqual(Object obj)
    {
        return obj instanceof MergedItinerary;
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof MergedItinerary))
        {
            return false;
        }
        obj = (MergedItinerary)obj;
        if (!((MergedItinerary) (obj)).canEqual(this))
        {
            return false;
        }
        Object obj1 = getRoute();
        Object obj2 = ((MergedItinerary) (obj)).getRoute();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getClosestStop();
        obj2 = ((MergedItinerary) (obj)).getClosestStop();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getItineraries();
        obj2 = ((MergedItinerary) (obj)).getItineraries();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getServiceDates();
        obj2 = ((MergedItinerary) (obj)).getServiceDates();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getScheduleItems();
        obj2 = ((MergedItinerary) (obj)).getScheduleItems();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getOngoingScheduleItems();
        obj2 = ((MergedItinerary) (obj)).getOngoingScheduleItems();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getCurrentScheduleItem();
        obj2 = ((MergedItinerary) (obj)).getCurrentScheduleItem();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getPlaceholderHeadsign();
        obj2 = ((MergedItinerary) (obj)).getPlaceholderHeadsign();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getPredictionsFetchDate();
        obj = ((MergedItinerary) (obj)).getPredictionsFetchDate();
        return obj1 != null ? !obj1.equals(obj) : obj != null;
    }

    public String getBranch()
    {
        return ((Itinerary)itineraries.get(0)).getBranch();
    }

    public Stop getClosestStop()
    {
        return closestStop;
    }

    public String getCurrentHeadsign()
    {
        if (getCurrentScheduleItem() != null)
        {
            return getCurrentScheduleItem().getHeadsign();
        } else
        {
            return placeholderHeadsign;
        }
    }

    public ScheduleItem getCurrentScheduleItem()
    {
        if (currentScheduleItem != null && !currentScheduleItem.isPastItem()) goto _L2; else goto _L1
_L1:
        Iterator iterator = ongoingScheduleItems.iterator();
_L4:
        if (iterator.hasNext()) goto _L3; else goto _L2
_L2:
        return currentScheduleItem;
_L3:
        ScheduleItem scheduleitem;
        scheduleitem = (ScheduleItem)iterator.next();
        currentScheduleItem = scheduleitem;
        placeholderHeadsign = currentScheduleItem.getHeadsign();
        if (scheduleitem.isPastItem()) goto _L4; else goto _L2
    }

    public List getItineraries()
    {
        return itineraries;
    }

    public List getOngoingScheduleItems()
    {
        return ongoingScheduleItems;
    }

    public String getPlaceholderHeadsign()
    {
        return placeholderHeadsign;
    }

    public Date getPredictionsFetchDate()
    {
        return predictionsFetchDate;
    }

    public BaseRealTimeDataSource getRealTimeDataSource()
    {
        Object obj = route.getFeed();
        if (obj != null)
        {
            obj = ((Feed) (obj)).getRealTimeDataSource();
            if (obj != null)
            {
                return ((FeedRealTimeDataSource) (obj)).dataSourceForRoute(route);
            }
        }
        return null;
    }

    public String getRealTimeRouteId()
    {
        return ((Itinerary)itineraries.get(0)).getRealTimeRouteID();
    }

    public String getRealTimeStopId()
    {
        return closestStop.getRealTimeId();
    }

    public NearbyRouteViewModel getRoute()
    {
        return route;
    }

    public List getScheduleItems()
    {
        return scheduleItems;
    }

    public List getScheduleItems(ServiceDay serviceday)
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
            } while (!scheduleitem.getServiceDay().equals(serviceday) || scheduleitem.isCancelled());
            arraylist.add(scheduleitem);
        } while (true);
    }

    public List getServiceDates()
    {
        return serviceDates;
    }

    public int hashCode()
    {
        int i2 = 0;
        Object obj = getRoute();
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        if (obj == null)
        {
            i = 0;
        } else
        {
            i = obj.hashCode();
        }
        obj = getClosestStop();
        if (obj == null)
        {
            j = 0;
        } else
        {
            j = obj.hashCode();
        }
        obj = getItineraries();
        if (obj == null)
        {
            k = 0;
        } else
        {
            k = obj.hashCode();
        }
        obj = getServiceDates();
        if (obj == null)
        {
            l = 0;
        } else
        {
            l = obj.hashCode();
        }
        obj = getScheduleItems();
        if (obj == null)
        {
            i1 = 0;
        } else
        {
            i1 = obj.hashCode();
        }
        obj = getOngoingScheduleItems();
        if (obj == null)
        {
            j1 = 0;
        } else
        {
            j1 = obj.hashCode();
        }
        obj = getCurrentScheduleItem();
        if (obj == null)
        {
            k1 = 0;
        } else
        {
            k1 = obj.hashCode();
        }
        obj = getPlaceholderHeadsign();
        if (obj == null)
        {
            l1 = 0;
        } else
        {
            l1 = obj.hashCode();
        }
        obj = getPredictionsFetchDate();
        if (obj != null)
        {
            i2 = obj.hashCode();
        }
        return ((((((((i + 31) * 31 + j) * 31 + k) * 31 + l) * 31 + i1) * 31 + j1) * 31 + k1) * 31 + l1) * 31 + i2;
    }

    public boolean isActive()
    {
        return getCurrentScheduleItem() != null;
    }

    public boolean isTerminus()
    {
        Iterator iterator = scheduleItems.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return true;
            }
        } while (((ScheduleItem)iterator.next()).isPickupCancelled());
        return false;
    }

    public void loadOngoingScheduleItems()
    {
        Date date = new Date(System.currentTimeMillis() - 0xdbba0L);
        Date date1 = new Date(System.currentTimeMillis() + 0x5265c0L);
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        Iterator iterator = scheduleItems.iterator();
        do
        {
            ScheduleItem scheduleitem;
            do
            {
                do
                {
                    if (!iterator.hasNext())
                    {
                        if (arraylist1.size() < arraylist.size())
                        {
                            arraylist.removeAll(arraylist1);
                        }
                        if (scheduleItems.size() > 0)
                        {
                            placeholderHeadsign = ((ScheduleItem)scheduleItems.get(0)).getHeadsign();
                        }
                        ongoingScheduleItems = arraylist;
                        return;
                    }
                    scheduleitem = (ScheduleItem)iterator.next();
                } while (scheduleitem.isCancelled() || scheduleitem.isPickupCancelled() || (scheduleitem.getStopTime() == null || !scheduleitem.getStopTime().after(date) || !scheduleitem.getStopTime().before(date1)) && (!scheduleitem.isFrequency() || !scheduleitem.getFrequencyStartTime().before(date1) || !scheduleitem.getFrequencyEndTime().after(date)));
                arraylist.add(scheduleitem);
            } while (!scheduleitem.isFrequency());
            arraylist1.add(scheduleitem);
        } while (true);
    }

    public void resortScheduleItems()
    {
        Collections.sort(scheduleItems);
    }

    public void setClosestStop(Stop stop)
    {
        closestStop = stop;
    }

    public void setCurrentScheduleItem(ScheduleItem scheduleitem)
    {
        currentScheduleItem = scheduleitem;
    }

    public void setItineraries(List list)
    {
        itineraries = list;
    }

    public void setOngoingScheduleItems(List list)
    {
        ongoingScheduleItems = list;
    }

    public void setPlaceholderHeadsign(String s)
    {
        placeholderHeadsign = s;
    }

    public void setPredictionsFetchDate(Date date)
    {
        predictionsFetchDate = date;
    }

    public void setRoute(NearbyRouteViewModel nearbyrouteviewmodel)
    {
        route = nearbyrouteviewmodel;
    }

    public void setScheduleItems(List list)
    {
        scheduleItems = list;
    }

    public void setServiceDates(List list)
    {
        serviceDates = list;
    }

    public String toString()
    {
        return (new StringBuilder("MergedItinerary(route=")).append(getRoute()).append(", closestStop=").append(getClosestStop()).append(", itineraries=").append(getItineraries()).append(", serviceDates=").append(getServiceDates()).append(", scheduleItems=").append(getScheduleItems()).append(", ongoingScheduleItems=").append(getOngoingScheduleItems()).append(", currentScheduleItem=").append(getCurrentScheduleItem()).append(", placeholderHeadsign=").append(getPlaceholderHeadsign()).append(", predictionsFetchDate=").append(getPredictionsFetchDate()).append(")").toString();
    }

    public void updateRealTimeDataOnList(final ListView listView)
    {
        BaseRealTimeDataSource baserealtimedatasource = getRealTimeDataSource();
        if (baserealtimedatasource != null && baserealtimedatasource.shouldFetchPredictionsForItinerary(this))
        {
            baserealtimedatasource.getPredictionForItinerary(listView.getContext(), this, new com.thetransitapp.droid.model.realtime.BaseRealTimeDataSource.RealTimeCallback() {

                final MergedItinerary this$0;
                private final ListView val$listView;

                public void didAssignRealTime()
                {
                    currentScheduleItem = null;
                    loadOngoingScheduleItems();
                    ScheduleAdapter scheduleadapter = (ScheduleAdapter)listView.getAdapter();
                    boolean flag = false;
                    Object obj = new ArrayList();
                    int i = 0;
                    do
                    {
label0:
                        {
                            if (i >= scheduleadapter.getCount())
                            {
                                if (flag)
                                {
                                    ListViewItem listviewitem;
                                    boolean flag1;
                                    for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); scheduleadapter.remove((ListViewItem)((Iterator) (obj)).next()))
                                    {
                                        break label0;
                                    }

                                }
                                scheduleadapter.notifyDataSetChanged();
                                return;
                            }
                            listviewitem = (ListViewItem)scheduleadapter.getItem(i);
                            flag1 = flag;
                            if (listviewitem.hasValue())
                            {
                                if (((ScheduleItem)listviewitem.getValue()).getRealStopTime() == null)
                                {
                                    flag1 = flag;
                                    if (!((ScheduleItem)listviewitem.getValue()).isPastItem())
                                    {
                                        flag1 = flag;
                                        if (!flag)
                                        {
                                            ((List) (obj)).add(listviewitem);
                                            flag1 = flag;
                                        }
                                    }
                                } else
                                {
                                    flag1 = true;
                                }
                            }
                            i++;
                            flag = flag1;
                        }
                    } while (true);
                }

            
            {
                this$0 = MergedItinerary.this;
                listView = listview;
                super();
            }
            });
        }
    }

    public void updateRealTimeDataOnList(final ListView listView, final RouteItem item)
    {
        BaseRealTimeDataSource baserealtimedatasource = getRealTimeDataSource();
        if (baserealtimedatasource != null && baserealtimedatasource.shouldFetchPredictionsForItinerary(this))
        {
            baserealtimedatasource.getPredictionForItinerary(listView.getContext(), this, new com.thetransitapp.droid.model.realtime.BaseRealTimeDataSource.RealTimeCallback() {

                final MergedItinerary this$0;
                private final RouteItem val$item;
                private final ListView val$listView;

                public void didAssignRealTime()
                {
                    currentScheduleItem = null;
                    loadOngoingScheduleItems();
                    int i = ((RouteAdapter)listView.getAdapter()).getPosition(item);
                    if (i >= listView.getFirstVisiblePosition() && i <= listView.getLastVisiblePosition())
                    {
                        item.refreshView();
                    }
                }

            
            {
                this$0 = MergedItinerary.this;
                listView = listview;
                item = routeitem;
                super();
            }
            });
        }
    }

    public void updateServiceItem()
    {
        scheduleItems = new ArrayList();
        Iterator iterator = serviceDates.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                resortScheduleItems();
                loadOngoingScheduleItems();
                return;
            }
            ServiceDay serviceday = (ServiceDay)iterator.next();
            Iterator iterator1 = itineraries.iterator();
            while (iterator1.hasNext()) 
            {
                Schedule schedule = ((Itinerary)iterator1.next()).getSchedule(closestStop, serviceday);
                scheduleItems.addAll(schedule.getScheduleItems());
            }
        } while (true);
    }

}
