// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util.config;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ConfigParams
    implements Serializable
{

    private static final long serialVersionUID = 0x6100e8eeb7dbaf0eL;
    private final Map map;

    public ConfigParams(Map map1)
    {
        map = map1;
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        }
        obj = (ConfigParams)obj;
        if (map != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((ConfigParams) (obj)).map == null) goto _L1; else goto _L3
_L3:
        return false;
        if (map.equals(((ConfigParams) (obj)).map)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public Boolean getBoolean(String s, Boolean boolean1)
    {
        Object obj;
        try
        {
            obj = map.get(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return boolean1;
        }
        s = boolean1;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        s = (Boolean)obj;
        return s;
    }

    public Double getDouble(String s, Double double1)
    {
        Object obj;
        try
        {
            obj = map.get(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return double1;
        }
        s = double1;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        s = (Double)obj;
        return s;
    }

    public Integer getInteger(String s, Integer integer)
    {
        Object obj;
        try
        {
            obj = map.get(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return integer;
        }
        s = integer;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        s = (Integer)obj;
        return s;
    }

    public Long getLong(String s, Long long1)
    {
        Object obj;
        try
        {
            obj = map.get(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return long1;
        }
        s = long1;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        s = (Long)obj;
        return s;
    }

    public String getString(String s, String s1)
    {
        Object obj;
        try
        {
            obj = map.get(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return s1;
        }
        s = s1;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        s = (String)obj;
        return s;
    }

    public int hashCode()
    {
        int i;
        if (map == null)
        {
            i = 0;
        } else
        {
            i = map.hashCode();
        }
        return i + 31;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(getClass().getSimpleName());
        stringbuilder.append(" { ");
        boolean flag = false;
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) 
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            if (flag)
            {
                stringbuilder.append(", ");
            } else
            {
                flag = true;
            }
            stringbuilder.append("[");
            stringbuilder.append((String)entry.getKey());
            stringbuilder.append("]='");
            stringbuilder.append(entry.getValue());
            stringbuilder.append("':");
            stringbuilder.append(entry.getValue().getClass().getSimpleName());
        }
        stringbuilder.append(" }");
        return stringbuilder.toString();
    }
}
