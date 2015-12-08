// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics:
//            w

private static class zI
{

    private final Map zF;
    private final long zG;
    private final String zH;
    private final List zI;

    public Map eH()
    {
        return zF;
    }

    public long eI()
    {
        return zG;
    }

    public List eJ()
    {
        return zI;
    }

    public String getPath()
    {
        return zH;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("PATH: ");
        stringbuilder.append(zH);
        if (zF != null)
        {
            stringbuilder.append("  PARAMS: ");
            for (Iterator iterator = zF.entrySet().iterator(); iterator.hasNext(); stringbuilder.append(",  "))
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
        zF = map;
        zG = l;
        zH = s;
        zI = list;
    }
}
