// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.io.Serializable;
import java.util.Map;

// Referenced classes of package com.google.common.base:
//            Function, Functions, Preconditions, Objects

private static class defaultValue
    implements Function, Serializable
{

    private static final long serialVersionUID = 0L;
    final Object defaultValue;
    final Map map;

    public Object apply(Object obj)
    {
        Object obj1 = map.get(obj);
        if (obj1 != null || map.containsKey(obj))
        {
            return obj1;
        } else
        {
            return defaultValue;
        }
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof defaultValue)
        {
            obj = (defaultValue)obj;
            flag = flag1;
            if (map.equals(((map) (obj)).map))
            {
                flag = flag1;
                if (Objects.equal(defaultValue, ((defaultValue) (obj)).defaultValue))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return Objects.hashCode(new Object[] {
            map, defaultValue
        });
    }

    public String toString()
    {
        return (new StringBuilder()).append("forMap(").append(map).append(", defaultValue=").append(defaultValue).append(")").toString();
    }

    (Map map1, Object obj)
    {
        map = (Map)Preconditions.checkNotNull(map1);
        defaultValue = obj;
    }
}
