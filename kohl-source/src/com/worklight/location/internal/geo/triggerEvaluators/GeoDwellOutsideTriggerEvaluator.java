// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.geo.triggerEvaluators;

import com.worklight.location.api.WLDevice;
import com.worklight.location.api.WLLocationServicesConfiguration;
import com.worklight.location.api.geo.WLGeoAcquisitionPolicy;
import com.worklight.location.api.geo.WLGeoFailureCallback;
import com.worklight.location.api.geo.WLGeoPosition;
import com.worklight.location.api.geo.triggers.WLGeoDwellOutsideTrigger;
import com.worklight.location.internal.geo.triggers.AbstractGeoDwellTrigger;

// Referenced classes of package com.worklight.location.internal.geo.triggerEvaluators:
//            GeoDwellTriggerEvaluator

public class GeoDwellOutsideTriggerEvaluator extends GeoDwellTriggerEvaluator
{

    public GeoDwellOutsideTriggerEvaluator(WLGeoDwellOutsideTrigger wlgeodwelloutsidetrigger)
    {
        super(wlgeodwelloutsidetrigger, false);
    }

    public GeoDwellOutsideTriggerEvaluator(WLGeoDwellOutsideTrigger wlgeodwelloutsidetrigger, WLDevice wldevice, WLGeoAcquisitionPolicy wlgeoacquisitionpolicy, WLGeoFailureCallback wlgeofailurecallback)
    {
        super(wlgeodwelloutsidetrigger, false, wldevice, wlgeoacquisitionpolicy, wlgeofailurecallback);
    }

    public volatile boolean evaluate(WLGeoPosition wlgeoposition)
    {
        return super.evaluate(wlgeoposition);
    }

    public volatile AbstractGeoDwellTrigger getTriggerDefinition()
    {
        return super.getTriggerDefinition();
    }

    public volatile void notifyOfConfigurationUpdate(WLLocationServicesConfiguration wllocationservicesconfiguration)
    {
        super.notifyOfConfigurationUpdate(wllocationservicesconfiguration);
    }

    public volatile void preDestroy()
    {
        super.preDestroy();
    }
}
