// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.util.location;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.FusedLocationProviderApi;
import com.google.android.gms.location.GeofencingApi;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.apps.wallet.util.location:
//            LocationClientException

public class SynchronizedLocationClient
{
    final class LocationClientListener
        implements com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
    {

        final SynchronizedLocationClient this$0;

        public final void onAddGeofencesResult(Status status)
        {
            WLog.d(SynchronizedLocationClient.TAG, "onAddGeofencesResult()");
            switch (status.getStatusCode())
            {
            default:
                notifyException(new LocationClientException(String.format("addGeofences failed - unknown error: %d", new Object[] {
                    Integer.valueOf(status.getStatusCode())
                })));
                return;

            case 0: // '\0'
                notifyCompletion();
                return;

            case 1001: 
                notifyException(new LocationClientException("addGeofences failed: GEOFENCE_TOO_MANY_GEOFENCES"));
                return;

            case 1002: 
                notifyException(new LocationClientException("addGeofences failed: GEOFENCE_TOO_MANY_PENDING_INTENTS"));
                return;

            case 1000: 
                notifyException(new LocationClientException("addGeofences failed: GEOFENCE_NOT_AVAILABLE"));
                return;

            case 1: // '\001'
                notifyException(new LocationClientException("addGeofences failed: ERROR"));
                return;
            }
        }

        public final void onConnected(Bundle bundle)
        {
            WLog.d(SynchronizedLocationClient.TAG, "onConnected()");
            notifyCompletion();
        }

        public final void onConnectionFailed(ConnectionResult connectionresult)
        {
            WLog.d(SynchronizedLocationClient.TAG, "onConnectionFailed()");
            int i = connectionresult.getErrorCode();
            switch (i)
            {
            default:
                notifyException(new LocationClientException(String.format("Connection failed - unknown error: %s", new Object[] {
                    Integer.valueOf(i)
                })));
                return;

            case 10: // '\n'
                notifyException(new LocationClientException("Connection failed: DEVELOPER_ERROR"));
                return;

            case 8: // '\b'
                notifyException(new LocationClientException("Connection failed: INTERNAL_ERROR"));
                return;

            case 5: // '\005'
                notifyException(new LocationClientException("Connection failed: INVALID_ACCOUNT"));
                return;

            case 11: // '\013'
                notifyException(new LocationClientException("Connection failed: LICENSE_CHECK_FAILED"));
                return;

            case 7: // '\007'
                notifyException(new LocationClientException("Connection failed: NETWORK_ERROR"));
                return;

            case 6: // '\006'
                notifyException(new LocationClientException("Connection failed: RESOLUTION_REQUIRED"));
                return;

            case 3: // '\003'
                notifyException(new LocationClientException("Connection failed: SERVICE_DISABLED"));
                return;

            case 9: // '\t'
                notifyException(new LocationClientException("Connection failed: SERVICE_INVALID"));
                return;

            case 1: // '\001'
                notifyException(new LocationClientException("Connection failed: SERVICE_MISSING"));
                return;

            case 2: // '\002'
                notifyException(new LocationClientException("Connection failed: SERVICE_VERSION_UPDATE_REQUIRED"));
                return;

            case 4: // '\004'
                notifyException(new LocationClientException("Connection failed: SIGN_IN_REQUIRED"));
                return;
            }
        }

        public final void onConnectionSuspended(int i)
        {
            WLog.d(SynchronizedLocationClient.TAG, "onDisconnected()");
            notifyException(new LocationClientException("Unexpected disconnection."));
        }

        public final void onRemoveGeofencesByPendingIntentResult(Status status)
        {
            WLog.d(SynchronizedLocationClient.TAG, "onRemoveGeofencesByPendingIntentResult()");
            switch (status.getStatusCode())
            {
            default:
                notifyException(new LocationClientException(String.format("removeGeofences failed - unknown error: %d", new Object[] {
                    Integer.valueOf(status.getStatusCode())
                })));
                return;

            case 0: // '\0'
                notifyCompletion();
                return;

            case 1000: 
                notifyException(new LocationClientException("removeGeofences failed: GEOFENCE_NOT_AVAILABLE"));
                return;

            case 1: // '\001'
                notifyException(new LocationClientException("removeGeofences failed: ERROR"));
                return;
            }
        }

        private LocationClientListener()
        {
            this$0 = SynchronizedLocationClient.this;
            super();
        }

    }


