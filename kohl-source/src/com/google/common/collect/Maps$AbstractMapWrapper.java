// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            Maps

private static final class map extends 
{

    private final Map map;

    public void clear()
    {
        map.clear();
    }

    public boolean containsKey(Object obj)
    {
        return map.containsKey(obj);
    }

    public boolean containsValue(Object obj)
    {
        return map.containsValue(obj);
    }

    protected Set createEntrySet()
    {
        return map.entrySet();
    }

    public boolean isEmpty()
    {
        return map.isEmpty();
    }

    public Object remove(Object obj)
    {
        return map.remove(obj);
    }

    public int size()
    {
        return map.size();
    }

    (Map map1)
    {
        map = (Map)Preconditions.checkNotNull(map1);
    }
}
