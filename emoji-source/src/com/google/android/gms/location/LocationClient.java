// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.internal.hm;
import com.google.android.gms.internal.jg;
import com.google.android.gms.internal.jh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.location:
//            Geofence, LocationListener, LocationRequest

public class LocationClient
    implements GooglePlayServicesClient
{
    public static interface OnAddGeofencesResultListener
    {

        public abstract void onAddGeofencesResult(int i, String as[]);
    }

    public static interface OnRemoveGeofencesResultListener
    {

        public abstract void onRemoveGeofencesByPendingIntentResult(int i, PendingIntent pendingintent);

        public abstract void onRemoveGeofencesByRequestIdsResult(int i, String as[]);
    }


    public static final String KEY_LOCATION_CHANGED = "com.google.android.location.LOCATION";
    public static final String KEY_MOCK_LOCATION = "mockLocation";
    private final jg UU;

    public LocationClient(Context context, com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        UU = new jg(context, connectioncallbacks, onconnectionfailedlistener, "location");
    }

    public static int getErrorCode(Intent intent)
    {
        return intent.getIntExtra("gms_error_code", -1);
    }

    public static int getGeofenceTransition(Intent intent)
    {
        int i;
        for (i = intent.getIntExtra("com.google.android.location.intent.extra.transition", -1); i == -1 || i != 1 && i != 2 && i != 4;)
        {
            return -1;
        }

        return i;
    }

    public static List getTriggeringGeofences(Intent intent)
    {
        Object obj = (ArrayList)intent.getSerializableExtra("com.google.android.location.intent.extra.geofence_list");
        if (obj == null)
        {
            return null;
        }
        intent = new ArrayList(((ArrayList) (obj)).size());
        for (obj = ((ArrayList) (obj)).iterator(); ((Iterator) (obj)).hasNext(); intent.add(jh.h((byte[])((Iterator) (obj)).next()))) { }
        return intent;
    }

    public static Location getTriggeringLocation(Intent intent)
    {
        return (Location)intent.getParcelableExtra("com.google.android.location.intent.extra.triggering_location");
    }

    public static boolean hasError(Intent intent)
    {
        return intent.hasExtra("gms_error_code");
    }

    public void addGeofences(List list, PendingIntent pendingintent, OnAddGeofencesResultListener onaddgeofencesresultlistener)
    {
        ArrayList arraylist = null;
        if (list != null)
        {
            arraylist = new ArrayList();
            Geofence geofence;
            for (list = list.iterator(); list.hasNext(); arraylist.add((jh)geofence))
            {
                geofence = (Geofence)list.next();
                hm.b(geofence instanceof jh, "Geofence must be created using Geofence.Builder.");
            }

        }
        try
        {
            UU.addGeofences(arraylist, pendingintent, onaddgeofencesresultlistener);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            throw new IllegalStateException(list);
        }
    }

    public void connect()
    {
        UU.connect();
    }

    public void disconnect()
    {
        UU.disconnect();
    }

    public Location getLastLocation()
    {
        return UU.getLastLocation();
    }

    public boolean isConnected()
    {
        return UU.isConnected();
    }

    public boolean isConnecting()
    {
        return UU.isConnecting();
    }

    public boolean isConnectionCallbacksRegistered(com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks)
    {
        return UU.isConnectionCallbacksRegistered(connectioncallbacks);
    }

    public boolean isConnectionFailedListenerRegistered(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        return UU.isConnectionFailedListenerRegistered(onconnectionfailedlistener);
    }

    public void registerConnectionCallbacks(com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks)
    {
        UU.registerConnectionCallbacks(connectioncallbacks);
    }

    public void registerConnectionFailedListener(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        UU.registerConnectionFailedListener(onconnectionfailedlistener);
    }

    public void removeGeofences(PendingIntent pendingintent, OnRemoveGeofencesResultListener onremovegeofencesresultlistener)
    {
        try
        {
            UU.removeGeofences(pendingintent, onremovegeofencesresultlistener);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (PendingIntent pendingintent)
        {
            throw new IllegalStateException(pendingintent);
        }
    }

    public void removeGeofences(List list, OnRemoveGeofencesResultListener onremovegeofencesresultlistener)
    {
        try
        {
            UU.removeGeofences(list, onremovegeofencesresultlistener);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            throw new IllegalStateException(list);
        }
    }

    public void removeLocationUpdates(PendingIntent pendingintent)
    {
        try
        {
            UU.removeLocationUpdates(pendingintent);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (PendingIntent pendingintent)
        {
            throw new IllegalStateException(pendingintent);
        }
    }

    public void removeLocationUpdates(LocationListener locationlistener)
    {
        try
        {
            UU.removeLocationUpdates(locationlistener);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (LocationListener locationlistener)
        {
            throw new IllegalStateException(locationlistener);
        }
    }

    public void requestLocationUpdates(LocationRequest locationrequest, PendingIntent pendingintent)
    {
        try
        {
            UU.requestLocationUpdates(locationrequest, pendingintent);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (LocationRequest locationrequest)
        {
            throw new IllegalStateException(locationrequest);
        }
    }

    public void requestLocationUpdates(LocationRequest locationrequest, LocationListener locationlistener)
    {
        try
        {
            UU.requestLocationUpdates(locationrequest, locationlistener);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (LocationRequest locationrequest)
        {
            throw new IllegalStateException(locationrequest);
        }
    }

    public void requestLocationUpdates(LocationRequest locationrequest, LocationListener locationlistener, Looper looper)
    {
        try
        {
            UU.requestLocationUpdates(locationrequest, locationlistener, looper);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (LocationRequest locationrequest)
        {
            throw new IllegalStateException(locationrequest);
        }
    }

    public void setMockLocation(Location location)
    {
        try
        {
            UU.setMockLocation(location);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Location location)
        {
            throw new IllegalStateException(location);
        }
    }

    public void setMockMode(boolean flag)
    {
        try
        {
            UU.setMockMode(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new IllegalStateException(remoteexception);
        }
    }

    public void unregisterConnectionCallbacks(com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks)
    {
        UU.unregisterConnectionCallbacks(connectioncallbacks);
    }

    public void unregisterConnectionFailedListener(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        UU.unregisterConnectionFailedListener(onconnectionfailedlistener);
    }
}
