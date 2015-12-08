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

    private final Map wI = new HashMap();
    private final Map wJ = new HashMap();
    private final boolean wK;
    private final String wL;

    ab(String s, boolean flag)
    {
        wK = flag;
        wL = s;
    }

    void c(String s, int i)
    {
        if (!wK)
        {
            return;
        }
        Integer integer1 = (Integer)wI.get(s);
        Integer integer = integer1;
        if (integer1 == null)
        {
            integer = Integer.valueOf(0);
        }
        wI.put(s, Integer.valueOf(integer.intValue() + i));
    }

    String dl()
    {
        if (!wK)
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(wL);
        String s;
        for (Iterator iterator = wI.keySet().iterator(); iterator.hasNext(); stringbuilder.append("&").append(s).append("=").append(wI.get(s)))
        {
            s = (String)iterator.next();
        }

        String s1;
        for (Iterator iterator1 = wJ.keySet().iterator(); iterator1.hasNext(); stringbuilder.append("&").append(s1).append("=").append((String)wJ.get(s1)))
        {
            s1 = (String)iterator1.next();
        }

        return stringbuilder.toString();
    }
}
