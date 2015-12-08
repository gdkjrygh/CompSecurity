// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.api;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.worklight.location.api:
//            WLAcquisitionFailureCallbacksConfiguration, WLAcquisitionPolicy, WLTriggersConfiguration

public class WLLocationServicesConfiguration
    implements Cloneable
{

    private List failureCallbacks;
    private WLAcquisitionPolicy policy;
    private WLTriggersConfiguration triggers;

    public WLLocationServicesConfiguration()
    {
        policy = null;
        triggers = null;
        failureCallbacks = new ArrayList();
    }

    public WLLocationServicesConfiguration clone()
    {
        Object obj1 = null;
        ArrayList arraylist = new ArrayList(failureCallbacks.size());
        for (Iterator iterator = failureCallbacks.iterator(); iterator.hasNext(); arraylist.add(((WLAcquisitionFailureCallbacksConfiguration)iterator.next()).clone())) { }
        WLLocationServicesConfiguration wllocationservicesconfiguration = new WLLocationServicesConfiguration();
        Object obj;
        if (policy == null)
        {
            obj = null;
        } else
        {
            obj = policy.clone();
        }
        wllocationservicesconfiguration = wllocationservicesconfiguration.setPolicy(((WLAcquisitionPolicy) (obj)));
        if (triggers == null)
        {
            obj = obj1;
        } else
        {
            obj = triggers.clone();
        }
        return wllocationservicesconfiguration.setTriggers(((WLTriggersConfiguration) (obj))).setFailureCallbacks(arraylist);
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (WLLocationServicesConfiguration)obj;
        if (failureCallbacks == null)
        {
            if (((WLLocationServicesConfiguration) (obj)).failureCallbacks != null)
            {
                return false;
            }
        } else
        if (!failureCallbacks.equals(((WLLocationServicesConfiguration) (obj)).failureCallbacks))
        {
            return false;
        }
        if (policy == null)
        {
            if (((WLLocationServicesConfiguration) (obj)).policy != null)
            {
                return false;
            }
        } else
        if (!policy.equals(((WLLocationServicesConfiguration) (obj)).policy))
        {
            return false;
        }
        if (triggers != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((WLLocationServicesConfiguration) (obj)).triggers == null) goto _L1; else goto _L3
_L3:
        return false;
        if (triggers.equals(((WLLocationServicesConfiguration) (obj)).triggers)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public List getFailureCallbacks()
    {
        return failureCallbacks;
    }

    public WLAcquisitionPolicy getPolicy()
    {
        return policy;
    }

    public WLTriggersConfiguration getTriggers()
    {
        return triggers;
    }

    public int hashCode()
    {
        int k = 0;
        int i;
        int j;
        if (failureCallbacks == null)
        {
            i = 0;
        } else
        {
            i = failureCallbacks.hashCode();
        }
        if (policy == null)
        {
            j = 0;
        } else
        {
            j = policy.hashCode();
        }
        if (triggers != null)
        {
            k = triggers.hashCode();
        }
        return ((i + 31) * 31 + j) * 31 + k;
    }

    public WLLocationServicesConfiguration setFailureCallbacks(List list)
    {
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
        }
        failureCallbacks = ((List) (obj));
        return this;
    }

    public WLLocationServicesConfiguration setPolicy(WLAcquisitionPolicy wlacquisitionpolicy)
    {
        policy = wlacquisitionpolicy;
        return this;
    }

    public WLLocationServicesConfiguration setTriggers(WLTriggersConfiguration wltriggersconfiguration)
    {
        triggers = wltriggersconfiguration;
        return this;
    }
}
