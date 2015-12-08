// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics:
//            s

private static class uG
{

    private final Map uD;
    private final long uE;
    private final String uF;
    private final List uG;

    public Map cM()
    {
        return uD;
    }

    public long cN()
    {
        return uE;
    }

    public List cO()
    {
        return uG;
    }

    public String getPath()
    {
        return uF;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("PATH: ");
        stringbuilder.append(uF);
        if (uD != null)
        {
            stringbuilder.append("  PARAMS: ");
            for (Iterator iterator = uD.entrySet().iterator(); iterator.hasNext(); stringbuilder.append(",  "))
            {
                java.util.Entry entry = (java.util.Entry)iterator.next();
                stringbuilder.append((String)entry.getKey());
                stringbuilder.append("=");
                stringbuilder.append((String)entry.getValue());
            }

        }
        return stringbuilder.toString();
    }

    public (Map map, long l, String s1, List list)
    {
        uD = map;
        uE = l;
        uF = s1;
        uG = list;
    }
}
