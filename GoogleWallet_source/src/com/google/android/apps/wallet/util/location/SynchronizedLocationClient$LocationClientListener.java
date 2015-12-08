// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.util.location;

import android.os.Bundle;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.apps.wallet.util.location:
//            SynchronizedLocationClient, LocationClientException

final class <init>
    implements com.google.android.gms.common.r, com.google.android.gms.common.api.ntListener
{

    final SynchronizedLocationClient this$0;

    public final void onAddGeofencesResult(Status status)
    {
        WLog.d(SynchronizedLocationClient.access$200(), "onAddGeofencesResult()");
        switch (status.getStatusCode())
        {
        default:
            SynchronizedLocationClient.access$400(SynchronizedLocationClient.this, new LocationClientException(String.format("addGeofences failed - unknown error: %d", new Object[] {
                Integer.valueOf(status.getStatusCode())
            })));
            return;

        case 0: // '\0'
            SynchronizedLocationClient.access$300(SynchronizedLocationClient.this);
            return;

        case 1001: 
            SynchronizedLocationClient.access$400(SynchronizedLocationClient.this, new LocationClientException("addGeofences failed: GEOFENCE_TOO_MANY_GEOFENCES"));
            return;

        case 1002: 
            SynchronizedLocationClient.access$400(SynchronizedLocationClient.this, new LocationClientException("addGeofences failed: GEOFENCE_TOO_MANY_PENDING_INTENTS"));
            return;

        case 1000: 
            SynchronizedLocationClient.access$400(SynchronizedLocationClient.this, new LocationClientException("addGeofences failed: GEOFENCE_NOT_AVAILABLE"));
            return;

        case 1: // '\001'
            SynchronizedLocationClient.access$400(SynchronizedLocationClient.this, new LocationClientException("addGeofences failed: ERROR"));
            return;
        }
    }

    public final void onConnected(Bundle bundle)
    {
        WLog.d(SynchronizedLocationClient.access$200(), "onConnected()");
        SynchronizedLocationClient.access$300(SynchronizedLocationClient.this);
    }

    public final void onConnectionFailed(ConnectionResult connectionresult)
    {
        WLog.d(SynchronizedLocationClient.access$200(), "onConnectionFailed()");
        int i = connectionresult.getErrorCode();
        switch (i)
        {
        default:
            SynchronizedLocationClient.access$400(SynchronizedLocationClient.this, new LocationClientException(String.format("Connection failed - unknown error: %s", new Object[] {
                Integer.valueOf(i)
            })));
            return;

        case 10: // '\n'
            SynchronizedLocationClient.access$400(SynchronizedLocationClient.this, new LocationClientException("Connection failed: DEVELOPER_ERROR"));
            return;

        case 8: // '\b'
            SynchronizedLocationClient.access$400(SynchronizedLocationClient.this, new LocationClientException("Connection failed: INTERNAL_ERROR"));
            return;

        case 5: // '\005'
            SynchronizedLocationClient.access$400(SynchronizedLocationClient.this, new LocationClientException("Connection failed: INVALID_ACCOUNT"));
            return;

        case 11: // '\013'
            SynchronizedLocationClient.access$400(SynchronizedLocationClient.this, new LocationClientException("Connection failed: LICENSE_CHECK_FAILED"));
            return;

        case 7: // '\007'
            SynchronizedLocationClient.access$400(SynchronizedLocationClient.this, new LocationClientException("Connection failed: NETWORK_ERROR"));
            return;

        case 6: // '\006'
            SynchronizedLocationClient.access$400(SynchronizedLocationClient.this, new LocationClientException("Connection failed: RESOLUTION_REQUIRED"));
            return;

        case 3: // '\003'
            SynchronizedLocationClient.access$400(SynchronizedLocationClient.this, new LocationClientException("Connection failed: SERVICE_DISABLED"));
            return;

        case 9: // '\t'
            SynchronizedLocationClient.access$400(SynchronizedLocationClient.this, new LocationClientException("Connection failed: SERVICE_INVALID"));
            return;

        case 1: // '\001'
            SynchronizedLocationClient.access$400(SynchronizedLocationClient.this, new LocationClientException("Connection failed: SERVICE_MISSING"));
            return;

        case 2: // '\002'
            SynchronizedLocationClient.access$400(SynchronizedLocationClient.this, new LocationClientException("Connection failed: SERVICE_VERSION_UPDATE_REQUIRED"));
            return;

        case 4: // '\004'
            SynchronizedLocationClient.access$400(SynchronizedLocationClient.this, new LocationClientException("Connection failed: SIGN_IN_REQUIRED"));
            return;
        }
    }

    public final void onConnectionSuspended(int i)
    {
        WLog.d(SynchronizedLocationClient.access$200(), "onDisconnected()");
        SynchronizedLocationClient.access$400(SynchronizedLocationClient.this, new LocationClientException("Unexpected disconnection."));
    }

    public final void onRemoveGeofencesByPendingIntentResult(Status status)
    {
        WLog.d(SynchronizedLocationClient.access$200(), "onRemoveGeofencesByPendingIntentResult()");
        switch (status.getStatusCode())
        {
        default:
            SynchronizedLocationClient.access$400(SynchronizedLocationClient.this, new LocationClientException(String.format("removeGeofences failed - unknown error: %d", new Object[] {
                Integer.valueOf(status.getStatusCode())
            })));
            return;

        case 0: // '\0'
            SynchronizedLocationClient.access$300(SynchronizedLocationClient.this);
            return;

        case 1000: 
            SynchronizedLocationClient.access$400(SynchronizedLocationClient.this, new LocationClientException("removeGeofences failed: GEOFENCE_NOT_AVAILABLE"));
            return;

        case 1: // '\001'
            SynchronizedLocationClient.access$400(SynchronizedLocationClient.this, new LocationClientException("removeGeofences failed: ERROR"));
            return;
        }
    }

    private ()
    {
        this$0 = SynchronizedLocationClient.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
