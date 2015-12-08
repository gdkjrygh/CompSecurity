// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.model.stats;

import android.location.Location;
import android.util.Log;
import com.crashlytics.android.Crashlytics;
import com.google.android.gms.maps.model.LatLng;
import com.thetransitapp.droid.model.Feed;
import com.thetransitapp.droid.model.Route;
import com.thetransitapp.droid.model.viewmodel.MergedItinerary;
import com.thetransitapp.droid.model.viewmodel.NearbyRouteViewModel;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Session
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private Date endDate;
    private ArrayList locations;
    private ArrayList planRequests;
    private ArrayList routeHits;
    private Location simulatedLocation;
    private Date startDate;

    public Session()
    {
        locations = new ArrayList();
        planRequests = new ArrayList();
        routeHits = new ArrayList();
        startDate = new Date();
    }

    public void addLocation(Location location, boolean flag)
    {
        if (flag)
        {
            simulatedLocation = location;
            return;
        } else
        {
            locations.add(location);
            return;
        }
    }

    public void addPlanRequest(LatLng latlng, LatLng latlng1, Date date, Date date1)
    {
        JSONObject jsonobject;
        SimpleDateFormat simpledateformat;
        jsonobject = new JSONObject();
        simpledateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z", Locale.US);
        if (date == null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        jsonobject.put("leave_at", simpledateformat.format(date));
        if (date1 == null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        jsonobject.put("arrive_by", simpledateformat.format(date1));
        jsonobject.put("start_lat", Double.toString(latlng.latitude));
        jsonobject.put("start_lon", Double.toString(latlng.longitude));
        jsonobject.put("end_lat", Double.toString(latlng1.latitude));
        jsonobject.put("end_lon", Double.toString(latlng1.longitude));
        jsonobject.put("timestamp", simpledateformat.format(new Date()));
_L2:
        planRequests.add(jsonobject);
        return;
        latlng;
        Log.e(com/thetransitapp/droid/model/stats/Session.getSimpleName(), latlng.getMessage(), latlng);
        Crashlytics.logException(latlng);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public boolean canEqual(Object obj)
    {
        return obj instanceof Session;
    }

    public void endSession()
    {
        endDate = new Date();
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof Session))
        {
            return false;
        }
        obj = (Session)obj;
        if (!((Session) (obj)).canEqual(this))
        {
            return false;
        }
        Object obj1 = getLocations();
        Object obj2 = ((Session) (obj)).getLocations();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getPlanRequests();
        obj2 = ((Session) (obj)).getPlanRequests();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getRouteHits();
        obj2 = ((Session) (obj)).getRouteHits();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getSimulatedLocation();
        obj2 = ((Session) (obj)).getSimulatedLocation();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getStartDate();
        obj2 = ((Session) (obj)).getStartDate();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getEndDate();
        obj = ((Session) (obj)).getEndDate();
        return obj1 != null ? !obj1.equals(obj) : obj != null;
    }

    public Date getEndDate()
    {
        return endDate;
    }

    public JSONObject getJSONRepresentation()
    {
        JSONObject jsonobject = new JSONObject();
        SimpleDateFormat simpledateformat;
        JSONArray jsonarray;
        Object obj;
        simpledateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z", Locale.US);
        jsonarray = new JSONArray();
        obj = locations.iterator();
_L3:
        if (((Iterator) (obj)).hasNext()) goto _L2; else goto _L1
_L1:
        jsonobject.put("locations", jsonarray);
        jsonobject.put("route_hits", new JSONArray(routeHits));
        jsonobject.put("plan_requests", new JSONArray(planRequests));
        if (simulatedLocation == null)
        {
            break MISSING_BLOCK_LABEL_404;
        }
        obj = new JSONObject();
        ((JSONObject) (obj)).put("latitude", simulatedLocation.getLatitude());
        ((JSONObject) (obj)).put("longitude", simulatedLocation.getLongitude());
        ((JSONObject) (obj)).put("horizontal_accuracy", simulatedLocation.getAccuracy());
        ((JSONObject) (obj)).put("vertical_accuracy", simulatedLocation.getAccuracy());
        ((JSONObject) (obj)).put("timestamp", simpledateformat.format(new Date(simulatedLocation.getTime())));
        ((JSONObject) (obj)).put("speed", simulatedLocation.getSpeed());
        jsonarray.put(obj);
        jsonobject.put("simulated_location", obj);
_L4:
        jsonobject.put("start_date", simpledateformat.format(startDate));
        jsonobject.put("end_date", simpledateformat.format(endDate));
        return jsonobject;
_L2:
        try
        {
            Location location = (Location)((Iterator) (obj)).next();
            JSONObject jsonobject1 = new JSONObject();
            jsonobject1.put("latitude", location.getLatitude());
            jsonobject1.put("longitude", location.getLongitude());
            jsonobject1.put("horizontal_accuracy", location.getAccuracy());
            jsonobject1.put("vertical_accuracy", location.getAccuracy());
            jsonobject1.put("timestamp", simpledateformat.format(new Date(location.getTime())));
            jsonobject1.put("speed", location.getSpeed());
            jsonarray.put(jsonobject1);
        }
        catch (JSONException jsonexception)
        {
            Log.e(com/thetransitapp/droid/model/stats/Session.getSimpleName(), jsonexception.getMessage(), jsonexception);
            Crashlytics.logException(jsonexception);
            return jsonobject;
        }
          goto _L3
        jsonobject.put("simulated_location", JSONObject.NULL);
          goto _L4
    }

    public ArrayList getLocations()
    {
        return locations;
    }

    public ArrayList getPlanRequests()
    {
        return planRequests;
    }

    public ArrayList getRouteHits()
    {
        return routeHits;
    }

    public Location getSimulatedLocation()
    {
        return simulatedLocation;
    }

    public Date getStartDate()
    {
        return startDate;
    }

    public int hashCode()
    {
        int j1 = 0;
        Object obj = getLocations();
        int i;
        int j;
        int k;
        int l;
        int i1;
        if (obj == null)
        {
            i = 0;
        } else
        {
            i = obj.hashCode();
        }
        obj = getPlanRequests();
        if (obj == null)
        {
            j = 0;
        } else
        {
            j = obj.hashCode();
        }
        obj = getRouteHits();
        if (obj == null)
        {
            k = 0;
        } else
        {
            k = obj.hashCode();
        }
        obj = getSimulatedLocation();
        if (obj == null)
        {
            l = 0;
        } else
        {
            l = obj.hashCode();
        }
        obj = getStartDate();
        if (obj == null)
        {
            i1 = 0;
        } else
        {
            i1 = obj.hashCode();
        }
        obj = getEndDate();
        if (obj != null)
        {
            j1 = obj.hashCode();
        }
        return (((((i + 31) * 31 + j) * 31 + k) * 31 + l) * 31 + i1) * 31 + j1;
    }

    public void hitRoute(MergedItinerary mergeditinerary)
    {
        Iterator iterator = routeHits.iterator();
_L6:
        if (iterator.hasNext()) goto _L2; else goto _L1
_L1:
        JSONObject jsonobject = null;
_L4:
        if (jsonobject != null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        jsonobject = new JSONObject();
        jsonobject.put("hits", 0);
        routeHits.add(jsonobject);
        jsonobject.put("route_id", mergeditinerary.getRoute().getId());
        jsonobject.put("short_name", mergeditinerary.getRoute().getShortName());
        if (mergeditinerary.getRoute().getFeed() != null)
        {
            jsonobject.put("feed_code", mergeditinerary.getRoute().getFeed().getCode());
        }
        jsonobject.put("hits", jsonobject.getInt("hits") + 1);
        jsonobject.put("is_favorite", mergeditinerary.getRoute().getRoute().isFavorite());
        jsonobject.put("headsign", mergeditinerary.getCurrentHeadsign());
        return;
_L2:
        jsonobject = (JSONObject)iterator.next();
        boolean flag = jsonobject.get("route_id").equals(mergeditinerary.getRoute().getId());
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (true) goto _L4; else goto _L3
_L3:
        JSONException jsonexception;
        jsonexception;
        Log.e(com/thetransitapp/droid/model/stats/Session.getSimpleName(), jsonexception.getMessage(), jsonexception);
        Crashlytics.logException(jsonexception);
        if (true) goto _L6; else goto _L5
_L5:
        mergeditinerary;
_L8:
        Log.e(com/thetransitapp/droid/model/stats/Session.getSimpleName(), mergeditinerary.getMessage(), mergeditinerary);
        Crashlytics.logException(mergeditinerary);
        return;
        mergeditinerary;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void setEndDate(Date date)
    {
        endDate = date;
    }

    public void setLocations(ArrayList arraylist)
    {
        locations = arraylist;
    }

    public void setPlanRequests(ArrayList arraylist)
    {
        planRequests = arraylist;
    }

    public void setRouteHits(ArrayList arraylist)
    {
        routeHits = arraylist;
    }

    public void setSimulatedLocation(Location location)
    {
        simulatedLocation = location;
    }

    public void setStartDate(Date date)
    {
        startDate = date;
    }

    public String toString()
    {
        return (new StringBuilder("Session(locations=")).append(getLocations()).append(", planRequests=").append(getPlanRequests()).append(", routeHits=").append(getRouteHits()).append(", simulatedLocation=").append(getSimulatedLocation()).append(", startDate=").append(getStartDate()).append(", endDate=").append(getEndDate()).append(")").toString();
    }
}
