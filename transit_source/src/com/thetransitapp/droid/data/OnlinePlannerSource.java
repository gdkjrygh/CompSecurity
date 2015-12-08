// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.data;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.location.Location;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.maps.model.LatLng;
import com.thetransitapp.droid.controller.FeedManager;
import com.thetransitapp.droid.model.Route;
import com.thetransitapp.droid.model.RoutingItinerary;
import com.thetransitapp.droid.model.RoutingLeg;
import com.thetransitapp.droid.model.RoutingRequest;
import com.thetransitapp.droid.model.ScheduleItem;
import com.thetransitapp.droid.model.SimplePlacemark;
import com.thetransitapp.droid.model.Stop;
import com.thetransitapp.droid.model.TransitBundle;
import com.thetransitapp.droid.model.TransitServer;
import com.thetransitapp.droid.model.viewmodel.RouteViewModel;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.thetransitapp.droid.data:
//            BaseOnlineSource, TransitSourceFactory, TransitDatabaseHelper

public class OnlinePlannerSource extends BaseOnlineSource
{

    private static int $SWITCH_TABLE$com$thetransitapp$droid$model$RoutingLeg$TransportationMode[];
    private static final String TAG = com/thetransitapp/droid/data/OnlinePlannerSource.getSimpleName();
    private TransitDatabaseHelper databaseHelper;
    private FeedManager feedManager;
    private SharedPreferences preferences;

