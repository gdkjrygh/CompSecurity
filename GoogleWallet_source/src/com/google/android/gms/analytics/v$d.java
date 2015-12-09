// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics:
//            v

static final class zG
{

    private final String path;
    private final Map zE;
    private final long zF;
    private final List zG;

    public final Map eC()
    {
        return zE;
    }

    public final long eD()
    {
        return zF;
    }

    public final List eE()
    {
        return zG;
    }

    public final String getPath()
    {
        return path;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("PATH: ");
        stringbuilder.append(path);
        if (zE != null)
        {
            stringbuilder.append("  PARAMS: ");
            for (Iterator iterator = zE.entrySet().iterator(); iterator.hasNext(); stringbuilder.append(",  "))
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
        zE = map;
        zF = l;
        path = s;
        zG = list;
    }
}
