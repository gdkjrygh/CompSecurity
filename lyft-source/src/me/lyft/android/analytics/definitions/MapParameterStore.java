// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.definitions;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package me.lyft.android.analytics.definitions:
//            ParameterStore, Parameter

public class MapParameterStore extends ParameterStore
{

    Map map;

    public MapParameterStore()
    {
        map = new HashMap();
    }

    public Map getMap()
    {
        return Collections.unmodifiableMap(map);
    }

    protected Object getParameterInternal(Parameter parameter)
    {
        return map.get(parameter.toString());
    }

    public void overrideParameters(Map map1)
    {
        if (map1 != null && !map1.isEmpty())
        {
            String s;
            Object obj;
            for (Iterator iterator = map1.keySet().iterator(); iterator.hasNext(); putParameterInternal(Parameter.valueOf(s.toUpperCase()), obj))
            {
                s = (String)iterator.next();
                obj = map1.get(s);
            }

        }
    }

    protected void putParameterInternal(Parameter parameter, Object obj)
    {
        if (obj != null)
        {
            parameter = parameter.toString();
            map.put(parameter, obj);
        }
    }
}
