// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Collections;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzqf

public static class <init>
{

    private final zzaNw zzaNw;
    private final Map zzaPy;

    public static <init> zzAm()
    {
        return new <init>(null);
    }

    public String toString()
    {
        return (new StringBuilder()).append("Properties: ").append(zzAn()).append(" pushAfterEvaluate: ").append(zzaNw).toString();
    }

    public Map zzAn()
    {
        return Collections.unmodifiableMap(zzaPy);
    }

    public void zza(String s, zzaPy zzapy)
    {
        zzaPy.put(s, zzapy);
    }

    public zzaPy zzzs()
    {
        return zzaNw;
    }

    private (Map map,  )
    {
        zzaPy = map;
        zzaNw = ;
    }

    zzaNw(Map map, zzaNw zzanw, zzaNw zzanw1)
    {
        this(map, zzanw);
    }
}
