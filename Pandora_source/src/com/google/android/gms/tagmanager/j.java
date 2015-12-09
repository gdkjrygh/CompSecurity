// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

abstract class j
{

    private final Set zzaDu;
    private final String zzaDv;

    public transient j(String s, String as[])
    {
        zzaDv = s;
        zzaDu = new HashSet(as.length);
        int k = as.length;
        for (int i = 0; i < k; i++)
        {
            s = as[i];
            zzaDu.add(s);
        }

    }

    public abstract com.google.android.gms.internal.zzd.zza zzD(Map map);

    boolean zzg(Set set)
    {
        return set.containsAll(zzaDu);
    }

    public String zzwS()
    {
        return zzaDv;
    }

    public Set zzwT()
    {
        return zzaDu;
    }

    public abstract boolean zzwn();
}
