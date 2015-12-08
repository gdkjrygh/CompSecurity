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

private static class tv
{

    private final Map ts;
    private final long tt;
    private final String tu;
    private final List tv;

    public Map cv()
    {
        return ts;
    }

    public long cw()
    {
        return tt;
    }

    public List cx()
    {
        return tv;
    }

    public String getPath()
    {
        return tu;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("PATH: ");
        stringbuilder.append(tu);
        if (ts != null)
        {
            stringbuilder.append("  PARAMS: ");
            for (Iterator iterator = ts.entrySet().iterator(); iterator.hasNext(); stringbuilder.append(",  "))
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
        ts = map;
        tt = l;
        tu = s1;
        tv = list;
    }
}
