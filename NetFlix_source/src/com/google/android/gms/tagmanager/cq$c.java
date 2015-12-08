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

    private final String Xl;
    private final List Zr;
    private final Map Zs;
    private final int Zt;

    public static <init> lh()
    {
        return new <init>(null);
    }

    public String getVersion()
    {
        return Xl;
    }

    public List li()
    {
        return Zr;
    }

    public Map lj()
    {
        return Zs;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Rules: ").append(li()).append("  Macros: ").append(Zs).toString();
    }

    private (List list, Map map, String s, int i)
    {
        Zr = Collections.unmodifiableList(list);
        Zs = Collections.unmodifiableMap(map);
        Xl = s;
        Zt = i;
    }

    Zt(List list, Map map, String s, int i, Zt zt)
    {
        this(list, map, s, i);
    }
}
