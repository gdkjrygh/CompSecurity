// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Collections;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzmq

public static class <init>
{

    private final zzaHk zzaFi;
    private final Map zzaHk;

    public static <init> zzys()
    {
        return new <init>(null);
    }

    public String toString()
    {
        return (new StringBuilder()).append("Properties: ").append(zzyt()).append(" pushAfterEvaluate: ").append(zzaFi).toString();
    }

    public void zza(String s, zzaFi zzafi)
    {
        zzaHk.put(s, zzafi);
    }

    public zzaHk zzxy()
    {
        return zzaFi;
    }

    public Map zzyt()
    {
        return Collections.unmodifiableMap(zzaHk);
    }

    private (Map map,  )
    {
        zzaHk = map;
        zzaFi = ;
    }

    zzaFi(Map map, zzaFi zzafi, zzaFi zzafi1)
    {
        this(map, zzafi);
    }
}
