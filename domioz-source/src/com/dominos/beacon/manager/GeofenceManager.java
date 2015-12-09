// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.beacon.manager;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.Manager;
import com.dominos.beacon.model.GeofenceData;
import com.dominos.beacon.service.GeofenceTransitionIntentService_;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.s;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.e;
import com.google.android.gms.location.f;
import com.google.android.gms.location.g;
import com.google.android.gms.location.i;
import com.google.android.gms.location.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GeofenceManager extends Manager
{

    private static final String TAG = com/dominos/beacon/manager/GeofenceManager.getSimpleName();
    Context mContext;
    private PendingIntent mGeofencePendingIntent;
    protected l mGoogleApiClient;
    private int mRadius;

    public GeofenceManager()
    {
    }

    private e createGeofence(Double double1, Double double2, float f1, int j)
    {
        return (new f()).a((new StringBuilder("geofence-id-")).append(String.valueOf(j)).toString()).a(double1.doubleValue(), double2.doubleValue(), f1).b().a().c();
    }

    private ArrayList createGeofencesFromLocation(List list)
    {
        ArrayList arraylist = new ArrayList();
        for (int j = 0; j < list.size(); j++)
        {
            double d = ((GeofenceData)list.get(j)).getLatitude();
            double d1 = ((GeofenceData)list.get(j)).getLongitude();
            e e1 = createGeofence(Double.valueOf(d), Double.valueOf(d1), mRadius, j);
            arraylist.add(e1);
            LogUtil.d(TAG, (new StringBuilder("Set Geofence at : ")).append(e1.f()).append(" ").append(d).append(":").append(d1).toString(), new Object[0]);
        }

        return arraylist;
    }

    private GeofencingRequest createGeofencingRequest(List list)
    {
        i j = new i();
        j.a();
        if (list != null && !list.isEmpty() && list != null && !list.isEmpty())
        {
            list = list.iterator();
            while (list.hasNext()) 
            {
                e e1 = (e)list.next();
                if (e1 != null)
                {
                    j.a(e1);
                }
            }
        }
        return j.b();
    }

    private PendingIntent getGeofenceTransitionPendingIntent()
    {
        if (mGeofencePendingIntent != null)
        {
            return mGeofencePendingIntent;
        } else
        {
            Intent intent = new Intent(mContext, com/dominos/beacon/service/GeofenceTransitionIntentService_);
            return PendingIntent.getService(mContext, 0, intent, 0x8000000);
        }
    }

    public String getName()
    {
        return "geofence_manager";
    }

    protected void onSessionSet()
    {
    }

    public void setRadius(int j)
    {
        mRadius = j;
    }

    public void setup()
    {
        mGeofencePendingIntent = null;
        mGoogleApiClient = (new m(mContext)).a(k.a).c();
    }

    public void setupGeofences(List list, final GeofenceCallback callback)
    {
        list = createGeofencesFromLocation(list);
        if (mGoogleApiClient.d().b())
        {
            k.c.a(mGoogleApiClient, createGeofencingRequest(list), getGeofenceTransitionPendingIntent()).a(new _cls1());
            return;
        } else
        {
            callback.onGeofenceSetFailure();
            return;
        }
    }



    private class _cls1
        implements v
    {

        final GeofenceManager this$0;
        final GeofenceCallback val$callback;

        public void onResult(Status status)
        {
            if (status.e())
            {
                LogUtil.d(GeofenceManager.TAG, "Geofence set successfully", new Object[0]);
                callback.onGeofenceSetSuccess();
                return;
            } else
            {
                callback.onGeofenceSetFailure();
                return;
            }
        }

        public volatile void onResult(u u)
        {
            onResult((Status)u);
        }

        _cls1()
        {
            this$0 = GeofenceManager.this;
            callback = geofencecallback;
            super();
        }
    }


    private class GeofenceCallback
    {

        public abstract void onGeofenceSetFailure();

        public abstract void onGeofenceSetSuccess();

        public GeofenceCallback()
        {
        }
    }

}
