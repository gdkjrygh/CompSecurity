// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.fitbit.util:
//            w

public class bs
    implements Map
{

    public static final String a = "distance";
    public static final String b = "elevation";
    public static final String c = "height";
    public static final String d = "weight";
    public static final String e = "measurements";
    public static final String f = "liquids";
    private final Map g = new HashMap();

    public bs(Locale locale)
    {
        HashMap hashmap = new HashMap();
        if (locale.equals(Locale.US))
        {
            hashmap.put("distance", com.fitbit.data.domain.Length.LengthUnits.MILES.getSerializableName());
            hashmap.put("elevation", com.fitbit.data.domain.Length.LengthUnits.FEET.getSerializableName());
            hashmap.put("height", com.fitbit.data.domain.Length.LengthUnits.FEET.getSerializableName());
            hashmap.put("weight", com.fitbit.data.domain.WeightLogEntry.WeightUnits.LBS.getSerializableName());
            hashmap.put("measurements", com.fitbit.data.domain.Length.LengthUnits.INCH.getSerializableName());
            hashmap.put("liquids", com.fitbit.data.domain.WaterLogEntry.WaterUnits.OZ.getSerializableName());
        } else
        if (locale.equals(Locale.UK))
        {
            hashmap.put("distance", com.fitbit.data.domain.Length.LengthUnits.KM.getSerializableName());
            hashmap.put("elevation", com.fitbit.data.domain.Length.LengthUnits.METERS.getSerializableName());
            hashmap.put("height", com.fitbit.data.domain.Length.LengthUnits.CM.getSerializableName());
            hashmap.put("weight", com.fitbit.data.domain.WeightLogEntry.WeightUnits.STONE.getSerializableName());
            hashmap.put("measurements", com.fitbit.data.domain.Length.LengthUnits.CM.getSerializableName());
            hashmap.put("liquids", com.fitbit.data.domain.WaterLogEntry.WaterUnits.ML.getSerializableName());
        } else
        {
            hashmap.put("distance", com.fitbit.data.domain.Length.LengthUnits.KM.getSerializableName());
            hashmap.put("elevation", com.fitbit.data.domain.Length.LengthUnits.METERS.getSerializableName());
            hashmap.put("height", com.fitbit.data.domain.Length.LengthUnits.CM.getSerializableName());
            hashmap.put("weight", com.fitbit.data.domain.WeightLogEntry.WeightUnits.KG.getSerializableName());
            hashmap.put("measurements", com.fitbit.data.domain.Length.LengthUnits.CM.getSerializableName());
            hashmap.put("liquids", com.fitbit.data.domain.WaterLogEntry.WaterUnits.ML.getSerializableName());
        }
        a(hashmap);
    }

    public Enum a(String s, Class class1)
    {
        return w.a((String)g.get(s), class1);
    }

    public String a(Object obj)
    {
        return (String)g.get(obj);
    }

    public String a(String s, String s1)
    {
        throw new UnsupportedOperationException();
    }

    void a(Map map)
    {
        g.clear();
        g.putAll(map);
    }

    public String b(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public void clear()
    {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(Object obj)
    {
        return g.containsKey(obj);
    }

    public boolean containsValue(Object obj)
    {
        return g.containsValue(obj);
    }

    public Set entrySet()
    {
        return g.entrySet();
    }

    public Object get(Object obj)
    {
        return a(obj);
    }

    public boolean isEmpty()
    {
        return g.isEmpty();
    }

    public Set keySet()
    {
        return g.keySet();
    }

    public Object put(Object obj, Object obj1)
    {
        return a((String)obj, (String)obj1);
    }

    public void putAll(Map map)
    {
        throw new UnsupportedOperationException();
    }

    public Object remove(Object obj)
    {
        return b(obj);
    }

    public int size()
    {
        return g.size();
    }

    public Collection values()
    {
        return g.values();
    }
}
