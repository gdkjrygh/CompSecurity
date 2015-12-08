// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Collections;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            cq

public static class <init>
{

    private final Map Zp;
    private final com.google.android.gms.internal.a.Zq Zq;

    public static <init> ld()
    {
        return new <init>(null);
    }

    public void a(String s, com.google.android.gms.internal.a a1)
    {
        Zp.put(s, a1);
    }

    public Map le()
    {
        return Collections.unmodifiableMap(Zp);
    }

    public com.google.android.gms.internal.a lf()
    {
        return Zq;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Properties: ").append(le()).append(" pushAfterEvaluate: ").append(Zq).toString();
    }

    private (Map map, com.google.android.gms.internal.a a1)
    {
        Zp = map;
        Zq = a1;
    }

    Zq(Map map, com.google.android.gms.internal.a a1, Zq zq)
    {
        this(map, a1);
    }
}
