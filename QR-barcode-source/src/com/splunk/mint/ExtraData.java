// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.splunk.mint;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class ExtraData extends HashMap
{

    private static final long serialVersionUID = 0xcf3443817e97b27fL;

    public ExtraData()
    {
    }

    public ExtraData(HashMap hashmap)
    {
        if (hashmap != null)
        {
            putAll(hashmap);
        }
    }

    public boolean addExtraData(ExtraData extradata)
    {
        if (extradata == null)
        {
            return false;
        }
        java.util.Map.Entry entry;
        for (extradata = extradata.entrySet().iterator(); extradata.hasNext(); put(entry.getKey(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)extradata.next();
        }

        return true;
    }

    public boolean addExtraData(String s, String s1)
    {
        if (s == null || s1 == null)
        {
            return false;
        } else
        {
            put(s, s1);
            return true;
        }
    }

    public boolean addExtraDataMap(HashMap hashmap)
    {
        if (hashmap == null)
        {
            return false;
        }
        java.util.Map.Entry entry;
        for (hashmap = hashmap.entrySet().iterator(); hashmap.hasNext(); put(entry.getKey(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)hashmap.next();
        }

        return true;
    }

    public void clearData()
    {
        clear();
    }

    public HashMap getExtraData()
    {
        return this;
    }

    public boolean removeKey(String s)
    {
        if (s != null && containsKey(s))
        {
            remove(s);
            return true;
        } else
        {
            return false;
        }
    }
}
