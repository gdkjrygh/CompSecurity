// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.LocationClient;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.leanplum:
//            ag, Util, Leanplum, ReceiveTransitionsIntentService, 
//            a

class LocationManagerImpl
    implements com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener, com.google.android.gms.location.LocationClient.OnAddGeofencesResultListener, com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener, ag
{

    static final String METADATA = "com.google.android.gms.version";
    static final String PERMISSION = "android.permission.ACCESS_FINE_LOCATION";
    private static LocationManagerImpl instance;
    private List allGeofences;
    private List backgroundGeofences;
    private boolean isInBackground;
    private Map lastKnownState;
    private LocationClient locationClient;
    private Map stateBeforeBackground;
    private List trackedGeofenceIds;

    private LocationManagerImpl()
    {
        trackedGeofenceIds = new ArrayList();
        loadLastKnownRegionState();
        isInBackground = Util.j();
    }

    private Geofence geofenceFromMap(Map map, String s)
    {
        Number number = (Number)map.get("lat");
        Number number1 = (Number)map.get("lon");
        Number number2 = (Number)map.get("radius");
        map = (Number)map.get("version");
        if (number == null)
        {
            return null;
        } else
        {
            com.google.android.gms.location.Geofence.Builder builder = new com.google.android.gms.location.Geofence.Builder();
            builder.a(number.floatValue(), number1.floatValue(), number2.floatValue());
            builder.a(geofenceID(s, Integer.valueOf(map.intValue())));
            builder.a(3);
            builder.a(-1L);
            return builder.a();
        }
    }

    private String geofenceID(String s, Integer integer)
    {
        return (new StringBuilder("__leanplum")).append(s).append("_").append(integer.toString()).toString();
    }

    private String getRegionName(String s)
    {
        if (s.startsWith("__leanplum"))
        {
            return s.substring(10, s.lastIndexOf("_"));
        } else
        {
            return null;
        }
    }

    private int getStatusForTransitionType(int i)
    {
        byte byte0 = 4;
        if (i == 1 || i == 4)
        {
            byte0 = 2;
        }
        return byte0;
    }

    private List getToBeTrackedGeofences()
    {
        if (Util.j())
        {
            return backgroundGeofences;
        } else
        {
            return allGeofences;
        }
    }

    private PendingIntent getTransitionPendingIntent()
    {
        Context context = Leanplum.a();
        return PendingIntent.getService(context, 0, new Intent(context, com/leanplum/ReceiveTransitionsIntentService), 0x8000000);
    }

    public static ag instance()
    {
        com/leanplum/LocationManagerImpl;
        JVM INSTR monitorenter ;
        LocationManagerImpl locationmanagerimpl;
        if (instance == null)
        {
            instance = new LocationManagerImpl();
        }
        locationmanagerimpl = instance;
        com/leanplum/LocationManagerImpl;
        JVM INSTR monitorexit ;
        return locationmanagerimpl;
        Exception exception;
        exception;
        throw exception;
    }

    private boolean isMetaDataSet()
    {
        boolean flag1 = false;
        Object obj = Leanplum.a();
        boolean flag;
        try
        {
            obj = ((Context) (obj)).getPackageManager().getApplicationInfo(((Context) (obj)).getPackageName(), 128);
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            return false;
        }
        flag = flag1;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        flag = flag1;
        if (((ApplicationInfo) (obj)).metaData == null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        obj = ((ApplicationInfo) (obj)).metaData.get("com.google.android.gms.version");
        flag = flag1;
        if (obj != null)
        {
            flag = true;
        }
        return flag;
    }

    private boolean isPermissionGranted()
    {
        return Leanplum.a().checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0;
    }

    private void loadLastKnownRegionState()
    {
        if (lastKnownState != null)
        {
            return;
        }
        String s = Leanplum.a().getSharedPreferences("__leanplum__location", 0).getString("regionState", null);
        if (s == null)
        {
            lastKnownState = new HashMap();
            return;
        } else
        {
            lastKnownState = a.a(s);
            return;
        }
    }

    private void maybePerformActions(Geofence geofence, String s)
    {
        geofence = getRegionName(geofence.a());
        if (geofence != null)
        {
            byte byte0;
            if (Util.j())
            {
                byte0 = 2;
            } else
            {
                byte0 = 3;
            }
            Leanplum.a(s, geofence, byte0, null, null);
        }
    }

    private void saveLastKnownRegionState()
    {
        if (lastKnownState == null)
        {
            return;
        }
        android.content.SharedPreferences.Editor editor = Leanplum.a().getSharedPreferences("__leanplum__location", 0).edit();
        editor.putString("regionState", a.a(lastKnownState));
        try
        {
            editor.apply();
            return;
        }
        catch (NoSuchMethodError nosuchmethoderror)
        {
            editor.commit();
        }
    }

    private void startLocationClient()
    {
        if (!isPermissionGranted() || !isMetaDataSet())
        {
            Log.d("Leanplum", "You have to set the application meta data and location permission to use geofencing.");
        } else
        {
            Context context = Leanplum.a();
            if (locationClient == null)
            {
                locationClient = new LocationClient(context, this, this);
            }
            if (!locationClient.isConnected() && !locationClient.isConnecting())
            {
                locationClient.connect();
                return;
            }
            if (locationClient.isConnected())
            {
                updateTrackedGeofences();
                return;
            }
        }
    }

    private void updateTrackedGeofences()
    {
        if (allGeofences == null)
        {
            return;
        }
        if (isInBackground || !Util.j()) goto _L2; else goto _L1
_L1:
        Object obj;
        stateBeforeBackground = new HashMap();
        obj = lastKnownState.keySet().iterator();
_L6:
        if (((Iterator) (obj)).hasNext()) goto _L3; else goto _L2
_L2:
        obj = getToBeTrackedGeofences();
        if (trackedGeofenceIds.size() > 0)
        {
            locationClient.removeGeofences(trackedGeofenceIds, this);
        }
        trackedGeofenceIds = new ArrayList();
        if (((List) (obj)).size() <= 0) goto _L5; else goto _L4
_L4:
        locationClient.addGeofences(((List) (obj)), getTransitionPendingIntent(), this);
        obj = ((List) (obj)).iterator();
_L7:
        if (((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_194;
        }
_L5:
        if (isInBackground && !Util.j())
        {
            stateBeforeBackground = null;
        }
        isInBackground = Util.j();
        return;
_L3:
        String s = (String)((Iterator) (obj)).next();
        stateBeforeBackground.put(s, lastKnownState.get(s));
          goto _L6
        Geofence geofence = (Geofence)((Iterator) (obj)).next();
        trackedGeofenceIds.add(geofence.a());
        if (isInBackground && !Util.j() && stateBeforeBackground != null)
        {
            Number number = (Number)stateBeforeBackground.get(geofence.a());
            Number number1 = (Number)lastKnownState.get(geofence.a());
            if (number1 != null && number != null)
            {
                if (a.a(number, number1))
                {
                    maybePerformActions(geofence, "enterRegion");
                }
                if (a.b(number, number1))
                {
                    maybePerformActions(geofence, "exitRegion");
                }
            }
        }
          goto _L7
    }

    public void onAddGeofencesResult(int i, String as[])
    {
    }

    public void onConnected(Bundle bundle)
    {
        updateTrackedGeofences();
    }

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        connectionresult.a();
    }

    public void onDisconnected()
    {
        locationClient = null;
        locationClient = new LocationClient(Leanplum.a(), this, this);
        if (!locationClient.isConnected() && !locationClient.isConnecting())
        {
            locationClient.connect();
        }
    }

    public void onRemoveGeofencesByPendingIntentResult(int i, PendingIntent pendingintent)
    {
    }

    public void onRemoveGeofencesByRequestIdsResult(int i, String as[])
    {
    }

    public void setRegionsData(Map map, Set set, Set set1)
    {
        if (!Util.i())
        {
            return;
        }
        allGeofences = new ArrayList();
        backgroundGeofences = new ArrayList();
        Iterator iterator = map.keySet().iterator();
        do
        {
            Object obj;
            do
            {
                boolean flag1;
                do
                {
                    boolean flag;
                    do
                    {
                        if (!iterator.hasNext())
                        {
                            startLocationClient();
                            return;
                        }
                        obj = (String)iterator.next();
                        flag = set.contains(obj);
                        flag1 = set1.contains(obj);
                    } while (!flag && !flag1);
                    obj = geofenceFromMap((Map)map.get(obj), ((String) (obj)));
                } while (obj == null);
                if (flag1)
                {
                    backgroundGeofences.add(obj);
                }
                allGeofences.add(obj);
            } while (lastKnownState.get(((Geofence) (obj)).a()) != null);
            lastKnownState.put(((Geofence) (obj)).a(), Integer.valueOf(1));
        } while (true);
    }

    public void updateGeofencing()
    {
        if (allGeofences != null && backgroundGeofences != null)
        {
            startLocationClient();
        }
    }

    public void updateStatusForGeofences(List list, int i)
    {
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                saveLastKnownRegionState();
                return;
            }
            Geofence geofence = (Geofence)list.next();
            if (!trackedGeofenceIds.contains(geofence.a()) && geofence.a().startsWith("__leanplum"))
            {
                ArrayList arraylist = new ArrayList();
                arraylist.add(geofence.a());
                if (locationClient != null && locationClient.isConnected())
                {
                    locationClient.removeGeofences(arraylist, this);
                }
            } else
            {
                Number number = (Number)lastKnownState.get(geofence.a());
                if (number != null)
                {
                    if (a.a(number, Integer.valueOf(getStatusForTransitionType(i))))
                    {
                        maybePerformActions(geofence, "enterRegion");
                    }
                    if (a.b(number, Integer.valueOf(getStatusForTransitionType(i))))
                    {
                        maybePerformActions(geofence, "exitRegion");
                    }
                }
                lastKnownState.put(geofence.a(), Integer.valueOf(getStatusForTransitionType(i)));
            }
        } while (true);
    }
}
