// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.b;

import com.google.common.a.hq;
import com.google.common.a.ik;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class c extends AbstractMap
{

    private static Class a = com/facebook/common/b/c;
    private final Comparator b;
    private final Map c = ik.a();
    private final List d = hq.a();
    private final Map e;
    private final List f;

    public c(Comparator comparator)
    {
        b = comparator;
        e = Collections.unmodifiableMap(c);
        f = Collections.unmodifiableList(d);
    }

    public List a()
    {
        return f;
    }

    public void clear()
    {
        c.clear();
        d.clear();
    }

    public boolean containsKey(Object obj)
    {
        return c.containsKey(obj);
    }

    public Set entrySet()
    {
        return e.entrySet();
    }

    public Object get(Object obj)
    {
        return c.get(obj);
    }

    public Object put(Object obj, Object obj1)
    {
        Object obj2 = remove(obj);
        int j = Collections.binarySearch(d, obj1, b);
        int i = j;
        if (j < 0)
        {
            i = -(j + 1);
        }
        d.add(i, obj1);
        c.put(obj, obj1);
        return obj2;
    }

    public Object remove(Object obj)
    {
label0:
        {
            obj = c.remove(obj);
            if (obj == null)
            {
                break label0;
            }
            int j = Collections.binarySearch(d, obj, b);
            int i = j;
            if (j < 0)
            {
                throw new RuntimeException("The collection is in an invalid state");
            }
            do
            {
                if (i >= d.size())
                {
                    break label0;
                }
                if (obj != d.get(i))
                {
                    i++;
                } else
                {
                    break;
                }
            } while (true);
            d.remove(i);
        }
        return obj;
    }

    public int size()
    {
        return c.size();
    }

}
