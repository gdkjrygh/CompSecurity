// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Collections;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzvl

public static class <init>
{

    private final zzaCj zzaAo;
    private final Map zzaCj;

    public static <init> zzuu()
    {
        return new <init>(null);
    }

    public String toString()
    {
        return (new StringBuilder("Properties: ")).append(zzuv()).append(" pushAfterEvaluate: ").append(zzaAo).toString();
    }

    public void zza(String s, zzaAo zzaao)
    {
        zzaCj.put(s, zzaao);
    }

    public zzaCj zztK()
    {
        return zzaAo;
    }

    public Map zzuv()
    {
        return Collections.unmodifiableMap(zzaCj);
    }

    private (Map map,  )
    {
        zzaCj = map;
        zzaAo = ;
    }

    zzaAo(Map map, zzaAo zzaao, zzaAo zzaao1)
    {
        this(map, zzaao);
    }
}
