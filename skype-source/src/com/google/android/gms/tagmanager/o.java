// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

abstract class o
{

    private final Set a;
    private final String b;

    public transient o(String s, String as[])
    {
        b = s;
        a = new HashSet(as.length);
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            s = as[i];
            a.add(s);
        }

    }

    public abstract com.google.android.gms.internal.h.a a(Map map);

    public abstract boolean a();

    final boolean a(Set set)
    {
        return set.containsAll(a);
    }

    public String b()
    {
        return b;
    }

    public Set c()
    {
        return a;
    }
}
