// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

abstract class aj
{

    private final Set art;
    private final String aru;

    public transient aj(String s, String as[])
    {
        aru = s;
        art = new HashSet(as.length);
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            s = as[i];
            art.add(s);
        }

    }

    public abstract com.google.android.gms.internal.d.a B(Map map);

    boolean a(Set set)
    {
        return set.containsAll(art);
    }

    public String pI()
    {
        return aru;
    }

    public Set pJ()
    {
        return art;
    }

    public abstract boolean pe();
}
