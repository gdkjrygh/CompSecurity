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

    private final Map wL = new HashMap();
    private final Map wM = new HashMap();
    private final boolean wN;
    private final String wO;

    ab(String s, boolean flag)
    {
        wN = flag;
        wO = s;
    }

    void c(String s, int i)
    {
        if (!wN)
        {
            return;
        }
        Integer integer1 = (Integer)wL.get(s);
        Integer integer = integer1;
        if (integer1 == null)
        {
            integer = Integer.valueOf(0);
        }
        wL.put(s, Integer.valueOf(integer.intValue() + i));
    }

    String dq()
    {
        if (!wN)
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(wO);
        String s;
        for (Iterator iterator = wL.keySet().iterator(); iterator.hasNext(); stringbuilder.append("&").append(s).append("=").append(wL.get(s)))
        {
            s = (String)iterator.next();
        }

        String s1;
        for (Iterator iterator1 = wM.keySet().iterator(); iterator1.hasNext(); stringbuilder.append("&").append(s1).append("=").append((String)wM.get(s1)))
        {
            s1 = (String)iterator1.next();
        }

        return stringbuilder.toString();
    }
}
