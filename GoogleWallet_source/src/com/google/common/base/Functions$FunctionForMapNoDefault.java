// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.io.Serializable;
import java.util.Map;

// Referenced classes of package com.google.common.base:
//            Function, Functions, Preconditions

static final class map
    implements Function, Serializable
{

    final Map map;

    public final Object apply(Object obj)
    {
        Object obj1 = map.get(obj);
        boolean flag;
        if (obj1 != null || map.containsKey(obj))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Key '%s' not present in map", new Object[] {
            obj
        });
        return obj1;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof map)
        {
            obj = (map)obj;
            return map.equals(((map) (obj)).map);
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        return map.hashCode();
    }

    public final String toString()
    {
        return (new StringBuilder("forMap(")).append(map).append(")").toString();
    }

    (Map map1)
    {
        map = (Map)Preconditions.checkNotNull(map1);
    }
}
