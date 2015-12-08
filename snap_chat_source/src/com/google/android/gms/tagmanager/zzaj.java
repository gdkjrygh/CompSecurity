// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

abstract class zzaj
{

    private final Set zzayG;
    private final String zzayH;

    public transient zzaj(String s, String as[])
    {
        zzayH = s;
        zzayG = new HashSet(as.length);
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            s = as[i];
            zzayG.add(s);
        }

    }

    public abstract com.google.android.gms.internal.zzd.zza zzH(Map map);

    boolean zzb(Set set)
    {
        return set.containsAll(zzayG);
    }

    public abstract boolean zzsD();

    public String zzth()
    {
        return zzayH;
    }

    public Set zzti()
    {
        return zzayG;
    }
}
