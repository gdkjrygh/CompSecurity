// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.internal.zzd;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzkf;

public final class a
{

    private final Object a;
    private final zzkf b;
    private Object c;

    static a a(String s, float f)
    {
        return a(s, f, f);
    }

    static a a(String s, float f, float f1)
    {
        return new <init>(zzkf.a(s, Float.valueOf(f1)), Float.valueOf(f));
    }

    static <init> a(String s, int i)
    {
        return a(s, i, i);
    }

    static a a(String s, int i, int j)
    {
        return new <init>(zzkf.a(s, Integer.valueOf(j)), Integer.valueOf(i));
    }

    static <init> a(String s, long l)
    {
        return a(s, l, l);
    }

    static a a(String s, long l, long l1)
    {
        return new <init>(zzkf.a(s, Long.valueOf(l1)), Long.valueOf(l));
    }

    static <init> a(String s, String s1)
    {
        return a(s, s1, s1);
    }

    static a a(String s, String s1, String s2)
    {
        return new <init>(zzkf.a(s, s2), s1);
    }

    static <init> a(String s, boolean flag)
    {
        return a(s, flag, flag);
    }

    static a a(String s, boolean flag, boolean flag1)
    {
        return new <init>(zzkf.a(s, flag1), Boolean.valueOf(flag));
    }

    public Object a()
    {
        if (c != null)
        {
            return c;
        }
        if (zzd.a && zzkf.b())
        {
            return b.d();
        } else
        {
            return a;
        }
    }

    private (zzkf zzkf1, Object obj)
    {
        zzu.a(zzkf1);
        b = zzkf1;
        a = obj;
    }
}
