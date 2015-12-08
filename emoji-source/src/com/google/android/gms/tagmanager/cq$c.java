// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Collections;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            cq

public static class <init>
{

    private final String aeU;
    private final List agZ;
    private final Map aha;
    private final int ahb;

    public static <init> mr()
    {
        return new <init>(null);
    }

    public String getVersion()
    {
        return aeU;
    }

    public List ms()
    {
        return agZ;
    }

    public Map mt()
    {
        return aha;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Rules: ").append(ms()).append("  Macros: ").append(aha).toString();
    }

    private (List list, Map map, String s, int i)
    {
        agZ = Collections.unmodifiableList(list);
        aha = Collections.unmodifiableMap(map);
        aeU = s;
        ahb = i;
    }

    ahb(List list, Map map, String s, int i, ahb ahb1)
    {
        this(list, map, s, i);
    }
}
