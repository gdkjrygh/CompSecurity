// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.nkzawa.e;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class a
{

    public static String a(Map map)
    {
        StringBuilder stringbuilder = new StringBuilder();
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); stringbuilder.append(com.github.nkzawa.c.a.a((String)entry.getKey())).append("=").append(com.github.nkzawa.c.a.a((String)entry.getValue())))
        {
            entry = (java.util.Map.Entry)map.next();
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append("&");
            }
        }

        return stringbuilder.toString();
    }

    public static Map a(String s)
    {
        HashMap hashmap = new HashMap();
        String as[] = s.split("&");
        int j = as.length;
        int i = 0;
        while (i < j) 
        {
            s = as[i].split("=");
            String s1 = com.github.nkzawa.c.a.b(s[0]);
            if (s.length > 1)
            {
                s = com.github.nkzawa.c.a.b(s[1]);
            } else
            {
                s = "";
            }
            hashmap.put(s1, s);
            i++;
        }
        return hashmap;
    }
}
