// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.json.jsonmirror;

import com.google.common.a.ik;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.facebook.common.json.jsonmirror:
//            b

public class d
    implements b, Serializable, Map
{

    private HashMap a;
    private Class b;

    public d(Class class1)
    {
        a = ik.a();
        b = class1;
    }

    public Object a(String s, Object obj)
    {
        return a.put(s, obj);
    }

    public void clear()
    {
        a.clear();
    }

    public boolean containsKey(Object obj)
    {
        return a.containsKey(obj);
    }

    public boolean containsValue(Object obj)
    {
        return a.containsValue(obj);
    }

    public Set entrySet()
    {
        return a.entrySet();
    }

    public Object get(Object obj)
    {
        return a.get(obj);
    }

    public int hashCode()
    {
        return a.hashCode();
    }

    public boolean isEmpty()
    {
        return a.isEmpty();
    }

    public Set keySet()
    {
        return a.keySet();
    }

    public Object put(Object obj, Object obj1)
    {
        return a((String)obj, obj1);
    }

    public void putAll(Map map)
    {
        a.putAll(map);
    }

    public Object remove(Object obj)
    {
        return a.remove(obj);
    }

    public int size()
    {
        return a.size();
    }

    public String toString()
    {
        return (new StringBuilder()).append("JMDynamicKeysDict").append(a.toString()).toString();
    }

    public Collection values()
    {
        return a.values();
    }
}
