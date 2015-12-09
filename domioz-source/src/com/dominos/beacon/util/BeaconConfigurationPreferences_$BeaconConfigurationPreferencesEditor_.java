// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.beacon.util;

import android.content.SharedPreferences;
import org.androidannotations.api.c.c;
import org.androidannotations.api.c.e;
import org.androidannotations.api.c.h;
import org.androidannotations.api.c.j;
import org.androidannotations.api.c.o;

public final class  extends e
{

    public final h beaconVersionCode()
    {
        return intField("beaconVersionCode");
    }

    public final c enableAllStores()
    {
        return booleanField("enableAllStores");
    }

    public final h geoFenceRadius()
    {
        return intField("geoFenceRadius");
    }

    public final j lastGefenceSetTime()
    {
        return longField("lastGefenceSetTime");
    }

    public final o lastGefenceSetZipcode()
    {
        return stringField("lastGefenceSetZipcode");
    }

    public final h scanDelayInterval()
    {
        return intField("scanDelayInterval");
    }

    public final h scanDuration()
    {
        return intField("scanDuration");
    }

    public final o storeLocationInfo()
    {
        return stringField("storeLocationInfo");
    }

    public final c tabletSupported()
    {
        return booleanField("tabletSupported");
    }

    (SharedPreferences sharedpreferences)
    {
        super(sharedpreferences);
    }
}
