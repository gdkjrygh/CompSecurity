// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.geo.triggerEvaluators;

import com.worklight.location.api.WLConfidenceLevel;
import com.worklight.location.api.geo.WLGeoPosition;
import com.worklight.location.api.geo.WLGeoUtils;
import com.worklight.location.api.geo.triggers.WLGeoTrigger;
import com.worklight.location.internal.AbstractTrigger;
import com.worklight.location.internal.geo.triggers.AbstractGeoAreaTrigger;

// Referenced classes of package com.worklight.location.internal.geo.triggerEvaluators:
//            GeoTriggerEvaluator

abstract class GeoAreaTriggerEvaluator extends GeoTriggerEvaluator
{

    private Boolean isInsideArea;
    protected final boolean shouldBeInside;

    protected GeoAreaTriggerEvaluator(AbstractGeoAreaTrigger abstractgeoareatrigger, boolean flag)
    {
        super(abstractgeoareatrigger);
        isInsideArea = null;
        shouldBeInside = flag;
    }

    public volatile WLGeoTrigger getTriggerDefinition()
    {
        return getTriggerDefinition();
    }

    public volatile AbstractTrigger getTriggerDefinition()
    {
        return getTriggerDefinition();
    }

    public AbstractGeoAreaTrigger getTriggerDefinition()
    {
        return (AbstractGeoAreaTrigger)super.getTriggerDefinition();
    }

    protected boolean isInLimbo()
    {
        return isInsideArea == null;
    }

    protected boolean isInsideArea()
    {
        return !isInLimbo() && isInsideArea.booleanValue();
    }

    protected boolean isOutsideArea()
    {
        return !isInLimbo() && !isInsideArea.booleanValue();
    }

    protected void updatePosition(WLGeoPosition wlgeoposition)
    {
        boolean flag;
        boolean flag1;
        com.worklight.location.api.geo.WLArea wlarea = getTriggerDefinition().getArea();
        WLConfidenceLevel wlconfidencelevel = getTriggerDefinition().getConfidenceLevel();
        double d = getTriggerDefinition().getBufferZoneWidth();
        com.worklight.location.api.geo.WLCoordinate wlcoordinate = wlgeoposition.getCoordinate();
        WLConfidenceLevel wlconfidencelevel1;
        if (shouldBeInside)
        {
            wlconfidencelevel1 = wlconfidencelevel;
        } else
        {
            wlconfidencelevel1 = WLConfidenceLevel.LOW;
        }
        flag = WLGeoUtils.isInsideArea(wlcoordinate, wlarea, d, wlconfidencelevel1);
        wlgeoposition = wlgeoposition.getCoordinate();
        if (shouldBeInside)
        {
            wlconfidencelevel = WLConfidenceLevel.LOW;
        }
        flag1 = WLGeoUtils.isOutsideArea(wlgeoposition, wlarea, d, wlconfidencelevel);
        if (isInsideArea != null) goto _L2; else goto _L1
_L1:
        if (!flag) goto _L4; else goto _L3
_L3:
        isInsideArea = Boolean.valueOf(true);
_L6:
        return;
_L4:
        if (!flag1) goto _L6; else goto _L5
_L5:
        isInsideArea = Boolean.valueOf(false);
        return;
_L2:
        if (!isInsideArea.booleanValue())
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!flag1) goto _L6; else goto _L7
_L7:
        isInsideArea = Boolean.valueOf(false);
        return;
        if (!flag) goto _L6; else goto _L8
_L8:
        isInsideArea = Boolean.valueOf(true);
        return;
    }
}
