// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal;

import com.worklight.location.api.WLLocationServicesConfiguration;

// Referenced classes of package com.worklight.location.internal:
//            AbstractTrigger

public abstract class AbstractTriggerEvaluator
{

    private final AbstractTrigger triggerDefinition;

    public AbstractTriggerEvaluator(AbstractTrigger abstracttrigger)
    {
        if (abstracttrigger == null)
        {
            throw new IllegalArgumentException("triggerDefinition is null");
        } else
        {
            triggerDefinition = abstracttrigger;
            return;
        }
    }

    public AbstractTrigger getTriggerDefinition()
    {
        AbstractTrigger abstracttrigger1 = triggerDefinition.clone();
        AbstractTrigger abstracttrigger = abstracttrigger1;
        if (abstracttrigger1 == null)
        {
            abstracttrigger = triggerDefinition;
        }
        return abstracttrigger;
    }

    public void notifyOfConfigurationUpdate(WLLocationServicesConfiguration wllocationservicesconfiguration)
    {
    }

    public void preDestroy()
    {
    }
}
