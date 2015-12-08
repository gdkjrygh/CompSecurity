// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.api;

import com.worklight.location.internal.AbstractTrigger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class WLTriggersConfiguration
    implements Cloneable
{

    private Map geoTriggers;
    private Map wifiTriggers;

    public WLTriggersConfiguration()
    {
        setGeoTriggers(null);
        setWifiTriggers(null);
    }

    private static Map deepCloneMap(Map map)
    {
        HashMap hashmap = new HashMap(map.size());
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); hashmap.put(entry.getKey(), ((AbstractTrigger)entry.getValue()).clone()))
        {
            entry = (java.util.Map.Entry)map.next();
        }

        return hashmap;
    }

    public WLTriggersConfiguration clone()
    {
        WLTriggersConfiguration wltriggersconfiguration = new WLTriggersConfiguration();
        wltriggersconfiguration.setGeoTriggers(deepCloneMap(geoTriggers));
        wltriggersconfiguration.setWifiTriggers(deepCloneMap(wifiTriggers));
        return wltriggersconfiguration;
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
        obj = (WLTriggersConfiguration)obj;
        if (geoTriggers == null)
        {
            if (((WLTriggersConfiguration) (obj)).geoTriggers != null)
            {
                return false;
            }
        } else
        if (!geoTriggers.equals(((WLTriggersConfiguration) (obj)).geoTriggers))
        {
            return false;
        }
        if (wifiTriggers != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((WLTriggersConfiguration) (obj)).wifiTriggers == null) goto _L1; else goto _L3
_L3:
        return false;
        if (wifiTriggers.equals(((WLTriggersConfiguration) (obj)).wifiTriggers)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public Map getGeoTriggers()
    {
        return geoTriggers;
    }

    public Map getWifiTriggers()
    {
        return wifiTriggers;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (geoTriggers == null)
        {
            i = 0;
        } else
        {
            i = geoTriggers.hashCode();
        }
        if (wifiTriggers != null)
        {
            j = wifiTriggers.hashCode();
        }
        return (i + 31) * 31 + j;
    }

    public WLTriggersConfiguration setGeoTriggers(Map map)
    {
        Object obj = map;
        if (map == null)
        {
            obj = new HashMap();
        }
        geoTriggers = ((Map) (obj));
        return this;
    }

    public WLTriggersConfiguration setWifiTriggers(Map map)
    {
        Object obj = map;
        if (map == null)
        {
            obj = new HashMap();
        }
        wifiTriggers = ((Map) (obj));
        return this;
    }
}
