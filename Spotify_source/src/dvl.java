// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class dvl
{

    private final Map a = new HashMap();

    public dvl()
    {
    }

    public final int a(String s, int i)
    {
        this;
        JVM INSTR monitorenter ;
        Integer integer = Integer.valueOf(0);
        if (a.containsKey(s))
        {
            integer = (Integer)a.remove(s);
        }
        integer = Integer.valueOf(integer.intValue() + i);
        if (integer.intValue() > 0)
        {
            a.put(s, integer);
        }
        i = integer.intValue();
        this;
        JVM INSTR monitorexit ;
        return i;
        s;
        throw s;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("{ ");
        Iterator iterator = a.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            if (((Integer)entry.getValue()).intValue() > 0)
            {
                stringbuilder.append((String)entry.getKey()).append('=').append(entry.getValue()).append(' ');
            }
        } while (true);
        stringbuilder.append('}');
        return stringbuilder.toString();
    }
}
