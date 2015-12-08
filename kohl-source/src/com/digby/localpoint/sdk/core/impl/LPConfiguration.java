// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.localpoint.sdk.core.impl;

import android.content.Context;
import com.digby.mm.android.library.utils.impl.Settings;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class LPConfiguration
{

    private static LPConfiguration theConfiguration = null;
    private String asString;
    private final String brand;
    private final boolean broadcastEnabled;
    private final String localpointAppID;
    private final int searchRadius;
    private final String server;

    private LPConfiguration(String s, String s1, String s2, int i, boolean flag)
    {
        brand = s;
        localpointAppID = s1;
        server = s2;
        searchRadius = i;
        broadcastEnabled = flag;
    }

    public static LPConfiguration getInstance(Context context)
    {
        com/digby/localpoint/sdk/core/impl/LPConfiguration;
        JVM INSTR monitorenter ;
        if (theConfiguration == null) goto _L2; else goto _L1
_L1:
        context = theConfiguration;
_L4:
        com/digby/localpoint/sdk/core/impl/LPConfiguration;
        JVM INSTR monitorexit ;
        return context;
_L2:
        context = Settings.getInstance(context.getApplicationContext());
        theConfiguration = new LPConfiguration(context.getBrandCode(), context.getAppID(), context.getServer(), context.getSearchRadiusInMeters(), false);
        context = theConfiguration;
        if (true) goto _L4; else goto _L3
_L3:
        context;
        throw context;
    }

    public String getAppID()
    {
        return localpointAppID;
    }

    public String getBrand()
    {
        return brand;
    }

    public String getLocalpointServerRootURL()
    {
        return String.format("https://%s.api.%sdigby.com", new Object[] {
            getBrand(), getServer()
        });
    }

    public int getSearchRadius()
    {
        return searchRadius;
    }

    public String getServer()
    {
        return server;
    }

    public boolean isBroadcastEnabled()
    {
        return broadcastEnabled;
    }

    public String toString()
    {
        if (asString == null)
        {
            asString = (new ToStringBuilder(this)).append(brand).append(localpointAppID).append(server).append(searchRadius).append(broadcastEnabled).toString();
        }
        return asString;
    }

}
