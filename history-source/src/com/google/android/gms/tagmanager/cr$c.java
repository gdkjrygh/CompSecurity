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

    private final String TU;
    private final List asO;
    private final Map asP;
    private final int asQ;

    public static <init> qo()
    {
        return new <init>(null);
    }

    public String getVersion()
    {
        return TU;
    }

    public List qp()
    {
        return asO;
    }

    public Map qq()
    {
        return asP;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Rules: ").append(qp()).append("  Macros: ").append(asP).toString();
    }

    private (List list, Map map, String s, int i)
    {
        asO = Collections.unmodifiableList(list);
        asP = Collections.unmodifiableMap(map);
        TU = s;
        asQ = i;
    }

    asQ(List list, Map map, String s, int i, asQ asq)
    {
        this(list, map, s, i);
    }
}
