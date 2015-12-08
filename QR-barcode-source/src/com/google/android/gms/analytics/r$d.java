// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics:
//            r

private static class yS
{

    private final Map yP;
    private final long yQ;
    private final String yR;
    private final List yS;

    public Map em()
    {
        return yP;
    }

    public long en()
    {
        return yQ;
    }

    public List eo()
    {
        return yS;
    }

    public String getPath()
    {
        return yR;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("PATH: ");
        stringbuilder.append(yR);
        if (yP != null)
        {
            stringbuilder.append("  PARAMS: ");
            for (Iterator iterator = yP.entrySet().iterator(); iterator.hasNext(); stringbuilder.append(",  "))
            {
                java.util.Entry entry = (java.util.Entry)iterator.next();
                stringbuilder.append((String)entry.getKey());
                stringbuilder.append("=");
                stringbuilder.append((String)entry.getValue());
            }

        }
        return stringbuilder.toString();
    }

    public (Map map, long l, String s, List list)
    {
        yP = map;
        yQ = l;
        yR = s;
        yS = list;
    }
}
