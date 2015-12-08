// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class aa
{

    private final Map AU = new HashMap();
    private final Map AV = new HashMap();
    private final boolean AW;
    private final String AX;

    aa(String s, boolean flag)
    {
        AW = flag;
        AX = s;
    }

    void e(String s, int i)
    {
        if (!AW)
        {
            return;
        }
        Integer integer1 = (Integer)AU.get(s);
        Integer integer = integer1;
        if (integer1 == null)
        {
            integer = Integer.valueOf(0);
        }
        AU.put(s, Integer.valueOf(integer.intValue() + i));
    }

    String eL()
    {
        if (!AW)
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(AX);
        String s;
        for (Iterator iterator = AU.keySet().iterator(); iterator.hasNext(); stringbuilder.append("&").append(s).append("=").append(AU.get(s)))
        {
            s = (String)iterator.next();
        }

        String s1;
        for (Iterator iterator1 = AV.keySet().iterator(); iterator1.hasNext(); stringbuilder.append("&").append(s1).append("=").append((String)AV.get(s1)))
        {
            s1 = (String)iterator1.next();
        }

        return stringbuilder.toString();
    }
}