    private static final long OPERATION_TIMEOUT_MILLIS;
    private static final String TAG = com/google/android/apps/wallet/util/location/SynchronizedLocationClient.getSimpleName();
    private LocationClientException exception;
    private GoogleApiClient locationClient;
    private final LocationClientListener locationClientListener = new LocationClientListener();
    private boolean operationCompleted;
    private final Object operationCompletionLock = new Object();
    private final Object operationLock = new Object();

    SynchronizedLocationClient()
    {
        operationCompleted = false;
    }

    private static void ensureNotOnMainThread()
    {
        boolean flag;
        if (Looper.myLooper() != Looper.getMainLooper())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Can't call blocking SynchronizedLocationClient methods from main thread");
    }

    private void notifyCompletion()
    {
        synchronized (operationCompletionLock)
        {
            operationCompleted = true;
            operationCompletionLock.notify();
        }
        return;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
    }

    private void notifyException(LocationClientException locationclientexception)
    {
        synchronized (operationCompletionLock)
        {
            operationCompleted = true;
            exception = locationclientexception;
            operationCompletionLock.notify();
        }
        return;
        locationclientexception;
        obj;
        JVM INSTR monitorexit ;
        throw locationclientexception;
    }

    private void waitForCompletion()
        throws InterruptedException, LocationClientException
    {
        Object obj = operationCompletionLock;
        obj;
        JVM INSTR monitorenter ;
        if (!operationCompleted)
        {
            operationCompletionLock.wait(OPERATION_TIMEOUT_MILLIS);
        }
        if (!operationCompleted)
        {
            throw new LocationClientException("Operation timed out.");
        }
        break MISSING_BLOCK_LABEL_46;
        Exception exception1;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
        if (exception != null)
        {
            throw new LocationClientException("An exception occured during the operation", exception);
        }
        obj;
        JVM INSTR monitorexit ;
    }

    public final void addGeofences(List list, PendingIntent pendingintent)
        throws InterruptedException, LocationClientException
    {
        boolean flag;
        flag = false;
        ensureNotOnMainThread();
        WLog.d(TAG, "addGeofences()");
        Object obj = operationLock;
        obj;
        JVM INSTR monitorenter ;
        if (locationClient != null)
        {
            flag = true;
        }
        Preconditions.checkState(flag);
        LocationServices.GeofencingApi.addGeofences(locationClient, list, pendingintent).setResultCallback(new ResultCallback() {

            final SynchronizedLocationClient this$0;

            private void onResult(Status status)
            {
                locationClientListener.onAddGeofencesResult(status);
            }

            public final volatile void onResult(Result result)
            {
                onResult((Status)result);
            }

            
            {
                this$0 = SynchronizedLocationClient.this;
                super();
            }
        });
        waitForCompletion();
        operationCompleted = false;
        exception = null;
        obj;
        JVM INSTR monitorexit ;
        return;
        list;
        operationCompleted = false;
        exception = null;
        throw list;
        list;
        obj;
        JVM INSTR monitorexit ;
        throw list;
    }