    static int[] $SWITCH_TABLE$com$thetransitapp$droid$model$RoutingLeg$TransportationMode()
    {
        int ai[] = $SWITCH_TABLE$com$thetransitapp$droid$model$RoutingLeg$TransportationMode;
        if (ai != null)
        {
            return ai;
        }
        ai = new int[com.thetransitapp.droid.model.RoutingLeg.TransportationMode.values().length];
        try
        {
            ai[com.thetransitapp.droid.model.RoutingLeg.TransportationMode.ALIGHTING.ordinal()] = 17;
        }
        catch (NoSuchFieldError nosuchfielderror19) { }
        try
        {
            ai[com.thetransitapp.droid.model.RoutingLeg.TransportationMode.BICYCLE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror18) { }
        try
        {
            ai[com.thetransitapp.droid.model.RoutingLeg.TransportationMode.BOARDING.ordinal()] = 16;
        }
        catch (NoSuchFieldError nosuchfielderror17) { }
        try
        {
            ai[com.thetransitapp.droid.model.RoutingLeg.TransportationMode.BUS.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror16) { }
        try
        {
            ai[com.thetransitapp.droid.model.RoutingLeg.TransportationMode.BUSISH.ordinal()] = 15;
        }
        catch (NoSuchFieldError nosuchfielderror15) { }
        try
        {
            ai[com.thetransitapp.droid.model.RoutingLeg.TransportationMode.CABLE_CAR.ordinal()] = 10;
        }
        catch (NoSuchFieldError nosuchfielderror14) { }
        try
        {
            ai[com.thetransitapp.droid.model.RoutingLeg.TransportationMode.CAR.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror13) { }
        try
        {
            ai[com.thetransitapp.droid.model.RoutingLeg.TransportationMode.CUSTOM_MOTOR_VEHICLE.ordinal()] = 20;
        }
        catch (NoSuchFieldError nosuchfielderror12) { }
        try
        {
            ai[com.thetransitapp.droid.model.RoutingLeg.TransportationMode.FERRY.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror11) { }
        try
        {
            ai[com.thetransitapp.droid.model.RoutingLeg.TransportationMode.FUNICULAR.ordinal()] = 12;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        try
        {
            ai[com.thetransitapp.droid.model.RoutingLeg.TransportationMode.GONDOLA.ordinal()] = 11;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            ai[com.thetransitapp.droid.model.RoutingLeg.TransportationMode.RAIL.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            ai[com.thetransitapp.droid.model.RoutingLeg.TransportationMode.STL.ordinal()] = 19;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            ai[com.thetransitapp.droid.model.RoutingLeg.TransportationMode.SUBWAY.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            ai[com.thetransitapp.droid.model.RoutingLeg.TransportationMode.TRAINISH.ordinal()] = 14;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            ai[com.thetransitapp.droid.model.RoutingLeg.TransportationMode.TRAM.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            ai[com.thetransitapp.droid.model.RoutingLeg.TransportationMode.TRANSFER.ordinal()] = 18;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            ai[com.thetransitapp.droid.model.RoutingLeg.TransportationMode.TRANSIT.ordinal()] = 13;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            ai[com.thetransitapp.droid.model.RoutingLeg.TransportationMode.WAIT.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            ai[com.thetransitapp.droid.model.RoutingLeg.TransportationMode.WALK.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror) { }
        $SWITCH_TABLE$com$thetransitapp$droid$model$RoutingLeg$TransportationMode = ai;
        return ai;
    }

    public OnlinePlannerSource()
    {
        super(false);
    }

    private Route createRoute(JSONObject jsonobject, com.thetransitapp.droid.model.RoutingLeg.TransportationMode transportationmode)
    {
        Route route = new Route();
        if (transportationmode.ordinal() < com.thetransitapp.droid.model.Route.RouteType.values().length)
        {
            route.setType(com.thetransitapp.droid.model.Route.RouteType.values()[transportationmode.ordinal()]);
        }
        route.setFeedId(TransitSourceFactory.getString(jsonobject, "", null));
        route.setShortName(TransitSourceFactory.getString(jsonobject, "routeShortName", null));
        route.setLongName(TransitSourceFactory.getString(jsonobject, "routeLongName", null));
        route.setColor(Color.parseColor((new StringBuilder("#")).append(TransitSourceFactory.getString(jsonobject, "routeColor", "000000")).toString()));
        route.setTextColor(Color.parseColor((new StringBuilder("#")).append(TransitSourceFactory.getString(jsonobject, "routeTextColor", "000000")).toString()));
        route.setId(TransitSourceFactory.getString(jsonobject, "routeId", null));
        route.setFeedId(TransitSourceFactory.getString(jsonobject, "agencyId", null));
        return route;
    }

    private RoutingItinerary createRoutingItinerary(JSONObject jsonobject)
    {
        RoutingItinerary routingitinerary;
        routingitinerary = new RoutingItinerary();
        routingitinerary.setDuration(Long.parseLong(TransitSourceFactory.getString(jsonobject, "duration", "0")));
        routingitinerary.setStartTime(new Date(Long.parseLong(TransitSourceFactory.getString(jsonobject, "startTime", "0"))));
        routingitinerary.setEndTime(new Date(Long.parseLong(TransitSourceFactory.getString(jsonobject, "endTime", "0"))));
        routingitinerary.setFetchDate(new Date());
        routingitinerary.setTransitDuration(Long.parseLong(TransitSourceFactory.getString(jsonobject, "transitTime", "0")));
        routingitinerary.setWalkingDuration(Long.parseLong(TransitSourceFactory.getString(jsonobject, "walkTime", "0")));
        routingitinerary.setWaitingDuration(Long.parseLong(TransitSourceFactory.getString(jsonobject, "waitingTime", "0")));
        routingitinerary.setWalkingDistance(Double.parseDouble(TransitSourceFactory.getString(jsonobject, "walkDistance", "0.0")));
        if (!jsonobject.has("legs") || jsonobject.get("legs").equals(null)) goto _L2; else goto _L1
_L1:
        jsonobject = jsonobject.getJSONArray("legs");
        int i;
        int k;
        k = 0;
        i = 0;
_L10:
        RoutingLeg routingleg;
        RoutingLeg routingleg1;
        int j;
        if (k >= jsonobject.length())
        {
            return routingitinerary;
        }
        long l;
        try
        {
            routingleg = createRoutingLeg(jsonobject.getJSONObject(k));
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            Log.e(TAG, jsonobject.getMessage());
            return routingitinerary;
        }
        j = i;
        if (routingitinerary.getLegs().size() <= 0) goto _L4; else goto _L3
_L3:
        routingleg1 = (RoutingLeg)routingitinerary.getLegs().get(routingitinerary.getLegs().size() - 1);
        l = routingleg.getStartTime().getTime() - routingleg1.getEndTime().getTime();
        if (routingleg.getTransportationMode() != com.thetransitapp.droid.model.RoutingLeg.TransportationMode.WALK) goto _L6; else goto _L5
_L5:
        routingleg.setWaitDuration(l);
        j = i;
_L4:
        if (routingleg.getDistance() <= 0.0D)
        {
            break; /* Loop/switch isn't completed */
        }
        i = j + 1;
        routingleg.setLegSequence(j);
        routingitinerary.getLegs().add(routingleg);
          goto _L7
_L6:
        j = i;
        if (l <= 0x1d4c0L)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (routingleg1.getLegType() != com.thetransitapp.droid.model.RoutingLeg.LegType.WALK)
        {
            break MISSING_BLOCK_LABEL_362;
        }
        routingleg1.setWaitDuration(l);
        j = i;
        continue; /* Loop/switch isn't completed */
        routingleg1 = createWaitingLeg(routingleg1, routingleg);
        routingleg1.setLegSequence(i);
        routingitinerary.getLegs().add(routingleg1);
        j = i + 1;
        if (true) goto _L4; else goto _L8
_L8:
        i = j;
          goto _L7
_L2:
        return routingitinerary;
_L7:
        k++;
        if (true) goto _L10; else goto _L9
_L9:
    }

    private RoutingLeg createRoutingLeg(JSONObject jsonobject)
    {
        RoutingLeg routingleg;
        Object obj;
        routingleg = new RoutingLeg();
        routingleg.setDuration(Long.parseLong(TransitSourceFactory.getString(jsonobject, "duration", "0")));
        long l = Long.parseLong(TransitSourceFactory.getString(jsonobject, "startTime", "0"));
        long l1 = Long.parseLong(TransitSourceFactory.getString(jsonobject, "endTime", "0"));
        routingleg.setWaitDuration(Long.parseLong(TransitSourceFactory.getString(jsonobject, "duration", "0")));
        routingleg.setTotalDuration(Long.parseLong(TransitSourceFactory.getString(jsonobject, "duration", "0")));
        routingleg.setStartScheduleItem(new ScheduleItem(new Date(l)));
        routingleg.setEndScheduleItem(new ScheduleItem(new Date(l1)));
        routingleg.setDistance(Double.parseDouble(TransitSourceFactory.getString(jsonobject, "distance", "0.0")));
        obj = TransitSourceFactory.getString(jsonobject, "mode", null);
        if (obj == null) goto _L2; else goto _L1
_L1:
        Object obj1;
        int i;
        int j;
        obj1 = com.thetransitapp.droid.model.RoutingLeg.TransportationMode.values();
        j = obj1.length;
        i = 0;
_L11:
        if (i < j) goto _L3; else goto _L2
_L2:
        $SWITCH_TABLE$com$thetransitapp$droid$model$RoutingLeg$TransportationMode()[routingleg.getTransportationMode().ordinal()];
        JVM INSTR lookupswitch 6: default 236
    //                   1: 727
    //                   2: 710
    //                   16: 710
    //                   17: 710
    //                   18: 710
    //                   19: 710;
           goto _L4 _L5 _L6 _L6 _L6 _L6 _L6
_L4:
        routingleg.setLegType(com.thetransitapp.droid.model.RoutingLeg.LegType.TRANSIT);
        obj = createRoute(jsonobject, routingleg.getTransportationMode());
        routingleg.setRoute(new RouteViewModel(((Route) (obj))));
        routingleg.getRoute().setFeed(super.getFeed(((Route) (obj))));
        if (!jsonobject.has("intermediateStops") || jsonobject.get("intermediateStops").equals(null))
        {
            break; /* Loop/switch isn't completed */
        }
        obj = jsonobject.getJSONArray("intermediateStops");
        i = 0;
_L9:
        j = ((JSONArray) (obj)).length();
        if (i < j) goto _L8; else goto _L7
_L7:
        routingleg.setHeadsign(TransitSourceFactory.getString(jsonobject, "headsign", null));
        JSONException jsonexception;
        com.thetransitapp.droid.model.RoutingLeg.TransportationMode transportationmode;
        try
        {
            if (jsonobject.has("from") && !jsonobject.get("from").equals(null))
            {
                obj = jsonobject.getJSONObject("from");
                obj1 = new SimplePlacemark(Double.parseDouble(TransitSourceFactory.getString(((JSONObject) (obj)), "lat", "0.0")), Double.parseDouble(TransitSourceFactory.getString(((JSONObject) (obj)), "lon", "0.0")));
                ((SimplePlacemark) (obj1)).setName(TransitSourceFactory.getString(((JSONObject) (obj)), "name", null));
                routingleg.setFromPlacemark(((SimplePlacemark) (obj1)));
            }
        }
        catch (JSONException jsonexception1)
        {
            Log.e(TAG, jsonexception1.getMessage());
        }
        try
        {
            if (jsonobject.has("to") && !jsonobject.get("to").equals(null))
            {
                obj = jsonobject.getJSONObject("to");
                obj1 = new SimplePlacemark(Double.parseDouble(TransitSourceFactory.getString(((JSONObject) (obj)), "lat", "0.0")), Double.parseDouble(TransitSourceFactory.getString(((JSONObject) (obj)), "lon", "0.0")));
                ((SimplePlacemark) (obj1)).setName(TransitSourceFactory.getString(((JSONObject) (obj)), "name", null));
                routingleg.setToPlacemark(((SimplePlacemark) (obj1)));
            }
        }
        catch (JSONException jsonexception2)
        {
            Log.e(TAG, jsonexception2.getMessage());
        }
        try
        {
            if (jsonobject.has("previousStop") && !jsonobject.get("previousStop").equals(null))
            {
                obj = jsonobject.getJSONObject("previousStop");
                routingleg.setPreviousStopLatitude(Double.parseDouble(TransitSourceFactory.getString(((JSONObject) (obj)), "latitude", "0.0")));
                routingleg.setPreviousStopLongitude(Double.parseDouble(TransitSourceFactory.getString(((JSONObject) (obj)), "longitude", "0.0")));
            }
        }
        catch (JSONException jsonexception3)
        {
            Log.e(TAG, jsonexception3.getMessage());
        }
        routingleg.setStepTitle(TransitSourceFactory.getString(jsonobject, "walkDistance", null));
        routingleg.setStepSubtitle(TransitSourceFactory.getString(jsonobject, "walkDistance", null));
        routingleg.setStepTimeString(TransitSourceFactory.getString(jsonobject, "walkDistance", null));
        routingleg.setTimeBarColor(Color.parseColor((new StringBuilder("#")).append(TransitSourceFactory.getString(jsonobject, "routeColor", "000000")).toString()));
        if (jsonobject.has("legGeometry") && !jsonobject.get("legGeometry").equals(null))
        {
            routingleg.setShape(TransitSourceFactory.getString(jsonobject.getJSONObject("legGeometry"), "points", null));
        }
        return routingleg;
_L3:
        transportationmode = obj1[i];
        if (transportationmode.toString().equals(obj))
        {
            routingleg.setTransportationMode(transportationmode);
        }
        i++;
        continue; /* Loop/switch isn't completed */
_L6:
        routingleg.setLegType(com.thetransitapp.droid.model.RoutingLeg.LegType.WALK);
        routingleg.setTransportationMode(com.thetransitapp.droid.model.RoutingLeg.TransportationMode.WALK);
          goto _L7
_L5:
        routingleg.setLegType(com.thetransitapp.droid.model.RoutingLeg.LegType.WAIT);
          goto _L7
_L8:
        routingleg.getIntermediateStops().add(createStop(((JSONArray) (obj)).getJSONObject(i)));
        i++;
          goto _L9
        jsonexception;
        Log.e(TAG, jsonexception.getMessage());
          goto _L7
        jsonobject;
        Log.e(TAG, jsonobject.getMessage());
        return routingleg;
        if (true) goto _L11; else goto _L10
_L10:
    }

    private Stop createStop(JSONObject jsonobject)
    {
        Stop stop = new Stop();
        stop.setName(TransitSourceFactory.getString(jsonobject, "name", null));
        SimplePlacemark simpleplacemark = new SimplePlacemark(Double.parseDouble(TransitSourceFactory.getString(jsonobject, "lat", "0.0")), Double.parseDouble(TransitSourceFactory.getString(jsonobject, "lon", "0.0")));
        simpleplacemark.setName(TransitSourceFactory.getString(jsonobject, "name", null));
        stop.setPlacemark(simpleplacemark);
        return stop;
    }

    private RoutingLeg createWaitingLeg(RoutingLeg routingleg, RoutingLeg routingleg1)
    {
        RoutingLeg routingleg2 = new RoutingLeg();
        routingleg2.setTransportationMode(com.thetransitapp.droid.model.RoutingLeg.TransportationMode.WAIT);
        routingleg2.setLegType(com.thetransitapp.droid.model.RoutingLeg.LegType.WAIT);
        routingleg2.setEndScheduleItem(new ScheduleItem(routingleg.getEndTime()));
        routingleg2.setWaitDuration(routingleg1.getStartTime().getTime() - routingleg.getEndTime().getTime());
        routingleg2.setEndScheduleItem(new ScheduleItem(routingleg1.getStartTime()));
        return routingleg2;
    }

    private String getBaseURL(LatLng latlng)
    {
        return (new StringBuilder(String.valueOf(super.getBaseURL(true, latlng)))).append("/opentripplanner-api-webapp/ws").toString();
    }

    private List parseItineraries(JSONObject jsonobject, SimplePlacemark simpleplacemark, SimplePlacemark simpleplacemark1)
    {
        ArrayList arraylist;
        if (!jsonobject.has("plan"))
        {
            break MISSING_BLOCK_LABEL_234;
        }
        jsonobject = jsonobject.getJSONObject("plan");
        if (!jsonobject.has("itineraries") || jsonobject.get("itineraries").equals(null))
        {
            break MISSING_BLOCK_LABEL_234;
        }
        jsonobject = jsonobject.getJSONArray("itineraries");
        arraylist = new ArrayList(jsonobject.length());
        int i = 0;
_L1:
        if (i >= jsonobject.length())
        {
            return arraylist;
        }
        RoutingItinerary routingitinerary = createRoutingItinerary(jsonobject.getJSONObject(i));
        routingitinerary.setItineraryIndex(i);
        RoutingLeg routingleg = new RoutingLeg();
        routingleg.setLegType(com.thetransitapp.droid.model.RoutingLeg.LegType.START);
        routingleg.setFromPlacemark(simpleplacemark);
        routingleg.setStartScheduleItem(new ScheduleItem(routingitinerary.getStartTime()));
        routingitinerary.getLegs().add(0, routingleg);
        routingleg = new RoutingLeg();
        routingleg.setLegType(com.thetransitapp.droid.model.RoutingLeg.LegType.END);
        routingleg.setToPlacemark(simpleplacemark1);
        routingleg.setEndScheduleItem(new ScheduleItem(routingitinerary.getEndTime()));
        routingitinerary.getLegs().add(routingleg);
        arraylist.add(routingitinerary);
        i++;
          goto _L1
        jsonobject;
        Log.e(TAG, jsonobject.getMessage());
        return null;
    }

    public RoutingRequest fetchRoutingItineraries(RoutingRequest routingrequest)
        throws Exception
    {
        Object obj1 = new StringBuilder(getBaseURL(new LatLng(routingrequest.getStart().getLatitude(), routingrequest.getStart().getLongitude())));
        ((StringBuilder) (obj1)).append("/plan?fromPlace=");
        ((StringBuilder) (obj1)).append(routingrequest.getStart().getLatitude());
        ((StringBuilder) (obj1)).append(URLEncoder.encode(",", "UTF-8"));
        ((StringBuilder) (obj1)).append(routingrequest.getStart().getLongitude());
        ((StringBuilder) (obj1)).append("&toPlace=");
        ((StringBuilder) (obj1)).append(routingrequest.getEnd().getLatitude());
        ((StringBuilder) (obj1)).append(URLEncoder.encode(",", "UTF-8"));
        ((StringBuilder) (obj1)).append(routingrequest.getEnd().getLongitude());
        ((StringBuilder) (obj1)).append("&showIntermediateStops=true");
        ((StringBuilder) (obj1)).append("&arriveBy=");
        Object obj;
        if (routingrequest.isArriveBy())
        {
            obj = "true";
        } else
        {
            obj = "false";
        }
        ((StringBuilder) (obj1)).append(((String) (obj)));
        ((StringBuilder) (obj1)).append("&date=");
        ((StringBuilder) (obj1)).append(URLEncoder.encode((new SimpleDateFormat("MM/dd/yyyy")).format(routingrequest.getDate()), "UTF-8"));
        ((StringBuilder) (obj1)).append("&time=");
        ((StringBuilder) (obj1)).append(URLEncoder.encode((new SimpleDateFormat("HH:mm")).format(routingrequest.getDate()), "UTF-8"));
        obj = new Location("Transit");
        ((Location) (obj)).setLatitude(routingrequest.getStart().getLatitude());
        ((Location) (obj)).setLongitude(routingrequest.getEnd().getLongitude());
        obj = feedManager.closestBundleToLocation(((Location) (obj)));
        ((StringBuilder) (obj1)).append("&routerId=");
        if (obj != null && ((TransitBundle) (obj)).getServer() != null)
        {
            ((StringBuilder) (obj1)).append(((TransitBundle) (obj)).getServer().getRouterId());
        } else
        {
            ((StringBuilder) (obj1)).append(preferences.getString("router_id", "0"));
        }
        obj = super.getBannedTransitParameters(false);
        if (obj != null && !((String) (obj)).isEmpty())
        {
            ((StringBuilder) (obj1)).append("&");
            ((StringBuilder) (obj1)).append(((String) (obj)));
        }
        obj1 = ((StringBuilder) (obj1)).toString();
        obj = databaseHelper.getCache("LAST_PLAN_FETCH_KEY");
        if (obj == null)
        {
            obj = new ArrayList();
        } else
        {
            obj = new ArrayList(Arrays.asList(((String) (obj)).split("\n")));
        }
        ((ArrayList) (obj)).add(obj1);
        if (((ArrayList) (obj)).size() > 5)
        {
            ((ArrayList) (obj)).remove(0);
        }
        databaseHelper.saveCache("LAST_PLAN_FETCH_KEY", TextUtils.join("\n", ((Iterable) (obj))));
        obj = super.execute(((String) (obj1)));
        if (((JSONObject) (obj)).has("error") && !((JSONObject) (obj)).get("error").equals(null))
        {
            obj = ((JSONObject) (obj)).getJSONObject("error");
            obj1 = TransitSourceFactory.getString(((JSONObject) (obj)), "id", "500");
            if (((String) (obj1)).equals("406"))
            {
                routingrequest.setError(com.thetransitapp.droid.model.RoutingRequest.ErrorType.OUT_OF_SERVICE);
            } else
            if (((String) (obj1)).equals("400") || ((String) (obj1)).equals("404") || ((String) (obj1)).equals("409"))
            {
                routingrequest.setError(com.thetransitapp.droid.model.RoutingRequest.ErrorType.DIRECTION_UNAVAILABLE);
            } else
            {
                routingrequest.setError(com.thetransitapp.droid.model.RoutingRequest.ErrorType.MESSAGE);
            }
            routingrequest.setErrorMessage(TransitSourceFactory.getString(((JSONObject) (obj)), "msg", null));
        } else
        {
            obj = parseItineraries(((JSONObject) (obj)), routingrequest.getStart(), routingrequest.getEnd());
            if (obj != null)
            {
                routingrequest.getItineraries().addAll(((java.util.Collection) (obj)));
                return routingrequest;
            }
        }
        return routingrequest;
    }

}
