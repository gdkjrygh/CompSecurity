// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

abstract class aj
{

    private final Set afC;
    private final String afD;

    public transient aj(String s, String as[])
    {
        afD = s;
        afC = new HashSet(as.length);
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            s = as[i];
            afC.add(s);
        }

    }

    boolean a(Set set)
    {
        return set.containsAll(afC);
    }

    public String lL()
    {
        return afD;
    }

    public Set lM()
    {
        return afC;
    }

    public abstract boolean lh();

    public abstract com.google.android.gms.internal.d.a w(Map map);
}
