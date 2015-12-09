// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.multiscreen.device;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.samsung.multiscreen.device:
//            Device

public class h
{

    private static final Logger a;

    h()
    {
    }

    public static Device a(Map map)
    {
        if (map != null)
        {
            HashMap hashmap = new HashMap();
            map = map.entrySet().iterator();
            do
            {
                if (!map.hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
                if (entry.getValue() instanceof String)
                {
                    String s = (String)entry.getValue();
                    hashmap.put(entry.getKey(), s);
                }
            } while (true);
            return new Device(hashmap);
        } else
        {
            return null;
        }
    }

    static 
    {
        Logger logger = Logger.getLogger(com/samsung/multiscreen/device/h.getName());
        a = logger;
        logger.setLevel(Level.OFF);
    }
}
