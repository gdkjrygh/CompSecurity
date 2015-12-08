// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.content.Intent;
import android.location.Location;
import com.google.android.gms.internal.ji;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GeofencingEvent
{

    private final int Vf;
    private final List Vg;
    private final Location Vh;
    private final int pH;

    private GeofencingEvent(int i, int j, List list, Location location)
    {
        pH = i;
        Vf = j;
        Vg = list;
        Vh = location;
    }

    public static GeofencingEvent fromIntent(Intent intent)
    {
        if (intent == null)
        {
            return null;
        } else
        {
            return new GeofencingEvent(intent.getIntExtra("gms_error_code", -1), getGeofenceTransition(intent), getTriggeringGeofences(intent), (Location)intent.getParcelableExtra("com.google.android.location.intent.extra.triggering_location"));
        }
    }

    private static int getGeofenceTransition(Intent intent)
    {
        int i;
        for (i = intent.getIntExtra("com.google.android.location.intent.extra.transition", -1); i == -1 || i != 1 && i != 2 && i != 4;)
        {
            return -1;
        }

        return i;
    }

    private static List getTriggeringGeofences(Intent intent)
    {
        Object obj = (ArrayList)intent.getSerializableExtra("com.google.android.location.intent.extra.geofence_list");
        if (obj == null)
        {
            return null;
        }
        intent = new ArrayList(((ArrayList) (obj)).size());
        for (obj = ((ArrayList) (obj)).iterator(); ((Iterator) (obj)).hasNext(); intent.add(ji.h((byte[])((Iterator) (obj)).next()))) { }
        return intent;
    }

    public int getErrorCode()
    {
        return pH;
    }

    public int getGeofenceTransition()
    {
        return Vf;
    }

    public List getTriggeringGeofences()
    {
        return Vg;
    }

    public Location getTriggeringLocation()
    {
        return Vh;
    }

    public boolean hasError()
    {
        return pH != -1;
    }
}
