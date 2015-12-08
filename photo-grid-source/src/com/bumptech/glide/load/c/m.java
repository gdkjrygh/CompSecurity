// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.c;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.bumptech.glide.load.c:
//            f, l

public final class m
    implements f
{

    private final Map c;
    private volatile Map d;

    m(Map map)
    {
        c = Collections.unmodifiableMap(map);
    }

    public final Map a()
    {
        if (d != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        if (d != null) goto _L4; else goto _L3
_L3:
        Object obj;
        Iterator iterator;
        obj = new HashMap();
        iterator = c.entrySet().iterator();
_L7:
        if (!iterator.hasNext()) goto _L6; else goto _L5
_L5:
        java.util.Map.Entry entry;
        StringBuilder stringbuilder;
        List list;
        entry = (java.util.Map.Entry)iterator.next();
        stringbuilder = new StringBuilder();
        list = (List)entry.getValue();
        int i = 0;
_L8:
        if (i < list.size())
        {
            stringbuilder.append(((l)list.get(i)).a());
            if (i != list.size() - 1)
            {
                stringbuilder.append(',');
            }
            break MISSING_BLOCK_LABEL_182;
        }
        ((Map) (obj)).put(entry.getKey(), stringbuilder.toString());
          goto _L7
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
_L6:
        d = Collections.unmodifiableMap(((Map) (obj)));
_L4:
        this;
        JVM INSTR monitorexit ;
_L2:
        return d;
        i++;
          goto _L8
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof m)
        {
            obj = (m)obj;
            return c.equals(((m) (obj)).c);
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        return c.hashCode();
    }

    public final String toString()
    {
        return (new StringBuilder("LazyHeaders{headers=")).append(c).append('}').toString();
    }
}
