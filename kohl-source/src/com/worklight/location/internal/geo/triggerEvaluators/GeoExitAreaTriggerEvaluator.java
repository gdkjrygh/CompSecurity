// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.geo.triggerEvaluators;

import com.worklight.location.api.geo.WLGeoPosition;
import com.worklight.location.api.geo.triggers.WLGeoExitTrigger;
import com.worklight.location.internal.geo.triggers.AbstractGeoAreaTrigger;

// Referenced classes of package com.worklight.location.internal.geo.triggerEvaluators:
//            AbstractGeoAreaTriggerEvaluator

public class GeoExitAreaTriggerEvaluator extends AbstractGeoAreaTriggerEvaluator
{

    public GeoExitAreaTriggerEvaluator(WLGeoExitTrigger wlgeoexittrigger)
    {
        super(wlgeoexittrigger, false);
    }

    public volatile boolean evaluate(WLGeoPosition wlgeoposition)
    {
        return super.evaluate(wlgeoposition);
    }

    public volatile AbstractGeoAreaTrigger getTriggerDefinition()
    {
        return super.getTriggerDefinition();
    }
}
