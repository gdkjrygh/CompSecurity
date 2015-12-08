// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.api;

import com.worklight.location.api.geo.WLGeoPosition;
import com.worklight.location.api.wifi.WLWifiLocation;
import org.json.JSONObject;

public interface WLDeviceContext
{

    public abstract void addToEvent(JSONObject jsonobject);

    public abstract WLGeoPosition getGeoPosition();

    public abstract JSONObject getJSON();

    public abstract Long getLastModified();

    public abstract Integer getTimezoneOffset();

    public abstract WLWifiLocation getWifiLocation();
}
