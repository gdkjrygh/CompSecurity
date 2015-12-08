// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.wifi.triggerEvaluators;

import com.worklight.location.api.wifi.triggers.WLWifiTrigger;
import com.worklight.location.internal.AbstractTrigger;
import com.worklight.location.internal.wifi.triggers.AbstractWifiAreaTrigger;
import com.worklight.location.internal.wifi.triggers.AbstractWifiDwellTrigger;

// Referenced classes of package com.worklight.location.internal.wifi.triggerEvaluators:
//            WifiAreaTriggerEvaluator, WifiInternalLocation

public abstract class WifiDwellingTrigger extends WifiAreaTriggerEvaluator
{

    private boolean alreadyEvaluatedAsDwelling;
    private final boolean shouldBeInside;
    private Long startDwellingTime;

    protected WifiDwellingTrigger(AbstractWifiDwellTrigger abstractwifidwelltrigger, boolean flag, boolean flag1)
    {
        super(abstractwifidwelltrigger, flag1);
        startDwellingTime = null;
        alreadyEvaluatedAsDwelling = false;
        shouldBeInside = flag;
    }

    public boolean evaluate(WifiInternalLocation wifiinternallocation)
    {
        Long long1;
        long1 = null;
        updatePosition(wifiinternallocation);
        if (startDwellingTime != null) goto _L2; else goto _L1
_L1:
        if (isInside() == shouldBeInside)
        {
            long1 = wifiinternallocation.getTimestamp();
        }
        startDwellingTime = long1;
        alreadyEvaluatedAsDwelling = false;
_L4:
        return false;
_L2:
        if (isInside() == shouldBeInside)
        {
            break; /* Loop/switch isn't completed */
        }
        startDwellingTime = null;
        if (true) goto _L4; else goto _L3
_L3:
        if (alreadyEvaluatedAsDwelling || isInside() != shouldBeInside || wifiinternallocation.getTimestamp().longValue() - startDwellingTime.longValue() < getTriggerDefinition().getDwellingTime()) goto _L4; else goto _L5
_L5:
        alreadyEvaluatedAsDwelling = true;
        return true;
    }

    public volatile WLWifiTrigger getTriggerDefinition()
    {
        return getTriggerDefinition();
    }

    public volatile AbstractTrigger getTriggerDefinition()
    {
        return getTriggerDefinition();
    }

    public volatile AbstractWifiAreaTrigger getTriggerDefinition()
    {
        return getTriggerDefinition();
    }

    public AbstractWifiDwellTrigger getTriggerDefinition()
    {
        return (AbstractWifiDwellTrigger)super.getTriggerDefinition();
    }
}
