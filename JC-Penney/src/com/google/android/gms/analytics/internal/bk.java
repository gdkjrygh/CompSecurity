// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.internal.a;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.d.h;

public final class bk
{

    private final Object a;
    private final h b;
    private Object c;

    private bk(h h1, Object obj)
    {
        u.a(h1);
        b = h1;
        a = obj;
    }

    static bk a(String s, float f)
    {
        return a(s, f, f);
    }

    static bk a(String s, float f, float f1)
    {
        return new bk(h.a(s, Float.valueOf(f1)), Float.valueOf(f));
    }

    static bk a(String s, int i)
    {
        return a(s, i, i);
    }

    static bk a(String s, int i, int j)
    {
        return new bk(h.a(s, Integer.valueOf(j)), Integer.valueOf(i));
    }

    static bk a(String s, long l)
    {
        return a(s, l, l);
    }

    static bk a(String s, long l, long l1)
    {
        return new bk(h.a(s, Long.valueOf(l1)), Long.valueOf(l));
    }

    static bk a(String s, String s1)
    {
        return a(s, s1, s1);
    }

    static bk a(String s, String s1, String s2)
    {
        return new bk(h.a(s, s2), s1);
    }

    static bk a(String s, boolean flag)
    {
        return a(s, flag, flag);
    }

    static bk a(String s, boolean flag, boolean flag1)
    {
        return new bk(h.a(s, flag1), Boolean.valueOf(flag));
    }

    public Object a()
    {
        if (c != null)
        {
            return c;
        }
        if (a.a && h.b())
        {
            return b.d();
        } else
        {
            return a;
        }
    }
}
