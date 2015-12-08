// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzvl

public static class <init>
{

    private zzaAo zzaAo;
    private final Map zzaCj;

    public <init> zzb(String s, <init> <init>1)
    {
        zzaCj.put(s, <init>1);
        return this;
    }

    public zzaCj zzq(zzaCj zzacj)
    {
        zzaAo = zzacj;
        return this;
    }

    public zzaAo zzuw()
    {
        return new <init>(zzaCj, zzaAo, null);
    }

    private ()
    {
        zzaCj = new HashMap();
    }

    zzaCj(zzaCj zzacj)
    {
        this();
    }
}
