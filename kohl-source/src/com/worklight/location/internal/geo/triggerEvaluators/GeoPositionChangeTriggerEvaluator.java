// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.geo.triggerEvaluators;

import com.worklight.location.api.geo.WLGeoPosition;
import com.worklight.location.api.geo.WLGeoUtils;
import com.worklight.location.api.geo.triggers.WLGeoPositionChangeTrigger;
import com.worklight.location.api.geo.triggers.WLGeoTrigger;
import com.worklight.location.internal.AbstractTrigger;

// Referenced classes of package com.worklight.location.internal.geo.triggerEvaluators:
//            GeoTriggerEvaluator

public class GeoPositionChangeTriggerEvaluator extends GeoTriggerEvaluator
{

    private WLGeoPosition previousPosition;

    public GeoPositionChangeTriggerEvaluator(WLGeoPositionChangeTrigger wlgeopositionchangetrigger)
    {
        super(wlgeopositionchangetrigger);
    }

    public boolean evaluate(WLGeoPosition wlgeoposition)
    {
        double d = getTriggerDefinition().getMinChangeDistance();
        if (wlgeoposition == null)
        {
            throw new IllegalArgumentException("position is null");
        }
        if (previousPosition == null)
        {
            previousPosition = wlgeoposition;
            return true;
        }
        if (wlgeoposition.equals(previousPosition))
        {
            return false;
        }
        if (WLGeoUtils.getDistanceBetweenCoordinates(wlgeoposition.getCoordinate(), previousPosition.getCoordinate()) >= d)
        {
            previousPosition = wlgeoposition;
            return true;
        } else
        {
            return false;
        }
    }

    public WLGeoPositionChangeTrigger getTriggerDefinition()
    {
        return (WLGeoPositionChangeTrigger)super.getTriggerDefinition();
    }

    public volatile WLGeoTrigger getTriggerDefinition()
    {
        return getTriggerDefinition();
    }

    public volatile AbstractTrigger getTriggerDefinition()
    {
        return getTriggerDefinition();
    }
}
