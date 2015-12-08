// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.events;

import android.location.Location;
import java.util.Set;
import org.json.JSONArray;

public interface IEventBroadcaster
{

    public abstract void sendGeoFenceEntryBroadcast(Set set, JSONArray jsonarray, Location location);

    public abstract void sendGeoFenceExitBroadcast(Set set, JSONArray jsonarray, Location location);
}
