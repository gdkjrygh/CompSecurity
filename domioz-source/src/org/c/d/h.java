// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.d;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public final class h extends LinkedHashMap
{

    private final Map a;
    private final Locale b;

    public h()
    {
        this(((Locale) (null)));
    }

    public h(int i)
    {
        this(i, null);
    }

    public h(int i, Locale locale)
    {
        super(i);
        a = new HashMap(i);
        if (locale == null)
        {
            locale = Locale.getDefault();
        }
        b = locale;
    }

    public h(Locale locale)
    {
        a = new HashMap();
        if (locale == null)
        {
            locale = Locale.getDefault();
        }
        b = locale;
    }

    private String a(String s)
    {
        return s.toLowerCase(b);
    }

    public final void clear()
    {
        a.clear();
        super.clear();
    }

    public final boolean containsKey(Object obj)
    {
        return (obj instanceof String) && a.containsKey(a((String)obj));
    }

    public final Object get(Object obj)
    {
        if (obj instanceof String)
        {
            return super.get(a.get(a((String)obj)));
        } else
        {
            return null;
        }
    }

    public final volatile Object put(Object obj, Object obj1)
    {
        return put((String)obj, obj1);
    }

    public final Object put(String s, Object obj)
    {
        a.put(a(s), s);
        return super.put(s, obj);
    }

    public final void putAll(Map map)
    {
        if (!map.isEmpty())
        {
            map = map.entrySet().iterator();
            while (map.hasNext()) 
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
                put((String)entry.getKey(), entry.getValue());
            }
        }
    }

    public final Object remove(Object obj)
    {
        if (obj instanceof String)
        {
            return super.remove(a.remove(a((String)obj)));
        } else
        {
            return null;
        }
    }
}
