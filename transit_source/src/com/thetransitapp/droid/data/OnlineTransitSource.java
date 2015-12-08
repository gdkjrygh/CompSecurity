// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.data;

import android.location.Location;
import android.text.format.DateFormat;
import com.thetransitapp.droid.model.BundleResponse;
import com.thetransitapp.droid.model.DetailRequest;
import com.thetransitapp.droid.model.Itinerary;
import com.thetransitapp.droid.model.NearbyRoutesRequest;
import com.thetransitapp.droid.model.Route;
import com.thetransitapp.droid.model.Schedule;
import com.thetransitapp.droid.model.ScheduleItem;
import com.thetransitapp.droid.model.ScheduleRequest;
import com.thetransitapp.droid.model.ServiceDay;
import com.thetransitapp.droid.model.SimplePlacemark;
import com.thetransitapp.droid.model.Stop;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.thetransitapp.droid.data:
//            BaseOnlineSource, TransitSource, TransitSourceFactory, TransitDatabaseHelper

public class OnlineTransitSource extends BaseOnlineSource
    implements TransitSource
{

    private TransitDatabaseHelper database;

    public OnlineTransitSource()
    {
        super(true);
    }

    private List fetchSchedule(ScheduleRequest schedulerequest)
        throws Exception
    {
        Route route;
        Stop stop;
        Object obj;
        Object obj1;
        route = schedulerequest.getRoute();
        stop = schedulerequest.getStop();
        schedulerequest = schedulerequest.getServiceDay();
        obj = new StringBuilder(super.getBaseURL(false, null));
        ((StringBuilder) (obj)).append("/schedule?route_id=");
        ((StringBuilder) (obj)).append(route.getId());
        ((StringBuilder) (obj)).append("&feed_id=");
        ((StringBuilder) (obj)).append(route.getFeedId());
        ((StringBuilder) (obj)).append("&stop_id=");
        ((StringBuilder) (obj)).append(stop.getId());
        ((StringBuilder) (obj)).append("&date=");
        ((StringBuilder) (obj)).append(DateFormat.format("yyyy-MM-dd", schedulerequest.getDate()));
        obj1 = super.execute(((StringBuilder) (obj)).toString());
        obj = new ArrayList();
        if (!((JSONObject) (obj1)).has("itineraries")) goto _L2; else goto _L1
_L1:
        int i;
        obj1 = ((JSONObject) (obj1)).getJSONArray("itineraries");
        i = 0;
_L5:
        if (i < ((JSONArray) (obj1)).length()) goto _L3; else goto _L2
_L2:
        return ((List) (obj));
_L3:
        Itinerary itinerary = TransitSourceFactory.createItinerary(((JSONArray) (obj1)).getJSONObject(i), stop, true);
        Schedule schedule = itinerary.getSchedule(stop, schedulerequest);
        route.addItinerary(itinerary);
        ((List) (obj)).add(schedule);
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private Itinerary findItinerary(List list, String s)
    {
        list = list.iterator();
        Itinerary itinerary;
        do
        {
            if (!list.hasNext())
            {
                return null;
            }
            itinerary = (Itinerary)list.next();
        } while (!itinerary.getItineraryId().equals(s));
        return itinerary;
    }

    private List getSchedules(List list, Stop stop, ServiceDay serviceday)
    {
        ArrayList arraylist = new ArrayList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                return arraylist;
            }
            arraylist.add(((Itinerary)list.next()).getSchedule(stop, serviceday));
        } while (true);
    }

    private String implodeId(List list)
    {
        StringBuilder stringbuilder = new StringBuilder();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                return stringbuilder.toString();
            }
            Itinerary itinerary = (Itinerary)list.next();
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append(",");
            }
            stringbuilder.append(itinerary.getItineraryId());
        } while (true);
    }

    private void parseStops(JSONArray jsonarray, Itinerary itinerary, ServiceDay serviceday)
        throws JSONException
    {
        ArrayList arraylist = new ArrayList(jsonarray.length());
        int i = 0;
        do
        {
            if (i >= jsonarray.length())
            {
                itinerary.setStops(arraylist);
                return;
            }
            JSONObject jsonobject = jsonarray.getJSONObject(i);
            Stop stop = TransitSourceFactory.createStop(jsonobject, itinerary, false);
            arraylist.add(stop);
            itinerary.addSchedule(TransitSourceFactory.createSchedule(jsonobject.getJSONArray("schedule_items"), itinerary, stop, false), stop, serviceday);
            i++;
        } while (true);
    }

    private boolean shouldLoad(List list)
    {
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                return true;
            }
        } while (!((Schedule)list.next()).isComplete());
        return false;
    }

    public List fullSchedules(ScheduleRequest schedulerequest)
        throws Exception
    {
        List list1 = getSchedules(schedulerequest.getRoute().getItineraries(), schedulerequest.getStop(), schedulerequest.getServiceDay());
        List list = list1;
        if (shouldLoad(list1))
        {
            list = fetchSchedule(schedulerequest);
        }
        return list;
    }

    public String headsign(Itinerary itinerary, Stop stop)
    {
        return null;
    }

    public BundleResponse loadBundle(Location location, boolean flag)
        throws Exception
    {
        Object obj;
        obj = new StringBuilder(super.getBaseURL(false, null));
        ((StringBuilder) (obj)).append("/bundles?");
        if (location != null)
        {
            ((StringBuilder) (obj)).append("lat=");
            ((StringBuilder) (obj)).append(location.getLatitude());
            ((StringBuilder) (obj)).append("&lon=");
            ((StringBuilder) (obj)).append(location.getLongitude());
            ((StringBuilder) (obj)).append("&");
        }
        if (flag || location == null)
        {
            ((StringBuilder) (obj)).append("all=1");
        }
        obj = super.execute(((StringBuilder) (obj)).toString());
        location = new BundleResponse();
        if (!((JSONObject) (obj)).has("bundles")) goto _L2; else goto _L1
_L1:
        Object obj1;
        int i;
        obj1 = ((JSONObject) (obj)).getJSONArray("bundles");
        i = 0;
_L6:
        if (i < ((JSONArray) (obj1)).length()) goto _L3; else goto _L2
_L2:
        if (!((JSONObject) (obj)).has("share_strings")) goto _L5; else goto _L4
_L4:
        obj = ((JSONObject) (obj)).getJSONObject("share_strings");
        obj1 = ((JSONObject) (obj)).keys();
_L7:
        if (((Iterator) (obj1)).hasNext())
        {
            break MISSING_BLOCK_LABEL_189;
        }
_L5:
        return location;
_L3:
        location.getBundles().add(TransitSourceFactory.createBundle(((JSONArray) (obj1)).getJSONObject(i)));
        i++;
          goto _L6
        String s = (String)((Iterator) (obj1)).next();
        location.getShareMessage().put(s, TransitSourceFactory.getString(((JSONObject) (obj)), s, null));
          goto _L7
    }

    public DetailRequest loadDetails(DetailRequest detailrequest)
        throws Exception
    {
        ServiceDay serviceday;
        List list;
        Object obj;
        serviceday = new ServiceDay();
        if (detailrequest.getScheduleItem() != null)
        {
            serviceday = detailrequest.getScheduleItem().getServiceDay();
        }
        list = detailrequest.getItineraries();
        obj = ((Itinerary)list.get(0)).getRoute();
        StringBuilder stringbuilder = new StringBuilder(super.getBaseURL(false, null));
        stringbuilder.append("/itineraries?route_id=");
        stringbuilder.append(((Route) (obj)).getId());
        stringbuilder.append("&itinerary_ids=");
        stringbuilder.append(implodeId(list));
        stringbuilder.append("&feed_id=");
        stringbuilder.append(((Route) (obj)).getFeedId());
        stringbuilder.append("&date=");
        stringbuilder.append(DateFormat.format("yyyy-MM-dd", serviceday.getDate()));
        obj = super.execute(stringbuilder.toString());
        if (!((JSONObject) (obj)).has("itineraries")) goto _L2; else goto _L1
_L1:
        int i;
        obj = ((JSONObject) (obj)).getJSONArray("itineraries");
        i = 0;
_L5:
        if (i < ((JSONArray) (obj)).length()) goto _L3; else goto _L2
_L2:
        return detailrequest;
_L3:
        JSONObject jsonobject = ((JSONArray) (obj)).getJSONObject(i);
        Itinerary itinerary = findItinerary(list, jsonobject.getString("itinerary_id"));
        if (itinerary != null)
        {
            parseStops(jsonobject.getJSONArray("stops"), itinerary, serviceday);
            itinerary.setShape(TransitSourceFactory.getString(jsonobject, "shape_data", null));
        }
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public ScheduleItem loadDetails(ScheduleItem scheduleitem)
        throws Exception
    {
        Itinerary itinerary = scheduleitem.getItinerary();
        ServiceDay serviceday = scheduleitem.getServiceDay();
        Object obj = itinerary.getRoute();
        StringBuilder stringbuilder = new StringBuilder(super.getBaseURL(false, null));
        stringbuilder.append("/itinerary?trip_id=");
        stringbuilder.append(scheduleitem.getTripId());
        stringbuilder.append("&feed_id=");
        stringbuilder.append(((Route) (obj)).getFeedId());
        stringbuilder.append("&date=");
        stringbuilder.append(DateFormat.format("yyyy-MM-dd", serviceday.getDate()));
        obj = super.execute(stringbuilder.toString());
        if (((JSONObject) (obj)).has("stops"))
        {
            parseStops(((JSONObject) (obj)).getJSONArray("stops"), itinerary, serviceday);
            itinerary.setShape(TransitSourceFactory.getString(((JSONObject) (obj)), "shape_data", null));
        }
        return scheduleitem;
    }

    public List loadLegal(Location location)
        throws Exception
    {
        Object obj;
        obj = new StringBuilder(super.getBaseURL(false, null));
        ((StringBuilder) (obj)).append("/legal?");
        ((StringBuilder) (obj)).append("lat=");
        ((StringBuilder) (obj)).append(location.getLatitude());
        ((StringBuilder) (obj)).append("&lon=");
        ((StringBuilder) (obj)).append(location.getLongitude());
        obj = super.execute(((StringBuilder) (obj)).toString());
        location = new ArrayList();
        if (!((JSONObject) (obj)).has("feeds")) goto _L2; else goto _L1
_L1:
        int i;
        obj = ((JSONObject) (obj)).getJSONArray("feeds");
        i = 0;
_L5:
        if (i < ((JSONArray) (obj)).length()) goto _L3; else goto _L2
_L2:
        return location;
_L3:
        location.add(TransitSourceFactory.createFeed(((JSONArray) (obj)).getJSONObject(i)));
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public NearbyRoutesRequest loadNearbyRoutes(NearbyRoutesRequest nearbyroutesrequest)
        throws Exception
    {
        if (nearbyroutesrequest != null && nearbyroutesrequest.getPlacemark() != null)
        {
            Object obj = new StringBuilder(super.getBaseURL(false, null));
            ((StringBuilder) (obj)).append("/routes?lat=");
            ((StringBuilder) (obj)).append(nearbyroutesrequest.getPlacemark().getLatitude());
            ((StringBuilder) (obj)).append("&lon=");
            ((StringBuilder) (obj)).append(nearbyroutesrequest.getPlacemark().getLongitude());
            if (nearbyroutesrequest.isLoadInactives())
            {
                ((StringBuilder) (obj)).append("&inactives=true");
            }
            if (nearbyroutesrequest.getBannedModesParameter() != null && !nearbyroutesrequest.getBannedModesParameter().isEmpty())
            {
                ((StringBuilder) (obj)).append("&");
                ((StringBuilder) (obj)).append(nearbyroutesrequest.getBannedModesParameter());
            }
            obj = super.execute(((StringBuilder) (obj)).toString());
            Object obj1 = TransitSourceFactory.getString(((JSONObject) (obj)), "error", null);
            if (obj1 != null)
            {
                nearbyroutesrequest.setError(com.thetransitapp.droid.model.NearbyRoutesRequest.ErrorType.valueOf(((String) (obj1))));
                nearbyroutesrequest.setErrorTitle(TransitSourceFactory.getString(((JSONObject) (obj)), "title", null));
                nearbyroutesrequest.setErrorMessage(TransitSourceFactory.getString(((JSONObject) (obj)), "message", null));
                return nearbyroutesrequest;
            }
            obj1 = TransitSourceFactory.getString(((JSONObject) (obj)), "time", null);
            if (obj1 != null)
            {
                Object obj2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
                ((SimpleDateFormat) (obj2)).setTimeZone(TimeZone.getTimeZone("UTC"));
                obj1 = ((SimpleDateFormat) (obj2)).parse(((String) (obj1)));
                obj2 = TimeZone.getTimeZone(TransitSourceFactory.getString(((JSONObject) (obj)), "timezone", "GMT")).getDisplayName(false, 0);
                if ((((Date) (obj1)).getTime() - System.currentTimeMillis()) / 1000L > 900L)
                {
                    nearbyroutesrequest.setError(com.thetransitapp.droid.model.NearbyRoutesRequest.ErrorType.TIME_DELTA_OUT);
                    nearbyroutesrequest.setErrorMessage((new StringBuilder(String.valueOf(java.text.DateFormat.getDateTimeInstance(3, 3).format(((Date) (obj1)))))).append(" ").append(((String) (obj2))).toString());
                    return nearbyroutesrequest;
                }
            }
            if (((JSONObject) (obj)).has("routes"))
            {
                obj = ((JSONObject) (obj)).getJSONArray("routes");
                ArrayList arraylist = new ArrayList(((JSONArray) (obj)).length());
                int i = 0;
                do
                {
                    Route route;
                    if (i >= ((JSONArray) (obj)).length())
                    {
                        if (nearbyroutesrequest.isLoadInactives())
                        {
                            nearbyroutesrequest.setInactiveRoutes(arraylist);
                            return nearbyroutesrequest;
                        } else
                        {
                            nearbyroutesrequest.setRoutes(arraylist);
                            return nearbyroutesrequest;
                        }
                    }
                    route = TransitSourceFactory.createRoute(((JSONArray) (obj)).getJSONObject(i));
                    if (route != null)
                    {
                        route.setFavorite(database.isFavorite(route));
                        arraylist.add(route);
                    }
                    i++;
                } while (true);
            }
        }
        return nearbyroutesrequest;
    }
}
