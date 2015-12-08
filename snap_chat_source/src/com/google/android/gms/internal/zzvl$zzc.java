// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Collections;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzvl

public static class <init>
{

    private final String zzYw;
    private final List zzaCk;
    private final Map zzaCl;
    private final int zzaCm;

    public static <init> zzux()
    {
        return new <init>(null);
    }

    public String getVersion()
    {
        return zzYw;
    }

    public String toString()
    {
        return (new StringBuilder("Rules: ")).append(zzuy()).append("  Macros: ").append(zzaCl).toString();
    }

    public List zzuy()
    {
        return zzaCk;
    }

    public Map zzuz()
    {
        return zzaCl;
    }

    private (List list, Map map, String s, int i)
    {
        zzaCk = Collections.unmodifiableList(list);
        zzaCl = Collections.unmodifiableMap(map);
        zzYw = s;
        zzaCm = i;
    }

    zzaCm(List list, Map map, String s, int i, zzaCm zzacm)
    {
        this(list, map, s, i);
    }
}
