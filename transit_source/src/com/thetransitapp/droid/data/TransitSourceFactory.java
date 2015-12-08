// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.data;

import android.graphics.Color;
import android.util.Log;
import com.crashlytics.android.Crashlytics;
import com.thetransitapp.droid.model.Feed;
import com.thetransitapp.droid.model.Itinerary;
import com.thetransitapp.droid.model.Route;
import com.thetransitapp.droid.model.RouteImage;
import com.thetransitapp.droid.model.Schedule;
import com.thetransitapp.droid.model.ScheduleItem;
import com.thetransitapp.droid.model.ServiceDay;
import com.thetransitapp.droid.model.SimplePlacemark;
import com.thetransitapp.droid.model.Stop;
import com.thetransitapp.droid.model.TransitBundle;
import com.thetransitapp.droid.model.TransitMode;
import com.thetransitapp.droid.model.TransitServer;
import com.thetransitapp.droid.model.realtime.BARTRealTimeDataSource;
import com.thetransitapp.droid.model.realtime.BaseRealTimeDataSource;
import com.thetransitapp.droid.model.realtime.FeedRealTimeDataSource;
import com.thetransitapp.droid.model.realtime.GTFSRealTimeDataSource;
import com.thetransitapp.droid.model.realtime.JSONRealTimeDataSource;
import com.thetransitapp.droid.model.realtime.MBTASRealTimeDataSource;
import com.thetransitapp.droid.model.realtime.NextBusRealTimeDataSource;
import com.thetransitapp.droid.model.realtime.OBARealTimeDataSource;
import com.thetransitapp.droid.model.realtime.OCTRealTimeDataSource;
import com.thetransitapp.droid.model.realtime.XMLRealTimeDataSource;
import com.thetransitapp.droid.util.DateFormatter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class TransitSourceFactory
{

    private static final String DEBUG_SHORT_NAME = null;
    private static final String TAG = com/thetransitapp/droid/data/TransitSourceFactory.getSimpleName();

    private TransitSourceFactory()
    {
    }

    private static void addSchedule(JSONObject jsonobject, Itinerary itinerary, Stop stop, boolean flag)
    {
        if (!jsonobject.has("schedule_items"))
        {
            break MISSING_BLOCK_LABEL_41;
        }
        jsonobject = jsonobject.getJSONArray("schedule_items");
        if (jsonobject.length() > 0)
        {
            jsonobject = createSchedule(jsonobject, itinerary, stop, flag);
            itinerary.addSchedule(jsonobject, stop, jsonobject.getServiceDay());
        }
        return;
        jsonobject;
        Log.e(TAG, jsonobject.getMessage());
        return;
    }

    private static void assignMetaInfoToDataSource(JSONObject jsonobject, BaseRealTimeDataSource baserealtimedatasource)
    {
        if (jsonobject.isNull("route_types")) goto _L2; else goto _L1
_L1:
        JSONArray jsonarray;
        ArrayList arraylist;
        jsonarray = jsonobject.getJSONArray("route_types");
        arraylist = new ArrayList();
        int i = 0;
_L4:
        int j = jsonarray.length();
        if (i < j) goto _L3; else goto _L2
_L2:
        baserealtimedatasource.setDirectionMatchType(getString(jsonobject, "direction_match_type", null));
        return;
_L3:
        arraylist.add(Integer.valueOf(Integer.parseInt(jsonarray.getString(i))));
        baserealtimedatasource.setRouteTypes(arraylist);
        i++;
          goto _L4
        JSONException jsonexception;
        jsonexception;
        Log.e(com/thetransitapp/droid/data/TransitSourceFactory.getSimpleName(), jsonexception.getMessage(), jsonexception);
        Crashlytics.logException(jsonexception);
          goto _L2
    }

    private static void assignPredicatesToDataSource(JSONObject jsonobject, BaseRealTimeDataSource baserealtimedatasource)
    {
label0:
        {
            String s = getString(jsonobject, "schedule_based_predicate", null);
            if (s != null)
            {
                String as[] = s.split("==");
                baserealtimedatasource.setScheduleBasedKeyPath(as[0]);
                if (as.length > 1)
                {
                    baserealtimedatasource.setScheduleBasedRegex(Pattern.compile(as[1], 2));
                } else
                {
                    baserealtimedatasource.setScheduleBasedRegex(Pattern.compile("^$", 2));
                }
            }
            jsonobject = getString(jsonobject, "cancelled_predicate", null);
            if (jsonobject != null)
            {
                jsonobject = jsonobject.split("==");
                baserealtimedatasource.setCancelledKeyPath(jsonobject[0]);
                if (jsonobject.length <= 1)
                {
                    break label0;
                }
                baserealtimedatasource.setCancelledRegex(Pattern.compile(jsonobject[1], 2));
            }
            return;
        }
        baserealtimedatasource.setCancelledRegex(Pattern.compile("^$", 2));
    }

    private static void assignPredictionInfoToDataSource(JSONObject jsonobject, BaseRealTimeDataSource baserealtimedatasource)
    {
        baserealtimedatasource.setPredictionsKeyPath(getString(jsonobject, "predictions_key_path", null));
        baserealtimedatasource.setDateKeyPath(getString(jsonobject, "date_key_path", null));
        baserealtimedatasource.setDestinationFilteringKeyPath(getString(jsonobject, "destination_filtering_key_path", null));
        baserealtimedatasource.setRouteFilteringKeyPath(getString(jsonobject, "route_filtering_key_path", null));
        baserealtimedatasource.setStopFilteringKeyPath(getString(jsonobject, "stop_filtering_key_path", null));
        baserealtimedatasource.setTimestampFormat(new DateFormatter(getString(jsonobject, "timestamp_format", "")));
        baserealtimedatasource.setTimestampKeyPath(getString(jsonobject, "timestamp_key_path", null));
    }

    private static void assignURLStringsToDataSource(JSONObject jsonobject, BaseRealTimeDataSource baserealtimedatasource)
    {
        String s = getString(jsonobject, "trip_update_url", null);
        if (s != null)
        {
            baserealtimedatasource.setTripURL(urlStringByReplacingValueFromObject(s, jsonobject));
        }
        s = getString(jsonobject, "vehicle_locations_url", null);
        if (s != null)
        {
            urlStringByReplacingValueFromObject(s, jsonobject);
            baserealtimedatasource.setVehiculeURL(s);
        }
    }

    private static void assignVehiculeInfoToDataSource(JSONObject jsonobject, BaseRealTimeDataSource baserealtimedatasource)
    {
        baserealtimedatasource.setVehicleDestinationKeyPath(getString(jsonobject, "vehicle_destination_key_path", null));
        baserealtimedatasource.setVehicleIdKeyPath(getString(jsonobject, "vehicle_id_key_path", null));
        baserealtimedatasource.setVehicleLatitudeKeyPath(getString(jsonobject, "vehicle_latitude_key_path", null));
        baserealtimedatasource.setVehicleLongitudeKeyPath(getString(jsonobject, "vehicle_longitude_key_path", null));
        baserealtimedatasource.setVehicleTimestampFormat(new DateFormatter(getString(jsonobject, "vehicle_timestamp_format", "")));
        baserealtimedatasource.setVehicleTimestampKeyPath(getString(jsonobject, "vehicle_timestamp_key_path", null));
        baserealtimedatasource.setVehiclesKeyPath(getString(jsonobject, "vehicles_key_path", null));
    }

    public static TransitBundle createBundle(JSONObject jsonobject)
    {
        TransitBundle transitbundle;
        Object obj;
        int i;
        transitbundle = new TransitBundle();
        transitbundle.setId(getString(jsonobject, "id", null));
        transitbundle.setName(getString(jsonobject, "name", null));
        transitbundle.setGtfsSize(Integer.parseInt(getString(jsonobject, "gtfs_size", "0")));
        transitbundle.setLatitude(Double.parseDouble(getString(jsonobject, "latitude", "0.0")));
        transitbundle.setLongitude(Double.parseDouble(getString(jsonobject, "longitude", "0.0")));
        transitbundle.setCountryCode(getString(jsonobject, "country_code", "CA"));
        int j;
        try
        {
            if (jsonobject.has("server") && !jsonobject.get("server").equals(null))
            {
                TransitServer transitserver = new TransitServer();
                JSONObject jsonobject1 = jsonobject.getJSONObject("server");
                transitserver.setRouterId(getString(jsonobject1, "router_id", null));
                transitserver.setAppRegion(getString(jsonobject1, "app_region", null));
                transitserver.setPlannerRegion(getString(jsonobject1, "planner_region", null));
                transitbundle.setServer(transitserver);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e(TAG, ((JSONException) (obj)).getMessage());
        }
        if (!jsonobject.has("transit_modes") || jsonobject.get("transit_modes").equals(null)) goto _L2; else goto _L1
_L1:
        obj = jsonobject.getJSONArray("transit_modes");
        i = 0;
_L9:
        j = ((JSONArray) (obj)).length();
        if (i < j) goto _L3; else goto _L2
_L2:
        if (!jsonobject.has("feeds") || jsonobject.isNull("feeds")) goto _L5; else goto _L4
_L4:
        jsonobject = jsonobject.getJSONArray("feeds");
        i = 0;
_L7:
        j = jsonobject.length();
        if (i < j) goto _L6; else goto _L5
_L5:
        return transitbundle;
_L3:
        transitbundle.getTransitModes().add(createTransitMode(((JSONArray) (obj)).getJSONObject(i)));
        i++;
        continue; /* Loop/switch isn't completed */
        JSONException jsonexception;
        jsonexception;
        Log.e(TAG, jsonexception.getMessage());
          goto _L2
_L6:
        transitbundle.getFeeds().add(createFeed(jsonobject.getJSONObject(i)));
        i++;
          goto _L7
        jsonobject;
        Log.e(TAG, jsonobject.getMessage());
        return transitbundle;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public static Feed createFeed(JSONObject jsonobject)
    {
        Feed feed;
        Object obj;
        Object obj1;
        int i;
        feed = new Feed();
        feed.setCode(getString(jsonobject, "code", null));
        feed.setName(getString(jsonobject, "name", null));
        feed.setLevel(Integer.parseInt(getString(jsonobject, "level", "0")));
        feed.setFeedId(getString(jsonobject, "id", null));
        feed.setTimeZone(TimeZone.getTimeZone(getString(jsonobject, "timezone", "GMT")));
        int j;
        try
        {
            if (jsonobject.has("bounds") && !jsonobject.isNull("bounds"))
            {
                JSONObject jsonobject1 = jsonobject.getJSONObject("bounds");
                feed.setMinLatitude(Double.parseDouble(getString(jsonobject1, "min_lat", null)));
                feed.setMaxLatitude(Double.parseDouble(getString(jsonobject1, "max_lat", null)));
                feed.setMinLongitude(Double.parseDouble(getString(jsonobject1, "min_lon", null)));
                feed.setMaxLongitude(Double.parseDouble(getString(jsonobject1, "max_lon", null)));
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e(TAG, ((JSONException) (obj)).getMessage());
        }
        feed.setNotice(getString(jsonobject, "notice", null));
        feed.setLicence(getString(jsonobject, "licence", null));
        feed.setLicenceUrl(getString(jsonobject, "licence_url", null));
        obj = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        obj1 = getString(jsonobject, "gtfs_uploaded_at", null);
        if (obj1 != null)
        {
            try
            {
                feed.setUpdatedDate(((SimpleDateFormat) (obj)).parse(((String) (obj1))));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.e(TAG, ((ParseException) (obj)).getMessage());
                feed.setUpdatedDate(null);
            }
        }
        if (!jsonobject.has("real_time_recipes") || jsonobject.isNull("real_time_recipes")) goto _L2; else goto _L1
_L1:
        obj = jsonobject.getJSONArray("real_time_recipes");
        obj1 = new ArrayList();
        i = 0;
_L10:
        if (i < ((JSONArray) (obj)).length()) goto _L4; else goto _L3
_L3:
        feed.setRealTimeDataSource(new FeedRealTimeDataSource(((ArrayList) (obj1))));
_L2:
        if (!jsonobject.has("images") || jsonobject.isNull("images")) goto _L6; else goto _L5
_L5:
        jsonobject = jsonobject.getJSONArray("images");
        i = 0;
_L8:
        j = jsonobject.length();
        if (i < j) goto _L7; else goto _L6
_L6:
        return feed;
_L4:
        BaseRealTimeDataSource baserealtimedatasource = createRealTimeDataSource(((JSONArray) (obj)).getJSONObject(i));
        if (baserealtimedatasource == null)
        {
            break MISSING_BLOCK_LABEL_399;
        }
        ((ArrayList) (obj1)).add(baserealtimedatasource);
        i++;
        continue; /* Loop/switch isn't completed */
        JSONException jsonexception;
        jsonexception;
        Log.e(TAG, jsonexception.getMessage());
          goto _L2
_L7:
        feed.getRouteImages().add(createImage(jsonobject.getJSONObject(i)));
        i++;
          goto _L8
        jsonobject;
        Log.e(TAG, jsonobject.getMessage());
        return feed;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public static RouteImage createImage(JSONObject jsonobject)
    {
        RouteImage routeimage;
        routeimage = new RouteImage();
        routeimage.setId(getString(jsonobject, "id", null));
        routeimage.setName(getString(jsonobject, "name", null));
        routeimage.setUrl(getString(jsonobject, "url", null));
        if (!jsonobject.has("route_ids")) goto _L2; else goto _L1
_L1:
        Object obj = jsonobject.getJSONArray("route_ids");
        int i = 0;
_L6:
        int j = ((JSONArray) (obj)).length();
        if (i < j) goto _L3; else goto _L2
_L2:
        routeimage.setReplaceName(getString(jsonobject, "replace_name", "0").equals("1"));
        obj = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        jsonobject = getString(jsonobject, "updated_at", null);
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        routeimage.setUpdatedAt(((SimpleDateFormat) (obj)).parse(jsonobject));
        return routeimage;
_L3:
        routeimage.getRouteIds().add(((JSONArray) (obj)).getString(i));
        i++;
        continue; /* Loop/switch isn't completed */
        JSONException jsonexception;
        jsonexception;
        Log.e(TAG, jsonexception.getMessage());
        if (true) goto _L2; else goto _L4
_L4:
        jsonobject;
        routeimage.setUpdatedAt(null);
        Log.e(TAG, jsonobject.getMessage());
        return routeimage;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static Itinerary createItinerary(JSONObject jsonobject)
    {
        return createItinerary(jsonobject, null, false);
    }

    public static Itinerary createItinerary(JSONObject jsonobject, Stop stop, boolean flag)
    {
        Object obj;
        Itinerary itinerary;
        int j;
        itinerary = new Itinerary();
        itinerary.setItineraryId(getString(jsonobject, "itinerary_id", ""));
        itinerary.setId((new StringBuilder(String.valueOf(itinerary.getItineraryId()))).append(getString(jsonobject, "service_id", "")).toString());
        itinerary.setShape(getString(jsonobject, "shape_data", null));
        try
        {
            int i = Integer.parseInt(getString(jsonobject, "direction_id", "0"));
            if (i < com.thetransitapp.droid.model.Itinerary.DirectionType.values().length)
            {
                itinerary.setDirectionType(com.thetransitapp.droid.model.Itinerary.DirectionType.values()[i]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e(TAG, ((NumberFormatException) (obj)).getMessage());
        }
        itinerary.setBranch(getString(jsonobject, "branch_code", null));
        itinerary.setRealTimeRouteID(getString(jsonobject, "rt_route_id", null));
        itinerary.setDefaultHeadsign(getString(jsonobject, "trip_headsign", ""));
        obj = stop;
        stop = ((Stop) (obj));
        if (obj == null)
        {
            stop = ((Stop) (obj));
            int k;
            if (jsonobject.has("closest_stop"))
            {
                try
                {
                    stop = createStop(jsonobject.getJSONObject("closest_stop"), itinerary, flag);
                }
                // Misplaced declaration of an exception variable
                catch (Stop stop)
                {
                    Log.e(TAG, stop.getMessage());
                    stop = ((Stop) (obj));
                }
            }
        }
        if (stop != null)
        {
            itinerary.getStops().add(stop);
        }
        if (!jsonobject.has("stops")) goto _L2; else goto _L1
_L1:
        obj = jsonobject.getJSONArray("stops");
        j = 0;
_L4:
        k = ((JSONArray) (obj)).length();
        if (j < k) goto _L3; else goto _L2
_L2:
        addSchedule(jsonobject, itinerary, stop, flag);
        return itinerary;
_L3:
        Stop stop1 = createStop(((JSONArray) (obj)).getJSONObject(j), itinerary, flag);
        itinerary.getStops().add(stop1);
        j++;
          goto _L4
        JSONException jsonexception;
        jsonexception;
        Log.e(TAG, jsonexception.getMessage());
          goto _L2
    }

    public static BaseRealTimeDataSource createRealTimeDataSource(JSONObject jsonobject)
    {
        Object obj = null;
        String s = getString(jsonobject, "feed_type", null);
        if (s.equals("SPRealTimeNextBusDataSource"))
        {
            obj = new NextBusRealTimeDataSource();
            ((NextBusRealTimeDataSource) (obj)).setAgencyTag(getString(jsonobject, "agency_tag", null));
        } else
        if (s.equals("SPRealTimeXMLDataSource"))
        {
            obj = new XMLRealTimeDataSource();
        } else
        if (s.equals("SPRealTimeJSONDataSource"))
        {
            obj = new JSONRealTimeDataSource();
        } else
        if (s.equals("SPRealTimeGTFSDataSource"))
        {
            obj = new GTFSRealTimeDataSource();
        } else
        if (s.equals("SPRealTimeOBADataSource"))
        {
            obj = new OBARealTimeDataSource();
        } else
        if (s.equals("SPRealTimeBARTDataSource"))
        {
            obj = new BARTRealTimeDataSource();
        } else
        {
            if (!s.equals("SPRealTimeMBTASDataSource"))
            {
                continue;
            }
            obj = new MBTASRealTimeDataSource();
        }
        do
        {
            assignURLStringsToDataSource(jsonobject, ((BaseRealTimeDataSource) (obj)));
            assignPredicatesToDataSource(jsonobject, ((BaseRealTimeDataSource) (obj)));
            assignPredictionInfoToDataSource(jsonobject, ((BaseRealTimeDataSource) (obj)));
            assignVehiculeInfoToDataSource(jsonobject, ((BaseRealTimeDataSource) (obj)));
            assignMetaInfoToDataSource(jsonobject, ((BaseRealTimeDataSource) (obj)));
            do
            {
                return ((BaseRealTimeDataSource) (obj));
            } while (!s.equals("SPRealTimeOCTDataSource"));
            obj = new OCTRealTimeDataSource();
        } while (true);
    }

    public static Route createRoute(JSONObject jsonobject)
    {
        {
            Route route = new Route();
            route.setId(getString(jsonobject, "route_id", null));
            route.setFeedId(getString(jsonobject, "feed_id", null));
            route.setColor(Color.parseColor((new StringBuilder("#")).append(getString(jsonobject, "route_color", "ffffff")).toString()));
            route.setTextColor(Color.parseColor((new StringBuilder("#")).append(getString(jsonobject, "route_text_color", "000000")).toString()));
            route.setShortName(getString(jsonobject, "route_short_name", ""));
            route.setLongName(getString(jsonobject, "route_long_name", ""));
            if (DEBUG_SHORT_NAME != null && !DEBUG_SHORT_NAME.equals(route.getShortName()))
            {
                break MISSING_BLOCK_LABEL_256;
            }
            int j;
            int k;
            try
            {
                int i = Integer.parseInt(getString(jsonobject, "route_type", "0"));
                if (i < com.thetransitapp.droid.model.Route.RouteType.values().length)
                {
                    route.setType(com.thetransitapp.droid.model.Route.RouteType.values()[i]);
                }
            }
            catch (NumberFormatException numberformatexception)
            {
                Log.e(TAG, numberformatexception.getMessage());
            }
            if (!jsonobject.has("itineraries"))
            {
                break MISSING_BLOCK_LABEL_206;
            }
            try
            {
                jsonobject = jsonobject.getJSONArray("itineraries");
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                Log.e(TAG, jsonobject.getMessage());
                return route;
            }
            j = 0;
        }
        k = jsonobject.length();
        if (j < k)
        {
            break MISSING_BLOCK_LABEL_223;
        }
        return route;
        route.addItinerary(createItinerary(jsonobject.getJSONObject(j)));
        j++;
        if (true)
        {
            break MISSING_BLOCK_LABEL_194;
        }
        return null;
    }

    public static Schedule createSchedule(JSONArray jsonarray, Itinerary itinerary, Stop stop, boolean flag)
    {
        Object obj;
        ArrayList arraylist;
        int i;
        arraylist = new ArrayList();
        obj = null;
        i = 0;
_L2:
        ServiceDay serviceday1;
        if (i >= jsonarray.length())
        {
            jsonarray = new Schedule();
            jsonarray.setScheduleItems(arraylist);
            jsonarray.setComplete(flag);
            jsonarray.setServiceDay(((ServiceDay) (obj)));
            jsonarray.setItinerary(itinerary);
            jsonarray.setStop(stop);
            return jsonarray;
        }
        serviceday1 = ((ServiceDay) (obj));
        JSONObject jsonobject = jsonarray.getJSONObject(i);
        ServiceDay serviceday;
        serviceday = ((ServiceDay) (obj));
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        serviceday1 = ((ServiceDay) (obj));
        serviceday = new ServiceDay(getString(jsonobject, "service_date", null));
        serviceday1 = serviceday;
        arraylist.add(createScheduleItem(jsonobject, itinerary, stop, serviceday));
        obj = serviceday;
_L3:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        JSONException jsonexception;
        jsonexception;
        Log.e(TAG, jsonexception.getMessage());
        jsonexception = serviceday1;
          goto _L3
    }

    public static ScheduleItem createScheduleItem(JSONObject jsonobject, Itinerary itinerary, Stop stop, ServiceDay serviceday)
    {
        ScheduleItem scheduleitem = new ScheduleItem();
        if (jsonobject.has("stop_time"))
        {
            scheduleitem.setScheduledStopTime(serviceday.getDate(getString(jsonobject, "stop_time", "00:00")));
        } else
        {
            scheduleitem.setFrequencyStartTime(serviceday.getDate(getString(jsonobject, "start_time", "00:00")));
            scheduleitem.setFrequencyEndTime(serviceday.getDate(getString(jsonobject, "end_time", "00:00")));
            try
            {
                scheduleitem.setFrequencyHeadway(Long.parseLong(getString(jsonobject, "headway_secs", "0")));
            }
            catch (NumberFormatException numberformatexception)
            {
                Log.e(TAG, numberformatexception.getMessage());
            }
        }
        scheduleitem.setTripId(getString(jsonobject, "trip_id", null));
        scheduleitem.setPickupCancelled(getString(jsonobject, "pickup_type", "0").equals("1"));
        scheduleitem.setLastItemOfService(Boolean.parseBoolean(getString(jsonobject, "is_last_item", "false")));
        scheduleitem.setCancelled(false);
        scheduleitem.setHeadsign(itinerary.getDefaultHeadsign());
        scheduleitem.setItinerary(itinerary);
        scheduleitem.setStop(stop);
        scheduleitem.setServiceDay(serviceday);
        return scheduleitem;
    }

    public static Stop createStop(JSONObject jsonobject, Itinerary itinerary, boolean flag)
    {
        itinerary = new Stop();
        itinerary.setId(getString(jsonobject, "stop_id", null));
        itinerary.setName(getString(jsonobject, "stop_name", ""));
        itinerary.setRealTimeId(getString(jsonobject, "rt_stop_id", null));
        try
        {
            itinerary.setPlacemark(new SimplePlacemark(Double.parseDouble(getString(jsonobject, "stop_lat", "0.0")), Double.parseDouble(getString(jsonobject, "stop_lon", "0.0"))));
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            Log.e(TAG, jsonobject.getMessage());
            return itinerary;
        }
        return itinerary;
    }

    private static TransitMode createTransitMode(JSONObject jsonobject)
    {
        TransitMode transitmode;
        transitmode = new TransitMode();
        transitmode.setId(getString(jsonobject, "id", null));
        transitmode.setName(getString(jsonobject, "name", null));
        Object obj = getString(jsonobject, "route_types", null);
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = ((String) (obj)).split(",");
        int i = 0;
_L13:
        int j = obj.length;
        if (i < j) goto _L3; else goto _L2
_L2:
        if (!jsonobject.has("feed_ids") || jsonobject.get("feed_ids").equals(null)) goto _L5; else goto _L4
_L4:
        obj = getString(jsonobject, "feed_ids", "").split(",");
        i = 0;
_L10:
        j = obj.length;
        if (i < j) goto _L6; else goto _L5
_L5:
        if (!jsonobject.has("route_ids") || jsonobject.get("route_ids").equals(null)) goto _L8; else goto _L7
_L7:
        jsonobject = getString(jsonobject, "route_ids", "").split(",");
        i = 0;
_L11:
        j = jsonobject.length;
        if (i < j) goto _L9; else goto _L8
_L8:
        return transitmode;
_L3:
        int k = Integer.parseInt(obj[i]);
        if (k < com.thetransitapp.droid.model.Route.RouteType.values().length)
        {
            transitmode.getRouteTypes().add(com.thetransitapp.droid.model.Route.RouteType.values()[k]);
        }
        i++;
        continue; /* Loop/switch isn't completed */
        obj;
        Log.e(TAG, ((NumberFormatException) (obj)).getMessage());
          goto _L2
_L6:
        transitmode.getFeedIds().add(obj[i]);
        i++;
          goto _L10
        JSONException jsonexception;
        jsonexception;
        Log.e(TAG, jsonexception.getMessage());
          goto _L5
_L9:
        transitmode.getRouteIds().add(jsonobject[i]);
        i++;
          goto _L11
        jsonobject;
        Log.e(TAG, jsonobject.getMessage());
        return transitmode;
        if (true) goto _L13; else goto _L12
_L12:
    }

    public static String getString(JSONObject jsonobject, String s, String s1)
    {
        String s2 = s1;
        if (jsonobject.has(s))
        {
            s2 = s1;
            try
            {
                if (!jsonobject.getString(s).equals("null"))
                {
                    s2 = jsonobject.getString(s);
                }
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                Log.e(TAG, jsonobject.getMessage());
                return s1;
            }
        }
        return s2;
    }

    private static String urlStringByReplacingValueFromObject(String s, JSONObject jsonobject)
    {
        Iterator iterator = jsonobject.keys();
_L2:
        String s1;
        String s2;
        do
        {
            if (!iterator.hasNext())
            {
                return s;
            }
            s1 = (String)iterator.next();
            s2 = (new StringBuilder("__")).append(s1).append("__").toString();
        } while (!s.contains(s2));
        s1 = s.replace(s2, jsonobject.getString(s1));
        s = s1;
        continue; /* Loop/switch isn't completed */
        JSONException jsonexception;
        jsonexception;
        Log.e(TAG, jsonexception.getMessage());
        if (true) goto _L2; else goto _L1
_L1:
    }

}
