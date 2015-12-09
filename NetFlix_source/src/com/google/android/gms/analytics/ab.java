// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class ab
{

    private final Map vt = new HashMap();
    private final Map vu = new HashMap();
    private final boolean vv;
    private final String vw;

    ab(String s, boolean flag)
    {
        vv = flag;
        vw = s;
    }

    void c(String s, int i)
    {
        if (!vv)
        {
            return;
        }
        Integer integer1 = (Integer)vt.get(s);
        Integer integer = integer1;
        if (integer1 == null)
        {
            integer = Integer.valueOf(0);
        }
        vt.put(s, Integer.valueOf(integer.intValue() + i));
    }

    String cU()
    {
        if (!vv)
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(vw);
        String s;
        for (Iterator iterator = vt.keySet().iterator(); iterator.hasNext(); stringbuilder.append("&").append(s).append("=").append(vt.get(s)))
        {
            s = (String)iterator.next();
        }

        String s1;
        for (Iterator iterator1 = vu.keySet().iterator(); iterator1.hasNext(); stringbuilder.append("&").append(s1).append("=").append((String)vu.get(s1)))
        {
            s1 = (String)iterator1.next();
        }

        return stringbuilder.toString();
    }
}
