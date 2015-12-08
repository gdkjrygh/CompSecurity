// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class atd
    implements atb
{

    private final Map b;
    private volatile Map c;

    atd(Map map)
    {
        b = Collections.unmodifiableMap(map);
    }

    public final Map a()
    {
        if (c != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        Object obj;
        Iterator iterator;
        if (c != null)
        {
            break MISSING_BLOCK_LABEL_179;
        }
        obj = new HashMap();
        iterator = b.entrySet().iterator();
_L3:
        java.util.Map.Entry entry;
        StringBuilder stringbuilder;
        List list;
        int j;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_171;
        }
        entry = (java.util.Map.Entry)iterator.next();
        stringbuilder = new StringBuilder();
        list = (List)entry.getValue();
        j = list.size();
        for (int i = 0; i >= j; i++)
        {
            break MISSING_BLOCK_LABEL_145;
        }

        stringbuilder.append(((atc)list.get(i)).a());
        if (i != list.size() - 1)
        {
            stringbuilder.append(',');
        }
        break MISSING_BLOCK_LABEL_186;
        ((Map) (obj)).put(entry.getKey(), stringbuilder.toString());
          goto _L3
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        c = Collections.unmodifiableMap(((Map) (obj)));
        this;
        JVM INSTR monitorexit ;
_L2:
        return c;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof atd)
        {
            obj = (atd)obj;
            return b.equals(((atd) (obj)).b);
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        return b.hashCode();
    }

    public final String toString()
    {
        String s = String.valueOf("LazyHeaders{headers=");
        String s1 = String.valueOf(b);
        return (new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(s1).length())).append(s).append(s1).append("}").toString();
    }
}
