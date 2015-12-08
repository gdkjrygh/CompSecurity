// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

abstract class aj
{

    private final Set apj;
    private final String apk;

    public transient aj(String s, String as[])
    {
        apk = s;
        apj = new HashSet(as.length);
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            s = as[i];
            apj.add(s);
        }

    }

    public abstract com.google.android.gms.internal.d.a C(Map map);

    boolean a(Set set)
    {
        return set.containsAll(apj);
    }

    public abstract boolean nN();

    public String or()
    {
        return apk;
    }

    public Set os()
    {
        return apj;
    }
}
