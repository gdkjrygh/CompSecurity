// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.geo.triggerEvaluators;

import com.worklight.location.api.geo.WLGeoPosition;
import com.worklight.location.internal.geo.triggers.AbstractGeoAreaTrigger;

// Referenced classes of package com.worklight.location.internal.geo.triggerEvaluators:
//            GeoAreaTriggerEvaluator

abstract class AbstractGeoAreaTriggerEvaluator extends GeoAreaTriggerEvaluator
{

    private boolean wasPreviousPositionBad;

    public AbstractGeoAreaTriggerEvaluator(AbstractGeoAreaTrigger abstractgeoareatrigger, boolean flag)
    {
        super(abstractgeoareatrigger, flag);
    }

    public boolean evaluate(WLGeoPosition wlgeoposition)
    {
        updatePosition(wlgeoposition);
        if (!isInLimbo())
        {
            if (!isPositionGood())
            {
                wasPreviousPositionBad = true;
                return false;
            }
            if (wasPreviousPositionBad && isPositionGood())
            {
                wasPreviousPositionBad = false;
                return true;
            }
        }
        return false;
    }

    protected boolean isPositionGood()
    {
        if (shouldBeInside)
        {
            return isInsideArea();
        } else
        {
            return isOutsideArea();
        }
    }
}
