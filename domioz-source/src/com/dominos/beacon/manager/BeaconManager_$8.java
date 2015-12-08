// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.beacon.manager;

import android.location.Location;
import org.androidannotations.api.c;

// Referenced classes of package com.dominos.beacon.manager:
//            BeaconManager_

class val.currentZipCode extends c
{

    final BeaconManager_ this$0;
    final Location val$currentLocation;
    final String val$currentZipCode;

    public void execute()
    {
        try
        {
            BeaconManager_.access$701(BeaconManager_.this, val$currentLocation, val$currentZipCode);
            return;
        }
        catch (Throwable throwable)
        {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
        }
    }

    (String s1, Location location, String s2)
    {
        this$0 = final_beaconmanager_;
        val$currentLocation = location;
        val$currentZipCode = s2;
        super(final_s, I.this, s1);
    }
}
