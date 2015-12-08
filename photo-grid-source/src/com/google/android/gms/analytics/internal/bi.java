// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.internal.bl;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.internal.ve;

public final class bi
{

    private final Object a;
    private final ve b;
    private Object c;

    private bi(ve ve1, Object obj)
    {
        bl.a(ve1);
        b = ve1;
        a = obj;
    }

    static bi a(String s)
    {
        return new bi(ve.a(s, Float.valueOf(0.5F)), Float.valueOf(0.5F));
    }

    static bi a(String s, int j)
    {
        return a(s, j, j);
    }

    static bi a(String s, int j, int k)
    {
        return new bi(ve.a(s, Integer.valueOf(k)), Integer.valueOf(j));
    }

    static bi a(String s, long l)
    {
        return a(s, l, l);
    }

    static bi a(String s, long l, long l1)
    {
        return new bi(ve.a(s, Long.valueOf(l1)), Long.valueOf(l));
    }

    static bi a(String s, String s1)
    {
        return a(s, s1, s1);
    }

    static bi a(String s, String s1, String s2)
    {
        return new bi(ve.a(s, s2), s1);
    }

    static bi a(String s, boolean flag)
    {
        return new bi(ve.a(s, flag), Boolean.valueOf(flag));
    }

    public final Object a()
    {
        if (c != null)
        {
            return c;
        }
        if (i.a && ve.b())
        {
            return b.e();
        } else
        {
            return a;
        }
    }
}
