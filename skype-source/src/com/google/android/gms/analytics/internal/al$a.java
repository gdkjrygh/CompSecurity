// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.internal.g;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.internal.ib;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            al

public static final class a
{

    private final Object a;
    private final ib b;
    private Object c;

    static a a(String s)
    {
        return new <init>(ib.a(s, Float.valueOf(0.5F)), Float.valueOf(0.5F));
    }

    static <init> a(String s, int i)
    {
        return a(s, i, i);
    }

    static a a(String s, int i, int j)
    {
        return new <init>(ib.a(s, Integer.valueOf(j)), Integer.valueOf(i));
    }

    static <init> a(String s, long l)
    {
        return a(s, l, l);
    }

    static a a(String s, long l, long l1)
    {
        return new <init>(ib.a(s, Long.valueOf(l1)), Long.valueOf(l));
    }

    static <init> a(String s, String s1)
    {
        return a(s, s1, s1);
    }

    static a a(String s, String s1, String s2)
    {
        return new <init>(ib.a(s, s2), s1);
    }

    static <init> a(String s, boolean flag)
    {
        return new <init>(ib.a(s, flag), Boolean.valueOf(flag));
    }

    public final Object a()
    {
        if (c != null)
        {
            return c;
        }
        if (g.a && ib.b())
        {
            return b.e();
        } else
        {
            return a;
        }
    }

    private (ib ib1, Object obj)
    {
        y.a(ib1);
        b = ib1;
        a = obj;
    }
}
