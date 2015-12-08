// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class jt
{

    private final Map a;
    private int b;

    public jt()
    {
        a = new HashMap();
    }

    public jt(Map map)
    {
        a = map;
    }

    private List a(Object obj, boolean flag)
    {
        List list = (List)a.get(obj);
        Object obj1 = list;
        if (flag)
        {
            obj1 = list;
            if (list == null)
            {
                if (b > 0)
                {
                    obj1 = new ArrayList(b);
                } else
                {
                    obj1 = new ArrayList();
                }
                a.put(obj, obj1);
            }
        }
        return ((List) (obj1));
    }

    public List a(Object obj)
    {
        if (obj == null)
        {
            obj = Collections.emptyList();
        } else
        {
            List list = a(obj, false);
            obj = list;
            if (list == null)
            {
                return Collections.emptyList();
            }
        }
        return ((List) (obj));
    }

    public void a()
    {
        a.clear();
    }

    public void a(jt jt1)
    {
        if (jt1 != null)
        {
            jt1 = jt1.a.entrySet().iterator();
            while (jt1.hasNext()) 
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)jt1.next();
                a(entry.getKey(), true).addAll((Collection)entry.getValue());
            }
        }
    }

    public void a(Object obj, Object obj1)
    {
        if (obj == null)
        {
            return;
        } else
        {
            a(obj, true).add(obj1);
            return;
        }
    }

    public Collection b()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = a.entrySet().iterator(); iterator.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            Iterator iterator1 = ((List)entry.getValue()).iterator();
            while (iterator1.hasNext()) 
            {
                Object obj = iterator1.next();
                arraylist.add(new java.util.AbstractMap.SimpleImmutableEntry(entry.getKey(), obj));
            }
        }

        return arraylist;
    }

    public boolean b(Object obj)
    {
        if (obj == null)
        {
            return false;
        }
        return (List)a.remove(obj) != null;
    }

    public boolean b(Object obj, Object obj1)
    {
        boolean flag = false;
        List list;
        if (obj != null)
        {
            if ((list = a(obj, false)) != null)
            {
                boolean flag1 = list.remove(obj1);
                flag = flag1;
                if (list.size() == 0)
                {
                    a.remove(obj);
                    return flag1;
                }
            }
        }
        return flag;
    }

    public Set c()
    {
        return a.keySet();
    }

    public boolean c(Object obj)
    {
        if (obj == null)
        {
            return false;
        } else
        {
            return a.containsKey(obj);
        }
    }

    public boolean c(Object obj, Object obj1)
    {
        if (obj != null)
        {
            if ((obj = a(obj, false)) != null)
            {
                return ((List) (obj)).contains(obj1);
            }
        }
        return false;
    }

    public Collection d()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = a.entrySet().iterator(); iterator.hasNext(); arraylist.addAll((Collection)((java.util.Map.Entry)iterator.next()).getValue())) { }
        return arraylist;
    }
}
