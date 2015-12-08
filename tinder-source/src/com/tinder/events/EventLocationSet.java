// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.events;

import android.location.Location;

public class EventLocationSet
{

    public boolean firstCache;
    public double latitute;
    public double longitude;

    public EventLocationSet(Location location, boolean flag)
    {
        latitute = location.getLatitude();
        longitude = location.getLongitude();
        firstCache = flag;
    }
}
