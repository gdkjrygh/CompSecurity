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

private static class uJ
{

    private final Map uG;
    private final long uH;
    private final String uI;
    private final List uJ;

    public Map cR()
    {
        return uG;
    }

    public long cS()
    {
        return uH;
    }

    public List cT()
    {
        return uJ;
    }

    public String getPath()
    {
        return uI;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("PATH: ");
        stringbuilder.append(uI);
        if (uG != null)
        {
            stringbuilder.append("  PARAMS: ");
            for (Iterator iterator = uG.entrySet().iterator(); iterator.hasNext(); stringbuilder.append(",  "))
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
        uG = map;
        uH = l;
        uI = s1;
        uJ = list;
    }
}
