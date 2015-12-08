// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.geo.triggers;

import com.worklight.location.api.WLConfidenceLevel;
import com.worklight.location.api.geo.WLArea;
import com.worklight.location.api.geo.triggers.WLGeoTrigger;

public abstract class AbstractGeoAreaTrigger extends WLGeoTrigger
{

    private WLArea area;
    private double bufferZoneWidth;
    private WLConfidenceLevel confidenceLevel;

    public AbstractGeoAreaTrigger()
    {
        bufferZoneWidth = 0.0D;
        confidenceLevel = WLConfidenceLevel.LOW;
    }

    public WLArea getArea()
    {
        return area;
    }

    public double getBufferZoneWidth()
    {
        return bufferZoneWidth;
    }

    public WLConfidenceLevel getConfidenceLevel()
    {
        return confidenceLevel;
    }

    public AbstractGeoAreaTrigger setArea(WLArea wlarea)
    {
        area = wlarea;
        return this;
    }

    public AbstractGeoAreaTrigger setBufferZoneWidth(double d)
    {
        bufferZoneWidth = d;
        return this;
    }

    public AbstractGeoAreaTrigger setConfidenceLevel(WLConfidenceLevel wlconfidencelevel)
    {
        confidenceLevel = wlconfidencelevel;
        return this;
    }
}
