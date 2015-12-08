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

    private final String aeR;
    private final List agW;
    private final Map agX;
    private final int agY;

    public static <init> mm()
    {
        return new <init>(null);
    }

    public String getVersion()
    {
        return aeR;
    }

    public List mn()
    {
        return agW;
    }

    public Map mo()
    {
        return agX;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Rules: ").append(mn()).append("  Macros: ").append(agX).toString();
    }

    private (List list, Map map, String s, int i)
    {
        agW = Collections.unmodifiableList(list);
        agX = Collections.unmodifiableMap(map);
        aeR = s;
        agY = i;
    }

    agY(List list, Map map, String s, int i, agY agy)
    {
        this(list, map, s, i);
    }
}
