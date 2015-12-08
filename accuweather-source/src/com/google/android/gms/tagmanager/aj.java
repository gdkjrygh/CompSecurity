// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

abstract class aj
{

    private final String afA;
    private final Set afz;

    public transient aj(String s, String as[])
    {
        afA = s;
        afz = new HashSet(as.length);
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            s = as[i];
            afz.add(s);
        }

    }

    boolean a(Set set)
    {
        return set.containsAll(afz);
    }

    public String lG()
    {
        return afA;
    }

    public Set lH()
    {
        return afz;
    }

    public abstract boolean lc();

    public abstract com.google.android.gms.internal.d.a w(Map map);
}
