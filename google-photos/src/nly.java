// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

final class nly
{

    final Map a;

    public nly(Map map)
    {
        a = Collections.unmodifiableMap(a(map));
    }

    static String a(String s)
    {
        if (s == null)
        {
            return s;
        } else
        {
            return s.toLowerCase(Locale.US);
        }
    }

    private static Map a(Map map)
    {
        HashMap hashmap = new HashMap();
        String s;
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); hashmap.put(a(s), map.get(s)))
        {
            s = (String)iterator.next();
        }

        return hashmap;
    }
}
