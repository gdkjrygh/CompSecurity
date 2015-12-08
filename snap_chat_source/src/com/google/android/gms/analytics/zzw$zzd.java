// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics:
//            zzw

static class zzCI
{

    private final Map zzCF;
    private final long zzCG;
    private final String zzCH;
    private final List zzCI;

    public String getPath()
    {
        return zzCH;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("PATH: ");
        stringbuilder.append(zzCH);
        if (zzCF != null)
        {
            stringbuilder.append("  PARAMS: ");
            for (Iterator iterator = zzCF.entrySet().iterator(); iterator.hasNext(); stringbuilder.append(",  "))
            {
                java.util.y y = (java.util.y)iterator.next();
                stringbuilder.append((String)y.getKey());
                stringbuilder.append("=");
                stringbuilder.append((String)y.getValue());
            }

        }
        return stringbuilder.toString();
    }

    public Map zzfS()
    {
        return zzCF;
    }

    public long zzfT()
    {
        return zzCG;
    }

    public List zzfU()
    {
        return zzCI;
    }

    public (Map map, long l, String s, List list)
    {
        zzCF = map;
        zzCG = l;
        zzCH = s;
        zzCI = list;
    }
}