    public final void connect(Context context)
        throws InterruptedException, LocationClientException
    {
        boolean flag;
        flag = false;
        ensureNotOnMainThread();
        WLog.d(TAG, "connect()");
        Object obj = operationLock;
        obj;
        JVM INSTR monitorenter ;
        if (locationClient == null)
        {
            flag = true;
        }
        Preconditions.checkState(flag);
        locationClient = (new com.google.android.gms.common.api.GoogleApiClient.Builder(context)).addApi(LocationServices.API).build();
        locationClient.registerConnectionCallbacks(locationClientListener);
        locationClient.connect();
        waitForCompletion();
        operationCompleted = false;
        exception = null;
        obj;
        JVM INSTR monitorexit ;
        return;
        context;
        Thread.currentThread().interrupt();
        locationClient = null;
        throw context;
        context;
        operationCompleted = false;
        exception = null;
        throw context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        context;
        locationClient = null;
        throw context;
        context;
        locationClient = null;
        throw Throwables.propagate(context);
    }

    public final void disconnect()
    {
        ensureNotOnMainThread();
        WLog.d(TAG, "disconnect()");
        Object obj = operationLock;
        obj;
        JVM INSTR monitorenter ;
        Exception exception1;
        boolean flag;
        if (locationClient != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        locationClient.disconnect();
        locationClient = null;
        obj;
        JVM INSTR monitorexit ;
        return;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
    }

    public final Location getLastLocation()
    {
        ensureNotOnMainThread();
        WLog.d(TAG, "getLastLocation()");
        Object obj = operationLock;
        obj;
        JVM INSTR monitorenter ;
        Location location;
        Exception exception1;
        boolean flag;
        if (locationClient != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        location = LocationServices.FusedLocationApi.getLastLocation(locationClient);
        obj;
        JVM INSTR monitorexit ;
        return location;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
    }

    public final void removeGeofences(PendingIntent pendingintent)
        throws InterruptedException, LocationClientException
    {
        boolean flag;
        flag = false;
        ensureNotOnMainThread();
        WLog.d(TAG, "removeGeofences()");
        Object obj = operationLock;
        obj;
        JVM INSTR monitorenter ;
        if (locationClient != null)
        {
            flag = true;
        }
        Preconditions.checkState(flag);
        LocationServices.GeofencingApi.removeGeofences(locationClient, pendingintent).setResultCallback(new ResultCallback() {

            final SynchronizedLocationClient this$0;

            private void onResult(Status status)
            {
                locationClientListener.onRemoveGeofencesByPendingIntentResult(status);
            }

            public final volatile void onResult(Result result)
            {
                onResult((Status)result);
            }

            
            {
                this$0 = SynchronizedLocationClient.this;
                super();
            }
        });
        waitForCompletion();
        operationCompleted = false;
        exception = null;
        obj;
        JVM INSTR monitorexit ;
        return;
        pendingintent;
        operationCompleted = false;
        exception = null;
        throw pendingintent;
        pendingintent;
        obj;
        JVM INSTR monitorexit ;
        throw pendingintent;
    }

    public final void removeLocationUpdates(PendingIntent pendingintent)
    {
        ensureNotOnMainThread();
        WLog.d(TAG, "removeLocationUpdates()");
        Object obj = operationLock;
        obj;
        JVM INSTR monitorenter ;
        boolean flag;
        if (locationClient != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        LocationServices.FusedLocationApi.removeLocationUpdates(locationClient, pendingintent);
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        pendingintent;
        WLog.e(TAG, "Error calling LocationClient.removeLocationUpdates()", pendingintent);
          goto _L1
        pendingintent;
        obj;
        JVM INSTR monitorexit ;
        throw pendingintent;
    }

    public final void requestLocationUpdates(LocationRequest locationrequest, PendingIntent pendingintent)
    {
        ensureNotOnMainThread();
        WLog.d(TAG, "requestLocationUpdates()");
        Object obj = operationLock;
        obj;
        JVM INSTR monitorenter ;
        boolean flag;
        if (locationClient != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        LocationServices.FusedLocationApi.requestLocationUpdates(locationClient, locationrequest, pendingintent);
        obj;
        JVM INSTR monitorexit ;
        return;
        locationrequest;
        obj;
        JVM INSTR monitorexit ;
        throw locationrequest;
    }

    static 
    {
        OPERATION_TIMEOUT_MILLIS = TimeUnit.SECONDS.toMillis(30L);
    }




}
