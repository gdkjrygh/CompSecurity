// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.slf4j.helpers;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.slf4j.spi.MDCAdapter;

public class BasicMDCAdapter
    implements MDCAdapter
{

    private InheritableThreadLocal inheritableThreadLocal;

    public BasicMDCAdapter()
    {
        inheritableThreadLocal = new InheritableThreadLocal();
    }

    public void clear()
    {
        HashMap hashmap = (HashMap)inheritableThreadLocal.get();
        if (hashmap != null)
        {
            hashmap.clear();
            inheritableThreadLocal.remove();
        }
    }

    public String get(String s)
    {
        HashMap hashmap = (HashMap)inheritableThreadLocal.get();
        if (hashmap != null && s != null)
        {
            return (String)hashmap.get(s);
        } else
        {
            return null;
        }
    }

    public Map getCopyOfContextMap()
    {
        HashMap hashmap = (HashMap)inheritableThreadLocal.get();
        if (hashmap != null)
        {
            return new HashMap(hashmap);
        } else
        {
            return null;
        }
    }

    public Set getKeys()
    {
        HashMap hashmap = (HashMap)inheritableThreadLocal.get();
        if (hashmap != null)
        {
            return hashmap.keySet();
        } else
        {
            return null;
        }
    }

    public void put(String s, String s1)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("key cannot be null");
        }
        HashMap hashmap1 = (HashMap)inheritableThreadLocal.get();
        HashMap hashmap = hashmap1;
        if (hashmap1 == null)
        {
            hashmap = new HashMap();
            inheritableThreadLocal.set(hashmap);
        }
        hashmap.put(s, s1);
    }

    public void remove(String s)
    {
        HashMap hashmap = (HashMap)inheritableThreadLocal.get();
        if (hashmap != null)
        {
            hashmap.remove(s);
        }
    }

    public void setContextMap(Map map)
    {
        HashMap hashmap = (HashMap)inheritableThreadLocal.get();
        if (hashmap != null)
        {
            hashmap.clear();
            hashmap.putAll(map);
            return;
        } else
        {
            map = new HashMap(map);
            inheritableThreadLocal.set(map);
            return;
        }
    }
}
