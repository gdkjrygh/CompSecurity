// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

abstract class aj
{

    private final Set XU;
    private final String XV;

    public transient aj(String s, String as[])
    {
        XV = s;
        XU = new HashSet(as.length);
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            s = as[i];
            XU.add(s);
        }

    }

    boolean a(Set set)
    {
        return set.containsAll(XU);
    }

    public abstract boolean jX();

    public String kB()
    {
        return XV;
    }

    public Set kC()
    {
        return XU;
    }

    public abstract com.google.android.gms.internal.d.a x(Map map);
}
