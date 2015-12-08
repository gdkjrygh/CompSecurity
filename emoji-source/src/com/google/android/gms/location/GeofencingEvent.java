// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.content.Intent;
import android.location.Location;
import com.google.android.gms.internal.jh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GeofencingEvent
{

    private final int Vi;
    private final List Vj;
    private final Location Vk;
    private final int pJ;

    private GeofencingEvent(int i, int j, List list, Location location)
    {
        pJ = i;
        Vi = j;
        Vj = list;
        Vk = location;
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
        for (obj = ((ArrayList) (obj)).iterator(); ((Iterator) (obj)).hasNext(); intent.add(jh.h((byte[])((Iterator) (obj)).next()))) { }
        return intent;
    }

    public int getErrorCode()
    {
        return pJ;
    }

    public int getGeofenceTransition()
    {
        return Vi;
    }

    public List getTriggeringGeofences()
    {
        return Vj;
    }

    public Location getTriggeringLocation()
    {
        return Vk;
    }

    public boolean hasError()
    {
        return pJ != -1;
    }
}
