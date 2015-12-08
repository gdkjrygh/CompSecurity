// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Collections;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            cr

public static class <init>
{

    private final String Sx;
    private final List aqF;
    private final Map aqG;
    private final int aqH;

    public static <init> oX()
    {
        return new <init>(null);
    }

    public String getVersion()
    {
        return Sx;
    }

    public List oY()
    {
        return aqF;
    }

    public Map oZ()
    {
        return aqG;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Rules: ").append(oY()).append("  Macros: ").append(aqG).toString();
    }

    private (List list, Map map, String s, int i)
    {
        aqF = Collections.unmodifiableList(list);
        aqG = Collections.unmodifiableMap(map);
        Sx = s;
        aqH = i;
    }

    aqH(List list, Map map, String s, int i, aqH aqh)
    {
        this(list, map, s, i);
    }
}
