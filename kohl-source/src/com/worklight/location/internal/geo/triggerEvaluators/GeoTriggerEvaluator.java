// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.geo.triggerEvaluators;

import com.worklight.location.api.geo.WLGeoPosition;
import com.worklight.location.api.geo.triggers.WLGeoTrigger;
import com.worklight.location.internal.AbstractTrigger;
import com.worklight.location.internal.AbstractTriggerEvaluator;

public abstract class GeoTriggerEvaluator extends AbstractTriggerEvaluator
{

    public GeoTriggerEvaluator(WLGeoTrigger wlgeotrigger)
    {
        super(wlgeotrigger);
    }

    public abstract boolean evaluate(WLGeoPosition wlgeoposition);

    public WLGeoTrigger getTriggerDefinition()
    {
        return (WLGeoTrigger)super.getTriggerDefinition();
    }

    public volatile AbstractTrigger getTriggerDefinition()
    {
        return getTriggerDefinition();
    }
}
