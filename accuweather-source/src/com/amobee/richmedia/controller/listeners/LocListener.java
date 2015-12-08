// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.richmedia.controller.listeners;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import com.amobee.richmedia.controller.OrmmaLocationController;

public class LocListener
    implements LocationListener
{

    private LocationManager mLocMan;
    OrmmaLocationController mOrmmaLocationController;
    private String mProvider;

    public LocListener(Context context, int i, OrmmaLocationController ormmalocationcontroller, String s)
    {
        mOrmmaLocationController = ormmalocationcontroller;
        mLocMan = (LocationManager)context.getSystemService("location");
        mProvider = s;
    }

    public void onLocationChanged(Location location)
    {
        mOrmmaLocationController.success(location);
    }

    public void onProviderDisabled(String s)
    {
        mOrmmaLocationController.fail();
    }

    public void onProviderEnabled(String s)
    {
    }

    public void onStatusChanged(String s, int i, Bundle bundle)
    {
        if (i == 0)
        {
            mOrmmaLocationController.fail();
        }
    }

    public void start()
    {
        mLocMan.requestLocationUpdates(mProvider, 0L, 0.0F, this);
    }

    public void stop()
    {
        mLocMan.removeUpdates(this);
    }
}
