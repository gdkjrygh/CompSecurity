// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.wifi.triggerEvaluators;

import com.worklight.location.internal.wifi.triggers.AbstractWifiAreaTrigger;

// Referenced classes of package com.worklight.location.internal.wifi.triggerEvaluators:
//            WifiAreaTriggerEvaluator, WifiInternalLocation

abstract class AbstractWifiAreaTriggerEvaluator extends WifiAreaTriggerEvaluator
{

    private final boolean shouldBeInside;
    private boolean wasPreviousPositionBad;

    public AbstractWifiAreaTriggerEvaluator(AbstractWifiAreaTrigger abstractwifiareatrigger, boolean flag, boolean flag1)
    {
        super(abstractwifiareatrigger, flag1);
        shouldBeInside = flag;
    }

    public boolean evaluate(WifiInternalLocation wifiinternallocation)
    {
        updatePosition(wifiinternallocation);
        if (isInside() != shouldBeInside)
        {
            wasPreviousPositionBad = true;
        } else
        if (wasPreviousPositionBad && isInside() == shouldBeInside)
        {
            wasPreviousPositionBad = false;
            return true;
        }
        return false;
    }
}
