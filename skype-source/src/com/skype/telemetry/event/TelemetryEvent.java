// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.telemetry.event;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TelemetryEvent
{

    private HashMap attributes;
    private String name;

    public TelemetryEvent(String s)
    {
        name = s;
    }

    public TelemetryEvent(String s, HashMap hashmap)
    {
        name = s;
        attributes = hashmap;
    }

    public Map getAttributes()
    {
        if (attributes == null)
        {
            attributes = new HashMap();
        }
        return attributes;
    }

    public Map getAttributesAsMapString()
    {
        if (attributes != null) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        return ((Map) (obj));
_L2:
        HashMap hashmap = new HashMap();
        Iterator iterator = attributes.entrySet().iterator();
        do
        {
            obj = hashmap;
            if (!iterator.hasNext())
            {
                continue;
            }
            obj = (java.util.Map.Entry)iterator.next();
            hashmap.put(((java.util.Map.Entry) (obj)).getKey(), String.valueOf(((java.util.Map.Entry) (obj)).getValue()));
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public String getName()
    {
        return name;
    }

    public boolean hasAttributes()
    {
        return attributes != null && attributes.size() > 0;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (hasAttributes())
        {
            java.util.Map.Entry entry;
            for (Iterator iterator = getAttributesAsMapString().entrySet().iterator(); iterator.hasNext(); stringbuilder.append((String)entry.getValue()))
            {
                entry = (java.util.Map.Entry)iterator.next();
                stringbuilder.append(" ");
                stringbuilder.append((String)entry.getKey());
                stringbuilder.append(":");
            }

        }
        return String.format("Name: %s, Parameters:%s", new Object[] {
            getName(), stringbuilder.toString()
        });
    }
}
