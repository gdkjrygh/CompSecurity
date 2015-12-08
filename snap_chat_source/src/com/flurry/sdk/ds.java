// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ds
{

    private final Map a = new HashMap();
    private int b;

    public ds()
    {
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
}
