// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.e.a.a;

import java.util.ArrayList;
import java.util.List;

final class c
{

    private final List a;
    private final int b;
    private final boolean c;

    c(List list, int i, boolean flag)
    {
        a = new ArrayList(list);
        b = i;
        c = flag;
    }

    List a()
    {
        return a;
    }

    boolean a(List list)
    {
        return a.equals(list);
    }

    int b()
    {
        return b;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof c)
        {
            if (a.equals(((c) (obj = (c)obj)).a()) && c == ((c) (obj)).c)
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return a.hashCode() ^ Boolean.valueOf(c).hashCode();
    }

    public String toString()
    {
        return (new StringBuilder()).append("{ ").append(a).append(" }").toString();
    }
}
